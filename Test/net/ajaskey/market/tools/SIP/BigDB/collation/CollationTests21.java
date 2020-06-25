package net.ajaskey.market.tools.SIP.BigDB.collation;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CollationTests21 {

    public static boolean debug = false;

    @Test
    public void test10501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10501");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray7 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray7);
        double double9 = quarterlyDouble8.getQseqQ();
        double double10 = quarterlyDouble8.getTtm();
        double double12 = quarterlyDouble8.get((int) (short) 0);
        double double13 = quarterlyDouble8.getQseqQ();
        double[] doubleArray14 = quarterlyDouble8.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray14);
        double double16 = quarterlyDouble15.getTtm();
        double[] doubleArray17 = quarterlyDouble15.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray17);
        double double21 = quarterlyDouble18.deltaQ((int) ' ', (int) '4');
        double double23 = quarterlyDouble18.get(0);
        double double24 = quarterlyDouble18.getTtmAvg();
        double double25 = quarterlyDouble18.getTtm();
        double double26 = quarterlyDouble18.getQseqQ();
        // The following exception was thrown during execution in test generation
        try {
            double double29 = quarterlyDouble18.deltaQ((int) (byte) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5100.0d + "'", double13 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 5100.0d + "'", double26 == 5100.0d);
    }

    @Test
    public void test10502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10502");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray7 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray7);
        double double9 = quarterlyDouble8.getQseqQ();
        double double10 = quarterlyDouble8.getTtm();
        double double12 = quarterlyDouble8.get((int) (short) 0);
        double double13 = quarterlyDouble8.getQseqQ();
        double[] doubleArray14 = quarterlyDouble8.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray14);
        double double16 = quarterlyDouble15.getTtm();
        double[] doubleArray17 = quarterlyDouble15.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray17);
        double double21 = quarterlyDouble18.deltaQ((int) ' ', (int) '4');
        double double23 = quarterlyDouble18.get(0);
        double double24 = quarterlyDouble18.getTtmAvg();
        double double25 = quarterlyDouble18.getTtm();
        double double26 = quarterlyDouble18.getTtm();
        double[] doubleArray30 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble31 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray30);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble32 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray30);
        double[] doubleArray36 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble37 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray36);
        double double38 = quarterlyDouble37.getTtm();
        double double40 = quarterlyDouble37.get((int) '4');
        double double43 = quarterlyDouble37.deltaQ((int) (short) 1, 0);
        double[] doubleArray47 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble48 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray47);
        double double49 = quarterlyDouble48.getTtm();
        double double50 = quarterlyDouble48.getQseqQ();
        double[] doubleArray51 = quarterlyDouble48.dArr;
        quarterlyDouble37.dArr = doubleArray51;
        quarterlyDouble32.dArr = doubleArray51;
        double[] doubleArray54 = quarterlyDouble32.dArr;
        double[] doubleArray55 = quarterlyDouble32.dArr;
        double double58 = quarterlyDouble32.deltaQ((-1), (int) (byte) 0);
        double double60 = quarterlyDouble32.get((int) '4');
        double[] doubleArray61 = quarterlyDouble32.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble62 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray61);
        quarterlyDouble18.dArr = doubleArray61;
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
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + (-9999.9999d) + "'", double40 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 5100.0d + "'", double50 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + (-9999.9999d) + "'", double60 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[10.0, 52.0, 1.0]");
    }

    @Test
    public void test10503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10503");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble24 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray22);
        double[] doubleArray25 = quarterlyDouble24.dArr;
        double[] doubleArray26 = quarterlyDouble24.dArr;
        double double28 = quarterlyDouble24.get((int) '#');
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
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-9999.9999d) + "'", double28 == (-9999.9999d));
    }

    @Test
    public void test10504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10504");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double7 = quarterlyDouble4.deltaQ((int) (short) 10, (int) (short) 100);
        double[] doubleArray8 = quarterlyDouble4.dArr;
        double[] doubleArray9 = quarterlyDouble4.dArr;
        double[] doubleArray10 = quarterlyDouble4.dArr;
        double double11 = quarterlyDouble4.getQseqQ();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = quarterlyDouble4.getQoQ();
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
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 5100.0d + "'", double11 == 5100.0d);
    }

    @Test
    public void test10505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10505");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("");
        java.lang.String str2 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
        java.lang.String str4 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList5 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = companyData1.getFdList();
        java.lang.String str9 = companyData1.getTicker();
        java.lang.String str10 = companyData1.getTicker();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(fieldDataList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(fieldDataList5);
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList7);
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test10506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10506");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
        java.lang.String str4 = companyData1.getTicker();
        java.lang.String str5 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = companyData1.getFdList();
        java.lang.String str8 = companyData1.getTicker();
        java.lang.String str9 = companyData1.getTicker();
        java.lang.String str10 = companyData1.getTicker();
        java.lang.String str11 = companyData1.getTicker();
        java.lang.String str12 = companyData1.getTicker();
        java.lang.String str13 = companyData1.getTicker();
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNotNull(fieldDataList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test10507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10507");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray7 = quarterlyDouble4.dArr;
        double double8 = quarterlyDouble4.getTtm();
        double[] doubleArray9 = quarterlyDouble4.dArr;
        double[] doubleArray10 = quarterlyDouble4.dArr;
        double[] doubleArray11 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray11);
        double[] doubleArray13 = quarterlyDouble12.dArr;
        double double14 = quarterlyDouble12.getTtmAvg();
        double double17 = quarterlyDouble12.deltaQ((int) (short) 100, 100);
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
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test10508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10508");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray7 = quarterlyDouble4.dArr;
        double double8 = quarterlyDouble4.getTtm();
        double[] doubleArray9 = quarterlyDouble4.dArr;
        double[] doubleArray10 = quarterlyDouble4.dArr;
        double double11 = quarterlyDouble4.getQseqQ();
        double[] doubleArray12 = quarterlyDouble4.dArr;
        double double14 = quarterlyDouble4.get(0);
        double double16 = quarterlyDouble4.get((int) '#');
        double double17 = quarterlyDouble4.getMostRecent();
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
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 5100.0d + "'", double11 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-9999.9999d) + "'", double16 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 52.0d + "'", double17 == 52.0d);
    }

    @Test
    public void test10509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10509");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double6 = quarterlyDouble5.getMostRecent();
        double double7 = quarterlyDouble5.getMostRecent();
        double[] doubleArray8 = quarterlyDouble5.dArr;
        double[] doubleArray12 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray12);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray12);
        double[] doubleArray15 = quarterlyDouble14.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray15);
        double double17 = quarterlyDouble16.getMostRecent();
        double[] doubleArray21 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble22 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray21);
        double double23 = quarterlyDouble22.getTtm();
        double double24 = quarterlyDouble22.getQseqQ();
        double[] doubleArray25 = quarterlyDouble22.dArr;
        double double26 = quarterlyDouble22.getQseqQ();
        double[] doubleArray30 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble31 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray30);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble32 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray30);
        quarterlyDouble22.dArr = doubleArray30;
        double[] doubleArray34 = quarterlyDouble22.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble35 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray34);
        quarterlyDouble16.dArr = doubleArray34;
        double double39 = quarterlyDouble16.deltaQ((int) 'a', (int) ' ');
        double double41 = quarterlyDouble16.get(0);
        double double42 = quarterlyDouble16.getTtmAvg();
        double[] doubleArray46 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble47 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray46);
        double double48 = quarterlyDouble47.getTtmAvg();
        double double49 = quarterlyDouble47.getTtm();
        double double50 = quarterlyDouble47.getTtmAvg();
        double double51 = quarterlyDouble47.getMostRecent();
        double double53 = quarterlyDouble47.get((int) '4');
        double[] doubleArray57 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble58 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray57);
        quarterlyDouble47.dArr = doubleArray57;
        double[] doubleArray60 = quarterlyDouble47.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble61 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray60);
        quarterlyDouble16.dArr = doubleArray60;
        quarterlyDouble5.dArr = doubleArray60;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble64 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray60);
        double[] doubleArray68 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble69 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray68);
        double[] doubleArray70 = quarterlyDouble69.dArr;
        double double71 = quarterlyDouble69.getQseqQ();
        double[] doubleArray72 = quarterlyDouble69.dArr;
        quarterlyDouble64.dArr = doubleArray72;
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 52.0d + "'", double17 == 52.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 5100.0d + "'", double24 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 5100.0d + "'", double26 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 10.0d + "'", double41 == 10.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 52.0d + "'", double51 == 52.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + (-9999.9999d) + "'", double53 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 5100.0d + "'", double71 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[10.0, 52.0, 1.0]");
    }

    @Test
    public void test10510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10510");
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
        double double31 = quarterlyDouble7.getQseqQ();
        double[] doubleArray32 = quarterlyDouble7.dArr;
        double double35 = quarterlyDouble7.deltaQ((int) (byte) 10, 0);
        double double36 = quarterlyDouble7.getTtmAvg();
        double double38 = quarterlyDouble7.get((int) 'a');
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
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 5100.0d + "'", double31 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + (-9999.9999d) + "'", double38 == (-9999.9999d));
    }

    @Test
    public void test10511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10511");
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
        double double24 = quarterlyDouble20.get((int) (byte) 10);
        double double26 = quarterlyDouble20.get((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double29 = quarterlyDouble20.deltaQ((-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-9999.9999d) + "'", double24 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-9999.9999d) + "'", double26 == (-9999.9999d));
    }

    @Test
    public void test10512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10512");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%)", (-1), 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test10513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10513");
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
        double double17 = quarterlyDouble4.get((int) (byte) 10);
        double double18 = quarterlyDouble4.getTtm();
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
        double[] doubleArray43 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble44 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray43);
        double double45 = quarterlyDouble44.getTtm();
        double double46 = quarterlyDouble44.getQseqQ();
        double[] doubleArray50 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble51 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray50);
        quarterlyDouble44.dArr = doubleArray50;
        double double53 = quarterlyDouble44.getQseqQ();
        double double56 = quarterlyDouble44.deltaQ((int) (short) 100, (int) (byte) -1);
        double[] doubleArray60 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble61 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray60);
        double double62 = quarterlyDouble61.getTtmAvg();
        double double63 = quarterlyDouble61.getMostRecent();
        double double65 = quarterlyDouble61.get((int) 'a');
        double double67 = quarterlyDouble61.get((int) (byte) -1);
        double[] doubleArray71 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble72 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray71);
        double double73 = quarterlyDouble72.getTtm();
        double double74 = quarterlyDouble72.getQseqQ();
        double[] doubleArray75 = quarterlyDouble72.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble76 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray75);
        quarterlyDouble61.dArr = doubleArray75;
        quarterlyDouble44.dArr = doubleArray75;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble79 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray75);
        quarterlyDouble39.dArr = doubleArray75;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble81 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray75);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble82 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray75);
        quarterlyDouble4.dArr = doubleArray75;
        double double84 = quarterlyDouble4.getTtm();
        double double85 = quarterlyDouble4.getMostRecent();
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
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
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
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 5100.0d + "'", double46 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 5100.0d + "'", double53 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.0d + "'", double62 == 0.0d);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 52.0d + "'", double63 == 52.0d);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + (-9999.9999d) + "'", double65 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + (-9999.9999d) + "'", double67 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 0.0d + "'", double73 == 0.0d);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 5100.0d + "'", double74 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 0.0d + "'", double84 == 0.0d);
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 52.0d + "'", double85 == 52.0d);
    }

    @Test
    public void test10514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10514");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
        java.lang.String str5 = companyData1.getTicker();
        java.lang.String str6 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = companyData1.getFdList();
        java.lang.String str10 = companyData1.getTicker();
        java.lang.String str11 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = companyData1.getFdList();
        java.lang.String str16 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = companyData1.getFdList();
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNotNull(fieldDataList3);
        org.junit.Assert.assertNotNull(fieldDataList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(fieldDataList7);
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList13);
        org.junit.Assert.assertNotNull(fieldDataList14);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(fieldDataList17);
    }

    @Test
    public void test10515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10515");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble50 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray44);
        double double52 = quarterlyDouble50.get((int) (byte) 0);
        double double54 = quarterlyDouble50.get(0);
        double double56 = quarterlyDouble50.get((int) '4');
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
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + (-9999.9999d) + "'", double52 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + (-9999.9999d) + "'", double54 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + (-9999.9999d) + "'", double56 == (-9999.9999d));
    }

    @Test
    public void test10516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10516");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList2, (int) (short) 0, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList7 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList((java.util.List<java.lang.String>) strList2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList8 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList((java.util.List<java.lang.String>) strList2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList11 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList2, 0, (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList14 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList2, (int) (short) 10, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList17 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList2, (int) (byte) 10, (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList20 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList2, (int) (short) 1, (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList23 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList2, (int) 'a', 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList26 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList2, (int) (short) -1, (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList29 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList2, (int) ' ', (int) (byte) 100);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(companyDataList6);
        org.junit.Assert.assertNotNull(manyCompanyDataList7);
        org.junit.Assert.assertNotNull(manyCompanyDataList8);
        org.junit.Assert.assertNotNull(companyDataList11);
        org.junit.Assert.assertNotNull(companyDataList14);
        org.junit.Assert.assertNotNull(companyDataList17);
        org.junit.Assert.assertNotNull(companyDataList20);
        org.junit.Assert.assertNotNull(companyDataList23);
        org.junit.Assert.assertNotNull(companyDataList26);
        org.junit.Assert.assertNotNull(companyDataList29);
    }

    @Test
    public void test10517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10517");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("");
        java.lang.String str2 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
        java.lang.String str4 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList5 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = companyData1.getFdList();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData12 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList9, (int) 'a', (int) (short) 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData15 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList9, (int) '4', (int) (short) -1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData18 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList9, (int) (short) 100, (int) '#');
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData21 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList9, (int) (short) 1, (int) (short) 1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData24 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList9, (int) (short) -1, (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(fieldDataList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(fieldDataList5);
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList7);
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNull(fieldData12);
        org.junit.Assert.assertNull(fieldData15);
        org.junit.Assert.assertNull(fieldData18);
        org.junit.Assert.assertNull(fieldData21);
        org.junit.Assert.assertNull(fieldData24);
    }

    @Test
    public void test10518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10518");
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
        double double20 = quarterlyDouble19.getTtmAvg();
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
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test10519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10519");
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
        double[] doubleArray19 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray19);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble21 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray19);
        double[] doubleArray22 = quarterlyDouble21.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble23 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray22);
        double double24 = quarterlyDouble23.getMostRecent();
        double[] doubleArray28 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble29 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray28);
        double double30 = quarterlyDouble29.getTtm();
        double double31 = quarterlyDouble29.getQseqQ();
        double[] doubleArray32 = quarterlyDouble29.dArr;
        double double33 = quarterlyDouble29.getQseqQ();
        double[] doubleArray37 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble38 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray37);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble39 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray37);
        quarterlyDouble29.dArr = doubleArray37;
        double[] doubleArray41 = quarterlyDouble29.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble42 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray41);
        quarterlyDouble23.dArr = doubleArray41;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble44 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray41);
        quarterlyDouble8.dArr = doubleArray41;
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
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 52.0d + "'", double24 == 52.0d);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 5100.0d + "'", double31 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 5100.0d + "'", double33 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[10.0, 52.0, 1.0]");
    }

    @Test
    public void test10520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10520");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray10 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray10);
        quarterlyDouble4.dArr = doubleArray10;
        double double13 = quarterlyDouble4.getTtmAvg();
        double double14 = quarterlyDouble4.getTtm();
        double double15 = quarterlyDouble4.getMostRecent();
        double double16 = quarterlyDouble4.getTtm();
        double[] doubleArray20 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble21 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray20);
        double double22 = quarterlyDouble21.getTtm();
        double double23 = quarterlyDouble21.getQseqQ();
        double[] doubleArray27 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble28 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray27);
        quarterlyDouble21.dArr = doubleArray27;
        double double30 = quarterlyDouble21.getQseqQ();
        double double33 = quarterlyDouble21.deltaQ((int) (short) 100, (int) (byte) -1);
        double[] doubleArray34 = quarterlyDouble21.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble35 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray34);
        double double36 = quarterlyDouble35.getTtmAvg();
        double[] doubleArray40 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble41 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray40);
        double double42 = quarterlyDouble41.getTtm();
        double double43 = quarterlyDouble41.getQseqQ();
        double[] doubleArray44 = quarterlyDouble41.dArr;
        double[] doubleArray48 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble49 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray48);
        quarterlyDouble41.dArr = doubleArray48;
        double double51 = quarterlyDouble41.getTtm();
        double[] doubleArray52 = quarterlyDouble41.dArr;
        double double53 = quarterlyDouble41.getQseqQ();
        double double54 = quarterlyDouble41.getTtm();
        double[] doubleArray55 = quarterlyDouble41.dArr;
        quarterlyDouble35.dArr = doubleArray55;
        quarterlyDouble4.dArr = doubleArray55;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble58 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray55);
        // The following exception was thrown during execution in test generation
        try {
            double double59 = quarterlyDouble58.getQoQ();
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 52.0d + "'", double15 == 52.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 5100.0d + "'", double23 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 5100.0d + "'", double30 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 5100.0d + "'", double43 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 5100.0d + "'", double53 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[10.0, 52.0, 1.0]");
    }

    @Test
    public void test10521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10521");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray7 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray7);
        double double9 = quarterlyDouble8.getQseqQ();
        double double12 = quarterlyDouble8.deltaQ((int) '#', (-1));
        double double14 = quarterlyDouble8.get(1);
        double double16 = quarterlyDouble8.get((-1));
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 5100.0d + "'", double9 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-9999.9999d) + "'", double16 == (-9999.9999d));
    }

    @Test
    public void test10522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10522");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble24 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray22);
        double[] doubleArray25 = quarterlyDouble24.dArr;
        double[] doubleArray26 = quarterlyDouble24.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble27 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray26);
        double double28 = quarterlyDouble27.getQseqQ();
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
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 5100.0d + "'", double28 == 5100.0d);
    }

    @Test
    public void test10523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10523");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
        java.lang.String str4 = companyData1.getTicker();
        java.lang.String str5 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = companyData1.getFdList();
        java.lang.String str8 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = companyData1.getFdList();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData12 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList9, (int) (byte) 1, (int) (byte) 100);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData15 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList9, 1, (int) (short) 100);
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNotNull(fieldDataList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNull(fieldData12);
        org.junit.Assert.assertNull(fieldData15);
    }

    @Test
    public void test10524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10524");
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
        double double37 = quarterlyDouble4.get((int) '4');
        double double38 = quarterlyDouble4.getTtm();
        double double39 = quarterlyDouble4.getTtm();
        double double42 = quarterlyDouble4.deltaQ((int) 'a', (int) (short) 0);
        double double43 = quarterlyDouble4.getQseqQ();
        double double44 = quarterlyDouble4.getTtm();
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
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + (-9999.9999d) + "'", double37 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 5100.0d + "'", double43 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
    }

    @Test
    public void test10525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10525");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
        java.lang.String str5 = companyData1.getTicker();
        java.lang.String str6 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = companyData1.getFdList();
        java.lang.String str9 = companyData1.getTicker();
        java.lang.String str10 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = companyData1.getFdList();
        java.lang.String str12 = companyData1.getTicker();
        java.lang.String str13 = companyData1.getTicker();
        java.lang.String str14 = companyData1.getTicker();
        java.lang.String str15 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = companyData1.getFdList();
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNotNull(fieldDataList3);
        org.junit.Assert.assertNotNull(fieldDataList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(fieldDataList7);
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(fieldDataList16);
    }

    @Test
    public void test10526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10526");
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
        double double32 = quarterlyDouble4.get(0);
        double double33 = quarterlyDouble4.getQseqQ();
        double double34 = quarterlyDouble4.getMostRecent();
        double[] doubleArray35 = quarterlyDouble4.dArr;
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
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 10.0d + "'", double32 == 10.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 5100.0d + "'", double33 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 52.0d + "'", double34 == 52.0d);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[10.0, 52.0, 1.0]");
    }

    @Test
    public void test10527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10527");
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
        double[] doubleArray43 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble44 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray43);
        double double46 = quarterlyDouble44.get((int) (byte) 1);
        double double47 = quarterlyDouble44.getQseqQ();
        double double48 = quarterlyDouble44.getQseqQ();
        double double49 = quarterlyDouble44.getTtmAvg();
        double double50 = quarterlyDouble44.getTtm();
        double[] doubleArray51 = quarterlyDouble44.dArr;
        double double53 = quarterlyDouble44.get(10);
        double double54 = quarterlyDouble44.getQseqQ();
        double[] doubleArray55 = quarterlyDouble44.dArr;
        quarterlyDouble18.dArr = doubleArray55;
        double[] doubleArray57 = quarterlyDouble18.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble58 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray57);
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
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 52.0d + "'", double46 == 52.0d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 5100.0d + "'", double47 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 5100.0d + "'", double48 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + (-9999.9999d) + "'", double53 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 5100.0d + "'", double54 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[10.0, 52.0, 1.0]");
    }

    @Test
    public void test10528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10528");
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
        double double17 = quarterlyDouble4.get((int) (byte) 100);
        double[] doubleArray18 = quarterlyDouble4.dArr;
        double double19 = quarterlyDouble4.getTtm();
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-9999.9999d) + "'", double17 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test10529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10529");
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
        double double26 = quarterlyDouble4.deltaQ((int) (byte) 10, (int) (byte) 100);
        double double28 = quarterlyDouble4.get(1);
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
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 52.0d + "'", double28 == 52.0d);
    }

    @Test
    public void test10530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10530");
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
        double double30 = quarterlyDouble7.deltaQ((int) 'a', (int) ' ');
        double[] doubleArray31 = quarterlyDouble7.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble32 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray31);
        double double33 = quarterlyDouble32.getTtmAvg();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str35 = quarterlyDouble32.fmtGrowth4Q("");
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
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
    }

    @Test
    public void test10531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10531");
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
        double double49 = quarterlyDouble17.getMostRecent();
        double[] doubleArray50 = quarterlyDouble17.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble51 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray50);
        double double54 = quarterlyDouble51.deltaQ((-1), (int) (short) -1);
        double double55 = quarterlyDouble51.getQseqQ();
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
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 52.0d + "'", double49 == 52.0d);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 5100.0d + "'", double55 == 5100.0d);
    }

    @Test
    public void test10532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10532");
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
        double double22 = quarterlyDouble17.deltaQ(0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = quarterlyDouble17.fmtGrowth4Q("");
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
    }

    @Test
    public void test10533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10533");
        net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile((int) ' ', (int) (byte) 1);
    }

    @Test
    public void test10534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10534");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble38 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray37);
        double double39 = quarterlyDouble38.getMostRecent();
        double double40 = quarterlyDouble38.getQseqQ();
        double double41 = quarterlyDouble38.getTtm();
        double double42 = quarterlyDouble38.getTtm();
        double double43 = quarterlyDouble38.getTtm();
        double double44 = quarterlyDouble38.getTtm();
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
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 52.0d + "'", double39 == 52.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 5100.0d + "'", double40 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
    }

    @Test
    public void test10535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10535");
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
        double double17 = quarterlyDouble4.getQseqQ();
        double double19 = quarterlyDouble4.get((int) (short) 10);
        double double21 = quarterlyDouble4.get(100);
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 5100.0d + "'", double17 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-9999.9999d) + "'", double19 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-9999.9999d) + "'", double21 == (-9999.9999d));
    }

    @Test
    public void test10536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10536");
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
        double double19 = quarterlyDouble17.get((int) (byte) 1);
        double double20 = quarterlyDouble17.getTtmAvg();
        double double21 = quarterlyDouble17.getTtmAvg();
        double[] doubleArray25 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble26 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray25);
        double double27 = quarterlyDouble26.getTtm();
        double double28 = quarterlyDouble26.getQseqQ();
        double[] doubleArray32 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble33 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray32);
        quarterlyDouble26.dArr = doubleArray32;
        double double35 = quarterlyDouble26.getQseqQ();
        double double36 = quarterlyDouble26.getTtmAvg();
        double[] doubleArray37 = quarterlyDouble26.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble38 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray37);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble39 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray37);
        double double40 = quarterlyDouble39.getTtmAvg();
        double[] doubleArray41 = quarterlyDouble39.dArr;
        quarterlyDouble17.dArr = doubleArray41;
        double double44 = quarterlyDouble17.get((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            double double45 = quarterlyDouble17.getQoQ();
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
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 52.0d + "'", double19 == 52.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 5100.0d + "'", double28 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 5100.0d + "'", double35 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + (-9999.9999d) + "'", double44 == (-9999.9999d));
    }

    @Test
    public void test10537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10537");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double double6 = quarterlyDouble4.getMostRecent();
        double double8 = quarterlyDouble4.get((int) 'a');
        double double9 = quarterlyDouble4.getTtm();
        double double12 = quarterlyDouble4.deltaQ((int) (short) 1, (int) (short) -1);
        double double13 = quarterlyDouble4.getQseqQ();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-9999.9999d) + "'", double8 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5100.0d + "'", double13 == 5100.0d);
    }

    @Test
    public void test10538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10538");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("");
        java.lang.String str2 = companyData1.getTicker();
        java.lang.String str3 = companyData1.getTicker();
        java.lang.String str4 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList5 = companyData1.getFdList();
        java.lang.String str6 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = companyData1.getFdList();
        java.lang.String str8 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = companyData1.getFdList();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(fieldDataList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(fieldDataList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(fieldDataList9);
    }

    @Test
    public void test10539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10539");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
        java.lang.String str5 = companyData1.getTicker();
        java.lang.String str6 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = companyData1.getFdList();
        java.lang.String str9 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = companyData1.getFdList();
        java.lang.String str11 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = companyData1.getFdList();
        java.lang.String str15 = companyData1.getTicker();
        java.lang.String str16 = companyData1.getTicker();
        java.lang.String str17 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList20 = companyData1.getFdList();
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNotNull(fieldDataList3);
        org.junit.Assert.assertNotNull(fieldDataList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(fieldDataList7);
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(fieldDataList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList13);
        org.junit.Assert.assertNotNull(fieldDataList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(fieldDataList18);
        org.junit.Assert.assertNotNull(fieldDataList19);
        org.junit.Assert.assertNotNull(fieldDataList20);
    }

    @Test
    public void test10540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10540");
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
        double[] doubleArray18 = quarterlyDouble4.dArr;
        double double20 = quarterlyDouble4.get((int) '#');
        double[] doubleArray21 = quarterlyDouble4.dArr;
        double[] doubleArray22 = quarterlyDouble4.dArr;
        double double23 = quarterlyDouble4.getTtmAvg();
        double double25 = quarterlyDouble4.get((int) (byte) 100);
        double double26 = quarterlyDouble4.getTtm();
        java.lang.Class<?> wildcardClass27 = quarterlyDouble4.getClass();
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
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-9999.9999d) + "'", double20 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-9999.9999d) + "'", double25 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test10541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10541");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble24 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray22);
        double[] doubleArray25 = quarterlyDouble24.dArr;
        double[] doubleArray26 = quarterlyDouble24.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble27 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray26);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble28 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray26);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble29 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray26);
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
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0, 52.0, 1.0]");
    }

    @Test
    public void test10542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10542");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray7 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray7);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray7);
        double double10 = quarterlyDouble9.getTtmAvg();
        double double11 = quarterlyDouble9.getQseqQ();
        double double12 = quarterlyDouble9.getQseqQ();
        double[] doubleArray13 = quarterlyDouble9.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray13);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray13);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray13);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray13);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 5100.0d + "'", double11 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 5100.0d + "'", double12 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 52.0, 1.0]");
    }

    @Test
    public void test10543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10543");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList2, (int) (short) 0, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList7 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList((java.util.List<java.lang.String>) strList2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList8 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList((java.util.List<java.lang.String>) strList2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList11 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList2, 0, (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList14 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList2, 0, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList17 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList2, (int) '#', (int) (byte) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList20 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList2, 0, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList23 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList2, 1, (int) (byte) 100);
        java.lang.Class<?> wildcardClass24 = companyDataList23.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(companyDataList6);
        org.junit.Assert.assertNotNull(manyCompanyDataList7);
        org.junit.Assert.assertNotNull(manyCompanyDataList8);
        org.junit.Assert.assertNotNull(companyDataList11);
        org.junit.Assert.assertNotNull(companyDataList14);
        org.junit.Assert.assertNotNull(companyDataList17);
        org.junit.Assert.assertNotNull(companyDataList20);
        org.junit.Assert.assertNotNull(companyDataList23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test10544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10544");
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
        double double49 = quarterlyDouble17.getMostRecent();
        double[] doubleArray50 = quarterlyDouble17.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble51 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray50);
        double double53 = quarterlyDouble51.get((int) '4');
        double[] doubleArray54 = quarterlyDouble51.dArr;
        double double55 = quarterlyDouble51.getMostRecent();
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
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 52.0d + "'", double49 == 52.0d);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + (-9999.9999d) + "'", double53 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 52.0d + "'", double55 == 52.0d);
    }

    @Test
    public void test10545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10545");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList3, 100, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList10 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList3, 100, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList13 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList3, (int) (short) 10, (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList14 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList((java.util.List<java.lang.String>) strList3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList17 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList3, 0, (int) (short) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList18 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList((java.util.List<java.lang.String>) strList3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList19 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList((java.util.List<java.lang.String>) strList3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList20 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList((java.util.List<java.lang.String>) strList3);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(companyDataList7);
        org.junit.Assert.assertNotNull(companyDataList10);
        org.junit.Assert.assertNotNull(companyDataList13);
        org.junit.Assert.assertNotNull(manyCompanyDataList14);
        org.junit.Assert.assertNotNull(companyDataList17);
        org.junit.Assert.assertNotNull(manyCompanyDataList18);
        org.junit.Assert.assertNotNull(manyCompanyDataList19);
        org.junit.Assert.assertNotNull(manyCompanyDataList20);
    }

    @Test
    public void test10546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10546");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray17);
        double double19 = quarterlyDouble18.getMostRecent();
        double double21 = quarterlyDouble18.get(100);
        double double22 = quarterlyDouble18.getTtmAvg();
        double double23 = quarterlyDouble18.getTtm();
        double double24 = quarterlyDouble18.getQseqQ();
        double double26 = quarterlyDouble18.get(0);
        double double29 = quarterlyDouble18.deltaQ((int) (short) 100, (int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 52.0d + "'", double19 == 52.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-9999.9999d) + "'", double21 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 5100.0d + "'", double24 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
    }

    @Test
    public void test10547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10547");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double double6 = quarterlyDouble4.getMostRecent();
        double double7 = quarterlyDouble4.getTtm();
        double double8 = quarterlyDouble4.getTtm();
        double[] doubleArray9 = quarterlyDouble4.dArr;
        double[] doubleArray13 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray13);
        double double15 = quarterlyDouble14.getTtm();
        double double16 = quarterlyDouble14.getQseqQ();
        double[] doubleArray20 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble21 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray20);
        quarterlyDouble14.dArr = doubleArray20;
        double double23 = quarterlyDouble14.getQseqQ();
        double double26 = quarterlyDouble14.deltaQ((int) (short) 100, (int) (byte) -1);
        double[] doubleArray30 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble31 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray30);
        double double32 = quarterlyDouble31.getTtmAvg();
        double double33 = quarterlyDouble31.getMostRecent();
        double double35 = quarterlyDouble31.get((int) 'a');
        double double37 = quarterlyDouble31.get((int) (byte) -1);
        double[] doubleArray41 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble42 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray41);
        double double43 = quarterlyDouble42.getTtm();
        double double44 = quarterlyDouble42.getQseqQ();
        double[] doubleArray45 = quarterlyDouble42.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble46 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray45);
        quarterlyDouble31.dArr = doubleArray45;
        quarterlyDouble14.dArr = doubleArray45;
        quarterlyDouble4.dArr = doubleArray45;
        double double52 = quarterlyDouble4.deltaQ((int) 'a', (int) ' ');
        double double54 = quarterlyDouble4.get((int) (short) 100);
        double[] doubleArray58 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble59 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray58);
        double double60 = quarterlyDouble59.getTtmAvg();
        double double61 = quarterlyDouble59.getTtm();
        double double62 = quarterlyDouble59.getTtmAvg();
        double double64 = quarterlyDouble59.get((int) (byte) 100);
        double[] doubleArray65 = quarterlyDouble59.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble66 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray65);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble67 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray65);
        double double68 = quarterlyDouble67.getTtm();
        double[] doubleArray69 = quarterlyDouble67.dArr;
        double[] doubleArray73 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble74 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray73);
        double[] doubleArray75 = quarterlyDouble74.dArr;
        double[] doubleArray76 = quarterlyDouble74.dArr;
        double[] doubleArray80 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble81 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray80);
        double double82 = quarterlyDouble81.getTtm();
        double double83 = quarterlyDouble81.getQseqQ();
        double[] doubleArray84 = quarterlyDouble81.dArr;
        double double85 = quarterlyDouble81.getQseqQ();
        double[] doubleArray89 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble90 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray89);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble91 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray89);
        quarterlyDouble81.dArr = doubleArray89;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble93 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray89);
        quarterlyDouble74.dArr = doubleArray89;
        quarterlyDouble67.dArr = doubleArray89;
        quarterlyDouble4.dArr = doubleArray89;
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 5100.0d + "'", double16 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 5100.0d + "'", double23 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 52.0d + "'", double33 == 52.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-9999.9999d) + "'", double35 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + (-9999.9999d) + "'", double37 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 5100.0d + "'", double44 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + (-9999.9999d) + "'", double54 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.0d + "'", double61 == 0.0d);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.0d + "'", double62 == 0.0d);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + (-9999.9999d) + "'", double64 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 0.0d + "'", double68 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 0.0d + "'", double82 == 0.0d);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 5100.0d + "'", double83 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray84), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 5100.0d + "'", double85 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray89), "[10.0, 52.0, 1.0]");
    }

    @Test
    public void test10548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10548");
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
        double double28 = quarterlyDouble4.get((int) '#');
        double[] doubleArray32 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble33 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray32);
        double double34 = quarterlyDouble33.getTtm();
        double double35 = quarterlyDouble33.getQseqQ();
        double[] doubleArray36 = quarterlyDouble33.dArr;
        double double37 = quarterlyDouble33.getQseqQ();
        double[] doubleArray41 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble42 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray41);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble43 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray41);
        quarterlyDouble33.dArr = doubleArray41;
        double[] doubleArray45 = quarterlyDouble33.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble46 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray45);
        quarterlyDouble4.dArr = doubleArray45;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble48 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray45);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble49 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray45);
        double double51 = quarterlyDouble49.get((int) (byte) 1);
        double[] doubleArray52 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble53 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray52);
        double[] doubleArray57 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble58 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray57);
        double double59 = quarterlyDouble58.getTtm();
        double double60 = quarterlyDouble58.getQseqQ();
        double[] doubleArray61 = quarterlyDouble58.dArr;
        double[] doubleArray65 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble66 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray65);
        quarterlyDouble58.dArr = doubleArray65;
        double[] doubleArray68 = quarterlyDouble58.dArr;
        quarterlyDouble53.dArr = doubleArray68;
        double[] doubleArray70 = quarterlyDouble53.dArr;
        double[] doubleArray71 = quarterlyDouble53.dArr;
        double double72 = quarterlyDouble53.getTtm();
        double[] doubleArray73 = quarterlyDouble53.dArr;
        quarterlyDouble49.dArr = doubleArray73;
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
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-9999.9999d) + "'", double28 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 5100.0d + "'", double35 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 5100.0d + "'", double37 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 52.0d + "'", double51 == 52.0d);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.0d + "'", double59 == 0.0d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 5100.0d + "'", double60 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 0.0d + "'", double72 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[10.0, 52.0, 1.0]");
    }

    @Test
    public void test10549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10549");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
        java.lang.String str5 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = companyData1.getFdList();
        java.lang.String str7 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = companyData1.getFdList();
        java.lang.String str10 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = companyData1.getFdList();
        java.lang.String str14 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = companyData1.getFdList();
        java.lang.String str17 = companyData1.getTicker();
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNotNull(fieldDataList3);
        org.junit.Assert.assertNotNull(fieldDataList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(fieldDataList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test10550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10550");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%)", (int) (byte) 100, (int) (short) -1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test10551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10551");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double double6 = quarterlyDouble4.getMostRecent();
        double double8 = quarterlyDouble4.get((int) 'a');
        double double9 = quarterlyDouble4.getQseqQ();
        double double10 = quarterlyDouble4.getTtmAvg();
        double double11 = quarterlyDouble4.getMostRecent();
        double double13 = quarterlyDouble4.get((int) (byte) 100);
        double[] doubleArray14 = quarterlyDouble4.dArr;
        double double16 = quarterlyDouble4.get(10);
        double[] doubleArray17 = quarterlyDouble4.dArr;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = quarterlyDouble4.fmtGrowth4Q("\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
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
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-9999.9999d) + "'", double13 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-9999.9999d) + "'", double16 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0, 52.0, 1.0]");
    }

    @Test
    public void test10552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10552");
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
        double double17 = quarterlyDouble4.getTtmAvg();
        double double18 = quarterlyDouble4.getMostRecent();
        double[] doubleArray22 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble23 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray22);
        double double24 = quarterlyDouble23.getTtm();
        double double25 = quarterlyDouble23.getQseqQ();
        double[] doubleArray29 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble30 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray29);
        quarterlyDouble23.dArr = doubleArray29;
        double double32 = quarterlyDouble23.getQseqQ();
        double double35 = quarterlyDouble23.deltaQ((int) (short) 100, (int) (byte) -1);
        double double38 = quarterlyDouble23.deltaQ((int) (byte) 100, 0);
        double[] doubleArray42 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble43 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray42);
        double double44 = quarterlyDouble43.getTtm();
        double double45 = quarterlyDouble43.getQseqQ();
        double[] doubleArray49 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble50 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray49);
        quarterlyDouble43.dArr = doubleArray49;
        double double52 = quarterlyDouble43.getQseqQ();
        double double55 = quarterlyDouble43.deltaQ((int) (short) 100, (int) (byte) -1);
        double double58 = quarterlyDouble43.deltaQ((int) (byte) 100, 0);
        double[] doubleArray59 = quarterlyDouble43.dArr;
        quarterlyDouble23.dArr = doubleArray59;
        quarterlyDouble4.dArr = doubleArray59;
        double double64 = quarterlyDouble4.deltaQ((int) (byte) 0, 0);
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 52.0d + "'", double18 == 52.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 5100.0d + "'", double25 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 5100.0d + "'", double32 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 5100.0d + "'", double45 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 5100.0d + "'", double52 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.0d + "'", double64 == 0.0d);
    }

    @Test
    public void test10553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10553");
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
        double double33 = quarterlyDouble5.getTtm();
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
    public void test10554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10554");
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
        double double18 = quarterlyDouble5.getTtm();
        double double20 = quarterlyDouble5.get((int) (short) -1);
        double double21 = quarterlyDouble5.getQseqQ();
        double double22 = quarterlyDouble5.getQseqQ();
        double[] doubleArray26 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble27 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray26);
        double double28 = quarterlyDouble27.getTtm();
        double double29 = quarterlyDouble27.getQseqQ();
        double[] doubleArray30 = quarterlyDouble27.dArr;
        double double31 = quarterlyDouble27.getQseqQ();
        double[] doubleArray35 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble36 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray35);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble37 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray35);
        quarterlyDouble27.dArr = doubleArray35;
        double[] doubleArray39 = quarterlyDouble27.dArr;
        double double40 = quarterlyDouble27.getTtmAvg();
        double[] doubleArray41 = quarterlyDouble27.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble42 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray41);
        double double43 = quarterlyDouble42.getTtmAvg();
        double double45 = quarterlyDouble42.get((int) ' ');
        double[] doubleArray46 = quarterlyDouble42.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble47 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray46);
        quarterlyDouble5.dArr = doubleArray46;
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
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-9999.9999d) + "'", double20 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 5100.0d + "'", double21 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 5100.0d + "'", double22 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 5100.0d + "'", double29 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 5100.0d + "'", double31 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + (-9999.9999d) + "'", double45 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[10.0, 52.0, 1.0]");
    }

    @Test
    public void test10555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10555");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double[] doubleArray6 = quarterlyDouble5.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray6);
        double double8 = quarterlyDouble7.getTtm();
        double[] doubleArray9 = quarterlyDouble7.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray9);
        double double12 = quarterlyDouble10.get((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = quarterlyDouble10.fmtGrowth1Q("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-9999.9999d) + "'", double12 == (-9999.9999d));
    }

    @Test
    public void test10556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10556");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
        java.lang.String str5 = companyData1.getTicker();
        java.lang.String str6 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = companyData1.getFdList();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData12 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList9, 1, 1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData15 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList9, 0, 100);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData18 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList9, (int) (byte) -1, (int) '4');
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData21 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList9, 0, (int) (byte) 1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData24 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList9, 100, 0);
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNotNull(fieldDataList3);
        org.junit.Assert.assertNotNull(fieldDataList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(fieldDataList7);
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNull(fieldData12);
        org.junit.Assert.assertNull(fieldData15);
        org.junit.Assert.assertNull(fieldData18);
        org.junit.Assert.assertNull(fieldData21);
        org.junit.Assert.assertNull(fieldData24);
    }

    @Test
    public void test10557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10557");
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
        double double65 = quarterlyDouble20.deltaQ((int) (short) 1, 0);
        double double67 = quarterlyDouble20.get((-1));
        double double69 = quarterlyDouble20.get((int) 'a');
        double double70 = quarterlyDouble20.getTtmAvg();
        double double71 = quarterlyDouble20.getMostRecent();
        double double72 = quarterlyDouble20.getTtm();
        double double73 = quarterlyDouble20.getTtmAvg();
        double double74 = quarterlyDouble20.getTtmAvg();
        double double77 = quarterlyDouble20.deltaQ((int) '4', 100);
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
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + (-9999.9999d) + "'", double67 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + (-9999.9999d) + "'", double69 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 0.0d + "'", double70 == 0.0d);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 52.0d + "'", double71 == 52.0d);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 0.0d + "'", double72 == 0.0d);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 0.0d + "'", double73 == 0.0d);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 0.0d + "'", double74 == 0.0d);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 0.0d + "'", double77 == 0.0d);
    }

    @Test
    public void test10558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10558");
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
        double double28 = quarterlyDouble5.get(100);
        double double30 = quarterlyDouble5.get(0);
        double double31 = quarterlyDouble5.getQseqQ();
        double double34 = quarterlyDouble5.deltaQ(0, (int) (short) 1);
        double double35 = quarterlyDouble5.getMostRecent();
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
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-9999.9999d) + "'", double28 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 5100.0d + "'", double31 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 52.0d + "'", double35 == 52.0d);
    }

    @Test
    public void test10559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10559");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        java.lang.String str3 = companyData1.getTicker();
        java.lang.String str4 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList5 = companyData1.getFdList();
        java.lang.String str6 = companyData1.getTicker();
        java.lang.String str7 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = companyData1.getFdList();
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(fieldDataList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(fieldDataList8);
    }

    @Test
    public void test10560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10560");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double7 = quarterlyDouble5.get(10);
        double double8 = quarterlyDouble5.getMostRecent();
        double double10 = quarterlyDouble5.get((int) (byte) -1);
        double double11 = quarterlyDouble5.getTtm();
        double double12 = quarterlyDouble5.getTtmAvg();
        double double15 = quarterlyDouble5.deltaQ((int) '#', (int) (short) 10);
        double double17 = quarterlyDouble5.get((int) (byte) 100);
        double double18 = quarterlyDouble5.getQseqQ();
        double double20 = quarterlyDouble5.get((int) (byte) -1);
        double double22 = quarterlyDouble5.get((int) (short) 1);
        double[] doubleArray23 = quarterlyDouble5.dArr;
        double double24 = quarterlyDouble5.getTtm();
        double double25 = quarterlyDouble5.getTtmAvg();
        double[] doubleArray26 = quarterlyDouble5.dArr;
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9999.9999d) + "'", double7 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-9999.9999d) + "'", double17 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 5100.0d + "'", double18 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-9999.9999d) + "'", double20 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 52.0d + "'", double22 == 52.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0, 52.0, 1.0]");
    }

    @Test
    public void test10561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10561");
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
        double double25 = quarterlyDouble4.deltaQ((int) (byte) -1, (int) (byte) 1);
        double double26 = quarterlyDouble4.getTtm();
        double double28 = quarterlyDouble4.get((int) (short) 100);
        double double29 = quarterlyDouble4.getTtm();
        double double31 = quarterlyDouble4.get(10);
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
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-9999.9999d) + "'", double28 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-9999.9999d) + "'", double31 == (-9999.9999d));
    }

    @Test
    public void test10562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10562");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble51 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray47);
        double double53 = quarterlyDouble51.get((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double54 = quarterlyDouble51.getQoQ();
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
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + (-9999.9999d) + "'", double53 == (-9999.9999d));
    }

    @Test
    public void test10563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10563");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double6 = quarterlyDouble4.get((int) (byte) 1);
        double double7 = quarterlyDouble4.getQseqQ();
        double double8 = quarterlyDouble4.getQseqQ();
        double double9 = quarterlyDouble4.getTtmAvg();
        double double10 = quarterlyDouble4.getTtm();
        double[] doubleArray11 = quarterlyDouble4.dArr;
        double[] doubleArray15 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray15);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray15);
        double[] doubleArray18 = quarterlyDouble17.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray18);
        double double20 = quarterlyDouble19.getMostRecent();
        double[] doubleArray24 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble25 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray24);
        double double26 = quarterlyDouble25.getTtm();
        double double27 = quarterlyDouble25.getQseqQ();
        double[] doubleArray28 = quarterlyDouble25.dArr;
        double double29 = quarterlyDouble25.getQseqQ();
        double[] doubleArray33 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble34 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray33);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble35 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray33);
        quarterlyDouble25.dArr = doubleArray33;
        double[] doubleArray37 = quarterlyDouble25.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble38 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray37);
        quarterlyDouble19.dArr = doubleArray37;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble40 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray37);
        quarterlyDouble4.dArr = doubleArray37;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble42 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray37);
        double[] doubleArray43 = quarterlyDouble42.dArr;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str45 = quarterlyDouble42.fmtGrowth4Q("");
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
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 52.0d + "'", double20 == 52.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 5100.0d + "'", double27 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 5100.0d + "'", double29 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[10.0, 52.0, 1.0]");
    }

    @Test
    public void test10564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10564");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double double7 = quarterlyDouble4.getTtmAvg();
        double double8 = quarterlyDouble4.getQseqQ();
        double double11 = quarterlyDouble4.deltaQ((-1), 0);
        double[] doubleArray12 = quarterlyDouble4.dArr;
        double double15 = quarterlyDouble4.deltaQ(100, (int) (short) -1);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 5100.0d + "'", double8 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test10565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10565");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double[] doubleArray5 = quarterlyDouble4.dArr;
        double double6 = quarterlyDouble4.getQseqQ();
        double double7 = quarterlyDouble4.getQseqQ();
        double double8 = quarterlyDouble4.getQseqQ();
        double double9 = quarterlyDouble4.getTtmAvg();
        double double10 = quarterlyDouble4.getQseqQ();
        double double11 = quarterlyDouble4.getTtm();
        double double12 = quarterlyDouble4.getTtmAvg();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = quarterlyDouble4.fmtGrowth4Q("\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
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
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 5100.0d + "'", double8 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 5100.0d + "'", double10 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test10566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10566");
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
        quarterlyDouble4.dArr = doubleArray16;
        double double19 = quarterlyDouble4.getTtm();
        double[] doubleArray20 = quarterlyDouble4.dArr;
        double[] doubleArray21 = quarterlyDouble4.dArr;
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
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[10.0, 52.0, 1.0]");
    }

    @Test
    public void test10567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10567");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
        java.lang.String str5 = companyData1.getTicker();
        java.lang.String str6 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = companyData1.getFdList();
        java.lang.String str8 = companyData1.getTicker();
        java.lang.String str9 = companyData1.getTicker();
        java.lang.String str10 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = companyData1.getFdList();
        java.lang.String str13 = companyData1.getTicker();
        java.lang.String str14 = companyData1.getTicker();
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNotNull(fieldDataList3);
        org.junit.Assert.assertNotNull(fieldDataList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(fieldDataList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test10568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10568");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray10 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray10);
        quarterlyDouble4.dArr = doubleArray10;
        double double13 = quarterlyDouble4.getQseqQ();
        double[] doubleArray17 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray17);
        double double19 = quarterlyDouble18.getTtmAvg();
        double double20 = quarterlyDouble18.getMostRecent();
        double double21 = quarterlyDouble18.getTtm();
        double double22 = quarterlyDouble18.getTtm();
        double[] doubleArray23 = quarterlyDouble18.dArr;
        double[] doubleArray27 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble28 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray27);
        double double29 = quarterlyDouble28.getTtm();
        double double30 = quarterlyDouble28.getQseqQ();
        double[] doubleArray34 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble35 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray34);
        quarterlyDouble28.dArr = doubleArray34;
        double double37 = quarterlyDouble28.getQseqQ();
        double double40 = quarterlyDouble28.deltaQ((int) (short) 100, (int) (byte) -1);
        double[] doubleArray44 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble45 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray44);
        double double46 = quarterlyDouble45.getTtmAvg();
        double double47 = quarterlyDouble45.getMostRecent();
        double double49 = quarterlyDouble45.get((int) 'a');
        double double51 = quarterlyDouble45.get((int) (byte) -1);
        double[] doubleArray55 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble56 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray55);
        double double57 = quarterlyDouble56.getTtm();
        double double58 = quarterlyDouble56.getQseqQ();
        double[] doubleArray59 = quarterlyDouble56.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble60 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray59);
        quarterlyDouble45.dArr = doubleArray59;
        quarterlyDouble28.dArr = doubleArray59;
        quarterlyDouble18.dArr = doubleArray59;
        quarterlyDouble4.dArr = doubleArray59;
        double[] doubleArray68 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble69 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray68);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble70 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray68);
        double double72 = quarterlyDouble70.get(10);
        double[] doubleArray73 = quarterlyDouble70.dArr;
        quarterlyDouble4.dArr = doubleArray73;
        double[] doubleArray75 = quarterlyDouble4.dArr;
        double[] doubleArray76 = quarterlyDouble4.dArr;
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5100.0d + "'", double13 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 52.0d + "'", double20 == 52.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 5100.0d + "'", double30 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 5100.0d + "'", double37 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 52.0d + "'", double47 == 52.0d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + (-9999.9999d) + "'", double49 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + (-9999.9999d) + "'", double51 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 5100.0d + "'", double58 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + (-9999.9999d) + "'", double72 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[10.0, 52.0, 1.0]");
    }

    @Test
    public void test10569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10569");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double double6 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.getMostRecent();
        double double8 = quarterlyDouble4.getTtmAvg();
        double double9 = quarterlyDouble4.getMostRecent();
        double double11 = quarterlyDouble4.get((int) '4');
        double double13 = quarterlyDouble4.get((-1));
        double[] doubleArray17 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray17);
        double double19 = quarterlyDouble18.getTtm();
        double double20 = quarterlyDouble18.getQseqQ();
        double[] doubleArray21 = quarterlyDouble18.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble22 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray21);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble23 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray21);
        double[] doubleArray27 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble28 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray27);
        double double29 = quarterlyDouble28.getTtmAvg();
        double double30 = quarterlyDouble28.getTtm();
        double double31 = quarterlyDouble28.getTtmAvg();
        double double32 = quarterlyDouble28.getQseqQ();
        double[] doubleArray33 = quarterlyDouble28.dArr;
        quarterlyDouble23.dArr = doubleArray33;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble35 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray33);
        quarterlyDouble4.dArr = doubleArray33;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble37 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray33);
        java.lang.Class<?> wildcardClass38 = quarterlyDouble37.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-9999.9999d) + "'", double11 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-9999.9999d) + "'", double13 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 5100.0d + "'", double20 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 5100.0d + "'", double32 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test10570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10570");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray18);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray18);
        double double21 = quarterlyDouble20.getMostRecent();
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
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 52.0d + "'", double21 == 52.0d);
    }

    @Test
    public void test10571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10571");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList5 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList((java.util.List<java.lang.String>) strList3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList((java.util.List<java.lang.String>) strList3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList9 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList3, (int) (short) 1, (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList10 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList((java.util.List<java.lang.String>) strList3);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(manyCompanyDataList5);
        org.junit.Assert.assertNotNull(manyCompanyDataList6);
        org.junit.Assert.assertNotNull(companyDataList9);
        org.junit.Assert.assertNotNull(manyCompanyDataList10);
    }

    @Test
    public void test10572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10572");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
        java.lang.String str4 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList5 = companyData1.getFdList();
        java.lang.String str6 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = companyData1.getFdList();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData11 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList8, (int) (byte) 1, (int) '4');
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData14 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList8, (int) (byte) -1, 100);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData17 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList8, (int) (byte) -1, (int) (short) 1);
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNotNull(fieldDataList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(fieldDataList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(fieldDataList7);
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertNull(fieldData11);
        org.junit.Assert.assertNull(fieldData14);
        org.junit.Assert.assertNull(fieldData17);
    }

    @Test
    public void test10573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10573");
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
        double[] doubleArray33 = null;
        quarterlyDouble4.dArr = doubleArray33;
        // The following exception was thrown during execution in test generation
        try {
            double double35 = quarterlyDouble4.getMostRecent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test10574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10574");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray9 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray9);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray9);
        double double13 = quarterlyDouble11.get(100);
        double[] doubleArray14 = quarterlyDouble11.dArr;
        quarterlyDouble4.dArr = doubleArray14;
        double[] doubleArray19 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray19);
        double double21 = quarterlyDouble20.getTtm();
        double double22 = quarterlyDouble20.getQseqQ();
        double[] doubleArray23 = quarterlyDouble20.dArr;
        double double24 = quarterlyDouble20.getQseqQ();
        double[] doubleArray28 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble29 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray28);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble30 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray28);
        quarterlyDouble20.dArr = doubleArray28;
        double[] doubleArray32 = quarterlyDouble20.dArr;
        quarterlyDouble4.dArr = doubleArray32;
        double double34 = quarterlyDouble4.getMostRecent();
        double double35 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray36 = quarterlyDouble4.dArr;
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
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 52.0d + "'", double34 == 52.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[10.0, 52.0, 1.0]");
    }

    @Test
    public void test10575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10575");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        java.lang.String str3 = companyData1.getTicker();
        java.lang.String str4 = companyData1.getTicker();
        java.lang.String str5 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = companyData1.getFdList();
        java.lang.String str7 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = companyData1.getFdList();
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertNotNull(fieldDataList9);
    }

    @Test
    public void test10576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10576");
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
        double double17 = quarterlyDouble4.getQseqQ();
        double double20 = quarterlyDouble4.deltaQ((int) (short) 10, (int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 5100.0d + "'", double17 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test10577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10577");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble25 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray19);
        double double26 = quarterlyDouble25.getTtmAvg();
        double double27 = quarterlyDouble25.getTtm();
        double double29 = quarterlyDouble25.get((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = quarterlyDouble25.fmtGrowth4Q("");
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
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-9999.9999d) + "'", double29 == (-9999.9999d));
    }

    @Test
    public void test10578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10578");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
        java.lang.String str5 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = companyData1.getFdList();
        java.lang.String str9 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = companyData1.getFdList();
        java.lang.String str11 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = companyData1.getFdList();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData15 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList12, (int) '4', (-1));
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNotNull(fieldDataList3);
        org.junit.Assert.assertNotNull(fieldDataList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList7);
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(fieldDataList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNull(fieldData15);
    }

    @Test
    public void test10579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10579");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double6 = quarterlyDouble5.getTtmAvg();
        double double7 = quarterlyDouble5.getTtm();
        double double8 = quarterlyDouble5.getQseqQ();
        double double9 = quarterlyDouble5.getTtm();
        double[] doubleArray10 = quarterlyDouble5.dArr;
        double double11 = quarterlyDouble5.getTtm();
        double double13 = quarterlyDouble5.get((-1));
        double[] doubleArray17 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray17);
        double double19 = quarterlyDouble18.getTtm();
        double double20 = quarterlyDouble18.getQseqQ();
        double[] doubleArray21 = quarterlyDouble18.dArr;
        double double22 = quarterlyDouble18.getQseqQ();
        double[] doubleArray26 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble27 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray26);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble28 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray26);
        quarterlyDouble18.dArr = doubleArray26;
        double[] doubleArray33 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble34 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray33);
        double[] doubleArray35 = quarterlyDouble34.dArr;
        double[] doubleArray36 = quarterlyDouble34.dArr;
        quarterlyDouble18.dArr = doubleArray36;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble38 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray36);
        double[] doubleArray39 = quarterlyDouble38.dArr;
        double[] doubleArray40 = quarterlyDouble38.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble41 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray40);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble42 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray40);
        quarterlyDouble5.dArr = doubleArray40;
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 5100.0d + "'", double8 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-9999.9999d) + "'", double13 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 5100.0d + "'", double20 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 5100.0d + "'", double22 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[10.0, 52.0, 1.0]");
    }

    @Test
    public void test10580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10580");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
        java.lang.String str5 = companyData1.getTicker();
        java.lang.String str6 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = companyData1.getFdList();
        java.lang.String str9 = companyData1.getTicker();
        java.lang.String str10 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = companyData1.getFdList();
        java.lang.String str12 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = companyData1.getFdList();
        java.lang.String str14 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = companyData1.getFdList();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData18 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList15, (int) (byte) 0, 1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData21 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList15, (int) (short) 0, (int) (short) -1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData24 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList15, 10, 10);
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNotNull(fieldDataList3);
        org.junit.Assert.assertNotNull(fieldDataList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(fieldDataList7);
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(fieldDataList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNull(fieldData18);
        org.junit.Assert.assertNull(fieldData21);
        org.junit.Assert.assertNull(fieldData24);
    }

    @Test
    public void test10581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10581");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble38 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray37);
        double double39 = quarterlyDouble38.getMostRecent();
        double[] doubleArray40 = quarterlyDouble38.dArr;
        double double41 = quarterlyDouble38.getMostRecent();
        double double44 = quarterlyDouble38.deltaQ(0, 0);
        double double47 = quarterlyDouble38.deltaQ((int) (short) 100, 10);
        double double48 = quarterlyDouble38.getMostRecent();
        double double49 = quarterlyDouble38.getTtm();
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
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 52.0d + "'", double39 == 52.0d);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 52.0d + "'", double41 == 52.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 52.0d + "'", double48 == 52.0d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
    }

    @Test
    public void test10582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10582");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double double6 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.getTtmAvg();
        double double8 = quarterlyDouble4.getQseqQ();
        double[] doubleArray9 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray9);
        double double13 = quarterlyDouble10.deltaQ((int) (short) 100, (int) '#');
        double double14 = quarterlyDouble10.getMostRecent();
        double double15 = quarterlyDouble10.getTtmAvg();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 5100.0d + "'", double8 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test10583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10583");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
        java.lang.String str5 = companyData1.getTicker();
        java.lang.String str6 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = companyData1.getFdList();
        java.lang.String str8 = companyData1.getTicker();
        java.lang.String str9 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = companyData1.getFdList();
        java.lang.String str12 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = companyData1.getFdList();
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNotNull(fieldDataList3);
        org.junit.Assert.assertNotNull(fieldDataList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(fieldDataList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(fieldDataList10);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(fieldDataList13);
    }

    @Test
    public void test10584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10584");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
        java.lang.String str4 = companyData1.getTicker();
        java.lang.String str5 = companyData1.getTicker();
        java.lang.String str6 = companyData1.getTicker();
        java.lang.String str7 = companyData1.getTicker();
        java.lang.String str8 = companyData1.getTicker();
        java.lang.String str9 = companyData1.getTicker();
        java.lang.String str10 = companyData1.getTicker();
        java.lang.String str11 = companyData1.getTicker();
        java.lang.String str12 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = companyData1.getFdList();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData16 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList13, (int) '4', (int) (byte) 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData19 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList13, (int) (short) 1, (int) (byte) 10);
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNotNull(fieldDataList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(fieldDataList13);
        org.junit.Assert.assertNull(fieldData16);
        org.junit.Assert.assertNull(fieldData19);
    }

    @Test
    public void test10585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10585");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double6 = quarterlyDouble4.get((int) (byte) 1);
        double double7 = quarterlyDouble4.getMostRecent();
        double double8 = quarterlyDouble4.getQseqQ();
        double double11 = quarterlyDouble4.deltaQ((int) (byte) 100, (int) (short) 100);
        double double12 = quarterlyDouble4.getTtm();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = quarterlyDouble4.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 5100.0d + "'", double8 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test10586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10586");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double double6 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.getTtmAvg();
        double double9 = quarterlyDouble4.get((int) (byte) 100);
        double[] doubleArray10 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray10);
        double[] doubleArray15 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray15);
        double double17 = quarterlyDouble16.getTtmAvg();
        double double18 = quarterlyDouble16.getMostRecent();
        double double19 = quarterlyDouble16.getTtm();
        double[] doubleArray20 = quarterlyDouble16.dArr;
        quarterlyDouble11.dArr = doubleArray20;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble22 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray20);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble23 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray20);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble24 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray20);
        double double25 = quarterlyDouble24.getQseqQ();
        double double28 = quarterlyDouble24.deltaQ((int) ' ', (int) (byte) 100);
        double double29 = quarterlyDouble24.getTtmAvg();
        double double31 = quarterlyDouble24.get((int) (short) 100);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-9999.9999d) + "'", double9 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 52.0d + "'", double18 == 52.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 5100.0d + "'", double25 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-9999.9999d) + "'", double31 == (-9999.9999d));
    }

    @Test
    public void test10587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10587");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double double6 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.getTtmAvg();
        double double9 = quarterlyDouble4.get((int) ' ');
        double double10 = quarterlyDouble4.getMostRecent();
        double double12 = quarterlyDouble4.get(10);
        double double15 = quarterlyDouble4.deltaQ(10, (int) (short) -1);
        double[] doubleArray19 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray19);
        double double21 = quarterlyDouble20.getTtmAvg();
        double double22 = quarterlyDouble20.getTtm();
        double double23 = quarterlyDouble20.getTtmAvg();
        double double24 = quarterlyDouble20.getMostRecent();
        double double26 = quarterlyDouble20.get((int) '4');
        double[] doubleArray30 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble31 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray30);
        quarterlyDouble20.dArr = doubleArray30;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble33 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray30);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble34 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray30);
        quarterlyDouble4.dArr = doubleArray30;
        double[] doubleArray39 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble40 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray39);
        double double41 = quarterlyDouble40.getTtm();
        double double42 = quarterlyDouble40.getQseqQ();
        double[] doubleArray43 = quarterlyDouble40.dArr;
        double[] doubleArray47 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble48 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray47);
        quarterlyDouble40.dArr = doubleArray47;
        double double50 = quarterlyDouble40.getTtm();
        double[] doubleArray51 = quarterlyDouble40.dArr;
        double double52 = quarterlyDouble40.getQseqQ();
        double double53 = quarterlyDouble40.getTtm();
        double[] doubleArray54 = quarterlyDouble40.dArr;
        double double56 = quarterlyDouble40.get((int) '#');
        double[] doubleArray57 = quarterlyDouble40.dArr;
        quarterlyDouble4.dArr = doubleArray57;
        double double60 = quarterlyDouble4.get(1);
        double double62 = quarterlyDouble4.get((int) (byte) -1);
        double double63 = quarterlyDouble4.getQseqQ();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-9999.9999d) + "'", double9 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-9999.9999d) + "'", double12 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 52.0d + "'", double24 == 52.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-9999.9999d) + "'", double26 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 5100.0d + "'", double42 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 5100.0d + "'", double52 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + (-9999.9999d) + "'", double56 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 52.0d + "'", double60 == 52.0d);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + (-9999.9999d) + "'", double62 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 5100.0d + "'", double63 == 5100.0d);
    }

    @Test
    public void test10588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10588");
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
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = companyData1.getFdList();
        java.lang.String str16 = companyData1.getTicker();
        java.lang.String str17 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = companyData1.getFdList();
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNotNull(fieldDataList3);
        org.junit.Assert.assertNotNull(fieldDataList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(fieldDataList10);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList13);
        org.junit.Assert.assertNotNull(fieldDataList14);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(fieldDataList18);
    }

    @Test
    public void test10589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10589");
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
        double double22 = quarterlyDouble4.getMostRecent();
        double double25 = quarterlyDouble4.deltaQ((int) (short) 0, (int) (short) 0);
        double double26 = quarterlyDouble4.getQseqQ();
        double double28 = quarterlyDouble4.get((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = quarterlyDouble4.fmtGrowth1Q("\t\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
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
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 52.0d + "'", double22 == 52.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 5100.0d + "'", double26 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 52.0d + "'", double28 == 52.0d);
    }

    @Test
    public void test10590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10590");
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
        double double26 = quarterlyDouble25.getQseqQ();
        double double27 = quarterlyDouble25.getTtm();
        double double28 = quarterlyDouble25.getTtmAvg();
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
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 5100.0d + "'", double26 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
    }

    @Test
    public void test10591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10591");
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
        double double17 = quarterlyDouble5.getQseqQ();
        double double18 = quarterlyDouble5.getQseqQ();
        double double19 = quarterlyDouble5.getTtmAvg();
        double double20 = quarterlyDouble5.getQseqQ();
        double double21 = quarterlyDouble5.getQseqQ();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-9999.9999d) + "'", double14 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 5100.0d + "'", double17 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 5100.0d + "'", double18 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 5100.0d + "'", double20 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 5100.0d + "'", double21 == 5100.0d);
    }

    @Test
    public void test10592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10592");
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
        double double23 = quarterlyDouble21.get((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = quarterlyDouble21.fmtGrowth4Q("hi!");
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
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-9999.9999d) + "'", double23 == (-9999.9999d));
    }

    @Test
    public void test10593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10593");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double6 = quarterlyDouble4.get((int) (byte) 1);
        double double7 = quarterlyDouble4.getQseqQ();
        double[] doubleArray8 = quarterlyDouble4.dArr;
        double double11 = quarterlyDouble4.deltaQ((int) (byte) 100, (int) (byte) 100);
        double double13 = quarterlyDouble4.get((int) (short) 1);
        double double14 = quarterlyDouble4.getQseqQ();
        double double15 = quarterlyDouble4.getTtmAvg();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 5100.0d + "'", double7 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 5100.0d + "'", double14 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test10594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10594");
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
        double[] doubleArray52 = quarterlyDouble4.dArr;
        double double55 = quarterlyDouble4.deltaQ((int) '#', (-1));
        double[] doubleArray56 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble57 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray56);
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
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[10.0, 52.0, 1.0]");
    }

    @Test
    public void test10595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10595");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("", (int) (byte) 1, (int) (short) 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test10596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10596");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray7 = quarterlyDouble4.dArr;
        double double8 = quarterlyDouble4.getQseqQ();
        double double9 = quarterlyDouble4.getQseqQ();
        double double10 = quarterlyDouble4.getQseqQ();
        double double11 = quarterlyDouble4.getMostRecent();
        double double13 = quarterlyDouble4.get((int) (short) 0);
        double double14 = quarterlyDouble4.getMostRecent();
        double double16 = quarterlyDouble4.get(10);
        double double18 = quarterlyDouble4.get(10);
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
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-9999.9999d) + "'", double16 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-9999.9999d) + "'", double18 == (-9999.9999d));
    }

    @Test
    public void test10597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10597");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList5 = companyData1.getFdList();
        java.lang.String str6 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = companyData1.getFdList();
        java.lang.String str9 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = companyData1.getFdList();
        java.lang.String str11 = companyData1.getTicker();
        java.lang.String str12 = companyData1.getTicker();
        java.lang.String str13 = companyData1.getTicker();
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNotNull(fieldDataList3);
        org.junit.Assert.assertNotNull(fieldDataList4);
        org.junit.Assert.assertNotNull(fieldDataList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(fieldDataList7);
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(fieldDataList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test10598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10598");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%)", (int) (byte) 1, (int) (byte) -1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test10599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10599");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray7 = quarterlyDouble4.dArr;
        double[] doubleArray11 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray11);
        quarterlyDouble4.dArr = doubleArray11;
        double[] doubleArray14 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray14);
        double double16 = quarterlyDouble15.getMostRecent();
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
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 52.0d + "'", double16 == 52.0d);
    }

    @Test
    public void test10600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10600");
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
        double double41 = quarterlyDouble4.get((int) (byte) 0);
        double double43 = quarterlyDouble4.get((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double44 = quarterlyDouble4.getQoQ();
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
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 10.0d + "'", double41 == 10.0d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 52.0d + "'", double43 == 52.0d);
    }

    @Test
    public void test10601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10601");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double double6 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.getMostRecent();
        double double8 = quarterlyDouble4.getTtmAvg();
        double double9 = quarterlyDouble4.getTtm();
        double double10 = quarterlyDouble4.getQseqQ();
        double double11 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray12 = quarterlyDouble4.dArr;
        double[] doubleArray13 = quarterlyDouble4.dArr;
        double double16 = quarterlyDouble4.deltaQ((int) (byte) 100, (int) (short) 10);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 5100.0d + "'", double10 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test10602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10602");
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
        double double20 = quarterlyDouble5.deltaQ((int) (byte) 100, (int) (byte) 1);
        double double21 = quarterlyDouble5.getTtm();
        double double24 = quarterlyDouble5.deltaQ((int) 'a', (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = quarterlyDouble5.fmtGrowth1Q("\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
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
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    }

    @Test
    public void test10603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10603");
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
        double double21 = quarterlyDouble9.getMostRecent();
        double double22 = quarterlyDouble9.getQseqQ();
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
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 52.0d + "'", double21 == 52.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 5100.0d + "'", double22 == 5100.0d);
    }

    @Test
    public void test10604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10604");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        java.lang.String str3 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList5 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = companyData1.getFdList();
        java.lang.String str7 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = companyData1.getFdList();
        java.lang.String str9 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = companyData1.getFdList();
        java.lang.String str11 = companyData1.getTicker();
        java.lang.String str12 = companyData1.getTicker();
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(fieldDataList4);
        org.junit.Assert.assertNotNull(fieldDataList5);
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(fieldDataList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test10605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10605");
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
        double double18 = quarterlyDouble17.getTtmAvg();
        double double19 = quarterlyDouble17.getTtmAvg();
        double double20 = quarterlyDouble17.getMostRecent();
        double double21 = quarterlyDouble17.getQseqQ();
        double double22 = quarterlyDouble17.getTtm();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = quarterlyDouble17.fmtGrowth4Q("\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
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
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 52.0d + "'", double20 == 52.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 5100.0d + "'", double21 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test10606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10606");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList2, (int) (short) 0, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList9 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList2, (int) (short) 100, (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList12 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList2, (int) (short) 10, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList15 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList2, (int) (short) 100, (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList18 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList2, 0, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList19 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList((java.util.List<java.lang.String>) strList2);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(companyDataList6);
        org.junit.Assert.assertNotNull(companyDataList9);
        org.junit.Assert.assertNotNull(companyDataList12);
        org.junit.Assert.assertNotNull(companyDataList15);
        org.junit.Assert.assertNotNull(companyDataList18);
        org.junit.Assert.assertNotNull(manyCompanyDataList19);
    }

    @Test
    public void test10607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10607");
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
        double[] doubleArray46 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble47 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray46);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble48 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray46);
        double double50 = quarterlyDouble48.get((int) (short) -1);
        double[] doubleArray51 = quarterlyDouble48.dArr;
        double double52 = quarterlyDouble48.getQseqQ();
        double[] doubleArray53 = quarterlyDouble48.dArr;
        quarterlyDouble42.dArr = doubleArray53;
        double double56 = quarterlyDouble42.get((int) (short) 0);
        double double57 = quarterlyDouble42.getQseqQ();
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
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + (-9999.9999d) + "'", double50 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 5100.0d + "'", double52 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 10.0d + "'", double56 == 10.0d);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 5100.0d + "'", double57 == 5100.0d);
    }

    @Test
    public void test10608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10608");
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
        double double53 = quarterlyDouble4.getTtmAvg();
        double double55 = quarterlyDouble4.get((int) (short) 100);
        double double56 = quarterlyDouble4.getQseqQ();
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
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + (-9999.9999d) + "'", double55 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 5100.0d + "'", double56 == 5100.0d);
    }

    @Test
    public void test10609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10609");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double double6 = quarterlyDouble4.getTtm();
        double double8 = quarterlyDouble4.get((int) (byte) 100);
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
        quarterlyDouble13.dArr = doubleArray41;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble44 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray41);
        double[] doubleArray45 = quarterlyDouble44.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble46 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray45);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble47 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray45);
        quarterlyDouble4.dArr = doubleArray45;
        double double49 = quarterlyDouble4.getTtmAvg();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str51 = quarterlyDouble4.fmtGrowth1Q("\t\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-9999.9999d) + "'", double8 == (-9999.9999d));
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
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + (-9999.9999d) + "'", double40 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
    }

    @Test
    public void test10610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10610");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("");
        java.lang.String str2 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
        java.lang.String str4 = companyData1.getTicker();
        java.lang.String str5 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = companyData1.getFdList();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData10 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList7, (int) (byte) 10, (int) ' ');
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData13 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList7, (int) (byte) -1, (int) (byte) 1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData16 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList7, (int) (byte) 10, (int) ' ');
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData19 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList7, 0, (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(fieldDataList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList7);
        org.junit.Assert.assertNull(fieldData10);
        org.junit.Assert.assertNull(fieldData13);
        org.junit.Assert.assertNull(fieldData16);
        org.junit.Assert.assertNull(fieldData19);
    }

    @Test
    public void test10611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10611");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList2, (int) (short) 0, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList9 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList2, (int) (short) 100, (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList10 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList((java.util.List<java.lang.String>) strList2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList11 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList((java.util.List<java.lang.String>) strList2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList12 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList((java.util.List<java.lang.String>) strList2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList15 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList2, (int) (short) 100, (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList18 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList2, 0, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList21 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList2, (int) '4', 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList22 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList((java.util.List<java.lang.String>) strList2);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(companyDataList6);
        org.junit.Assert.assertNotNull(companyDataList9);
        org.junit.Assert.assertNotNull(manyCompanyDataList10);
        org.junit.Assert.assertNotNull(manyCompanyDataList11);
        org.junit.Assert.assertNotNull(manyCompanyDataList12);
        org.junit.Assert.assertNotNull(companyDataList15);
        org.junit.Assert.assertNotNull(companyDataList18);
        org.junit.Assert.assertNotNull(companyDataList21);
        org.junit.Assert.assertNotNull(manyCompanyDataList22);
    }

    @Test
    public void test10612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10612");
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
        double double19 = quarterlyDouble17.get((int) (byte) 1);
        double double20 = quarterlyDouble17.getQseqQ();
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
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 52.0d + "'", double19 == 52.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 5100.0d + "'", double20 == 5100.0d);
    }

    @Test
    public void test10613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10613");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double6 = quarterlyDouble4.get((int) (byte) 1);
        double double7 = quarterlyDouble4.getQseqQ();
        double double8 = quarterlyDouble4.getQseqQ();
        double double9 = quarterlyDouble4.getTtmAvg();
        double double10 = quarterlyDouble4.getTtm();
        double[] doubleArray11 = quarterlyDouble4.dArr;
        double double14 = quarterlyDouble4.deltaQ((int) (byte) -1, (int) (short) 1);
        double[] doubleArray15 = quarterlyDouble4.dArr;
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 5100.0d + "'", double7 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 5100.0d + "'", double8 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 52.0, 1.0]");
    }

    @Test
    public void test10614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10614");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList2, (int) (short) 0, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList7 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList((java.util.List<java.lang.String>) strList2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList8 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList((java.util.List<java.lang.String>) strList2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList11 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList2, 0, (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList14 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList2, 0, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList15 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList((java.util.List<java.lang.String>) strList2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList18 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList2, (int) 'a', (int) (byte) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList19 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList((java.util.List<java.lang.String>) strList2);
        java.lang.Class<?> wildcardClass20 = manyCompanyDataList19.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(companyDataList6);
        org.junit.Assert.assertNotNull(manyCompanyDataList7);
        org.junit.Assert.assertNotNull(manyCompanyDataList8);
        org.junit.Assert.assertNotNull(companyDataList11);
        org.junit.Assert.assertNotNull(companyDataList14);
        org.junit.Assert.assertNotNull(manyCompanyDataList15);
        org.junit.Assert.assertNotNull(companyDataList18);
        org.junit.Assert.assertNotNull(manyCompanyDataList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test10615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10615");
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
        double double18 = quarterlyDouble4.get((int) (short) 100);
        double[] doubleArray22 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble23 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray22);
        double double24 = quarterlyDouble23.getTtm();
        double double25 = quarterlyDouble23.getQseqQ();
        double double26 = quarterlyDouble23.getTtmAvg();
        double double27 = quarterlyDouble23.getQseqQ();
        double double30 = quarterlyDouble23.deltaQ((-1), 0);
        double[] doubleArray31 = quarterlyDouble23.dArr;
        quarterlyDouble4.dArr = doubleArray31;
        double double35 = quarterlyDouble4.deltaQ((int) (byte) 100, (int) (short) 100);
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
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-9999.9999d) + "'", double18 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 5100.0d + "'", double25 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 5100.0d + "'", double27 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
    }

    @Test
    public void test10616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10616");
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
        double double17 = quarterlyDouble4.getMostRecent();
        double double18 = quarterlyDouble4.getTtmAvg();
        double double19 = quarterlyDouble4.getMostRecent();
        double double20 = quarterlyDouble4.getTtmAvg();
        double double21 = quarterlyDouble4.getTtmAvg();
        double double23 = quarterlyDouble4.get((-1));
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
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 52.0d + "'", double19 == 52.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-9999.9999d) + "'", double23 == (-9999.9999d));
    }

    @Test
    public void test10617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10617");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
        java.lang.String str5 = companyData1.getTicker();
        java.lang.String str6 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = companyData1.getFdList();
        java.lang.String str9 = companyData1.getTicker();
        java.lang.String str10 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = companyData1.getFdList();
        java.lang.String str13 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = companyData1.getFdList();
        java.lang.String str15 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = companyData1.getFdList();
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNotNull(fieldDataList3);
        org.junit.Assert.assertNotNull(fieldDataList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(fieldDataList7);
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(fieldDataList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(fieldDataList16);
    }

    @Test
    public void test10618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10618");
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
        double[] doubleArray28 = quarterlyDouble27.dArr;
        double double29 = quarterlyDouble27.getTtmAvg();
        double double31 = quarterlyDouble27.get(100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = quarterlyDouble27.fmtGrowth1Q("\t\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
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
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-9999.9999d) + "'", double31 == (-9999.9999d));
    }

    @Test
    public void test10619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10619");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double7 = quarterlyDouble5.get(10);
        double double8 = quarterlyDouble5.getTtm();
        double double10 = quarterlyDouble5.get(10);
        double double12 = quarterlyDouble5.get((int) (short) 100);
        java.lang.Class<?> wildcardClass13 = quarterlyDouble5.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9999.9999d) + "'", double7 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-9999.9999d) + "'", double12 == (-9999.9999d));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test10620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10620");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double[] doubleArray6 = quarterlyDouble5.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray6);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray6);
        double[] doubleArray9 = quarterlyDouble8.dArr;
        double[] doubleArray13 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray13);
        double double16 = quarterlyDouble14.get((int) (byte) 1);
        double double17 = quarterlyDouble14.getQseqQ();
        double double18 = quarterlyDouble14.getQseqQ();
        double double19 = quarterlyDouble14.getTtm();
        double[] doubleArray20 = quarterlyDouble14.dArr;
        double double21 = quarterlyDouble14.getQseqQ();
        double double22 = quarterlyDouble14.getTtmAvg();
        double[] doubleArray23 = quarterlyDouble14.dArr;
        quarterlyDouble8.dArr = doubleArray23;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble25 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray23);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 52.0d + "'", double16 == 52.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 5100.0d + "'", double17 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 5100.0d + "'", double18 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 5100.0d + "'", double21 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0, 52.0, 1.0]");
    }

    @Test
    public void test10621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10621");
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
        double[] doubleArray22 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble23 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray22);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble24 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray22);
        double double27 = quarterlyDouble24.deltaQ((int) (short) 10, (int) ' ');
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
        double[] doubleArray46 = quarterlyDouble32.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble47 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray46);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble48 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray46);
        double[] doubleArray52 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble53 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray52);
        double double54 = quarterlyDouble53.getTtm();
        double double55 = quarterlyDouble53.getQseqQ();
        double[] doubleArray59 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble60 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray59);
        quarterlyDouble53.dArr = doubleArray59;
        double double62 = quarterlyDouble53.getQseqQ();
        double double65 = quarterlyDouble53.deltaQ((int) (short) 100, (int) (byte) -1);
        double[] doubleArray69 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble70 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray69);
        double double71 = quarterlyDouble70.getTtmAvg();
        double double72 = quarterlyDouble70.getMostRecent();
        double double74 = quarterlyDouble70.get((int) 'a');
        double double76 = quarterlyDouble70.get((int) (byte) -1);
        double[] doubleArray80 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble81 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray80);
        double double82 = quarterlyDouble81.getTtm();
        double double83 = quarterlyDouble81.getQseqQ();
        double[] doubleArray84 = quarterlyDouble81.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble85 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray84);
        quarterlyDouble70.dArr = doubleArray84;
        quarterlyDouble53.dArr = doubleArray84;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble88 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray84);
        quarterlyDouble48.dArr = doubleArray84;
        quarterlyDouble24.dArr = doubleArray84;
        quarterlyDouble4.dArr = doubleArray84;
        double double93 = quarterlyDouble4.get(0);
        double double94 = quarterlyDouble4.getTtmAvg();
        double double95 = quarterlyDouble4.getTtm();
        double[] doubleArray96 = null;
        quarterlyDouble4.dArr = doubleArray96;
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
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, 52.0, 1.0]");
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
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 5100.0d + "'", double55 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 5100.0d + "'", double62 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.0d + "'", double65 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 0.0d + "'", double71 == 0.0d);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 52.0d + "'", double72 == 52.0d);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + (-9999.9999d) + "'", double74 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + (-9999.9999d) + "'", double76 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 0.0d + "'", double82 == 0.0d);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 5100.0d + "'", double83 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray84), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + 10.0d + "'", double93 == 10.0d);
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + 0.0d + "'", double94 == 0.0d);
        org.junit.Assert.assertTrue("'" + double95 + "' != '" + 0.0d + "'", double95 == 0.0d);
    }

    @Test
    public void test10622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10622");
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
        double double72 = quarterlyDouble5.getMostRecent();
        double[] doubleArray73 = quarterlyDouble5.dArr;
        double double74 = quarterlyDouble5.getTtmAvg();
        java.lang.Class<?> wildcardClass75 = quarterlyDouble5.getClass();
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
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 52.0d + "'", double72 == 52.0d);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 0.0d + "'", double74 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass75);
    }

    @Test
    public void test10623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10623");
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
        double double41 = quarterlyDouble4.getMostRecent();
        double double42 = quarterlyDouble4.getTtm();
        double double43 = quarterlyDouble4.getMostRecent();
        double double45 = quarterlyDouble4.get((int) '#');
        double double46 = quarterlyDouble4.getMostRecent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str48 = quarterlyDouble4.fmtGrowth4Q("\t\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
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
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 52.0d + "'", double41 == 52.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 52.0d + "'", double43 == 52.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + (-9999.9999d) + "'", double45 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 52.0d + "'", double46 == 52.0d);
    }

    @Test
    public void test10624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10624");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList2, (int) (short) 0, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList9 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList2, (int) (short) 100, (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList12 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList2, (int) (short) 10, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList15 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList2, (int) (byte) 1, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList18 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList2, 10, (int) (byte) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList19 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList((java.util.List<java.lang.String>) strList2);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(companyDataList6);
        org.junit.Assert.assertNotNull(companyDataList9);
        org.junit.Assert.assertNotNull(companyDataList12);
        org.junit.Assert.assertNotNull(companyDataList15);
        org.junit.Assert.assertNotNull(companyDataList18);
        org.junit.Assert.assertNotNull(manyCompanyDataList19);
    }

    @Test
    public void test10625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10625");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray18);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray18);
        double double21 = quarterlyDouble20.getTtmAvg();
        double[] doubleArray22 = quarterlyDouble20.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble23 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray22);
        double[] doubleArray24 = quarterlyDouble23.dArr;
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
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[10.0, 52.0, 1.0]");
    }

    @Test
    public void test10626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10626");
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
        double double20 = quarterlyDouble4.getQseqQ();
        double double21 = quarterlyDouble4.getTtm();
        double double22 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray23 = quarterlyDouble4.dArr;
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
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 5100.0d + "'", double20 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0, 52.0, 1.0]");
    }

    @Test
    public void test10627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10627");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double7 = quarterlyDouble5.get(10);
        double double8 = quarterlyDouble5.getMostRecent();
        double double10 = quarterlyDouble5.get((int) (byte) -1);
        double double11 = quarterlyDouble5.getTtm();
        double double12 = quarterlyDouble5.getTtmAvg();
        double double15 = quarterlyDouble5.deltaQ((int) '#', (int) (short) 10);
        double double17 = quarterlyDouble5.get((int) (byte) 100);
        double double18 = quarterlyDouble5.getMostRecent();
        double double19 = quarterlyDouble5.getTtmAvg();
        double[] doubleArray23 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble24 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray23);
        double[] doubleArray25 = quarterlyDouble24.dArr;
        double double26 = quarterlyDouble24.getQseqQ();
        double[] doubleArray27 = new double[] {};
        quarterlyDouble24.dArr = doubleArray27;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble29 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray27);
        quarterlyDouble5.dArr = doubleArray27;
        double double31 = quarterlyDouble5.getTtmAvg();
        double[] doubleArray32 = quarterlyDouble5.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble33 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray32);
        double double36 = quarterlyDouble33.deltaQ((int) (short) -1, (int) (short) 0);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9999.9999d) + "'", double7 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-9999.9999d) + "'", double17 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 52.0d + "'", double18 == 52.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 5100.0d + "'", double26 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[]");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[]");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
    }

    @Test
    public void test10628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10628");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double double6 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.getTtmAvg();
        double double9 = quarterlyDouble4.get((int) (byte) 100);
        double[] doubleArray13 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray13);
        double double15 = quarterlyDouble14.getTtm();
        double double16 = quarterlyDouble14.getQseqQ();
        double[] doubleArray17 = quarterlyDouble14.dArr;
        double double18 = quarterlyDouble14.getQseqQ();
        double[] doubleArray22 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble23 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray22);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble24 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray22);
        quarterlyDouble14.dArr = doubleArray22;
        double[] doubleArray26 = quarterlyDouble14.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble27 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray26);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble28 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray26);
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble48 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray47);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble49 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray47);
        quarterlyDouble28.dArr = doubleArray47;
        quarterlyDouble4.dArr = doubleArray47;
        double[] doubleArray52 = quarterlyDouble4.dArr;
        double double53 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray57 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble58 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray57);
        double double60 = quarterlyDouble58.get((int) (byte) 1);
        double double61 = quarterlyDouble58.getQseqQ();
        double double62 = quarterlyDouble58.getQseqQ();
        double double63 = quarterlyDouble58.getTtmAvg();
        double double64 = quarterlyDouble58.getTtm();
        double[] doubleArray65 = quarterlyDouble58.dArr;
        double double67 = quarterlyDouble58.get(1);
        double double69 = quarterlyDouble58.get((int) 'a');
        double[] doubleArray70 = quarterlyDouble58.dArr;
        double[] doubleArray74 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble75 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray74);
        double double76 = quarterlyDouble75.getTtmAvg();
        double double77 = quarterlyDouble75.getMostRecent();
        double double78 = quarterlyDouble75.getTtm();
        double double79 = quarterlyDouble75.getTtm();
        double[] doubleArray80 = quarterlyDouble75.dArr;
        quarterlyDouble58.dArr = doubleArray80;
        double[] doubleArray82 = quarterlyDouble58.dArr;
        quarterlyDouble4.dArr = doubleArray82;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str85 = quarterlyDouble4.fmtGrowth1Q("");
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
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 5100.0d + "'", double16 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 5100.0d + "'", double18 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0, 52.0, 1.0]");
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
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[]");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 52.0d + "'", double60 == 52.0d);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 5100.0d + "'", double61 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 5100.0d + "'", double62 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.0d + "'", double63 == 0.0d);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.0d + "'", double64 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 52.0d + "'", double67 == 52.0d);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + (-9999.9999d) + "'", double69 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 0.0d + "'", double76 == 0.0d);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 52.0d + "'", double77 == 52.0d);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 0.0d + "'", double78 == 0.0d);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 0.0d + "'", double79 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray82), "[10.0, 52.0, 1.0]");
    }

    @Test
    public void test10629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10629");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble22 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray18);
        double[] doubleArray23 = null;
        quarterlyDouble22.dArr = doubleArray23;
        double[] doubleArray25 = quarterlyDouble22.dArr;
        double[] doubleArray29 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble30 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray29);
        double double31 = quarterlyDouble30.getTtm();
        double double32 = quarterlyDouble30.getQseqQ();
        double[] doubleArray33 = quarterlyDouble30.dArr;
        double double34 = quarterlyDouble30.getQseqQ();
        double[] doubleArray38 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble39 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray38);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble40 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray38);
        quarterlyDouble30.dArr = doubleArray38;
        double[] doubleArray45 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble46 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray45);
        double[] doubleArray47 = quarterlyDouble46.dArr;
        double[] doubleArray48 = quarterlyDouble46.dArr;
        quarterlyDouble30.dArr = doubleArray48;
        double double50 = quarterlyDouble30.getQseqQ();
        double double51 = quarterlyDouble30.getMostRecent();
        double[] doubleArray52 = quarterlyDouble30.dArr;
        quarterlyDouble22.dArr = doubleArray52;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble54 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray52);
        double double55 = quarterlyDouble54.getMostRecent();
        double double56 = quarterlyDouble54.getTtmAvg();
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
        org.junit.Assert.assertNull(doubleArray25);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 5100.0d + "'", double32 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 5100.0d + "'", double34 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 5100.0d + "'", double50 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 52.0d + "'", double51 == 52.0d);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 52.0d + "'", double55 == 52.0d);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
    }

    @Test
    public void test10630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10630");
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
        double[] doubleArray50 = quarterlyDouble25.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble51 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray50);
        double double54 = quarterlyDouble51.deltaQ((int) '4', (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str56 = quarterlyDouble51.fmtGrowth4Q("");
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
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
    }

    @Test
    public void test10631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10631");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        java.lang.String str3 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
        java.lang.String str5 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = companyData1.getFdList();
        java.lang.Class<?> wildcardClass9 = fieldDataList8.getClass();
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(fieldDataList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList7);
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test10632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10632");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double7 = quarterlyDouble4.deltaQ((int) (short) 10, (int) (short) 100);
        double double9 = quarterlyDouble4.get((int) (byte) 1);
        double double10 = quarterlyDouble4.getTtm();
        double double13 = quarterlyDouble4.deltaQ((int) (byte) 0, (int) (byte) -1);
        double double14 = quarterlyDouble4.getMostRecent();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
    }

    @Test
    public void test10633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10633");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double double6 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.getMostRecent();
        double double8 = quarterlyDouble4.getTtmAvg();
        double double9 = quarterlyDouble4.getMostRecent();
        double double11 = quarterlyDouble4.get((int) '4');
        double double14 = quarterlyDouble4.deltaQ((int) (byte) 100, (int) (short) 10);
        double double15 = quarterlyDouble4.getQseqQ();
        double double16 = quarterlyDouble4.getQseqQ();
        double double19 = quarterlyDouble4.deltaQ((int) (byte) 10, (-1));
        double double21 = quarterlyDouble4.get((-1));
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
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-9999.9999d) + "'", double11 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 5100.0d + "'", double15 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 5100.0d + "'", double16 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-9999.9999d) + "'", double21 == (-9999.9999d));
    }

    @Test
    public void test10634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10634");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double6 = quarterlyDouble4.get((int) (byte) 1);
        double double7 = quarterlyDouble4.getQseqQ();
        double double8 = quarterlyDouble4.getQseqQ();
        double double9 = quarterlyDouble4.getTtm();
        double[] doubleArray13 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray13);
        double double15 = quarterlyDouble14.getTtmAvg();
        double double16 = quarterlyDouble14.getMostRecent();
        double double18 = quarterlyDouble14.get((int) 'a');
        double double20 = quarterlyDouble14.get((int) (byte) -1);
        double[] doubleArray24 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble25 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray24);
        double double26 = quarterlyDouble25.getTtm();
        double double27 = quarterlyDouble25.getQseqQ();
        double[] doubleArray28 = quarterlyDouble25.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble29 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray28);
        quarterlyDouble14.dArr = doubleArray28;
        double double31 = quarterlyDouble14.getMostRecent();
        double[] doubleArray35 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble36 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray35);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble37 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray35);
        double double39 = quarterlyDouble37.get(10);
        double double40 = quarterlyDouble37.getMostRecent();
        double[] doubleArray41 = quarterlyDouble37.dArr;
        quarterlyDouble14.dArr = doubleArray41;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble43 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray41);
        quarterlyDouble4.dArr = doubleArray41;
        double[] doubleArray48 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble49 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray48);
        double double50 = quarterlyDouble49.getTtm();
        double double51 = quarterlyDouble49.getQseqQ();
        double[] doubleArray52 = quarterlyDouble49.dArr;
        double double53 = quarterlyDouble49.getQseqQ();
        double[] doubleArray57 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble58 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray57);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble59 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray57);
        quarterlyDouble49.dArr = doubleArray57;
        quarterlyDouble4.dArr = doubleArray57;
        double[] doubleArray65 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble66 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray65);
        double double67 = quarterlyDouble66.getTtm();
        double double68 = quarterlyDouble66.getMostRecent();
        double double69 = quarterlyDouble66.getTtmAvg();
        double double70 = quarterlyDouble66.getQseqQ();
        double[] doubleArray74 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble75 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray74);
        double double76 = quarterlyDouble75.getTtm();
        double double77 = quarterlyDouble75.getQseqQ();
        double[] doubleArray78 = quarterlyDouble75.dArr;
        double[] doubleArray82 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble83 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray82);
        quarterlyDouble75.dArr = doubleArray82;
        double double85 = quarterlyDouble75.getTtm();
        double[] doubleArray86 = quarterlyDouble75.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble87 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray86);
        double double89 = quarterlyDouble87.get((int) (byte) 10);
        double double90 = quarterlyDouble87.getTtm();
        double[] doubleArray91 = quarterlyDouble87.dArr;
        quarterlyDouble66.dArr = doubleArray91;
        quarterlyDouble4.dArr = doubleArray91;
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 5100.0d + "'", double7 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 5100.0d + "'", double8 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 52.0d + "'", double16 == 52.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-9999.9999d) + "'", double18 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-9999.9999d) + "'", double20 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 5100.0d + "'", double27 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 52.0d + "'", double31 == 52.0d);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + (-9999.9999d) + "'", double39 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 52.0d + "'", double40 == 52.0d);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 5100.0d + "'", double51 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 5100.0d + "'", double53 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 0.0d + "'", double67 == 0.0d);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 52.0d + "'", double68 == 52.0d);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 0.0d + "'", double69 == 0.0d);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 5100.0d + "'", double70 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 0.0d + "'", double76 == 0.0d);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 5100.0d + "'", double77 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray82), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 0.0d + "'", double85 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray86), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + (-9999.9999d) + "'", double89 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 0.0d + "'", double90 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray91), "[10.0, 52.0, 1.0]");
    }

    @Test
    public void test10635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10635");
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
        double double55 = quarterlyDouble4.deltaQ((int) (byte) -1, (int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
    }

    @Test
    public void test10636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10636");
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
        double[] doubleArray63 = quarterlyDouble20.dArr;
        double double66 = quarterlyDouble20.deltaQ((int) '#', (int) (byte) -1);
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
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.0d + "'", double66 == 0.0d);
    }

    @Test
    public void test10637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10637");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double[] doubleArray5 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray5);
        double double7 = quarterlyDouble6.getTtm();
        double double8 = quarterlyDouble6.getQseqQ();
        double[] doubleArray9 = quarterlyDouble6.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray9);
        double double11 = quarterlyDouble10.getTtm();
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble30 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray27);
        double[] doubleArray34 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble35 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray34);
        double double36 = quarterlyDouble35.getTtm();
        double double38 = quarterlyDouble35.get((int) '4');
        double[] doubleArray42 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble43 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray42);
        double[] doubleArray44 = quarterlyDouble43.dArr;
        double double45 = quarterlyDouble43.getQseqQ();
        double[] doubleArray46 = new double[] {};
        quarterlyDouble43.dArr = doubleArray46;
        quarterlyDouble35.dArr = doubleArray46;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble49 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray46);
        quarterlyDouble30.dArr = doubleArray46;
        quarterlyDouble10.dArr = doubleArray46;
        double[] doubleArray52 = quarterlyDouble10.dArr;
        double[] doubleArray53 = quarterlyDouble10.dArr;
        double[] doubleArray54 = quarterlyDouble10.dArr;
        quarterlyDouble1.dArr = doubleArray54;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble56 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray54);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble57 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray54);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble58 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray54);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 5100.0d + "'", double8 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0, 52.0, 1.0]");
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
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + (-9999.9999d) + "'", double38 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 5100.0d + "'", double45 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[]");
    }

    @Test
    public void test10638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10638");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double7 = quarterlyDouble4.deltaQ((int) (short) 10, (int) (short) 100);
        double[] doubleArray8 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray8);
        double double10 = quarterlyDouble9.getTtm();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test10639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10639");
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
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = companyData1.getFdList();
        java.lang.String str12 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = companyData1.getFdList();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData16 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList13, (int) '4', (int) 'a');
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData19 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList13, (int) (short) 1, (int) (short) -1);
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNotNull(fieldDataList3);
        org.junit.Assert.assertNotNull(fieldDataList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(fieldDataList10);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(fieldDataList13);
        org.junit.Assert.assertNull(fieldData16);
        org.junit.Assert.assertNull(fieldData19);
    }

    @Test
    public void test10640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10640");
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
        double[] doubleArray22 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble23 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray22);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble24 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray22);
        double double27 = quarterlyDouble24.deltaQ((int) (short) 10, (int) ' ');
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
        double[] doubleArray46 = quarterlyDouble32.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble47 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray46);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble48 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray46);
        double[] doubleArray52 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble53 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray52);
        double double54 = quarterlyDouble53.getTtm();
        double double55 = quarterlyDouble53.getQseqQ();
        double[] doubleArray59 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble60 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray59);
        quarterlyDouble53.dArr = doubleArray59;
        double double62 = quarterlyDouble53.getQseqQ();
        double double65 = quarterlyDouble53.deltaQ((int) (short) 100, (int) (byte) -1);
        double[] doubleArray69 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble70 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray69);
        double double71 = quarterlyDouble70.getTtmAvg();
        double double72 = quarterlyDouble70.getMostRecent();
        double double74 = quarterlyDouble70.get((int) 'a');
        double double76 = quarterlyDouble70.get((int) (byte) -1);
        double[] doubleArray80 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble81 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray80);
        double double82 = quarterlyDouble81.getTtm();
        double double83 = quarterlyDouble81.getQseqQ();
        double[] doubleArray84 = quarterlyDouble81.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble85 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray84);
        quarterlyDouble70.dArr = doubleArray84;
        quarterlyDouble53.dArr = doubleArray84;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble88 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray84);
        quarterlyDouble48.dArr = doubleArray84;
        quarterlyDouble24.dArr = doubleArray84;
        quarterlyDouble4.dArr = doubleArray84;
        double double92 = quarterlyDouble4.getQseqQ();
        double[] doubleArray93 = quarterlyDouble4.dArr;
        double double94 = quarterlyDouble4.getTtm();
        double double95 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray96 = quarterlyDouble4.dArr;
        double double98 = quarterlyDouble4.get((int) ' ');
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
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, 52.0, 1.0]");
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
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 5100.0d + "'", double55 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 5100.0d + "'", double62 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.0d + "'", double65 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 0.0d + "'", double71 == 0.0d);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 52.0d + "'", double72 == 52.0d);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + (-9999.9999d) + "'", double74 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + (-9999.9999d) + "'", double76 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 0.0d + "'", double82 == 0.0d);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 5100.0d + "'", double83 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray84), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 5100.0d + "'", double92 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray93);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray93), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + 0.0d + "'", double94 == 0.0d);
        org.junit.Assert.assertTrue("'" + double95 + "' != '" + 0.0d + "'", double95 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray96);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray96), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double98 + "' != '" + (-9999.9999d) + "'", double98 == (-9999.9999d));
    }

    @Test
    public void test10641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10641");
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
        // The following exception was thrown during execution in test generation
        try {
            double double20 = quarterlyDouble8.deltaQ((int) (byte) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    }

    @Test
    public void test10642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10642");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
        java.lang.String str5 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = companyData1.getFdList();
        java.lang.String str7 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = companyData1.getFdList();
        java.lang.String str10 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = companyData1.getFdList();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData15 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList12, (int) (short) -1, (int) (short) -1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData18 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList12, (int) (short) 10, 100);
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNotNull(fieldDataList3);
        org.junit.Assert.assertNotNull(fieldDataList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNull(fieldData15);
        org.junit.Assert.assertNull(fieldData18);
    }

    @Test
    public void test10643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10643");
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
        double double18 = quarterlyDouble4.get((int) (short) 100);
        double double20 = quarterlyDouble4.get((int) (byte) -1);
        double double21 = quarterlyDouble4.getTtm();
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
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-9999.9999d) + "'", double18 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-9999.9999d) + "'", double20 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test10644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10644");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList2, (int) (short) 0, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList7 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList((java.util.List<java.lang.String>) strList2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList8 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList((java.util.List<java.lang.String>) strList2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList11 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList2, (int) (byte) -1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList14 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList2, 0, (int) (byte) -1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(companyDataList6);
        org.junit.Assert.assertNotNull(manyCompanyDataList7);
        org.junit.Assert.assertNotNull(manyCompanyDataList8);
        org.junit.Assert.assertNotNull(companyDataList11);
        org.junit.Assert.assertNotNull(companyDataList14);
    }

    @Test
    public void test10645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10645");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("");
        java.lang.String str2 = companyData1.getTicker();
        java.lang.String str3 = companyData1.getTicker();
        java.lang.String str4 = companyData1.getTicker();
        java.lang.String str5 = companyData1.getTicker();
        java.lang.String str6 = companyData1.getTicker();
        java.lang.String str7 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = companyData1.getFdList();
        java.lang.String str10 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = companyData1.getFdList();
        java.lang.String str14 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = companyData1.getFdList();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData18 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList15, 0, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNull(fieldData18);
    }

    @Test
    public void test10646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10646");
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
        double double17 = quarterlyDouble4.getTtm();
        double double19 = quarterlyDouble4.get((int) '#');
        double double21 = quarterlyDouble4.get((int) '#');
        double double22 = quarterlyDouble4.getMostRecent();
        double double23 = quarterlyDouble4.getTtmAvg();
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-9999.9999d) + "'", double19 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-9999.9999d) + "'", double21 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 52.0d + "'", double22 == 52.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test10647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10647");
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
        double double22 = quarterlyDouble4.getQseqQ();
        double double24 = quarterlyDouble4.get((int) ' ');
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
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 5100.0d + "'", double22 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-9999.9999d) + "'", double24 == (-9999.9999d));
    }

    @Test
    public void test10648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10648");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList2, (int) (short) 0, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList7 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList((java.util.List<java.lang.String>) strList2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList8 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList((java.util.List<java.lang.String>) strList2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList11 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList2, 0, (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList14 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList2, (int) (short) 10, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList17 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList2, (int) (byte) 10, (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList20 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList2, (int) (short) 1, (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList23 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList2, 1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList26 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList2, (int) '#', (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList27 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList((java.util.List<java.lang.String>) strList2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList30 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList2, (int) '4', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList31 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList((java.util.List<java.lang.String>) strList2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList34 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList2, (int) (short) 0, (int) (short) 0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(companyDataList6);
        org.junit.Assert.assertNotNull(manyCompanyDataList7);
        org.junit.Assert.assertNotNull(manyCompanyDataList8);
        org.junit.Assert.assertNotNull(companyDataList11);
        org.junit.Assert.assertNotNull(companyDataList14);
        org.junit.Assert.assertNotNull(companyDataList17);
        org.junit.Assert.assertNotNull(companyDataList20);
        org.junit.Assert.assertNotNull(companyDataList23);
        org.junit.Assert.assertNotNull(companyDataList26);
        org.junit.Assert.assertNotNull(manyCompanyDataList27);
        org.junit.Assert.assertNotNull(companyDataList30);
        org.junit.Assert.assertNotNull(manyCompanyDataList31);
        org.junit.Assert.assertNotNull(companyDataList34);
    }

    @Test
    public void test10649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10649");
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
        double double18 = quarterlyDouble4.getMostRecent();
        double double21 = quarterlyDouble4.deltaQ(0, (int) (short) 1);
        double double22 = quarterlyDouble4.getQseqQ();
        double double23 = quarterlyDouble4.getQseqQ();
        double double24 = quarterlyDouble4.getQseqQ();
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
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 52.0d + "'", double18 == 52.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 5100.0d + "'", double22 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 5100.0d + "'", double23 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 5100.0d + "'", double24 == 5100.0d);
    }

    @Test
    public void test10650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10650");
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
        double double37 = quarterlyDouble4.get((int) '4');
        double double38 = quarterlyDouble4.getTtm();
        double double39 = quarterlyDouble4.getTtm();
        double double42 = quarterlyDouble4.deltaQ((int) 'a', (int) (short) 0);
        double double43 = quarterlyDouble4.getQseqQ();
        double double45 = quarterlyDouble4.get((int) (byte) 10);
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
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + (-9999.9999d) + "'", double37 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 5100.0d + "'", double43 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + (-9999.9999d) + "'", double45 == (-9999.9999d));
    }

    @Test
    public void test10651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10651");
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
        double[] doubleArray18 = quarterlyDouble4.dArr;
        double double20 = quarterlyDouble4.get((int) '#');
        double[] doubleArray24 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble25 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray24);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble26 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray24);
        double[] doubleArray27 = quarterlyDouble26.dArr;
        double[] doubleArray31 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble32 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray31);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble33 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray31);
        double double35 = quarterlyDouble33.get(100);
        double[] doubleArray36 = quarterlyDouble33.dArr;
        quarterlyDouble26.dArr = doubleArray36;
        double[] doubleArray41 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble42 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray41);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble43 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray41);
        double double45 = quarterlyDouble43.get(100);
        double[] doubleArray46 = quarterlyDouble43.dArr;
        quarterlyDouble26.dArr = doubleArray46;
        double double48 = quarterlyDouble26.getTtm();
        double[] doubleArray49 = quarterlyDouble26.dArr;
        quarterlyDouble4.dArr = doubleArray49;
        double double52 = quarterlyDouble4.get(100);
        double double53 = quarterlyDouble4.getTtm();
        double double54 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray55 = quarterlyDouble4.dArr;
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
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-9999.9999d) + "'", double20 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-9999.9999d) + "'", double35 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + (-9999.9999d) + "'", double45 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + (-9999.9999d) + "'", double52 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[10.0, 52.0, 1.0]");
    }

    @Test
    public void test10652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10652");
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
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = companyData1.getFdList();
        java.lang.String str12 = companyData1.getTicker();
        java.lang.String str13 = companyData1.getTicker();
        java.lang.String str14 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = companyData1.getFdList();
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNotNull(fieldDataList3);
        org.junit.Assert.assertNotNull(fieldDataList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(fieldDataList10);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(fieldDataList15);
    }

    @Test
    public void test10653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10653");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble45 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray42);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble46 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray42);
        // The following exception was thrown during execution in test generation
        try {
            double double47 = quarterlyDouble46.getQoQ();
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
    public void test10654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10654");
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
        double double23 = quarterlyDouble4.getTtm();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = quarterlyDouble4.fmtGrowth4Q("");
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
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test10655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10655");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray18);
        double double21 = quarterlyDouble20.getTtm();
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
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test10656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10656");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double6 = quarterlyDouble4.get((int) (byte) 1);
        double double7 = quarterlyDouble4.getQseqQ();
        double double8 = quarterlyDouble4.getQseqQ();
        double double9 = quarterlyDouble4.getTtm();
        double double10 = quarterlyDouble4.getTtmAvg();
        double double12 = quarterlyDouble4.get((int) (byte) 10);
        double double14 = quarterlyDouble4.get((int) (byte) 1);
        double double17 = quarterlyDouble4.deltaQ((int) (short) -1, (int) (byte) -1);
        double double18 = quarterlyDouble4.getQseqQ();
        double double19 = quarterlyDouble4.getTtmAvg();
        double double20 = quarterlyDouble4.getTtm();
        double[] doubleArray21 = quarterlyDouble4.dArr;
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 5100.0d + "'", double7 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 5100.0d + "'", double8 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-9999.9999d) + "'", double12 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 5100.0d + "'", double18 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[10.0, 52.0, 1.0]");
    }

    @Test
    public void test10657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10657");
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
        double double18 = quarterlyDouble17.getMostRecent();
        double double19 = quarterlyDouble17.getMostRecent();
        double double20 = quarterlyDouble17.getTtmAvg();
        double double21 = quarterlyDouble17.getTtm();
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
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 52.0d + "'", double18 == 52.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 52.0d + "'", double19 == 52.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test10658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10658");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble34 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray30);
        double[] doubleArray35 = quarterlyDouble34.dArr;
        double double36 = quarterlyDouble34.getQseqQ();
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
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 5100.0d + "'", double36 == 5100.0d);
    }

    @Test
    public void test10659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10659");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray16);
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
    }

    @Test
    public void test10660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10660");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double6 = quarterlyDouble4.get((int) (byte) 1);
        double double7 = quarterlyDouble4.getQseqQ();
        double double9 = quarterlyDouble4.get((int) (byte) 1);
        double double10 = quarterlyDouble4.getQseqQ();
        double double13 = quarterlyDouble4.deltaQ((int) ' ', (int) '#');
        double double15 = quarterlyDouble4.get((int) (short) 1);
        double[] doubleArray19 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray19);
        double double21 = quarterlyDouble20.getTtm();
        double double22 = quarterlyDouble20.getQseqQ();
        double[] doubleArray26 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble27 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray26);
        quarterlyDouble20.dArr = doubleArray26;
        double double29 = quarterlyDouble20.getQseqQ();
        double double30 = quarterlyDouble20.getTtmAvg();
        double double31 = quarterlyDouble20.getTtm();
        double[] doubleArray35 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble36 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray35);
        double double37 = quarterlyDouble36.getTtm();
        double double38 = quarterlyDouble36.getQseqQ();
        double[] doubleArray39 = quarterlyDouble36.dArr;
        quarterlyDouble20.dArr = doubleArray39;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble41 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray39);
        double double42 = quarterlyDouble41.getMostRecent();
        double double45 = quarterlyDouble41.deltaQ((int) (byte) 10, (int) (byte) 10);
        double[] doubleArray46 = quarterlyDouble41.dArr;
        quarterlyDouble4.dArr = doubleArray46;
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 5100.0d + "'", double7 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 5100.0d + "'", double10 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 52.0d + "'", double15 == 52.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 5100.0d + "'", double22 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 5100.0d + "'", double29 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 5100.0d + "'", double38 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 52.0d + "'", double42 == 52.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[10.0, 52.0, 1.0]");
    }

    @Test
    public void test10661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10661");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double6 = quarterlyDouble4.get((int) (byte) 1);
        double double7 = quarterlyDouble4.getQseqQ();
        double double8 = quarterlyDouble4.getQseqQ();
        double double9 = quarterlyDouble4.getTtm();
        double double10 = quarterlyDouble4.getTtmAvg();
        double double12 = quarterlyDouble4.get((int) (byte) 10);
        double[] doubleArray13 = quarterlyDouble4.dArr;
        double[] doubleArray14 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray14);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 5100.0d + "'", double7 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 5100.0d + "'", double8 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-9999.9999d) + "'", double12 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 52.0, 1.0]");
    }

    @Test
    public void test10662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10662");
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
        double double28 = quarterlyDouble4.get((int) '#');
        double[] doubleArray32 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble33 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray32);
        double double34 = quarterlyDouble33.getTtm();
        double double35 = quarterlyDouble33.getQseqQ();
        double[] doubleArray36 = quarterlyDouble33.dArr;
        double double37 = quarterlyDouble33.getQseqQ();
        double[] doubleArray41 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble42 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray41);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble43 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray41);
        quarterlyDouble33.dArr = doubleArray41;
        double[] doubleArray45 = quarterlyDouble33.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble46 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray45);
        quarterlyDouble4.dArr = doubleArray45;
        double[] doubleArray51 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble52 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray51);
        double double53 = quarterlyDouble52.getTtm();
        double double54 = quarterlyDouble52.getQseqQ();
        double[] doubleArray55 = quarterlyDouble52.dArr;
        double[] doubleArray59 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble60 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray59);
        quarterlyDouble52.dArr = doubleArray59;
        double double62 = quarterlyDouble52.getTtm();
        double[] doubleArray63 = quarterlyDouble52.dArr;
        double double64 = quarterlyDouble52.getQseqQ();
        double double66 = quarterlyDouble52.get((int) (short) 100);
        double[] doubleArray67 = quarterlyDouble52.dArr;
        quarterlyDouble4.dArr = doubleArray67;
        double double69 = quarterlyDouble4.getTtmAvg();
        double double72 = quarterlyDouble4.deltaQ(100, (int) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-9999.9999d) + "'", double28 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 5100.0d + "'", double35 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 5100.0d + "'", double37 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 5100.0d + "'", double54 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.0d + "'", double62 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 5100.0d + "'", double64 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + (-9999.9999d) + "'", double66 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 0.0d + "'", double69 == 0.0d);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 0.0d + "'", double72 == 0.0d);
    }

    @Test
    public void test10663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10663");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double double6 = quarterlyDouble4.getMostRecent();
        double double8 = quarterlyDouble4.get((int) 'a');
        double double10 = quarterlyDouble4.get((int) (byte) -1);
        double double11 = quarterlyDouble4.getMostRecent();
        double double12 = quarterlyDouble4.getQseqQ();
        java.lang.Class<?> wildcardClass13 = quarterlyDouble4.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-9999.9999d) + "'", double8 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 5100.0d + "'", double12 == 5100.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test10664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10664");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double double6 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.getMostRecent();
        double double8 = quarterlyDouble4.getTtmAvg();
        double double9 = quarterlyDouble4.getMostRecent();
        double double11 = quarterlyDouble4.get((int) '4');
        double double14 = quarterlyDouble4.deltaQ((int) (byte) 100, (int) (short) 10);
        double double15 = quarterlyDouble4.getQseqQ();
        double double16 = quarterlyDouble4.getQseqQ();
        double double19 = quarterlyDouble4.deltaQ((int) (byte) 10, (-1));
        double[] doubleArray23 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble24 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray23);
        double double25 = quarterlyDouble24.getTtmAvg();
        double double26 = quarterlyDouble24.getMostRecent();
        double double28 = quarterlyDouble24.get((int) 'a');
        double double30 = quarterlyDouble24.get((int) (byte) -1);
        double[] doubleArray34 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble35 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray34);
        double double36 = quarterlyDouble35.getTtm();
        double double37 = quarterlyDouble35.getQseqQ();
        double[] doubleArray38 = quarterlyDouble35.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble39 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray38);
        quarterlyDouble24.dArr = doubleArray38;
        double double41 = quarterlyDouble24.getMostRecent();
        double[] doubleArray45 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble46 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray45);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble47 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray45);
        double double49 = quarterlyDouble47.get(10);
        double double50 = quarterlyDouble47.getMostRecent();
        double[] doubleArray51 = quarterlyDouble47.dArr;
        quarterlyDouble24.dArr = doubleArray51;
        quarterlyDouble4.dArr = doubleArray51;
        double double55 = quarterlyDouble4.get((int) ' ');
        double[] doubleArray56 = quarterlyDouble4.dArr;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str58 = quarterlyDouble4.fmtGrowth4Q("");
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
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-9999.9999d) + "'", double11 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 5100.0d + "'", double15 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 5100.0d + "'", double16 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 52.0d + "'", double26 == 52.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-9999.9999d) + "'", double28 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-9999.9999d) + "'", double30 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 5100.0d + "'", double37 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 52.0d + "'", double41 == 52.0d);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + (-9999.9999d) + "'", double49 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 52.0d + "'", double50 == 52.0d);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + (-9999.9999d) + "'", double55 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[10.0, 52.0, 1.0]");
    }

    @Test
    public void test10665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10665");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double[] doubleArray6 = quarterlyDouble5.dArr;
        double double8 = quarterlyDouble5.get(1);
        double[] doubleArray12 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray12);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray12);
        double double15 = quarterlyDouble14.getTtmAvg();
        double double16 = quarterlyDouble14.getMostRecent();
        double double17 = quarterlyDouble14.getMostRecent();
        double[] doubleArray21 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble22 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray21);
        double double23 = quarterlyDouble22.getTtm();
        double double24 = quarterlyDouble22.getQseqQ();
        double[] doubleArray25 = quarterlyDouble22.dArr;
        double double26 = quarterlyDouble22.getQseqQ();
        double double27 = quarterlyDouble22.getQseqQ();
        double double28 = quarterlyDouble22.getQseqQ();
        double double29 = quarterlyDouble22.getMostRecent();
        double double32 = quarterlyDouble22.deltaQ((int) (byte) 100, (int) (byte) 10);
        double[] doubleArray33 = quarterlyDouble22.dArr;
        quarterlyDouble14.dArr = doubleArray33;
        double double37 = quarterlyDouble14.deltaQ(10, 0);
        double double38 = quarterlyDouble14.getQseqQ();
        double double39 = quarterlyDouble14.getTtm();
        double[] doubleArray43 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble44 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray43);
        double[] doubleArray45 = quarterlyDouble44.dArr;
        double double46 = quarterlyDouble44.getTtm();
        double double49 = quarterlyDouble44.deltaQ((int) '#', 100);
        double double50 = quarterlyDouble44.getMostRecent();
        double[] doubleArray51 = quarterlyDouble44.dArr;
        double double52 = quarterlyDouble44.getTtmAvg();
        double double53 = quarterlyDouble44.getQseqQ();
        double[] doubleArray54 = quarterlyDouble44.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble55 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray54);
        quarterlyDouble14.dArr = doubleArray54;
        double[] doubleArray60 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble61 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray60);
        double double62 = quarterlyDouble61.getTtm();
        double double63 = quarterlyDouble61.getQseqQ();
        double[] doubleArray64 = quarterlyDouble61.dArr;
        double double65 = quarterlyDouble61.getQseqQ();
        double[] doubleArray69 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble70 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray69);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble71 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray69);
        quarterlyDouble61.dArr = doubleArray69;
        double[] doubleArray76 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble77 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray76);
        double[] doubleArray78 = quarterlyDouble77.dArr;
        double[] doubleArray79 = quarterlyDouble77.dArr;
        quarterlyDouble61.dArr = doubleArray79;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble81 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray79);
        quarterlyDouble14.dArr = doubleArray79;
        quarterlyDouble5.dArr = doubleArray79;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str85 = quarterlyDouble5.fmtGrowth4Q("hi!");
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 52.0d + "'", double16 == 52.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 52.0d + "'", double17 == 52.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 5100.0d + "'", double24 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 5100.0d + "'", double26 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 5100.0d + "'", double27 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 5100.0d + "'", double28 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 52.0d + "'", double29 == 52.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 5100.0d + "'", double38 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 52.0d + "'", double50 == 52.0d);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 5100.0d + "'", double53 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.0d + "'", double62 == 0.0d);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 5100.0d + "'", double63 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 5100.0d + "'", double65 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray79), "[10.0, 52.0, 1.0]");
    }

    @Test
    public void test10666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10666");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double[] doubleArray5 = quarterlyDouble4.dArr;
        double[] doubleArray6 = quarterlyDouble4.dArr;
        double double8 = quarterlyDouble4.get((int) (byte) 10);
        double double9 = quarterlyDouble4.getQseqQ();
        double double10 = quarterlyDouble4.getTtm();
        double double12 = quarterlyDouble4.get(10);
        double double13 = quarterlyDouble4.getMostRecent();
        double[] doubleArray17 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray17);
        double double19 = quarterlyDouble18.getTtmAvg();
        double[] doubleArray23 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble24 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray23);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble25 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray23);
        double double27 = quarterlyDouble25.get(100);
        double[] doubleArray28 = quarterlyDouble25.dArr;
        quarterlyDouble18.dArr = doubleArray28;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble30 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray28);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble31 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray28);
        double double34 = quarterlyDouble31.deltaQ((int) (short) -1, 1);
        double double37 = quarterlyDouble31.deltaQ(0, 0);
        double[] doubleArray41 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble42 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray41);
        double double43 = quarterlyDouble42.getTtm();
        double double44 = quarterlyDouble42.getQseqQ();
        double[] doubleArray45 = quarterlyDouble42.dArr;
        double[] doubleArray49 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble50 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray49);
        quarterlyDouble42.dArr = doubleArray49;
        double double52 = quarterlyDouble42.getTtm();
        double[] doubleArray53 = quarterlyDouble42.dArr;
        double double54 = quarterlyDouble42.getTtm();
        double double56 = quarterlyDouble42.get(0);
        double double57 = quarterlyDouble42.getTtm();
        double double58 = quarterlyDouble42.getQseqQ();
        double[] doubleArray59 = quarterlyDouble42.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble60 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray59);
        double double62 = quarterlyDouble60.get(100);
        double[] doubleArray66 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble67 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray66);
        double double68 = quarterlyDouble67.getTtmAvg();
        double double69 = quarterlyDouble67.getTtm();
        double double70 = quarterlyDouble67.getMostRecent();
        double double71 = quarterlyDouble67.getTtmAvg();
        double double72 = quarterlyDouble67.getTtmAvg();
        double double74 = quarterlyDouble67.get((int) ' ');
        double[] doubleArray75 = quarterlyDouble67.dArr;
        double double76 = quarterlyDouble67.getTtmAvg();
        double[] doubleArray77 = quarterlyDouble67.dArr;
        quarterlyDouble60.dArr = doubleArray77;
        quarterlyDouble31.dArr = doubleArray77;
        quarterlyDouble4.dArr = doubleArray77;
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-9999.9999d) + "'", double8 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 5100.0d + "'", double9 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-9999.9999d) + "'", double12 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-9999.9999d) + "'", double27 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 5100.0d + "'", double44 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 10.0d + "'", double56 == 10.0d);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 5100.0d + "'", double58 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + (-9999.9999d) + "'", double62 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 0.0d + "'", double68 == 0.0d);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 0.0d + "'", double69 == 0.0d);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 52.0d + "'", double70 == 52.0d);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 0.0d + "'", double71 == 0.0d);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 0.0d + "'", double72 == 0.0d);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + (-9999.9999d) + "'", double74 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 0.0d + "'", double76 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[10.0, 52.0, 1.0]");
    }

    @Test
    public void test10667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10667");
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
        double double85 = quarterlyDouble4.get((int) ' ');
        double double86 = quarterlyDouble4.getTtm();
        double double87 = quarterlyDouble4.getTtm();
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
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + (-9999.9999d) + "'", double85 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 0.0d + "'", double86 == 0.0d);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 0.0d + "'", double87 == 0.0d);
    }

    @Test
    public void test10668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10668");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double7 = quarterlyDouble5.get(100);
        double[] doubleArray8 = quarterlyDouble5.dArr;
        double[] doubleArray12 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray12);
        double double16 = quarterlyDouble13.deltaQ((int) (short) 10, (int) (short) 100);
        double[] doubleArray17 = quarterlyDouble13.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray17);
        quarterlyDouble5.dArr = doubleArray17;
        double double20 = quarterlyDouble5.getTtm();
        double double23 = quarterlyDouble5.deltaQ((int) (byte) 1, (int) (short) 0);
        double double24 = quarterlyDouble5.getMostRecent();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9999.9999d) + "'", double7 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 52.0d + "'", double24 == 52.0d);
    }

    @Test
    public void test10669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10669");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList2, (int) (short) 0, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList7 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList((java.util.List<java.lang.String>) strList2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList8 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList((java.util.List<java.lang.String>) strList2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList11 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList2, 0, (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList14 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList2, (int) (short) 10, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList17 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList2, (int) (byte) 10, (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList20 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList2, (int) (short) 1, (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList23 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList2, (int) (byte) 1, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList26 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList2, (int) (byte) 1, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList29 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList2, (int) (short) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList32 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList2, (int) (short) 100, 0);
        java.lang.Class<?> wildcardClass33 = strList2.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(companyDataList6);
        org.junit.Assert.assertNotNull(manyCompanyDataList7);
        org.junit.Assert.assertNotNull(manyCompanyDataList8);
        org.junit.Assert.assertNotNull(companyDataList11);
        org.junit.Assert.assertNotNull(companyDataList14);
        org.junit.Assert.assertNotNull(companyDataList17);
        org.junit.Assert.assertNotNull(companyDataList20);
        org.junit.Assert.assertNotNull(companyDataList23);
        org.junit.Assert.assertNotNull(companyDataList26);
        org.junit.Assert.assertNotNull(companyDataList29);
        org.junit.Assert.assertNotNull(companyDataList32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test10670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10670");
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
        double double36 = quarterlyDouble4.getQseqQ();
        double double38 = quarterlyDouble4.get(10);
        double double39 = quarterlyDouble4.getQseqQ();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str41 = quarterlyDouble4.fmtGrowth1Q("\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
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
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 5100.0d + "'", double36 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + (-9999.9999d) + "'", double38 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 5100.0d + "'", double39 == 5100.0d);
    }

    @Test
    public void test10671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10671");
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
        double double20 = quarterlyDouble18.getTtmAvg();
        double double23 = quarterlyDouble18.deltaQ(10, (int) ' ');
        double double26 = quarterlyDouble18.deltaQ((int) 'a', 10);
        double[] doubleArray30 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble31 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray30);
        double double32 = quarterlyDouble31.getTtm();
        double double33 = quarterlyDouble31.getQseqQ();
        double[] doubleArray34 = quarterlyDouble31.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble35 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray34);
        double double36 = quarterlyDouble35.getQseqQ();
        double double37 = quarterlyDouble35.getTtm();
        double[] doubleArray38 = quarterlyDouble35.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble39 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray38);
        double[] doubleArray43 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble44 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray43);
        double double45 = quarterlyDouble44.getTtm();
        double double46 = quarterlyDouble44.getQseqQ();
        double[] doubleArray47 = quarterlyDouble44.dArr;
        double double48 = quarterlyDouble44.getQseqQ();
        double double49 = quarterlyDouble44.getQseqQ();
        double double50 = quarterlyDouble44.getQseqQ();
        double[] doubleArray51 = quarterlyDouble44.dArr;
        double double53 = quarterlyDouble44.get((int) (short) 0);
        double double54 = quarterlyDouble44.getQseqQ();
        double[] doubleArray58 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble59 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray58);
        double double60 = quarterlyDouble59.getTtm();
        double double61 = quarterlyDouble59.getQseqQ();
        double[] doubleArray62 = quarterlyDouble59.dArr;
        double[] doubleArray66 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble67 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray66);
        quarterlyDouble59.dArr = doubleArray66;
        double double69 = quarterlyDouble59.getTtm();
        double[] doubleArray70 = quarterlyDouble59.dArr;
        double[] doubleArray74 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble75 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray74);
        double double76 = quarterlyDouble75.getTtm();
        double double78 = quarterlyDouble75.get((int) '4');
        double[] doubleArray82 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble83 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray82);
        double[] doubleArray84 = quarterlyDouble83.dArr;
        double double85 = quarterlyDouble83.getQseqQ();
        double[] doubleArray86 = new double[] {};
        quarterlyDouble83.dArr = doubleArray86;
        quarterlyDouble75.dArr = doubleArray86;
        double[] doubleArray89 = quarterlyDouble75.dArr;
        quarterlyDouble59.dArr = doubleArray89;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble91 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray89);
        quarterlyDouble44.dArr = doubleArray89;
        quarterlyDouble39.dArr = doubleArray89;
        double[] doubleArray94 = quarterlyDouble39.dArr;
        quarterlyDouble18.dArr = doubleArray94;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble96 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray94);
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
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 5100.0d + "'", double33 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 5100.0d + "'", double36 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 5100.0d + "'", double46 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 5100.0d + "'", double48 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 5100.0d + "'", double49 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 5100.0d + "'", double50 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 10.0d + "'", double53 == 10.0d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 5100.0d + "'", double54 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 5100.0d + "'", double61 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 0.0d + "'", double69 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 0.0d + "'", double76 == 0.0d);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + (-9999.9999d) + "'", double78 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray82), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray84), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 5100.0d + "'", double85 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray86), "[]");
        org.junit.Assert.assertNotNull(doubleArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray89), "[]");
        org.junit.Assert.assertNotNull(doubleArray94);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray94), "[]");
    }

    @Test
    public void test10672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10672");
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
        double double23 = quarterlyDouble22.getTtm();
        double double24 = quarterlyDouble22.getTtmAvg();
        double double27 = quarterlyDouble22.deltaQ((int) (short) 100, 0);
        double double29 = quarterlyDouble22.get((int) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-9999.9999d) + "'", double29 == (-9999.9999d));
    }

    @Test
    public void test10673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10673");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double[] doubleArray5 = quarterlyDouble4.dArr;
        double[] doubleArray6 = quarterlyDouble4.dArr;
        double double8 = quarterlyDouble4.get((int) (byte) 10);
        double[] doubleArray9 = quarterlyDouble4.dArr;
        double double11 = quarterlyDouble4.get((int) (byte) 100);
        double double12 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray13 = quarterlyDouble4.dArr;
        double[] doubleArray17 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray17);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray17);
        double double20 = quarterlyDouble19.getTtmAvg();
        double double21 = quarterlyDouble19.getTtmAvg();
        double double22 = quarterlyDouble19.getTtmAvg();
        double[] doubleArray23 = quarterlyDouble19.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble24 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray23);
        double double27 = quarterlyDouble24.deltaQ(100, (int) (byte) 0);
        double[] doubleArray28 = quarterlyDouble24.dArr;
        double[] doubleArray32 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble33 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray32);
        double double34 = quarterlyDouble33.getTtm();
        double double35 = quarterlyDouble33.getQseqQ();
        double[] doubleArray36 = quarterlyDouble33.dArr;
        double[] doubleArray40 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble41 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray40);
        quarterlyDouble33.dArr = doubleArray40;
        double double43 = quarterlyDouble33.getTtm();
        double[] doubleArray44 = quarterlyDouble33.dArr;
        double double45 = quarterlyDouble33.getQseqQ();
        double double46 = quarterlyDouble33.getTtm();
        double[] doubleArray47 = quarterlyDouble33.dArr;
        double double49 = quarterlyDouble33.get(0);
        double double50 = quarterlyDouble33.getTtm();
        double[] doubleArray51 = quarterlyDouble33.dArr;
        quarterlyDouble24.dArr = doubleArray51;
        quarterlyDouble4.dArr = doubleArray51;
        double double54 = quarterlyDouble4.getTtm();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-9999.9999d) + "'", double8 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-9999.9999d) + "'", double11 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 5100.0d + "'", double35 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 5100.0d + "'", double45 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 10.0d + "'", double49 == 10.0d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
    }

    @Test
    public void test10674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10674");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList2, (int) (short) 0, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList7 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList((java.util.List<java.lang.String>) strList2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList8 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList((java.util.List<java.lang.String>) strList2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList11 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList2, 0, (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList14 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList2, (int) (short) 10, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList17 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList2, (-1), (int) (short) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList20 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList2, (int) (short) 100, 1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(companyDataList6);
        org.junit.Assert.assertNotNull(manyCompanyDataList7);
        org.junit.Assert.assertNotNull(manyCompanyDataList8);
        org.junit.Assert.assertNotNull(companyDataList11);
        org.junit.Assert.assertNotNull(companyDataList14);
        org.junit.Assert.assertNotNull(companyDataList17);
        org.junit.Assert.assertNotNull(companyDataList20);
    }

    @Test
    public void test10675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10675");
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
        double double20 = quarterlyDouble4.getQseqQ();
        double double22 = quarterlyDouble4.get((int) '4');
        double double23 = quarterlyDouble4.getTtm();
        double double24 = quarterlyDouble4.getTtm();
        double double26 = quarterlyDouble4.get(10);
        double[] doubleArray30 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble31 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray30);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble32 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray30);
        double[] doubleArray33 = quarterlyDouble32.dArr;
        double[] doubleArray37 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble38 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray37);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble39 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray37);
        double double41 = quarterlyDouble39.get(100);
        double[] doubleArray42 = quarterlyDouble39.dArr;
        quarterlyDouble32.dArr = doubleArray42;
        double double44 = quarterlyDouble32.getTtmAvg();
        double double45 = quarterlyDouble32.getQseqQ();
        double[] doubleArray46 = quarterlyDouble32.dArr;
        double[] doubleArray50 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble51 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray50);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble52 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray50);
        double[] doubleArray53 = quarterlyDouble52.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble54 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray53);
        double double55 = quarterlyDouble54.getMostRecent();
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
        double[] doubleArray72 = quarterlyDouble60.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble73 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray72);
        quarterlyDouble54.dArr = doubleArray72;
        double double77 = quarterlyDouble54.deltaQ((int) 'a', (int) (short) 100);
        double double78 = quarterlyDouble54.getQseqQ();
        double[] doubleArray79 = quarterlyDouble54.dArr;
        double double82 = quarterlyDouble54.deltaQ((int) (byte) 10, 0);
        double double83 = quarterlyDouble54.getTtmAvg();
        double[] doubleArray84 = quarterlyDouble54.dArr;
        quarterlyDouble32.dArr = doubleArray84;
        quarterlyDouble4.dArr = doubleArray84;
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
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-9999.9999d) + "'", double22 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-9999.9999d) + "'", double26 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + (-9999.9999d) + "'", double41 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 5100.0d + "'", double45 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 52.0d + "'", double55 == 52.0d);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.0d + "'", double61 == 0.0d);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 5100.0d + "'", double62 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 5100.0d + "'", double64 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 0.0d + "'", double77 == 0.0d);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 5100.0d + "'", double78 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray79), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 0.0d + "'", double82 == 0.0d);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 0.0d + "'", double83 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray84), "[10.0, 52.0, 1.0]");
    }

    @Test
    public void test10676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10676");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList2, (int) (short) 0, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList7 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList((java.util.List<java.lang.String>) strList2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList8 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList((java.util.List<java.lang.String>) strList2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList11 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList2, 1, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList12 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList((java.util.List<java.lang.String>) strList2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList15 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList2, 0, (int) (byte) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList16 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList((java.util.List<java.lang.String>) strList2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList17 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList((java.util.List<java.lang.String>) strList2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList20 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList2, 10, (int) (byte) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList21 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList((java.util.List<java.lang.String>) strList2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList24 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList2, (int) (byte) 10, (int) (short) 10);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(companyDataList6);
        org.junit.Assert.assertNotNull(manyCompanyDataList7);
        org.junit.Assert.assertNotNull(manyCompanyDataList8);
        org.junit.Assert.assertNotNull(companyDataList11);
        org.junit.Assert.assertNotNull(manyCompanyDataList12);
        org.junit.Assert.assertNotNull(companyDataList15);
        org.junit.Assert.assertNotNull(manyCompanyDataList16);
        org.junit.Assert.assertNotNull(manyCompanyDataList17);
        org.junit.Assert.assertNotNull(companyDataList20);
        org.junit.Assert.assertNotNull(manyCompanyDataList21);
        org.junit.Assert.assertNotNull(companyDataList24);
    }

    @Test
    public void test10677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10677");
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
        double double16 = quarterlyDouble4.getTtm();
        double double17 = quarterlyDouble4.getTtmAvg();
        double double18 = quarterlyDouble4.getMostRecent();
        double double19 = quarterlyDouble4.getTtmAvg();
        double double20 = quarterlyDouble4.getTtmAvg();
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
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 52.0d + "'", double18 == 52.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test10678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10678");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double6 = quarterlyDouble4.get((int) (byte) 1);
        double double7 = quarterlyDouble4.getQseqQ();
        double[] doubleArray8 = quarterlyDouble4.dArr;
        double double11 = quarterlyDouble4.deltaQ((int) (byte) 100, (int) (byte) 100);
        double double14 = quarterlyDouble4.deltaQ((int) '4', (int) (short) 1);
        double[] doubleArray18 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray18);
        double double21 = quarterlyDouble19.get((int) (byte) 1);
        double double22 = quarterlyDouble19.getQseqQ();
        double double23 = quarterlyDouble19.getQseqQ();
        double double24 = quarterlyDouble19.getTtmAvg();
        double double25 = quarterlyDouble19.getTtm();
        double[] doubleArray26 = quarterlyDouble19.dArr;
        double double28 = quarterlyDouble19.get(10);
        double double29 = quarterlyDouble19.getQseqQ();
        double[] doubleArray30 = quarterlyDouble19.dArr;
        quarterlyDouble4.dArr = doubleArray30;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble32 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray30);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble33 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray30);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 5100.0d + "'", double7 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 52.0d + "'", double21 == 52.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 5100.0d + "'", double22 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 5100.0d + "'", double23 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-9999.9999d) + "'", double28 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 5100.0d + "'", double29 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[10.0, 52.0, 1.0]");
    }

    @Test
    public void test10679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10679");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray7 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray7);
        double double9 = quarterlyDouble8.getQseqQ();
        double double10 = quarterlyDouble8.getTtm();
        double double12 = quarterlyDouble8.get((int) (short) 0);
        double double13 = quarterlyDouble8.getQseqQ();
        double double14 = quarterlyDouble8.getMostRecent();
        double double15 = quarterlyDouble8.getQseqQ();
        double double17 = quarterlyDouble8.get(0);
        double[] doubleArray21 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble22 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray21);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble23 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray21);
        double[] doubleArray27 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble28 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray27);
        double double29 = quarterlyDouble28.getTtm();
        double double31 = quarterlyDouble28.get((int) '4');
        double double34 = quarterlyDouble28.deltaQ((int) (short) 1, 0);
        double[] doubleArray38 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble39 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray38);
        double double40 = quarterlyDouble39.getTtm();
        double double41 = quarterlyDouble39.getQseqQ();
        double[] doubleArray42 = quarterlyDouble39.dArr;
        quarterlyDouble28.dArr = doubleArray42;
        quarterlyDouble23.dArr = doubleArray42;
        quarterlyDouble8.dArr = doubleArray42;
        double double46 = quarterlyDouble8.getMostRecent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str48 = quarterlyDouble8.fmtGrowth1Q("");
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5100.0d + "'", double13 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 5100.0d + "'", double15 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-9999.9999d) + "'", double31 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 5100.0d + "'", double41 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 52.0d + "'", double46 == 52.0d);
    }

    @Test
    public void test10680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10680");
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
        double double46 = quarterlyDouble4.getMostRecent();
        double double48 = quarterlyDouble4.get((int) (byte) 1);
        double double49 = quarterlyDouble4.getMostRecent();
        double[] doubleArray50 = quarterlyDouble4.dArr;
        double double51 = quarterlyDouble4.getTtm();
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
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 52.0d + "'", double46 == 52.0d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 52.0d + "'", double48 == 52.0d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 52.0d + "'", double49 == 52.0d);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
    }

    @Test
    public void test10681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10681");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble41 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray38);
        double double42 = quarterlyDouble41.getTtmAvg();
        // The following exception was thrown during execution in test generation
        try {
            double double43 = quarterlyDouble41.getQoQ();
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
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
    }

    @Test
    public void test10682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10682");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray9 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray9);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray9);
        double double13 = quarterlyDouble11.get(100);
        double[] doubleArray14 = quarterlyDouble11.dArr;
        quarterlyDouble4.dArr = doubleArray14;
        double[] doubleArray19 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray19);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble21 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray19);
        double[] doubleArray22 = quarterlyDouble21.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble23 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray22);
        double double24 = quarterlyDouble23.getMostRecent();
        double[] doubleArray28 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble29 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray28);
        double double30 = quarterlyDouble29.getTtm();
        double double31 = quarterlyDouble29.getQseqQ();
        double[] doubleArray32 = quarterlyDouble29.dArr;
        double double33 = quarterlyDouble29.getQseqQ();
        double[] doubleArray37 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble38 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray37);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble39 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray37);
        quarterlyDouble29.dArr = doubleArray37;
        double[] doubleArray41 = quarterlyDouble29.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble42 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray41);
        quarterlyDouble23.dArr = doubleArray41;
        double[] doubleArray44 = quarterlyDouble23.dArr;
        quarterlyDouble4.dArr = doubleArray44;
        double double46 = quarterlyDouble4.getQseqQ();
        double double47 = quarterlyDouble4.getQseqQ();
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
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 52.0d + "'", double24 == 52.0d);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 5100.0d + "'", double31 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 5100.0d + "'", double33 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 5100.0d + "'", double46 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 5100.0d + "'", double47 == 5100.0d);
    }

    @Test
    public void test10683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10683");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double7 = quarterlyDouble5.get(100);
        double[] doubleArray8 = quarterlyDouble5.dArr;
        double double11 = quarterlyDouble5.deltaQ((int) (short) 1, (-1));
        double double14 = quarterlyDouble5.deltaQ((int) 'a', 1);
        double double15 = quarterlyDouble5.getTtm();
        double double18 = quarterlyDouble5.deltaQ((int) (short) 0, (int) (byte) -1);
        double[] doubleArray22 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble23 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray22);
        double double24 = quarterlyDouble23.getTtmAvg();
        double double25 = quarterlyDouble23.getTtm();
        double double26 = quarterlyDouble23.getTtmAvg();
        double double28 = quarterlyDouble23.get((int) (byte) 100);
        double[] doubleArray29 = quarterlyDouble23.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble30 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray29);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble31 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray29);
        double double32 = quarterlyDouble31.getTtm();
        double[] doubleArray33 = quarterlyDouble31.dArr;
        double[] doubleArray37 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble38 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray37);
        double[] doubleArray39 = quarterlyDouble38.dArr;
        double[] doubleArray40 = quarterlyDouble38.dArr;
        double[] doubleArray44 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble45 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray44);
        double double46 = quarterlyDouble45.getTtm();
        double double47 = quarterlyDouble45.getQseqQ();
        double[] doubleArray48 = quarterlyDouble45.dArr;
        double double49 = quarterlyDouble45.getQseqQ();
        double[] doubleArray53 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble54 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray53);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble55 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray53);
        quarterlyDouble45.dArr = doubleArray53;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble57 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray53);
        quarterlyDouble38.dArr = doubleArray53;
        quarterlyDouble31.dArr = doubleArray53;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble60 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray53);
        quarterlyDouble5.dArr = doubleArray53;
        double double62 = quarterlyDouble5.getQseqQ();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9999.9999d) + "'", double7 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-9999.9999d) + "'", double28 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 5100.0d + "'", double47 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 5100.0d + "'", double49 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 5100.0d + "'", double62 == 5100.0d);
    }

    @Test
    public void test10684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10684");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double double7 = quarterlyDouble4.getTtmAvg();
        double double8 = quarterlyDouble4.getTtmAvg();
        double double9 = quarterlyDouble4.getTtmAvg();
        double double10 = quarterlyDouble4.getMostRecent();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
    }

    @Test
    public void test10685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10685");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double double6 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.getTtmAvg();
        double double8 = quarterlyDouble4.getQseqQ();
        double double9 = quarterlyDouble4.getTtmAvg();
        double double10 = quarterlyDouble4.getQseqQ();
        double double11 = quarterlyDouble4.getQseqQ();
        double double12 = quarterlyDouble4.getMostRecent();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 5100.0d + "'", double8 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 5100.0d + "'", double10 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 5100.0d + "'", double11 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
    }

    @Test
    public void test10686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10686");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double6 = quarterlyDouble4.get((int) (byte) 1);
        double double7 = quarterlyDouble4.getQseqQ();
        double double8 = quarterlyDouble4.getQseqQ();
        double double9 = quarterlyDouble4.getQseqQ();
        double double10 = quarterlyDouble4.getTtm();
        double[] doubleArray14 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray14);
        double double17 = quarterlyDouble15.get((int) (byte) 1);
        double double18 = quarterlyDouble15.getQseqQ();
        double[] doubleArray19 = quarterlyDouble15.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray19);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble21 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray19);
        quarterlyDouble4.dArr = doubleArray19;
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 5100.0d + "'", double7 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 5100.0d + "'", double8 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 5100.0d + "'", double9 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 52.0d + "'", double17 == 52.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 5100.0d + "'", double18 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 52.0, 1.0]");
    }

    @Test
    public void test10687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10687");
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
        double double28 = quarterlyDouble4.get((int) '#');
        double[] doubleArray29 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble30 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray29);
        double double31 = quarterlyDouble30.getMostRecent();
        double double32 = quarterlyDouble30.getTtm();
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
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-9999.9999d) + "'", double28 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 52.0d + "'", double31 == 52.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
    }

    @Test
    public void test10688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10688");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList2, (int) (short) 0, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList9 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList2, (int) (short) 100, (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList12 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList2, (-1), (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList13 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList((java.util.List<java.lang.String>) strList2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList16 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList2, (int) (byte) 10, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList19 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList2, (int) 'a', (int) '#');
        java.lang.Class<?> wildcardClass20 = strList2.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(companyDataList6);
        org.junit.Assert.assertNotNull(companyDataList9);
        org.junit.Assert.assertNotNull(companyDataList12);
        org.junit.Assert.assertNotNull(manyCompanyDataList13);
        org.junit.Assert.assertNotNull(companyDataList16);
        org.junit.Assert.assertNotNull(companyDataList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test10689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10689");
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
        double double36 = quarterlyDouble35.getMostRecent();
        double[] doubleArray37 = quarterlyDouble35.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble38 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray37);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble39 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray37);
        double[] doubleArray43 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble44 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray43);
        double double45 = quarterlyDouble44.getTtm();
        double double47 = quarterlyDouble44.get((int) '4');
        double[] doubleArray51 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble52 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray51);
        double[] doubleArray53 = quarterlyDouble52.dArr;
        double double54 = quarterlyDouble52.getQseqQ();
        double[] doubleArray55 = new double[] {};
        quarterlyDouble52.dArr = doubleArray55;
        quarterlyDouble44.dArr = doubleArray55;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble58 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray55);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble59 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray55);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble60 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray55);
        double[] doubleArray61 = quarterlyDouble60.dArr;
        quarterlyDouble39.dArr = doubleArray61;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble63 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray61);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble64 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray61);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble65 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray61);
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
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 52.0d + "'", double36 == 52.0d);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + (-9999.9999d) + "'", double47 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 5100.0d + "'", double54 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[]");
    }

    @Test
    public void test10690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10690");
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
        double double71 = quarterlyDouble1.getTtm();
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
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 0.0d + "'", double71 == 0.0d);
    }

    @Test
    public void test10691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10691");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList5 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList((java.util.List<java.lang.String>) strList3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList8 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList3, (int) '#', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList9 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList((java.util.List<java.lang.String>) strList3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList10 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList((java.util.List<java.lang.String>) strList3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList13 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList3, 0, (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList16 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList3, 0, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList19 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList3, (-1), (int) (short) -1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(manyCompanyDataList5);
        org.junit.Assert.assertNotNull(companyDataList8);
        org.junit.Assert.assertNotNull(manyCompanyDataList9);
        org.junit.Assert.assertNotNull(manyCompanyDataList10);
        org.junit.Assert.assertNotNull(companyDataList13);
        org.junit.Assert.assertNotNull(companyDataList16);
        org.junit.Assert.assertNotNull(companyDataList19);
    }

    @Test
    public void test10692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10692");
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
        double double19 = quarterlyDouble17.get(1);
        double double21 = quarterlyDouble17.get(100);
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
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 52.0d + "'", double19 == 52.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-9999.9999d) + "'", double21 == (-9999.9999d));
    }

    @Test
    public void test10693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10693");
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
        double[] doubleArray18 = quarterlyDouble4.dArr;
        double double20 = quarterlyDouble4.get(0);
        double double21 = quarterlyDouble4.getTtm();
        double[] doubleArray22 = quarterlyDouble4.dArr;
        double double23 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray24 = quarterlyDouble4.dArr;
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
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[10.0, 52.0, 1.0]");
    }

    @Test
    public void test10694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10694");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray15);
        double[] doubleArray21 = quarterlyDouble20.dArr;
        double[] doubleArray25 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble26 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray25);
        double double27 = quarterlyDouble26.getTtm();
        double double28 = quarterlyDouble26.getQseqQ();
        double[] doubleArray32 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble33 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray32);
        quarterlyDouble26.dArr = doubleArray32;
        double double35 = quarterlyDouble26.getQseqQ();
        double double38 = quarterlyDouble26.deltaQ((int) (short) 100, (int) (byte) -1);
        double double41 = quarterlyDouble26.deltaQ((int) (byte) 100, 0);
        double[] doubleArray42 = quarterlyDouble26.dArr;
        double double43 = quarterlyDouble26.getQseqQ();
        double double45 = quarterlyDouble26.get((int) '#');
        double double46 = quarterlyDouble26.getQseqQ();
        double[] doubleArray47 = quarterlyDouble26.dArr;
        quarterlyDouble20.dArr = doubleArray47;
        double double49 = quarterlyDouble20.getQseqQ();
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
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 5100.0d + "'", double28 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 5100.0d + "'", double35 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 5100.0d + "'", double43 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + (-9999.9999d) + "'", double45 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 5100.0d + "'", double46 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 5100.0d + "'", double49 == 5100.0d);
    }

    @Test
    public void test10695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10695");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double double6 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.getMostRecent();
        double double8 = quarterlyDouble4.getTtmAvg();
        double double9 = quarterlyDouble4.getTtmAvg();
        double double10 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray11 = quarterlyDouble4.dArr;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = quarterlyDouble4.fmtGrowth1Q("\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
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
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 52.0, 1.0]");
    }

    @Test
    public void test10696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10696");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double[] doubleArray6 = quarterlyDouble5.dArr;
        double double8 = quarterlyDouble5.get(1);
        double double10 = quarterlyDouble5.get((int) 'a');
        double double11 = quarterlyDouble5.getTtm();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test10697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10697");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
        java.lang.String str5 = companyData1.getTicker();
        java.lang.String str6 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = companyData1.getFdList();
        java.lang.String str10 = companyData1.getTicker();
        java.lang.String str11 = companyData1.getTicker();
        java.lang.String str12 = companyData1.getTicker();
        java.lang.String str13 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = companyData1.getFdList();
        java.lang.String str15 = companyData1.getTicker();
        java.lang.String str16 = companyData1.getTicker();
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNotNull(fieldDataList3);
        org.junit.Assert.assertNotNull(fieldDataList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(fieldDataList7);
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(fieldDataList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test10698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10698");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double6 = quarterlyDouble4.get((int) (byte) 1);
        double double7 = quarterlyDouble4.getQseqQ();
        double[] doubleArray8 = quarterlyDouble4.dArr;
        double double11 = quarterlyDouble4.deltaQ((int) (byte) 100, (int) (byte) 100);
        double double13 = quarterlyDouble4.get((int) (short) 1);
        double double14 = quarterlyDouble4.getTtmAvg();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = quarterlyDouble4.fmtGrowth1Q("\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 5100.0d + "'", double7 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test10699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10699");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double double6 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.getMostRecent();
        double double8 = quarterlyDouble4.getTtmAvg();
        double double9 = quarterlyDouble4.getMostRecent();
        double double11 = quarterlyDouble4.get((int) '4');
        double double12 = quarterlyDouble4.getMostRecent();
        double double13 = quarterlyDouble4.getTtm();
        double double14 = quarterlyDouble4.getQseqQ();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = quarterlyDouble4.fmtGrowth1Q("hi!");
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
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-9999.9999d) + "'", double11 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 5100.0d + "'", double14 == 5100.0d);
    }

    @Test
    public void test10700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10700");
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
        double double17 = quarterlyDouble4.getTtm();
        double double19 = quarterlyDouble4.get((int) '#');
        double double20 = quarterlyDouble4.getTtm();
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-9999.9999d) + "'", double19 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test10701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10701");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double double6 = quarterlyDouble4.getMostRecent();
        double double7 = quarterlyDouble4.getTtm();
        double double8 = quarterlyDouble4.getMostRecent();
        double double9 = quarterlyDouble4.getTtm();
        double double12 = quarterlyDouble4.deltaQ((int) (byte) 0, 0);
        double[] doubleArray13 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray13);
        double double15 = quarterlyDouble14.getMostRecent();
        double double18 = quarterlyDouble14.deltaQ((int) (byte) 100, 0);
        double double21 = quarterlyDouble14.deltaQ((int) (byte) 100, (int) (byte) -1);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 52.0d + "'", double15 == 52.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test10702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10702");
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
        double double20 = quarterlyDouble4.getMostRecent();
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
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 52.0d + "'", double20 == 52.0d);
    }

    @Test
    public void test10703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10703");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
        java.lang.String str4 = companyData1.getTicker();
        java.lang.String str5 = companyData1.getTicker();
        java.lang.String str6 = companyData1.getTicker();
        java.lang.String str7 = companyData1.getTicker();
        java.lang.String str8 = companyData1.getTicker();
        java.lang.String str9 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = companyData1.getFdList();
        java.lang.String str11 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = companyData1.getFdList();
        java.lang.String str13 = companyData1.getTicker();
        java.lang.String str14 = companyData1.getTicker();
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNotNull(fieldDataList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(fieldDataList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test10704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10704");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double double6 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.getTtmAvg();
        double double9 = quarterlyDouble4.get((int) ' ');
        double double10 = quarterlyDouble4.getMostRecent();
        double double12 = quarterlyDouble4.get(10);
        double double15 = quarterlyDouble4.deltaQ(10, (int) (short) -1);
        double[] doubleArray19 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray19);
        double double21 = quarterlyDouble20.getTtmAvg();
        double double22 = quarterlyDouble20.getTtm();
        double double23 = quarterlyDouble20.getTtmAvg();
        double double24 = quarterlyDouble20.getMostRecent();
        double double26 = quarterlyDouble20.get((int) '4');
        double[] doubleArray30 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble31 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray30);
        quarterlyDouble20.dArr = doubleArray30;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble33 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray30);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble34 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray30);
        quarterlyDouble4.dArr = doubleArray30;
        double[] doubleArray39 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble40 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray39);
        double double41 = quarterlyDouble40.getTtm();
        double double42 = quarterlyDouble40.getQseqQ();
        double[] doubleArray43 = quarterlyDouble40.dArr;
        double[] doubleArray47 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble48 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray47);
        quarterlyDouble40.dArr = doubleArray47;
        double double50 = quarterlyDouble40.getTtm();
        double[] doubleArray51 = quarterlyDouble40.dArr;
        double double52 = quarterlyDouble40.getQseqQ();
        double double53 = quarterlyDouble40.getTtm();
        double[] doubleArray54 = quarterlyDouble40.dArr;
        double double56 = quarterlyDouble40.get((int) '#');
        double[] doubleArray57 = quarterlyDouble40.dArr;
        quarterlyDouble4.dArr = doubleArray57;
        double double60 = quarterlyDouble4.get(1);
        double double62 = quarterlyDouble4.get((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            double double63 = quarterlyDouble4.getQoQ();
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
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 52.0d + "'", double24 == 52.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-9999.9999d) + "'", double26 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 5100.0d + "'", double42 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 5100.0d + "'", double52 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + (-9999.9999d) + "'", double56 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 52.0d + "'", double60 == 52.0d);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + (-9999.9999d) + "'", double62 == (-9999.9999d));
    }

    @Test
    public void test10705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10705");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double[] doubleArray6 = quarterlyDouble5.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray6);
        double double8 = quarterlyDouble7.getMostRecent();
        double double9 = quarterlyDouble7.getQseqQ();
        double[] doubleArray10 = quarterlyDouble7.dArr;
        double double11 = quarterlyDouble7.getQseqQ();
        double double12 = quarterlyDouble7.getMostRecent();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = quarterlyDouble7.getQoQ();
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
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 5100.0d + "'", double11 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
    }

    @Test
    public void test10706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10706");
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
        double double23 = quarterlyDouble17.deltaQ(0, 0);
        double double25 = quarterlyDouble17.get((int) (short) 0);
        double[] doubleArray26 = quarterlyDouble17.dArr;
        double double27 = quarterlyDouble17.getTtm();
        double double28 = quarterlyDouble17.getTtmAvg();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-9999.9999d) + "'", double13 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
    }

    @Test
    public void test10707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10707");
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
        double double23 = quarterlyDouble17.deltaQ(0, 0);
        double double25 = quarterlyDouble17.get((int) (short) 0);
        double[] doubleArray26 = quarterlyDouble17.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble27 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray26);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-9999.9999d) + "'", double13 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0, 52.0, 1.0]");
    }

    @Test
    public void test10708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10708");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double7 = quarterlyDouble5.get(100);
        double double8 = quarterlyDouble5.getTtmAvg();
        double double9 = quarterlyDouble5.getMostRecent();
        double[] doubleArray13 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray13);
        double double15 = quarterlyDouble14.getTtm();
        double double16 = quarterlyDouble14.getQseqQ();
        double[] doubleArray17 = quarterlyDouble14.dArr;
        double double18 = quarterlyDouble14.getQseqQ();
        double double19 = quarterlyDouble14.getTtmAvg();
        double double21 = quarterlyDouble14.get(0);
        double[] doubleArray25 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble26 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray25);
        double double27 = quarterlyDouble26.getTtm();
        double double28 = quarterlyDouble26.getQseqQ();
        double[] doubleArray29 = quarterlyDouble26.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble30 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray29);
        quarterlyDouble14.dArr = doubleArray29;
        quarterlyDouble5.dArr = doubleArray29;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble33 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray29);
        double double36 = quarterlyDouble33.deltaQ(100, (int) (short) 0);
        double double37 = quarterlyDouble33.getTtmAvg();
        double[] doubleArray41 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble42 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray41);
        double double43 = quarterlyDouble42.getTtm();
        double double44 = quarterlyDouble42.getQseqQ();
        double[] doubleArray45 = quarterlyDouble42.dArr;
        double double46 = quarterlyDouble42.getQseqQ();
        double double47 = quarterlyDouble42.getQseqQ();
        double double48 = quarterlyDouble42.getQseqQ();
        double[] doubleArray49 = quarterlyDouble42.dArr;
        double double51 = quarterlyDouble42.get((int) (short) 0);
        double[] doubleArray55 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble56 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray55);
        double double58 = quarterlyDouble56.get((int) (byte) 1);
        double double59 = quarterlyDouble56.getQseqQ();
        double[] doubleArray60 = quarterlyDouble56.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble61 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray60);
        quarterlyDouble42.dArr = doubleArray60;
        quarterlyDouble33.dArr = doubleArray60;
        double double64 = quarterlyDouble33.getTtm();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9999.9999d) + "'", double7 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 5100.0d + "'", double16 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 5100.0d + "'", double18 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 5100.0d + "'", double28 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 5100.0d + "'", double44 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 5100.0d + "'", double46 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 5100.0d + "'", double47 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 5100.0d + "'", double48 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 10.0d + "'", double51 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 52.0d + "'", double58 == 52.0d);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 5100.0d + "'", double59 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.0d + "'", double64 == 0.0d);
    }

    @Test
    public void test10709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10709");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double7 = quarterlyDouble5.get(10);
        double double8 = quarterlyDouble5.getMostRecent();
        double double9 = quarterlyDouble5.getMostRecent();
        double double10 = quarterlyDouble5.getTtm();
        double double11 = quarterlyDouble5.getTtm();
        double double14 = quarterlyDouble5.deltaQ((int) (byte) 10, (int) (byte) -1);
        double double17 = quarterlyDouble5.deltaQ(10, (int) (short) 100);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9999.9999d) + "'", double7 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test10710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10710");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray16);
        double double19 = quarterlyDouble18.getQseqQ();
        double double20 = quarterlyDouble18.getMostRecent();
        double[] doubleArray24 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble25 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray24);
        double double26 = quarterlyDouble25.getTtm();
        double double27 = quarterlyDouble25.getQseqQ();
        double[] doubleArray28 = quarterlyDouble25.dArr;
        double double29 = quarterlyDouble25.getQseqQ();
        double[] doubleArray33 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble34 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray33);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble35 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray33);
        quarterlyDouble25.dArr = doubleArray33;
        double[] doubleArray40 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble41 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray40);
        double[] doubleArray42 = quarterlyDouble41.dArr;
        double[] doubleArray43 = quarterlyDouble41.dArr;
        quarterlyDouble25.dArr = doubleArray43;
        double double45 = quarterlyDouble25.getQseqQ();
        double double46 = quarterlyDouble25.getTtm();
        double[] doubleArray50 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble51 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray50);
        double[] doubleArray55 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble56 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray55);
        double double57 = quarterlyDouble56.getTtm();
        double double58 = quarterlyDouble56.getQseqQ();
        double[] doubleArray59 = quarterlyDouble56.dArr;
        double double60 = quarterlyDouble56.getQseqQ();
        double[] doubleArray64 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble65 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray64);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble66 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray64);
        quarterlyDouble56.dArr = doubleArray64;
        double[] doubleArray68 = quarterlyDouble56.dArr;
        double[] doubleArray72 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble73 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray72);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble74 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray72);
        double[] doubleArray75 = quarterlyDouble74.dArr;
        double[] doubleArray79 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble80 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray79);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble81 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray79);
        double double83 = quarterlyDouble81.get(100);
        double[] doubleArray84 = quarterlyDouble81.dArr;
        quarterlyDouble74.dArr = doubleArray84;
        quarterlyDouble56.dArr = doubleArray84;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble87 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray84);
        quarterlyDouble51.dArr = doubleArray84;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble89 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray84);
        quarterlyDouble25.dArr = doubleArray84;
        quarterlyDouble18.dArr = doubleArray84;
        double double92 = quarterlyDouble18.getQseqQ();
        double double93 = quarterlyDouble18.getTtmAvg();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str95 = quarterlyDouble18.fmtGrowth4Q("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
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
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 5100.0d + "'", double19 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 52.0d + "'", double20 == 52.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 5100.0d + "'", double27 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 5100.0d + "'", double29 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 5100.0d + "'", double45 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 5100.0d + "'", double58 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 5100.0d + "'", double60 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray79), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + (-9999.9999d) + "'", double83 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray84), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 5100.0d + "'", double92 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + 0.0d + "'", double93 == 0.0d);
    }

    @Test
    public void test10711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10711");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("");
        java.lang.String str2 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
        java.lang.String str4 = companyData1.getTicker();
        java.lang.String str5 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = companyData1.getFdList();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData9 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList6, (int) (short) 0, (int) (byte) -1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData12 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList6, (int) (byte) 10, (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(fieldDataList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNull(fieldData9);
        org.junit.Assert.assertNull(fieldData12);
    }

    @Test
    public void test10712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10712");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("\t\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)", (int) (short) -1, (int) 'a');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test10713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10713");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double6 = quarterlyDouble5.getTtmAvg();
        double double7 = quarterlyDouble5.getTtmAvg();
        double double8 = quarterlyDouble5.getTtmAvg();
        double[] doubleArray9 = quarterlyDouble5.dArr;
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
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 5100.0d + "'", double10 == 5100.0d);
    }

    @Test
    public void test10714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10714");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double double6 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.getTtmAvg();
        double double9 = quarterlyDouble4.get((int) (byte) 100);
        double[] doubleArray10 = quarterlyDouble4.dArr;
        double[] doubleArray14 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray14);
        double double16 = quarterlyDouble15.getTtm();
        double double17 = quarterlyDouble15.getQseqQ();
        double[] doubleArray18 = quarterlyDouble15.dArr;
        double double19 = quarterlyDouble15.getQseqQ();
        double[] doubleArray23 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble24 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray23);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble25 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray23);
        quarterlyDouble15.dArr = doubleArray23;
        double[] doubleArray27 = quarterlyDouble15.dArr;
        double[] doubleArray31 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble32 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray31);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble33 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray31);
        double[] doubleArray34 = quarterlyDouble33.dArr;
        double[] doubleArray38 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble39 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray38);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble40 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray38);
        double double42 = quarterlyDouble40.get(100);
        double[] doubleArray43 = quarterlyDouble40.dArr;
        quarterlyDouble33.dArr = doubleArray43;
        quarterlyDouble15.dArr = doubleArray43;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble46 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray43);
        double[] doubleArray47 = quarterlyDouble46.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble48 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray47);
        quarterlyDouble4.dArr = doubleArray47;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble50 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray47);
        double double51 = quarterlyDouble50.getTtmAvg();
        double[] doubleArray55 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble56 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray55);
        double double57 = quarterlyDouble56.getTtm();
        double double58 = quarterlyDouble56.getQseqQ();
        double[] doubleArray59 = quarterlyDouble56.dArr;
        double double60 = quarterlyDouble56.getQseqQ();
        double double61 = quarterlyDouble56.getQseqQ();
        double double62 = quarterlyDouble56.getQseqQ();
        double[] doubleArray63 = quarterlyDouble56.dArr;
        double double65 = quarterlyDouble56.get((int) (short) 0);
        double double66 = quarterlyDouble56.getMostRecent();
        double[] doubleArray67 = quarterlyDouble56.dArr;
        quarterlyDouble50.dArr = doubleArray67;
        // The following exception was thrown during execution in test generation
        try {
            double double71 = quarterlyDouble50.deltaQ(1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 5100.0d + "'", double17 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 5100.0d + "'", double19 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + (-9999.9999d) + "'", double42 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 5100.0d + "'", double58 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 5100.0d + "'", double60 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 5100.0d + "'", double61 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 5100.0d + "'", double62 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 10.0d + "'", double65 == 10.0d);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 52.0d + "'", double66 == 52.0d);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[10.0, 52.0, 1.0]");
    }

    @Test
    public void test10715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10715");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double7 = quarterlyDouble5.get((int) (short) -1);
        double[] doubleArray8 = quarterlyDouble5.dArr;
        double double9 = quarterlyDouble5.getQseqQ();
        double[] doubleArray10 = quarterlyDouble5.dArr;
        double[] doubleArray11 = quarterlyDouble5.dArr;
        java.lang.Class<?> wildcardClass12 = quarterlyDouble5.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9999.9999d) + "'", double7 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 5100.0d + "'", double9 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test10716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10716");
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
        double double36 = quarterlyDouble35.getMostRecent();
        double[] doubleArray37 = quarterlyDouble35.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble38 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray37);
        double double40 = quarterlyDouble38.get((int) '4');
        double double41 = quarterlyDouble38.getQseqQ();
        double double42 = quarterlyDouble38.getTtm();
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
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 52.0d + "'", double36 == 52.0d);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + (-9999.9999d) + "'", double40 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 5100.0d + "'", double41 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
    }

    @Test
    public void test10717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10717");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
        java.lang.String str5 = companyData1.getTicker();
        java.lang.String str6 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = companyData1.getFdList();
        java.lang.String str11 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = companyData1.getFdList();
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNotNull(fieldDataList3);
        org.junit.Assert.assertNotNull(fieldDataList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(fieldDataList7);
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(fieldDataList12);
    }

    @Test
    public void test10718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10718");
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
        double[] doubleArray21 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble22 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray21);
        double double23 = quarterlyDouble22.getTtmAvg();
        double double24 = quarterlyDouble22.getMostRecent();
        double double25 = quarterlyDouble22.getTtm();
        double double26 = quarterlyDouble22.getTtm();
        double[] doubleArray27 = quarterlyDouble22.dArr;
        double[] doubleArray31 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble32 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray31);
        double double33 = quarterlyDouble32.getTtm();
        double double34 = quarterlyDouble32.getQseqQ();
        double[] doubleArray38 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble39 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray38);
        quarterlyDouble32.dArr = doubleArray38;
        double double41 = quarterlyDouble32.getQseqQ();
        double double44 = quarterlyDouble32.deltaQ((int) (short) 100, (int) (byte) -1);
        double[] doubleArray48 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble49 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray48);
        double double50 = quarterlyDouble49.getTtmAvg();
        double double51 = quarterlyDouble49.getMostRecent();
        double double53 = quarterlyDouble49.get((int) 'a');
        double double55 = quarterlyDouble49.get((int) (byte) -1);
        double[] doubleArray59 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble60 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray59);
        double double61 = quarterlyDouble60.getTtm();
        double double62 = quarterlyDouble60.getQseqQ();
        double[] doubleArray63 = quarterlyDouble60.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble64 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray63);
        quarterlyDouble49.dArr = doubleArray63;
        quarterlyDouble32.dArr = doubleArray63;
        quarterlyDouble22.dArr = doubleArray63;
        quarterlyDouble4.dArr = doubleArray63;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble69 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray63);
        double double70 = quarterlyDouble69.getMostRecent();
        double double71 = quarterlyDouble69.getMostRecent();
        double[] doubleArray72 = quarterlyDouble69.dArr;
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
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 52.0d + "'", double24 == 52.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 5100.0d + "'", double34 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 5100.0d + "'", double41 == 5100.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 52.0d + "'", double51 == 52.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + (-9999.9999d) + "'", double53 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + (-9999.9999d) + "'", double55 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.0d + "'", double61 == 0.0d);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 5100.0d + "'", double62 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 52.0d + "'", double70 == 52.0d);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 52.0d + "'", double71 == 52.0d);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[10.0, 52.0, 1.0]");
    }

    @Test
    public void test10719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10719");
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
        double double17 = quarterlyDouble4.getTtm();
        double double19 = quarterlyDouble4.get(0);
        double double20 = quarterlyDouble4.getMostRecent();
        double double21 = quarterlyDouble4.getQseqQ();
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 52.0d + "'", double20 == 52.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 5100.0d + "'", double21 == 5100.0d);
    }

    @Test
    public void test10720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10720");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%)", 0, (int) (short) 1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test10721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10721");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
        java.lang.String str5 = companyData1.getTicker();
        java.lang.String str6 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = companyData1.getFdList();
        java.lang.String str10 = companyData1.getTicker();
        java.lang.String str11 = companyData1.getTicker();
        java.lang.String str12 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = companyData1.getFdList();
        java.lang.String str15 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = companyData1.getFdList();
        java.lang.String str18 = companyData1.getTicker();
        java.lang.String str19 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList20 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = companyData1.getFdList();
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNotNull(fieldDataList3);
        org.junit.Assert.assertNotNull(fieldDataList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(fieldDataList7);
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(fieldDataList13);
        org.junit.Assert.assertNotNull(fieldDataList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(fieldDataList16);
        org.junit.Assert.assertNotNull(fieldDataList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(fieldDataList20);
        org.junit.Assert.assertNotNull(fieldDataList21);
    }

    @Test
    public void test10722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests21.test10722");
        double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getQseqQ();
        double[] doubleArray7 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray7);
        double double9 = quarterlyDouble8.getQseqQ();
        double double10 = quarterlyDouble8.getMostRecent();
        double[] doubleArray11 = quarterlyDouble8.dArr;
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble30 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray27);
        double[] doubleArray34 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble35 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray34);
        double double36 = quarterlyDouble35.getTtm();
        double double38 = quarterlyDouble35.get((int) '4');
        double[] doubleArray42 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble43 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray42);
        double[] doubleArray44 = quarterlyDouble43.dArr;
        double double45 = quarterlyDouble43.getQseqQ();
        double[] doubleArray46 = new double[] {};
        quarterlyDouble43.dArr = doubleArray46;
        quarterlyDouble35.dArr = doubleArray46;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble49 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray46);
        quarterlyDouble30.dArr = doubleArray46;
        double[] doubleArray54 = new double[] { 10.0d, '4', (short) 1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble55 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray54);
        double[] doubleArray56 = quarterlyDouble55.dArr;
        double[] doubleArray57 = quarterlyDouble55.dArr;
        quarterlyDouble30.dArr = doubleArray57;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble59 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray57);
        quarterlyDouble8.dArr = doubleArray57;
        double double61 = quarterlyDouble8.getMostRecent();
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
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + (-9999.9999d) + "'", double38 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 5100.0d + "'", double45 == 5100.0d);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[10.0, 52.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 52.0d + "'", double61 == 52.0d);
    }
}

