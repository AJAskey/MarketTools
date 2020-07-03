package net.ajaskey.market.tools.SIP.BigDB.derived;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DerivedTests0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0001");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData2 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        java.lang.Class<?> wildcardClass3 = companyDerivedData2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0002");
        double double0 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.MILLION;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 1000000.0d + "'", double0 == 1000000.0d);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0003");
        double double0 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.getMillion();
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 1000000.0d + "'", double0 == 1000000.0d);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0004");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.write(0, (-1));
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0005");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.write((-1), (int) (byte) -1);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0006");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.loadDb((int) (byte) 0, 100, filetypeEnum2);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0007");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getAcctPayableQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getNonrecurringItemsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0008");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getAcctRxQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0009");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) (short) -1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getTanAssetsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0010");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getGrossOpIncQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0011");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getEquityQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0012");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getTotalLiabQdata();
        java.lang.Class<?> wildcardClass6 = companyDerived3.getClass();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0013");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) (byte) 10, (int) (byte) -1, fieldData2);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0014");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.write(0, (int) (short) 0);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0015");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived7 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("hi!", (int) (byte) -1, (int) ' ');
        java.util.List<java.lang.String> strList8 = indexDerived7.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData11 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        companyDerivedData11.year = 1;
        int int14 = companyDerivedData11.year;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData17 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData20 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((int) (short) 0, 0);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData23 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData26 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        companyDerivedData26.year = 1;
        int int29 = companyDerivedData26.year;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList30 = companyDerivedData26.dList;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData33 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        companyDerivedData33.year = 1;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList36 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.getAgList();
        companyDerivedData33.dList = companyDerivedList36;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData[] companyDerivedDataArray38 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData[] { companyDerivedData11, companyDerivedData17, companyDerivedData20, companyDerivedData23, companyDerivedData26, companyDerivedData33 };
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData> companyDerivedDataList39 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData>) companyDerivedDataList39, companyDerivedDataArray38);
        indexDerived7.idList = companyDerivedDataList39;
        java.util.List<java.lang.String> strList42 = indexDerived7.indexList;
        indexDerived3.indexList = strList42;
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(companyDerivedList30);
        org.junit.Assert.assertNotNull(companyDerivedList36);
        org.junit.Assert.assertNotNull(companyDerivedDataArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(strList42);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0016");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.write(0, 10);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0017");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getIncAfterTaxQdata();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = quarterlyDouble5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0018");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        java.util.List<java.lang.String> strList4 = indexDerived3.indexList;
        indexDerived3.valid = true;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData> companyDerivedDataList7 = indexDerived3.idList;
        indexDerived3.writeList("hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNull(companyDerivedDataList7);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0019");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        int int5 = companyDerived3.getQuarter();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getGrossOpIncQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0020");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getWorkingCapitalQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0021");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived3.writeList("");
        java.util.List<java.lang.String> strList6 = indexDerived3.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived10 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived10.writeList("");
        java.util.List<java.lang.String> strList13 = indexDerived10.indexList;
        indexDerived3.indexList = strList13;
        indexDerived3.readList("");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived20 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("hi!", (int) (byte) -1, (int) ' ');
        java.util.List<java.lang.String> strList21 = indexDerived20.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData24 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        companyDerivedData24.year = 1;
        int int27 = companyDerivedData24.year;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData30 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData33 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((int) (short) 0, 0);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData36 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData39 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        companyDerivedData39.year = 1;
        int int42 = companyDerivedData39.year;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList43 = companyDerivedData39.dList;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData46 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        companyDerivedData46.year = 1;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList49 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.getAgList();
        companyDerivedData46.dList = companyDerivedList49;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData[] companyDerivedDataArray51 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData[] { companyDerivedData24, companyDerivedData30, companyDerivedData33, companyDerivedData36, companyDerivedData39, companyDerivedData46 };
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData> companyDerivedDataList52 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData>) companyDerivedDataList52, companyDerivedDataArray51);
        indexDerived20.idList = companyDerivedDataList52;
        java.util.List<java.lang.String> strList55 = indexDerived20.indexList;
        indexDerived20.writeList("");
        java.util.List<java.lang.String> strList58 = indexDerived20.indexList;
        indexDerived3.addToList(strList58);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(companyDerivedList43);
        org.junit.Assert.assertNotNull(companyDerivedList49);
        org.junit.Assert.assertNotNull(companyDerivedDataArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(strList55);
        org.junit.Assert.assertNotNull(strList58);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0022");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        int int5 = companyDerived3.getQuarter();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getCogsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0023");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) (short) 100, 100, fieldData2);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0024");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getGrossOpIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getGrossOpIncQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0025");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("hi!", (int) (byte) -1, (int) ' ');
        java.util.List<java.lang.String> strList4 = indexDerived3.indexList;
        indexDerived3.valid = true;
        indexDerived3.valid = false;
        boolean boolean9 = indexDerived3.valid;
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0026");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getNetIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getOtherCurrLiabQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0027");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getStDebtQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0028");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData2 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData(0, (int) (byte) 0);
        int int3 = companyDerivedData2.year;
        int int4 = companyDerivedData2.year;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0029");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.write((int) '#', (int) '4');
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0030");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getCashFromFinQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getFcfQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0031");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getIncPrimaryEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getTanAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getLtInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getNetIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getOtherLtAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getOtherLtAssetsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0032");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived4 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("hi!", (int) (byte) -1, (int) ' ');
        java.util.List<java.lang.String> strList5 = indexDerived4.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived11 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived11.writeList("");
        java.util.List<java.lang.String> strList14 = indexDerived11.indexList;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList18, fieldDataArray17);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList20 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList14, 10, (int) (short) 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList18);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList21 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList5, 100, 0, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList18);
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived27 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived27.writeList("");
        java.util.List<java.lang.String> strList30 = indexDerived27.indexList;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray33 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList34 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList34, fieldDataArray33);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList36 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList30, 10, (int) (short) 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList34);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList37 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList5, (int) (byte) 0, 10, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList34);
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived40 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", strList5, (int) 'a', (int) (byte) 100);
        java.lang.Class<?> wildcardClass41 = indexDerived40.getClass();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(fieldDataArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(companyDerivedList20);
        org.junit.Assert.assertNotNull(companyDerivedList21);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(fieldDataArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(companyDerivedList36);
        org.junit.Assert.assertNotNull(companyDerivedList37);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0033");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getSalesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getStDebtQdata();
        int int10 = companyDerived3.getYear();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0034");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getTanAssetsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0035");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getIncPrimaryEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getTotalOpExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getNonrecurringItemsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getGrossIncQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0036");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData2 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList3 = companyDerivedData2.dList;
        companyDerivedData2.year = 35;
        org.junit.Assert.assertNotNull(companyDerivedList3);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0037");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.write((int) (short) 1, (int) (byte) -1);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0038");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getIntExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherIncQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0039");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.loadDb((int) (short) 100, (int) '#', filetypeEnum2);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0040");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        boolean boolean4 = companyDerived3.isValid();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getNetcashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getTotalOpExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getEpsContQdata();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0041");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getNetIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getNetcashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getStDebtQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0042");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.write(0, 1);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0043");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getInventoryQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0044");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.write(35, (int) (byte) 0);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0045");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getIncPrimaryEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getTotalOpExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getNonrecurringItemsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getSalesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getGoodwillQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0046");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getIncTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getCashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getCashFromFinQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getIntExpNonOpQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0047");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getIncPrimaryEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getTotalOpExpQdata();
        java.lang.Class<?> wildcardClass7 = companyDerived3.getClass();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0048");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getLtDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getIntTotQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0049");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        java.util.List<java.lang.String> strList4 = indexDerived3.indexList;
        indexDerived3.listName = "";
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived10 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived10.writeList("");
        java.util.List<java.lang.String> strList13 = indexDerived10.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived17 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived17.writeList("");
        java.util.List<java.lang.String> strList20 = indexDerived17.indexList;
        indexDerived10.indexList = strList20;
        indexDerived3.addToList(strList20);
        indexDerived3.readList("");
        boolean boolean25 = indexDerived3.valid;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData> companyDerivedDataList26 = indexDerived3.idList;
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(companyDerivedDataList26);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0050");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getEquityQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0051");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getNetcashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getNonrecurringItemsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getCurrLiabQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0052");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getRdQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getCashflowQdata();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = quarterlyDouble8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0053");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.loadDb(1, (int) (byte) 10, filetypeEnum2);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0054");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getAcctPayableQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getLiabEquityQdata();
        boolean boolean9 = companyDerived3.isValid();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0055");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived3.writeList("");
        java.util.List<java.lang.String> strList6 = indexDerived3.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived12 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("hi!", (int) (byte) -1, (int) ' ');
        java.util.List<java.lang.String> strList13 = indexDerived12.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived19 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived19.writeList("");
        java.util.List<java.lang.String> strList22 = indexDerived19.indexList;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray25 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList26 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList26, fieldDataArray25);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList28 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList22, 10, (int) (short) 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList26);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList29 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList13, 100, 0, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList26);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList30 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList6, (int) (byte) 1, (int) (short) 0, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList26);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList33 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList34 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList6, (int) (byte) 100, (int) (byte) 1, fieldDataList33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(fieldDataArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(companyDerivedList28);
        org.junit.Assert.assertNotNull(companyDerivedList29);
        org.junit.Assert.assertNotNull(companyDerivedList30);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0056");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.loadDb(0, 10, filetypeEnum2);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0057");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("hi!", (int) (byte) -1, (int) ' ');
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived7 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("hi!", (int) (byte) -1, (int) ' ');
        java.util.List<java.lang.String> strList8 = indexDerived7.indexList;
        indexDerived3.indexList = strList8;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived13 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("hi!", (int) (byte) 10, (int) (short) 1);
        java.util.List<java.lang.String> strList14 = indexDerived13.indexList;
        indexDerived3.indexList = strList14;
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0058");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getIncPrimaryEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getIntExpNonOpQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0059");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getAcctPayableQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getLiabEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getTotalLiabQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0060");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getPeQdata();
        int int9 = companyDerived3.getQuarter();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0061");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.write((int) (byte) -1, 0);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0062");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getSharesQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0063");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("hi!", (int) (byte) -1, (int) ' ');
        java.util.List<java.lang.String> strList4 = indexDerived3.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData7 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        companyDerivedData7.year = 1;
        int int10 = companyDerivedData7.year;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData13 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData16 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((int) (short) 0, 0);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData19 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData22 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        companyDerivedData22.year = 1;
        int int25 = companyDerivedData22.year;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList26 = companyDerivedData22.dList;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData29 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        companyDerivedData29.year = 1;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList32 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.getAgList();
        companyDerivedData29.dList = companyDerivedList32;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData[] companyDerivedDataArray34 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData[] { companyDerivedData7, companyDerivedData13, companyDerivedData16, companyDerivedData19, companyDerivedData22, companyDerivedData29 };
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData> companyDerivedDataList35 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData>) companyDerivedDataList35, companyDerivedDataArray34);
        indexDerived3.idList = companyDerivedDataList35;
        java.util.List<java.lang.String> strList38 = indexDerived3.indexList;
        indexDerived3.writeList("");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived44 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("hi!", (int) (byte) -1, (int) ' ');
        java.util.List<java.lang.String> strList45 = indexDerived44.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived51 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived51.writeList("");
        java.util.List<java.lang.String> strList54 = indexDerived51.indexList;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray57 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList58 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList58, fieldDataArray57);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList60 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList54, 10, (int) (short) 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList58);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList61 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList45, 100, 0, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList58);
        indexDerived3.addToList(strList45);
        java.lang.Class<?> wildcardClass63 = strList45.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(companyDerivedList26);
        org.junit.Assert.assertNotNull(companyDerivedList32);
        org.junit.Assert.assertNotNull(companyDerivedDataArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(strList38);
        org.junit.Assert.assertNotNull(strList45);
        org.junit.Assert.assertNotNull(strList54);
        org.junit.Assert.assertNotNull(fieldDataArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(companyDerivedList60);
        org.junit.Assert.assertNotNull(companyDerivedList61);
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0064");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("hi!", (int) (byte) -1, (int) ' ');
        java.util.List<java.lang.String> strList4 = indexDerived3.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData7 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        companyDerivedData7.year = 1;
        int int10 = companyDerivedData7.year;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData13 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData16 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((int) (short) 0, 0);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData19 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData22 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        companyDerivedData22.year = 1;
        int int25 = companyDerivedData22.year;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList26 = companyDerivedData22.dList;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData29 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        companyDerivedData29.year = 1;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList32 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.getAgList();
        companyDerivedData29.dList = companyDerivedList32;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData[] companyDerivedDataArray34 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData[] { companyDerivedData7, companyDerivedData13, companyDerivedData16, companyDerivedData19, companyDerivedData22, companyDerivedData29 };
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData> companyDerivedDataList35 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData>) companyDerivedDataList35, companyDerivedDataArray34);
        indexDerived3.idList = companyDerivedDataList35;
        java.util.List<java.lang.String> strList38 = indexDerived3.indexList;
        indexDerived3.writeList("");
        indexDerived3.writeList("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(companyDerivedList26);
        org.junit.Assert.assertNotNull(companyDerivedList32);
        org.junit.Assert.assertNotNull(companyDerivedDataArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(strList38);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0065");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getGrossIncQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0066");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getPeQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getIntExpNonOpQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0067");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getLiabEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getWcfcfQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0068");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getDividendQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getGrossOpIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getOtherLtLiabQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0069");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getIncTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getCashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getGrossIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getNetFixedAssetsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0070");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getFcfQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0071");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.write((int) (short) 0, (-1));
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0072");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getAcctPayableQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getIntExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getFcfQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0073");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherCurrLiabQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0074");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getStInvestQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0075");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getCurrentRatioQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getAdjToIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getDivCostQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getIntExpNonOpQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0076");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.loadDb((int) 'a', (int) (byte) -1, filetypeEnum2);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0077");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getIntExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getAcctPayableQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0078");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData2 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData(100, (int) '#');
        java.lang.Class<?> wildcardClass3 = companyDerivedData2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0079");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getAcctPayableQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getLiabEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getCashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getCashFromFinQdata();
        boolean boolean12 = companyDerived3.isValid();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0080");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getRdQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getIncPrimaryEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getCashFromFinQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getOtherLtAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getCashFromOpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getIncTaxQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
        org.junit.Assert.assertNull(quarterlyDouble12);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0081");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", (int) '#', 1);
        java.util.List<java.lang.String> strList4 = null;
        indexDerived3.indexList = strList4;
        indexDerived3.valid = true;
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0082");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("hi!", (int) (byte) 10, (int) (short) 1);
        java.util.List<java.lang.String> strList4 = indexDerived3.indexList;
        java.lang.Class<?> wildcardClass5 = strList4.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0083");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData2 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        companyDerivedData2.year = 1;
        int int5 = companyDerivedData2.year;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived9 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("hi!", (int) (byte) -1, (int) ' ');
        java.util.List<java.lang.String> strList10 = indexDerived9.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived16 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived16.writeList("");
        java.util.List<java.lang.String> strList19 = indexDerived16.indexList;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray22 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList23 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList23, fieldDataArray22);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList25 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList19, 10, (int) (short) 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList23);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList26 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList10, 100, 0, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList23);
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived32 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived32.writeList("");
        java.util.List<java.lang.String> strList35 = indexDerived32.indexList;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray38 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList39 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList39, fieldDataArray38);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList41 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList35, 10, (int) (short) 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList39);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList42 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList10, (int) (byte) 0, 10, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList39);
        companyDerivedData2.dList = companyDerivedList42;
        companyDerivedData2.year = (short) 100;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList46 = companyDerivedData2.dList;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(fieldDataArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(companyDerivedList25);
        org.junit.Assert.assertNotNull(companyDerivedList26);
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertNotNull(fieldDataArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(companyDerivedList41);
        org.junit.Assert.assertNotNull(companyDerivedList42);
        org.junit.Assert.assertNotNull(companyDerivedList46);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0084");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.loadDb((int) (byte) 1, 1, filetypeEnum2);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0085");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getIntExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getPreTaxIncQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0086");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getAcctPayableQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getLiabEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getCashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getLtInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getEpsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
        org.junit.Assert.assertNull(quarterlyDouble12);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0087");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getAdjToIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getAcctPayableQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0088");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        int int5 = companyDerived3.getQuarter();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getCogsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getCurrLiabQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0089");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getGrossOpIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getNetcashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getTotalLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getIntExpQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0090");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getStDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getLtInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getEpsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0091");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData2 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData(35, (int) 'a');
        companyDerivedData2.quarter = (byte) -1;
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0092");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getRdQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getCashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getNonrecurringItemsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0093");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData2 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        companyDerivedData2.year = 1;
        int int5 = companyDerivedData2.year;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived9 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("hi!", (int) (byte) -1, (int) ' ');
        java.util.List<java.lang.String> strList10 = indexDerived9.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived16 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived16.writeList("");
        java.util.List<java.lang.String> strList19 = indexDerived16.indexList;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray22 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList23 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList23, fieldDataArray22);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList25 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList19, 10, (int) (short) 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList23);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList26 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList10, 100, 0, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList23);
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived32 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived32.writeList("");
        java.util.List<java.lang.String> strList35 = indexDerived32.indexList;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray38 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList39 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList39, fieldDataArray38);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList41 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList35, 10, (int) (short) 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList39);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList42 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList10, (int) (byte) 0, 10, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList39);
        companyDerivedData2.dList = companyDerivedList42;
        companyDerivedData2.year = '4';
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList46 = null;
        companyDerivedData2.dList = companyDerivedList46;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(fieldDataArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(companyDerivedList25);
        org.junit.Assert.assertNotNull(companyDerivedList26);
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertNotNull(fieldDataArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(companyDerivedList41);
        org.junit.Assert.assertNotNull(companyDerivedList42);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0094");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getCogsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getTotalOpExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getTotalLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getPrefStockQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0095");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived3.writeList("");
        indexDerived3.valid = false;
        indexDerived3.writeList("");
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0096");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getIntExpQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0097");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getNetFixedAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getCashflowQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0098");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getTotalAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getDivCostQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0099");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.write((int) (short) 10, 35);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0100");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getSalesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getBvpsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0101");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.write((int) '#', (int) 'a');
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0102");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.write((int) (short) 1, 100);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0103");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getNetIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getNetcashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getPeQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getDividendQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0104");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getSalesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getStDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getCashFromFinQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getIncAfterTaxQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
        org.junit.Assert.assertNull(quarterlyDouble12);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0105");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        int int5 = companyDerived3.getQuarter();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getCogsQdata();
        int int7 = companyDerived3.getYear();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getOtherLtLiabQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0106");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherLtAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getOpMarginQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0107");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData2 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData(100, (int) '#');
        int int3 = companyDerivedData2.quarter;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList4 = companyDerivedData2.dList;
        int int5 = companyDerivedData2.year;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertNotNull(companyDerivedList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0108");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getRdQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getIncPrimaryEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getCashFromFinQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getPrefStockQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getEpsDilQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0109");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getRdQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getDivCostQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getCashFromInvQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getAcctPayableQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0110");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.write((int) (byte) 100, (int) (short) 10);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0111");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived3.writeList("");
        java.util.List<java.lang.String> strList6 = indexDerived3.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived10 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived10.writeList("");
        java.util.List<java.lang.String> strList13 = indexDerived10.indexList;
        indexDerived3.indexList = strList13;
        indexDerived3.readList("");
        java.util.List<java.lang.String> strList17 = indexDerived3.indexList;
        boolean boolean18 = indexDerived3.valid;
        java.lang.String str19 = indexDerived3.listName;
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0112");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getRdQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getBvpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getCashFromOpsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0113");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        boolean boolean4 = companyDerived3.isValid();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getNetFixedAssetsQdata();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0114");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getTotalAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getInventoryQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getStDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getFcfQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0115");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived4 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("hi!", (int) (byte) -1, (int) ' ');
        java.util.List<java.lang.String> strList5 = indexDerived4.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived11 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived11.writeList("");
        java.util.List<java.lang.String> strList14 = indexDerived11.indexList;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList18, fieldDataArray17);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList20 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList14, 10, (int) (short) 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList18);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList21 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList5, 100, 0, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList18);
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived27 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived27.writeList("");
        java.util.List<java.lang.String> strList30 = indexDerived27.indexList;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray33 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList34 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList34, fieldDataArray33);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList36 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList30, 10, (int) (short) 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList34);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList37 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList5, (int) (byte) 0, 10, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList34);
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived40 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", strList5, (int) 'a', (int) (byte) 100);
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived44 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("hi!", (int) (byte) -1, (int) ' ');
        java.util.List<java.lang.String> strList45 = indexDerived44.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData48 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        companyDerivedData48.year = 1;
        int int51 = companyDerivedData48.year;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData54 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData57 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((int) (short) 0, 0);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData60 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData63 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        companyDerivedData63.year = 1;
        int int66 = companyDerivedData63.year;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList67 = companyDerivedData63.dList;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData70 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        companyDerivedData70.year = 1;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList73 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.getAgList();
        companyDerivedData70.dList = companyDerivedList73;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData[] companyDerivedDataArray75 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData[] { companyDerivedData48, companyDerivedData54, companyDerivedData57, companyDerivedData60, companyDerivedData63, companyDerivedData70 };
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData> companyDerivedDataList76 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData>) companyDerivedDataList76, companyDerivedDataArray75);
        indexDerived44.idList = companyDerivedDataList76;
        indexDerived40.idList = companyDerivedDataList76;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived83 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", (int) (short) 10, (int) (short) 10);
        boolean boolean85 = indexDerived83.isInList("");
        java.util.List<java.lang.String> strList86 = indexDerived83.indexList;
        indexDerived40.indexList = strList86;
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(fieldDataArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(companyDerivedList20);
        org.junit.Assert.assertNotNull(companyDerivedList21);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(fieldDataArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(companyDerivedList36);
        org.junit.Assert.assertNotNull(companyDerivedList37);
        org.junit.Assert.assertNotNull(strList45);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertNotNull(companyDerivedList67);
        org.junit.Assert.assertNotNull(companyDerivedList73);
        org.junit.Assert.assertNotNull(companyDerivedDataArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(strList86);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0116");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getTotalLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getNonrecurringItemsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherLtAssetsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0117");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getSalesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getStDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getCashFromFinQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyDerived3.getGrossIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyDerived3.getCapExQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
        org.junit.Assert.assertNull(quarterlyDouble12);
        org.junit.Assert.assertNull(quarterlyDouble13);
        org.junit.Assert.assertNull(quarterlyDouble14);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0118");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", (int) (short) 10, (int) (short) 10);
        boolean boolean5 = indexDerived3.isInList("");
        indexDerived3.listName = "";
        indexDerived3.listName = "";
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0119");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("hi!", (int) (byte) 10, (int) (short) 1);
        java.util.List<java.lang.String> strList4 = indexDerived3.indexList;
        indexDerived3.writeList("hi!");
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0120");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getDividendQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getGrossOpIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getTotalAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getPrefStockQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getOtherLtAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getCashFromOpsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
        org.junit.Assert.assertNull(quarterlyDouble12);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0121");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", (int) (short) 10, (int) (short) 10);
        boolean boolean5 = indexDerived3.isInList("");
        indexDerived3.listName = "hi!";
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0122");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.loadDb(35, (int) (short) 0, filetypeEnum2);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0123");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getGrossOpIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getWorkingCapitalQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getOtherCurrAssetsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0124");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getIncPrimaryEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getTanAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getLtInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getNetIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getOtherLtAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getWorkingCapitalQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0125");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getLiabEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getOpMarginQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0126");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getTotalLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getNonrecurringItemsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getCogsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0127");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getAcctPayableQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getLiabEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getUnusualIncQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0128");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getTanAssetsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0129");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getRdQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getIncPrimaryEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getCashFromFinQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getStDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getCashFromOpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyDerived3.getLtDebtQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
        org.junit.Assert.assertNull(quarterlyDouble12);
        org.junit.Assert.assertNull(quarterlyDouble13);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0130");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getRdQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getIncPrimaryEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getIntExpNonOpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getPrefStockQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0131");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        int int5 = companyDerived3.getYear();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getRoeQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getNetIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getStDebtQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0132");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived8 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", (java.util.List<java.lang.String>) strList4, 1, (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData> companyDerivedDataList9 = indexDerived8.idList;
        boolean boolean10 = indexDerived8.valid;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(companyDerivedDataList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0133");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.write(100, (int) '#');
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0134");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        int int5 = companyDerived3.getQuarter();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getCogsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getEpsDilContQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0135");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getEpsContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getIncPrimaryEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getCapExQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getOtherLtAssetsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0136");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getCurrentRatioQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getLtDebtQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0137");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getNetIncQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0138");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 100, (int) (byte) -1);
        java.lang.String str4 = indexDerived3.listName;
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0139");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getEpsContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getNetIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getInventoryQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0140");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getPeQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getTanAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getWorkingCapitalQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getFcfQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
        org.junit.Assert.assertNull(quarterlyDouble12);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0141");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getGrossIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getCapExQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getGrossOpIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getGrossOpIncQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
        org.junit.Assert.assertNull(quarterlyDouble12);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0142");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) (short) -1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getAdjToIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherLtLiabQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0143");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getGrossOpIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getIntExpNonOpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getCurrentRatioQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0144");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOpMarginQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0145");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", (int) (short) 10, (int) (short) 10);
        indexDerived3.listName = "";
        indexDerived3.readList("");
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0146");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        java.util.List<java.lang.String> strList4 = indexDerived3.indexList;
        indexDerived3.listName = "";
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived10 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived10.writeList("");
        java.util.List<java.lang.String> strList13 = indexDerived10.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived17 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived17.writeList("");
        java.util.List<java.lang.String> strList20 = indexDerived17.indexList;
        indexDerived10.indexList = strList20;
        indexDerived3.addToList(strList20);
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived26 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived26.writeList("");
        java.util.List<java.lang.String> strList29 = indexDerived26.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived33 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived33.writeList("");
        java.util.List<java.lang.String> strList36 = indexDerived33.indexList;
        indexDerived26.indexList = strList36;
        indexDerived3.addToList(strList36);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData> companyDerivedDataList39 = indexDerived3.idList;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData> companyDerivedDataList40 = indexDerived3.idList;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass41 = companyDerivedDataList40.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNull(companyDerivedDataList39);
        org.junit.Assert.assertNull(companyDerivedDataList40);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0147");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPeQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getStInvestQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0148");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getIncTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getStInvestQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0149");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        int int5 = companyDerived3.getYear();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getRoeQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getGrossOpIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getCashFromFinQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0150");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.write((int) (short) 100, (int) (short) 1);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0151");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getNonrecurringItemsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getTotalAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getIntExpNonOpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getPeQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0152");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData2 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((int) (short) 100, (int) '4');
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0153");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getAcctPayableQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getBvpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getNetFixedAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getIntExpQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0154");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getCogsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getTotalOpExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getTotalLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getGrossIncQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0155");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getDividendQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getTotalOpExpQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0156");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        boolean boolean4 = companyDerived3.isValid();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getNetcashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getTotalOpExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getSalesQdata();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0157");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData2 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData(35, (int) '4');
        companyDerivedData2.quarter = (byte) 100;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived8 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("hi!", (int) (byte) -1, (int) ' ');
        java.util.List<java.lang.String> strList9 = indexDerived8.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived15 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived15.writeList("");
        java.util.List<java.lang.String> strList18 = indexDerived15.indexList;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray21 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList22, fieldDataArray21);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList24 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList18, 10, (int) (short) 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList22);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList25 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList9, 100, 0, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList22);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray28 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList29 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList29, fieldDataArray28);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList31 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList9, (int) (byte) -1, (int) (byte) 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList29);
        companyDerivedData2.dList = companyDerivedList31;
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(fieldDataArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(companyDerivedList24);
        org.junit.Assert.assertNotNull(companyDerivedList25);
        org.junit.Assert.assertNotNull(fieldDataArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(companyDerivedList31);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0158");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getRdQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getIncPrimaryEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getCashFromFinQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getStDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getOpMarginQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
        org.junit.Assert.assertNull(quarterlyDouble12);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0159");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", (int) '#', 100);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0160");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.write((int) (short) 100, (int) (byte) -1);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0161");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getIncPrimaryEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getTanAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getLtInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getStInvestQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0162");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", (int) '#', 1);
        java.lang.String str4 = indexDerived3.listName;
        indexDerived3.writeList("hi!");
        boolean boolean8 = indexDerived3.isInList("hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0163");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.write((int) 'a', (int) (short) 1);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0164");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        boolean boolean4 = companyDerived3.isValid();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getCashFromFinQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getSalesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getLiabEquityQdata();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0165");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getCogsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getTotalOpExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getPrefStockQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getPreTaxIncQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0166");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived3.writeList("");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived9 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        java.util.List<java.lang.String> strList10 = indexDerived9.indexList;
        indexDerived9.listName = "";
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived16 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived16.writeList("");
        java.util.List<java.lang.String> strList19 = indexDerived16.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived23 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived23.writeList("");
        java.util.List<java.lang.String> strList26 = indexDerived23.indexList;
        indexDerived16.indexList = strList26;
        indexDerived9.addToList(strList26);
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived32 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived32.writeList("");
        java.util.List<java.lang.String> strList35 = indexDerived32.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived39 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived39.writeList("");
        java.util.List<java.lang.String> strList42 = indexDerived39.indexList;
        indexDerived32.indexList = strList42;
        indexDerived9.addToList(strList42);
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived48 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived48.writeList("");
        java.util.List<java.lang.String> strList51 = indexDerived48.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived55 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived55.writeList("");
        java.util.List<java.lang.String> strList58 = indexDerived55.indexList;
        indexDerived48.indexList = strList58;
        indexDerived48.readList("");
        java.util.List<java.lang.String> strList62 = indexDerived48.indexList;
        indexDerived9.indexList = strList62;
        indexDerived3.indexList = strList62;
        java.lang.Class<?> wildcardClass65 = strList62.getClass();
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertNotNull(strList51);
        org.junit.Assert.assertNotNull(strList58);
        org.junit.Assert.assertNotNull(strList62);
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0167");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        int int5 = companyDerived3.getYear();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getRoeQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getNetIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getNetcashflowQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0168");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getAcctPayableQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getLiabEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getCashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getIntExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getCashFromInvQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
        org.junit.Assert.assertNull(quarterlyDouble12);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0169");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getTotalLiabQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0170");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getTotalAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getLtInvestQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0171");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getIntExpQdata();
        int int9 = companyDerived3.getQuarter();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0172");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getTotalAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getInventoryQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getOtherLtAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getNetFixedAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyDerived3.getTotalLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyDerived3.getCurrLiabQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
        org.junit.Assert.assertNull(quarterlyDouble12);
        org.junit.Assert.assertNull(quarterlyDouble13);
        org.junit.Assert.assertNull(quarterlyDouble14);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0173");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        int int5 = companyDerived3.getQuarter();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getIncTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getLtDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getLtDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getDividendQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0174");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getEpsContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getWorkingCapitalQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyDerived3.getIntExpNonOpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyDerived3.getIntExpQdata();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = quarterlyDouble14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
        org.junit.Assert.assertNull(quarterlyDouble12);
        org.junit.Assert.assertNull(quarterlyDouble13);
        org.junit.Assert.assertNull(quarterlyDouble14);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0175");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getCurrentRatioQdata();
        java.lang.Class<?> wildcardClass7 = companyDerived3.getClass();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0176");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getNetFixedAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getIncAfterTaxQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0177");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.loadDb((int) (byte) -1, (int) (short) 1, filetypeEnum2);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0178");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getSalesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getCashflowQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0179");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("hi!", 0, 100);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0180");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getNetIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getNetcashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getOtherIncQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0181");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getLiabEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getTotalOpExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getWcfcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getAcctRxQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0182");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getPeQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getRoeQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0183");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        boolean boolean4 = companyDerived3.isValid();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getCashFromFinQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getSalesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getIntExpQdata();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0184");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getRdQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getIncPrimaryEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getCashFromFinQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getStDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getGrossOpIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyDerived3.getIncTaxQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
        org.junit.Assert.assertNull(quarterlyDouble12);
        org.junit.Assert.assertNull(quarterlyDouble13);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0185");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData2 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        companyDerivedData2.year = 1;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList5 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.getAgList();
        companyDerivedData2.dList = companyDerivedList5;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList7 = companyDerivedData2.dList;
        org.junit.Assert.assertNotNull(companyDerivedList5);
        org.junit.Assert.assertNotNull(companyDerivedList7);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0186");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getAcctPayableQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getIntExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getLiabEquityQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0187");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived3.writeList("");
        java.util.List<java.lang.String> strList6 = indexDerived3.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived10 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived10.writeList("");
        java.util.List<java.lang.String> strList13 = indexDerived10.indexList;
        indexDerived3.indexList = strList13;
        indexDerived3.readList("");
        indexDerived3.listName = "hi!";
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived22 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        java.util.List<java.lang.String> strList23 = indexDerived22.indexList;
        indexDerived22.listName = "";
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived29 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived29.writeList("");
        java.util.List<java.lang.String> strList32 = indexDerived29.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived36 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived36.writeList("");
        java.util.List<java.lang.String> strList39 = indexDerived36.indexList;
        indexDerived29.indexList = strList39;
        indexDerived22.addToList(strList39);
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived45 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived45.writeList("");
        java.util.List<java.lang.String> strList48 = indexDerived45.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived52 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived52.writeList("");
        java.util.List<java.lang.String> strList55 = indexDerived52.indexList;
        indexDerived45.indexList = strList55;
        indexDerived22.addToList(strList55);
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived61 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived61.writeList("");
        java.util.List<java.lang.String> strList64 = indexDerived61.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived68 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived68.writeList("");
        java.util.List<java.lang.String> strList71 = indexDerived68.indexList;
        indexDerived61.indexList = strList71;
        indexDerived61.readList("");
        java.util.List<java.lang.String> strList75 = indexDerived61.indexList;
        indexDerived22.indexList = strList75;
        indexDerived3.indexList = strList75;
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertNotNull(strList39);
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertNotNull(strList55);
        org.junit.Assert.assertNotNull(strList64);
        org.junit.Assert.assertNotNull(strList71);
        org.junit.Assert.assertNotNull(strList75);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0188");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getSalesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getStDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getGoodwillQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0189");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        java.util.List<java.lang.String> strList4 = indexDerived3.indexList;
        indexDerived3.readList("");
        indexDerived3.listName = "hi!";
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0190");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getRdQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getDivCostQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getCashFromInvQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getCashFromInvQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0191");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        java.util.List<java.lang.String> strList4 = indexDerived3.indexList;
        indexDerived3.listName = "";
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived10 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived10.writeList("");
        java.util.List<java.lang.String> strList13 = indexDerived10.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived17 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived17.writeList("");
        java.util.List<java.lang.String> strList20 = indexDerived17.indexList;
        indexDerived10.indexList = strList20;
        indexDerived3.addToList(strList20);
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived26 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived26.writeList("");
        java.util.List<java.lang.String> strList29 = indexDerived26.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived33 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived33.writeList("");
        java.util.List<java.lang.String> strList36 = indexDerived33.indexList;
        indexDerived26.indexList = strList36;
        indexDerived3.addToList(strList36);
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived42 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived42.writeList("");
        java.util.List<java.lang.String> strList45 = indexDerived42.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived49 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived49.writeList("");
        java.util.List<java.lang.String> strList52 = indexDerived49.indexList;
        indexDerived42.indexList = strList52;
        indexDerived42.readList("");
        java.util.List<java.lang.String> strList56 = indexDerived42.indexList;
        indexDerived3.indexList = strList56;
        indexDerived3.writeList("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNotNull(strList45);
        org.junit.Assert.assertNotNull(strList52);
        org.junit.Assert.assertNotNull(strList56);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0192");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        java.util.List<java.lang.String> strList4 = indexDerived3.indexList;
        indexDerived3.listName = "";
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived10 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived10.writeList("");
        java.util.List<java.lang.String> strList13 = indexDerived10.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived17 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived17.writeList("");
        java.util.List<java.lang.String> strList20 = indexDerived17.indexList;
        indexDerived10.indexList = strList20;
        indexDerived3.addToList(strList20);
        indexDerived3.valid = true;
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList20);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0193");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getRdQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getIncPrimaryEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getCashFromFinQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getOtherLtAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getStInvestQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0194");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData2 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData(100, (int) '#');
        int int3 = companyDerivedData2.quarter;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList4 = companyDerivedData2.dList;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList5 = companyDerivedData2.dList;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertNotNull(companyDerivedList4);
        org.junit.Assert.assertNotNull(companyDerivedList5);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0195");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getEpsContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getWorkingCapitalQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getUnusualIncQdata();
        int int12 = companyDerived3.getQuarter();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0196");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.loadDb((int) (short) 10, (-1), filetypeEnum2);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0197");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.loadDb((int) (byte) 0, (int) (byte) 1, filetypeEnum2);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0198");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getCurrentRatioQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getOtherLtAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getCashFromFinQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0199");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived4 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("hi!", (int) (byte) -1, (int) ' ');
        java.util.List<java.lang.String> strList5 = indexDerived4.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived8 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", strList5, 1, (-1));
        indexDerived8.valid = true;
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0200");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getEpsContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getIncPrimaryEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getIntTotQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
        org.junit.Assert.assertNull(quarterlyDouble12);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0201");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getRdQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getCashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getLtDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getInventoryQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
        org.junit.Assert.assertNull(quarterlyDouble12);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0202");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getNonrecurringItemsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getGrossOpIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getPricesQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0203");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getGrossOpIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getNetcashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getIntTotQdata();
        boolean boolean9 = companyDerived3.isValid();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getNetIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getOpMarginQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0204");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        int int5 = companyDerived3.getQuarter();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getLtInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getWcfcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getUnusualIncQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0205");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getEquityQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0206");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getDividendQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getGrossOpIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getTotalAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getCashFromInvQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getEquityQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0207");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getLiabEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getTotalOpExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getWcfcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getOtherCurrAssetsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0208");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getIncPrimaryEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getPrefStockQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getCashFromOpsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0209");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getWcfcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getNetcashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getPreTaxIncQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0210");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getRoeQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getFcfQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0211");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.loadDb(0, (int) '4', filetypeEnum2);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0212");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getCogsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getTotalOpExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getLiabEquityQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0213");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getIncPrimaryEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getCogsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getEpsDilQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0214");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getIncPrimaryEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getCashFromInvQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0215");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getIncTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getRoeQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getPricesQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0216");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        int int5 = companyDerived3.getQuarter();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getNetIncQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0217");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getGrossIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getCapExQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getCurrentRatioQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getIntExpNonOpQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
        org.junit.Assert.assertNull(quarterlyDouble12);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0218");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) (byte) 100, (int) (byte) 10, fieldData2);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0219");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getIncTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getWcfcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getEquityQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0220");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        int int5 = companyDerived3.getQuarter();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getWcfcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getPrefStockQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getOtherCurrAssetsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0221");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPeQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getBvpsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0222");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getDividendQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getGrossIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getTotalLiabQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0223");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        int int5 = companyDerived3.getQuarter();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getIncTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getLtDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getTotalLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getLtInvestQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0224");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getIncPrimaryEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getTotalOpExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getTotalLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getIntExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getAdjToIncQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0225");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("hi!", (int) (byte) -1, (int) (short) 10);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0226");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getCogsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getTotalOpExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getTotalLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getInventoryQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0227");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        int int5 = companyDerived3.getQuarter();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getIncTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getLtDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getSharesQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0228");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getIncPrimaryEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getPeQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0229");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getAcctPayableQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getLiabEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getCashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getCashFromFinQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyDerived3.getDivCostQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyDerived3.getPricesQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
        org.junit.Assert.assertNull(quarterlyDouble12);
        org.junit.Assert.assertNull(quarterlyDouble13);
        org.junit.Assert.assertNull(quarterlyDouble14);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0230");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("hi!", (int) (byte) -1, (int) ' ');
        java.util.List<java.lang.String> strList4 = indexDerived3.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData7 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        companyDerivedData7.year = 1;
        int int10 = companyDerivedData7.year;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData13 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData16 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((int) (short) 0, 0);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData19 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData22 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        companyDerivedData22.year = 1;
        int int25 = companyDerivedData22.year;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList26 = companyDerivedData22.dList;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData29 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        companyDerivedData29.year = 1;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList32 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.getAgList();
        companyDerivedData29.dList = companyDerivedList32;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData[] companyDerivedDataArray34 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData[] { companyDerivedData7, companyDerivedData13, companyDerivedData16, companyDerivedData19, companyDerivedData22, companyDerivedData29 };
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData> companyDerivedDataList35 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData>) companyDerivedDataList35, companyDerivedDataArray34);
        indexDerived3.idList = companyDerivedDataList35;
        java.util.List<java.lang.String> strList38 = indexDerived3.indexList;
        indexDerived3.writeList("");
        java.util.List<java.lang.String> strList41 = indexDerived3.indexList;
        boolean boolean42 = indexDerived3.valid;
        java.lang.Class<?> wildcardClass43 = indexDerived3.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(companyDerivedList26);
        org.junit.Assert.assertNotNull(companyDerivedList32);
        org.junit.Assert.assertNotNull(companyDerivedDataArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(strList38);
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0231");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getRdQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getIncPrimaryEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getIntExpNonOpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getBvpsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0232");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", (int) (short) 10, (int) (short) 10);
        boolean boolean5 = indexDerived3.isInList("");
        java.lang.String str6 = indexDerived3.listName;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0233");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getTotalAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getIntExpQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0234");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("hi!", (int) (byte) 10, (int) (short) 1);
        boolean boolean4 = indexDerived3.valid;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0235");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 100, (int) (byte) -1);
        indexDerived3.listName = "hi!";
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData> companyDerivedDataList6 = indexDerived3.idList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived10 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived10.writeList("");
        java.util.List<java.lang.String> strList13 = indexDerived10.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived17 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived17.writeList("");
        java.util.List<java.lang.String> strList20 = indexDerived17.indexList;
        indexDerived10.indexList = strList20;
        indexDerived10.readList("");
        java.util.List<java.lang.String> strList24 = indexDerived10.indexList;
        boolean boolean25 = indexDerived10.valid;
        java.util.List<java.lang.String> strList26 = indexDerived10.indexList;
        indexDerived3.indexList = strList26;
        org.junit.Assert.assertNull(companyDerivedDataList6);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strList26);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0236");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        boolean boolean4 = companyDerived3.isValid();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getCashFromFinQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getIntExpNonOpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getRoeQdata();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0237");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData2 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((int) (short) 0, (int) (short) 100);
        companyDerivedData2.quarter = 0;
        companyDerivedData2.quarter = (short) 1;
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0238");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("hi!", (int) (byte) -1, (int) ' ');
        java.util.List<java.lang.String> strList4 = indexDerived3.indexList;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData> companyDerivedDataList5 = indexDerived3.idList;
        indexDerived3.valid = true;
        boolean boolean9 = indexDerived3.isInList("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNull(companyDerivedDataList5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0239");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) (short) -1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getLiabEquityQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0240");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData2 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        companyDerivedData2.year = 1;
        int int5 = companyDerivedData2.year;
        int int6 = companyDerivedData2.year;
        int int7 = companyDerivedData2.year;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0241");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getRdQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getCashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getIntExpNonOpQdata();
        boolean boolean12 = companyDerived3.isValid();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyDerived3.getLtDebtQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(quarterlyDouble13);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0242");
        java.util.List<java.lang.String> strList1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived4 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("hi!", strList1, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0243");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getAcctPayableQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getLiabEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getCurrentRatioQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0244");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPeQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getCashFromFinQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherCurrAssetsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0245");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getNonrecurringItemsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getGrossOpIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getNetFixedAssetsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0246");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        boolean boolean4 = companyDerived3.isValid();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getCashFromFinQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getSalesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getTotalLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getTanAssetsQdata();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0247");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getRoeQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0248");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData2 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData(35, (int) '4');
        int int3 = companyDerivedData2.year;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData6 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        companyDerivedData6.year = 1;
        int int9 = companyDerivedData6.year;
        companyDerivedData6.quarter = (short) 1;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList12 = companyDerivedData6.dList;
        companyDerivedData2.dList = companyDerivedList12;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(companyDerivedList12);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0249");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.loadDb((int) (short) 1, (int) (short) 10, filetypeEnum2);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0250");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        java.util.List<java.lang.String> strList4 = indexDerived3.indexList;
        indexDerived3.listName = "";
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived10 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived10.writeList("");
        java.util.List<java.lang.String> strList13 = indexDerived10.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived17 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived17.writeList("");
        java.util.List<java.lang.String> strList20 = indexDerived17.indexList;
        indexDerived10.indexList = strList20;
        indexDerived3.addToList(strList20);
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived26 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived26.writeList("");
        java.util.List<java.lang.String> strList29 = indexDerived26.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived33 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived33.writeList("");
        java.util.List<java.lang.String> strList36 = indexDerived33.indexList;
        indexDerived26.indexList = strList36;
        indexDerived3.addToList(strList36);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData> companyDerivedDataList39 = indexDerived3.idList;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData> companyDerivedDataList40 = indexDerived3.idList;
        boolean boolean41 = indexDerived3.valid;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived45 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived45.writeList("");
        java.util.List<java.lang.String> strList48 = indexDerived45.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived52 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived52.writeList("");
        java.util.List<java.lang.String> strList55 = indexDerived52.indexList;
        indexDerived45.indexList = strList55;
        indexDerived3.indexList = strList55;
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNull(companyDerivedDataList39);
        org.junit.Assert.assertNull(companyDerivedDataList40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertNotNull(strList55);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0251");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("hi!", 1, (int) (byte) 0);
        boolean boolean5 = indexDerived3.isInList("hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0252");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getSalesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getStDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getCashFromFinQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyDerived3.getGrossIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyDerived3.getNetIncQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
        org.junit.Assert.assertNull(quarterlyDouble12);
        org.junit.Assert.assertNull(quarterlyDouble13);
        org.junit.Assert.assertNull(quarterlyDouble14);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0253");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getSalesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getOtherCurrAssetsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0254");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getNetcashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getLtInvestQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0255");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getRdQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getIncPrimaryEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getCashFromFinQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getStDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getGrossOpIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyDerived3.getRdQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
        org.junit.Assert.assertNull(quarterlyDouble12);
        org.junit.Assert.assertNull(quarterlyDouble13);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0256");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getTotalAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getOtherCurrAssetsQdata();
        boolean boolean9 = companyDerived3.isValid();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getEpsDilContQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0257");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getStDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getDivCostQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getIncPrimaryEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getAcctPayableQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0258");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getGrossOpIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getNetcashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getIntTotQdata();
        boolean boolean9 = companyDerived3.isValid();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getLtInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getPeQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getTotalAssetsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
        org.junit.Assert.assertNull(quarterlyDouble12);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0259");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPeQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getDividendQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0260");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getRdQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getGrossIncQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0261");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData2 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        companyDerivedData2.year = 1;
        int int5 = companyDerivedData2.year;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived9 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("hi!", (int) (byte) -1, (int) ' ');
        java.util.List<java.lang.String> strList10 = indexDerived9.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived16 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived16.writeList("");
        java.util.List<java.lang.String> strList19 = indexDerived16.indexList;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray22 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList23 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList23, fieldDataArray22);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList25 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList19, 10, (int) (short) 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList23);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList26 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList10, 100, 0, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList23);
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived32 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived32.writeList("");
        java.util.List<java.lang.String> strList35 = indexDerived32.indexList;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray38 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList39 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList39, fieldDataArray38);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList41 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList35, 10, (int) (short) 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList39);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList42 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList10, (int) (byte) 0, 10, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList39);
        companyDerivedData2.dList = companyDerivedList42;
        companyDerivedData2.year = '4';
        companyDerivedData2.year = (short) 1;
        int int48 = companyDerivedData2.quarter;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(fieldDataArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(companyDerivedList25);
        org.junit.Assert.assertNotNull(companyDerivedList26);
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertNotNull(fieldDataArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(companyDerivedList41);
        org.junit.Assert.assertNotNull(companyDerivedList42);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0262");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.write(0, 0);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0263");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getIncPrimaryEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getSalesQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0264");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.write((int) (byte) 0, 35);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0265");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getGrossOpIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getIncAfterTaxQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0266");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPeQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getCashFromFinQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getLtDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getInventoryQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getCashFromOpsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0267");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getAcctPayableQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getLiabEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getCashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getIntExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyDerived3.getIncPrimaryEpsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
        org.junit.Assert.assertNull(quarterlyDouble12);
        org.junit.Assert.assertNull(quarterlyDouble13);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0268");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getLtInvestQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0269");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getAcctPayableQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getLiabEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getCashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getLtInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getWorkingCapitalQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyDerived3.getTotalAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = companyDerived3.getSalesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = companyDerived3.getOtherCurrAssetsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
        org.junit.Assert.assertNull(quarterlyDouble12);
        org.junit.Assert.assertNull(quarterlyDouble13);
        org.junit.Assert.assertNull(quarterlyDouble14);
        org.junit.Assert.assertNull(quarterlyDouble15);
        org.junit.Assert.assertNull(quarterlyDouble16);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0270");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("hi!", (int) (byte) -1, (int) ' ');
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived7 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("hi!", (int) (byte) -1, (int) ' ');
        java.util.List<java.lang.String> strList8 = indexDerived7.indexList;
        indexDerived3.indexList = strList8;
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived18 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", (java.util.List<java.lang.String>) strList14, 1, (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData> companyDerivedDataList19 = indexDerived18.idList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived23 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("hi!", (int) (byte) -1, (int) ' ');
        java.util.List<java.lang.String> strList24 = indexDerived23.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData27 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        companyDerivedData27.year = 1;
        int int30 = companyDerivedData27.year;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData33 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData36 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((int) (short) 0, 0);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData39 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData42 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        companyDerivedData42.year = 1;
        int int45 = companyDerivedData42.year;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList46 = companyDerivedData42.dList;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData49 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        companyDerivedData49.year = 1;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList52 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.getAgList();
        companyDerivedData49.dList = companyDerivedList52;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData[] companyDerivedDataArray54 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData[] { companyDerivedData27, companyDerivedData33, companyDerivedData36, companyDerivedData39, companyDerivedData42, companyDerivedData49 };
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData> companyDerivedDataList55 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData>) companyDerivedDataList55, companyDerivedDataArray54);
        indexDerived23.idList = companyDerivedDataList55;
        indexDerived18.idList = companyDerivedDataList55;
        indexDerived3.idList = companyDerivedDataList55;
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(companyDerivedDataList19);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(companyDerivedList46);
        org.junit.Assert.assertNotNull(companyDerivedList52);
        org.junit.Assert.assertNotNull(companyDerivedDataArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0271");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        int int5 = companyDerived3.getQuarter();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getIncTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getLtDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getLtDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getGrossIncQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0272");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived3.writeList("");
        java.util.List<java.lang.String> strList6 = indexDerived3.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived10 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived10.writeList("");
        java.util.List<java.lang.String> strList13 = indexDerived10.indexList;
        indexDerived3.indexList = strList13;
        boolean boolean15 = indexDerived3.valid;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData> companyDerivedDataList16 = indexDerived3.idList;
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(companyDerivedDataList16);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0273");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getNonrecurringItemsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getTotalAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getTotalOpExpQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0274");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData2 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        companyDerivedData2.year = 1;
        int int5 = companyDerivedData2.year;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived9 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("hi!", (int) (byte) -1, (int) ' ');
        java.util.List<java.lang.String> strList10 = indexDerived9.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived16 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived16.writeList("");
        java.util.List<java.lang.String> strList19 = indexDerived16.indexList;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray22 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList23 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList23, fieldDataArray22);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList25 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList19, 10, (int) (short) 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList23);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList26 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList10, 100, 0, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList23);
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived32 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived32.writeList("");
        java.util.List<java.lang.String> strList35 = indexDerived32.indexList;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray38 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList39 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList39, fieldDataArray38);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList41 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList35, 10, (int) (short) 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList39);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList42 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList10, (int) (byte) 0, 10, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList39);
        companyDerivedData2.dList = companyDerivedList42;
        companyDerivedData2.year = (short) 100;
        int int46 = companyDerivedData2.quarter;
        int int47 = companyDerivedData2.quarter;
        companyDerivedData2.quarter = (byte) 0;
        java.lang.Class<?> wildcardClass50 = companyDerivedData2.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(fieldDataArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(companyDerivedList25);
        org.junit.Assert.assertNotNull(companyDerivedList26);
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertNotNull(fieldDataArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(companyDerivedList41);
        org.junit.Assert.assertNotNull(companyDerivedList42);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0275");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived3.writeList("");
        java.util.List<java.lang.String> strList6 = indexDerived3.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived10 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived10.writeList("");
        java.util.List<java.lang.String> strList13 = indexDerived10.indexList;
        indexDerived3.indexList = strList13;
        indexDerived3.readList("");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived21 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived21.writeList("");
        java.util.List<java.lang.String> strList24 = indexDerived21.indexList;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList28 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList28, fieldDataArray27);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList30 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList24, 10, (int) (short) 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList28);
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived33 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", strList24, (int) (byte) 0, 100);
        indexDerived3.addToList(strList24);
        boolean boolean36 = indexDerived3.isInList("");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData> companyDerivedDataList37 = indexDerived3.idList;
        indexDerived3.valid = true;
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(fieldDataArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(companyDerivedList30);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(companyDerivedDataList37);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0276");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getCurrentRatioQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getRoeQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0277");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getRdQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getIncPrimaryEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getCashFromFinQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getStDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getIncTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyDerived3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyDerived3.getGoodwillQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
        org.junit.Assert.assertNull(quarterlyDouble12);
        org.junit.Assert.assertNull(quarterlyDouble13);
        org.junit.Assert.assertNull(quarterlyDouble14);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0278");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 100, (int) (byte) -1);
        indexDerived3.listName = "hi!";
        java.lang.String str6 = indexDerived3.listName;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData> companyDerivedDataList7 = indexDerived3.idList;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(companyDerivedDataList7);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0279");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getEpsContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getLtInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getTanAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getNetIncQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
        org.junit.Assert.assertNull(quarterlyDouble12);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0280");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getDividendQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getGrossOpIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getSalesQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0281");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getIncPrimaryEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getTotalOpExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getTotalLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getIntExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getWorkingCapitalQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getPrefStockQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0282");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getTotalAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getOtherCurrAssetsQdata();
        int int10 = companyDerived3.getQuarter();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getPrefStockQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getAdjToIncQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(quarterlyDouble11);
        org.junit.Assert.assertNull(quarterlyDouble12);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0283");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived3.writeList("");
        java.util.List<java.lang.String> strList6 = indexDerived3.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived10 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived10.writeList("");
        java.util.List<java.lang.String> strList13 = indexDerived10.indexList;
        indexDerived3.indexList = strList13;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData> companyDerivedDataList15 = indexDerived3.idList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived19 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived19.writeList("");
        java.util.List<java.lang.String> strList22 = indexDerived19.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived26 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived26.writeList("");
        java.util.List<java.lang.String> strList29 = indexDerived26.indexList;
        indexDerived19.indexList = strList29;
        indexDerived19.readList("");
        java.util.List<java.lang.String> strList33 = indexDerived19.indexList;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray36 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList37 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList37, fieldDataArray36);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList39 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList33, (int) 'a', (int) (byte) 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList37);
        indexDerived3.addToList(strList33);
        indexDerived3.valid = false;
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNull(companyDerivedDataList15);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertNotNull(fieldDataArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(companyDerivedList39);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0284");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("hi!", 1, (int) (short) -1);
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived7 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        java.util.List<java.lang.String> strList8 = indexDerived7.indexList;
        indexDerived7.valid = true;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData> companyDerivedDataList11 = indexDerived7.idList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived15 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived15.writeList("");
        boolean boolean19 = indexDerived15.isInList("");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData> companyDerivedDataList20 = indexDerived15.idList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived24 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("hi!", (int) (byte) -1, (int) ' ');
        java.util.List<java.lang.String> strList25 = indexDerived24.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData28 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        companyDerivedData28.year = 1;
        int int31 = companyDerivedData28.year;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData34 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData37 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((int) (short) 0, 0);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData40 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData43 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        companyDerivedData43.year = 1;
        int int46 = companyDerivedData43.year;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList47 = companyDerivedData43.dList;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData50 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        companyDerivedData50.year = 1;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList53 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.getAgList();
        companyDerivedData50.dList = companyDerivedList53;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData[] companyDerivedDataArray55 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData[] { companyDerivedData28, companyDerivedData34, companyDerivedData37, companyDerivedData40, companyDerivedData43, companyDerivedData50 };
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData> companyDerivedDataList56 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData>) companyDerivedDataList56, companyDerivedDataArray55);
        indexDerived24.idList = companyDerivedDataList56;
        indexDerived15.idList = companyDerivedDataList56;
        indexDerived7.idList = companyDerivedDataList56;
        indexDerived3.idList = companyDerivedDataList56;
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNull(companyDerivedDataList11);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(companyDerivedDataList20);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(companyDerivedList47);
        org.junit.Assert.assertNotNull(companyDerivedList53);
        org.junit.Assert.assertNotNull(companyDerivedDataArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0285");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        int int5 = companyDerived3.getYear();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getRoeQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getGrossOpIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getStInvestQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0286");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getIntTotQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0287");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getGrossOpIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getCashFromInvQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getTotalOpExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getIncTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getIntExpQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0288");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("hi!", (int) (byte) -1, (int) ' ');
        java.util.List<java.lang.String> strList4 = indexDerived3.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData7 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        companyDerivedData7.year = 1;
        int int10 = companyDerivedData7.year;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData13 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData16 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((int) (short) 0, 0);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData19 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData22 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        companyDerivedData22.year = 1;
        int int25 = companyDerivedData22.year;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList26 = companyDerivedData22.dList;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData29 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        companyDerivedData29.year = 1;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList32 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.getAgList();
        companyDerivedData29.dList = companyDerivedList32;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData[] companyDerivedDataArray34 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData[] { companyDerivedData7, companyDerivedData13, companyDerivedData16, companyDerivedData19, companyDerivedData22, companyDerivedData29 };
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData> companyDerivedDataList35 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData>) companyDerivedDataList35, companyDerivedDataArray34);
        indexDerived3.idList = companyDerivedDataList35;
        java.util.List<java.lang.String> strList38 = indexDerived3.indexList;
        indexDerived3.writeList("");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived44 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("hi!", (int) (byte) -1, (int) ' ');
        java.util.List<java.lang.String> strList45 = indexDerived44.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived51 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived51.writeList("");
        java.util.List<java.lang.String> strList54 = indexDerived51.indexList;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray57 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList58 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList58, fieldDataArray57);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList60 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList54, 10, (int) (short) 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList58);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList61 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList45, 100, 0, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList58);
        indexDerived3.addToList(strList45);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray65 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList66 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList66, fieldDataArray65);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList68 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList45, 0, (int) 'a', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList66);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(companyDerivedList26);
        org.junit.Assert.assertNotNull(companyDerivedList32);
        org.junit.Assert.assertNotNull(companyDerivedDataArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(strList38);
        org.junit.Assert.assertNotNull(strList45);
        org.junit.Assert.assertNotNull(strList54);
        org.junit.Assert.assertNotNull(fieldDataArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(companyDerivedList60);
        org.junit.Assert.assertNotNull(companyDerivedList61);
        org.junit.Assert.assertNotNull(fieldDataArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(companyDerivedList68);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0289");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        boolean boolean4 = companyDerived3.isValid();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getIntTotQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getCogsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getSharesQdata();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0290");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getIncPrimaryEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getWorkingCapitalQdata();
        int int6 = companyDerived3.getYear();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0291");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getTotalAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getOtherCurrAssetsQdata();
        boolean boolean9 = companyDerived3.isValid();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getTotalAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getRdQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
        org.junit.Assert.assertNull(quarterlyDouble12);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0292");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", (int) (short) 10, (int) (short) 10);
        boolean boolean5 = indexDerived3.isInList("");
        indexDerived3.listName = "";
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived11 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived11.writeList("");
        java.util.List<java.lang.String> strList14 = indexDerived11.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived18 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived18.writeList("");
        java.util.List<java.lang.String> strList21 = indexDerived18.indexList;
        indexDerived11.indexList = strList21;
        indexDerived11.readList("");
        java.util.List<java.lang.String> strList25 = indexDerived11.indexList;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray28 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList29 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList29, fieldDataArray28);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList31 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList25, (int) 'a', (int) (byte) 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList29);
        indexDerived3.indexList = strList25;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData> companyDerivedDataList33 = indexDerived3.idList;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(fieldDataArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(companyDerivedList31);
        org.junit.Assert.assertNull(companyDerivedDataList33);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0293");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getWcfcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getCurrLiabQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0294");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getNetIncQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0295");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) (byte) 1, 10, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getDivCostQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getIntExpNonOpQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0296");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("hi!", (int) (byte) -1, (int) ' ');
        java.util.List<java.lang.String> strList4 = indexDerived3.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData7 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        companyDerivedData7.year = 1;
        int int10 = companyDerivedData7.year;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData13 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData16 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((int) (short) 0, 0);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData19 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData22 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        companyDerivedData22.year = 1;
        int int25 = companyDerivedData22.year;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList26 = companyDerivedData22.dList;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData29 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        companyDerivedData29.year = 1;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList32 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.getAgList();
        companyDerivedData29.dList = companyDerivedList32;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData[] companyDerivedDataArray34 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData[] { companyDerivedData7, companyDerivedData13, companyDerivedData16, companyDerivedData19, companyDerivedData22, companyDerivedData29 };
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData> companyDerivedDataList35 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData>) companyDerivedDataList35, companyDerivedDataArray34);
        indexDerived3.idList = companyDerivedDataList35;
        java.util.List<java.lang.String> strList38 = indexDerived3.indexList;
        indexDerived3.writeList("");
        java.lang.String[] strArray44 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList45 = new java.util.ArrayList<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList45, strArray44);
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived49 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", (java.util.List<java.lang.String>) strList45, 1, (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData> companyDerivedDataList50 = indexDerived49.idList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived54 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("hi!", (int) (byte) -1, (int) ' ');
        java.util.List<java.lang.String> strList55 = indexDerived54.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData58 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        companyDerivedData58.year = 1;
        int int61 = companyDerivedData58.year;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData64 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData67 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((int) (short) 0, 0);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData70 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData73 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        companyDerivedData73.year = 1;
        int int76 = companyDerivedData73.year;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList77 = companyDerivedData73.dList;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData80 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        companyDerivedData80.year = 1;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList83 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.getAgList();
        companyDerivedData80.dList = companyDerivedList83;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData[] companyDerivedDataArray85 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData[] { companyDerivedData58, companyDerivedData64, companyDerivedData67, companyDerivedData70, companyDerivedData73, companyDerivedData80 };
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData> companyDerivedDataList86 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData>) companyDerivedDataList86, companyDerivedDataArray85);
        indexDerived54.idList = companyDerivedDataList86;
        indexDerived49.idList = companyDerivedDataList86;
        indexDerived3.idList = companyDerivedDataList86;
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(companyDerivedList26);
        org.junit.Assert.assertNotNull(companyDerivedList32);
        org.junit.Assert.assertNotNull(companyDerivedDataArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(strList38);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNull(companyDerivedDataList50);
        org.junit.Assert.assertNotNull(strList55);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 1 + "'", int76 == 1);
        org.junit.Assert.assertNotNull(companyDerivedList77);
        org.junit.Assert.assertNotNull(companyDerivedList83);
        org.junit.Assert.assertNotNull(companyDerivedDataArray85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0297");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.loadDb((int) (short) 10, (int) (byte) 10, filetypeEnum2);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0298");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getRdQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getDivCostQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getCashFromInvQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getLtInvestQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0299");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getIncTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getCashQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0300");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getRdQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getEpsContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getEpsDilContQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0301");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", (int) 'a', (-1));
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0302");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        java.util.List<java.lang.String> strList4 = indexDerived3.indexList;
        indexDerived3.readList("");
        indexDerived3.valid = false;
        indexDerived3.writeList("");
        boolean boolean12 = indexDerived3.isInList("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0303");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        int int5 = companyDerived3.getQuarter();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getCogsQdata();
        int int7 = companyDerived3.getYear();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getRoeQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getOtherLtAssetsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0304");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        int int5 = companyDerived3.getQuarter();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getWorkingCapitalQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getAdjToIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getWcfcfQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
        org.junit.Assert.assertNull(quarterlyDouble12);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0305");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getIncPrimaryEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getWorkingCapitalQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getUnusualIncQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0306");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getCogsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getTotalOpExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getPrefStockQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getRoeQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getDivCostQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
        org.junit.Assert.assertNull(quarterlyDouble12);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0307");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getCogsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getDivCostQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getEquityQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0308");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData2 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData(0, (int) (byte) 10);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0309");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", (int) (short) 10, (int) (short) 10);
        boolean boolean5 = indexDerived3.isInList("");
        indexDerived3.listName = "";
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived11 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived11.writeList("");
        java.util.List<java.lang.String> strList14 = indexDerived11.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived18 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived18.writeList("");
        java.util.List<java.lang.String> strList21 = indexDerived18.indexList;
        indexDerived11.indexList = strList21;
        indexDerived11.readList("");
        java.util.List<java.lang.String> strList25 = indexDerived11.indexList;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray28 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList29 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList29, fieldDataArray28);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList31 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList25, (int) 'a', (int) (byte) 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList29);
        indexDerived3.indexList = strList25;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived36 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived36.writeList("");
        java.util.List<java.lang.String> strList39 = indexDerived36.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived45 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("hi!", (int) (byte) -1, (int) ' ');
        java.util.List<java.lang.String> strList46 = indexDerived45.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived52 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived52.writeList("");
        java.util.List<java.lang.String> strList55 = indexDerived52.indexList;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray58 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList59 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList59, fieldDataArray58);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList61 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList55, 10, (int) (short) 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList59);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList62 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList46, 100, 0, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList59);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList63 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList39, (int) (byte) 1, (int) (short) 0, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList59);
        indexDerived3.addToList(strList39);
        indexDerived3.valid = false;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(fieldDataArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(companyDerivedList31);
        org.junit.Assert.assertNotNull(strList39);
        org.junit.Assert.assertNotNull(strList46);
        org.junit.Assert.assertNotNull(strList55);
        org.junit.Assert.assertNotNull(fieldDataArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(companyDerivedList61);
        org.junit.Assert.assertNotNull(companyDerivedList62);
        org.junit.Assert.assertNotNull(companyDerivedList63);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0310");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getAcctPayableQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0311");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getLiabEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getIntExpNonOpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getNetIncQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0312");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        boolean boolean4 = companyDerived3.isValid();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getIntTotQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getAdjToIncQdata();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0313");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData2 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        companyDerivedData2.year = 1;
        int int5 = companyDerivedData2.year;
        int int6 = companyDerivedData2.year;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList7 = companyDerivedData2.dList;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(companyDerivedList7);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0314");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getLtInvestQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0315");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getNetcashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getLiabEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getGrossIncQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0316");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getRdQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getBvpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getCashQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0317");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", (int) (short) 10, (int) (short) 10);
        boolean boolean5 = indexDerived3.isInList("");
        indexDerived3.listName = "";
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived11 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived11.writeList("");
        java.util.List<java.lang.String> strList14 = indexDerived11.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived18 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived18.writeList("");
        java.util.List<java.lang.String> strList21 = indexDerived18.indexList;
        indexDerived11.indexList = strList21;
        indexDerived11.readList("");
        java.util.List<java.lang.String> strList25 = indexDerived11.indexList;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray28 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList29 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList29, fieldDataArray28);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList31 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList25, (int) 'a', (int) (byte) 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList29);
        indexDerived3.indexList = strList25;
        indexDerived3.writeList("");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(fieldDataArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(companyDerivedList31);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0318");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        boolean boolean4 = companyDerived3.isValid();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getWcfcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getOtherLtAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getEpsDilContQdata();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0319");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getTotalAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getOtherCurrAssetsQdata();
        boolean boolean9 = companyDerived3.isValid();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getLiabEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getEquityQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0320");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getCurrentRatioQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getInventoryQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0321");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", (int) '#', 1);
        java.lang.String str4 = indexDerived3.listName;
        indexDerived3.writeList("hi!");
        boolean boolean8 = indexDerived3.isInList("");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0322");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getGrossOpIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getCashFromInvQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getCashFromOpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getIntExpNonOpQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0323");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getCurrentRatioQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherLtAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getLtDebtQdata();
        boolean boolean9 = companyDerived3.isValid();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getIntExpQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0324");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getCashFromOpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getIntExpNonOpQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0325");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getLtInvestQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0326");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getCogsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getTotalOpExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getLtDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getCashFromOpsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0327");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getPeQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getStDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getPrefStockQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getPrefStockQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getBvpsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0328");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPeQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getCashFromFinQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getLtDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getIntExpNonOpQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0329");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        boolean boolean4 = companyDerived3.isValid();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getWcfcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getOtherLtAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getOtherLtLiabQdata();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0330");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPeQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getCashFromFinQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getLtDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getStDebtQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0331");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getIncPrimaryEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getInventoryQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getNetIncQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0332");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        java.util.List<java.lang.String> strList4 = indexDerived3.indexList;
        indexDerived3.readList("");
        indexDerived3.valid = false;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived12 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        java.util.List<java.lang.String> strList13 = indexDerived12.indexList;
        indexDerived12.valid = true;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData> companyDerivedDataList16 = indexDerived12.idList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived20 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived20.writeList("");
        boolean boolean24 = indexDerived20.isInList("");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData> companyDerivedDataList25 = indexDerived20.idList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived29 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("hi!", (int) (byte) -1, (int) ' ');
        java.util.List<java.lang.String> strList30 = indexDerived29.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData33 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        companyDerivedData33.year = 1;
        int int36 = companyDerivedData33.year;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData39 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData42 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((int) (short) 0, 0);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData45 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData48 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        companyDerivedData48.year = 1;
        int int51 = companyDerivedData48.year;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList52 = companyDerivedData48.dList;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData55 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        companyDerivedData55.year = 1;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList58 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.getAgList();
        companyDerivedData55.dList = companyDerivedList58;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData[] companyDerivedDataArray60 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData[] { companyDerivedData33, companyDerivedData39, companyDerivedData42, companyDerivedData45, companyDerivedData48, companyDerivedData55 };
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData> companyDerivedDataList61 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData>) companyDerivedDataList61, companyDerivedDataArray60);
        indexDerived29.idList = companyDerivedDataList61;
        indexDerived20.idList = companyDerivedDataList61;
        indexDerived12.idList = companyDerivedDataList61;
        indexDerived3.idList = companyDerivedDataList61;
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNull(companyDerivedDataList16);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(companyDerivedDataList25);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertNotNull(companyDerivedList52);
        org.junit.Assert.assertNotNull(companyDerivedList58);
        org.junit.Assert.assertNotNull(companyDerivedDataArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0333");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getCogsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getTotalOpExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getTotalLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getNetcashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getCurrentRatioQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getLtInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyDerived3.getGoodwillQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
        org.junit.Assert.assertNull(quarterlyDouble12);
        org.junit.Assert.assertNull(quarterlyDouble13);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0334");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getCashFromFinQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getIntExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getNetcashflowQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0335");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData2 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        companyDerivedData2.year = 1;
        int int5 = companyDerivedData2.year;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived9 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("hi!", (int) (byte) -1, (int) ' ');
        java.util.List<java.lang.String> strList10 = indexDerived9.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived16 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived16.writeList("");
        java.util.List<java.lang.String> strList19 = indexDerived16.indexList;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray22 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList23 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList23, fieldDataArray22);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList25 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList19, 10, (int) (short) 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList23);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList26 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList10, 100, 0, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList23);
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived32 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived32.writeList("");
        java.util.List<java.lang.String> strList35 = indexDerived32.indexList;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray38 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList39 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList39, fieldDataArray38);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList41 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList35, 10, (int) (short) 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList39);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList42 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList10, (int) (byte) 0, 10, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList39);
        companyDerivedData2.dList = companyDerivedList42;
        companyDerivedData2.year = '4';
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList46 = companyDerivedData2.dList;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(fieldDataArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(companyDerivedList25);
        org.junit.Assert.assertNotNull(companyDerivedList26);
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertNotNull(fieldDataArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(companyDerivedList41);
        org.junit.Assert.assertNotNull(companyDerivedList42);
        org.junit.Assert.assertNotNull(companyDerivedList46);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0336");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getWorkingCapitalQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getNonrecurringItemsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0337");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getRdQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherCurrLiabQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0338");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getAdjToIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getNetIncQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0339");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived3.writeList("");
        indexDerived3.valid = false;
        java.util.List<java.lang.String> strList8 = indexDerived3.indexList;
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0340");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        java.util.List<java.lang.String> strList4 = indexDerived3.indexList;
        indexDerived3.readList("");
        indexDerived3.valid = false;
        indexDerived3.listName = "";
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived14 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", (int) (short) 10, (int) (short) 10);
        boolean boolean16 = indexDerived14.isInList("");
        indexDerived14.listName = "";
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived22 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived22.writeList("");
        java.util.List<java.lang.String> strList25 = indexDerived22.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived29 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived29.writeList("");
        java.util.List<java.lang.String> strList32 = indexDerived29.indexList;
        indexDerived22.indexList = strList32;
        indexDerived22.readList("");
        java.util.List<java.lang.String> strList36 = indexDerived22.indexList;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray39 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList40 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList40, fieldDataArray39);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList42 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList36, (int) 'a', (int) (byte) 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList40);
        indexDerived14.indexList = strList36;
        indexDerived3.indexList = strList36;
        indexDerived3.valid = false;
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNotNull(fieldDataArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(companyDerivedList42);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0341");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getIncTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getCashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getCashFromFinQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getCashFromFinQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0342");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getRdQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getDivCostQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getCashFromInvQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getIntExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyDerived3.getCurrentRatioQdata();
        boolean boolean14 = companyDerived3.isValid();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
        org.junit.Assert.assertNull(quarterlyDouble12);
        org.junit.Assert.assertNull(quarterlyDouble13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0343");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", (int) (short) -1, 10);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0344");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData2 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData5 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList6 = companyDerivedData5.dList;
        companyDerivedData2.dList = companyDerivedList6;
        int int8 = companyDerivedData2.quarter;
        org.junit.Assert.assertNotNull(companyDerivedList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0345");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        java.util.List<java.lang.String> strList4 = indexDerived3.indexList;
        indexDerived3.valid = true;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData> companyDerivedDataList7 = indexDerived3.idList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived11 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived11.writeList("");
        boolean boolean15 = indexDerived11.isInList("");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData> companyDerivedDataList16 = indexDerived11.idList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived20 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("hi!", (int) (byte) -1, (int) ' ');
        java.util.List<java.lang.String> strList21 = indexDerived20.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData24 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        companyDerivedData24.year = 1;
        int int27 = companyDerivedData24.year;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData30 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData33 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((int) (short) 0, 0);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData36 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData39 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        companyDerivedData39.year = 1;
        int int42 = companyDerivedData39.year;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList43 = companyDerivedData39.dList;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData46 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        companyDerivedData46.year = 1;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList49 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.getAgList();
        companyDerivedData46.dList = companyDerivedList49;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData[] companyDerivedDataArray51 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData[] { companyDerivedData24, companyDerivedData30, companyDerivedData33, companyDerivedData36, companyDerivedData39, companyDerivedData46 };
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData> companyDerivedDataList52 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData>) companyDerivedDataList52, companyDerivedDataArray51);
        indexDerived20.idList = companyDerivedDataList52;
        indexDerived11.idList = companyDerivedDataList52;
        indexDerived3.idList = companyDerivedDataList52;
        java.lang.Class<?> wildcardClass57 = indexDerived3.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNull(companyDerivedDataList7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(companyDerivedDataList16);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(companyDerivedList43);
        org.junit.Assert.assertNotNull(companyDerivedList49);
        org.junit.Assert.assertNotNull(companyDerivedDataArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0346");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPeQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getCashFromFinQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getTanAssetsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0347");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getTotalAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getCashFromOpsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0348");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) (byte) 1, (int) (byte) -1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getStDebtQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0349");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getDivCostQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getAcctPayableQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getCashFromInvQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0350");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPeQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getFcfQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0351");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.write(1, (int) (short) 0);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0352");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getRdQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0353");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getCurrentRatioQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherLtAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getTotalLiabQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0354");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("hi!", (int) (byte) 10, (int) (short) 1);
        java.util.List<java.lang.String> strList4 = indexDerived3.indexList;
        indexDerived3.readList("");
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0355");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getTotalAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getOtherCurrAssetsQdata();
        boolean boolean9 = companyDerived3.isValid();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getLiabEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getAdjToIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyDerived3.getEpsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
        org.junit.Assert.assertNull(quarterlyDouble12);
        org.junit.Assert.assertNull(quarterlyDouble13);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0356");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getIncTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getCurrentRatioQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0357");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getStInvestQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0358");
        java.util.List<java.lang.String> strList1 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived4 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", strList1, (int) (byte) 0, (int) (short) 1);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0359");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getRdQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getBvpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getTotalLiabQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0360");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        int int5 = companyDerived3.getQuarter();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getIncTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getLtDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getLtDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getStDebtQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0361");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("hi!", (int) (byte) -1, (int) ' ');
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived7 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("hi!", (int) (byte) -1, (int) ' ');
        java.util.List<java.lang.String> strList8 = indexDerived7.indexList;
        indexDerived3.indexList = strList8;
        boolean boolean10 = indexDerived3.valid;
        indexDerived3.writeList("");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0362");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getStDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getLtInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getPricesQdata();
        int int9 = companyDerived3.getYear();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0363");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        boolean boolean4 = companyDerived3.isValid();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getNetcashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getTotalOpExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getGrossOpIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getTotalOpExpQdata();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0364");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", (int) '4', 35);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0365");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getNetcashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getWorkingCapitalQdata();
        boolean boolean8 = companyDerived3.isValid();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0366");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        int int5 = companyDerived3.getQuarter();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getCogsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getNonrecurringItemsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0367");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getIncPrimaryEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getTanAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getLtDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getOtherLtAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getPreTaxIncQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0368");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("hi!", (int) (byte) 10, (int) (short) 1);
        indexDerived3.valid = true;
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0369");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        int int5 = companyDerived3.getQuarter();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getLtInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getWcfcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getIncTaxQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0370");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getStDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getCogsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getCurrAssetsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0371");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getIncPrimaryEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getTotalOpExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getTotalLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getPreTaxIncQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0372");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getEpsContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getNetIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getGrossIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getLtInvestQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0373");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData2 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        companyDerivedData2.year = 1;
        int int5 = companyDerivedData2.year;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived9 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("hi!", (int) (byte) -1, (int) ' ');
        java.util.List<java.lang.String> strList10 = indexDerived9.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived16 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived16.writeList("");
        java.util.List<java.lang.String> strList19 = indexDerived16.indexList;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray22 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList23 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList23, fieldDataArray22);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList25 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList19, 10, (int) (short) 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList23);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList26 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList10, 100, 0, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList23);
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived32 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived32.writeList("");
        java.util.List<java.lang.String> strList35 = indexDerived32.indexList;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray38 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList39 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList39, fieldDataArray38);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList41 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList35, 10, (int) (short) 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList39);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList42 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList10, (int) (byte) 0, 10, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList39);
        companyDerivedData2.dList = companyDerivedList42;
        companyDerivedData2.year = (short) 100;
        int int46 = companyDerivedData2.quarter;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived50 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived50.writeList("");
        java.util.List<java.lang.String> strList53 = indexDerived50.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived59 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("hi!", (int) (byte) -1, (int) ' ');
        java.util.List<java.lang.String> strList60 = indexDerived59.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived66 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived66.writeList("");
        java.util.List<java.lang.String> strList69 = indexDerived66.indexList;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray72 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList73 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList73, fieldDataArray72);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList75 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList69, 10, (int) (short) 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList73);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList76 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList60, 100, 0, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList73);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList77 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList53, (int) (byte) 1, (int) (short) 0, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList73);
        companyDerivedData2.dList = companyDerivedList77;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(fieldDataArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(companyDerivedList25);
        org.junit.Assert.assertNotNull(companyDerivedList26);
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertNotNull(fieldDataArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(companyDerivedList41);
        org.junit.Assert.assertNotNull(companyDerivedList42);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(strList53);
        org.junit.Assert.assertNotNull(strList60);
        org.junit.Assert.assertNotNull(strList69);
        org.junit.Assert.assertNotNull(fieldDataArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(companyDerivedList75);
        org.junit.Assert.assertNotNull(companyDerivedList76);
        org.junit.Assert.assertNotNull(companyDerivedList77);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0374");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getRdQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getIncPrimaryEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getCashFromFinQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getStDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getCashFromOpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyDerived3.getTotalLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyDerived3.getAcctPayableQdata();
        int int15 = companyDerived3.getQuarter();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
        org.junit.Assert.assertNull(quarterlyDouble12);
        org.junit.Assert.assertNull(quarterlyDouble13);
        org.junit.Assert.assertNull(quarterlyDouble14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0375");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getCurrentRatioQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getAdjToIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getTotalOpExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getBvpsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0376");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getCogsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getTotalOpExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getAdjToIncQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0377");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getIncTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getWcfcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getFcfQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0378");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        int int5 = companyDerived3.getQuarter();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getCogsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getLtDebtQdata();
        boolean boolean8 = companyDerived3.isValid();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0379");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getTotalLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getNonrecurringItemsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getCashFromOpsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0380");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getGrossOpIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getIncAfterTaxQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0381");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getLtDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getTotalOpExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getRdQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0382");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getTotalAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getGrossIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getGoodwillQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
        org.junit.Assert.assertNull(quarterlyDouble12);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0383");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData2 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        int int3 = companyDerivedData2.year;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData6 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        companyDerivedData6.year = 1;
        int int9 = companyDerivedData6.year;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived13 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("hi!", (int) (byte) -1, (int) ' ');
        java.util.List<java.lang.String> strList14 = indexDerived13.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived20 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived20.writeList("");
        java.util.List<java.lang.String> strList23 = indexDerived20.indexList;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray26 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList27, fieldDataArray26);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList29 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList23, 10, (int) (short) 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList27);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList30 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList14, 100, 0, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList27);
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived36 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived36.writeList("");
        java.util.List<java.lang.String> strList39 = indexDerived36.indexList;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray42 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList43 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList43, fieldDataArray42);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList45 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList39, 10, (int) (short) 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList43);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList46 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList14, (int) (byte) 0, 10, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList43);
        companyDerivedData6.dList = companyDerivedList46;
        companyDerivedData6.year = (short) 100;
        int int50 = companyDerivedData6.quarter;
        int int51 = companyDerivedData6.quarter;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData54 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData(100, (int) '#');
        int int55 = companyDerivedData54.quarter;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList56 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.getAgList();
        companyDerivedData54.dList = companyDerivedList56;
        companyDerivedData6.dList = companyDerivedList56;
        companyDerivedData2.dList = companyDerivedList56;
        int int60 = companyDerivedData2.quarter;
        companyDerivedData2.quarter = (byte) 1;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData65 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData(100, (int) '#');
        int int66 = companyDerivedData65.quarter;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList67 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.getAgList();
        companyDerivedData65.dList = companyDerivedList67;
        companyDerivedData2.dList = companyDerivedList67;
        companyDerivedData2.year = (short) -1;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(fieldDataArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(companyDerivedList29);
        org.junit.Assert.assertNotNull(companyDerivedList30);
        org.junit.Assert.assertNotNull(strList39);
        org.junit.Assert.assertNotNull(fieldDataArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(companyDerivedList45);
        org.junit.Assert.assertNotNull(companyDerivedList46);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 35 + "'", int55 == 35);
        org.junit.Assert.assertNotNull(companyDerivedList56);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 35 + "'", int66 == 35);
        org.junit.Assert.assertNotNull(companyDerivedList67);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0384");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) (short) -1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getCogsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0385");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) (byte) 100, (int) 'a', fieldData2);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0386");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getAcctPayableQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getLiabEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getCashFromInvQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getCashFromFinQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getSalesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getPreTaxIncQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
        org.junit.Assert.assertNull(quarterlyDouble12);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0387");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getCurrentRatioQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherLtAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getNonrecurringItemsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getIncTaxQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0388");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.write(0, (int) (byte) 100);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0389");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", (int) (short) 10, (int) (short) 10);
        boolean boolean5 = indexDerived3.isInList("");
        indexDerived3.listName = "";
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived11 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived11.writeList("");
        java.util.List<java.lang.String> strList14 = indexDerived11.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived18 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived18.writeList("");
        java.util.List<java.lang.String> strList21 = indexDerived18.indexList;
        indexDerived11.indexList = strList21;
        indexDerived11.readList("");
        java.util.List<java.lang.String> strList25 = indexDerived11.indexList;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray28 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList29 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList29, fieldDataArray28);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList31 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList25, (int) 'a', (int) (byte) 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList29);
        indexDerived3.indexList = strList25;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived36 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived36.writeList("");
        java.util.List<java.lang.String> strList39 = indexDerived36.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived45 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("hi!", (int) (byte) -1, (int) ' ');
        java.util.List<java.lang.String> strList46 = indexDerived45.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived52 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived52.writeList("");
        java.util.List<java.lang.String> strList55 = indexDerived52.indexList;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray58 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList59 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList59, fieldDataArray58);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList61 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList55, 10, (int) (short) 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList59);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList62 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList46, 100, 0, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList59);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList63 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList39, (int) (byte) 1, (int) (short) 0, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList59);
        indexDerived3.addToList(strList39);
        indexDerived3.writeList("");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(fieldDataArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(companyDerivedList31);
        org.junit.Assert.assertNotNull(strList39);
        org.junit.Assert.assertNotNull(strList46);
        org.junit.Assert.assertNotNull(strList55);
        org.junit.Assert.assertNotNull(fieldDataArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(companyDerivedList61);
        org.junit.Assert.assertNotNull(companyDerivedList62);
        org.junit.Assert.assertNotNull(companyDerivedList63);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0390");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getNetcashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getLtDebtQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0391");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getCogsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getCashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getCashFromInvQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0392");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        boolean boolean4 = companyDerived3.isValid();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getNetcashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getTotalOpExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getGrossOpIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getAcctPayableQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getTotalOpExpQdata();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0393");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getAcctPayableQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getLiabEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getCashFromInvQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getCashFromFinQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getEquityQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0394");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getIncPrimaryEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getTotalOpExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getNonrecurringItemsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getIntExpNonOpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getDivCostQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0395");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getCurrentRatioQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherLtAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getInventoryQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getSalesQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0396");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData2 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((int) (short) 0, (int) (short) 100);
        companyDerivedData2.quarter = 0;
        int int5 = companyDerivedData2.quarter;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0397");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 0, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData> companyDerivedDataList4 = indexDerived3.idList;
        org.junit.Assert.assertNull(companyDerivedDataList4);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0398");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getCurrentRatioQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getLtInvestQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0399");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getGrossOpIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getWcfcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getLtInvestQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0400");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived3.writeList("");
        indexDerived3.valid = false;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived11 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("hi!", (int) (byte) -1, (int) ' ');
        java.util.List<java.lang.String> strList12 = indexDerived11.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived18 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived18.writeList("");
        java.util.List<java.lang.String> strList21 = indexDerived18.indexList;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList25, fieldDataArray24);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList27 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList21, 10, (int) (short) 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList25);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList28 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList12, 100, 0, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList25);
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived34 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived34.writeList("");
        java.util.List<java.lang.String> strList37 = indexDerived34.indexList;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray40 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList41 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList41, fieldDataArray40);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList43 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList37, 10, (int) (short) 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList41);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList44 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList12, (int) (byte) 0, 10, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList41);
        indexDerived3.addToList(strList12);
        indexDerived3.writeList("hi!");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(fieldDataArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(companyDerivedList27);
        org.junit.Assert.assertNotNull(companyDerivedList28);
        org.junit.Assert.assertNotNull(strList37);
        org.junit.Assert.assertNotNull(fieldDataArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(companyDerivedList43);
        org.junit.Assert.assertNotNull(companyDerivedList44);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0401");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        int int6 = companyDerived3.getYear();
        int int7 = companyDerived3.getYear();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0402");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        int int5 = companyDerived3.getQuarter();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getWorkingCapitalQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getStDebtQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0403");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        int int5 = companyDerived3.getQuarter();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getWorkingCapitalQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getIncPrimaryEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getCashFromInvQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getRdQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyDerived3.getCashFromInvQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
        org.junit.Assert.assertNull(quarterlyDouble12);
        org.junit.Assert.assertNull(quarterlyDouble13);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0404");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) (short) -1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getAcctRxQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0405");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getCurrentRatioQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getAdjToIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getEpsContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getOtherIncQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0406");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getPeQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getStDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getPrefStockQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getSalesQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0407");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived3.writeList("");
        java.util.List<java.lang.String> strList6 = indexDerived3.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived10 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived10.writeList("");
        java.util.List<java.lang.String> strList13 = indexDerived10.indexList;
        indexDerived3.indexList = strList13;
        indexDerived3.valid = false;
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0408");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.loadDb((int) (short) 0, (int) (byte) 100, filetypeEnum2);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0409");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.write((int) (short) 1, (int) (byte) 10);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0410");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived(100, (int) 'a', fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getInventoryQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEpsContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getGoodwillQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0411");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getTotalAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getOtherCurrAssetsQdata();
        int int10 = companyDerived3.getQuarter();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getTanAssetsQdata();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = quarterlyDouble11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(quarterlyDouble11);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0412");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getTotalAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getCashFromFinQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getDepreciationQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0413");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getEpsContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getIncPrimaryEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getCashFromInvQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
        org.junit.Assert.assertNull(quarterlyDouble12);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0414");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getInventoryQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getBvpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getDividendQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0415");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getGrossOpIncQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0416");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getStInvestQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0417");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", (int) (short) 1, (int) '4');
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0418");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getCogsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getTotalOpExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getNetIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyDerived3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyDerived3.getCashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = companyDerived3.getCashflowQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
        org.junit.Assert.assertNull(quarterlyDouble12);
        org.junit.Assert.assertNull(quarterlyDouble13);
        org.junit.Assert.assertNull(quarterlyDouble14);
        org.junit.Assert.assertNull(quarterlyDouble15);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0419");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getRdQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getDivCostQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getCashFromInvQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getWcfcfQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0420");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getGrossOpIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getCashFromOpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getIntExpNonOpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getRdQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0421");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getCogsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getTotalOpExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getPrefStockQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getGrossIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getPeQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getEpsContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyDerived3.getNetFixedAssetsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
        org.junit.Assert.assertNull(quarterlyDouble12);
        org.junit.Assert.assertNull(quarterlyDouble13);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0422");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        int int5 = companyDerived3.getQuarter();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getWorkingCapitalQdata();
        java.lang.Class<?> wildcardClass10 = companyDerived3.getClass();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0423");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        int int5 = companyDerived3.getQuarter();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getIncTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getLtDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getLtDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getFcfQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0424");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData2 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((int) (byte) -1, (int) 'a');
        int int3 = companyDerivedData2.year;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0425");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.write((int) (byte) 10, (int) (byte) 10);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0426");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getAcctPayableQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0427");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getEpsContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getCapExQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0428");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getCogsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getTotalOpExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getPeQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
        org.junit.Assert.assertNull(quarterlyDouble12);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0429");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getGrossOpIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getNetcashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getIntTotQdata();
        boolean boolean9 = companyDerived3.isValid();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getLtInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getPeQdata();
        boolean boolean12 = companyDerived3.isValid();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0430");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getCogsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getTotalOpExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getCashFromInvQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0431");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getCurrentRatioQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getAdjToIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getEpsContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getInventoryQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0432");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) (byte) 0, 35, fieldData2);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0433");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", (int) (short) 10, (int) (short) 10);
        boolean boolean5 = indexDerived3.isInList("");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData> companyDerivedDataList6 = indexDerived3.idList;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(companyDerivedDataList6);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0434");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        int int5 = companyDerived3.getQuarter();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getNonrecurringItemsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getPrefStockQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0435");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData2 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        companyDerivedData2.year = 1;
        int int5 = companyDerivedData2.year;
        companyDerivedData2.quarter = (short) 1;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList8 = companyDerivedData2.dList;
        companyDerivedData2.quarter = (short) -1;
        companyDerivedData2.quarter = 100;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(companyDerivedList8);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0436");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getRdQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getBvpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getAdjToIncQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0437");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.write(35, (int) '4');
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0438");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getAcctPayableQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0439");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived(35, (int) (short) -1, fieldData2);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0440");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        boolean boolean4 = companyDerived3.isValid();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getNetcashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getTotalOpExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getIntTotQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getCashFromInvQdata();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0441");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("hi!", (int) (byte) -1, (int) ' ');
        java.util.List<java.lang.String> strList4 = indexDerived3.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData7 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        companyDerivedData7.year = 1;
        int int10 = companyDerivedData7.year;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData13 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData16 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((int) (short) 0, 0);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData19 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData22 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        companyDerivedData22.year = 1;
        int int25 = companyDerivedData22.year;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList26 = companyDerivedData22.dList;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData29 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        companyDerivedData29.year = 1;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList32 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.getAgList();
        companyDerivedData29.dList = companyDerivedList32;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData[] companyDerivedDataArray34 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData[] { companyDerivedData7, companyDerivedData13, companyDerivedData16, companyDerivedData19, companyDerivedData22, companyDerivedData29 };
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData> companyDerivedDataList35 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData>) companyDerivedDataList35, companyDerivedDataArray34);
        indexDerived3.idList = companyDerivedDataList35;
        java.util.List<java.lang.String> strList38 = indexDerived3.indexList;
        boolean boolean39 = indexDerived3.valid;
        boolean boolean40 = indexDerived3.valid;
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(companyDerivedList26);
        org.junit.Assert.assertNotNull(companyDerivedList32);
        org.junit.Assert.assertNotNull(companyDerivedDataArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(strList38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0442");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", (int) (byte) 1, (int) (short) 1);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0443");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getNetcashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getLiabEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getOtherLtAssetsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0444");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived3.writeList("");
        java.util.List<java.lang.String> strList6 = indexDerived3.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived10 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived10.writeList("");
        java.util.List<java.lang.String> strList13 = indexDerived10.indexList;
        indexDerived3.indexList = strList13;
        indexDerived3.readList("");
        java.util.List<java.lang.String> strList17 = indexDerived3.indexList;
        indexDerived3.readList("");
        boolean boolean20 = indexDerived3.valid;
        java.util.List<java.lang.String> strList21 = indexDerived3.indexList;
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strList21);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0445");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getCogsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getTotalOpExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getPrefStockQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getTanAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getRdQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getCogsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
        org.junit.Assert.assertNull(quarterlyDouble12);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0446");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getTotalAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getOtherCurrAssetsQdata();
        int int10 = companyDerived3.getQuarter();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getPrefStockQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getCurrentRatioQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(quarterlyDouble11);
        org.junit.Assert.assertNull(quarterlyDouble12);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0447");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getIncPrimaryEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getTotalOpExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getNonrecurringItemsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getLtInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getLiabEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getRoeQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0448");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getRdQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getIncPrimaryEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getCashFromFinQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getTotalLiabQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0449");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived3.writeList("");
        java.util.List<java.lang.String> strList6 = indexDerived3.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived10 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived10.writeList("");
        java.util.List<java.lang.String> strList13 = indexDerived10.indexList;
        indexDerived3.indexList = strList13;
        boolean boolean15 = indexDerived3.valid;
        boolean boolean16 = indexDerived3.valid;
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0450");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getSalesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getStDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getCashFromFinQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyDerived3.getPreTaxIncQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
        org.junit.Assert.assertNull(quarterlyDouble12);
        org.junit.Assert.assertNull(quarterlyDouble13);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0451");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) (short) -1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getIntExpNonOpQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0452");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData2 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData5 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList6 = companyDerivedData5.dList;
        companyDerivedData2.dList = companyDerivedList6;
        companyDerivedData2.year = 0;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList10 = companyDerivedData2.dList;
        org.junit.Assert.assertNotNull(companyDerivedList6);
        org.junit.Assert.assertNotNull(companyDerivedList10);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0453");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        int int5 = companyDerived3.getQuarter();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getWorkingCapitalQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getLiabEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getIntExpNonOpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyDerived3.getOtherLtLiabQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
        org.junit.Assert.assertNull(quarterlyDouble12);
        org.junit.Assert.assertNull(quarterlyDouble13);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0454");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getRdQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getBvpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getEquityQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0455");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getGrossIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getSalesQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0456");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData2 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData(1, (int) (byte) 1);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0457");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getPeQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getAcctPayableQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0458");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData2 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        companyDerivedData2.year = ' ';
        companyDerivedData2.year = (short) 10;
        int int7 = companyDerivedData2.quarter;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0459");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived4 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived4.writeList("");
        java.util.List<java.lang.String> strList7 = indexDerived4.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived11 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived11.writeList("");
        java.util.List<java.lang.String> strList14 = indexDerived11.indexList;
        indexDerived4.indexList = strList14;
        indexDerived4.readList("");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived22 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived22.writeList("");
        java.util.List<java.lang.String> strList25 = indexDerived22.indexList;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray28 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList29 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList29, fieldDataArray28);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList31 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList25, 10, (int) (short) 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList29);
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived34 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", strList25, (int) (byte) 0, 100);
        indexDerived4.addToList(strList25);
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived38 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", strList25, 100, (int) (byte) -1);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(fieldDataArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(companyDerivedList31);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0460");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) (byte) -1, 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getStDebtQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0461");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getCashFromFinQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getIntExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getEpsDilContQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0462");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getAcctPayableQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getLiabEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getCashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getLtInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getLiabEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyDerived3.getFcfQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
        org.junit.Assert.assertNull(quarterlyDouble12);
        org.junit.Assert.assertNull(quarterlyDouble13);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0463");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.loadDb((int) ' ', (int) (short) -1, filetypeEnum2);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0464");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getEpsContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getIncPrimaryEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getLiabEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyDerived3.getIntExpQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
        org.junit.Assert.assertNull(quarterlyDouble12);
        org.junit.Assert.assertNull(quarterlyDouble13);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0465");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("hi!", (int) (short) 0, 0);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0466");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getIncTaxQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0467");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getIncPrimaryEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getTanAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getWcfcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getRoeQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0468");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived4 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("hi!", (int) (byte) -1, (int) ' ');
        java.util.List<java.lang.String> strList5 = indexDerived4.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived8 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", strList5, 1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData> companyDerivedDataList9 = indexDerived8.idList;
        java.lang.String str10 = indexDerived8.listName;
        java.util.List<java.lang.String> strList11 = indexDerived8.indexList;
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNull(companyDerivedDataList9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0469");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.loadDb(35, 10, filetypeEnum2);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0470");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getNetcashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getGoodwillQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0471");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getTotalAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getOtherCurrAssetsQdata();
        boolean boolean9 = companyDerived3.isValid();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getIntExpQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
        org.junit.Assert.assertNull(quarterlyDouble12);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0472");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getIncPrimaryEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getTanAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getLtInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getDividendQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0473");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getEpsContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getCashFromFinQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0474");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        int int5 = companyDerived3.getQuarter();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getLtInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getWcfcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getCashFromOpsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0475");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getLtDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getNetIncQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0476");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getCogsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getTotalOpExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getPrefStockQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getRoeQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyDerived3.getCashFromOpsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
        org.junit.Assert.assertNull(quarterlyDouble12);
        org.junit.Assert.assertNull(quarterlyDouble13);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0477");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getNetIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getNetcashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getCapExQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getNetcashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getCogsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyDerived3.getOtherLtLiabQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
        org.junit.Assert.assertNull(quarterlyDouble12);
        org.junit.Assert.assertNull(quarterlyDouble13);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0478");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getIntTotQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getNonrecurringItemsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0479");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", (int) '#', 1);
        indexDerived3.writeList("hi!");
        boolean boolean6 = indexDerived3.valid;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0480");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getIncTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getRoeQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getCashQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0481");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getCogsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getStInvestQdata();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = quarterlyDouble8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0482");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        int int5 = companyDerived3.getYear();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherCurrLiabQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNull(quarterlyDouble6);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0483");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived5 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("hi!", (int) (byte) -1, (int) ' ');
        java.util.List<java.lang.String> strList6 = indexDerived5.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived12 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived12.writeList("");
        java.util.List<java.lang.String> strList15 = indexDerived12.indexList;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray18 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList19, fieldDataArray18);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList21 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList15, 10, (int) (short) 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList19);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList22 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList6, 100, 0, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList19);
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived28 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived28.writeList("");
        java.util.List<java.lang.String> strList31 = indexDerived28.indexList;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray34 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList35 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35, fieldDataArray34);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList37 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList31, 10, (int) (short) 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList38 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList6, (int) (byte) 0, 10, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35);
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived41 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", strList6, (int) 'a', (int) (byte) 100);
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived44 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", strList6, (int) (byte) 1, (-1));
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(fieldDataArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(companyDerivedList21);
        org.junit.Assert.assertNotNull(companyDerivedList22);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertNotNull(fieldDataArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(companyDerivedList37);
        org.junit.Assert.assertNotNull(companyDerivedList38);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0484");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getCurrentRatioQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getAdjToIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getTotalOpExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getCogsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getRdQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0485");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getRdQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getIncPrimaryEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getCashFromFinQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getStDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getGrossOpIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyDerived3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyDerived3.getEquityQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
        org.junit.Assert.assertNull(quarterlyDouble12);
        org.junit.Assert.assertNull(quarterlyDouble13);
        org.junit.Assert.assertNull(quarterlyDouble14);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0486");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getIntExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getWcfcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getCurrAssetsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0487");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("hi!", (int) (byte) -1, (int) ' ');
        java.util.List<java.lang.String> strList4 = indexDerived3.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData7 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        companyDerivedData7.year = 1;
        int int10 = companyDerivedData7.year;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData13 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData16 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((int) (short) 0, 0);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData19 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData22 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        companyDerivedData22.year = 1;
        int int25 = companyDerivedData22.year;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList26 = companyDerivedData22.dList;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData29 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        companyDerivedData29.year = 1;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList32 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.getAgList();
        companyDerivedData29.dList = companyDerivedList32;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData[] companyDerivedDataArray34 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData[] { companyDerivedData7, companyDerivedData13, companyDerivedData16, companyDerivedData19, companyDerivedData22, companyDerivedData29 };
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData> companyDerivedDataList35 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData>) companyDerivedDataList35, companyDerivedDataArray34);
        indexDerived3.idList = companyDerivedDataList35;
        java.util.List<java.lang.String> strList38 = indexDerived3.indexList;
        boolean boolean39 = indexDerived3.valid;
        boolean boolean41 = indexDerived3.isInList("hi!");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived45 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", (int) (byte) 10, 100);
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList50 = new java.util.ArrayList<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList50, strArray49);
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived54 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", (java.util.List<java.lang.String>) strList50, 1, (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData> companyDerivedDataList55 = indexDerived54.idList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived59 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("hi!", (int) (byte) -1, (int) ' ');
        java.util.List<java.lang.String> strList60 = indexDerived59.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData63 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        companyDerivedData63.year = 1;
        int int66 = companyDerivedData63.year;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData69 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData72 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((int) (short) 0, 0);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData75 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData78 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        companyDerivedData78.year = 1;
        int int81 = companyDerivedData78.year;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList82 = companyDerivedData78.dList;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData85 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        companyDerivedData85.year = 1;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList88 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.getAgList();
        companyDerivedData85.dList = companyDerivedList88;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData[] companyDerivedDataArray90 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData[] { companyDerivedData63, companyDerivedData69, companyDerivedData72, companyDerivedData75, companyDerivedData78, companyDerivedData85 };
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData> companyDerivedDataList91 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData>();
        boolean boolean92 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData>) companyDerivedDataList91, companyDerivedDataArray90);
        indexDerived59.idList = companyDerivedDataList91;
        indexDerived54.idList = companyDerivedDataList91;
        indexDerived45.idList = companyDerivedDataList91;
        indexDerived3.idList = companyDerivedDataList91;
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(companyDerivedList26);
        org.junit.Assert.assertNotNull(companyDerivedList32);
        org.junit.Assert.assertNotNull(companyDerivedDataArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(strList38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNull(companyDerivedDataList55);
        org.junit.Assert.assertNotNull(strList60);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 1 + "'", int81 == 1);
        org.junit.Assert.assertNotNull(companyDerivedList82);
        org.junit.Assert.assertNotNull(companyDerivedList88);
        org.junit.Assert.assertNotNull(companyDerivedDataArray90);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0488");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        int int5 = companyDerived3.getQuarter();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getLtInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getIntExpNonOpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getCashFromInvQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0489");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getPeQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getStDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getPrefStockQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getCurrentRatioQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getOtherCurrAssetsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0490");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getRdQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getIncPrimaryEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getIntExpNonOpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getIntTotQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getInventoryQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
        org.junit.Assert.assertNull(quarterlyDouble12);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0491");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getCashFromInvQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0492");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getCogsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getTotalOpExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getPrefStockQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getGrossIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getPeQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getEpsDilQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
        org.junit.Assert.assertNull(quarterlyDouble12);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0493");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        int int5 = companyDerived3.getQuarter();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getWcfcfQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0494");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("hi!", (int) (byte) -1, (int) ' ');
        java.util.List<java.lang.String> strList4 = indexDerived3.indexList;
        java.lang.String str5 = indexDerived3.listName;
        java.lang.String str6 = indexDerived3.listName;
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0495");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getStDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getLtInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getTanAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getTotalOpExpQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0496");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getGrossOpIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getNetcashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getIntTotQdata();
        boolean boolean9 = companyDerived3.isValid();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getLtInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getInventoryQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyDerived3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyDerived3.getInventoryQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
        org.junit.Assert.assertNull(quarterlyDouble12);
        org.junit.Assert.assertNull(quarterlyDouble13);
        org.junit.Assert.assertNull(quarterlyDouble14);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0497");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived3.writeList("");
        java.util.List<java.lang.String> strList6 = indexDerived3.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived10 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived10.writeList("");
        java.util.List<java.lang.String> strList13 = indexDerived10.indexList;
        indexDerived3.indexList = strList13;
        indexDerived3.readList("");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived21 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived21.writeList("");
        java.util.List<java.lang.String> strList24 = indexDerived21.indexList;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList28 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList28, fieldDataArray27);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList30 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList24, 10, (int) (short) 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList28);
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived33 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", strList24, (int) (byte) 0, 100);
        indexDerived3.addToList(strList24);
        indexDerived3.listName = "";
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(fieldDataArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(companyDerivedList30);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0498");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        int int5 = companyDerived3.getQuarter();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getWorkingCapitalQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getIntExpNonOpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getNetMarginQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0499");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getRdQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getBvpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getGrossOpIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getPreTaxIncQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0500");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getTotalAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getEpsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }
}

