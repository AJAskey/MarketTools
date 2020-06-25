package net.ajaskey.market.tools.SIP.BigDB.collation;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CollationTests1 {

    public static boolean debug = false;

    @Test
    public void test00501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00501");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("", (int) (byte) 10, (-1));
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test00502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00502");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double7 = quarterlyDouble5.get(10);
        double double8 = quarterlyDouble5.getMostRecent();
        double double9 = quarterlyDouble5.getMostRecent();
        double double10 = quarterlyDouble5.getTtm();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = quarterlyDouble5.fmtGrowth4Q("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test00503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00503");
        net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile(0, 1);
    }

    @Test
    public void test00504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00504");
        net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile((int) '4', 0);
    }

    @Test
    public void test00505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00505");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double double6 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.getTtmAvg();
        double double8 = quarterlyDouble4.getQseqQ();
        double[] doubleArray9 = quarterlyDouble4.dArr;
        java.lang.Class<?> wildcardClass10 = quarterlyDouble4.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 5100.0d + "'", double8 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00506");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) '4');
        double[] doubleArray11 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray11);
        double[] doubleArray13 = quarterlyDouble12.dArr;
        double double14 = quarterlyDouble12.getQseqQ();
        double[] doubleArray15 = new double[] {};
        quarterlyDouble12.dArr = doubleArray15;
        quarterlyDouble4.dArr = doubleArray15;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray15);
        double[] doubleArray22 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble23 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray22);
        double double24 = quarterlyDouble23.getTtm();
        double double26 = quarterlyDouble23.get((int) '4');
        double[] doubleArray30 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble31 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray30);
        double[] doubleArray32 = quarterlyDouble31.dArr;
        double double33 = quarterlyDouble31.getQseqQ();
        double[] doubleArray34 = new double[] {};
        quarterlyDouble31.dArr = doubleArray34;
        quarterlyDouble23.dArr = doubleArray34;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble37 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray34);
        quarterlyDouble18.dArr = doubleArray34;
        // The following exception was thrown during execution in test generation
        try {
            double double39 = quarterlyDouble18.getQseqQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    }

    @Test
    public void test00507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00507");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double double6 = quarterlyDouble4.getMostRecent();
        double double8 = quarterlyDouble4.get((int) 'a');
        double double9 = quarterlyDouble4.getQseqQ();
        double double10 = quarterlyDouble4.getTtmAvg();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = quarterlyDouble4.fmtGrowth1Q("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-9999.9999d) + "'", double8 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 5100.0d + "'", double9 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test00508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00508");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!", 1, 100);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test00509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00509");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList0, 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00510");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("", (int) 'a', 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test00511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00511");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList0, (int) (short) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00512");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double[] doubleArray6 = quarterlyDouble5.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray6);
        double double8 = quarterlyDouble7.getMostRecent();
        double[] doubleArray12 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray12);
        double double14 = quarterlyDouble13.getTtm();
        double double15 = quarterlyDouble13.getQseqQ();
        double[] doubleArray16 = quarterlyDouble13.dArr;
        double double17 = quarterlyDouble13.getQseqQ();
        double[] doubleArray21 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble22 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray21);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble23 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray21);
        quarterlyDouble13.dArr = doubleArray21;
        double[] doubleArray25 = quarterlyDouble13.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble26 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray25);
        quarterlyDouble7.dArr = doubleArray25;
        double double30 = quarterlyDouble7.deltaQ((int) 'a', (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = quarterlyDouble7.fmtGrowth1Q("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
    }

    @Test
    public void test00513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00513");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) '4');
        double[] doubleArray11 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray11);
        double[] doubleArray13 = quarterlyDouble12.dArr;
        double double14 = quarterlyDouble12.getQseqQ();
        double[] doubleArray15 = new double[] {};
        quarterlyDouble12.dArr = doubleArray15;
        quarterlyDouble4.dArr = doubleArray15;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray15);
        java.lang.Class<?> wildcardClass19 = doubleArray15.getClass();
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
    public void test00514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00514");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double double6 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.getMostRecent();
        double double8 = quarterlyDouble4.getTtmAvg();
        double double9 = quarterlyDouble4.getMostRecent();
        double double11 = quarterlyDouble4.get((int) '4');
        double double14 = quarterlyDouble4.deltaQ((int) (byte) 100, (int) (short) 10);
        double double15 = quarterlyDouble4.getTtmAvg();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-9999.9999d) + "'", double11 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test00515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00515");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double8 = quarterlyDouble5.deltaQ((int) (short) 10, (int) ' ');
        double[] doubleArray12 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray12);
        double double14 = quarterlyDouble13.getTtm();
        double double16 = quarterlyDouble13.get((int) '4');
        double[] doubleArray20 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble21 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray20);
        double[] doubleArray22 = quarterlyDouble21.dArr;
        double double23 = quarterlyDouble21.getQseqQ();
        double[] doubleArray24 = new double[] {};
        quarterlyDouble21.dArr = doubleArray24;
        quarterlyDouble13.dArr = doubleArray24;
        double[] doubleArray27 = quarterlyDouble13.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble28 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray27);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble29 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray27);
        double[] doubleArray33 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble34 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray33);
        double double35 = quarterlyDouble34.getTtm();
        double double36 = quarterlyDouble34.getQseqQ();
        double[] doubleArray40 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble41 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray40);
        quarterlyDouble34.dArr = doubleArray40;
        double double43 = quarterlyDouble34.getQseqQ();
        double double46 = quarterlyDouble34.deltaQ((int) (short) 100, (int) (byte) -1);
        double[] doubleArray50 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble51 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray50);
        double double52 = quarterlyDouble51.getTtmAvg();
        double double53 = quarterlyDouble51.getMostRecent();
        double double55 = quarterlyDouble51.get((int) 'a');
        double double57 = quarterlyDouble51.get((int) (byte) -1);
        double[] doubleArray61 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble62 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray61);
        double double63 = quarterlyDouble62.getTtm();
        double double64 = quarterlyDouble62.getQseqQ();
        double[] doubleArray65 = quarterlyDouble62.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble66 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray65);
        quarterlyDouble51.dArr = doubleArray65;
        quarterlyDouble34.dArr = doubleArray65;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble69 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray65);
        quarterlyDouble29.dArr = doubleArray65;
        quarterlyDouble5.dArr = doubleArray65;
        java.lang.Class<?> wildcardClass72 = quarterlyDouble5.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-9999.9999d) + "'", double16 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 5100.0d + "'", double23 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 5100.0d + "'", double36 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 5100.0d + "'", double43 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 52.0d + "'", double53 == 52.0d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + (-9999.9999d) + "'", double55 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + (-9999.9999d) + "'", double57 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.0d + "'", double63 == 0.0d);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 5100.0d + "'", double64 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(wildcardClass72);
    }

    @Test
    public void test00516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00516");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double6 = quarterlyDouble4.get((int) (byte) 1);
        double double7 = quarterlyDouble4.getQseqQ();
        double double9 = quarterlyDouble4.get((int) (byte) 1);
        double double12 = quarterlyDouble4.deltaQ((int) (byte) 1, 0);
        double double13 = quarterlyDouble4.getQseqQ();
        double double16 = quarterlyDouble4.deltaQ(10, (int) (byte) 0);
        double[] doubleArray17 = quarterlyDouble4.dArr;
        double double18 = quarterlyDouble4.getTtmAvg();
        java.lang.Class<?> wildcardClass19 = quarterlyDouble4.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 5100.0d + "'", double7 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5100.0d + "'", double13 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00517");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!", (int) (byte) 1, (int) (byte) 100);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test00518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00518");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList1 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, fieldDataArray0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData5 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, (int) (short) -1, (int) (short) 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData8 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, (int) 'a', 1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData11 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, (int) (byte) 0, (int) (short) 10);
        org.junit.Assert.assertNotNull(fieldDataArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(fieldData5);
        org.junit.Assert.assertNull(fieldData8);
        org.junit.Assert.assertNull(fieldData11);
    }

    @Test
    public void test00519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00519");
        net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile((int) (byte) 1, (int) (short) 10);
    }

    @Test
    public void test00520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00520");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("", 1, (int) (short) 1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test00521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00521");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double6 = quarterlyDouble5.getTtmAvg();
        double double7 = quarterlyDouble5.getTtmAvg();
        double double8 = quarterlyDouble5.getTtmAvg();
        double double9 = quarterlyDouble5.getMostRecent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = quarterlyDouble5.fmtGrowth4Q("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
    }

    @Test
    public void test00522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00522");
        java.util.List<java.lang.String> strList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList0, (int) (byte) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00523");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!", (int) (byte) 100, 1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test00524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00524");
        java.util.List<java.lang.String> strList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList1 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList(strList0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00525");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double[] doubleArray5 = quarterlyDouble4.dArr;
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray7 = new double[] {};
        quarterlyDouble4.dArr = doubleArray7;
        double double9 = quarterlyDouble4.getTtm();
        double double10 = quarterlyDouble4.getTtmAvg();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = quarterlyDouble4.fmtGrowth1Q("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test00526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00526");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double double6 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.getTtmAvg();
        double double8 = quarterlyDouble4.getMostRecent();
        double double10 = quarterlyDouble4.get((int) '4');
        double[] doubleArray14 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray14);
        quarterlyDouble4.dArr = doubleArray14;
        double[] doubleArray17 = quarterlyDouble4.dArr;
        java.lang.Class<?> wildcardClass18 = doubleArray17.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00527");
        net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile((int) (short) 100, (int) (byte) 10);
    }

    @Test
    public void test00528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00528");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) '4');
        double[] doubleArray11 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray11);
        double[] doubleArray13 = quarterlyDouble12.dArr;
        double double14 = quarterlyDouble12.getQseqQ();
        double[] doubleArray15 = new double[] {};
        quarterlyDouble12.dArr = doubleArray15;
        quarterlyDouble4.dArr = doubleArray15;
        double[] doubleArray18 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray18);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray18);
        double[] doubleArray24 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble25 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray24);
        double double26 = quarterlyDouble25.getTtm();
        double double27 = quarterlyDouble25.getQseqQ();
        double[] doubleArray31 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble32 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray31);
        quarterlyDouble25.dArr = doubleArray31;
        double double34 = quarterlyDouble25.getQseqQ();
        double double37 = quarterlyDouble25.deltaQ((int) (short) 100, (int) (byte) -1);
        double[] doubleArray41 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble42 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray41);
        double double43 = quarterlyDouble42.getTtmAvg();
        double double44 = quarterlyDouble42.getMostRecent();
        double double46 = quarterlyDouble42.get((int) 'a');
        double double48 = quarterlyDouble42.get((int) (byte) -1);
        double[] doubleArray52 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble53 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray52);
        double double54 = quarterlyDouble53.getTtm();
        double double55 = quarterlyDouble53.getQseqQ();
        double[] doubleArray56 = quarterlyDouble53.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble57 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray56);
        quarterlyDouble42.dArr = doubleArray56;
        quarterlyDouble25.dArr = doubleArray56;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble60 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray56);
        quarterlyDouble20.dArr = doubleArray56;
        double[] doubleArray62 = quarterlyDouble20.dArr;
        // The following exception was thrown during execution in test generation
        try {
            double double63 = quarterlyDouble20.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    }

    @Test
    public void test00529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00529");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double6 = quarterlyDouble4.get((int) (byte) 1);
        double[] doubleArray7 = quarterlyDouble4.dArr;
        double double8 = quarterlyDouble4.getTtmAvg();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = quarterlyDouble4.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test00530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00530");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double7 = quarterlyDouble5.get((int) (short) -1);
        double double8 = quarterlyDouble5.getTtmAvg();
        double double9 = quarterlyDouble5.getQseqQ();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = quarterlyDouble5.fmtGrowth1Q("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9999.9999d) + "'", double7 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 5100.0d + "'", double9 == 5100.0d);
    }

    @Test
    public void test00531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00531");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double7 = quarterlyDouble5.get(10);
        double double8 = quarterlyDouble5.getMostRecent();
        double[] doubleArray9 = quarterlyDouble5.dArr;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = quarterlyDouble5.fmtGrowth4Q("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test00532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00532");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double double6 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.getMostRecent();
        double double8 = quarterlyDouble4.getTtmAvg();
        double double9 = quarterlyDouble4.getMostRecent();
        double[] doubleArray13 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray13);
        double[] doubleArray15 = quarterlyDouble14.dArr;
        double[] doubleArray16 = quarterlyDouble14.dArr;
        double[] doubleArray20 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble21 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray20);
        double double22 = quarterlyDouble21.getTtm();
        double double23 = quarterlyDouble21.getQseqQ();
        double[] doubleArray24 = quarterlyDouble21.dArr;
        double double25 = quarterlyDouble21.getQseqQ();
        double[] doubleArray29 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble30 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray29);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble31 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray29);
        quarterlyDouble21.dArr = doubleArray29;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble33 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray29);
        quarterlyDouble14.dArr = doubleArray29;
        quarterlyDouble4.dArr = doubleArray29;
        java.lang.Class<?> wildcardClass36 = quarterlyDouble4.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 5100.0d + "'", double23 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 5100.0d + "'", double25 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test00533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00533");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) '4');
        double[] doubleArray11 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray11);
        double[] doubleArray13 = quarterlyDouble12.dArr;
        double double14 = quarterlyDouble12.getQseqQ();
        double[] doubleArray15 = new double[] {};
        quarterlyDouble12.dArr = doubleArray15;
        quarterlyDouble4.dArr = doubleArray15;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray15);
        double[] doubleArray22 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble23 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray22);
        double double24 = quarterlyDouble23.getTtm();
        double double26 = quarterlyDouble23.get((int) '4');
        double[] doubleArray30 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble31 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray30);
        double[] doubleArray32 = quarterlyDouble31.dArr;
        double double33 = quarterlyDouble31.getQseqQ();
        double[] doubleArray34 = new double[] {};
        quarterlyDouble31.dArr = doubleArray34;
        quarterlyDouble23.dArr = doubleArray34;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble37 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray34);
        quarterlyDouble18.dArr = doubleArray34;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble39 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray34);
        // The following exception was thrown during execution in test generation
        try {
            double double40 = quarterlyDouble39.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    }

    @Test
    public void test00534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00534");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
        java.lang.Class<?> wildcardClass4 = fieldDataList3.getClass();
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNotNull(fieldDataList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00535");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!", (int) (byte) 100, 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test00536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00536");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.add(companyFileData0, estimateFileData1, sharesFileData2, incSheetFileData3, balSheetFileData4, cashFileData5, (int) (byte) 1, (int) (short) 1);
    }

    @Test
    public void test00537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00537");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray7 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray7);
        double double9 = quarterlyDouble8.getTtm();
        double[] doubleArray13 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray13);
        double double15 = quarterlyDouble14.getTtm();
        double double17 = quarterlyDouble14.get((int) '4');
        double[] doubleArray21 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble22 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray21);
        double[] doubleArray23 = quarterlyDouble22.dArr;
        double double24 = quarterlyDouble22.getQseqQ();
        double[] doubleArray25 = new double[] {};
        quarterlyDouble22.dArr = doubleArray25;
        quarterlyDouble14.dArr = doubleArray25;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble28 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray25);
        double[] doubleArray32 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble33 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray32);
        double double34 = quarterlyDouble33.getTtm();
        double double36 = quarterlyDouble33.get((int) '4');
        double[] doubleArray40 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble41 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray40);
        double[] doubleArray42 = quarterlyDouble41.dArr;
        double double43 = quarterlyDouble41.getQseqQ();
        double[] doubleArray44 = new double[] {};
        quarterlyDouble41.dArr = doubleArray44;
        quarterlyDouble33.dArr = doubleArray44;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble47 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray44);
        quarterlyDouble28.dArr = doubleArray44;
        quarterlyDouble8.dArr = doubleArray44;
        double[] doubleArray50 = quarterlyDouble8.dArr;
        // The following exception was thrown during execution in test generation
        try {
            double double53 = quarterlyDouble8.deltaQ((int) (short) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[]");
    }

    @Test
    public void test00538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00538");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray10 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray10);
        quarterlyDouble4.dArr = doubleArray10;
        double double13 = quarterlyDouble4.getQseqQ();
        double double16 = quarterlyDouble4.deltaQ((int) (short) 100, (int) (byte) -1);
        double double19 = quarterlyDouble4.deltaQ((int) (byte) 100, 0);
        double double20 = quarterlyDouble4.getTtm();
        double[] doubleArray21 = quarterlyDouble4.dArr;
        // The following exception was thrown during execution in test generation
        try {
            double double22 = quarterlyDouble4.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[10.0, 52.0, 1.0]");
    }

    @Test
    public void test00539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00539");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) '4');
        double[] doubleArray11 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray11);
        double[] doubleArray13 = quarterlyDouble12.dArr;
        double double14 = quarterlyDouble12.getQseqQ();
        double[] doubleArray15 = new double[] {};
        quarterlyDouble12.dArr = doubleArray15;
        quarterlyDouble4.dArr = doubleArray15;
        // The following exception was thrown during execution in test generation
        try {
            double double18 = quarterlyDouble4.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test00540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00540");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double double7 = quarterlyDouble4.getTtmAvg();
        double double8 = quarterlyDouble4.getTtmAvg();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = quarterlyDouble4.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test00541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00541");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray7 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray7);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray7);
        double[] doubleArray13 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray13);
        double double15 = quarterlyDouble14.getTtmAvg();
        double double16 = quarterlyDouble14.getTtm();
        double double17 = quarterlyDouble14.getTtmAvg();
        double double18 = quarterlyDouble14.getQseqQ();
        double[] doubleArray19 = quarterlyDouble14.dArr;
        quarterlyDouble9.dArr = doubleArray19;
        double double21 = quarterlyDouble9.getTtm();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = quarterlyDouble9.fmtGrowth4Q("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 5100.0d + "'", double18 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test00542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00542");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("", 10, (int) (byte) 1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test00543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00543");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double6 = quarterlyDouble5.getTtmAvg();
        double double7 = quarterlyDouble5.getTtmAvg();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = quarterlyDouble5.fmtGrowth4Q("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test00544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00544");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray7 = quarterlyDouble4.dArr;
        double double8 = quarterlyDouble4.getQseqQ();
        double[] doubleArray12 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray12);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray12);
        quarterlyDouble4.dArr = doubleArray12;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = quarterlyDouble4.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    }

    @Test
    public void test00545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00545");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!", (int) (short) -1, (int) (byte) -1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test00546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00546");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) '4');
        double[] doubleArray11 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray11);
        double[] doubleArray13 = quarterlyDouble12.dArr;
        double double14 = quarterlyDouble12.getQseqQ();
        double[] doubleArray15 = new double[] {};
        quarterlyDouble12.dArr = doubleArray15;
        quarterlyDouble4.dArr = doubleArray15;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray15);
        double double19 = quarterlyDouble18.getTtm();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = quarterlyDouble18.fmtGrowth4Q("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test00547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00547");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double6 = quarterlyDouble4.get((int) (byte) 1);
        double[] doubleArray10 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray10);
        double double12 = quarterlyDouble11.getTtm();
        double double13 = quarterlyDouble11.getQseqQ();
        double[] doubleArray14 = quarterlyDouble11.dArr;
        double[] doubleArray18 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray18);
        quarterlyDouble11.dArr = doubleArray18;
        double double21 = quarterlyDouble11.getTtm();
        double[] doubleArray22 = quarterlyDouble11.dArr;
        double double23 = quarterlyDouble11.getTtm();
        double[] doubleArray24 = quarterlyDouble11.dArr;
        quarterlyDouble4.dArr = doubleArray24;
        // The following exception was thrown during execution in test generation
        try {
            double double28 = quarterlyDouble4.deltaQ(0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5100.0d + "'", double13 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[10.0, 52.0, 1.0]");
    }

    @Test
    public void test00548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00548");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double6 = quarterlyDouble4.get((int) (byte) 1);
        double double7 = quarterlyDouble4.getQseqQ();
        double double9 = quarterlyDouble4.get((int) (byte) 1);
        double double12 = quarterlyDouble4.deltaQ((int) (byte) 1, 0);
        double double13 = quarterlyDouble4.getQseqQ();
        double double16 = quarterlyDouble4.deltaQ((int) (short) 100, 1);
        double double17 = quarterlyDouble4.getTtm();
        // The following exception was thrown during execution in test generation
        try {
            double double20 = quarterlyDouble4.deltaQ(0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test00549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00549");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray7 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray7);
        double double9 = quarterlyDouble8.getQseqQ();
        double double10 = quarterlyDouble8.getMostRecent();
        double double11 = quarterlyDouble8.getMostRecent();
        double double12 = quarterlyDouble8.getTtmAvg();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 5100.0d + "'", double9 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test00550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00550");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!", (int) (short) 100, (int) (short) 10);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test00551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00551");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!", (int) (byte) 10, (int) '#');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test00552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00552");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.add(companyFileData0, estimateFileData1, sharesFileData2, incSheetFileData3, balSheetFileData4, cashFileData5, 0, (int) '4');
    }

    @Test
    public void test00553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00553");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.add(companyFileData0, estimateFileData1, sharesFileData2, incSheetFileData3, balSheetFileData4, cashFileData5, (int) (short) 0, 0);
    }

    @Test
    public void test00554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00554");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("", (int) (short) 1, (-1));
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test00555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00555");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray7 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray7);
        double double9 = quarterlyDouble8.getQseqQ();
        double double10 = quarterlyDouble8.getTtm();
        double[] doubleArray11 = quarterlyDouble8.dArr;
        java.lang.Class<?> wildcardClass12 = doubleArray11.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 5100.0d + "'", double9 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00556");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray7 = quarterlyDouble4.dArr;
        double double8 = quarterlyDouble4.getQseqQ();
        double[] doubleArray12 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray12);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray12);
        quarterlyDouble4.dArr = doubleArray12;
        double[] doubleArray16 = quarterlyDouble4.dArr;
        double[] doubleArray20 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble21 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray20);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble22 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray20);
        double[] doubleArray23 = quarterlyDouble22.dArr;
        double[] doubleArray27 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble28 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray27);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble29 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray27);
        double double31 = quarterlyDouble29.get(100);
        double[] doubleArray32 = quarterlyDouble29.dArr;
        quarterlyDouble22.dArr = doubleArray32;
        quarterlyDouble4.dArr = doubleArray32;
        double[] doubleArray35 = quarterlyDouble4.dArr;
        // The following exception was thrown during execution in test generation
        try {
            double double36 = quarterlyDouble4.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[10.0, 52.0, 1.0]");
    }

    @Test
    public void test00557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00557");
        net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile((int) '4', (int) (short) -1);
    }

    @Test
    public void test00558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00558");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!", 1, 1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test00559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00559");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) '4');
        double[] doubleArray11 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray11);
        double[] doubleArray13 = quarterlyDouble12.dArr;
        double double14 = quarterlyDouble12.getQseqQ();
        double[] doubleArray15 = new double[] {};
        quarterlyDouble12.dArr = doubleArray15;
        quarterlyDouble4.dArr = doubleArray15;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray15);
        double[] doubleArray22 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble23 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray22);
        double double24 = quarterlyDouble23.getTtm();
        double double26 = quarterlyDouble23.get((int) '4');
        double[] doubleArray30 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble31 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray30);
        double[] doubleArray32 = quarterlyDouble31.dArr;
        double double33 = quarterlyDouble31.getQseqQ();
        double[] doubleArray34 = new double[] {};
        quarterlyDouble31.dArr = doubleArray34;
        quarterlyDouble23.dArr = doubleArray34;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble37 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray34);
        quarterlyDouble18.dArr = doubleArray34;
        double[] doubleArray39 = quarterlyDouble18.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble40 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray39);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble41 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray39);
        java.lang.Class<?> wildcardClass42 = doubleArray39.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test00560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00560");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double double6 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.getMostRecent();
        double double8 = quarterlyDouble4.getTtmAvg();
        double double9 = quarterlyDouble4.getTtmAvg();
        double double11 = quarterlyDouble4.get((int) ' ');
        double[] doubleArray15 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray15);
        double double17 = quarterlyDouble16.getTtmAvg();
        double double18 = quarterlyDouble16.getMostRecent();
        double double20 = quarterlyDouble16.get((int) 'a');
        double double22 = quarterlyDouble16.get((int) (byte) -1);
        double[] doubleArray26 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble27 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray26);
        double double28 = quarterlyDouble27.getTtm();
        double double29 = quarterlyDouble27.getQseqQ();
        double[] doubleArray30 = quarterlyDouble27.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble31 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray30);
        quarterlyDouble16.dArr = doubleArray30;
        quarterlyDouble4.dArr = doubleArray30;
        java.lang.Class<?> wildcardClass34 = doubleArray30.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-9999.9999d) + "'", double11 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 52.0d + "'", double18 == 52.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-9999.9999d) + "'", double20 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-9999.9999d) + "'", double22 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 5100.0d + "'", double29 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test00561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00561");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.add(companyFileData0, estimateFileData1, sharesFileData2, incSheetFileData3, balSheetFileData4, cashFileData5, (int) (byte) -1, (int) (short) -1);
    }

    @Test
    public void test00562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00562");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray7 = quarterlyDouble4.dArr;
        double[] doubleArray11 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray11);
        quarterlyDouble4.dArr = doubleArray11;
        double double14 = quarterlyDouble4.getTtm();
        double[] doubleArray15 = quarterlyDouble4.dArr;
        double double16 = quarterlyDouble4.getTtm();
        double double18 = quarterlyDouble4.get(0);
        double double19 = quarterlyDouble4.getTtm();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = quarterlyDouble4.fmtGrowth4Q("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test00563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00563");
        net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile((int) (short) 100, (int) '4');
    }

    @Test
    public void test00564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00564");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!", (int) (byte) -1, (int) (short) 10);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test00565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00565");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.add(companyFileData0, estimateFileData1, sharesFileData2, incSheetFileData3, balSheetFileData4, cashFileData5, (int) (short) 100, (-1));
    }

    @Test
    public void test00566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00566");
        net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile((int) (short) 100, (int) (byte) 100);
    }

    @Test
    public void test00567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00567");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList1 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, fieldDataArray0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData5 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, (int) (short) -1, (int) (short) 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData8 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, (int) 'a', 1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData11 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, (int) (short) -1, (int) (byte) -1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData14 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, (int) (short) 10, (int) 'a');
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData17 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, (int) (byte) 0, (int) (byte) 1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData20 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, (int) '4', (int) 'a');
        org.junit.Assert.assertNotNull(fieldDataArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(fieldData5);
        org.junit.Assert.assertNull(fieldData8);
        org.junit.Assert.assertNull(fieldData11);
        org.junit.Assert.assertNull(fieldData14);
        org.junit.Assert.assertNull(fieldData17);
        org.junit.Assert.assertNull(fieldData20);
    }

    @Test
    public void test00568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00568");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray10 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray10);
        quarterlyDouble4.dArr = doubleArray10;
        double double13 = quarterlyDouble4.getQseqQ();
        double double14 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray15 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray15);
        double double17 = quarterlyDouble16.getTtmAvg();
        // The following exception was thrown during execution in test generation
        try {
            double double18 = quarterlyDouble16.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test00569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00569");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray7 = quarterlyDouble4.dArr;
        double[] doubleArray11 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray11);
        quarterlyDouble4.dArr = doubleArray11;
        double double14 = quarterlyDouble4.getTtm();
        double[] doubleArray15 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray15);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray15);
        double double19 = quarterlyDouble17.get((int) (byte) 10);
        double double22 = quarterlyDouble17.deltaQ((int) '#', 100);
        double double23 = quarterlyDouble17.getTtmAvg();
        double double24 = quarterlyDouble17.getTtm();
        // The following exception was thrown during execution in test generation
        try {
            double double25 = quarterlyDouble17.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    }

    @Test
    public void test00570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00570");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList0, 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00571");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.add(companyFileData0, estimateFileData1, sharesFileData2, incSheetFileData3, balSheetFileData4, cashFileData5, (-1), (int) (byte) -1);
    }

    @Test
    public void test00572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00572");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray10 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray10);
        quarterlyDouble4.dArr = doubleArray10;
        double double13 = quarterlyDouble4.getQseqQ();
        double double16 = quarterlyDouble4.deltaQ((int) (short) 100, (int) (byte) -1);
        double double19 = quarterlyDouble4.deltaQ((int) (byte) 100, 0);
        double[] doubleArray20 = quarterlyDouble4.dArr;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = quarterlyDouble4.fmtGrowth1Q("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, 52.0, 1.0]");
    }

    @Test
    public void test00573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00573");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray10 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray10);
        quarterlyDouble4.dArr = doubleArray10;
        double double13 = quarterlyDouble4.getQseqQ();
        double double16 = quarterlyDouble4.deltaQ((int) (short) 100, (int) (byte) -1);
        double[] doubleArray17 = quarterlyDouble4.dArr;
        double[] doubleArray21 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble22 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray21);
        double double23 = quarterlyDouble22.getTtmAvg();
        double double24 = quarterlyDouble22.getTtm();
        double double25 = quarterlyDouble22.getTtmAvg();
        double double27 = quarterlyDouble22.get((int) (byte) 100);
        double[] doubleArray28 = quarterlyDouble22.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble29 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray28);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble30 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray28);
        quarterlyDouble4.dArr = doubleArray28;
        double double34 = quarterlyDouble4.deltaQ((int) (byte) 100, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str36 = quarterlyDouble4.fmtGrowth4Q("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-9999.9999d) + "'", double27 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
    }

    @Test
    public void test00574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00574");
        net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile((int) (short) -1, (int) (short) 0);
    }

    @Test
    public void test00575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00575");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!", 1, (int) (short) 10);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test00576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00576");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!", (int) (short) 100, (int) (byte) 10);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test00577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00577");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double7 = quarterlyDouble4.deltaQ((int) (short) 10, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = quarterlyDouble4.deltaQ((int) (short) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test00578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00578");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) '4');
        double[] doubleArray11 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray11);
        double[] doubleArray13 = quarterlyDouble12.dArr;
        double double14 = quarterlyDouble12.getQseqQ();
        double[] doubleArray15 = new double[] {};
        quarterlyDouble12.dArr = doubleArray15;
        quarterlyDouble4.dArr = doubleArray15;
        double[] doubleArray18 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray18);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray18);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble21 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = quarterlyDouble21.fmtGrowth1Q("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test00579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00579");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double6 = quarterlyDouble4.get((int) (byte) 1);
        double double7 = quarterlyDouble4.getQseqQ();
        double double8 = quarterlyDouble4.getQseqQ();
        double double9 = quarterlyDouble4.getTtmAvg();
        double double12 = quarterlyDouble4.deltaQ(0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = quarterlyDouble4.fmtGrowth4Q("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 5100.0d + "'", double7 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 5100.0d + "'", double8 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test00580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00580");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("", (int) (short) 100, (int) (byte) 100);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test00581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00581");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.add(companyFileData0, estimateFileData1, sharesFileData2, incSheetFileData3, balSheetFileData4, cashFileData5, 0, (int) (byte) 10);
    }

    @Test
    public void test00582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00582");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) '4');
        double[] doubleArray11 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray11);
        double[] doubleArray13 = quarterlyDouble12.dArr;
        double double14 = quarterlyDouble12.getQseqQ();
        double[] doubleArray15 = new double[] {};
        quarterlyDouble12.dArr = doubleArray15;
        quarterlyDouble4.dArr = doubleArray15;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray15);
        double double19 = quarterlyDouble18.getTtm();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = quarterlyDouble18.fmtGrowth1Q("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test00583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00583");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray10 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray10);
        quarterlyDouble4.dArr = doubleArray10;
        double double13 = quarterlyDouble4.getQseqQ();
        double double16 = quarterlyDouble4.deltaQ((int) (short) 100, (int) (byte) -1);
        double[] doubleArray17 = quarterlyDouble4.dArr;
        double[] doubleArray18 = quarterlyDouble4.dArr;
        double double19 = quarterlyDouble4.getTtmAvg();
        double double22 = quarterlyDouble4.deltaQ((int) 'a', (int) '4');
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
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test00584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00584");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double[] doubleArray6 = quarterlyDouble5.dArr;
        double[] doubleArray10 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray10);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray10);
        double double14 = quarterlyDouble12.get(100);
        double[] doubleArray15 = quarterlyDouble12.dArr;
        quarterlyDouble5.dArr = doubleArray15;
        double[] doubleArray20 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble21 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray20);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble22 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray20);
        double double24 = quarterlyDouble22.get(100);
        double[] doubleArray25 = quarterlyDouble22.dArr;
        quarterlyDouble5.dArr = doubleArray25;
        java.lang.Class<?> wildcardClass27 = quarterlyDouble5.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-9999.9999d) + "'", double14 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-9999.9999d) + "'", double24 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00585");
        net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile((int) (byte) 100, 0);
    }

    @Test
    public void test00586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00586");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray7 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray7);
        double double9 = quarterlyDouble8.getTtm();
        double[] doubleArray13 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray13);
        double double15 = quarterlyDouble14.getTtm();
        double double17 = quarterlyDouble14.get((int) '4');
        double[] doubleArray21 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble22 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray21);
        double[] doubleArray23 = quarterlyDouble22.dArr;
        double double24 = quarterlyDouble22.getQseqQ();
        double[] doubleArray25 = new double[] {};
        quarterlyDouble22.dArr = doubleArray25;
        quarterlyDouble14.dArr = doubleArray25;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble28 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray25);
        double[] doubleArray32 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble33 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray32);
        double double34 = quarterlyDouble33.getTtm();
        double double36 = quarterlyDouble33.get((int) '4');
        double[] doubleArray40 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble41 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray40);
        double[] doubleArray42 = quarterlyDouble41.dArr;
        double double43 = quarterlyDouble41.getQseqQ();
        double[] doubleArray44 = new double[] {};
        quarterlyDouble41.dArr = doubleArray44;
        quarterlyDouble33.dArr = doubleArray44;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble47 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray44);
        quarterlyDouble28.dArr = doubleArray44;
        quarterlyDouble8.dArr = doubleArray44;
        double[] doubleArray53 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble54 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray53);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble55 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray53);
        double[] doubleArray56 = quarterlyDouble55.dArr;
        double[] doubleArray60 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble61 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray60);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble62 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray60);
        double double64 = quarterlyDouble62.get(100);
        double[] doubleArray65 = quarterlyDouble62.dArr;
        quarterlyDouble55.dArr = doubleArray65;
        double double67 = quarterlyDouble55.getTtmAvg();
        double double68 = quarterlyDouble55.getQseqQ();
        double[] doubleArray69 = quarterlyDouble55.dArr;
        quarterlyDouble8.dArr = doubleArray69;
        // The following exception was thrown during execution in test generation
        try {
            double double71 = quarterlyDouble8.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + (-9999.9999d) + "'", double64 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 0.0d + "'", double67 == 0.0d);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 5100.0d + "'", double68 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[10.0, 52.0, 1.0]");
    }

    @Test
    public void test00587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00587");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double7 = quarterlyDouble5.get(10);
        double double8 = quarterlyDouble5.getMostRecent();
        double double10 = quarterlyDouble5.get((int) (byte) -1);
        double double11 = quarterlyDouble5.getTtm();
        double double12 = quarterlyDouble5.getTtmAvg();
        double double15 = quarterlyDouble5.deltaQ((int) '#', (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = quarterlyDouble5.fmtGrowth4Q("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test00588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00588");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("", (int) (byte) -1, (int) (short) -1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test00589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00589");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
        java.lang.String str5 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = companyData1.getFdList();
        java.lang.String str8 = companyData1.getTicker();
        java.lang.String str9 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = companyData1.getFdList();
        java.lang.String str11 = companyData1.getTicker();
        java.lang.String str12 = companyData1.getTicker();
        java.lang.Class<?> wildcardClass13 = companyData1.getClass();
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNotNull(fieldDataList3);
        org.junit.Assert.assertNotNull(fieldDataList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(fieldDataList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00590");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray7 = quarterlyDouble4.dArr;
        double[] doubleArray11 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray11);
        quarterlyDouble4.dArr = doubleArray11;
        double double14 = quarterlyDouble4.getTtm();
        double[] doubleArray15 = quarterlyDouble4.dArr;
        double double16 = quarterlyDouble4.getQseqQ();
        double double17 = quarterlyDouble4.getTtm();
        double double18 = quarterlyDouble4.getQseqQ();
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
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 5100.0d + "'", double18 == 5100.0d);
    }

    @Test
    public void test00591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00591");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
        java.lang.String str5 = companyData1.getTicker();
        java.lang.String str6 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = companyData1.getFdList();
        java.lang.Class<?> wildcardClass8 = companyData1.getClass();
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNotNull(fieldDataList3);
        org.junit.Assert.assertNotNull(fieldDataList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(fieldDataList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00592");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray7 = quarterlyDouble4.dArr;
        double[] doubleArray11 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray11);
        quarterlyDouble4.dArr = doubleArray11;
        double double14 = quarterlyDouble4.getTtm();
        double double16 = quarterlyDouble4.get((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = quarterlyDouble4.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test00593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00593");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double6 = quarterlyDouble5.getMostRecent();
        double double9 = quarterlyDouble5.deltaQ(1, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = quarterlyDouble5.fmtGrowth1Q("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test00594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00594");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double7 = quarterlyDouble5.get(10);
        double double8 = quarterlyDouble5.getMostRecent();
        double double9 = quarterlyDouble5.getQseqQ();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = quarterlyDouble5.fmtGrowth1Q("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9999.9999d) + "'", double7 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 5100.0d + "'", double9 == 5100.0d);
    }

    @Test
    public void test00595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00595");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double6 = quarterlyDouble5.getTtmAvg();
        double double7 = quarterlyDouble5.getTtmAvg();
        double double8 = quarterlyDouble5.getTtmAvg();
        double double9 = quarterlyDouble5.getMostRecent();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = quarterlyDouble5.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
    }

    @Test
    public void test00596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00596");
        net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile((int) (byte) -1, (int) (short) 10);
    }

    @Test
    public void test00597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00597");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) '4');
        double double9 = quarterlyDouble4.get((int) ' ');
        double[] doubleArray13 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray13);
        double double15 = quarterlyDouble14.getTtm();
        double double17 = quarterlyDouble14.get((int) '4');
        double[] doubleArray21 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble22 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray21);
        double[] doubleArray23 = quarterlyDouble22.dArr;
        double double24 = quarterlyDouble22.getQseqQ();
        double[] doubleArray25 = new double[] {};
        quarterlyDouble22.dArr = doubleArray25;
        quarterlyDouble14.dArr = doubleArray25;
        double[] doubleArray28 = quarterlyDouble14.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble29 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray28);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble30 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray28);
        quarterlyDouble4.dArr = doubleArray28;
        // The following exception was thrown during execution in test generation
        try {
            double double32 = quarterlyDouble4.getMostRecent();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9999.9999d) + "'", double7 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-9999.9999d) + "'", double9 == (-9999.9999d));
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
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[]");
    }

    @Test
    public void test00598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00598");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("", (int) (byte) 100, 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test00599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00599");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double double6 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.getMostRecent();
        double[] doubleArray8 = quarterlyDouble4.dArr;
        java.lang.Class<?> wildcardClass9 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00600");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray7 = quarterlyDouble4.dArr;
        double double8 = quarterlyDouble4.getQseqQ();
        double[] doubleArray12 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray12);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray12);
        quarterlyDouble4.dArr = doubleArray12;
        double[] doubleArray16 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray16);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray16);
        java.lang.Class<?> wildcardClass19 = doubleArray16.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00601");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray10 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray10);
        quarterlyDouble4.dArr = doubleArray10;
        double double13 = quarterlyDouble4.getQseqQ();
        double double16 = quarterlyDouble4.deltaQ((int) (short) 100, (int) (byte) -1);
        double double19 = quarterlyDouble4.deltaQ((int) (byte) 100, 0);
        double double20 = quarterlyDouble4.getTtm();
        double[] doubleArray21 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble22 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray21);
        double[] doubleArray26 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble27 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray26);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble28 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray26);
        double[] doubleArray29 = quarterlyDouble28.dArr;
        double[] doubleArray33 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble34 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray33);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble35 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray33);
        double double37 = quarterlyDouble35.get(100);
        double[] doubleArray38 = quarterlyDouble35.dArr;
        quarterlyDouble28.dArr = doubleArray38;
        double double40 = quarterlyDouble28.getTtmAvg();
        double double41 = quarterlyDouble28.getQseqQ();
        double[] doubleArray42 = quarterlyDouble28.dArr;
        quarterlyDouble22.dArr = doubleArray42;
        // The following exception was thrown during execution in test generation
        try {
            double double44 = quarterlyDouble22.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + (-9999.9999d) + "'", double37 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 5100.0d + "'", double41 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[10.0, 52.0, 1.0]");
    }

    @Test
    public void test00602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00602");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData6 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList3, (int) (byte) 0, (int) (short) 10);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData9 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList3, 100, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = fieldData9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNotNull(fieldDataList3);
        org.junit.Assert.assertNull(fieldData6);
        org.junit.Assert.assertNull(fieldData9);
    }

    @Test
    public void test00603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00603");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double[] doubleArray5 = quarterlyDouble4.dArr;
        double double6 = quarterlyDouble4.getTtm();
        double double9 = quarterlyDouble4.deltaQ((int) '#', 100);
        double[] doubleArray13 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray13);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray13);
        double[] doubleArray16 = quarterlyDouble15.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray16);
        double double18 = quarterlyDouble17.getMostRecent();
        double[] doubleArray22 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble23 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray22);
        double double24 = quarterlyDouble23.getTtm();
        double double25 = quarterlyDouble23.getQseqQ();
        double[] doubleArray26 = quarterlyDouble23.dArr;
        double double27 = quarterlyDouble23.getQseqQ();
        double[] doubleArray31 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble32 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray31);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble33 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray31);
        quarterlyDouble23.dArr = doubleArray31;
        double[] doubleArray35 = quarterlyDouble23.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble36 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray35);
        quarterlyDouble17.dArr = doubleArray35;
        quarterlyDouble4.dArr = doubleArray35;
        java.lang.Class<?> wildcardClass39 = doubleArray35.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 52.0d + "'", double18 == 52.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 5100.0d + "'", double25 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 5100.0d + "'", double27 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test00604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00604");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList2, (int) (short) 0, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList7 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList((java.util.List<java.lang.String>) strList2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList8 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList((java.util.List<java.lang.String>) strList2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList11 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList2, 0, (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList14 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList2, 0, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList15 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList((java.util.List<java.lang.String>) strList2);
        java.lang.Class<?> wildcardClass16 = strList2.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(companyDataList6);
        org.junit.Assert.assertNotNull(manyCompanyDataList7);
        org.junit.Assert.assertNotNull(manyCompanyDataList8);
        org.junit.Assert.assertNotNull(companyDataList11);
        org.junit.Assert.assertNotNull(companyDataList14);
        org.junit.Assert.assertNotNull(manyCompanyDataList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00605");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double double6 = quarterlyDouble4.getMostRecent();
        double double7 = quarterlyDouble4.getTtm();
        double double8 = quarterlyDouble4.getTtm();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = quarterlyDouble4.fmtGrowth4Q("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test00606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00606");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) '4');
        double double9 = quarterlyDouble4.get((int) ' ');
        double double11 = quarterlyDouble4.get((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            double double12 = quarterlyDouble4.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9999.9999d) + "'", double7 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-9999.9999d) + "'", double9 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-9999.9999d) + "'", double11 == (-9999.9999d));
    }

    @Test
    public void test00607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00607");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double7 = quarterlyDouble5.get(10);
        double double8 = quarterlyDouble5.getMostRecent();
        double[] doubleArray9 = quarterlyDouble5.dArr;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = quarterlyDouble5.fmtGrowth4Q("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test00608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00608");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
        java.lang.String str5 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = companyData1.getFdList();
        java.lang.String str8 = companyData1.getTicker();
        java.lang.String str9 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = companyData1.getFdList();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData13 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList10, (-1), (int) (short) -1);
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNotNull(fieldDataList3);
        org.junit.Assert.assertNotNull(fieldDataList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(fieldDataList10);
        org.junit.Assert.assertNull(fieldData13);
    }

    @Test
    public void test00609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00609");
        net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile((int) (short) 1, 1);
    }

    @Test
    public void test00610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00610");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.add(companyFileData0, estimateFileData1, sharesFileData2, incSheetFileData3, balSheetFileData4, cashFileData5, (int) (byte) 100, (int) (short) 1);
    }

    @Test
    public void test00611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00611");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!", (int) (byte) -1, 10);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test00612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00612");
        java.util.List<java.lang.String> strList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList0, (int) (short) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00613");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!", (int) (byte) 0, (int) (byte) 10);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test00614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00614");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double7 = quarterlyDouble5.get((int) (short) -1);
        double double8 = quarterlyDouble5.getTtmAvg();
        double double9 = quarterlyDouble5.getQseqQ();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = quarterlyDouble5.fmtGrowth4Q("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9999.9999d) + "'", double7 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 5100.0d + "'", double9 == 5100.0d);
    }

    @Test
    public void test00615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00615");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList5 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList((java.util.List<java.lang.String>) strList3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList8 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList3, (int) (byte) 0, (int) '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(manyCompanyDataList5);
        org.junit.Assert.assertNotNull(companyDataList8);
    }

    @Test
    public void test00616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00616");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double[] doubleArray6 = quarterlyDouble5.dArr;
        double[] doubleArray10 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray10);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray10);
        double double14 = quarterlyDouble12.get(100);
        double[] doubleArray15 = quarterlyDouble12.dArr;
        quarterlyDouble5.dArr = doubleArray15;
        java.lang.Class<?> wildcardClass17 = quarterlyDouble5.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-9999.9999d) + "'", double14 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00617");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray10 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray10);
        quarterlyDouble4.dArr = doubleArray10;
        double double13 = quarterlyDouble4.getQseqQ();
        double double14 = quarterlyDouble4.getTtmAvg();
        double double15 = quarterlyDouble4.getTtm();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = quarterlyDouble4.fmtGrowth4Q("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test00618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00618");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("", (int) (short) 100, (int) (short) 10);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test00619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00619");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray10 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray10);
        quarterlyDouble4.dArr = doubleArray10;
        double double13 = quarterlyDouble4.getQseqQ();
        double double16 = quarterlyDouble4.deltaQ((int) (short) 100, (int) (byte) -1);
        double double19 = quarterlyDouble4.deltaQ((int) (byte) 100, 0);
        double[] doubleArray20 = quarterlyDouble4.dArr;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = quarterlyDouble4.fmtGrowth4Q("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, 52.0, 1.0]");
    }

    @Test
    public void test00620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00620");
        java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers((int) ' ', (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList5 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList2, (int) (byte) 10, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList9 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList2, 100, (int) (byte) 1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(companyDataList5);
        org.junit.Assert.assertNotNull(companyDataList6);
        org.junit.Assert.assertNotNull(companyDataList9);
    }

    @Test
    public void test00621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00621");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray7 = quarterlyDouble4.dArr;
        double[] doubleArray11 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray11);
        quarterlyDouble4.dArr = doubleArray11;
        double double14 = quarterlyDouble4.getTtm();
        double[] doubleArray15 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray15);
        double double18 = quarterlyDouble16.get((int) (byte) 10);
        double double21 = quarterlyDouble16.deltaQ((int) (short) -1, (int) (short) 1);
        java.lang.Class<?> wildcardClass22 = quarterlyDouble16.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00622");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.add(companyFileData0, estimateFileData1, sharesFileData2, incSheetFileData3, balSheetFileData4, cashFileData5, (int) (byte) -1, 100);
    }

    @Test
    public void test00623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00623");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double7 = quarterlyDouble4.deltaQ((int) (short) 10, (int) (short) 100);
        double[] doubleArray8 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = quarterlyDouble9.fmtGrowth4Q("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 52.0, 1.0]");
    }

    @Test
    public void test00624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00624");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!", (int) (byte) 1, (int) 'a');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test00625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00625");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) '4');
        double[] doubleArray11 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray11);
        double[] doubleArray13 = quarterlyDouble12.dArr;
        double double14 = quarterlyDouble12.getQseqQ();
        double[] doubleArray15 = new double[] {};
        quarterlyDouble12.dArr = doubleArray15;
        quarterlyDouble4.dArr = doubleArray15;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray15);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = quarterlyDouble19.fmtGrowth1Q("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test00626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00626");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) '4');
        double[] doubleArray11 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray11);
        double[] doubleArray13 = quarterlyDouble12.dArr;
        double double14 = quarterlyDouble12.getQseqQ();
        double[] doubleArray15 = new double[] {};
        quarterlyDouble12.dArr = doubleArray15;
        quarterlyDouble4.dArr = doubleArray15;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray15);
        double[] doubleArray22 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble23 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray22);
        double double24 = quarterlyDouble23.getTtm();
        double double26 = quarterlyDouble23.get((int) '4');
        double[] doubleArray30 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble31 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray30);
        double[] doubleArray32 = quarterlyDouble31.dArr;
        double double33 = quarterlyDouble31.getQseqQ();
        double[] doubleArray34 = new double[] {};
        quarterlyDouble31.dArr = doubleArray34;
        quarterlyDouble23.dArr = doubleArray34;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble37 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray34);
        quarterlyDouble18.dArr = doubleArray34;
        double double39 = quarterlyDouble18.getTtmAvg();
        // The following exception was thrown during execution in test generation
        try {
            double double40 = quarterlyDouble18.getMostRecent();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
    }

    @Test
    public void test00627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00627");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray10 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray10);
        quarterlyDouble4.dArr = doubleArray10;
        double double13 = quarterlyDouble4.getQseqQ();
        double double14 = quarterlyDouble4.getTtmAvg();
        double double15 = quarterlyDouble4.getTtm();
        double double16 = quarterlyDouble4.getTtm();
        double double18 = quarterlyDouble4.get(1);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = quarterlyDouble4.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 52.0d + "'", double18 == 52.0d);
    }

    @Test
    public void test00628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00628");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.add(companyFileData0, estimateFileData1, sharesFileData2, incSheetFileData3, balSheetFileData4, cashFileData5, 0, (int) ' ');
    }

    @Test
    public void test00629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00629");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double7 = quarterlyDouble5.get(10);
        double double8 = quarterlyDouble5.getMostRecent();
        double double10 = quarterlyDouble5.get((int) (byte) -1);
        double double11 = quarterlyDouble5.getTtm();
        double double12 = quarterlyDouble5.getMostRecent();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9999.9999d) + "'", double7 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
    }

    @Test
    public void test00630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00630");
        net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile((int) (byte) 0, (int) (byte) 100);
    }

    @Test
    public void test00631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00631");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("", (int) (byte) -1, (int) (byte) 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test00632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00632");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray7 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray7);
        double double9 = quarterlyDouble8.getTtmAvg();
        double double10 = quarterlyDouble8.getTtm();
        double double11 = quarterlyDouble8.getTtm();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = quarterlyDouble8.fmtGrowth1Q("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test00633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00633");
        net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile((int) (byte) 100, (int) (byte) -1);
    }

    @Test
    public void test00634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00634");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray7 = quarterlyDouble4.dArr;
        java.lang.Class<?> wildcardClass8 = quarterlyDouble4.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00635");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray10 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray10);
        quarterlyDouble4.dArr = doubleArray10;
        double double13 = quarterlyDouble4.getQseqQ();
        double double14 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray18 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray18);
        double double20 = quarterlyDouble19.getTtm();
        double double21 = quarterlyDouble19.getQseqQ();
        double[] doubleArray25 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble26 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray25);
        quarterlyDouble19.dArr = doubleArray25;
        double double28 = quarterlyDouble19.getQseqQ();
        double double29 = quarterlyDouble19.getTtmAvg();
        double double30 = quarterlyDouble19.getTtm();
        double[] doubleArray34 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble35 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray34);
        double double36 = quarterlyDouble35.getTtm();
        double double37 = quarterlyDouble35.getQseqQ();
        double[] doubleArray38 = quarterlyDouble35.dArr;
        quarterlyDouble19.dArr = doubleArray38;
        quarterlyDouble4.dArr = doubleArray38;
        java.lang.Class<?> wildcardClass41 = quarterlyDouble4.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test00636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00636");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) '4');
        double double10 = quarterlyDouble4.deltaQ((int) (short) 1, 0);
        double double11 = quarterlyDouble4.getMostRecent();
        double double14 = quarterlyDouble4.deltaQ((int) (byte) 1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = quarterlyDouble4.fmtGrowth1Q("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9999.9999d) + "'", double7 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test00637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00637");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!", (-1), (int) 'a');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test00638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00638");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double7 = quarterlyDouble5.get(10);
        double double8 = quarterlyDouble5.getMostRecent();
        double double10 = quarterlyDouble5.get((int) (byte) -1);
        double double11 = quarterlyDouble5.getTtm();
        double double12 = quarterlyDouble5.getTtmAvg();
        double double13 = quarterlyDouble5.getQseqQ();
        double double14 = quarterlyDouble5.getQseqQ();
        double double15 = quarterlyDouble5.getTtm();
        double double16 = quarterlyDouble5.getTtm();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = quarterlyDouble5.fmtGrowth4Q("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9999.9999d) + "'", double7 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5100.0d + "'", double13 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 5100.0d + "'", double14 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test00639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00639");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("", (int) '#', 1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test00640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00640");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!", (-1), (int) (short) 100);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test00641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00641");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double double7 = quarterlyDouble4.getTtm();
        double[] doubleArray8 = null;
        quarterlyDouble4.dArr = doubleArray8;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = quarterlyDouble4.getMostRecent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test00642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00642");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double double6 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.getTtmAvg();
        double double9 = quarterlyDouble4.get((int) (byte) 100);
        double[] doubleArray10 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray10);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray10);
        double double13 = quarterlyDouble12.getTtm();
        java.lang.Class<?> wildcardClass14 = quarterlyDouble12.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-9999.9999d) + "'", double9 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00643");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.add(companyFileData0, estimateFileData1, sharesFileData2, incSheetFileData3, balSheetFileData4, cashFileData5, (int) '#', (int) (byte) 10);
    }

    @Test
    public void test00644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00644");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.add(companyFileData0, estimateFileData1, sharesFileData2, incSheetFileData3, balSheetFileData4, cashFileData5, 10, (int) (byte) 1);
    }

    @Test
    public void test00645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00645");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray7 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray7);
        double double9 = quarterlyDouble8.getQseqQ();
        double double10 = quarterlyDouble8.getMostRecent();
        double[] doubleArray11 = quarterlyDouble8.dArr;
        java.lang.Class<?> wildcardClass12 = doubleArray11.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00646");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray7 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray7);
        double double9 = quarterlyDouble8.getTtmAvg();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = quarterlyDouble8.fmtGrowth1Q("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test00647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00647");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!", 0, 10);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test00648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00648");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.add(companyFileData0, estimateFileData1, sharesFileData2, incSheetFileData3, balSheetFileData4, cashFileData5, 0, (int) 'a');
    }

    @Test
    public void test00649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00649");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double6 = quarterlyDouble4.get((int) (byte) 1);
        double double7 = quarterlyDouble4.getQseqQ();
        double double9 = quarterlyDouble4.get((int) (byte) 1);
        double double12 = quarterlyDouble4.deltaQ((int) (byte) 1, 0);
        double double13 = quarterlyDouble4.getQseqQ();
        double double16 = quarterlyDouble4.deltaQ((int) (short) 100, 1);
        double double17 = quarterlyDouble4.getQseqQ();
        double double18 = quarterlyDouble4.getTtmAvg();
        double double19 = quarterlyDouble4.getTtmAvg();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = quarterlyDouble4.fmtGrowth4Q("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 5100.0d + "'", double17 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test00650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00650");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("", 100, (int) (byte) 100);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test00651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00651");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double[] doubleArray5 = quarterlyDouble4.dArr;
        double[] doubleArray6 = quarterlyDouble4.dArr;
        double double8 = quarterlyDouble4.get((int) (byte) 10);
        double[] doubleArray9 = quarterlyDouble4.dArr;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = quarterlyDouble4.deltaQ((int) (byte) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-9999.9999d) + "'", double8 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0, 52.0, 1.0]");
    }

    @Test
    public void test00652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00652");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double7 = quarterlyDouble5.get(100);
        double[] doubleArray8 = quarterlyDouble5.dArr;
        double double9 = quarterlyDouble5.getTtm();
        double double10 = quarterlyDouble5.getQseqQ();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = quarterlyDouble5.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9999.9999d) + "'", double7 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 5100.0d + "'", double10 == 5100.0d);
    }

    @Test
    public void test00653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00653");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray7 = quarterlyDouble4.dArr;
        double double8 = quarterlyDouble4.getTtm();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = quarterlyDouble4.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test00654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00654");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
        java.lang.Class<?> wildcardClass4 = companyData1.getClass();
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNotNull(fieldDataList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00655");
        net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile((int) (short) 0, (int) (short) 1);
    }

    @Test
    public void test00656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00656");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double7 = quarterlyDouble4.deltaQ((int) (short) 10, (int) (short) 100);
        double[] doubleArray8 = quarterlyDouble4.dArr;
        double double9 = quarterlyDouble4.getTtmAvg();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = quarterlyDouble4.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test00657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00657");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double double6 = quarterlyDouble4.getMostRecent();
        double double8 = quarterlyDouble4.get((int) 'a');
        double double10 = quarterlyDouble4.get((int) (byte) -1);
        double[] doubleArray14 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray14);
        double double16 = quarterlyDouble15.getTtm();
        double double17 = quarterlyDouble15.getQseqQ();
        double[] doubleArray18 = quarterlyDouble15.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray18);
        quarterlyDouble4.dArr = doubleArray18;
        double double21 = quarterlyDouble4.getMostRecent();
        double[] doubleArray25 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble26 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray25);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble27 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray25);
        double double29 = quarterlyDouble27.get(10);
        double double30 = quarterlyDouble27.getMostRecent();
        double[] doubleArray31 = quarterlyDouble27.dArr;
        quarterlyDouble4.dArr = doubleArray31;
        double double33 = quarterlyDouble4.getTtm();
        java.lang.Class<?> wildcardClass34 = quarterlyDouble4.getClass();
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
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test00658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00658");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData6 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList3, (int) (byte) 10, 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData9 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList3, (int) 'a', (int) (short) 10);
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNotNull(fieldDataList3);
        org.junit.Assert.assertNull(fieldData6);
        org.junit.Assert.assertNull(fieldData9);
    }

    @Test
    public void test00659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00659");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double7 = quarterlyDouble5.get(100);
        double double8 = quarterlyDouble5.getMostRecent();
        double double9 = quarterlyDouble5.getQseqQ();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = quarterlyDouble5.deltaQ(1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9999.9999d) + "'", double7 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 5100.0d + "'", double9 == 5100.0d);
    }

    @Test
    public void test00660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00660");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("", (int) (short) 100, 100);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test00661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00661");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double7 = quarterlyDouble4.deltaQ((int) (short) 10, (int) (short) 100);
        double double9 = quarterlyDouble4.get((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = quarterlyDouble4.fmtGrowth4Q("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
    }

    @Test
    public void test00662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00662");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!", (-1), (int) (short) 1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test00663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00663");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double6 = quarterlyDouble4.get((int) (byte) 1);
        double double7 = quarterlyDouble4.getQseqQ();
        double double8 = quarterlyDouble4.getQseqQ();
        double double9 = quarterlyDouble4.getTtmAvg();
        double double10 = quarterlyDouble4.getTtm();
        double double11 = quarterlyDouble4.getMostRecent();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 5100.0d + "'", double7 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 5100.0d + "'", double8 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
    }

    @Test
    public void test00664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00664");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) '4');
        double double10 = quarterlyDouble4.deltaQ((int) (short) 1, 0);
        double double11 = quarterlyDouble4.getMostRecent();
        double double12 = quarterlyDouble4.getQseqQ();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = quarterlyDouble4.fmtGrowth4Q("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test00665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00665");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray7 = quarterlyDouble4.dArr;
        double double8 = quarterlyDouble4.getQseqQ();
        double[] doubleArray12 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray12);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray12);
        quarterlyDouble4.dArr = doubleArray12;
        double[] doubleArray19 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray19);
        double[] doubleArray21 = quarterlyDouble20.dArr;
        double[] doubleArray22 = quarterlyDouble20.dArr;
        quarterlyDouble4.dArr = doubleArray22;
        double double24 = quarterlyDouble4.getQseqQ();
        double double25 = quarterlyDouble4.getTtm();
        double[] doubleArray29 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble30 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray29);
        double double31 = quarterlyDouble30.getTtm();
        double double33 = quarterlyDouble30.get((int) '4');
        double[] doubleArray37 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble38 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray37);
        double[] doubleArray39 = quarterlyDouble38.dArr;
        double double40 = quarterlyDouble38.getQseqQ();
        double[] doubleArray41 = new double[] {};
        quarterlyDouble38.dArr = doubleArray41;
        quarterlyDouble30.dArr = doubleArray41;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble44 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray41);
        double[] doubleArray48 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble49 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray48);
        double double50 = quarterlyDouble49.getTtm();
        double double52 = quarterlyDouble49.get((int) '4');
        double[] doubleArray56 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble57 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray56);
        double[] doubleArray58 = quarterlyDouble57.dArr;
        double double59 = quarterlyDouble57.getQseqQ();
        double[] doubleArray60 = new double[] {};
        quarterlyDouble57.dArr = doubleArray60;
        quarterlyDouble49.dArr = doubleArray60;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble63 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray60);
        quarterlyDouble44.dArr = doubleArray60;
        double[] doubleArray65 = quarterlyDouble44.dArr;
        quarterlyDouble4.dArr = doubleArray65;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str68 = quarterlyDouble4.fmtGrowth1Q("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-9999.9999d) + "'", double33 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 5100.0d + "'", double40 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + (-9999.9999d) + "'", double52 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 5100.0d + "'", double59 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[]");
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[]");
    }

    @Test
    public void test00666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00666");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("");
        java.lang.String str2 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
        java.lang.String str4 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList5 = companyData1.getFdList();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData8 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList5, (int) ' ', (int) (short) -1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData11 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList5, 0, 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(fieldDataList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(fieldDataList5);
        org.junit.Assert.assertNull(fieldData8);
        org.junit.Assert.assertNull(fieldData11);
    }

    @Test
    public void test00667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00667");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList3, 100, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList10 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList3, 100, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList11 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList((java.util.List<java.lang.String>) strList3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList12 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList((java.util.List<java.lang.String>) strList3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList13 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList((java.util.List<java.lang.String>) strList3);
        java.lang.Class<?> wildcardClass14 = strList3.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(companyDataList7);
        org.junit.Assert.assertNotNull(companyDataList10);
        org.junit.Assert.assertNotNull(manyCompanyDataList11);
        org.junit.Assert.assertNotNull(manyCompanyDataList12);
        org.junit.Assert.assertNotNull(manyCompanyDataList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00668");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!", (int) (short) -1, 10);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test00669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00669");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!", (int) '4', (int) (short) 100);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test00670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00670");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.add(companyFileData0, estimateFileData1, sharesFileData2, incSheetFileData3, balSheetFileData4, cashFileData5, (int) (byte) 0, (int) (short) 0);
    }

    @Test
    public void test00671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00671");
        net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile((int) (short) -1, (int) (byte) -1);
    }

    @Test
    public void test00672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00672");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double double6 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.getTtmAvg();
        double double8 = quarterlyDouble4.getQseqQ();
        double double9 = quarterlyDouble4.getTtmAvg();
        double double10 = quarterlyDouble4.getTtm();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = quarterlyDouble4.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 5100.0d + "'", double8 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test00673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00673");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double double6 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.getTtmAvg();
        double double9 = quarterlyDouble4.get((int) ' ');
        double double10 = quarterlyDouble4.getMostRecent();
        double double12 = quarterlyDouble4.get(10);
        double double15 = quarterlyDouble4.deltaQ(10, (int) (short) -1);
        double double16 = quarterlyDouble4.getMostRecent();
        double double17 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray18 = quarterlyDouble4.dArr;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = quarterlyDouble4.fmtGrowth4Q("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 52.0d + "'", double16 == 52.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, 52.0, 1.0]");
    }

    @Test
    public void test00674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00674");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray10 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray10);
        quarterlyDouble4.dArr = doubleArray10;
        double[] doubleArray16 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray16);
        double double18 = quarterlyDouble17.getTtm();
        double double19 = quarterlyDouble17.getQseqQ();
        double[] doubleArray20 = quarterlyDouble17.dArr;
        double[] doubleArray24 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble25 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray24);
        quarterlyDouble17.dArr = doubleArray24;
        double double27 = quarterlyDouble17.getTtm();
        double[] doubleArray28 = quarterlyDouble17.dArr;
        double double29 = quarterlyDouble17.getTtm();
        double[] doubleArray30 = quarterlyDouble17.dArr;
        quarterlyDouble4.dArr = doubleArray30;
        double double32 = quarterlyDouble4.getMostRecent();
        double[] doubleArray33 = quarterlyDouble4.dArr;
        double[] doubleArray34 = quarterlyDouble4.dArr;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str36 = quarterlyDouble4.fmtGrowth1Q("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 52.0d + "'", double32 == 52.0d);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[10.0, 52.0, 1.0]");
    }

    @Test
    public void test00675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00675");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double double6 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.getTtmAvg();
        double double8 = quarterlyDouble4.getQseqQ();
        double[] doubleArray9 = quarterlyDouble4.dArr;
        double double12 = quarterlyDouble4.deltaQ((int) (short) 10, (-1));
        // The following exception was thrown during execution in test generation
        try {
            double double15 = quarterlyDouble4.deltaQ((int) (byte) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test00676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00676");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double[] doubleArray6 = quarterlyDouble5.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray6);
        double double8 = quarterlyDouble7.getMostRecent();
        double double11 = quarterlyDouble7.deltaQ((int) (byte) 100, (int) '4');
        double[] doubleArray12 = quarterlyDouble7.dArr;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = quarterlyDouble7.fmtGrowth1Q("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test00677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00677");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double7 = quarterlyDouble5.get(10);
        double double8 = quarterlyDouble5.getMostRecent();
        double double9 = quarterlyDouble5.getMostRecent();
        double double10 = quarterlyDouble5.getTtmAvg();
        java.lang.Class<?> wildcardClass11 = quarterlyDouble5.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9999.9999d) + "'", double7 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00678");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double7 = quarterlyDouble5.get(10);
        double double8 = quarterlyDouble5.getMostRecent();
        double double10 = quarterlyDouble5.get((int) (byte) -1);
        double double11 = quarterlyDouble5.getTtm();
        double double12 = quarterlyDouble5.getTtmAvg();
        double double13 = quarterlyDouble5.getQseqQ();
        double double14 = quarterlyDouble5.getQseqQ();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = quarterlyDouble5.fmtGrowth1Q("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9999.9999d) + "'", double7 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5100.0d + "'", double13 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 5100.0d + "'", double14 == 5100.0d);
    }

    @Test
    public void test00679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00679");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double[] doubleArray5 = quarterlyDouble4.dArr;
        double double6 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.getQseqQ();
        double double8 = quarterlyDouble4.getTtmAvg();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = quarterlyDouble4.fmtGrowth4Q("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 5100.0d + "'", double7 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test00680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00680");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!", 1, (int) (byte) 1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test00681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00681");
        net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile((int) 'a', (int) 'a');
    }

    @Test
    public void test00682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00682");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray7 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray7);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray7);
        double double10 = quarterlyDouble9.getTtmAvg();
        double double11 = quarterlyDouble9.getQseqQ();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = quarterlyDouble9.deltaQ((int) (byte) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 5100.0d + "'", double11 == 5100.0d);
    }

    @Test
    public void test00683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00683");
        net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile((int) (short) 10, 10);
    }

    @Test
    public void test00684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00684");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double double6 = quarterlyDouble4.getMostRecent();
        double double7 = quarterlyDouble4.getQseqQ();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = quarterlyDouble4.deltaQ((int) (byte) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 5100.0d + "'", double7 == 5100.0d);
    }

    @Test
    public void test00685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00685");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList2, (int) (short) 0, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList7 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList((java.util.List<java.lang.String>) strList2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList8 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList((java.util.List<java.lang.String>) strList2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList11 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList2, 0, (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList12 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList((java.util.List<java.lang.String>) strList2);
        java.lang.Class<?> wildcardClass13 = manyCompanyDataList12.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(companyDataList6);
        org.junit.Assert.assertNotNull(manyCompanyDataList7);
        org.junit.Assert.assertNotNull(manyCompanyDataList8);
        org.junit.Assert.assertNotNull(companyDataList11);
        org.junit.Assert.assertNotNull(manyCompanyDataList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00686");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList1 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, fieldDataArray0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData5 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, 0, (int) 'a');
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData8 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, 0, (int) (short) 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData11 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, (int) (byte) 1, 1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData14 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, 0, (-1));
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData17 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, (int) (short) 10, (int) '4');
        org.junit.Assert.assertNotNull(fieldDataArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(fieldData5);
        org.junit.Assert.assertNull(fieldData8);
        org.junit.Assert.assertNull(fieldData11);
        org.junit.Assert.assertNull(fieldData14);
        org.junit.Assert.assertNull(fieldData17);
    }

    @Test
    public void test00687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00687");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray7 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray7);
        double double9 = quarterlyDouble8.getQseqQ();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = quarterlyDouble8.deltaQ(1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 5100.0d + "'", double9 == 5100.0d);
    }

    @Test
    public void test00688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00688");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("", (int) (short) -1, (int) (short) 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test00689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00689");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!", 100, (int) (short) 10);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test00690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00690");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double double6 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.getTtmAvg();
        double double9 = quarterlyDouble4.get((int) (byte) 100);
        double double11 = quarterlyDouble4.get((int) (short) 1);
        java.lang.Class<?> wildcardClass12 = quarterlyDouble4.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-9999.9999d) + "'", double9 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00691");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double6 = quarterlyDouble4.get((int) (byte) 1);
        double double7 = quarterlyDouble4.getQseqQ();
        double double9 = quarterlyDouble4.get((int) (byte) 1);
        double double12 = quarterlyDouble4.deltaQ((int) (byte) 1, 0);
        double double13 = quarterlyDouble4.getQseqQ();
        double double16 = quarterlyDouble4.deltaQ((int) (short) 100, 1);
        double double17 = quarterlyDouble4.getQseqQ();
        double double20 = quarterlyDouble4.deltaQ((int) (byte) 10, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = quarterlyDouble4.fmtGrowth4Q("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 5100.0d + "'", double17 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test00692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00692");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double7 = quarterlyDouble5.get(10);
        double double8 = quarterlyDouble5.getMostRecent();
        double double10 = quarterlyDouble5.get((int) (byte) -1);
        double double11 = quarterlyDouble5.getTtm();
        double double12 = quarterlyDouble5.getTtmAvg();
        double double13 = quarterlyDouble5.getQseqQ();
        double double14 = quarterlyDouble5.getQseqQ();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = quarterlyDouble5.fmtGrowth4Q("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9999.9999d) + "'", double7 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5100.0d + "'", double13 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 5100.0d + "'", double14 == 5100.0d);
    }

    @Test
    public void test00693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00693");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray9 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray9);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray9);
        double double13 = quarterlyDouble11.get(100);
        double[] doubleArray14 = quarterlyDouble11.dArr;
        quarterlyDouble4.dArr = doubleArray14;
        double double16 = quarterlyDouble4.getQseqQ();
        double[] doubleArray20 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble21 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray20);
        double double23 = quarterlyDouble21.get((int) (byte) 1);
        double double24 = quarterlyDouble21.getQseqQ();
        double[] doubleArray25 = quarterlyDouble21.dArr;
        quarterlyDouble4.dArr = doubleArray25;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = quarterlyDouble4.fmtGrowth4Q("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test00694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00694");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.add(companyFileData0, estimateFileData1, sharesFileData2, incSheetFileData3, balSheetFileData4, cashFileData5, (int) (short) 100, (int) (short) 1);
    }

    @Test
    public void test00695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00695");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double7 = quarterlyDouble5.get(100);
        double double8 = quarterlyDouble5.getTtmAvg();
        double double9 = quarterlyDouble5.getMostRecent();
        double double10 = quarterlyDouble5.getMostRecent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = quarterlyDouble5.fmtGrowth4Q("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test00696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00696");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray10 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray10);
        quarterlyDouble4.dArr = doubleArray10;
        double double13 = quarterlyDouble4.getQseqQ();
        double double14 = quarterlyDouble4.getTtmAvg();
        double double15 = quarterlyDouble4.getTtm();
        double[] doubleArray19 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray19);
        double double21 = quarterlyDouble20.getTtm();
        double double22 = quarterlyDouble20.getQseqQ();
        double[] doubleArray23 = quarterlyDouble20.dArr;
        quarterlyDouble4.dArr = doubleArray23;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble25 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray23);
        double[] doubleArray29 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble30 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray29);
        double double31 = quarterlyDouble30.getTtm();
        double double32 = quarterlyDouble30.getQseqQ();
        double[] doubleArray36 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble37 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray36);
        quarterlyDouble30.dArr = doubleArray36;
        double double39 = quarterlyDouble30.getQseqQ();
        double double42 = quarterlyDouble30.deltaQ((int) (short) 100, (int) (byte) -1);
        double double45 = quarterlyDouble30.deltaQ((int) (byte) 100, 0);
        double double46 = quarterlyDouble30.getTtm();
        double[] doubleArray47 = quarterlyDouble30.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble48 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray47);
        quarterlyDouble25.dArr = doubleArray47;
        double double51 = quarterlyDouble25.get((int) ' ');
        double double53 = quarterlyDouble25.get(100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str55 = quarterlyDouble25.fmtGrowth4Q("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 5100.0d + "'", double32 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 5100.0d + "'", double39 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + (-9999.9999d) + "'", double51 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + (-9999.9999d) + "'", double53 == (-9999.9999d));
    }

    @Test
    public void test00697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00697");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList3, 100, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList10 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList3, (int) (byte) 10, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList13 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList3, (-1), (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList16 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList3, (int) (byte) 10, (int) (short) 10);
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
    public void test00698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00698");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!", (int) (byte) 100, (int) (short) -1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test00699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00699");
        net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile(100, (int) (short) 10);
    }

    @Test
    public void test00700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00700");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray7 = quarterlyDouble4.dArr;
        double double8 = quarterlyDouble4.getQseqQ();
        double[] doubleArray12 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray12);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray12);
        quarterlyDouble4.dArr = doubleArray12;
        double[] doubleArray16 = quarterlyDouble4.dArr;
        double[] doubleArray20 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble21 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray20);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble22 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray20);
        double[] doubleArray23 = quarterlyDouble22.dArr;
        double[] doubleArray27 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble28 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray27);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble29 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray27);
        double double31 = quarterlyDouble29.get(100);
        double[] doubleArray32 = quarterlyDouble29.dArr;
        quarterlyDouble22.dArr = doubleArray32;
        quarterlyDouble4.dArr = doubleArray32;
        // The following exception was thrown during execution in test generation
        try {
            double double35 = quarterlyDouble4.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test00701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00701");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("", (int) (short) -1, (int) 'a');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test00702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00702");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray7 = quarterlyDouble4.dArr;
        double[] doubleArray11 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray11);
        quarterlyDouble4.dArr = doubleArray11;
        double double14 = quarterlyDouble4.getTtm();
        double[] doubleArray15 = quarterlyDouble4.dArr;
        double double16 = quarterlyDouble4.getTtm();
        double[] doubleArray17 = quarterlyDouble4.dArr;
        // The following exception was thrown during execution in test generation
        try {
            double double18 = quarterlyDouble4.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0, 52.0, 1.0]");
    }

    @Test
    public void test00703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00703");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("", (int) (byte) 1, (int) (short) 1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test00704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00704");
        java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers((int) ' ', (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList3 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList(strList2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList5 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList7 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList(strList2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList10 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList2, (int) (short) 1, (int) (byte) 0);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(manyCompanyDataList3);
        org.junit.Assert.assertNotNull(companyDataList4);
        org.junit.Assert.assertNotNull(companyDataList5);
        org.junit.Assert.assertNotNull(companyDataList6);
        org.junit.Assert.assertNotNull(manyCompanyDataList7);
        org.junit.Assert.assertNotNull(companyDataList10);
    }

    @Test
    public void test00705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00705");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!", (int) '#', (int) (short) 100);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test00706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00706");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double[] doubleArray6 = quarterlyDouble5.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray6);
        double double8 = quarterlyDouble7.getMostRecent();
        double double9 = quarterlyDouble7.getMostRecent();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = quarterlyDouble7.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
    }

    @Test
    public void test00707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00707");
        net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile((int) (byte) 0, (int) ' ');
    }

    @Test
    public void test00708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00708");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("", (int) '4', (int) (short) 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test00709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00709");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double6 = quarterlyDouble4.get((int) (byte) 1);
        double double7 = quarterlyDouble4.getQseqQ();
        double double8 = quarterlyDouble4.getQseqQ();
        double double9 = quarterlyDouble4.getTtmAvg();
        double double10 = quarterlyDouble4.getTtm();
        double[] doubleArray11 = quarterlyDouble4.dArr;
        double double13 = quarterlyDouble4.get(1);
        double double15 = quarterlyDouble4.get((int) 'a');
        double double17 = quarterlyDouble4.get((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = quarterlyDouble4.fmtGrowth4Q("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-9999.9999d) + "'", double15 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-9999.9999d) + "'", double17 == (-9999.9999d));
    }

    @Test
    public void test00710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00710");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("", (int) (short) 1, (int) 'a');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test00711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00711");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray7 = quarterlyDouble4.dArr;
        double double8 = quarterlyDouble4.getQseqQ();
        double double9 = quarterlyDouble4.getTtmAvg();
        double double10 = quarterlyDouble4.getTtmAvg();
        java.lang.Class<?> wildcardClass11 = quarterlyDouble4.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 5100.0d + "'", double8 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00712");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double[] doubleArray6 = quarterlyDouble5.dArr;
        double[] doubleArray10 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray10);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray10);
        double double14 = quarterlyDouble12.get(100);
        double[] doubleArray15 = quarterlyDouble12.dArr;
        quarterlyDouble5.dArr = doubleArray15;
        double double17 = quarterlyDouble5.getMostRecent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = quarterlyDouble5.fmtGrowth4Q("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test00713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00713");
        net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile((int) (short) 0, (int) (short) 100);
    }

    @Test
    public void test00714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00714");
        net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile((int) (byte) 10, (int) (byte) -1);
    }

    @Test
    public void test00715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00715");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray7 = quarterlyDouble4.dArr;
        double double8 = quarterlyDouble4.getTtm();
        double[] doubleArray9 = quarterlyDouble4.dArr;
        double[] doubleArray10 = quarterlyDouble4.dArr;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = quarterlyDouble4.fmtGrowth1Q("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 52.0, 1.0]");
    }

    @Test
    public void test00716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00716");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.add(companyFileData0, estimateFileData1, sharesFileData2, incSheetFileData3, balSheetFileData4, cashFileData5, 0, (int) (byte) 1);
    }

    @Test
    public void test00717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00717");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!", (int) 'a', (int) (byte) 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test00718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00718");
        java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers((int) ' ', (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList5 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList2, (int) (byte) 10, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList(strList2);
        java.lang.Class<?> wildcardClass7 = manyCompanyDataList6.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(companyDataList5);
        org.junit.Assert.assertNotNull(manyCompanyDataList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00719");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double7 = quarterlyDouble5.get(10);
        double[] doubleArray11 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray11);
        double double13 = quarterlyDouble12.getTtm();
        double double15 = quarterlyDouble12.get((int) '4');
        double[] doubleArray19 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray19);
        double[] doubleArray21 = quarterlyDouble20.dArr;
        double double22 = quarterlyDouble20.getQseqQ();
        double[] doubleArray23 = new double[] {};
        quarterlyDouble20.dArr = doubleArray23;
        quarterlyDouble12.dArr = doubleArray23;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble26 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray23);
        quarterlyDouble5.dArr = doubleArray23;
        // The following exception was thrown during execution in test generation
        try {
            double double28 = quarterlyDouble5.getQseqQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9999.9999d) + "'", double7 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-9999.9999d) + "'", double15 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 5100.0d + "'", double22 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[]");
    }

    @Test
    public void test00720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00720");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray7 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray7);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray7);
        java.lang.Class<?> wildcardClass10 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00721");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList2, (int) (short) 0, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList7 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList((java.util.List<java.lang.String>) strList2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList8 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList((java.util.List<java.lang.String>) strList2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList11 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList2, 0, (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList14 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList2, 1, (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList17 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList2, (int) (byte) 0, (int) '#');
        java.lang.Class<?> wildcardClass18 = strList2.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(companyDataList6);
        org.junit.Assert.assertNotNull(manyCompanyDataList7);
        org.junit.Assert.assertNotNull(manyCompanyDataList8);
        org.junit.Assert.assertNotNull(companyDataList11);
        org.junit.Assert.assertNotNull(companyDataList14);
        org.junit.Assert.assertNotNull(companyDataList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00722");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList1 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, fieldDataArray0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData5 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, (int) (short) -1, (int) (short) 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData8 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, (int) 'a', 1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData11 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, (int) (short) -1, (int) (byte) -1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData14 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, (int) (short) 10, (int) 'a');
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData17 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, (int) (byte) 0, (int) (byte) 1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData20 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, (int) '#', (int) (short) 10);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData23 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, (int) (byte) 0, (int) '#');
        org.junit.Assert.assertNotNull(fieldDataArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(fieldData5);
        org.junit.Assert.assertNull(fieldData8);
        org.junit.Assert.assertNull(fieldData11);
        org.junit.Assert.assertNull(fieldData14);
        org.junit.Assert.assertNull(fieldData17);
        org.junit.Assert.assertNull(fieldData20);
        org.junit.Assert.assertNull(fieldData23);
    }

    @Test
    public void test00723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00723");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.add(companyFileData0, estimateFileData1, sharesFileData2, incSheetFileData3, balSheetFileData4, cashFileData5, 0, (int) (short) 1);
    }

    @Test
    public void test00724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00724");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!", 0, 100);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test00725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00725");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray10 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray10);
        quarterlyDouble4.dArr = doubleArray10;
        double double13 = quarterlyDouble4.getQseqQ();
        double double14 = quarterlyDouble4.getTtmAvg();
        double double15 = quarterlyDouble4.getTtm();
        double[] doubleArray19 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray19);
        double double21 = quarterlyDouble20.getTtm();
        double double22 = quarterlyDouble20.getQseqQ();
        double[] doubleArray23 = quarterlyDouble20.dArr;
        quarterlyDouble4.dArr = doubleArray23;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble25 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray23);
        double[] doubleArray29 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble30 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray29);
        double double31 = quarterlyDouble30.getTtm();
        double double32 = quarterlyDouble30.getQseqQ();
        double[] doubleArray36 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble37 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray36);
        quarterlyDouble30.dArr = doubleArray36;
        double double39 = quarterlyDouble30.getQseqQ();
        double double42 = quarterlyDouble30.deltaQ((int) (short) 100, (int) (byte) -1);
        double double45 = quarterlyDouble30.deltaQ((int) (byte) 100, 0);
        double double46 = quarterlyDouble30.getTtm();
        double[] doubleArray47 = quarterlyDouble30.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble48 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray47);
        quarterlyDouble25.dArr = doubleArray47;
        double double51 = quarterlyDouble25.get((int) ' ');
        java.lang.Class<?> wildcardClass52 = quarterlyDouble25.getClass();
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
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 5100.0d + "'", double32 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 5100.0d + "'", double39 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + (-9999.9999d) + "'", double51 == (-9999.9999d));
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test00726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00726");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray7 = quarterlyDouble4.dArr;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = quarterlyDouble4.fmtGrowth1Q("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test00727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00727");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.add(companyFileData0, estimateFileData1, sharesFileData2, incSheetFileData3, balSheetFileData4, cashFileData5, 10, (int) (byte) -1);
    }

    @Test
    public void test00728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00728");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("", (int) '4', 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test00729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00729");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double double6 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.getMostRecent();
        double double8 = quarterlyDouble4.getTtmAvg();
        double double9 = quarterlyDouble4.getTtmAvg();
        double double11 = quarterlyDouble4.get((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            double double12 = quarterlyDouble4.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-9999.9999d) + "'", double11 == (-9999.9999d));
    }

    @Test
    public void test00730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00730");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double double7 = quarterlyDouble4.getTtmAvg();
        double double8 = quarterlyDouble4.getTtmAvg();
        java.lang.Class<?> wildcardClass9 = quarterlyDouble4.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00731");
        net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile((int) (short) 0, (int) (byte) 100);
    }

    @Test
    public void test00732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00732");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray7 = quarterlyDouble4.dArr;
        double[] doubleArray11 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray11);
        quarterlyDouble4.dArr = doubleArray11;
        double double14 = quarterlyDouble4.getTtm();
        double[] doubleArray15 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray15);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray15);
        double double19 = quarterlyDouble17.get((int) (byte) 10);
        double double20 = quarterlyDouble17.getQseqQ();
        // The following exception was thrown during execution in test generation
        try {
            double double23 = quarterlyDouble17.deltaQ((int) (byte) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 5100.0d + "'", double20 == 5100.0d);
    }

    @Test
    public void test00733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00733");
        net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile((int) (short) 10, (int) (byte) -1);
    }

    @Test
    public void test00734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00734");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double double6 = quarterlyDouble4.getMostRecent();
        double double8 = quarterlyDouble4.get((int) 'a');
        double double10 = quarterlyDouble4.get((int) (byte) -1);
        double[] doubleArray14 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray14);
        double double16 = quarterlyDouble15.getTtm();
        double double17 = quarterlyDouble15.getQseqQ();
        double[] doubleArray18 = quarterlyDouble15.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray18);
        quarterlyDouble4.dArr = doubleArray18;
        double double21 = quarterlyDouble4.getMostRecent();
        double[] doubleArray25 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble26 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray25);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble27 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray25);
        double double29 = quarterlyDouble27.get(10);
        double double30 = quarterlyDouble27.getMostRecent();
        double[] doubleArray31 = quarterlyDouble27.dArr;
        quarterlyDouble4.dArr = doubleArray31;
        double double33 = quarterlyDouble4.getMostRecent();
        double double36 = quarterlyDouble4.deltaQ((int) (short) -1, (int) (short) 0);
        double[] doubleArray40 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble41 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray40);
        double double42 = quarterlyDouble41.getTtm();
        double double44 = quarterlyDouble41.get((int) '4');
        double[] doubleArray48 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble49 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray48);
        double[] doubleArray50 = quarterlyDouble49.dArr;
        double double51 = quarterlyDouble49.getQseqQ();
        double[] doubleArray52 = new double[] {};
        quarterlyDouble49.dArr = doubleArray52;
        quarterlyDouble41.dArr = doubleArray52;
        double[] doubleArray55 = quarterlyDouble41.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble56 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray55);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble57 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray55);
        double[] doubleArray61 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble62 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray61);
        double double63 = quarterlyDouble62.getTtm();
        double double64 = quarterlyDouble62.getQseqQ();
        double[] doubleArray68 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble69 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray68);
        quarterlyDouble62.dArr = doubleArray68;
        double double71 = quarterlyDouble62.getQseqQ();
        double double74 = quarterlyDouble62.deltaQ((int) (short) 100, (int) (byte) -1);
        double[] doubleArray78 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble79 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray78);
        double double80 = quarterlyDouble79.getTtmAvg();
        double double81 = quarterlyDouble79.getMostRecent();
        double double83 = quarterlyDouble79.get((int) 'a');
        double double85 = quarterlyDouble79.get((int) (byte) -1);
        double[] doubleArray89 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble90 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray89);
        double double91 = quarterlyDouble90.getTtm();
        double double92 = quarterlyDouble90.getQseqQ();
        double[] doubleArray93 = quarterlyDouble90.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble94 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray93);
        quarterlyDouble79.dArr = doubleArray93;
        quarterlyDouble62.dArr = doubleArray93;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble97 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray93);
        quarterlyDouble57.dArr = doubleArray93;
        quarterlyDouble4.dArr = doubleArray93;
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
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 52.0d + "'", double33 == 52.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + (-9999.9999d) + "'", double44 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 5100.0d + "'", double51 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.0d + "'", double63 == 0.0d);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 5100.0d + "'", double64 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 5100.0d + "'", double71 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 0.0d + "'", double74 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 0.0d + "'", double80 == 0.0d);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 52.0d + "'", double81 == 52.0d);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + (-9999.9999d) + "'", double83 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + (-9999.9999d) + "'", double85 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray89), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 0.0d + "'", double91 == 0.0d);
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 5100.0d + "'", double92 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray93);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray93), "[10.0, 52.0, 1.0]");
    }

    @Test
    public void test00735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00735");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray10 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray10);
        quarterlyDouble4.dArr = doubleArray10;
        double double13 = quarterlyDouble4.getQseqQ();
        double double14 = quarterlyDouble4.getTtmAvg();
        double double17 = quarterlyDouble4.deltaQ((int) (byte) -1, (int) (byte) -1);
        java.lang.Class<?> wildcardClass18 = quarterlyDouble4.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5100.0d + "'", double13 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00736");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.add(companyFileData0, estimateFileData1, sharesFileData2, incSheetFileData3, balSheetFileData4, cashFileData5, (int) 'a', (int) (short) 1);
    }

    @Test
    public void test00737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00737");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double double6 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.getTtmAvg();
        double double9 = quarterlyDouble4.get((int) ' ');
        double double10 = quarterlyDouble4.getMostRecent();
        double double12 = quarterlyDouble4.get(10);
        double double15 = quarterlyDouble4.deltaQ(10, (int) (short) -1);
        double double16 = quarterlyDouble4.getMostRecent();
        double double17 = quarterlyDouble4.getTtmAvg();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = quarterlyDouble4.fmtGrowth1Q("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 52.0d + "'", double16 == 52.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test00738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00738");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.add(companyFileData0, estimateFileData1, sharesFileData2, incSheetFileData3, balSheetFileData4, cashFileData5, (int) (byte) 100, (int) ' ');
    }

    @Test
    public void test00739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00739");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray7 = quarterlyDouble4.dArr;
        double double8 = quarterlyDouble4.getQseqQ();
        double[] doubleArray12 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray12);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray12);
        quarterlyDouble4.dArr = doubleArray12;
        double[] doubleArray16 = quarterlyDouble4.dArr;
        double double17 = quarterlyDouble4.getTtmAvg();
        double double18 = quarterlyDouble4.getTtmAvg();
        // The following exception was thrown during execution in test generation
        try {
            double double19 = quarterlyDouble4.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test00740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00740");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.add(companyFileData0, estimateFileData1, sharesFileData2, incSheetFileData3, balSheetFileData4, cashFileData5, (int) (short) 0, (int) (short) 0);
    }

    @Test
    public void test00741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00741");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("", (int) (byte) 100, (int) (short) 1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test00742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00742");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double double6 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.getTtmAvg();
        double double9 = quarterlyDouble4.get((int) (byte) 100);
        double[] doubleArray10 = quarterlyDouble4.dArr;
        double double11 = quarterlyDouble4.getQseqQ();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = quarterlyDouble4.fmtGrowth1Q("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 5100.0d + "'", double11 == 5100.0d);
    }

    @Test
    public void test00743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00743");
        net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile((int) (byte) 100, (int) (short) 10);
    }

    @Test
    public void test00744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00744");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray7 = quarterlyDouble4.dArr;
        double[] doubleArray11 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray11);
        quarterlyDouble4.dArr = doubleArray11;
        double double14 = quarterlyDouble4.getTtm();
        double[] doubleArray15 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray15);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray15);
        double double19 = quarterlyDouble17.get((int) (byte) 10);
        double double22 = quarterlyDouble17.deltaQ((int) '#', 100);
        // The following exception was thrown during execution in test generation
        try {
            double double25 = quarterlyDouble17.deltaQ((int) (short) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    }

    @Test
    public void test00745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00745");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray7 = quarterlyDouble4.dArr;
        double double8 = quarterlyDouble4.getQseqQ();
        double[] doubleArray12 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray12);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray12);
        quarterlyDouble4.dArr = doubleArray12;
        double[] doubleArray16 = quarterlyDouble4.dArr;
        double[] doubleArray20 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble21 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray20);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble22 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray20);
        double[] doubleArray23 = quarterlyDouble22.dArr;
        double[] doubleArray27 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble28 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray27);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble29 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray27);
        double double31 = quarterlyDouble29.get(100);
        double[] doubleArray32 = quarterlyDouble29.dArr;
        quarterlyDouble22.dArr = doubleArray32;
        quarterlyDouble4.dArr = doubleArray32;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble35 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray32);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble36 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray32);
        double[] doubleArray40 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble41 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray40);
        double double42 = quarterlyDouble41.getTtm();
        double double43 = quarterlyDouble41.getQseqQ();
        double[] doubleArray44 = quarterlyDouble41.dArr;
        double double45 = quarterlyDouble41.getQseqQ();
        double[] doubleArray49 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble50 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray49);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble51 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray49);
        quarterlyDouble41.dArr = doubleArray49;
        double[] doubleArray56 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble57 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray56);
        double[] doubleArray58 = quarterlyDouble57.dArr;
        double[] doubleArray59 = quarterlyDouble57.dArr;
        quarterlyDouble41.dArr = doubleArray59;
        double double61 = quarterlyDouble41.getQseqQ();
        double double62 = quarterlyDouble41.getTtm();
        double[] doubleArray63 = quarterlyDouble41.dArr;
        quarterlyDouble36.dArr = doubleArray63;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str66 = quarterlyDouble36.fmtGrowth4Q("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 5100.0d + "'", double43 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 5100.0d + "'", double45 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 5100.0d + "'", double61 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.0d + "'", double62 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[10.0, 52.0, 1.0]");
    }

    @Test
    public void test00746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00746");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray10 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray10);
        quarterlyDouble4.dArr = doubleArray10;
        double double13 = quarterlyDouble4.getQseqQ();
        double double16 = quarterlyDouble4.deltaQ((int) (short) 100, (int) (byte) -1);
        double double19 = quarterlyDouble4.deltaQ((int) (byte) 100, 0);
        double[] doubleArray23 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble24 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray23);
        double double25 = quarterlyDouble24.getTtm();
        double double26 = quarterlyDouble24.getQseqQ();
        double[] doubleArray30 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble31 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray30);
        quarterlyDouble24.dArr = doubleArray30;
        double double33 = quarterlyDouble24.getQseqQ();
        double double36 = quarterlyDouble24.deltaQ((int) (short) 100, (int) (byte) -1);
        double double39 = quarterlyDouble24.deltaQ((int) (byte) 100, 0);
        double[] doubleArray40 = quarterlyDouble24.dArr;
        quarterlyDouble4.dArr = doubleArray40;
        double double44 = quarterlyDouble4.deltaQ(100, (int) (byte) 1);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5100.0d + "'", double13 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 5100.0d + "'", double26 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 5100.0d + "'", double33 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
    }

    @Test
    public void test00747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00747");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double double6 = quarterlyDouble4.getMostRecent();
        double double8 = quarterlyDouble4.get((int) 'a');
        double double9 = quarterlyDouble4.getTtm();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = quarterlyDouble4.fmtGrowth1Q("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-9999.9999d) + "'", double8 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test00748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00748");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double[] doubleArray9 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray9);
        double double12 = quarterlyDouble10.get((int) (byte) 1);
        double double13 = quarterlyDouble10.getQseqQ();
        double[] doubleArray14 = quarterlyDouble10.dArr;
        quarterlyDouble5.dArr = doubleArray14;
        java.lang.Class<?> wildcardClass16 = quarterlyDouble5.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5100.0d + "'", double13 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00749");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double[] doubleArray6 = quarterlyDouble5.dArr;
        double[] doubleArray10 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray10);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray10);
        double double14 = quarterlyDouble12.get(100);
        double[] doubleArray15 = quarterlyDouble12.dArr;
        quarterlyDouble5.dArr = doubleArray15;
        double[] doubleArray20 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble21 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray20);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble22 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray20);
        double double24 = quarterlyDouble22.get(100);
        double[] doubleArray25 = quarterlyDouble22.dArr;
        quarterlyDouble5.dArr = doubleArray25;
        double double29 = quarterlyDouble5.deltaQ((int) (short) 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double30 = quarterlyDouble5.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-9999.9999d) + "'", double24 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
    }

    @Test
    public void test00750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00750");
        net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile((int) (short) -1, (int) (short) 100);
    }

    @Test
    public void test00751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00751");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!", 1, 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test00752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00752");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double double6 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.getMostRecent();
        double double8 = quarterlyDouble4.getTtmAvg();
        double double9 = quarterlyDouble4.getQseqQ();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = quarterlyDouble4.fmtGrowth4Q("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test00753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00753");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray9 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray9);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray9);
        double double13 = quarterlyDouble11.get(100);
        double[] doubleArray14 = quarterlyDouble11.dArr;
        quarterlyDouble4.dArr = doubleArray14;
        double double16 = quarterlyDouble4.getQseqQ();
        double[] doubleArray20 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble21 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray20);
        double double23 = quarterlyDouble21.get((int) (byte) 1);
        double double24 = quarterlyDouble21.getQseqQ();
        double[] doubleArray25 = quarterlyDouble21.dArr;
        quarterlyDouble4.dArr = doubleArray25;
        double double27 = quarterlyDouble4.getTtmAvg();
        double double28 = quarterlyDouble4.getQseqQ();
        java.lang.Class<?> wildcardClass29 = quarterlyDouble4.getClass();
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
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 5100.0d + "'", double28 == 5100.0d);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test00754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00754");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!", (int) '4', (int) (short) 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test00755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00755");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.add(companyFileData0, estimateFileData1, sharesFileData2, incSheetFileData3, balSheetFileData4, cashFileData5, (int) '#', (int) (byte) 100);
    }

    @Test
    public void test00756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00756");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double[] doubleArray5 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray5);
        double double7 = quarterlyDouble6.getTtm();
        double double8 = quarterlyDouble6.getQseqQ();
        double[] doubleArray9 = quarterlyDouble6.dArr;
        double[] doubleArray13 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray13);
        quarterlyDouble6.dArr = doubleArray13;
        double[] doubleArray16 = quarterlyDouble6.dArr;
        quarterlyDouble1.dArr = doubleArray16;
        double[] doubleArray18 = quarterlyDouble1.dArr;
        double double19 = quarterlyDouble1.getMostRecent();
        double[] doubleArray20 = quarterlyDouble1.dArr;
        double[] doubleArray24 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble25 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray24);
        double[] doubleArray26 = quarterlyDouble25.dArr;
        double double27 = quarterlyDouble25.getTtm();
        double[] doubleArray31 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble32 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray31);
        double double33 = quarterlyDouble32.getTtm();
        double double35 = quarterlyDouble32.get((int) '4');
        double[] doubleArray39 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble40 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray39);
        double[] doubleArray41 = quarterlyDouble40.dArr;
        double double42 = quarterlyDouble40.getQseqQ();
        double[] doubleArray43 = new double[] {};
        quarterlyDouble40.dArr = doubleArray43;
        quarterlyDouble32.dArr = doubleArray43;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble46 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray43);
        double[] doubleArray50 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble51 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray50);
        double double52 = quarterlyDouble51.getTtm();
        double double54 = quarterlyDouble51.get((int) '4');
        double[] doubleArray58 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble59 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray58);
        double[] doubleArray60 = quarterlyDouble59.dArr;
        double double61 = quarterlyDouble59.getQseqQ();
        double[] doubleArray62 = new double[] {};
        quarterlyDouble59.dArr = doubleArray62;
        quarterlyDouble51.dArr = doubleArray62;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble65 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray62);
        quarterlyDouble46.dArr = doubleArray62;
        double[] doubleArray67 = quarterlyDouble46.dArr;
        quarterlyDouble25.dArr = doubleArray67;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble69 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray67);
        quarterlyDouble1.dArr = doubleArray67;
        // The following exception was thrown during execution in test generation
        try {
            double double71 = quarterlyDouble1.getQseqQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 5100.0d + "'", double8 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 52.0d + "'", double19 == 52.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-9999.9999d) + "'", double35 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 5100.0d + "'", double42 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[]");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + (-9999.9999d) + "'", double54 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 5100.0d + "'", double61 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[]");
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[]");
    }

    @Test
    public void test00757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00757");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double[] doubleArray9 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray9);
        double double11 = quarterlyDouble10.getTtm();
        double double13 = quarterlyDouble10.get((int) '4');
        double double16 = quarterlyDouble10.deltaQ((int) (short) 1, 0);
        double[] doubleArray20 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble21 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray20);
        double double22 = quarterlyDouble21.getTtm();
        double double23 = quarterlyDouble21.getQseqQ();
        double[] doubleArray24 = quarterlyDouble21.dArr;
        quarterlyDouble10.dArr = doubleArray24;
        quarterlyDouble5.dArr = doubleArray24;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble27 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = quarterlyDouble27.fmtGrowth1Q("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-9999.9999d) + "'", double13 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 5100.0d + "'", double23 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[10.0, 52.0, 1.0]");
    }

    @Test
    public void test00758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00758");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!", (int) (byte) 100, (int) (byte) 10);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test00759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00759");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.add(companyFileData0, estimateFileData1, sharesFileData2, incSheetFileData3, balSheetFileData4, cashFileData5, (int) 'a', (-1));
    }

    @Test
    public void test00760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00760");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double6 = quarterlyDouble4.get((int) (byte) 1);
        double double7 = quarterlyDouble4.getQseqQ();
        double double9 = quarterlyDouble4.get((int) (byte) 1);
        double double12 = quarterlyDouble4.deltaQ((int) (byte) 1, 0);
        double double13 = quarterlyDouble4.getQseqQ();
        double double16 = quarterlyDouble4.deltaQ((int) (short) 100, 1);
        double double17 = quarterlyDouble4.getQseqQ();
        double double19 = quarterlyDouble4.get(1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = quarterlyDouble4.fmtGrowth4Q("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 5100.0d + "'", double17 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 52.0d + "'", double19 == 52.0d);
    }

    @Test
    public void test00761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00761");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double7 = quarterlyDouble5.get(100);
        double double8 = quarterlyDouble5.getMostRecent();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = quarterlyDouble5.deltaQ(0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9999.9999d) + "'", double7 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
    }

    @Test
    public void test00762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00762");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) '4');
        double[] doubleArray11 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray11);
        double[] doubleArray13 = quarterlyDouble12.dArr;
        double double14 = quarterlyDouble12.getQseqQ();
        double[] doubleArray15 = new double[] {};
        quarterlyDouble12.dArr = doubleArray15;
        quarterlyDouble4.dArr = doubleArray15;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray15);
        double[] doubleArray22 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble23 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray22);
        double double24 = quarterlyDouble23.getTtm();
        double double26 = quarterlyDouble23.get((int) '4');
        double[] doubleArray30 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble31 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray30);
        double[] doubleArray32 = quarterlyDouble31.dArr;
        double double33 = quarterlyDouble31.getQseqQ();
        double[] doubleArray34 = new double[] {};
        quarterlyDouble31.dArr = doubleArray34;
        quarterlyDouble23.dArr = doubleArray34;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble37 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray34);
        quarterlyDouble18.dArr = doubleArray34;
        double[] doubleArray39 = quarterlyDouble18.dArr;
        java.lang.Class<?> wildcardClass40 = doubleArray39.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test00763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00763");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) '4');
        double[] doubleArray11 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray11);
        double[] doubleArray13 = quarterlyDouble12.dArr;
        double double14 = quarterlyDouble12.getQseqQ();
        double[] doubleArray15 = new double[] {};
        quarterlyDouble12.dArr = doubleArray15;
        quarterlyDouble4.dArr = doubleArray15;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray15);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = quarterlyDouble18.getMostRecent();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test00764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00764");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!", 10, (int) ' ');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test00765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00765");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!", (int) ' ', (int) (byte) 100);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test00766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00766");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray10 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray10);
        quarterlyDouble4.dArr = doubleArray10;
        double double13 = quarterlyDouble4.getQseqQ();
        double double16 = quarterlyDouble4.deltaQ((int) (short) 100, (int) (byte) -1);
        double[] doubleArray20 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble21 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray20);
        double double22 = quarterlyDouble21.getTtmAvg();
        double double23 = quarterlyDouble21.getMostRecent();
        double double25 = quarterlyDouble21.get((int) 'a');
        double double27 = quarterlyDouble21.get((int) (byte) -1);
        double[] doubleArray31 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble32 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray31);
        double double33 = quarterlyDouble32.getTtm();
        double double34 = quarterlyDouble32.getQseqQ();
        double[] doubleArray35 = quarterlyDouble32.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble36 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray35);
        quarterlyDouble21.dArr = doubleArray35;
        quarterlyDouble4.dArr = doubleArray35;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble39 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray35);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str41 = quarterlyDouble39.fmtGrowth4Q("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test00767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00767");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double double6 = quarterlyDouble4.getMostRecent();
        double double8 = quarterlyDouble4.get((int) 'a');
        double double10 = quarterlyDouble4.get((int) (byte) -1);
        double[] doubleArray14 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray14);
        double double16 = quarterlyDouble15.getTtm();
        double double17 = quarterlyDouble15.getQseqQ();
        double[] doubleArray18 = quarterlyDouble15.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray18);
        quarterlyDouble4.dArr = doubleArray18;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble21 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray18);
        double double22 = quarterlyDouble21.getMostRecent();
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
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 52.0d + "'", double22 == 52.0d);
    }

    @Test
    public void test00768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00768");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.add(companyFileData0, estimateFileData1, sharesFileData2, incSheetFileData3, balSheetFileData4, cashFileData5, (-1), (int) (short) 10);
    }

    @Test
    public void test00769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00769");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double double6 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.getTtm();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = quarterlyDouble4.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test00770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00770");
        net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile((int) '#', (int) (byte) 0);
    }

    @Test
    public void test00771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00771");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray7 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray7);
        double double9 = quarterlyDouble8.getTtm();
        double[] doubleArray13 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray13);
        double double15 = quarterlyDouble14.getTtm();
        double double17 = quarterlyDouble14.get((int) '4');
        double[] doubleArray21 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble22 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray21);
        double[] doubleArray23 = quarterlyDouble22.dArr;
        double double24 = quarterlyDouble22.getQseqQ();
        double[] doubleArray25 = new double[] {};
        quarterlyDouble22.dArr = doubleArray25;
        quarterlyDouble14.dArr = doubleArray25;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble28 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray25);
        double[] doubleArray32 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble33 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray32);
        double double34 = quarterlyDouble33.getTtm();
        double double36 = quarterlyDouble33.get((int) '4');
        double[] doubleArray40 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble41 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray40);
        double[] doubleArray42 = quarterlyDouble41.dArr;
        double double43 = quarterlyDouble41.getQseqQ();
        double[] doubleArray44 = new double[] {};
        quarterlyDouble41.dArr = doubleArray44;
        quarterlyDouble33.dArr = doubleArray44;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble47 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray44);
        quarterlyDouble28.dArr = doubleArray44;
        quarterlyDouble8.dArr = doubleArray44;
        double[] doubleArray53 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble54 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray53);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble55 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray53);
        double[] doubleArray56 = quarterlyDouble55.dArr;
        double[] doubleArray60 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble61 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray60);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble62 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray60);
        double double64 = quarterlyDouble62.get(100);
        double[] doubleArray65 = quarterlyDouble62.dArr;
        quarterlyDouble55.dArr = doubleArray65;
        double double67 = quarterlyDouble55.getTtmAvg();
        double double68 = quarterlyDouble55.getQseqQ();
        double[] doubleArray69 = quarterlyDouble55.dArr;
        quarterlyDouble8.dArr = doubleArray69;
        double double71 = quarterlyDouble8.getQseqQ();
        // The following exception was thrown during execution in test generation
        try {
            double double72 = quarterlyDouble8.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + (-9999.9999d) + "'", double64 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 0.0d + "'", double67 == 0.0d);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 5100.0d + "'", double68 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 5100.0d + "'", double71 == 5100.0d);
    }

    @Test
    public void test00772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00772");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray7 = quarterlyDouble4.dArr;
        double[] doubleArray11 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray11);
        quarterlyDouble4.dArr = doubleArray11;
        double double14 = quarterlyDouble4.getTtm();
        double[] doubleArray15 = quarterlyDouble4.dArr;
        double double16 = quarterlyDouble4.getTtm();
        double[] doubleArray17 = quarterlyDouble4.dArr;
        double[] doubleArray21 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble22 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray21);
        double double24 = quarterlyDouble22.get((int) (byte) 1);
        double[] doubleArray28 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble29 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray28);
        double double30 = quarterlyDouble29.getTtm();
        double double31 = quarterlyDouble29.getQseqQ();
        double[] doubleArray32 = quarterlyDouble29.dArr;
        double[] doubleArray36 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble37 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray36);
        quarterlyDouble29.dArr = doubleArray36;
        double double39 = quarterlyDouble29.getTtm();
        double[] doubleArray40 = quarterlyDouble29.dArr;
        double double41 = quarterlyDouble29.getTtm();
        double[] doubleArray42 = quarterlyDouble29.dArr;
        quarterlyDouble22.dArr = doubleArray42;
        quarterlyDouble4.dArr = doubleArray42;
        java.lang.Class<?> wildcardClass45 = quarterlyDouble4.getClass();
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
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 52.0d + "'", double24 == 52.0d);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 5100.0d + "'", double31 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test00773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00773");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!", (int) (byte) 0, (int) '#');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test00774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00774");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) '4');
        double double10 = quarterlyDouble4.deltaQ((int) (short) 1, 0);
        double[] doubleArray14 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray14);
        double double16 = quarterlyDouble15.getTtm();
        double double17 = quarterlyDouble15.getQseqQ();
        double[] doubleArray18 = quarterlyDouble15.dArr;
        quarterlyDouble4.dArr = doubleArray18;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = quarterlyDouble4.fmtGrowth1Q("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test00775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00775");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray10 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray10);
        quarterlyDouble4.dArr = doubleArray10;
        double double13 = quarterlyDouble4.getQseqQ();
        double double14 = quarterlyDouble4.getTtmAvg();
        double double15 = quarterlyDouble4.getTtm();
        double[] doubleArray19 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray19);
        double double21 = quarterlyDouble20.getTtm();
        double double22 = quarterlyDouble20.getQseqQ();
        double[] doubleArray23 = quarterlyDouble20.dArr;
        quarterlyDouble4.dArr = doubleArray23;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble25 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray23);
        double[] doubleArray29 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble30 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray29);
        double double31 = quarterlyDouble30.getTtm();
        double double32 = quarterlyDouble30.getQseqQ();
        double[] doubleArray36 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble37 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray36);
        quarterlyDouble30.dArr = doubleArray36;
        double double39 = quarterlyDouble30.getQseqQ();
        double double42 = quarterlyDouble30.deltaQ((int) (short) 100, (int) (byte) -1);
        double double45 = quarterlyDouble30.deltaQ((int) (byte) 100, 0);
        double double46 = quarterlyDouble30.getTtm();
        double[] doubleArray47 = quarterlyDouble30.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble48 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray47);
        quarterlyDouble25.dArr = doubleArray47;
        double double51 = quarterlyDouble25.get((int) ' ');
        double double52 = quarterlyDouble25.getMostRecent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str54 = quarterlyDouble25.fmtGrowth1Q("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 5100.0d + "'", double32 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 5100.0d + "'", double39 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + (-9999.9999d) + "'", double51 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 52.0d + "'", double52 == 52.0d);
    }

    @Test
    public void test00776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00776");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList0, (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00777");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!", (int) '4', (int) (byte) 10);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test00778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00778");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("", (int) (short) 0, (int) '#');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test00779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00779");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("", (int) (short) -1, (int) '#');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test00780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00780");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double7 = quarterlyDouble5.get(100);
        double[] doubleArray8 = quarterlyDouble5.dArr;
        double double11 = quarterlyDouble5.deltaQ((int) (short) 1, (-1));
        double double14 = quarterlyDouble5.deltaQ((int) 'a', 1);
        double double15 = quarterlyDouble5.getTtm();
        double double16 = quarterlyDouble5.getTtm();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = quarterlyDouble5.fmtGrowth1Q("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9999.9999d) + "'", double7 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test00781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00781");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.add(companyFileData0, estimateFileData1, sharesFileData2, incSheetFileData3, balSheetFileData4, cashFileData5, (int) (short) 1, (int) (short) 100);
    }

    @Test
    public void test00782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00782");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray10 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray10);
        quarterlyDouble4.dArr = doubleArray10;
        double double13 = quarterlyDouble4.getQseqQ();
        double double16 = quarterlyDouble4.deltaQ((int) (short) 100, (int) (byte) -1);
        double[] doubleArray17 = quarterlyDouble4.dArr;
        // The following exception was thrown during execution in test generation
        try {
            double double18 = quarterlyDouble4.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test00783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00783");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!", (int) 'a', (int) '4');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test00784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00784");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList1 = net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.readBinaryFile("hi!");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList1, (int) (byte) 0, (int) '#');
        org.junit.Assert.assertNotNull(fieldDataList1);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test00785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00785");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("", (int) (byte) 10, 100);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test00786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00786");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.add(companyFileData0, estimateFileData1, sharesFileData2, incSheetFileData3, balSheetFileData4, cashFileData5, (int) (short) 10, (int) (byte) 0);
    }

    @Test
    public void test00787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00787");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) '4');
        double[] doubleArray11 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray11);
        double[] doubleArray13 = quarterlyDouble12.dArr;
        double double14 = quarterlyDouble12.getQseqQ();
        double[] doubleArray15 = new double[] {};
        quarterlyDouble12.dArr = doubleArray15;
        quarterlyDouble4.dArr = doubleArray15;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray15);
        double[] doubleArray22 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble23 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray22);
        double double24 = quarterlyDouble23.getTtm();
        double double26 = quarterlyDouble23.get((int) '4');
        double[] doubleArray30 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble31 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray30);
        double[] doubleArray32 = quarterlyDouble31.dArr;
        double double33 = quarterlyDouble31.getQseqQ();
        double[] doubleArray34 = new double[] {};
        quarterlyDouble31.dArr = doubleArray34;
        quarterlyDouble23.dArr = doubleArray34;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble37 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray34);
        quarterlyDouble18.dArr = doubleArray34;
        double[] doubleArray42 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble43 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray42);
        double[] doubleArray44 = quarterlyDouble43.dArr;
        double[] doubleArray45 = quarterlyDouble43.dArr;
        quarterlyDouble18.dArr = doubleArray45;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble47 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray45);
        double double49 = quarterlyDouble47.get(10);
        // The following exception was thrown during execution in test generation
        try {
            double double50 = quarterlyDouble47.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + (-9999.9999d) + "'", double49 == (-9999.9999d));
    }

    @Test
    public void test00788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00788");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double double7 = quarterlyDouble4.getTtm();
        double[] doubleArray8 = null;
        quarterlyDouble4.dArr = doubleArray8;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = quarterlyDouble4.deltaQ((int) (short) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test00789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00789");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray10 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray10);
        quarterlyDouble4.dArr = doubleArray10;
        double double13 = quarterlyDouble4.getQseqQ();
        double double14 = quarterlyDouble4.getTtmAvg();
        double double15 = quarterlyDouble4.getTtm();
        double double16 = quarterlyDouble4.getTtm();
        double double18 = quarterlyDouble4.get(1);
        double double19 = quarterlyDouble4.getQseqQ();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = quarterlyDouble4.fmtGrowth1Q("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 52.0d + "'", double18 == 52.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 5100.0d + "'", double19 == 5100.0d);
    }

    @Test
    public void test00790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00790");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double double6 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.getTtmAvg();
        double double9 = quarterlyDouble4.get((int) (byte) 100);
        double double11 = quarterlyDouble4.get((int) (short) 1);
        double double12 = quarterlyDouble4.getQseqQ();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = quarterlyDouble4.fmtGrowth1Q("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-9999.9999d) + "'", double9 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 5100.0d + "'", double12 == 5100.0d);
    }

    @Test
    public void test00791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00791");
        net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile((int) ' ', (int) (byte) 100);
    }

    @Test
    public void test00792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00792");
        net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile((int) (short) 1, (int) (byte) 0);
    }

    @Test
    public void test00793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00793");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double7 = quarterlyDouble5.get(100);
        double[] doubleArray8 = quarterlyDouble5.dArr;
        double double11 = quarterlyDouble5.deltaQ((int) '4', (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = quarterlyDouble5.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9999.9999d) + "'", double7 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test00794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00794");
        net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile((-1), 100);
    }

    @Test
    public void test00795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00795");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double6 = quarterlyDouble5.getTtmAvg();
        double double7 = quarterlyDouble5.getTtm();
        double double8 = quarterlyDouble5.getTtmAvg();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = quarterlyDouble5.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test00796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00796");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray10 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray10);
        quarterlyDouble4.dArr = doubleArray10;
        double double13 = quarterlyDouble4.getQseqQ();
        double double16 = quarterlyDouble4.deltaQ((int) (short) 100, (int) (byte) -1);
        double double19 = quarterlyDouble4.deltaQ((int) (byte) 100, 0);
        double double20 = quarterlyDouble4.getTtm();
        double[] doubleArray21 = quarterlyDouble4.dArr;
        java.lang.Class<?> wildcardClass22 = doubleArray21.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5100.0d + "'", double13 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00797");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double double6 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.getMostRecent();
        double double8 = quarterlyDouble4.getTtmAvg();
        double double9 = quarterlyDouble4.getMostRecent();
        double[] doubleArray13 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray13);
        double[] doubleArray15 = quarterlyDouble14.dArr;
        double[] doubleArray16 = quarterlyDouble14.dArr;
        double[] doubleArray20 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble21 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray20);
        double double22 = quarterlyDouble21.getTtm();
        double double23 = quarterlyDouble21.getQseqQ();
        double[] doubleArray24 = quarterlyDouble21.dArr;
        double double25 = quarterlyDouble21.getQseqQ();
        double[] doubleArray29 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble30 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray29);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble31 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray29);
        quarterlyDouble21.dArr = doubleArray29;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble33 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray29);
        quarterlyDouble14.dArr = doubleArray29;
        quarterlyDouble4.dArr = doubleArray29;
        double[] doubleArray39 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble40 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray39);
        double double41 = quarterlyDouble40.getTtm();
        double double42 = quarterlyDouble40.getQseqQ();
        double[] doubleArray43 = quarterlyDouble40.dArr;
        double double44 = quarterlyDouble40.getQseqQ();
        double[] doubleArray48 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble49 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray48);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble50 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray48);
        quarterlyDouble40.dArr = doubleArray48;
        double[] doubleArray55 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble56 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray55);
        double[] doubleArray57 = quarterlyDouble56.dArr;
        double[] doubleArray58 = quarterlyDouble56.dArr;
        quarterlyDouble40.dArr = doubleArray58;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble60 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray58);
        double[] doubleArray61 = quarterlyDouble60.dArr;
        quarterlyDouble4.dArr = doubleArray61;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str64 = quarterlyDouble4.fmtGrowth1Q("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 5100.0d + "'", double23 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 5100.0d + "'", double25 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 5100.0d + "'", double42 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 5100.0d + "'", double44 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[10.0, 52.0, 1.0]");
    }

    @Test
    public void test00798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00798");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double[] doubleArray8 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray8);
        double double10 = quarterlyDouble9.getTtm();
        double double11 = quarterlyDouble9.getQseqQ();
        double[] doubleArray12 = quarterlyDouble9.dArr;
        double double13 = quarterlyDouble9.getQseqQ();
        double[] doubleArray17 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray17);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray17);
        quarterlyDouble9.dArr = doubleArray17;
        double[] doubleArray21 = quarterlyDouble9.dArr;
        double[] doubleArray25 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble26 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray25);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble27 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray25);
        double[] doubleArray28 = quarterlyDouble27.dArr;
        double[] doubleArray32 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble33 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray32);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble34 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray32);
        double double36 = quarterlyDouble34.get(100);
        double[] doubleArray37 = quarterlyDouble34.dArr;
        quarterlyDouble27.dArr = doubleArray37;
        quarterlyDouble9.dArr = doubleArray37;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble40 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray37);
        quarterlyDouble4.dArr = doubleArray37;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble42 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray37);
        // The following exception was thrown during execution in test generation
        try {
            double double43 = quarterlyDouble42.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 5100.0d + "'", double11 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5100.0d + "'", double13 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + (-9999.9999d) + "'", double36 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[10.0, 52.0, 1.0]");
    }

    @Test
    public void test00799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00799");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray7 = quarterlyDouble4.dArr;
        double double8 = quarterlyDouble4.getQseqQ();
        double[] doubleArray12 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray12);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray12);
        quarterlyDouble4.dArr = doubleArray12;
        // The following exception was thrown during execution in test generation
        try {
            double double18 = quarterlyDouble4.deltaQ((int) (byte) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    }

    @Test
    public void test00800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00800");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList5 = companyData1.getFdList();
        java.lang.String str6 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = companyData1.getFdList();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData10 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList7, (int) (byte) 100, (int) (short) 100);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData13 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList7, (int) (byte) 10, 100);
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNotNull(fieldDataList3);
        org.junit.Assert.assertNotNull(fieldDataList4);
        org.junit.Assert.assertNotNull(fieldDataList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(fieldDataList7);
        org.junit.Assert.assertNull(fieldData10);
        org.junit.Assert.assertNull(fieldData13);
    }

    @Test
    public void test00801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00801");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!", (int) (short) 0, (int) (byte) 100);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test00802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00802");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!", 1, (-1));
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test00803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00803");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray10 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray10);
        quarterlyDouble4.dArr = doubleArray10;
        double double13 = quarterlyDouble4.getQseqQ();
        double double14 = quarterlyDouble4.getTtmAvg();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = quarterlyDouble4.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    }

    @Test
    public void test00804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00804");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray7 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray7);
        double double9 = quarterlyDouble8.getTtm();
        double[] doubleArray13 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray13);
        double double15 = quarterlyDouble14.getTtm();
        double double17 = quarterlyDouble14.get((int) '4');
        double[] doubleArray21 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble22 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray21);
        double[] doubleArray23 = quarterlyDouble22.dArr;
        double double24 = quarterlyDouble22.getQseqQ();
        double[] doubleArray25 = new double[] {};
        quarterlyDouble22.dArr = doubleArray25;
        quarterlyDouble14.dArr = doubleArray25;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble28 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray25);
        double[] doubleArray32 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble33 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray32);
        double double34 = quarterlyDouble33.getTtm();
        double double36 = quarterlyDouble33.get((int) '4');
        double[] doubleArray40 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble41 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray40);
        double[] doubleArray42 = quarterlyDouble41.dArr;
        double double43 = quarterlyDouble41.getQseqQ();
        double[] doubleArray44 = new double[] {};
        quarterlyDouble41.dArr = doubleArray44;
        quarterlyDouble33.dArr = doubleArray44;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble47 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray44);
        quarterlyDouble28.dArr = doubleArray44;
        quarterlyDouble8.dArr = doubleArray44;
        double double50 = quarterlyDouble8.getTtm();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str52 = quarterlyDouble8.fmtGrowth4Q("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
    }

    @Test
    public void test00805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00805");
        net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile((int) 'a', (int) (byte) 1);
    }

    @Test
    public void test00806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00806");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray7 = quarterlyDouble4.dArr;
        double[] doubleArray11 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray11);
        quarterlyDouble4.dArr = doubleArray11;
        double double14 = quarterlyDouble4.getTtm();
        double[] doubleArray15 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray15);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray15);
        double double19 = quarterlyDouble17.get((int) (byte) 10);
        double double22 = quarterlyDouble17.deltaQ((int) '#', 100);
        double[] doubleArray23 = quarterlyDouble17.dArr;
        java.lang.Class<?> wildcardClass24 = quarterlyDouble17.getClass();
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
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test00807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00807");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.add(companyFileData0, estimateFileData1, sharesFileData2, incSheetFileData3, balSheetFileData4, cashFileData5, (int) (short) 1, 100);
    }

    @Test
    public void test00808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00808");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double6 = quarterlyDouble5.getTtmAvg();
        double double7 = quarterlyDouble5.getTtm();
        double double8 = quarterlyDouble5.getTtmAvg();
        double double9 = quarterlyDouble5.getTtmAvg();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = quarterlyDouble5.fmtGrowth1Q("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test00809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00809");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double7 = quarterlyDouble5.get(100);
        double[] doubleArray8 = quarterlyDouble5.dArr;
        double[] doubleArray9 = quarterlyDouble5.dArr;
        java.lang.Class<?> wildcardClass10 = quarterlyDouble5.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9999.9999d) + "'", double7 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00810");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray7 = quarterlyDouble4.dArr;
        double double8 = quarterlyDouble4.getQseqQ();
        double double9 = quarterlyDouble4.getQseqQ();
        double double10 = quarterlyDouble4.getQseqQ();
        double[] doubleArray11 = quarterlyDouble4.dArr;
        java.lang.Class<?> wildcardClass12 = quarterlyDouble4.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00811");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double6 = quarterlyDouble4.get((int) (byte) 1);
        double double7 = quarterlyDouble4.getQseqQ();
        double double8 = quarterlyDouble4.getQseqQ();
        double double9 = quarterlyDouble4.getTtmAvg();
        double double12 = quarterlyDouble4.deltaQ(0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = quarterlyDouble4.fmtGrowth1Q("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 5100.0d + "'", double7 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 5100.0d + "'", double8 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test00812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00812");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!", (int) (short) 1, (int) ' ');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test00813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00813");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray7 = quarterlyDouble4.dArr;
        double[] doubleArray11 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray11);
        quarterlyDouble4.dArr = doubleArray11;
        double double14 = quarterlyDouble4.getTtm();
        double[] doubleArray15 = quarterlyDouble4.dArr;
        double double16 = quarterlyDouble4.getTtm();
        double[] doubleArray17 = quarterlyDouble4.dArr;
        double[] doubleArray21 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble22 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray21);
        double double24 = quarterlyDouble22.get((int) (byte) 1);
        double[] doubleArray28 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble29 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray28);
        double double30 = quarterlyDouble29.getTtm();
        double double31 = quarterlyDouble29.getQseqQ();
        double[] doubleArray32 = quarterlyDouble29.dArr;
        double[] doubleArray36 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble37 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray36);
        quarterlyDouble29.dArr = doubleArray36;
        double double39 = quarterlyDouble29.getTtm();
        double[] doubleArray40 = quarterlyDouble29.dArr;
        double double41 = quarterlyDouble29.getTtm();
        double[] doubleArray42 = quarterlyDouble29.dArr;
        quarterlyDouble22.dArr = doubleArray42;
        quarterlyDouble4.dArr = doubleArray42;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str46 = quarterlyDouble4.fmtGrowth4Q("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 52.0d + "'", double24 == 52.0d);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 5100.0d + "'", double31 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[10.0, 52.0, 1.0]");
    }

    @Test
    public void test00814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00814");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double[] doubleArray6 = quarterlyDouble5.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray6);
        double double8 = quarterlyDouble7.getMostRecent();
        double double9 = quarterlyDouble7.getQseqQ();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = quarterlyDouble7.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 5100.0d + "'", double9 == 5100.0d);
    }

    @Test
    public void test00815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00815");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double7 = quarterlyDouble5.get(100);
        double[] doubleArray8 = quarterlyDouble5.dArr;
        double double11 = quarterlyDouble5.deltaQ((int) (short) 1, (-1));
        double double14 = quarterlyDouble5.deltaQ((int) 'a', 1);
        double double15 = quarterlyDouble5.getTtm();
        double double16 = quarterlyDouble5.getTtm();
        // The following exception was thrown during execution in test generation
        try {
            double double17 = quarterlyDouble5.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9999.9999d) + "'", double7 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test00816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00816");
        net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile(0, (int) (short) 100);
    }

    @Test
    public void test00817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00817");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SnpEnum snpEnum0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(snpEnum0, (int) ' ', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00818");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList2, (int) (short) 0, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList7 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList((java.util.List<java.lang.String>) strList2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList8 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList((java.util.List<java.lang.String>) strList2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList11 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList2, 0, (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList14 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList2, 0, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList17 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList2, (int) '4', (int) '4');
        java.lang.Class<?> wildcardClass18 = strList2.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(companyDataList6);
        org.junit.Assert.assertNotNull(manyCompanyDataList7);
        org.junit.Assert.assertNotNull(manyCompanyDataList8);
        org.junit.Assert.assertNotNull(companyDataList11);
        org.junit.Assert.assertNotNull(companyDataList14);
        org.junit.Assert.assertNotNull(companyDataList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00819");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray7 = quarterlyDouble4.dArr;
        double[] doubleArray11 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray11);
        quarterlyDouble4.dArr = doubleArray11;
        double[] doubleArray14 = quarterlyDouble4.dArr;
        double[] doubleArray18 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray18);
        double double20 = quarterlyDouble19.getTtmAvg();
        double double21 = quarterlyDouble19.getTtm();
        double double22 = quarterlyDouble19.getMostRecent();
        double double23 = quarterlyDouble19.getTtmAvg();
        double double24 = quarterlyDouble19.getMostRecent();
        double[] doubleArray28 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble29 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray28);
        double[] doubleArray30 = quarterlyDouble29.dArr;
        double[] doubleArray31 = quarterlyDouble29.dArr;
        double[] doubleArray35 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble36 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray35);
        double double37 = quarterlyDouble36.getTtm();
        double double38 = quarterlyDouble36.getQseqQ();
        double[] doubleArray39 = quarterlyDouble36.dArr;
        double double40 = quarterlyDouble36.getQseqQ();
        double[] doubleArray44 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble45 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray44);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble46 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray44);
        quarterlyDouble36.dArr = doubleArray44;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble48 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray44);
        quarterlyDouble29.dArr = doubleArray44;
        quarterlyDouble19.dArr = doubleArray44;
        quarterlyDouble4.dArr = doubleArray44;
        double double52 = quarterlyDouble4.getTtmAvg();
        double double54 = quarterlyDouble4.get((int) (short) 10);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 52.0d + "'", double22 == 52.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 52.0d + "'", double24 == 52.0d);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 5100.0d + "'", double38 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 5100.0d + "'", double40 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + (-9999.9999d) + "'", double54 == (-9999.9999d));
    }

    @Test
    public void test00820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00820");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray9 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray9);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray9);
        double double13 = quarterlyDouble11.get(100);
        double[] doubleArray14 = quarterlyDouble11.dArr;
        quarterlyDouble4.dArr = doubleArray14;
        double double16 = quarterlyDouble4.getQseqQ();
        double[] doubleArray20 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble21 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray20);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble22 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray20);
        double double24 = quarterlyDouble22.get(100);
        double[] doubleArray25 = quarterlyDouble22.dArr;
        double double28 = quarterlyDouble22.deltaQ((int) '4', (int) (byte) 0);
        double[] doubleArray32 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble33 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray32);
        double double34 = quarterlyDouble33.getTtm();
        double double36 = quarterlyDouble33.get((int) '4');
        double[] doubleArray40 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble41 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray40);
        double[] doubleArray42 = quarterlyDouble41.dArr;
        double double43 = quarterlyDouble41.getQseqQ();
        double[] doubleArray44 = new double[] {};
        quarterlyDouble41.dArr = doubleArray44;
        quarterlyDouble33.dArr = doubleArray44;
        double[] doubleArray47 = quarterlyDouble33.dArr;
        quarterlyDouble22.dArr = doubleArray47;
        quarterlyDouble4.dArr = doubleArray47;
        double[] doubleArray53 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble54 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray53);
        double double55 = quarterlyDouble54.getTtm();
        double double56 = quarterlyDouble54.getQseqQ();
        double[] doubleArray57 = quarterlyDouble54.dArr;
        double double58 = quarterlyDouble54.getQseqQ();
        double[] doubleArray62 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble63 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray62);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble64 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray62);
        quarterlyDouble54.dArr = doubleArray62;
        double[] doubleArray66 = quarterlyDouble54.dArr;
        quarterlyDouble4.dArr = doubleArray66;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str69 = quarterlyDouble4.fmtGrowth1Q("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 5100.0d + "'", double56 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 5100.0d + "'", double58 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[10.0, 52.0, 1.0]");
    }

    @Test
    public void test00821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00821");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.add(companyFileData0, estimateFileData1, sharesFileData2, incSheetFileData3, balSheetFileData4, cashFileData5, (int) (byte) 1, (int) (short) -1);
    }

    @Test
    public void test00822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00822");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray7 = quarterlyDouble4.dArr;
        double double8 = quarterlyDouble4.getQseqQ();
        double double9 = quarterlyDouble4.getQseqQ();
        double double10 = quarterlyDouble4.getQseqQ();
        double double11 = quarterlyDouble4.getMostRecent();
        double double14 = quarterlyDouble4.deltaQ((int) (byte) 100, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = quarterlyDouble4.fmtGrowth4Q("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test00823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00823");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray10 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray10);
        quarterlyDouble4.dArr = doubleArray10;
        double double13 = quarterlyDouble4.getQseqQ();
        double double14 = quarterlyDouble4.getTtmAvg();
        double double15 = quarterlyDouble4.getTtm();
        double double16 = quarterlyDouble4.getTtm();
        double double18 = quarterlyDouble4.get(1);
        double double21 = quarterlyDouble4.deltaQ(1, (int) (short) -1);
        double double22 = quarterlyDouble4.getMostRecent();
        // The following exception was thrown during execution in test generation
        try {
            double double23 = quarterlyDouble4.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 52.0d + "'", double18 == 52.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 52.0d + "'", double22 == 52.0d);
    }

    @Test
    public void test00824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00824");
        net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile(0, (int) (byte) 0);
    }

    @Test
    public void test00825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00825");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double double6 = quarterlyDouble4.getMostRecent();
        double double7 = quarterlyDouble4.getTtm();
        double double8 = quarterlyDouble4.getMostRecent();
        double double9 = quarterlyDouble4.getTtm();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = quarterlyDouble4.fmtGrowth4Q("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test00826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00826");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray7 = quarterlyDouble4.dArr;
        double double8 = quarterlyDouble4.getQseqQ();
        double double9 = quarterlyDouble4.getQseqQ();
        double double10 = quarterlyDouble4.getTtmAvg();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = quarterlyDouble4.fmtGrowth1Q("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test00827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00827");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray9 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray9);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray9);
        double double13 = quarterlyDouble11.get(100);
        double[] doubleArray14 = quarterlyDouble11.dArr;
        quarterlyDouble4.dArr = doubleArray14;
        double double16 = quarterlyDouble4.getQseqQ();
        double[] doubleArray20 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble21 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray20);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble22 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray20);
        double double24 = quarterlyDouble22.get(100);
        double[] doubleArray25 = quarterlyDouble22.dArr;
        double double28 = quarterlyDouble22.deltaQ((int) '4', (int) (byte) 0);
        double[] doubleArray32 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble33 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray32);
        double double34 = quarterlyDouble33.getTtm();
        double double36 = quarterlyDouble33.get((int) '4');
        double[] doubleArray40 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble41 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray40);
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
            double double53 = quarterlyDouble4.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test00828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00828");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray7 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray7);
        double double9 = quarterlyDouble8.getQseqQ();
        double[] doubleArray13 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray13);
        double[] doubleArray15 = quarterlyDouble14.dArr;
        double[] doubleArray16 = quarterlyDouble14.dArr;
        quarterlyDouble8.dArr = doubleArray16;
        double double19 = quarterlyDouble8.get((-1));
        // The following exception was thrown during execution in test generation
        try {
            double double22 = quarterlyDouble8.deltaQ((int) (byte) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-9999.9999d) + "'", double19 == (-9999.9999d));
    }

    @Test
    public void test00829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00829");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double6 = quarterlyDouble4.get((int) (byte) 1);
        double double7 = quarterlyDouble4.getQseqQ();
        double double9 = quarterlyDouble4.get((int) (byte) 1);
        double double12 = quarterlyDouble4.deltaQ((int) (byte) 1, 0);
        double double13 = quarterlyDouble4.getQseqQ();
        double double16 = quarterlyDouble4.deltaQ((int) (short) 100, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = quarterlyDouble4.fmtGrowth4Q("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test00830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00830");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
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
            java.lang.String str19 = quarterlyDouble4.fmtGrowth1Q("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test00831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00831");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) '4');
        double double10 = quarterlyDouble4.deltaQ((int) (short) 1, 0);
        double[] doubleArray14 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray14);
        double double16 = quarterlyDouble15.getTtm();
        double double17 = quarterlyDouble15.getQseqQ();
        double[] doubleArray18 = quarterlyDouble15.dArr;
        quarterlyDouble4.dArr = doubleArray18;
        double double20 = quarterlyDouble4.getTtm();
        double double22 = quarterlyDouble4.get((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double25 = quarterlyDouble4.deltaQ((-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 52.0d + "'", double22 == 52.0d);
    }

    @Test
    public void test00832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00832");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.add(companyFileData0, estimateFileData1, sharesFileData2, incSheetFileData3, balSheetFileData4, cashFileData5, (int) '4', (int) (byte) 100);
    }

    @Test
    public void test00833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00833");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getMostRecent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = quarterlyDouble4.fmtGrowth1Q("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
    }

    @Test
    public void test00834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00834");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) '4');
        double[] doubleArray11 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray11);
        double[] doubleArray13 = quarterlyDouble12.dArr;
        double double14 = quarterlyDouble12.getQseqQ();
        double[] doubleArray15 = new double[] {};
        quarterlyDouble12.dArr = doubleArray15;
        quarterlyDouble4.dArr = doubleArray15;
        double[] doubleArray18 = quarterlyDouble4.dArr;
        double double21 = quarterlyDouble4.deltaQ((int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = quarterlyDouble4.fmtGrowth1Q("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test00835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00835");
        net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile((int) (byte) -1, (int) '#');
    }

    @Test
    public void test00836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00836");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double[] doubleArray9 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray9);
        double double11 = quarterlyDouble10.getTtm();
        double double13 = quarterlyDouble10.get((int) '4');
        double double16 = quarterlyDouble10.deltaQ((int) (short) 1, 0);
        double[] doubleArray20 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble21 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray20);
        double double22 = quarterlyDouble21.getTtm();
        double double23 = quarterlyDouble21.getQseqQ();
        double[] doubleArray24 = quarterlyDouble21.dArr;
        quarterlyDouble10.dArr = doubleArray24;
        quarterlyDouble5.dArr = doubleArray24;
        double double29 = quarterlyDouble5.deltaQ((int) '#', 0);
        // The following exception was thrown during execution in test generation
        try {
            double double30 = quarterlyDouble5.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-9999.9999d) + "'", double13 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 5100.0d + "'", double23 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
    }

    @Test
    public void test00837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00837");
        net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile((int) '4', (int) '4');
    }

    @Test
    public void test00838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00838");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double6 = quarterlyDouble4.get((int) (byte) 1);
        double double7 = quarterlyDouble4.getQseqQ();
        double double8 = quarterlyDouble4.getQseqQ();
        double double9 = quarterlyDouble4.getTtmAvg();
        double double10 = quarterlyDouble4.getTtm();
        double[] doubleArray11 = quarterlyDouble4.dArr;
        double double13 = quarterlyDouble4.get(10);
        double double14 = quarterlyDouble4.getQseqQ();
        double double15 = quarterlyDouble4.getQseqQ();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = quarterlyDouble4.fmtGrowth4Q("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 5100.0d + "'", double15 == 5100.0d);
    }

    @Test
    public void test00839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00839");
        net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile((int) '#', (int) '4');
    }

    @Test
    public void test00840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00840");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double7 = quarterlyDouble4.deltaQ((int) (short) 10, (int) (short) 100);
        java.lang.Class<?> wildcardClass8 = quarterlyDouble4.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00841");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) '4');
        double[] doubleArray11 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray11);
        double[] doubleArray13 = quarterlyDouble12.dArr;
        double double14 = quarterlyDouble12.getQseqQ();
        double[] doubleArray15 = new double[] {};
        quarterlyDouble12.dArr = doubleArray15;
        quarterlyDouble4.dArr = doubleArray15;
        double[] doubleArray18 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray18);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray18);
        double[] doubleArray24 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble25 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray24);
        double double26 = quarterlyDouble25.getTtm();
        double double27 = quarterlyDouble25.getQseqQ();
        double[] doubleArray31 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble32 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray31);
        quarterlyDouble25.dArr = doubleArray31;
        double double34 = quarterlyDouble25.getQseqQ();
        double double37 = quarterlyDouble25.deltaQ((int) (short) 100, (int) (byte) -1);
        double[] doubleArray41 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble42 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray41);
        double double43 = quarterlyDouble42.getTtmAvg();
        double double44 = quarterlyDouble42.getMostRecent();
        double double46 = quarterlyDouble42.get((int) 'a');
        double double48 = quarterlyDouble42.get((int) (byte) -1);
        double[] doubleArray52 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble53 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray52);
        double double54 = quarterlyDouble53.getTtm();
        double double55 = quarterlyDouble53.getQseqQ();
        double[] doubleArray56 = quarterlyDouble53.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble57 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray56);
        quarterlyDouble42.dArr = doubleArray56;
        quarterlyDouble25.dArr = doubleArray56;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble60 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray56);
        quarterlyDouble20.dArr = doubleArray56;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble62 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray56);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str64 = quarterlyDouble62.fmtGrowth4Q("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    }

    @Test
    public void test00842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00842");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double[] doubleArray5 = quarterlyDouble4.dArr;
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray7 = new double[] {};
        quarterlyDouble4.dArr = doubleArray7;
        double double9 = quarterlyDouble4.getTtm();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = quarterlyDouble4.fmtGrowth1Q("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test00843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00843");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData5 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList2, (int) '4', 100);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData8 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList2, (int) (byte) 1, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = fieldData8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNull(fieldData5);
        org.junit.Assert.assertNull(fieldData8);
    }

    @Test
    public void test00844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00844");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!", 0, (int) 'a');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test00845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00845");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("", 1, (-1));
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test00846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00846");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double double6 = quarterlyDouble4.getMostRecent();
        double double8 = quarterlyDouble4.get((int) 'a');
        double double10 = quarterlyDouble4.get((int) (byte) -1);
        double[] doubleArray14 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray14);
        double double16 = quarterlyDouble15.getTtm();
        double double17 = quarterlyDouble15.getQseqQ();
        double[] doubleArray18 = quarterlyDouble15.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray18);
        quarterlyDouble4.dArr = doubleArray18;
        double double21 = quarterlyDouble4.getMostRecent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = quarterlyDouble4.fmtGrowth4Q("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test00847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00847");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray10 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray10);
        quarterlyDouble4.dArr = doubleArray10;
        double double13 = quarterlyDouble4.getQseqQ();
        double double14 = quarterlyDouble4.getTtmAvg();
        double double15 = quarterlyDouble4.getTtm();
        double double16 = quarterlyDouble4.getTtm();
        double double18 = quarterlyDouble4.get(1);
        double double21 = quarterlyDouble4.deltaQ(1, (int) (short) -1);
        double double22 = quarterlyDouble4.getMostRecent();
        double double23 = quarterlyDouble4.getMostRecent();
        double double24 = quarterlyDouble4.getMostRecent();
        double[] doubleArray28 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble29 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray28);
        double double30 = quarterlyDouble29.getTtm();
        double double31 = quarterlyDouble29.getQseqQ();
        double[] doubleArray32 = quarterlyDouble29.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble33 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray32);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble34 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray32);
        quarterlyDouble4.dArr = doubleArray32;
        java.lang.Class<?> wildcardClass36 = quarterlyDouble4.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5100.0d + "'", double13 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 52.0d + "'", double18 == 52.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 52.0d + "'", double22 == 52.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 52.0d + "'", double23 == 52.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 52.0d + "'", double24 == 52.0d);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 5100.0d + "'", double31 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test00848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00848");
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) (short) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00849");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!", (int) (byte) 10, (int) (byte) 1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test00850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00850");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.add(companyFileData0, estimateFileData1, sharesFileData2, incSheetFileData3, balSheetFileData4, cashFileData5, (int) (byte) 0, (int) (short) 10);
    }

    @Test
    public void test00851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00851");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList0, (int) (short) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00852");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double double6 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.getTtmAvg();
        double double9 = quarterlyDouble4.get((int) (byte) 100);
        double[] doubleArray10 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray10);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray10);
        double double13 = quarterlyDouble12.getTtm();
        // The following exception was thrown during execution in test generation
        try {
            double double16 = quarterlyDouble12.deltaQ(0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test00853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00853");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double7 = quarterlyDouble4.deltaQ((int) (short) 10, (int) (short) 100);
        double[] doubleArray8 = quarterlyDouble4.dArr;
        double[] doubleArray9 = quarterlyDouble4.dArr;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = quarterlyDouble4.fmtGrowth4Q("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0, 52.0, 1.0]");
    }

    @Test
    public void test00854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00854");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double[] doubleArray6 = quarterlyDouble5.dArr;
        double[] doubleArray10 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray10);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray10);
        double double14 = quarterlyDouble12.get(100);
        double[] doubleArray15 = quarterlyDouble12.dArr;
        quarterlyDouble5.dArr = doubleArray15;
        double double17 = quarterlyDouble5.getTtmAvg();
        double[] doubleArray18 = quarterlyDouble5.dArr;
        double double19 = quarterlyDouble5.getTtm();
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
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test00855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00855");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("", (int) (short) 100, (int) (byte) 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test00856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00856");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList3, 100, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList10 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList3, 100, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList13 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList3, (int) (short) 10, (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList14 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList((java.util.List<java.lang.String>) strList3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList17 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList3, (int) (byte) 100, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList20 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList21 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList((java.util.List<java.lang.String>) strList3);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(companyDataList7);
        org.junit.Assert.assertNotNull(companyDataList10);
        org.junit.Assert.assertNotNull(companyDataList13);
        org.junit.Assert.assertNotNull(manyCompanyDataList14);
        org.junit.Assert.assertNotNull(companyDataList17);
        org.junit.Assert.assertNotNull(companyDataList20);
        org.junit.Assert.assertNotNull(manyCompanyDataList21);
    }

    @Test
    public void test00857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00857");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double6 = quarterlyDouble5.getTtmAvg();
        double double7 = quarterlyDouble5.getMostRecent();
        double double10 = quarterlyDouble5.deltaQ((int) '#', (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = quarterlyDouble5.fmtGrowth1Q("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test00858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00858");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray7 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray7);
        double double9 = quarterlyDouble8.getQseqQ();
        double double10 = quarterlyDouble8.getMostRecent();
        double[] doubleArray11 = quarterlyDouble8.dArr;
        double double12 = quarterlyDouble8.getTtmAvg();
        double double15 = quarterlyDouble8.deltaQ((int) 'a', (-1));
        double double17 = quarterlyDouble8.get(0);
        double double18 = quarterlyDouble8.getQseqQ();
        // The following exception was thrown during execution in test generation
        try {
            double double19 = quarterlyDouble8.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 5100.0d + "'", double18 == 5100.0d);
    }

    @Test
    public void test00859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00859");
        net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile(10, (int) '4');
    }

    @Test
    public void test00860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00860");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.add(companyFileData0, estimateFileData1, sharesFileData2, incSheetFileData3, balSheetFileData4, cashFileData5, (int) (byte) -1, (int) (byte) 0);
    }

    @Test
    public void test00861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00861");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray7 = quarterlyDouble4.dArr;
        double double8 = quarterlyDouble4.getQseqQ();
        double[] doubleArray12 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray12);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray12);
        quarterlyDouble4.dArr = doubleArray12;
        double[] doubleArray16 = quarterlyDouble4.dArr;
        double[] doubleArray20 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble21 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray20);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble22 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray20);
        double[] doubleArray23 = quarterlyDouble22.dArr;
        double[] doubleArray27 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble28 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray27);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble29 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray27);
        double double31 = quarterlyDouble29.get(100);
        double[] doubleArray32 = quarterlyDouble29.dArr;
        quarterlyDouble22.dArr = doubleArray32;
        quarterlyDouble4.dArr = doubleArray32;
        double[] doubleArray35 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble36 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray35);
        java.lang.Class<?> wildcardClass37 = doubleArray35.getClass();
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
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test00862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00862");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray7 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray7);
        double double9 = quarterlyDouble8.getTtm();
        double[] doubleArray13 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray13);
        double double15 = quarterlyDouble14.getTtm();
        double double17 = quarterlyDouble14.get((int) '4');
        double[] doubleArray21 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble22 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray21);
        double[] doubleArray23 = quarterlyDouble22.dArr;
        double double24 = quarterlyDouble22.getQseqQ();
        double[] doubleArray25 = new double[] {};
        quarterlyDouble22.dArr = doubleArray25;
        quarterlyDouble14.dArr = doubleArray25;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble28 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray25);
        double[] doubleArray32 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble33 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray32);
        double double34 = quarterlyDouble33.getTtm();
        double double36 = quarterlyDouble33.get((int) '4');
        double[] doubleArray40 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble41 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray40);
        double[] doubleArray42 = quarterlyDouble41.dArr;
        double double43 = quarterlyDouble41.getQseqQ();
        double[] doubleArray44 = new double[] {};
        quarterlyDouble41.dArr = doubleArray44;
        quarterlyDouble33.dArr = doubleArray44;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble47 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray44);
        quarterlyDouble28.dArr = doubleArray44;
        quarterlyDouble8.dArr = doubleArray44;
        double[] doubleArray53 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble54 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray53);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble55 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray53);
        double[] doubleArray56 = quarterlyDouble55.dArr;
        double[] doubleArray60 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble61 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray60);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble62 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray60);
        double double64 = quarterlyDouble62.get(100);
        double[] doubleArray65 = quarterlyDouble62.dArr;
        quarterlyDouble55.dArr = doubleArray65;
        double double67 = quarterlyDouble55.getTtmAvg();
        double double68 = quarterlyDouble55.getQseqQ();
        double[] doubleArray69 = quarterlyDouble55.dArr;
        quarterlyDouble8.dArr = doubleArray69;
        double double71 = quarterlyDouble8.getQseqQ();
        double double72 = quarterlyDouble8.getTtmAvg();
        // The following exception was thrown during execution in test generation
        try {
            double double73 = quarterlyDouble8.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + (-9999.9999d) + "'", double64 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 0.0d + "'", double67 == 0.0d);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 5100.0d + "'", double68 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 5100.0d + "'", double71 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 0.0d + "'", double72 == 0.0d);
    }

    @Test
    public void test00863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00863");
        net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile(10, (int) 'a');
    }

    @Test
    public void test00864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00864");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.add(companyFileData0, estimateFileData1, sharesFileData2, incSheetFileData3, balSheetFileData4, cashFileData5, (int) (byte) -1, 0);
    }

    @Test
    public void test00865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00865");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double6 = quarterlyDouble4.get((int) (byte) 1);
        double double7 = quarterlyDouble4.getQseqQ();
        double double8 = quarterlyDouble4.getQseqQ();
        double double9 = quarterlyDouble4.getTtmAvg();
        double double10 = quarterlyDouble4.getTtm();
        double[] doubleArray11 = quarterlyDouble4.dArr;
        double double13 = quarterlyDouble4.get(10);
        double double14 = quarterlyDouble4.getQseqQ();
        double double15 = quarterlyDouble4.getQseqQ();
        // The following exception was thrown during execution in test generation
        try {
            double double16 = quarterlyDouble4.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 5100.0d + "'", double15 == 5100.0d);
    }

    @Test
    public void test00866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00866");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray10 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray10);
        quarterlyDouble4.dArr = doubleArray10;
        double double13 = quarterlyDouble4.getQseqQ();
        double double14 = quarterlyDouble4.getTtmAvg();
        double double15 = quarterlyDouble4.getTtm();
        double[] doubleArray19 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray19);
        double double21 = quarterlyDouble20.getTtm();
        double double22 = quarterlyDouble20.getQseqQ();
        double[] doubleArray23 = quarterlyDouble20.dArr;
        quarterlyDouble4.dArr = doubleArray23;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble25 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray23);
        double[] doubleArray29 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble30 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray29);
        double double31 = quarterlyDouble30.getTtm();
        double double32 = quarterlyDouble30.getQseqQ();
        double[] doubleArray36 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble37 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray36);
        quarterlyDouble30.dArr = doubleArray36;
        double double39 = quarterlyDouble30.getQseqQ();
        double double42 = quarterlyDouble30.deltaQ((int) (short) 100, (int) (byte) -1);
        double double45 = quarterlyDouble30.deltaQ((int) (byte) 100, 0);
        double double46 = quarterlyDouble30.getTtm();
        double[] doubleArray47 = quarterlyDouble30.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble48 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray47);
        quarterlyDouble25.dArr = doubleArray47;
        double double51 = quarterlyDouble25.get((int) ' ');
        double double52 = quarterlyDouble25.getTtm();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str54 = quarterlyDouble25.fmtGrowth1Q("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 5100.0d + "'", double32 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 5100.0d + "'", double39 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + (-9999.9999d) + "'", double51 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
    }

    @Test
    public void test00867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00867");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double[] doubleArray6 = quarterlyDouble5.dArr;
        double[] doubleArray10 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray10);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray10);
        double double14 = quarterlyDouble12.get(100);
        double[] doubleArray15 = quarterlyDouble12.dArr;
        quarterlyDouble5.dArr = doubleArray15;
        double double17 = quarterlyDouble5.getTtmAvg();
        double double18 = quarterlyDouble5.getQseqQ();
        double double21 = quarterlyDouble5.deltaQ((int) (byte) 10, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = quarterlyDouble5.fmtGrowth4Q("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test00868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00868");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double[] doubleArray5 = quarterlyDouble4.dArr;
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray7 = new double[] {};
        quarterlyDouble4.dArr = doubleArray7;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray7);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = quarterlyDouble9.getQseqQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test00869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00869");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!", (int) (byte) 0, 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test00870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00870");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray7 = quarterlyDouble4.dArr;
        double double8 = quarterlyDouble4.getQseqQ();
        double double9 = quarterlyDouble4.getTtmAvg();
        double double11 = quarterlyDouble4.get(0);
        double[] doubleArray15 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray15);
        double double17 = quarterlyDouble16.getTtm();
        double double18 = quarterlyDouble16.getQseqQ();
        double[] doubleArray19 = quarterlyDouble16.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray19);
        quarterlyDouble4.dArr = doubleArray19;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = quarterlyDouble4.fmtGrowth1Q("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 5100.0d + "'", double18 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 52.0, 1.0]");
    }

    @Test
    public void test00871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00871");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double6 = quarterlyDouble4.get((int) (byte) 1);
        double double7 = quarterlyDouble4.getQseqQ();
        double double9 = quarterlyDouble4.get((int) (byte) 1);
        double double12 = quarterlyDouble4.deltaQ((int) (byte) 1, 0);
        double double13 = quarterlyDouble4.getQseqQ();
        double double14 = quarterlyDouble4.getQseqQ();
        double double15 = quarterlyDouble4.getTtmAvg();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = quarterlyDouble4.fmtGrowth4Q("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 5100.0d + "'", double7 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5100.0d + "'", double13 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 5100.0d + "'", double14 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test00872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00872");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!", (int) (short) 0, (int) ' ');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test00873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00873");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray7 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray7);
        double double9 = quarterlyDouble8.getQseqQ();
        double double10 = quarterlyDouble8.getTtm();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = quarterlyDouble8.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    }

    @Test
    public void test00874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00874");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray10 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray10);
        quarterlyDouble4.dArr = doubleArray10;
        double double13 = quarterlyDouble4.getQseqQ();
        double double14 = quarterlyDouble4.getTtmAvg();
        double double15 = quarterlyDouble4.getTtm();
        double[] doubleArray19 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray19);
        double double21 = quarterlyDouble20.getTtm();
        double double22 = quarterlyDouble20.getQseqQ();
        double[] doubleArray23 = quarterlyDouble20.dArr;
        quarterlyDouble4.dArr = doubleArray23;
        double double25 = quarterlyDouble4.getQseqQ();
        double double27 = quarterlyDouble4.get(0);
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
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 5100.0d + "'", double25 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
    }

    @Test
    public void test00875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00875");
        net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile((-1), (-1));
    }

    @Test
    public void test00876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00876");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.add(companyFileData0, estimateFileData1, sharesFileData2, incSheetFileData3, balSheetFileData4, cashFileData5, (int) (byte) 1, (-1));
    }

    @Test
    public void test00877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00877");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray10 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray10);
        quarterlyDouble4.dArr = doubleArray10;
        double[] doubleArray16 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray16);
        double double18 = quarterlyDouble17.getTtm();
        double double19 = quarterlyDouble17.getQseqQ();
        double[] doubleArray20 = quarterlyDouble17.dArr;
        double[] doubleArray24 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble25 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray24);
        quarterlyDouble17.dArr = doubleArray24;
        double double27 = quarterlyDouble17.getTtm();
        double[] doubleArray28 = quarterlyDouble17.dArr;
        double double29 = quarterlyDouble17.getTtm();
        double[] doubleArray30 = quarterlyDouble17.dArr;
        quarterlyDouble4.dArr = doubleArray30;
        double double32 = quarterlyDouble4.getMostRecent();
        double double35 = quarterlyDouble4.deltaQ((int) (byte) 10, (int) (byte) 0);
        double double36 = quarterlyDouble4.getQseqQ();
        double[] doubleArray37 = quarterlyDouble4.dArr;
        // The following exception was thrown during execution in test generation
        try {
            double double38 = quarterlyDouble4.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 52.0d + "'", double32 == 52.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 5100.0d + "'", double36 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[10.0, 52.0, 1.0]");
    }

    @Test
    public void test00878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00878");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("", (int) '#', 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test00879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00879");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!", (int) (byte) 100, (int) (byte) 100);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test00880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00880");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray9 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray9);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray9);
        double double13 = quarterlyDouble11.get(100);
        double[] doubleArray14 = quarterlyDouble11.dArr;
        quarterlyDouble4.dArr = doubleArray14;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray14);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray14);
        double double20 = quarterlyDouble17.deltaQ((int) (short) -1, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = quarterlyDouble17.fmtGrowth4Q("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test00881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00881");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double6 = quarterlyDouble4.get((int) (byte) 1);
        double double7 = quarterlyDouble4.getQseqQ();
        double double9 = quarterlyDouble4.get((int) (byte) 1);
        double double12 = quarterlyDouble4.deltaQ((int) (byte) 1, 0);
        double double13 = quarterlyDouble4.getQseqQ();
        double double16 = quarterlyDouble4.deltaQ((int) (short) 100, 1);
        double double17 = quarterlyDouble4.getQseqQ();
        double double18 = quarterlyDouble4.getTtmAvg();
        double double19 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray23 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble24 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray23);
        double double25 = quarterlyDouble24.getTtm();
        double double26 = quarterlyDouble24.getQseqQ();
        double[] doubleArray27 = quarterlyDouble24.dArr;
        double double28 = quarterlyDouble24.getQseqQ();
        double[] doubleArray32 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble33 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray32);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble34 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray32);
        quarterlyDouble24.dArr = doubleArray32;
        double[] doubleArray39 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble40 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray39);
        double[] doubleArray41 = quarterlyDouble40.dArr;
        double[] doubleArray42 = quarterlyDouble40.dArr;
        quarterlyDouble24.dArr = doubleArray42;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble44 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray42);
        quarterlyDouble4.dArr = doubleArray42;
        double double46 = quarterlyDouble4.getQseqQ();
        java.lang.Class<?> wildcardClass47 = quarterlyDouble4.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 5100.0d + "'", double7 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5100.0d + "'", double13 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 5100.0d + "'", double17 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 5100.0d + "'", double26 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 5100.0d + "'", double28 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 5100.0d + "'", double46 == 5100.0d);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test00882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00882");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray9 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray9);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray9);
        double double13 = quarterlyDouble11.get(100);
        double[] doubleArray14 = quarterlyDouble11.dArr;
        quarterlyDouble4.dArr = doubleArray14;
        double double16 = quarterlyDouble4.getQseqQ();
        double[] doubleArray20 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble21 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray20);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble22 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray20);
        double double24 = quarterlyDouble22.get(100);
        double[] doubleArray25 = quarterlyDouble22.dArr;
        double double28 = quarterlyDouble22.deltaQ((int) '4', (int) (byte) 0);
        double[] doubleArray32 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble33 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray32);
        double double34 = quarterlyDouble33.getTtm();
        double double36 = quarterlyDouble33.get((int) '4');
        double[] doubleArray40 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble41 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray40);
        double[] doubleArray42 = quarterlyDouble41.dArr;
        double double43 = quarterlyDouble41.getQseqQ();
        double[] doubleArray44 = new double[] {};
        quarterlyDouble41.dArr = doubleArray44;
        quarterlyDouble33.dArr = doubleArray44;
        double[] doubleArray47 = quarterlyDouble33.dArr;
        quarterlyDouble22.dArr = doubleArray47;
        quarterlyDouble4.dArr = doubleArray47;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble50 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray47);
        // The following exception was thrown during execution in test generation
        try {
            double double51 = quarterlyDouble50.getQseqQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test00883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00883");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList1 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, fieldDataArray0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData5 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, 0, (int) 'a');
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData8 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, (int) ' ', (int) 'a');
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData11 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, (int) (short) 10, (int) (byte) 0);
        org.junit.Assert.assertNotNull(fieldDataArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(fieldData5);
        org.junit.Assert.assertNull(fieldData8);
        org.junit.Assert.assertNull(fieldData11);
    }

    @Test
    public void test00884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00884");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray7 = quarterlyDouble4.dArr;
        double[] doubleArray11 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray11);
        quarterlyDouble4.dArr = doubleArray11;
        double double14 = quarterlyDouble4.getTtm();
        double double16 = quarterlyDouble4.get((int) (short) 100);
        double double19 = quarterlyDouble4.deltaQ((int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = quarterlyDouble4.fmtGrowth1Q("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test00885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00885");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray10 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray10);
        quarterlyDouble4.dArr = doubleArray10;
        double double13 = quarterlyDouble4.getTtmAvg();
        double double14 = quarterlyDouble4.getTtm();
        java.lang.Class<?> wildcardClass15 = quarterlyDouble4.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00886");
        net.ajaskey.market.tools.SIP.BigDB.dataio.DowEnum dowEnum0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, (int) (short) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00887");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList2, (int) (short) 0, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList9 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList2, (int) (short) 100, (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList12 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList2, (int) (short) 10, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList15 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList2, (int) (short) 1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass16 = companyDataList15.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(companyDataList6);
        org.junit.Assert.assertNotNull(companyDataList9);
        org.junit.Assert.assertNotNull(companyDataList12);
        org.junit.Assert.assertNotNull(companyDataList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00888");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double double6 = quarterlyDouble4.getMostRecent();
        double double8 = quarterlyDouble4.get((int) 'a');
        double double10 = quarterlyDouble4.get((int) (byte) -1);
        double[] doubleArray14 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray14);
        double double16 = quarterlyDouble15.getTtm();
        double double17 = quarterlyDouble15.getQseqQ();
        double[] doubleArray18 = quarterlyDouble15.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray18);
        quarterlyDouble4.dArr = doubleArray18;
        double double23 = quarterlyDouble4.deltaQ((int) (byte) 100, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = quarterlyDouble4.fmtGrowth1Q("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test00889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00889");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray7 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray7);
        double double9 = quarterlyDouble8.getQseqQ();
        double double10 = quarterlyDouble8.getMostRecent();
        double[] doubleArray11 = quarterlyDouble8.dArr;
        double double12 = quarterlyDouble8.getTtmAvg();
        java.lang.Class<?> wildcardClass13 = quarterlyDouble8.getClass();
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
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00890");
        net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile((int) (byte) 100, (int) (byte) 100);
    }

    @Test
    public void test00891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00891");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double[] doubleArray5 = quarterlyDouble4.dArr;
        double double6 = quarterlyDouble4.getTtm();
        double double9 = quarterlyDouble4.deltaQ((int) '#', 100);
        double[] doubleArray13 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray13);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray13);
        double[] doubleArray16 = quarterlyDouble15.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray16);
        double double18 = quarterlyDouble17.getMostRecent();
        double[] doubleArray22 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble23 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray22);
        double double24 = quarterlyDouble23.getTtm();
        double double25 = quarterlyDouble23.getQseqQ();
        double[] doubleArray26 = quarterlyDouble23.dArr;
        double double27 = quarterlyDouble23.getQseqQ();
        double[] doubleArray31 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble32 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray31);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble33 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray31);
        quarterlyDouble23.dArr = doubleArray31;
        double[] doubleArray35 = quarterlyDouble23.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble36 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray35);
        quarterlyDouble17.dArr = doubleArray35;
        quarterlyDouble4.dArr = doubleArray35;
        // The following exception was thrown during execution in test generation
        try {
            double double39 = quarterlyDouble4.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 52.0d + "'", double18 == 52.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 5100.0d + "'", double25 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 5100.0d + "'", double27 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[10.0, 52.0, 1.0]");
    }

    @Test
    public void test00892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00892");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData6 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList3, 10, 10);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData9 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList3, 0, 100);
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNotNull(fieldDataList3);
        org.junit.Assert.assertNull(fieldData6);
        org.junit.Assert.assertNull(fieldData9);
    }

    @Test
    public void test00893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00893");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray7 = quarterlyDouble4.dArr;
        double[] doubleArray11 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray11);
        quarterlyDouble4.dArr = doubleArray11;
        double double14 = quarterlyDouble4.getTtm();
        double[] doubleArray15 = quarterlyDouble4.dArr;
        java.lang.Class<?> wildcardClass16 = doubleArray15.getClass();
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
    public void test00894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00894");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double6 = quarterlyDouble4.get((int) (byte) 1);
        double double7 = quarterlyDouble4.getQseqQ();
        double double8 = quarterlyDouble4.getQseqQ();
        double double9 = quarterlyDouble4.getTtmAvg();
        double double10 = quarterlyDouble4.getTtm();
        double[] doubleArray11 = quarterlyDouble4.dArr;
        double double13 = quarterlyDouble4.get(1);
        double double15 = quarterlyDouble4.get((int) 'a');
        double[] doubleArray16 = quarterlyDouble4.dArr;
        double[] doubleArray20 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble21 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray20);
        double double22 = quarterlyDouble21.getTtmAvg();
        double double23 = quarterlyDouble21.getMostRecent();
        double double24 = quarterlyDouble21.getTtm();
        double double25 = quarterlyDouble21.getTtm();
        double[] doubleArray26 = quarterlyDouble21.dArr;
        quarterlyDouble4.dArr = doubleArray26;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = quarterlyDouble4.fmtGrowth1Q("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-9999.9999d) + "'", double15 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 52.0d + "'", double23 == 52.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0, 52.0, 1.0]");
    }

    @Test
    public void test00895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00895");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray10 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray10);
        quarterlyDouble4.dArr = doubleArray10;
        double double13 = quarterlyDouble4.getQseqQ();
        double double16 = quarterlyDouble4.deltaQ((int) (short) 100, (int) (byte) -1);
        double double19 = quarterlyDouble4.deltaQ((int) ' ', 100);
        double double20 = quarterlyDouble4.getQseqQ();
        // The following exception was thrown during execution in test generation
        try {
            double double21 = quarterlyDouble4.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 5100.0d + "'", double20 == 5100.0d);
    }

    @Test
    public void test00896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00896");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray7 = quarterlyDouble4.dArr;
        double[] doubleArray11 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray11);
        quarterlyDouble4.dArr = doubleArray11;
        double double14 = quarterlyDouble4.getTtm();
        double double16 = quarterlyDouble4.get((int) (short) 100);
        double[] doubleArray20 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble21 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray20);
        double double22 = quarterlyDouble21.getTtmAvg();
        double double23 = quarterlyDouble21.getTtm();
        double double24 = quarterlyDouble21.getTtmAvg();
        double double26 = quarterlyDouble21.get((int) (byte) 100);
        double[] doubleArray27 = quarterlyDouble21.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble28 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray27);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble29 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray27);
        quarterlyDouble4.dArr = doubleArray27;
        // The following exception was thrown during execution in test generation
        try {
            double double31 = quarterlyDouble4.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-9999.9999d) + "'", double26 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[10.0, 52.0, 1.0]");
    }

    @Test
    public void test00897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00897");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double6 = quarterlyDouble5.getTtmAvg();
        double double7 = quarterlyDouble5.getTtmAvg();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = quarterlyDouble5.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test00898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00898");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double7 = quarterlyDouble5.get(10);
        double double8 = quarterlyDouble5.getMostRecent();
        double double9 = quarterlyDouble5.getMostRecent();
        double double10 = quarterlyDouble5.getTtmAvg();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = quarterlyDouble5.fmtGrowth4Q("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test00899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00899");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double6 = quarterlyDouble4.get((int) (byte) 1);
        double double7 = quarterlyDouble4.getQseqQ();
        double double8 = quarterlyDouble4.getQseqQ();
        double double9 = quarterlyDouble4.getTtmAvg();
        double double10 = quarterlyDouble4.getTtm();
        double[] doubleArray11 = quarterlyDouble4.dArr;
        double double12 = quarterlyDouble4.getTtm();
        double[] doubleArray16 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray16);
        double double18 = quarterlyDouble17.getTtm();
        double double19 = quarterlyDouble17.getQseqQ();
        double[] doubleArray20 = quarterlyDouble17.dArr;
        double[] doubleArray24 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble25 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray24);
        quarterlyDouble17.dArr = doubleArray24;
        double double27 = quarterlyDouble17.getTtm();
        double[] doubleArray28 = quarterlyDouble17.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble29 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray28);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble30 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray28);
        double double32 = quarterlyDouble30.get((int) (byte) 10);
        double double35 = quarterlyDouble30.deltaQ((int) '#', 100);
        double[] doubleArray36 = quarterlyDouble30.dArr;
        quarterlyDouble4.dArr = doubleArray36;
        java.lang.Class<?> wildcardClass38 = quarterlyDouble4.getClass();
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
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-9999.9999d) + "'", double32 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test00900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00900");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray9 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray9);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray9);
        double double13 = quarterlyDouble11.get(100);
        double[] doubleArray14 = quarterlyDouble11.dArr;
        quarterlyDouble4.dArr = doubleArray14;
        double double16 = quarterlyDouble4.getQseqQ();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = quarterlyDouble4.fmtGrowth1Q("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test00901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00901");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double double6 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.getTtmAvg();
        double double9 = quarterlyDouble4.get((int) (byte) 100);
        double[] doubleArray10 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray10);
        double double12 = quarterlyDouble11.getTtmAvg();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = quarterlyDouble11.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test00902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00902");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double[] doubleArray8 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray8);
        double double10 = quarterlyDouble9.getTtm();
        double double11 = quarterlyDouble9.getQseqQ();
        double[] doubleArray12 = quarterlyDouble9.dArr;
        double double13 = quarterlyDouble9.getQseqQ();
        double[] doubleArray17 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray17);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray17);
        quarterlyDouble9.dArr = doubleArray17;
        double[] doubleArray21 = quarterlyDouble9.dArr;
        double[] doubleArray25 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble26 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray25);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble27 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray25);
        double[] doubleArray28 = quarterlyDouble27.dArr;
        double[] doubleArray32 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble33 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray32);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble34 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray32);
        double double36 = quarterlyDouble34.get(100);
        double[] doubleArray37 = quarterlyDouble34.dArr;
        quarterlyDouble27.dArr = doubleArray37;
        quarterlyDouble9.dArr = doubleArray37;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble40 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray37);
        quarterlyDouble4.dArr = doubleArray37;
        java.lang.Class<?> wildcardClass42 = doubleArray37.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 5100.0d + "'", double11 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5100.0d + "'", double13 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + (-9999.9999d) + "'", double36 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test00903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00903");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double double6 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.getTtmAvg();
        double double9 = quarterlyDouble4.get((int) (byte) 100);
        double double11 = quarterlyDouble4.get((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = quarterlyDouble4.fmtGrowth1Q("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-9999.9999d) + "'", double9 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
    }

    @Test
    public void test00904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00904");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("", (int) (byte) 0, (int) '#');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test00905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00905");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double[] doubleArray5 = quarterlyDouble4.dArr;
        double double6 = quarterlyDouble4.getQseqQ();
        double double7 = quarterlyDouble4.getQseqQ();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = quarterlyDouble4.fmtGrowth1Q("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 5100.0d + "'", double7 == 5100.0d);
    }

    @Test
    public void test00906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00906");
        net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile(1, (int) ' ');
    }

    @Test
    public void test00907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00907");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray7 = quarterlyDouble4.dArr;
        double[] doubleArray11 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray11);
        quarterlyDouble4.dArr = doubleArray11;
        double double14 = quarterlyDouble4.getTtm();
        double[] doubleArray15 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray15);
        double double17 = quarterlyDouble16.getTtm();
        double double18 = quarterlyDouble16.getTtmAvg();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = quarterlyDouble16.fmtGrowth1Q("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test00908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00908");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.add(companyFileData0, estimateFileData1, sharesFileData2, incSheetFileData3, balSheetFileData4, cashFileData5, 10, 10);
    }

    @Test
    public void test00909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00909");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray7 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray7);
        double double9 = quarterlyDouble8.getQseqQ();
        double double10 = quarterlyDouble8.getTtm();
        double double12 = quarterlyDouble8.get((int) (short) 0);
        double double13 = quarterlyDouble8.getTtmAvg();
        double[] doubleArray17 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray17);
        double double20 = quarterlyDouble18.get((int) (byte) 1);
        double[] doubleArray24 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble25 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray24);
        double double26 = quarterlyDouble25.getTtm();
        double double27 = quarterlyDouble25.getQseqQ();
        double[] doubleArray28 = quarterlyDouble25.dArr;
        double[] doubleArray32 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble33 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray32);
        quarterlyDouble25.dArr = doubleArray32;
        double double35 = quarterlyDouble25.getTtm();
        double[] doubleArray36 = quarterlyDouble25.dArr;
        double double37 = quarterlyDouble25.getTtm();
        double[] doubleArray38 = quarterlyDouble25.dArr;
        quarterlyDouble18.dArr = doubleArray38;
        quarterlyDouble8.dArr = doubleArray38;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str42 = quarterlyDouble8.fmtGrowth4Q("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 52.0d + "'", double20 == 52.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 5100.0d + "'", double27 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[10.0, 52.0, 1.0]");
    }

    @Test
    public void test00910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00910");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) '4');
        double double10 = quarterlyDouble4.deltaQ((int) (short) 1, 0);
        double double11 = quarterlyDouble4.getMostRecent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = quarterlyDouble4.fmtGrowth4Q("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9999.9999d) + "'", double7 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
    }

    @Test
    public void test00911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00911");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray7 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray7);
        double double9 = quarterlyDouble8.getQseqQ();
        double double10 = quarterlyDouble8.getTtm();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = quarterlyDouble8.fmtGrowth1Q("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    }

    @Test
    public void test00912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00912");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double6 = quarterlyDouble4.get((int) (byte) 1);
        double[] doubleArray10 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray10);
        double double12 = quarterlyDouble11.getTtm();
        double double13 = quarterlyDouble11.getQseqQ();
        double[] doubleArray14 = quarterlyDouble11.dArr;
        double[] doubleArray18 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray18);
        quarterlyDouble11.dArr = doubleArray18;
        double double21 = quarterlyDouble11.getTtm();
        double[] doubleArray22 = quarterlyDouble11.dArr;
        double double23 = quarterlyDouble11.getTtm();
        double[] doubleArray24 = quarterlyDouble11.dArr;
        quarterlyDouble4.dArr = doubleArray24;
        double double26 = quarterlyDouble4.getQseqQ();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = quarterlyDouble4.fmtGrowth4Q("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5100.0d + "'", double13 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 5100.0d + "'", double26 == 5100.0d);
    }

    @Test
    public void test00913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00913");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList2, (int) (short) 0, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList9 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList2, (int) (short) 100, (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList12 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList2, (-1), (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList13 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList((java.util.List<java.lang.String>) strList2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList16 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList2, (int) (byte) 10, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList17 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList((java.util.List<java.lang.String>) strList2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList18 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList((java.util.List<java.lang.String>) strList2);
        java.lang.Class<?> wildcardClass19 = strList2.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(companyDataList6);
        org.junit.Assert.assertNotNull(companyDataList9);
        org.junit.Assert.assertNotNull(companyDataList12);
        org.junit.Assert.assertNotNull(manyCompanyDataList13);
        org.junit.Assert.assertNotNull(companyDataList16);
        org.junit.Assert.assertNotNull(manyCompanyDataList17);
        org.junit.Assert.assertNotNull(manyCompanyDataList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00914");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double6 = quarterlyDouble4.get((int) (byte) 1);
        double double7 = quarterlyDouble4.getQseqQ();
        double double9 = quarterlyDouble4.get((int) (byte) 1);
        double double12 = quarterlyDouble4.deltaQ((int) (byte) 1, 0);
        double double13 = quarterlyDouble4.getQseqQ();
        double double14 = quarterlyDouble4.getQseqQ();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = quarterlyDouble4.fmtGrowth4Q("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 5100.0d + "'", double7 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5100.0d + "'", double13 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 5100.0d + "'", double14 == 5100.0d);
    }

    @Test
    public void test00915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00915");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.add(companyFileData0, estimateFileData1, sharesFileData2, incSheetFileData3, balSheetFileData4, cashFileData5, (int) (short) 0, (int) (short) -1);
    }

    @Test
    public void test00916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00916");
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) 'a', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00917");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray10 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray10);
        quarterlyDouble4.dArr = doubleArray10;
        double[] doubleArray16 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray16);
        double double18 = quarterlyDouble17.getTtm();
        double double19 = quarterlyDouble17.getQseqQ();
        double[] doubleArray20 = quarterlyDouble17.dArr;
        double[] doubleArray24 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble25 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray24);
        quarterlyDouble17.dArr = doubleArray24;
        double double27 = quarterlyDouble17.getTtm();
        double[] doubleArray28 = quarterlyDouble17.dArr;
        double double29 = quarterlyDouble17.getTtm();
        double[] doubleArray30 = quarterlyDouble17.dArr;
        quarterlyDouble4.dArr = doubleArray30;
        double double32 = quarterlyDouble4.getMostRecent();
        double double35 = quarterlyDouble4.deltaQ((int) (byte) 10, (int) (byte) 0);
        double double36 = quarterlyDouble4.getQseqQ();
        double double39 = quarterlyDouble4.deltaQ(0, (int) (byte) -1);
        double double40 = quarterlyDouble4.getQseqQ();
        double double41 = quarterlyDouble4.getTtmAvg();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str43 = quarterlyDouble4.fmtGrowth4Q("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 52.0d + "'", double32 == 52.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 5100.0d + "'", double36 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 5100.0d + "'", double40 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
    }

    @Test
    public void test00918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00918");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double6 = quarterlyDouble4.get((int) (byte) 1);
        double double7 = quarterlyDouble4.getTtm();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = quarterlyDouble4.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test00919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00919");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray10 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray10);
        quarterlyDouble4.dArr = doubleArray10;
        double double13 = quarterlyDouble4.getQseqQ();
        double double14 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray15 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray15);
        double double17 = quarterlyDouble16.getTtmAvg();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = quarterlyDouble16.fmtGrowth4Q("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test00920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00920");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.add(companyFileData0, estimateFileData1, sharesFileData2, incSheetFileData3, balSheetFileData4, cashFileData5, (int) (short) 0, (int) (short) 1);
    }

    @Test
    public void test00921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00921");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double6 = quarterlyDouble4.get((int) (byte) 1);
        double double7 = quarterlyDouble4.getQseqQ();
        double double8 = quarterlyDouble4.getQseqQ();
        double double9 = quarterlyDouble4.getTtmAvg();
        double double10 = quarterlyDouble4.getTtm();
        double[] doubleArray11 = quarterlyDouble4.dArr;
        double double13 = quarterlyDouble4.get(10);
        double double14 = quarterlyDouble4.getQseqQ();
        double double15 = quarterlyDouble4.getQseqQ();
        double double18 = quarterlyDouble4.deltaQ(100, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = quarterlyDouble4.fmtGrowth4Q("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 5100.0d + "'", double15 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test00922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00922");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray7 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray7);
        double double9 = quarterlyDouble8.getQseqQ();
        double[] doubleArray13 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray13);
        double[] doubleArray15 = quarterlyDouble14.dArr;
        double[] doubleArray16 = quarterlyDouble14.dArr;
        quarterlyDouble8.dArr = doubleArray16;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = quarterlyDouble8.fmtGrowth1Q("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    }

    @Test
    public void test00923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00923");
        java.util.List<java.lang.String> strList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList0, 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00924");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList0, (int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00925");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.add(companyFileData0, estimateFileData1, sharesFileData2, incSheetFileData3, balSheetFileData4, cashFileData5, (int) (byte) 1, 100);
    }

    @Test
    public void test00926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00926");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double7 = quarterlyDouble5.get(10);
        double double8 = quarterlyDouble5.getTtm();
        double double10 = quarterlyDouble5.get(10);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = quarterlyDouble5.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9999.9999d) + "'", double7 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
    }

    @Test
    public void test00927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00927");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray10 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray10);
        quarterlyDouble4.dArr = doubleArray10;
        double double13 = quarterlyDouble4.getQseqQ();
        double double14 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray15 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray15);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray15);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = quarterlyDouble17.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test00928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00928");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("", (int) (byte) -1, (int) ' ');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test00929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00929");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.add(companyFileData0, estimateFileData1, sharesFileData2, incSheetFileData3, balSheetFileData4, cashFileData5, (int) 'a', 100);
    }

    @Test
    public void test00930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00930");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double[] doubleArray9 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray9);
        double double11 = quarterlyDouble10.getTtm();
        double double13 = quarterlyDouble10.get((int) '4');
        double double16 = quarterlyDouble10.deltaQ((int) (short) 1, 0);
        double[] doubleArray20 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble21 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray20);
        double double22 = quarterlyDouble21.getTtm();
        double double23 = quarterlyDouble21.getQseqQ();
        double[] doubleArray24 = quarterlyDouble21.dArr;
        quarterlyDouble10.dArr = doubleArray24;
        quarterlyDouble5.dArr = doubleArray24;
        double[] doubleArray27 = quarterlyDouble5.dArr;
        // The following exception was thrown during execution in test generation
        try {
            double double30 = quarterlyDouble5.deltaQ((int) (short) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-9999.9999d) + "'", double13 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 5100.0d + "'", double23 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[10.0, 52.0, 1.0]");
    }

    @Test
    public void test00931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00931");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double6 = quarterlyDouble5.getTtmAvg();
        double double7 = quarterlyDouble5.getMostRecent();
        double double10 = quarterlyDouble5.deltaQ((int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = quarterlyDouble5.fmtGrowth1Q("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test00932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00932");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray7 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray7);
        double double9 = quarterlyDouble8.getQseqQ();
        double double10 = quarterlyDouble8.getMostRecent();
        double[] doubleArray11 = quarterlyDouble8.dArr;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = quarterlyDouble8.fmtGrowth4Q("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test00933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00933");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double6 = quarterlyDouble4.get((int) (byte) 1);
        double double7 = quarterlyDouble4.getQseqQ();
        double[] doubleArray11 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray11);
        double double13 = quarterlyDouble12.getTtm();
        double double14 = quarterlyDouble12.getQseqQ();
        double[] doubleArray15 = quarterlyDouble12.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray15);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray15);
        double[] doubleArray21 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble22 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray21);
        double double23 = quarterlyDouble22.getTtmAvg();
        double double24 = quarterlyDouble22.getTtm();
        double double25 = quarterlyDouble22.getTtmAvg();
        double double26 = quarterlyDouble22.getQseqQ();
        double[] doubleArray27 = quarterlyDouble22.dArr;
        quarterlyDouble17.dArr = doubleArray27;
        quarterlyDouble4.dArr = doubleArray27;
        java.lang.Class<?> wildcardClass30 = quarterlyDouble4.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 5100.0d + "'", double7 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 5100.0d + "'", double14 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 5100.0d + "'", double26 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test00934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00934");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!", (int) (short) 1, (int) '#');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test00935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00935");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray10 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray10);
        quarterlyDouble4.dArr = doubleArray10;
        double double13 = quarterlyDouble4.getQseqQ();
        double double14 = quarterlyDouble4.getTtmAvg();
        double double15 = quarterlyDouble4.getTtm();
        java.lang.Class<?> wildcardClass16 = quarterlyDouble4.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5100.0d + "'", double13 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00936");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double[] doubleArray5 = quarterlyDouble4.dArr;
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray7 = new double[] {};
        quarterlyDouble4.dArr = doubleArray7;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray7);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = quarterlyDouble9.getMostRecent();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test00937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00937");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) '4');
        double double10 = quarterlyDouble4.deltaQ((int) (short) 1, 0);
        double[] doubleArray14 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray14);
        double double16 = quarterlyDouble15.getTtm();
        double double17 = quarterlyDouble15.getQseqQ();
        double[] doubleArray18 = quarterlyDouble15.dArr;
        quarterlyDouble4.dArr = doubleArray18;
        double double20 = quarterlyDouble4.getTtm();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = quarterlyDouble4.fmtGrowth1Q("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test00938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00938");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray10 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray10);
        quarterlyDouble4.dArr = doubleArray10;
        double double13 = quarterlyDouble4.getQseqQ();
        double double14 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray18 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray18);
        double double20 = quarterlyDouble19.getTtm();
        double double21 = quarterlyDouble19.getQseqQ();
        double[] doubleArray25 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble26 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray25);
        quarterlyDouble19.dArr = doubleArray25;
        double double28 = quarterlyDouble19.getQseqQ();
        double double29 = quarterlyDouble19.getTtmAvg();
        double double30 = quarterlyDouble19.getTtm();
        double[] doubleArray34 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble35 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray34);
        double double36 = quarterlyDouble35.getTtm();
        double double37 = quarterlyDouble35.getQseqQ();
        double[] doubleArray38 = quarterlyDouble35.dArr;
        quarterlyDouble19.dArr = doubleArray38;
        quarterlyDouble4.dArr = doubleArray38;
        double double41 = quarterlyDouble4.getTtm();
        double double42 = quarterlyDouble4.getTtmAvg();
        // The following exception was thrown during execution in test generation
        try {
            double double43 = quarterlyDouble4.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
    }

    @Test
    public void test00939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00939");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray7 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray7);
        double double9 = quarterlyDouble8.getTtmAvg();
        double double10 = quarterlyDouble8.getTtm();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = quarterlyDouble8.fmtGrowth4Q("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    }

    @Test
    public void test00940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00940");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray10 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray10);
        quarterlyDouble4.dArr = doubleArray10;
        double double13 = quarterlyDouble4.getQseqQ();
        double double14 = quarterlyDouble4.getTtmAvg();
        double double15 = quarterlyDouble4.getTtm();
        double double16 = quarterlyDouble4.getTtm();
        double double18 = quarterlyDouble4.get(1);
        double double21 = quarterlyDouble4.deltaQ(1, (int) (short) -1);
        double double22 = quarterlyDouble4.getMostRecent();
        double double23 = quarterlyDouble4.getMostRecent();
        double[] doubleArray27 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble28 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray27);
        double[] doubleArray29 = quarterlyDouble28.dArr;
        double[] doubleArray30 = quarterlyDouble28.dArr;
        quarterlyDouble4.dArr = doubleArray30;
        double double32 = quarterlyDouble4.getTtmAvg();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str34 = quarterlyDouble4.fmtGrowth4Q("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 52.0d + "'", double18 == 52.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 52.0d + "'", double22 == 52.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 52.0d + "'", double23 == 52.0d);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
    }

    @Test
    public void test00941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00941");
        net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile((-1), (int) (byte) 0);
    }

    @Test
    public void test00942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00942");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray7 = quarterlyDouble4.dArr;
        double[] doubleArray11 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray11);
        quarterlyDouble4.dArr = doubleArray11;
        double double15 = quarterlyDouble4.get(1);
        double double16 = quarterlyDouble4.getQseqQ();
        double double18 = quarterlyDouble4.get((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = quarterlyDouble4.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 5100.0d + "'", double16 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 52.0d + "'", double18 == 52.0d);
    }

    @Test
    public void test00943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00943");
        net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile((int) (short) 10, (int) (short) 0);
    }

    @Test
    public void test00944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00944");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray10 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray10);
        quarterlyDouble4.dArr = doubleArray10;
        double double13 = quarterlyDouble4.getQseqQ();
        double double14 = quarterlyDouble4.getTtmAvg();
        double double15 = quarterlyDouble4.getTtm();
        double[] doubleArray19 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray19);
        double double21 = quarterlyDouble20.getTtm();
        double double22 = quarterlyDouble20.getQseqQ();
        double[] doubleArray23 = quarterlyDouble20.dArr;
        quarterlyDouble4.dArr = doubleArray23;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble25 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray23);
        double[] doubleArray29 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble30 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray29);
        double double31 = quarterlyDouble30.getTtm();
        double double32 = quarterlyDouble30.getQseqQ();
        double[] doubleArray36 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble37 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray36);
        quarterlyDouble30.dArr = doubleArray36;
        double double39 = quarterlyDouble30.getQseqQ();
        double double42 = quarterlyDouble30.deltaQ((int) (short) 100, (int) (byte) -1);
        double double45 = quarterlyDouble30.deltaQ((int) (byte) 100, 0);
        double double46 = quarterlyDouble30.getTtm();
        double[] doubleArray47 = quarterlyDouble30.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble48 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray47);
        quarterlyDouble25.dArr = doubleArray47;
        double double51 = quarterlyDouble25.get((int) ' ');
        double double52 = quarterlyDouble25.getTtm();
        double double53 = quarterlyDouble25.getMostRecent();
        double[] doubleArray57 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble58 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray57);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble59 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray57);
        double[] doubleArray60 = quarterlyDouble59.dArr;
        double[] doubleArray64 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble65 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray64);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble66 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray64);
        double double68 = quarterlyDouble66.get(100);
        double[] doubleArray69 = quarterlyDouble66.dArr;
        quarterlyDouble59.dArr = doubleArray69;
        double[] doubleArray71 = quarterlyDouble59.dArr;
        quarterlyDouble25.dArr = doubleArray71;
        double[] doubleArray73 = quarterlyDouble25.dArr;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str75 = quarterlyDouble25.fmtGrowth1Q("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 5100.0d + "'", double32 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 5100.0d + "'", double39 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + (-9999.9999d) + "'", double51 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 52.0d + "'", double53 == 52.0d);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + (-9999.9999d) + "'", double68 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[10.0, 52.0, 1.0]");
    }

    @Test
    public void test00945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00945");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.add(companyFileData0, estimateFileData1, sharesFileData2, incSheetFileData3, balSheetFileData4, cashFileData5, (int) (short) 0, (int) (byte) 1);
    }

    @Test
    public void test00946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00946");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray7 = quarterlyDouble4.dArr;
        double double8 = quarterlyDouble4.getQseqQ();
        double double9 = quarterlyDouble4.getQseqQ();
        double double10 = quarterlyDouble4.getQseqQ();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = quarterlyDouble4.fmtGrowth1Q("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test00947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00947");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.add(companyFileData0, estimateFileData1, sharesFileData2, incSheetFileData3, balSheetFileData4, cashFileData5, (-1), (-1));
    }

    @Test
    public void test00948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00948");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray7 = quarterlyDouble4.dArr;
        double[] doubleArray11 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray11);
        quarterlyDouble4.dArr = doubleArray11;
        double double14 = quarterlyDouble4.getTtm();
        double[] doubleArray15 = quarterlyDouble4.dArr;
        double double16 = quarterlyDouble4.getTtm();
        double double18 = quarterlyDouble4.get(0);
        double double19 = quarterlyDouble4.getTtm();
        double double21 = quarterlyDouble4.get((int) (short) 10);
        double double22 = quarterlyDouble4.getTtm();
        double double23 = quarterlyDouble4.getMostRecent();
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
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-9999.9999d) + "'", double21 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 52.0d + "'", double23 == 52.0d);
    }

    @Test
    public void test00949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00949");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.add(companyFileData0, estimateFileData1, sharesFileData2, incSheetFileData3, balSheetFileData4, cashFileData5, (int) (short) 100, (int) '#');
    }

    @Test
    public void test00950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00950");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double8 = quarterlyDouble5.deltaQ((int) (byte) 0, 1);
        double double9 = quarterlyDouble5.getTtm();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = quarterlyDouble5.deltaQ(1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test00951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00951");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!", (int) (short) 0, (int) (byte) -1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test00952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00952");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray7 = quarterlyDouble4.dArr;
        double[] doubleArray11 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray11);
        quarterlyDouble4.dArr = doubleArray11;
        double double14 = quarterlyDouble4.getTtm();
        double[] doubleArray15 = quarterlyDouble4.dArr;
        double double16 = quarterlyDouble4.getQseqQ();
        // The following exception was thrown during execution in test generation
        try {
            double double17 = quarterlyDouble4.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test00953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00953");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double7 = quarterlyDouble5.get(10);
        double double8 = quarterlyDouble5.getMostRecent();
        double double10 = quarterlyDouble5.get((int) (byte) -1);
        double double11 = quarterlyDouble5.getTtm();
        double double12 = quarterlyDouble5.getTtmAvg();
        double double13 = quarterlyDouble5.getQseqQ();
        double double14 = quarterlyDouble5.getQseqQ();
        double double15 = quarterlyDouble5.getTtm();
        double[] doubleArray16 = quarterlyDouble5.dArr;
        double double17 = quarterlyDouble5.getTtm();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9999.9999d) + "'", double7 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5100.0d + "'", double13 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 5100.0d + "'", double14 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test00954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00954");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double double6 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.getTtmAvg();
        double double8 = quarterlyDouble4.getMostRecent();
        double double10 = quarterlyDouble4.get((int) '4');
        double[] doubleArray14 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray14);
        quarterlyDouble4.dArr = doubleArray14;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray14);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = quarterlyDouble18.fmtGrowth4Q("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test00955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00955");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray7 = quarterlyDouble4.dArr;
        double double8 = quarterlyDouble4.getQseqQ();
        double double9 = quarterlyDouble4.getTtmAvg();
        double double11 = quarterlyDouble4.get(0);
        double double12 = quarterlyDouble4.getQseqQ();
        double double15 = quarterlyDouble4.deltaQ((int) '4', 100);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = quarterlyDouble4.deltaQ(0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test00956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00956");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray9 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray9);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray9);
        double double13 = quarterlyDouble11.get(100);
        double[] doubleArray14 = quarterlyDouble11.dArr;
        quarterlyDouble4.dArr = doubleArray14;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = quarterlyDouble16.fmtGrowth1Q("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    }

    @Test
    public void test00957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00957");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
        java.lang.String str5 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = companyData1.getFdList();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData9 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList6, (int) (byte) 1, (int) (short) 10);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData12 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList6, (int) (short) 10, (int) (byte) 1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData15 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList6, 0, 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData18 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList6, 100, (int) (byte) 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData21 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList6, (int) 'a', (int) (short) 10);
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNotNull(fieldDataList3);
        org.junit.Assert.assertNotNull(fieldDataList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNull(fieldData9);
        org.junit.Assert.assertNull(fieldData12);
        org.junit.Assert.assertNull(fieldData15);
        org.junit.Assert.assertNull(fieldData18);
        org.junit.Assert.assertNull(fieldData21);
    }

    @Test
    public void test00958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00958");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray9 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray9);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray9);
        double double13 = quarterlyDouble11.get(100);
        double[] doubleArray14 = quarterlyDouble11.dArr;
        quarterlyDouble4.dArr = doubleArray14;
        double double16 = quarterlyDouble4.getQseqQ();
        double[] doubleArray20 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble21 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray20);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble22 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray20);
        double double24 = quarterlyDouble22.get(100);
        double[] doubleArray25 = quarterlyDouble22.dArr;
        double double28 = quarterlyDouble22.deltaQ((int) '4', (int) (byte) 0);
        double[] doubleArray32 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble33 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray32);
        double double34 = quarterlyDouble33.getTtm();
        double double36 = quarterlyDouble33.get((int) '4');
        double[] doubleArray40 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble41 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray40);
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
        double double55 = quarterlyDouble4.deltaQ((int) (short) -1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str57 = quarterlyDouble4.fmtGrowth4Q("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
    }

    @Test
    public void test00959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00959");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("", (int) (byte) 0, (int) (byte) -1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test00960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00960");
        net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile((int) (byte) 0, 100);
    }

    @Test
    public void test00961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00961");
        net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile((int) 'a', (int) (byte) -1);
    }

    @Test
    public void test00962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00962");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double[] doubleArray5 = quarterlyDouble4.dArr;
        double[] doubleArray6 = quarterlyDouble4.dArr;
        double[] doubleArray10 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray10);
        double double12 = quarterlyDouble11.getTtm();
        double double13 = quarterlyDouble11.getQseqQ();
        double[] doubleArray14 = quarterlyDouble11.dArr;
        double double15 = quarterlyDouble11.getQseqQ();
        double[] doubleArray19 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray19);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble21 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray19);
        quarterlyDouble11.dArr = doubleArray19;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble23 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray19);
        quarterlyDouble4.dArr = doubleArray19;
        // The following exception was thrown during execution in test generation
        try {
            double double25 = quarterlyDouble4.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test00963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00963");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray9 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray9);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray9);
        double double13 = quarterlyDouble11.get(100);
        double[] doubleArray14 = quarterlyDouble11.dArr;
        quarterlyDouble4.dArr = doubleArray14;
        double double16 = quarterlyDouble4.getQseqQ();
        double[] doubleArray20 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble21 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray20);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble22 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray20);
        double double24 = quarterlyDouble22.get(100);
        double[] doubleArray25 = quarterlyDouble22.dArr;
        double double28 = quarterlyDouble22.deltaQ((int) '4', (int) (byte) 0);
        double[] doubleArray32 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble33 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray32);
        double double34 = quarterlyDouble33.getTtm();
        double double36 = quarterlyDouble33.get((int) '4');
        double[] doubleArray40 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble41 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray40);
        double[] doubleArray42 = quarterlyDouble41.dArr;
        double double43 = quarterlyDouble41.getQseqQ();
        double[] doubleArray44 = new double[] {};
        quarterlyDouble41.dArr = doubleArray44;
        quarterlyDouble33.dArr = doubleArray44;
        double[] doubleArray47 = quarterlyDouble33.dArr;
        quarterlyDouble22.dArr = doubleArray47;
        quarterlyDouble4.dArr = doubleArray47;
        double[] doubleArray53 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble54 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray53);
        double double55 = quarterlyDouble54.getTtm();
        double double56 = quarterlyDouble54.getQseqQ();
        double[] doubleArray57 = quarterlyDouble54.dArr;
        double double58 = quarterlyDouble54.getQseqQ();
        double[] doubleArray62 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble63 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray62);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble64 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray62);
        quarterlyDouble54.dArr = doubleArray62;
        double[] doubleArray66 = quarterlyDouble54.dArr;
        quarterlyDouble4.dArr = doubleArray66;
        // The following exception was thrown during execution in test generation
        try {
            double double70 = quarterlyDouble4.deltaQ(0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 5100.0d + "'", double56 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 5100.0d + "'", double58 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[10.0, 52.0, 1.0]");
    }

    @Test
    public void test00964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00964");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("", (-1), (int) (byte) -1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test00965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00965");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray10 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray10);
        quarterlyDouble4.dArr = doubleArray10;
        double[] doubleArray16 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray16);
        double double18 = quarterlyDouble17.getTtm();
        double double19 = quarterlyDouble17.getQseqQ();
        double[] doubleArray20 = quarterlyDouble17.dArr;
        double[] doubleArray24 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble25 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray24);
        quarterlyDouble17.dArr = doubleArray24;
        double double27 = quarterlyDouble17.getTtm();
        double[] doubleArray28 = quarterlyDouble17.dArr;
        double double29 = quarterlyDouble17.getTtm();
        double[] doubleArray30 = quarterlyDouble17.dArr;
        quarterlyDouble4.dArr = doubleArray30;
        double double32 = quarterlyDouble4.getMostRecent();
        double double35 = quarterlyDouble4.deltaQ((int) (byte) 10, (int) (byte) 0);
        double double36 = quarterlyDouble4.getQseqQ();
        double[] doubleArray37 = quarterlyDouble4.dArr;
        double[] doubleArray38 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble39 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray38);
        double[] doubleArray43 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble44 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray43);
        double double45 = quarterlyDouble44.getTtm();
        double double46 = quarterlyDouble44.getQseqQ();
        double[] doubleArray47 = quarterlyDouble44.dArr;
        double[] doubleArray51 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble52 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray51);
        quarterlyDouble44.dArr = doubleArray51;
        double[] doubleArray54 = quarterlyDouble44.dArr;
        quarterlyDouble39.dArr = doubleArray54;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble56 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray54);
        quarterlyDouble4.dArr = doubleArray54;
        double double60 = quarterlyDouble4.deltaQ((-1), (-1));
        // The following exception was thrown during execution in test generation
        try {
            double double63 = quarterlyDouble4.deltaQ((int) (short) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 52.0d + "'", double32 == 52.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 5100.0d + "'", double36 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 5100.0d + "'", double46 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
    }

    @Test
    public void test00966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00966");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray7 = quarterlyDouble4.dArr;
        double double8 = quarterlyDouble4.getQseqQ();
        double[] doubleArray12 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray12);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray12);
        quarterlyDouble4.dArr = doubleArray12;
        double[] doubleArray16 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray16);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray16);
        double[] doubleArray22 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble23 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray22);
        double double24 = quarterlyDouble23.getTtm();
        double double26 = quarterlyDouble23.get((int) '4');
        double[] doubleArray30 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble31 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray30);
        double[] doubleArray32 = quarterlyDouble31.dArr;
        double double33 = quarterlyDouble31.getQseqQ();
        double[] doubleArray34 = new double[] {};
        quarterlyDouble31.dArr = doubleArray34;
        quarterlyDouble23.dArr = doubleArray34;
        double[] doubleArray37 = quarterlyDouble23.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble38 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray37);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble39 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray37);
        quarterlyDouble18.dArr = doubleArray37;
        java.lang.Class<?> wildcardClass41 = doubleArray37.getClass();
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
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[]");
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test00967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00967");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray10 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray10);
        quarterlyDouble4.dArr = doubleArray10;
        double double13 = quarterlyDouble4.getQseqQ();
        double double16 = quarterlyDouble4.deltaQ((int) (short) 100, (int) (byte) -1);
        double double19 = quarterlyDouble4.deltaQ((int) (byte) 100, 0);
        double[] doubleArray20 = quarterlyDouble4.dArr;
        double[] doubleArray21 = quarterlyDouble4.dArr;
        java.lang.Class<?> wildcardClass22 = quarterlyDouble4.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5100.0d + "'", double13 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00968");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double double6 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.getTtmAvg();
        double double8 = quarterlyDouble4.getMostRecent();
        double double10 = quarterlyDouble4.get((int) '4');
        double[] doubleArray14 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray14);
        quarterlyDouble4.dArr = doubleArray14;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray14);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = quarterlyDouble17.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test00969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00969");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) '4');
        double[] doubleArray11 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray11);
        double[] doubleArray13 = quarterlyDouble12.dArr;
        double double14 = quarterlyDouble12.getQseqQ();
        double[] doubleArray15 = new double[] {};
        quarterlyDouble12.dArr = doubleArray15;
        quarterlyDouble4.dArr = doubleArray15;
        double[] doubleArray18 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray18);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray18);
        double double21 = quarterlyDouble20.getTtmAvg();
        double double22 = quarterlyDouble20.getTtmAvg();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = quarterlyDouble20.fmtGrowth4Q("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test00970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00970");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) '4');
        double double10 = quarterlyDouble4.deltaQ((int) (short) 1, 0);
        double double11 = quarterlyDouble4.getMostRecent();
        double double14 = quarterlyDouble4.deltaQ((int) (byte) 1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = quarterlyDouble4.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9999.9999d) + "'", double7 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test00971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00971");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray10 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray10);
        quarterlyDouble4.dArr = doubleArray10;
        double double13 = quarterlyDouble4.getQseqQ();
        double double16 = quarterlyDouble4.deltaQ((int) (short) 100, (int) (byte) -1);
        double double19 = quarterlyDouble4.deltaQ((int) (byte) 100, 0);
        double[] doubleArray20 = quarterlyDouble4.dArr;
        double double21 = quarterlyDouble4.getQseqQ();
        double[] doubleArray22 = quarterlyDouble4.dArr;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = quarterlyDouble4.fmtGrowth1Q("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 5100.0d + "'", double21 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, 52.0, 1.0]");
    }

    @Test
    public void test00972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00972");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData6 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList3, (int) (short) 10, 1);
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNotNull(fieldDataList3);
        org.junit.Assert.assertNull(fieldData6);
    }

    @Test
    public void test00973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00973");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) '4');
        double double10 = quarterlyDouble4.deltaQ(10, (int) (short) 10);
        double double13 = quarterlyDouble4.deltaQ((int) (byte) -1, 0);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = quarterlyDouble4.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9999.9999d) + "'", double7 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test00974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00974");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double6 = quarterlyDouble5.getTtmAvg();
        double double7 = quarterlyDouble5.getTtmAvg();
        double double8 = quarterlyDouble5.getTtmAvg();
        double[] doubleArray9 = quarterlyDouble5.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray9);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray9);
        double double12 = quarterlyDouble11.getMostRecent();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
    }

    @Test
    public void test00975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00975");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double6 = quarterlyDouble5.getTtmAvg();
        double double7 = quarterlyDouble5.getTtmAvg();
        double double8 = quarterlyDouble5.getTtmAvg();
        double[] doubleArray9 = quarterlyDouble5.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray9);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = quarterlyDouble11.fmtGrowth1Q("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0, 52.0, 1.0]");
    }

    @Test
    public void test00976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00976");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double7 = quarterlyDouble5.get(10);
        double double8 = quarterlyDouble5.getTtm();
        double double11 = quarterlyDouble5.deltaQ(10, 0);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9999.9999d) + "'", double7 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test00977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00977");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("", (int) ' ', 1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test00978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00978");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray7 = quarterlyDouble4.dArr;
        double[] doubleArray11 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray11);
        quarterlyDouble4.dArr = doubleArray11;
        double double14 = quarterlyDouble4.getTtm();
        double[] doubleArray15 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray15);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray15);
        double double19 = quarterlyDouble17.get((int) (byte) 10);
        double double20 = quarterlyDouble17.getTtmAvg();
        double[] doubleArray24 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble25 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray24);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble26 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray24);
        double[] doubleArray30 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble31 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray30);
        double double32 = quarterlyDouble31.getTtm();
        double double34 = quarterlyDouble31.get((int) '4');
        double double37 = quarterlyDouble31.deltaQ((int) (short) 1, 0);
        double[] doubleArray41 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble42 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray41);
        double double43 = quarterlyDouble42.getTtm();
        double double44 = quarterlyDouble42.getQseqQ();
        double[] doubleArray45 = quarterlyDouble42.dArr;
        quarterlyDouble31.dArr = doubleArray45;
        quarterlyDouble26.dArr = doubleArray45;
        quarterlyDouble17.dArr = doubleArray45;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble49 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray45);
        double double50 = quarterlyDouble49.getTtmAvg();
        // The following exception was thrown during execution in test generation
        try {
            double double51 = quarterlyDouble49.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + (-9999.9999d) + "'", double34 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 5100.0d + "'", double44 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
    }

    @Test
    public void test00979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00979");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!", 100, (int) '#');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test00980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00980");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray10 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray10);
        quarterlyDouble4.dArr = doubleArray10;
        double double13 = quarterlyDouble4.getQseqQ();
        double double16 = quarterlyDouble4.deltaQ((int) (short) 100, (int) (byte) -1);
        double[] doubleArray20 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble21 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray20);
        double double22 = quarterlyDouble21.getTtmAvg();
        double double23 = quarterlyDouble21.getMostRecent();
        double double25 = quarterlyDouble21.get((int) 'a');
        double double27 = quarterlyDouble21.get((int) (byte) -1);
        double[] doubleArray31 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble32 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray31);
        double double33 = quarterlyDouble32.getTtm();
        double double34 = quarterlyDouble32.getQseqQ();
        double[] doubleArray35 = quarterlyDouble32.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble36 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray35);
        quarterlyDouble21.dArr = doubleArray35;
        quarterlyDouble4.dArr = doubleArray35;
        double double41 = quarterlyDouble4.deltaQ((-1), 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str43 = quarterlyDouble4.fmtGrowth1Q("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
    }

    @Test
    public void test00981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00981");
        net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile((int) (byte) 1, (-1));
    }

    @Test
    public void test00982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00982");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double6 = quarterlyDouble4.get((int) (byte) 1);
        double double7 = quarterlyDouble4.getMostRecent();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = quarterlyDouble4.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
    }

    @Test
    public void test00983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00983");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray7 = quarterlyDouble4.dArr;
        double double8 = quarterlyDouble4.getQseqQ();
        double[] doubleArray12 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray12);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray12);
        quarterlyDouble4.dArr = doubleArray12;
        double[] doubleArray19 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray19);
        double[] doubleArray21 = quarterlyDouble20.dArr;
        double[] doubleArray22 = quarterlyDouble20.dArr;
        quarterlyDouble4.dArr = doubleArray22;
        // The following exception was thrown during execution in test generation
        try {
            double double24 = quarterlyDouble4.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test00984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00984");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("", (int) (byte) 10, (int) (short) 100);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test00985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00985");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double[] doubleArray5 = quarterlyDouble4.dArr;
        double[] doubleArray6 = quarterlyDouble4.dArr;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = quarterlyDouble4.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test00986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00986");
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) ' ', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00987");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray10 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray10);
        quarterlyDouble4.dArr = doubleArray10;
        double double13 = quarterlyDouble4.getQseqQ();
        double double14 = quarterlyDouble4.getTtmAvg();
        double double15 = quarterlyDouble4.getTtm();
        double double16 = quarterlyDouble4.getTtm();
        double double18 = quarterlyDouble4.get(1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = quarterlyDouble4.fmtGrowth4Q("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 52.0d + "'", double18 == 52.0d);
    }

    @Test
    public void test00988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00988");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double7 = quarterlyDouble5.get(100);
        double[] doubleArray8 = quarterlyDouble5.dArr;
        double double11 = quarterlyDouble5.deltaQ((int) '4', (int) (byte) 0);
        double[] doubleArray15 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray15);
        double double17 = quarterlyDouble16.getTtm();
        double double19 = quarterlyDouble16.get((int) '4');
        double[] doubleArray23 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble24 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray23);
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
            double double34 = quarterlyDouble5.getMostRecent();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test00989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00989");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("", (-1), 10);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test00990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00990");
        net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile((int) (short) 1, (int) (short) -1);
    }

    @Test
    public void test00991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00991");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray7 = quarterlyDouble4.dArr;
        double double8 = quarterlyDouble4.getQseqQ();
        double[] doubleArray12 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray12);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray12);
        quarterlyDouble4.dArr = doubleArray12;
        double[] doubleArray19 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray19);
        double[] doubleArray21 = quarterlyDouble20.dArr;
        double[] doubleArray22 = quarterlyDouble20.dArr;
        quarterlyDouble4.dArr = doubleArray22;
        double double24 = quarterlyDouble4.getQseqQ();
        double double25 = quarterlyDouble4.getTtm();
        double[] doubleArray29 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble30 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray29);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble31 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray29);
        double[] doubleArray32 = quarterlyDouble31.dArr;
        double[] doubleArray36 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble37 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray36);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble38 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray36);
        double double40 = quarterlyDouble38.get(100);
        double[] doubleArray41 = quarterlyDouble38.dArr;
        quarterlyDouble31.dArr = doubleArray41;
        double[] doubleArray46 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble47 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray46);
        double double48 = quarterlyDouble47.getTtm();
        double double49 = quarterlyDouble47.getQseqQ();
        double[] doubleArray50 = quarterlyDouble47.dArr;
        double double51 = quarterlyDouble47.getQseqQ();
        double double52 = quarterlyDouble47.getQseqQ();
        double double53 = quarterlyDouble47.getQseqQ();
        double[] doubleArray54 = quarterlyDouble47.dArr;
        quarterlyDouble31.dArr = doubleArray54;
        double double57 = quarterlyDouble31.get((int) (byte) -1);
        double[] doubleArray61 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble62 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray61);
        double double63 = quarterlyDouble62.getTtm();
        double double65 = quarterlyDouble62.get((int) '4');
        double[] doubleArray69 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble70 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray69);
        double[] doubleArray71 = quarterlyDouble70.dArr;
        double double72 = quarterlyDouble70.getQseqQ();
        double[] doubleArray73 = new double[] {};
        quarterlyDouble70.dArr = doubleArray73;
        quarterlyDouble62.dArr = doubleArray73;
        double[] doubleArray76 = quarterlyDouble62.dArr;
        quarterlyDouble31.dArr = doubleArray76;
        quarterlyDouble4.dArr = doubleArray76;
        // The following exception was thrown during execution in test generation
        try {
            double double79 = quarterlyDouble4.getQseqQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + (-9999.9999d) + "'", double40 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 5100.0d + "'", double49 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 5100.0d + "'", double51 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 5100.0d + "'", double52 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 5100.0d + "'", double53 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + (-9999.9999d) + "'", double57 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.0d + "'", double63 == 0.0d);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + (-9999.9999d) + "'", double65 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 5100.0d + "'", double72 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[]");
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[]");
    }

    @Test
    public void test00992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00992");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double6 = quarterlyDouble4.get((int) (byte) 1);
        double double7 = quarterlyDouble4.getQseqQ();
        double double8 = quarterlyDouble4.getQseqQ();
        double double9 = quarterlyDouble4.getTtmAvg();
        double double10 = quarterlyDouble4.getTtm();
        double[] doubleArray11 = quarterlyDouble4.dArr;
        double double13 = quarterlyDouble4.get(10);
        double double14 = quarterlyDouble4.getQseqQ();
        double double15 = quarterlyDouble4.getQseqQ();
        double double17 = quarterlyDouble4.get((int) (short) -1);
        double double18 = quarterlyDouble4.getTtmAvg();
        double double19 = quarterlyDouble4.getTtm();
        double[] doubleArray23 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble24 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray23);
        double double25 = quarterlyDouble24.getTtmAvg();
        double double26 = quarterlyDouble24.getTtm();
        double double27 = quarterlyDouble24.getMostRecent();
        double double28 = quarterlyDouble24.getTtmAvg();
        double double29 = quarterlyDouble24.getMostRecent();
        double[] doubleArray33 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble34 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray33);
        double[] doubleArray35 = quarterlyDouble34.dArr;
        double[] doubleArray36 = quarterlyDouble34.dArr;
        double[] doubleArray40 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble41 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray40);
        double double42 = quarterlyDouble41.getTtm();
        double double43 = quarterlyDouble41.getQseqQ();
        double[] doubleArray44 = quarterlyDouble41.dArr;
        double double45 = quarterlyDouble41.getQseqQ();
        double[] doubleArray49 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble50 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray49);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble51 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray49);
        quarterlyDouble41.dArr = doubleArray49;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble53 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray49);
        quarterlyDouble34.dArr = doubleArray49;
        quarterlyDouble24.dArr = doubleArray49;
        double[] doubleArray59 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble60 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray59);
        double double61 = quarterlyDouble60.getTtm();
        double double62 = quarterlyDouble60.getQseqQ();
        double[] doubleArray63 = quarterlyDouble60.dArr;
        double double64 = quarterlyDouble60.getQseqQ();
        double[] doubleArray68 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble69 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray68);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble70 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray68);
        quarterlyDouble60.dArr = doubleArray68;
        double[] doubleArray75 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble76 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray75);
        double[] doubleArray77 = quarterlyDouble76.dArr;
        double[] doubleArray78 = quarterlyDouble76.dArr;
        quarterlyDouble60.dArr = doubleArray78;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble80 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray78);
        double[] doubleArray81 = quarterlyDouble80.dArr;
        quarterlyDouble24.dArr = doubleArray81;
        quarterlyDouble4.dArr = doubleArray81;
        // The following exception was thrown during execution in test generation
        try {
            double double84 = quarterlyDouble4.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 5100.0d + "'", double15 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-9999.9999d) + "'", double17 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 52.0d + "'", double27 == 52.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 52.0d + "'", double29 == 52.0d);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 5100.0d + "'", double43 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 5100.0d + "'", double45 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.0d + "'", double61 == 0.0d);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 5100.0d + "'", double62 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 5100.0d + "'", double64 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray81), "[10.0, 52.0, 1.0]");
    }

    @Test
    public void test00993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00993");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("", (-1), (int) ' ');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test00994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00994");
        net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile(1, (int) (byte) 1);
    }

    @Test
    public void test00995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00995");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray10 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray10);
        quarterlyDouble4.dArr = doubleArray10;
        double double13 = quarterlyDouble4.getQseqQ();
        double double14 = quarterlyDouble4.getTtmAvg();
        double double15 = quarterlyDouble4.getTtm();
        double[] doubleArray19 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray19);
        double double21 = quarterlyDouble20.getTtm();
        double double22 = quarterlyDouble20.getQseqQ();
        double[] doubleArray23 = quarterlyDouble20.dArr;
        quarterlyDouble4.dArr = doubleArray23;
        double double25 = quarterlyDouble4.getQseqQ();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = quarterlyDouble4.fmtGrowth1Q("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 5100.0d + "'", double25 == 5100.0d);
    }

    @Test
    public void test00996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00996");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.add(companyFileData0, estimateFileData1, sharesFileData2, incSheetFileData3, balSheetFileData4, cashFileData5, (int) '4', (int) (short) 10);
    }

    @Test
    public void test00997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00997");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double7 = quarterlyDouble5.get(10);
        double double8 = quarterlyDouble5.getMostRecent();
        double double10 = quarterlyDouble5.get((int) (byte) -1);
        double double11 = quarterlyDouble5.getTtm();
        double[] doubleArray15 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray15);
        double double17 = quarterlyDouble16.getTtm();
        double double18 = quarterlyDouble16.getQseqQ();
        double[] doubleArray19 = quarterlyDouble16.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray19);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble21 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray19);
        quarterlyDouble5.dArr = doubleArray19;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = quarterlyDouble5.fmtGrowth1Q("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9999.9999d) + "'", double7 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 5100.0d + "'", double18 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 52.0, 1.0]");
    }

    @Test
    public void test00998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00998");
        net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile(0, 0);
    }

    @Test
    public void test00999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test00999");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray10 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray10);
        quarterlyDouble4.dArr = doubleArray10;
        double double13 = quarterlyDouble4.getQseqQ();
        double double14 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray15 = quarterlyDouble4.dArr;
        double double16 = quarterlyDouble4.getTtmAvg();
        double double17 = quarterlyDouble4.getQseqQ();
        // The following exception was thrown during execution in test generation
        try {
            double double18 = quarterlyDouble4.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 5100.0d + "'", double17 == 5100.0d);
    }

    @Test
    public void test01000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test01000");
        net.ajaskey.market.tools.SIP.BigDB.dataio.DowEnum dowEnum0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, (int) (byte) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }
}

