package net.ajaskey.market.tools.SIP.BigDB.collation;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CollationTests0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0001");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList3, (int) (byte) 100, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList10 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList3, (int) (byte) 100, (int) (short) -1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(companyDataList7);
        org.junit.Assert.assertNotNull(companyDataList10);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0002");
        java.util.List<java.lang.String> strList0 = null;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList1 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList0);
        org.junit.Assert.assertNotNull(companyDataList1);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0003");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = quarterlyDouble4.fmtGrowth4Q("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0004");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("", (-1), (int) (byte) -1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0005");
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
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0006");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!", (int) (byte) -1, (int) ' ');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0007");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getCompanySummary(10, (int) (byte) 1);
        org.junit.Assert.assertNotNull(companySummaryList2);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0008");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData> oneCompanyDataList1 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getCompany("hi!");
        org.junit.Assert.assertNotNull(oneCompanyDataList1);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0009");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double[] doubleArray8 = quarterlyDouble4.dArr;
        java.lang.Class<?> wildcardClass9 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0010");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = quarterlyDouble4.fmtGrowth1Q("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0011");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        java.lang.Class<?> wildcardClass5 = quarterlyDouble4.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0012");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList2, (int) (byte) -1, (int) (byte) 1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(companyDataList6);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0013");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double[] doubleArray8 = quarterlyDouble4.dArr;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = quarterlyDouble4.deltaQ(0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 1.0, -1.0]");
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0014");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList3, (int) (byte) 100, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList8 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList((java.util.List<java.lang.String>) strList3);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(companyDataList7);
        org.junit.Assert.assertNotNull(manyCompanyDataList8);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0015");
        java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) (byte) 1, (int) (short) -1);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0016");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = quarterlyDouble4.fmtGrowth1Q("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0017");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = quarterlyDouble4.fmtGrowth1Q("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0018");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray6 = new double[] {};
        quarterlyDouble4.dArr = doubleArray6;
        double double8 = quarterlyDouble4.getTtm();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = quarterlyDouble4.getMostRecent();
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
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0019");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getMostRecent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = quarterlyDouble4.fmtGrowth4Q("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0020");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = quarterlyDouble4.fmtGrowth1Q("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0021");
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
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0022");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) '#', (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList(strList3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList5 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList(strList3);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(manyCompanyDataList4);
        org.junit.Assert.assertNotNull(manyCompanyDataList5);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0023");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!", (int) (short) 0, (int) (byte) -1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0024");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = quarterlyDouble4.fmtGrowth1Q("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0025");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum4 = null;
        java.util.List<java.lang.String> strList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.get((int) (short) 0, 10, snpEnum2, dowEnum3, exchEnum4, (double) 10L, (long) (byte) 1);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0026");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getCompanySummary((int) '4', (int) '#');
        org.junit.Assert.assertNotNull(companySummaryList2);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0027");
        double[] doubleArray0 = new double[] {};
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = quarterlyDouble1.fmtGrowth4Q("\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0028");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData> oneCompanyDataList1 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getCompany("\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        org.junit.Assert.assertNotNull(oneCompanyDataList1);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0029");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (byte) 10, (-1));
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0030");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.getMostRecent();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = quarterlyDouble4.deltaQ(0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
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
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0031");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("", (int) '#', (int) (byte) 100);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0032");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = quarterlyDouble4.fmtGrowth4Q("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0033");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getPrevTtm();
        double double7 = quarterlyDouble4.getTtmAvg();
        double double10 = quarterlyDouble4.deltaQ((int) 'a', (int) (byte) -1);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0034");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getCompanySummary((int) '#', (int) (short) 100);
        org.junit.Assert.assertNotNull(companySummaryList2);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0035");
        double[] doubleArray0 = new double[] {};
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        // The following exception was thrown during execution in test generation
        try {
            double double2 = quarterlyDouble1.getMostRecent();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0036");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getCompanySummary(1, 10);
        org.junit.Assert.assertNotNull(companySummaryList2);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0037");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double[] doubleArray8 = quarterlyDouble4.dArr;
        double[] doubleArray12 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray12);
        quarterlyDouble4.dArr = doubleArray12;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = quarterlyDouble4.getQoQ();
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
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0038");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) 'a', (int) '#');
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0039");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) '#', (int) (byte) 0);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0040");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getCompanySummary(10, (int) ' ');
        org.junit.Assert.assertNotNull(companySummaryList2);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0041");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.get2QTtm();
        double double4 = quarterlyDouble1.getMostRecent();
        double double5 = quarterlyDouble1.getQoQ();
        java.lang.Class<?> wildcardClass6 = quarterlyDouble1.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0042");
        java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) (byte) 1, (int) (short) 1);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0043");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double[] doubleArray8 = quarterlyDouble4.dArr;
        double double9 = quarterlyDouble4.getTtmAvg();
        double double12 = quarterlyDouble4.deltaQ((int) (byte) 10, 100);
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
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0044");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("", 1, (int) 'a');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0045");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (byte) 1, (int) (short) 1);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0046");
        double[] doubleArray0 = new double[] {};
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = quarterlyDouble1.deltaQ(1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0047");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(snpEnum0, (int) (byte) -1, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList(strList3);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(manyCompanyDataList4);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0048");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000", 100, (int) (short) 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0049");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%)", 0, (int) (short) 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0050");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000", (int) 'a', 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0051");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getTtm();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = quarterlyDouble4.fmtGrowth1Q("\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
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
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0052");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getPrevTtm();
        double double7 = quarterlyDouble4.getTtmAvg();
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
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0053");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList3, (int) (byte) 100, 10);
        java.lang.Class<?> wildcardClass8 = strList3.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(companyDataList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0054");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getMostRecent();
        double double8 = quarterlyDouble4.deltaQ((int) 'a', (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = quarterlyDouble4.fmtGrowth1Q("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0055");
        java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers((int) '4', (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList2, (int) (byte) 0, (int) (short) 0);
        java.lang.Class<?> wildcardClass7 = companyDataList6.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(companyDataList3);
        org.junit.Assert.assertNotNull(companyDataList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0056");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray6 = new double[] {};
        quarterlyDouble4.dArr = doubleArray6;
        double double8 = quarterlyDouble4.getTtm();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = quarterlyDouble4.getQseqQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0057");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum4 = null;
        java.util.List<java.lang.String> strList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.get((int) (byte) 10, (int) (byte) 1, snpEnum2, dowEnum3, exchEnum4, 0.0d, (long) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList10 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList7, (int) ' ', (int) (byte) 1);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(companyDataList10);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0058");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) 'a', 100);
        java.lang.Class<?> wildcardClass4 = strList3.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0059");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, 100, 100);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0060");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%)", (int) '4', (int) (short) 1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0061");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) ' ', (int) (short) -1);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0062");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double double8 = quarterlyDouble4.get2QTtm();
        double double9 = quarterlyDouble4.getTtmAvg();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = quarterlyDouble4.fmtGrowth1Q("\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0063");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.get2QTtm();
        double double4 = quarterlyDouble1.getMostRecent();
        double[] doubleArray5 = quarterlyDouble1.dArr;
        java.lang.Class<?> wildcardClass6 = quarterlyDouble1.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0064");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write(10, 1);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0065");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) (byte) -1, (int) '#');
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0066");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double[] doubleArray8 = quarterlyDouble4.dArr;
        double double9 = quarterlyDouble4.getTtm();
        double double10 = quarterlyDouble4.get2QTtm();
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
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0067");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData> oneCompanyDataList1 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getCompany("");
        java.lang.Class<?> wildcardClass2 = oneCompanyDataList1.getClass();
        org.junit.Assert.assertNotNull(oneCompanyDataList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0068");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (byte) 1, (int) (byte) 1);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0069");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double double8 = quarterlyDouble4.get2QTtm();
        java.lang.String str9 = quarterlyDouble4.toString();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = quarterlyDouble4.getQoQ();
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
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0070");
        java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) (byte) 1, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList5 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList2, 10, (int) (short) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList8 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList2, (-1), (-1));
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(companyDataList5);
        org.junit.Assert.assertNotNull(companyDataList8);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0071");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double[] doubleArray8 = quarterlyDouble4.dArr;
        double double9 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray13 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray13);
        double double15 = quarterlyDouble14.getTtmAvg();
        double[] doubleArray16 = new double[] {};
        quarterlyDouble14.dArr = doubleArray16;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray16);
        quarterlyDouble4.dArr = doubleArray16;
        // The following exception was thrown during execution in test generation
        try {
            double double22 = quarterlyDouble4.deltaQ((int) (short) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
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
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[]");
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0072");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) '#', (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList(strList3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3, (int) (byte) 10, (int) (byte) 0);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(manyCompanyDataList4);
        org.junit.Assert.assertNotNull(companyDataList7);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0073");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.getPrevTtm();
        double double8 = quarterlyDouble4.getMostRecent();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0074");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write(10, (int) (short) 1);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0075");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) '4', (int) ' ');
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0076");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.get2QTtm();
        java.lang.String str4 = quarterlyDouble1.toString();
        double double7 = quarterlyDouble1.deltaQ((int) (byte) 100, 0);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = quarterlyDouble1.deltaQ(1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000" + "'", str4, "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0077");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!", (int) '4', 100);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0078");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum4 = null;
        java.util.List<java.lang.String> strList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.get(0, 1, snpEnum2, dowEnum3, exchEnum4, (double) (-1L), (long) (short) 10);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0079");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, (int) ' ', 10);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0080");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.get2QTtm();
        java.lang.String str4 = quarterlyDouble1.toString();
        double double7 = quarterlyDouble1.deltaQ((int) (byte) 100, 0);
        double double8 = quarterlyDouble1.getQoQ();
        java.lang.String str10 = quarterlyDouble1.fmtGrowth1Q("\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        java.lang.String str12 = quarterlyDouble1.fmtGrowth4Q("\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000" + "'", str4, "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str10, "\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\t\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str12, "\t\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0081");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getCompanySummary((int) (byte) 0, (int) (short) 1);
        org.junit.Assert.assertNotNull(companySummaryList2);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0082");
        java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) 'a', (int) (short) -1);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0083");
        java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) (byte) 1, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList5 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList2, 100, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(companyDataList5);
        org.junit.Assert.assertNotNull(manyCompanyDataList6);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0084");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double double8 = quarterlyDouble4.get2QTtm();
        java.lang.String str9 = quarterlyDouble4.toString();
        double double10 = quarterlyDouble4.getQseqQ();
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
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000" + "'", str9, "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 200.0d + "'", double10 == 200.0d);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0085");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getPrevTtm();
        double double7 = quarterlyDouble4.getTtmAvg();
        double double8 = quarterlyDouble4.getQseqQ();
        double double9 = quarterlyDouble4.get2QTtm();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = quarterlyDouble4.fmtGrowth4Q("\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0086");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray6 = new double[] {};
        quarterlyDouble4.dArr = doubleArray6;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = quarterlyDouble8.fmtGrowth1Q("\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
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
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0087");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        java.lang.String str4 = quarterlyDouble1.fmtGrowth4Q("hi!");
        java.lang.String str6 = quarterlyDouble1.fmtGrowth1Q("hi!");
        double double7 = quarterlyDouble1.getMostRecent();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str4, "\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str6, "\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0088");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray6 = new double[] {};
        quarterlyDouble4.dArr = doubleArray6;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = quarterlyDouble4.getMostRecent();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
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
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0089");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, (int) (byte) 0, 10);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0090");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getCompanySummary((int) '#', (int) (byte) 100);
        org.junit.Assert.assertNotNull(companySummaryList2);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0091");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getPrevTtm();
        double double7 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray8 = quarterlyDouble4.dArr;
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
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 1.0, -1.0]");
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0092");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) 'a', (int) (byte) 0);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0093");
        java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) 'a', 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList3 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(manyCompanyDataList3);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0094");
        java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr(0, (int) '#');
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0095");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (-1), (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3, 1, 100);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(companyDataList6);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0096");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData> oneCompanyDataList1 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getCompany("\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertNotNull(oneCompanyDataList1);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0097");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray6 = new double[] {};
        quarterlyDouble4.dArr = doubleArray6;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray6);
        double[] doubleArray9 = quarterlyDouble8.dArr;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = quarterlyDouble8.getMostRecent();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
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
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0098");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getCompanySummary(0, (int) 'a');
        org.junit.Assert.assertNotNull(companySummaryList2);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0099");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, (int) ' ', (int) (short) 1);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0100");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList3, (int) (byte) 100, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList10 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList3, (int) (byte) 10, (int) (byte) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList13 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList3, (int) '#', (int) (short) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList14 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList((java.util.List<java.lang.String>) strList3);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(companyDataList7);
        org.junit.Assert.assertNotNull(companyDataList10);
        org.junit.Assert.assertNotNull(companyDataList13);
        org.junit.Assert.assertNotNull(manyCompanyDataList14);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0101");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000", 0, 1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0102");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getPrevTtm();
        double double7 = quarterlyDouble4.getPrevTtm();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = quarterlyDouble4.fmtGrowth1Q("\t\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
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
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0103");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%)", 0, (int) (byte) 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0104");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum4 = null;
        java.util.List<java.lang.String> strList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.get((int) (byte) 1, (int) '4', snpEnum2, dowEnum3, exchEnum4, 1.0d, 0L);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0105");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double[] doubleArray8 = quarterlyDouble4.dArr;
        double double9 = quarterlyDouble4.getTtm();
        double double10 = quarterlyDouble4.get2QTtm();
        double double11 = quarterlyDouble4.getPrevTtm();
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
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0106");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(snpEnum0, (int) '4', (int) (byte) -1);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0107");
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
        java.lang.Class<?> wildcardClass14 = doubleArray10.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0108");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write(10, (int) (byte) -1);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0109");
        double[] doubleArray0 = new double[] {};
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble2 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble3 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = quarterlyDouble3.fmtGrowth4Q("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0110");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(snpEnum0, (int) (short) 0, (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3, (int) (byte) 1, (int) (byte) 100);
        java.lang.Class<?> wildcardClass7 = companyDataList6.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(companyDataList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0111");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getMostRecent();
        double double8 = quarterlyDouble4.deltaQ((int) 'a', (int) (short) 10);
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
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0112");
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
            java.lang.String str32 = quarterlyDouble4.fmtGrowth4Q("\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
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
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0113");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (byte) 10, (int) (short) 10);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0114");
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
        java.lang.Class<?> wildcardClass14 = quarterlyDouble12.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0115");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%)", (int) (short) 10, (int) '4');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0116");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum4 = null;
        java.util.List<java.lang.String> strList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.get((int) (byte) 100, (int) (short) 0, snpEnum2, dowEnum3, exchEnum4, 100.0d, (-1L));
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0117");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double[] doubleArray8 = quarterlyDouble4.dArr;
        double[] doubleArray12 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray12);
        quarterlyDouble4.dArr = doubleArray12;
        // The following exception was thrown during execution in test generation
        try {
            double double17 = quarterlyDouble4.deltaQ(0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
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
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0118");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (byte) 0, (int) (byte) -1);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0119");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getCompanySummary((int) ' ', (int) ' ');
        org.junit.Assert.assertNotNull(companySummaryList2);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0120");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getMostRecent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = quarterlyDouble4.fmtGrowth1Q("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0121");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, 0, (int) 'a');
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0122");
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
            double double20 = quarterlyDouble4.getQseqQ();
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
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0123");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("\t\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)", (int) (byte) 10, 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0124");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double[] doubleArray8 = quarterlyDouble4.dArr;
        double[] doubleArray12 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray12);
        quarterlyDouble4.dArr = doubleArray12;
        double double15 = quarterlyDouble4.get2QTtm();
        // The following exception was thrown during execution in test generation
        try {
            double double16 = quarterlyDouble4.getQoQ();
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
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0125");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double double6 = quarterlyDouble4.getQseqQ();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = quarterlyDouble4.fmtGrowth4Q("\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 200.0d + "'", double6 == 200.0d);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0126");
        double[] doubleArray0 = new double[] {};
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble2 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        // The following exception was thrown during execution in test generation
        try {
            double double3 = quarterlyDouble2.getQseqQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0127");
        double[] doubleArray0 = new double[] {};
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble2 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        // The following exception was thrown during execution in test generation
        try {
            double double3 = quarterlyDouble2.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0128");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(snpEnum0, (int) (short) 0, (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3, (int) (byte) 1, (int) (byte) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(companyDataList6);
        org.junit.Assert.assertNotNull(companyDataList7);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0129");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (byte) 0, 0);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0130");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double double6 = quarterlyDouble4.getTtmAvg();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = quarterlyDouble4.fmtGrowth4Q("hi!");
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
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0131");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getCompanySummary(0, 1);
        org.junit.Assert.assertNotNull(companySummaryList2);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0132");
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
            java.lang.String str30 = quarterlyDouble4.fmtGrowth1Q("\t\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
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
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0133");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getCompanySummary((int) (byte) 0, (int) (byte) 10);
        org.junit.Assert.assertNotNull(companySummaryList2);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0134");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getPrevTtm();
        double double7 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray8 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = quarterlyDouble9.fmtGrowth4Q("\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
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
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0135");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0136");
        java.util.List<java.lang.String> strList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList0, (int) (byte) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0137");
        java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) (byte) -1, (int) (short) 1);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0138");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) '#', (-1));
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0139");
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
        // The following exception was thrown during execution in test generation
        try {
            double double14 = quarterlyDouble12.getQseqQ();
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
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0140");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray6 = new double[] {};
        quarterlyDouble4.dArr = doubleArray6;
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
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0141");
        double[] doubleArray0 = new double[] {};
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double4 = quarterlyDouble1.deltaQ((int) (short) 10, (int) 'a');
        double double6 = quarterlyDouble1.get(100);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = quarterlyDouble1.getMostRecent();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-9999.9999d) + "'", double6 == (-9999.9999d));
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0142");
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
            double double32 = quarterlyDouble4.getMostRecent();
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
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0143");
        java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers((int) (byte) -1, (int) 'a');
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0144");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getPrevTtm();
        double double7 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray8 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray8);
        double double10 = quarterlyDouble9.getQseqQ();
        double double11 = quarterlyDouble9.getPrevTtm();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 200.0d + "'", double10 == 200.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0145");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) ' ', 0);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0146");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("", (int) (byte) 1, (int) ' ');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0147");
        java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers((int) (short) 1, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(companyDataList3);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0148");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (short) 1, (int) (short) -1);
        java.lang.Class<?> wildcardClass4 = strList3.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0149");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.getTtm();
        java.lang.String str5 = quarterlyDouble1.fmtGrowth1Q("\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        java.lang.Class<?> wildcardClass6 = quarterlyDouble1.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str5, "\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0150");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData5 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList2, (int) (byte) 0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNull(fieldData5);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0151");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%)", (int) (byte) -1, 10);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0152");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double double8 = quarterlyDouble4.get2QTtm();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = quarterlyDouble4.fmtGrowth1Q("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0153");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.getMostRecent();
        double double8 = quarterlyDouble4.getQseqQ();
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
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 200.0d + "'", double8 == 200.0d);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0154");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData5 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList2, (-1), (int) (short) 10);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData8 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList2, (int) (short) 0, 0);
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNull(fieldData5);
        org.junit.Assert.assertNull(fieldData8);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0155");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getCompanySummary((int) (byte) 10, (int) '#');
        org.junit.Assert.assertNotNull(companySummaryList2);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0156");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str40 = quarterlyDouble4.fmtGrowth1Q("\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
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
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0157");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        java.lang.String str6 = quarterlyDouble4.toString();
        double double7 = quarterlyDouble4.getPrevTtm();
        double double9 = quarterlyDouble4.get((int) (byte) 10);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000" + "'", str6, "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-9999.9999d) + "'", double9 == (-9999.9999d));
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0158");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%)", 1, (int) (short) 1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0159");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%)", (int) (byte) 100, 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0160");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData> oneCompanyDataList1 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getCompany("\t\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertNotNull(oneCompanyDataList1);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0161");
        double[] doubleArray1 = new double[] { (short) -1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble2 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray1);
        double double3 = quarterlyDouble2.getTtmAvg();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0162");
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
            java.lang.String str27 = quarterlyDouble4.fmtGrowth1Q("\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
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
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0163");
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
        double double16 = quarterlyDouble12.deltaQ((int) (short) 1, (int) (short) 0);
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
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0164");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, 100, (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(companyDataList4);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0165");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getPrevTtm();
        double double7 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray8 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray8);
        double double10 = quarterlyDouble9.get2QTtm();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0166");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
        java.lang.String str4 = companyData1.getTicker();
        java.lang.String str5 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = companyData1.getFdList();
        java.lang.String str7 = companyData1.getTicker();
        java.lang.String str8 = companyData1.getTicker();
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNotNull(fieldDataList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0167");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray6 = new double[] {};
        quarterlyDouble4.dArr = doubleArray6;
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
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0168");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.getMostRecent();
        double double8 = quarterlyDouble4.getTtm();
        double double9 = quarterlyDouble4.getMostRecent();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = quarterlyDouble4.getQoQ();
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
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0169");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (byte) 100, (int) (short) 0);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0170");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double[] doubleArray8 = quarterlyDouble4.dArr;
        double[] doubleArray9 = new double[] {};
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray9);
        quarterlyDouble4.dArr = doubleArray9;
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
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[]");
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0171");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double[] doubleArray8 = quarterlyDouble4.dArr;
        double[] doubleArray9 = new double[] {};
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray9);
        quarterlyDouble4.dArr = doubleArray9;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = quarterlyDouble4.fmtGrowth4Q("\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
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
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0172");
        java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr(100, (int) (short) 0);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0173");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, 1, (int) (byte) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3, 10, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList7 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList(strList3);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(companyDataList6);
        org.junit.Assert.assertNotNull(manyCompanyDataList7);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0174");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, (int) (short) -1, (int) '#');
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0175");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double[] doubleArray8 = quarterlyDouble4.dArr;
        double double9 = quarterlyDouble4.getTtmAvg();
        double double10 = quarterlyDouble4.getTtm();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = quarterlyDouble4.fmtGrowth1Q("\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
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
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0176");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = quarterlyDouble4.fmtGrowth1Q("\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
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
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0177");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (byte) 0, (int) (short) -1);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0178");
        java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) 'a', (int) (short) 0);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0179");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, (int) (short) 10, 100);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0180");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("", (int) (short) -1, 10);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0181");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) '4', (int) '4');
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0182");
        java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) (byte) -1, (int) (byte) 1);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0183");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) 'a', 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList5 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList(strList3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList(strList3);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(companyDataList4);
        org.junit.Assert.assertNotNull(manyCompanyDataList5);
        org.junit.Assert.assertNotNull(manyCompanyDataList6);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0184");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getPrevTtm();
        double double7 = quarterlyDouble4.getTtmAvg();
        java.lang.Class<?> wildcardClass8 = quarterlyDouble4.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0185");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double[] doubleArray8 = quarterlyDouble4.dArr;
        double double9 = quarterlyDouble4.getTtm();
        double double10 = quarterlyDouble4.get2QTtm();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = quarterlyDouble4.fmtGrowth4Q("\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
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
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0186");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (short) 0, 10);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0187");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double double8 = quarterlyDouble4.getMostRecent();
        double double9 = quarterlyDouble4.get2QTtm();
        double double10 = quarterlyDouble4.getQseqQ();
        double double13 = quarterlyDouble4.deltaQ(10, (int) (byte) 1);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 200.0d + "'", double10 == 200.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0188");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.get2QTtm();
        double double4 = quarterlyDouble1.getMostRecent();
        double double5 = quarterlyDouble1.getQoQ();
        double double6 = quarterlyDouble1.getMostRecent();
        double double7 = quarterlyDouble1.getQseqQ();
        java.lang.Class<?> wildcardClass8 = quarterlyDouble1.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0189");
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
            java.lang.String str12 = quarterlyDouble4.fmtGrowth1Q("hi!");
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
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0190");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData> oneCompanyDataList1 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getCompany("\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertNotNull(oneCompanyDataList1);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0191");
        java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(0, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList5 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList2, (int) '#', (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList(strList2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(companyDataList5);
        org.junit.Assert.assertNotNull(manyCompanyDataList6);
        org.junit.Assert.assertNotNull(companyDataList7);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0192");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) 'a', 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList(strList3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList5 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(manyCompanyDataList4);
        org.junit.Assert.assertNotNull(companyDataList5);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0193");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) '#', (int) (short) 10);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0194");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!", (-1), (int) (byte) 1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0195");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, 1, (int) (byte) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3, 10, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3);
        java.lang.Class<?> wildcardClass8 = strList3.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(companyDataList6);
        org.junit.Assert.assertNotNull(companyDataList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0196");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) 'a', (int) (short) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList(strList3);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(manyCompanyDataList4);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0197");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getCompanySummary((int) (byte) 1, 0);
        org.junit.Assert.assertNotNull(companySummaryList2);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0198");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, 0, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList(strList3);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(manyCompanyDataList4);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0199");
        java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) (short) 10, (int) '#');
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0200");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
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
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0201");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (short) 1, 10);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0202");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) '#', (int) ' ');
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0203");
        java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) (byte) 1, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList5 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList2, 100, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList8 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList2, (int) (byte) 1, (int) (byte) -1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(companyDataList5);
        org.junit.Assert.assertNotNull(companyDataList8);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0204");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (short) -1, (int) (short) 1);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0205");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (byte) -1, 0);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0206");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double[] doubleArray8 = quarterlyDouble4.dArr;
        double double11 = quarterlyDouble4.deltaQ((int) 'a', 10);
        double double12 = quarterlyDouble4.getPrevTtm();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = quarterlyDouble4.fmtGrowth4Q("");
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
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0207");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!", (int) (short) 10, (int) '4');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0208");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double[] doubleArray8 = quarterlyDouble4.dArr;
        double double9 = quarterlyDouble4.getTtm();
        double double10 = quarterlyDouble4.getTtm();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0209");
        java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) (byte) -1, (int) (byte) 100);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0210");
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
            java.lang.String str12 = quarterlyDouble4.fmtGrowth1Q("\t\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
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
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0211");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(snpEnum0, (int) (short) 0, (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(companyDataList4);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0212");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(snpEnum0, (int) (short) 0, (int) '4');
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0213");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = quarterlyDouble29.fmtGrowth1Q("\t\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
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
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0214");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData5 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList2, (int) (byte) 0, 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData8 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList2, (int) ' ', (int) ' ');
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData11 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList2, 0, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = fieldData11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNull(fieldData5);
        org.junit.Assert.assertNull(fieldData8);
        org.junit.Assert.assertNull(fieldData11);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0215");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (short) 10, 100);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0216");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum4 = null;
        java.util.List<java.lang.String> strList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.get(100, (int) (short) 0, snpEnum2, dowEnum3, exchEnum4, (-1.0d), (long) 'a');
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0217");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum4 = null;
        java.util.List<java.lang.String> strList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.get((int) ' ', (int) (byte) -1, snpEnum2, dowEnum3, exchEnum4, (double) (short) 100, (long) (short) 10);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0218");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double[] doubleArray8 = quarterlyDouble4.dArr;
        double double9 = quarterlyDouble4.getPrevTtm();
        double double12 = quarterlyDouble4.deltaQ((int) '#', (int) (byte) 10);
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
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0219");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) 'a', (int) (byte) 100);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0220");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%)", 0, (int) (byte) 1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0221");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, (int) ' ', (int) (short) 10);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0222");
        double[] doubleArray0 = new double[] {};
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble2 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble3 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = quarterlyDouble4.getQseqQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0223");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(snpEnum0, (int) 'a', (int) (short) 100);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0224");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getPrevTtm();
        double double7 = quarterlyDouble4.getTtmAvg();
        double double8 = quarterlyDouble4.getQseqQ();
        double double9 = quarterlyDouble4.get2QTtm();
        double double10 = quarterlyDouble4.getTtm();
        java.lang.Class<?> wildcardClass11 = quarterlyDouble4.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 200.0d + "'", double8 == 200.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0225");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum4 = null;
        java.util.List<java.lang.String> strList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.get((int) (short) -1, (int) (short) 100, snpEnum2, dowEnum3, exchEnum4, (double) (-1.0f), (long) (byte) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList8 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList7);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(companyDataList8);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0226");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData> oneCompanyDataList1 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getCompany("\t\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertNotNull(oneCompanyDataList1);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0227");
        java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(100, (int) (short) 100);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0228");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getMostRecent();
        double double6 = quarterlyDouble4.getQseqQ();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = quarterlyDouble4.fmtGrowth1Q("\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
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
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0229");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getCompanySummary(100, (int) (short) 100);
        org.junit.Assert.assertNotNull(companySummaryList2);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0230");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("\t\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)", (int) (short) 10, (int) 'a');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0231");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write(0, (int) (short) -1);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0232");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%)", (int) (short) 10, (int) (byte) 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0233");
        double[] doubleArray0 = new double[] {};
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double4 = quarterlyDouble1.deltaQ((int) (short) 10, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = quarterlyDouble1.fmtGrowth1Q("\t\t\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0234");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = quarterlyDouble1.fmtGrowth4Q("\t\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0235");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = quarterlyDouble4.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0236");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray6 = new double[] {};
        quarterlyDouble4.dArr = doubleArray6;
        double double10 = quarterlyDouble4.deltaQ((int) (byte) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = quarterlyDouble4.fmtGrowth4Q("\t\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
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
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0237");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getCompanySummary(10, (int) (short) 10);
        org.junit.Assert.assertNotNull(companySummaryList2);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0238");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getPrevTtm();
        double double7 = quarterlyDouble4.getTtmAvg();
        double double8 = quarterlyDouble4.getQseqQ();
        double double9 = quarterlyDouble4.get2QTtm();
        double double10 = quarterlyDouble4.getTtm();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = quarterlyDouble4.deltaQ((int) (byte) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 200.0d + "'", double8 == 200.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0239");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) (short) 1, (int) '4');
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0240");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getCompanySummary((int) '4', (int) '4');
        org.junit.Assert.assertNotNull(companySummaryList2);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0241");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write(0, 0);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0242");
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
            double double22 = quarterlyDouble9.getQoQ();
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
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0243");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getPrevTtm();
        double double7 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray8 = quarterlyDouble4.dArr;
        double double9 = quarterlyDouble4.getPrevTtm();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0244");
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
        // The following exception was thrown during execution in test generation
        try {
            double double19 = quarterlyDouble1.deltaQ(1, 100);
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
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0245");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("", (int) '4', (int) ' ');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0246");
        java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) (short) 1, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList3 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(manyCompanyDataList3);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0247");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getMostRecent();
        double double6 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get2QTtm();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0248");
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
        // The following exception was thrown during execution in test generation
        try {
            double double17 = quarterlyDouble1.getQoQ();
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
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0249");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = quarterlyDouble4.fmtGrowth4Q("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
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
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0250");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getMostRecent();
        double double7 = quarterlyDouble4.get(1);
        double double8 = quarterlyDouble4.getMostRecent();
        double double11 = quarterlyDouble4.deltaQ(0, (int) (short) 1);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0251");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (short) 10, 10);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0252");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getMostRecent();
        double double7 = quarterlyDouble4.get(1);
        double double8 = quarterlyDouble4.getTtmAvg();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = quarterlyDouble4.fmtGrowth4Q("\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0253");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getCompanySummary(0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(companySummaryList2);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0254");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getCompanySummary((int) ' ', (-1));
        org.junit.Assert.assertNotNull(companySummaryList2);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0255");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.getMostRecent();
        double double8 = quarterlyDouble4.getTtm();
        double double9 = quarterlyDouble4.getMostRecent();
        java.lang.Class<?> wildcardClass10 = quarterlyDouble4.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0256");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, (int) (short) 100, (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList5 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(companyDataList4);
        org.junit.Assert.assertNotNull(companyDataList5);
        org.junit.Assert.assertNotNull(companyDataList6);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0257");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (short) 10, 100);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0258");
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
        java.lang.Class<?> wildcardClass17 = quarterlyDouble1.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0259");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        java.lang.String str2 = companyData1.getTicker();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str2, "\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0260");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
        java.lang.String str4 = companyData1.getTicker();
        java.lang.String str5 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = companyData1.getFdList();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData10 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList7, (int) '#', 0);
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNotNull(fieldDataList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList7);
        org.junit.Assert.assertNull(fieldData10);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0261");
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
        // The following exception was thrown during execution in test generation
        try {
            double double42 = quarterlyDouble39.deltaQ((-1), 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
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
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0262");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) '#', (int) (short) 10);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0263");
        java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) 'a', (int) (byte) 1);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0264");
        double[] doubleArray0 = new double[] {};
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double4 = quarterlyDouble1.deltaQ((int) (short) 10, (int) 'a');
        double double6 = quarterlyDouble1.get(100);
        double double7 = quarterlyDouble1.getPrevTtm();
        java.lang.Class<?> wildcardClass8 = quarterlyDouble1.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-9999.9999d) + "'", double6 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0265");
        java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(0, (int) (byte) 10);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0266");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double double6 = quarterlyDouble4.getTtmAvg();
        double double8 = quarterlyDouble4.get((int) 'a');
        double[] doubleArray9 = quarterlyDouble4.dArr;
        java.lang.Class<?> wildcardClass10 = doubleArray9.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-9999.9999d) + "'", double8 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0267");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.getMostRecent();
        double double8 = quarterlyDouble4.getTtm();
        double double9 = quarterlyDouble4.getMostRecent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = quarterlyDouble4.fmtGrowth4Q("\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
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
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0268");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getPrevTtm();
        double double7 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray8 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray8);
        double double12 = quarterlyDouble9.deltaQ((int) (byte) 0, 0);
        double double15 = quarterlyDouble9.deltaQ((int) (short) 100, 10);
        double[] doubleArray16 = quarterlyDouble9.dArr;
        // The following exception was thrown during execution in test generation
        try {
            double double17 = quarterlyDouble9.getQoQ();
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
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0, 1.0, -1.0]");
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0269");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (short) 100, (int) (short) 0);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0270");
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
        java.lang.Class<?> wildcardClass17 = quarterlyDouble1.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0271");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getMostRecent();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = quarterlyDouble4.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0272");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, 0, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3, (int) (short) 100, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(companyDataList6);
        org.junit.Assert.assertNotNull(companyDataList7);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0273");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum4 = null;
        java.util.List<java.lang.String> strList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.get((-1), (int) (short) 1, snpEnum2, dowEnum3, exchEnum4, (double) (short) -1, (long) 1);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0274");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double4 = quarterlyDouble1.deltaQ(100, (int) (short) 10);
        double double5 = quarterlyDouble1.getTtm();
        double double6 = quarterlyDouble1.getPrevTtm();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0275");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write(0, (int) '4');
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0276");
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
        // The following exception was thrown during execution in test generation
        try {
            double double19 = quarterlyDouble4.getQseqQ();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0277");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getMostRecent();
        double double6 = quarterlyDouble4.getQseqQ();
        double double7 = quarterlyDouble4.getTtmAvg();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = quarterlyDouble4.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 200.0d + "'", double6 == 200.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0278");
        double[] doubleArray0 = new double[] {};
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble2 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble3 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = quarterlyDouble4.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0279");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray6 = new double[] {};
        quarterlyDouble4.dArr = doubleArray6;
        double double10 = quarterlyDouble4.deltaQ((int) (byte) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = quarterlyDouble4.getQseqQ();
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
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0280");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getCompanySummary((int) (short) 100, (int) 'a');
        org.junit.Assert.assertNotNull(companySummaryList2);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0281");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray6 = new double[] {};
        quarterlyDouble4.dArr = doubleArray6;
        double double8 = quarterlyDouble4.getTtm();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = quarterlyDouble4.fmtGrowth1Q("\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
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
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0282");
        java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers((int) ' ', (int) (short) 10);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0283");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum4 = null;
        java.util.List<java.lang.String> strList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.get((int) (short) -1, (int) (short) 100, snpEnum2, dowEnum3, exchEnum4, (double) (short) 0, (long) 1);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0284");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) '#', 10);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0285");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("\t\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        java.lang.Class<?> wildcardClass2 = companyData1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0286");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) '#', (int) (byte) 10);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0287");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.get2QTtm();
        java.lang.String str4 = quarterlyDouble1.toString();
        double double7 = quarterlyDouble1.deltaQ((int) (byte) 100, 0);
        double double8 = quarterlyDouble1.getQoQ();
        java.lang.String str10 = quarterlyDouble1.fmtGrowth1Q("\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        java.lang.Class<?> wildcardClass11 = quarterlyDouble1.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000" + "'", str4, "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str10, "\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0288");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, 0, (int) (short) 10);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0289");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double double6 = quarterlyDouble4.getTtmAvg();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = quarterlyDouble4.fmtGrowth1Q("\t\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
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
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0290");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getPrevTtm();
        double double7 = quarterlyDouble4.getTtmAvg();
        double double8 = quarterlyDouble4.getTtmAvg();
        java.lang.Class<?> wildcardClass9 = quarterlyDouble4.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0291");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble31 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray26);
        // The following exception was thrown during execution in test generation
        try {
            double double32 = quarterlyDouble31.getQseqQ();
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
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0292");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, (int) (byte) 0, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(companyDataList4);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0293");
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
            double double32 = quarterlyDouble4.getQseqQ();
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
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0294");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(snpEnum0, (int) ' ', 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3, (int) (byte) 0, (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList9 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3, (int) (short) 100, (-1));
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(companyDataList6);
        org.junit.Assert.assertNotNull(companyDataList9);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0295");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getMostRecent();
        double double7 = quarterlyDouble4.get(1);
        double double8 = quarterlyDouble4.getTtmAvg();
        double double9 = quarterlyDouble4.getQseqQ();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = quarterlyDouble4.fmtGrowth4Q("\t\t\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
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
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0296");
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
        double double20 = quarterlyDouble1.deltaQ((int) (short) 0, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0297");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum4 = null;
        java.util.List<java.lang.String> strList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.get((int) (short) 0, 1, snpEnum2, dowEnum3, exchEnum4, (double) 100.0f, (long) (short) -1);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0298");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getCompanySummary(100, (int) (short) 0);
        org.junit.Assert.assertNotNull(companySummaryList2);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0299");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, (int) (short) 100, (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList(strList3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList5 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList(strList3);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(manyCompanyDataList4);
        org.junit.Assert.assertNotNull(manyCompanyDataList5);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0300");
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
        double double33 = quarterlyDouble29.getTtm();
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
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0301");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double double6 = quarterlyDouble4.getTtmAvg();
        double double8 = quarterlyDouble4.get((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = quarterlyDouble4.fmtGrowth1Q("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-9999.9999d) + "'", double8 == (-9999.9999d));
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0302");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = quarterlyDouble4.fmtGrowth1Q("\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0303");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.get2QTtm();
        java.lang.String str4 = quarterlyDouble1.toString();
        double double7 = quarterlyDouble1.deltaQ((int) (byte) 100, 0);
        double[] doubleArray8 = quarterlyDouble1.dArr;
        double double9 = quarterlyDouble1.get2QTtm();
        java.lang.Class<?> wildcardClass10 = quarterlyDouble1.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000" + "'", str4, "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0304");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, (int) (short) 10, (int) (short) 100);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0305");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) ' ', (int) (short) 1);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0306");
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
        double double18 = quarterlyDouble9.getPrevTtm();
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
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0307");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(snpEnum0, (int) ' ', (int) (byte) 10);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0308");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (byte) -1, (int) (short) 10);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0309");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.get2QTtm();
        double double4 = quarterlyDouble1.getMostRecent();
        double double5 = quarterlyDouble1.getQoQ();
        double double6 = quarterlyDouble1.getMostRecent();
        java.lang.Class<?> wildcardClass7 = quarterlyDouble1.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0310");
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
        double[] doubleArray32 = quarterlyDouble4.dArr;
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
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[]");
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0311");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.get2QTtm();
        double double6 = quarterlyDouble1.deltaQ((int) (byte) 10, (int) (short) -1);
        double double7 = quarterlyDouble1.getTtm();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0312");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("\t\t\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0313");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) '4', (int) (byte) 10);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0314");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getPrevTtm();
        double double7 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray8 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray8);
        double double10 = quarterlyDouble9.getTtm();
        double double11 = quarterlyDouble9.getTtm();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = quarterlyDouble9.fmtGrowth1Q("\t\t\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
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
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0315");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum4 = null;
        java.util.List<java.lang.String> strList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.get(0, (int) (byte) 1, snpEnum2, dowEnum3, exchEnum4, (double) 'a', (long) 0);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0316");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (short) 1, (int) (short) 0);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0317");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000", (int) (short) 0, (int) (short) 100);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0318");
        java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers((int) (byte) 1, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(companyDataList3);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0319");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData7 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList4, (int) '4', 10);
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNotNull(fieldDataList3);
        org.junit.Assert.assertNotNull(fieldDataList4);
        org.junit.Assert.assertNull(fieldData7);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0320");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getCompanySummary((int) (short) 10, (int) ' ');
        org.junit.Assert.assertNotNull(companySummaryList2);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0321");
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
        double double33 = quarterlyDouble4.get((int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-9999.9999d) + "'", double33 == (-9999.9999d));
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0322");
        double[] doubleArray0 = new double[] {};
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble2 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble3 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double[] doubleArray5 = quarterlyDouble4.dArr;
        double[] doubleArray6 = quarterlyDouble4.dArr;
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0323");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = quarterlyDouble4.fmtGrowth1Q("\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0324");
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
        double double17 = quarterlyDouble4.get2QTtm();
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
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0325");
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
        double double20 = quarterlyDouble1.getPrevTtm();
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
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0326");
        java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr(0, (int) '4');
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0327");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (-1), (int) (short) 1);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0328");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%)", (int) (short) 0, (int) (short) 1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0329");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double double6 = quarterlyDouble4.getQseqQ();
        double double7 = quarterlyDouble4.getTtmAvg();
        double double8 = quarterlyDouble4.getTtmAvg();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 200.0d + "'", double6 == 200.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0330");
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
        double double14 = quarterlyDouble4.getPrevTtm();
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
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0331");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) '4', (int) 'a');
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0332");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000", (int) 'a', (int) '4');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0333");
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
            double double20 = quarterlyDouble1.getQseqQ();
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
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[]");
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0334");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData> oneCompanyDataList1 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getCompany("\t\t\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertNotNull(oneCompanyDataList1);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0335");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("\t\t\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)", (int) '#', 1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0336");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        java.lang.String str3 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData7 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList4, (-1), (int) 'a');
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str3, "\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertNotNull(fieldDataList4);
        org.junit.Assert.assertNull(fieldData7);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0337");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum4 = null;
        java.util.List<java.lang.String> strList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.get((int) (byte) 10, (int) (byte) 100, snpEnum2, dowEnum3, exchEnum4, (double) (short) 0, (long) (short) 1);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0338");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) '#', 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList(strList3);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(manyCompanyDataList4);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0339");
        java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((-1), (int) (short) 1);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0340");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) '#', 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3, (int) (byte) 100, (int) '4');
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(companyDataList6);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0341");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData5 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList2, (-1), (int) (short) 10);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData8 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList2, 0, (-1));
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData11 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList2, (int) (short) 100, (int) (byte) -1);
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNull(fieldData5);
        org.junit.Assert.assertNull(fieldData8);
        org.junit.Assert.assertNull(fieldData11);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0342");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, 1, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3);
        java.lang.Class<?> wildcardClass5 = strList3.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(companyDataList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0343");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write(1, (-1));
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0344");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(snpEnum0, (int) (byte) 0, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3, 0, (int) '#');
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(companyDataList6);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0345");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (short) 100, (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3, (int) (short) -1, (int) (short) 1);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(companyDataList6);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0346");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.get2QTtm();
        double double6 = quarterlyDouble1.deltaQ((int) (byte) 10, (int) (short) -1);
        double double8 = quarterlyDouble1.get((int) (byte) 100);
        java.lang.String str10 = quarterlyDouble1.fmtGrowth4Q("");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-9999.9999d) + "'", double8 == (-9999.9999d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str10, "\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0347");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = quarterlyDouble1.fmtGrowth1Q("\t\t\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
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
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0348");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        java.lang.String str8 = quarterlyDouble4.toString();
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
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000" + "'", str8, "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0349");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double double8 = quarterlyDouble4.getMostRecent();
        double double9 = quarterlyDouble4.get2QTtm();
        double[] doubleArray10 = quarterlyDouble4.dArr;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = quarterlyDouble4.fmtGrowth4Q("\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
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
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0350");
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
            double double14 = quarterlyDouble4.deltaQ(0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
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
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0351");
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
        // The following exception was thrown during execution in test generation
        try {
            double double14 = quarterlyDouble12.getQoQ();
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0352");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((-1), (int) (byte) 0);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0353");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write(10, 0);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0354");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double double7 = quarterlyDouble4.get(10);
        double double8 = quarterlyDouble4.getTtmAvg();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9999.9999d) + "'", double7 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0355");
        java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) (short) 1, (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList5 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList2, 10, 1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(companyDataList5);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0356");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(snpEnum0, (int) (byte) 1, 10);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0357");
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
        java.lang.Class<?> wildcardClass15 = quarterlyDouble12.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0358");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getCompanySummary((int) (short) 0, (int) 'a');
        org.junit.Assert.assertNotNull(companySummaryList2);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0359");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(snpEnum0, (int) (short) -1, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList(strList3);
        java.lang.Class<?> wildcardClass5 = manyCompanyDataList4.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(manyCompanyDataList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0360");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.getPrevTtm();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = quarterlyDouble4.fmtGrowth4Q("\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
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
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0361");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double[] doubleArray8 = quarterlyDouble4.dArr;
        double double11 = quarterlyDouble4.deltaQ((int) 'a', 10);
        double double12 = quarterlyDouble4.getPrevTtm();
        double double15 = quarterlyDouble4.deltaQ(100, (int) '4');
        double double17 = quarterlyDouble4.get((int) (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-9999.9999d) + "'", double17 == (-9999.9999d));
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0362");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.get2QTtm();
        double double4 = quarterlyDouble1.getMostRecent();
        double[] doubleArray5 = quarterlyDouble1.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray5);
        double double8 = quarterlyDouble6.get((int) ' ');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-9999.9999d) + "'", double8 == (-9999.9999d));
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0363");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("", 1, (int) '#');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0364");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (short) -1, (int) '#');
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0365");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("\t\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0366");
        double[] doubleArray0 = new double[] {};
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble2 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble3 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double[] doubleArray5 = quarterlyDouble4.dArr;
        double double6 = quarterlyDouble4.getTtm();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = quarterlyDouble4.getMostRecent();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
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
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0367");
        java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) '4', 10);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0368");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, 0, (int) (byte) 10);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0369");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, 0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass4 = strList3.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0370");
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
        java.lang.Class<?> wildcardClass21 = quarterlyDouble4.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0371");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) 'a', 1);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0372");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, 10, (int) (byte) 100);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0373");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum4 = null;
        java.util.List<java.lang.String> strList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.get((int) 'a', (int) ' ', snpEnum2, dowEnum3, exchEnum4, (double) (byte) 0, (long) 10);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0374");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%)", (int) (short) 10, 1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0375");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getPrevTtm();
        double double7 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray8 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray8);
        double double10 = quarterlyDouble9.getTtm();
        double double11 = quarterlyDouble9.getTtm();
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
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0376");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum4 = null;
        java.util.List<java.lang.String> strList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.get((int) (short) -1, (int) (short) 100, snpEnum2, dowEnum3, exchEnum4, (double) (-1L), (long) (short) 1);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0377");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = quarterlyDouble4.fmtGrowth1Q("");
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
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0378");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!", (int) (byte) 100, (int) '#');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0379");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getCompanySummary((int) '#', (int) (byte) 10);
        java.lang.Class<?> wildcardClass3 = companySummaryList2.getClass();
        org.junit.Assert.assertNotNull(companySummaryList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0380");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (short) -1, 10);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0381");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) (byte) 0, 10);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0382");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (byte) -1, (int) '4');
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0383");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) '#', (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList(strList3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3, (int) (short) 100, (int) (byte) -1);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(manyCompanyDataList4);
        org.junit.Assert.assertNotNull(companyDataList7);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0384");
        double[] doubleArray0 = new double[] {};
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        java.lang.String str2 = quarterlyDouble1.toString();
        java.lang.Class<?> wildcardClass3 = quarterlyDouble1.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0385");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(snpEnum0, 0, (int) '4');
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0386");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double double8 = quarterlyDouble4.get2QTtm();
        java.lang.String str9 = quarterlyDouble4.toString();
        double double10 = quarterlyDouble4.getQseqQ();
        double double11 = quarterlyDouble4.getTtm();
        double double12 = quarterlyDouble4.getTtm();
        double double13 = quarterlyDouble4.getPrevTtm();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000" + "'", str9, "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 200.0d + "'", double10 == 200.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0387");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (byte) 0, (int) 'a');
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0388");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double double6 = quarterlyDouble4.getTtmAvg();
        double double8 = quarterlyDouble4.get((int) 'a');
        double[] doubleArray9 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray9);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = quarterlyDouble10.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
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
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0389");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double[] doubleArray8 = quarterlyDouble4.dArr;
        double double9 = quarterlyDouble4.getTtmAvg();
        double double10 = quarterlyDouble4.getMostRecent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = quarterlyDouble4.fmtGrowth1Q("hi!");
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
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0390");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.get2QTtm();
        java.lang.String str4 = quarterlyDouble1.toString();
        double double7 = quarterlyDouble1.deltaQ((int) (byte) 100, 0);
        double double8 = quarterlyDouble1.getQoQ();
        double double9 = quarterlyDouble1.getPrevTtm();
        java.lang.String str11 = quarterlyDouble1.fmtGrowth1Q("\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        double double12 = quarterlyDouble1.getMostRecent();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000" + "'", str4, "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\t\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str11, "\t\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0391");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getPrevTtm();
        double double7 = quarterlyDouble4.getTtmAvg();
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
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000" + "'", str8, "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0392");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(snpEnum0, (int) ' ', 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3, (int) (byte) 0, (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList9 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3, (int) 'a', (int) (byte) 1);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(companyDataList6);
        org.junit.Assert.assertNotNull(companyDataList9);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0393");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = quarterlyDouble1.fmtGrowth4Q("");
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
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0394");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write(10, (int) '4');
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0395");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (-1), (int) (byte) 100);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0396");
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
        java.lang.Class<?> wildcardClass59 = doubleArray58.getClass();
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
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0397");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getMostRecent();
        double double8 = quarterlyDouble4.deltaQ((int) 'a', (int) (short) 10);
        double double9 = quarterlyDouble4.getTtm();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = quarterlyDouble4.fmtGrowth4Q("\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
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
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0398");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getPrevTtm();
        double double7 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray8 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray8);
        double double10 = quarterlyDouble9.getQseqQ();
        double double11 = quarterlyDouble9.getTtm();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 200.0d + "'", double10 == 200.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0399");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getPrevTtm();
        double double7 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray8 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray8);
        double double12 = quarterlyDouble9.deltaQ((int) ' ', (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = quarterlyDouble9.getQoQ();
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
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0400");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getMostRecent();
        double double6 = quarterlyDouble4.getTtm();
        double[] doubleArray7 = quarterlyDouble4.dArr;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = quarterlyDouble4.fmtGrowth4Q("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[100.0, 1.0, -1.0]");
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0401");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, 100, (int) ' ');
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0402");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(snpEnum0, 10, (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(companyDataList4);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0403");
        java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) (short) -1, (int) (byte) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList3 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(manyCompanyDataList3);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0404");
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
            double double26 = quarterlyDouble4.getQoQ();
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
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0405");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double4 = quarterlyDouble1.deltaQ(100, (int) (short) 10);
        double double5 = quarterlyDouble1.getTtm();
        double double6 = quarterlyDouble1.getMostRecent();
        double double7 = quarterlyDouble1.getQseqQ();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0406");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getCompanySummary((int) (short) 100, (int) (short) 100);
        org.junit.Assert.assertNotNull(companySummaryList2);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0407");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum4 = null;
        java.util.List<java.lang.String> strList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.get((int) (short) -1, (int) (short) 1, snpEnum2, dowEnum3, exchEnum4, (double) 0, (long) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList8 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList7);
        java.lang.Class<?> wildcardClass9 = strList7.getClass();
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(companyDataList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0408");
        double[] doubleArray0 = new double[] {};
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double4 = quarterlyDouble1.deltaQ((int) (short) 10, (int) 'a');
        double double6 = quarterlyDouble1.get(100);
        double double7 = quarterlyDouble1.getTtmAvg();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = quarterlyDouble1.fmtGrowth1Q("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
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
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0409");
        java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) '4', (int) (short) 100);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0410");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000", 1, 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0411");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (-1), (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList(strList3);
        java.lang.Class<?> wildcardClass5 = manyCompanyDataList4.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(manyCompanyDataList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0412");
        double[] doubleArray0 = new double[] {};
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double4 = quarterlyDouble1.deltaQ((int) (short) 10, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            double double5 = quarterlyDouble1.getQseqQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0413");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) '#', (int) (short) 1);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0414");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        java.lang.String str3 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData7 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList4, (int) 'a', (int) (byte) 10);
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(fieldDataList4);
        org.junit.Assert.assertNull(fieldData7);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0415");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!", 0, (int) ' ');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0416");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double double8 = quarterlyDouble4.get2QTtm();
        double double9 = quarterlyDouble4.getTtmAvg();
        double double10 = quarterlyDouble4.getMostRecent();
        double double12 = quarterlyDouble4.get((int) ' ');
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-9999.9999d) + "'", double12 == (-9999.9999d));
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0417");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (byte) 10, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList(strList3);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(manyCompanyDataList4);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0418");
        java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) (byte) 100, (int) (byte) 0);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0419");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (byte) 100, (int) (byte) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3, (int) (short) 0, (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3);
        java.lang.Class<?> wildcardClass8 = strList3.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(companyDataList6);
        org.junit.Assert.assertNotNull(companyDataList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0420");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)", (-1), (int) 'a');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0421");
        java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(100, (int) 'a');
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0422");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write(1, (int) (short) 10);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0423");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getPrevTtm();
        double double7 = quarterlyDouble4.getTtmAvg();
        java.lang.String str8 = quarterlyDouble4.toString();
        java.lang.Class<?> wildcardClass9 = quarterlyDouble4.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000" + "'", str8, "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0424");
        double[] doubleArray0 = new double[] {};
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble2 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble3 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = quarterlyDouble5.getMostRecent();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0425");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double[] doubleArray5 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray5);
        double double7 = quarterlyDouble6.getTtmAvg();
        double[] doubleArray8 = new double[] {};
        quarterlyDouble6.dArr = doubleArray8;
        quarterlyDouble1.dArr = doubleArray8;
        double[] doubleArray11 = quarterlyDouble1.dArr;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = quarterlyDouble1.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[]");
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0426");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(snpEnum0, (int) (byte) 0, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3, (int) (short) 0, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList7 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList(strList3);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(companyDataList6);
        org.junit.Assert.assertNotNull(manyCompanyDataList7);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0427");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData5 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList2, (int) (short) 100, (int) (short) 1);
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNull(fieldData5);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0428");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (short) 0, (int) (short) 1);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0429");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)", (int) '4', 10);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0430");
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
        // The following exception was thrown during execution in test generation
        try {
            double double14 = quarterlyDouble12.getQoQ();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0431");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000", (int) (short) -1, (int) (short) 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0432");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.getTtm();
        java.lang.String str5 = quarterlyDouble1.fmtGrowth1Q("\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        double double6 = quarterlyDouble1.get2QTtm();
        double double7 = quarterlyDouble1.getTtm();
        double double8 = quarterlyDouble1.getMostRecent();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str5, "\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0433");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) '#', 1);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0434");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getCompanySummary((int) (byte) 0, (int) (short) 10);
        org.junit.Assert.assertNotNull(companySummaryList2);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0435");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) '4', (int) (byte) 0);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0436");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.get2QTtm();
        java.lang.String str4 = quarterlyDouble1.toString();
        double double5 = quarterlyDouble1.getTtmAvg();
        java.lang.String str7 = quarterlyDouble1.fmtGrowth4Q("");
        double double8 = quarterlyDouble1.getQoQ();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000" + "'", str4, "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str7, "\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0437");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (byte) 100, (int) (byte) 0);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0438");
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
        double double12 = quarterlyDouble1.getQoQ();
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
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0439");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double double7 = quarterlyDouble4.get(10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = quarterlyDouble4.fmtGrowth4Q("\t\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9999.9999d) + "'", double7 == (-9999.9999d));
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0440");
        java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers((int) '#', (int) (short) 10);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0441");
        java.util.List<java.lang.String> strList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList0, (int) (byte) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0442");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double[] doubleArray8 = quarterlyDouble4.dArr;
        double[] doubleArray9 = new double[] {};
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray9);
        quarterlyDouble4.dArr = doubleArray9;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = quarterlyDouble4.getMostRecent();
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
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0443");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double double6 = quarterlyDouble4.getTtmAvg();
        double double8 = quarterlyDouble4.get((int) 'a');
        double[] doubleArray9 = quarterlyDouble4.dArr;
        double double10 = quarterlyDouble4.get2QTtm();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = quarterlyDouble4.fmtGrowth4Q("\t\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
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
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0444");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double[] doubleArray8 = quarterlyDouble4.dArr;
        double[] doubleArray12 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray12);
        quarterlyDouble4.dArr = doubleArray12;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = quarterlyDouble4.fmtGrowth4Q("hi!");
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
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0445");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double[] doubleArray8 = quarterlyDouble4.dArr;
        double[] doubleArray12 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray12);
        quarterlyDouble4.dArr = doubleArray12;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, 1.0, -1.0]");
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0446");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("\t\t\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)", 10, (int) '4');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0447");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str41 = quarterlyDouble4.fmtGrowth4Q("\t\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
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
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0448");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData> oneCompanyDataList1 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getCompany("\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
        org.junit.Assert.assertNotNull(oneCompanyDataList1);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0449");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray6 = new double[] {};
        quarterlyDouble4.dArr = doubleArray6;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = quarterlyDouble4.fmtGrowth1Q("\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
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
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0450");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, 100, (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3, (int) ' ', (int) '4');
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(companyDataList6);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0451");
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
        double double14 = quarterlyDouble13.getPrevTtm();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0452");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double[] doubleArray6 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray6);
        double double8 = quarterlyDouble7.getTtm();
        double double10 = quarterlyDouble7.get((int) (byte) 1);
        double[] doubleArray11 = quarterlyDouble7.dArr;
        quarterlyDouble1.dArr = doubleArray11;
        double double13 = quarterlyDouble1.getPrevTtm();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0453");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.get2QTtm();
        double double4 = quarterlyDouble1.getMostRecent();
        double[] doubleArray5 = quarterlyDouble1.dArr;
        double double6 = quarterlyDouble1.getTtmAvg();
        double double7 = quarterlyDouble1.getPrevTtm();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0454");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(snpEnum0, (int) (byte) 0, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList(strList3);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(manyCompanyDataList4);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0455");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) '#', (int) 'a');
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0456");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray6 = new double[] {};
        quarterlyDouble4.dArr = doubleArray6;
        java.lang.String str8 = quarterlyDouble4.toString();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0457");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(snpEnum0, 0, (int) (byte) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList(strList3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList5 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(manyCompanyDataList4);
        org.junit.Assert.assertNotNull(companyDataList5);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0458");
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
        java.lang.Class<?> wildcardClass12 = quarterlyDouble1.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000" + "'", str4, "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0459");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getCompanySummary((int) '#', 100);
        org.junit.Assert.assertNotNull(companySummaryList2);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0460");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData> oneCompanyDataList1 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getCompany("\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertNotNull(oneCompanyDataList1);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0461");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getPrevTtm();
        double double7 = quarterlyDouble4.getTtmAvg();
        double double8 = quarterlyDouble4.getTtm();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0462");
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
        // The following exception was thrown during execution in test generation
        try {
            double double29 = quarterlyDouble1.getQseqQ();
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
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0463");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000", (int) (byte) -1, (int) (byte) 10);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0464");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getPrevTtm();
        double double7 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray8 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray8);
        double double12 = quarterlyDouble9.deltaQ((int) (byte) 100, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = quarterlyDouble9.getQoQ();
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
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0465");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%)", 0, 10);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0466");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(snpEnum0, (int) '#', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList(strList3);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(manyCompanyDataList4);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0467");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.getTtm();
        java.lang.String str5 = quarterlyDouble1.fmtGrowth1Q("\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        double double7 = quarterlyDouble1.get(100);
        double double9 = quarterlyDouble1.get((int) (short) 1);
        java.lang.Class<?> wildcardClass10 = quarterlyDouble1.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str5, "\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9999.9999d) + "'", double7 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0468");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double[] doubleArray8 = quarterlyDouble4.dArr;
        double[] doubleArray9 = new double[] {};
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray9);
        quarterlyDouble4.dArr = doubleArray9;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray9);
        double double13 = quarterlyDouble12.getTtmAvg();
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
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0469");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) '#', (-1));
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0470");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getCompanySummary(100, (int) (byte) 0);
        org.junit.Assert.assertNotNull(companySummaryList2);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0471");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData> oneCompanyDataList1 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getCompany("\t\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertNotNull(oneCompanyDataList1);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0472");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (byte) 0, 10);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0473");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) 'a', 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList(strList3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3, (int) '#', 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList8 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(manyCompanyDataList4);
        org.junit.Assert.assertNotNull(companyDataList7);
        org.junit.Assert.assertNotNull(companyDataList8);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0474");
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
        double double26 = quarterlyDouble4.getPrevTtm();
        double[] doubleArray30 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble31 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray30);
        double double32 = quarterlyDouble31.getTtm();
        double double34 = quarterlyDouble31.get((int) (byte) 1);
        double double35 = quarterlyDouble31.get2QTtm();
        java.lang.String str36 = quarterlyDouble31.toString();
        double[] doubleArray40 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble41 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray40);
        double double42 = quarterlyDouble41.getTtm();
        double double44 = quarterlyDouble41.get((int) (byte) 1);
        double[] doubleArray45 = quarterlyDouble41.dArr;
        double double46 = quarterlyDouble41.getTtmAvg();
        double[] doubleArray50 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble51 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray50);
        double double52 = quarterlyDouble51.getTtmAvg();
        double[] doubleArray53 = new double[] {};
        quarterlyDouble51.dArr = doubleArray53;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble55 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray53);
        quarterlyDouble41.dArr = doubleArray53;
        quarterlyDouble31.dArr = doubleArray53;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble58 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray53);
        quarterlyDouble4.dArr = doubleArray53;
        // The following exception was thrown during execution in test generation
        try {
            double double60 = quarterlyDouble4.getQseqQ();
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
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000" + "'", str25, "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 1.0d + "'", double34 == 1.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000" + "'", str36, "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 1.0d + "'", double44 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[]");
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0475");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getPrevTtm();
        double double7 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray8 = quarterlyDouble4.dArr;
        double double9 = quarterlyDouble4.get2QTtm();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = quarterlyDouble4.getQoQ();
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0476");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.getTtm();
        java.lang.String str5 = quarterlyDouble1.fmtGrowth1Q("\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        double double6 = quarterlyDouble1.getTtmAvg();
        double double7 = quarterlyDouble1.getQoQ();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str5, "\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0477");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("\t\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)", (int) (short) -1, (int) (short) 100);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0478");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (byte) -1, (int) ' ');
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0479");
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
        double double15 = quarterlyDouble4.get(1);
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0480");
        java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(0, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(companyDataList3);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0481");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(snpEnum0, 10, (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3, (int) '4', (int) (byte) 0);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(companyDataList6);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0482");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) '4', 10);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0483");
        java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr(100, (int) '#');
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0484");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, 1, (int) (byte) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3, 10, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList10 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3, (int) (short) -1, (int) (short) -1);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(companyDataList6);
        org.junit.Assert.assertNotNull(companyDataList7);
        org.junit.Assert.assertNotNull(companyDataList10);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0485");
        java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) ' ', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList5 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList2, (int) (byte) 1, (int) (short) 10);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(companyDataList5);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0486");
        java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) (byte) 100, (int) (byte) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList3 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(manyCompanyDataList3);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0487");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (-1), 1);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0488");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) 'a', 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3, (int) (short) 0, 0);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(companyDataList4);
        org.junit.Assert.assertNotNull(companyDataList7);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0489");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("\t\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0490");
        double[] doubleArray0 = new double[] {};
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble2 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble3 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = quarterlyDouble4.fmtGrowth1Q("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0491");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) '#', (int) ' ');
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0492");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double double8 = quarterlyDouble4.getMostRecent();
        double double9 = quarterlyDouble4.get2QTtm();
        double double10 = quarterlyDouble4.getQseqQ();
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
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 200.0d + "'", double10 == 200.0d);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0493");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (-1), (int) (short) 10);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0494");
        double[] doubleArray0 = new double[] {};
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble2 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = quarterlyDouble2.fmtGrowth4Q("\t\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0495");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (short) -1, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList(strList3);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(manyCompanyDataList4);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0496");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("\t\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)", (-1), 10);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0497");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!", (int) ' ', (int) (short) 100);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0498");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getMostRecent();
        double double8 = quarterlyDouble4.deltaQ((int) 'a', (int) (short) 10);
        double double9 = quarterlyDouble4.getTtm();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = quarterlyDouble4.fmtGrowth1Q("\t\t\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
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
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0499");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000", (int) 'a', (int) (byte) 10);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests0.test0500");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum4 = null;
        java.util.List<java.lang.String> strList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.get((int) (short) 0, 10, snpEnum2, dowEnum3, exchEnum4, (double) (short) 1, (long) 0);
        org.junit.Assert.assertNotNull(strList7);
    }
}

