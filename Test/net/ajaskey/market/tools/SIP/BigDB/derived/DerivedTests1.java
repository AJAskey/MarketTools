package net.ajaskey.market.tools.SIP.BigDB.derived;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DerivedTests1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0501");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData2 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        companyDerivedData2.year = 1;
        int int5 = companyDerivedData2.year;
        companyDerivedData2.quarter = (short) 1;
        int int8 = companyDerivedData2.year;
        int int9 = companyDerivedData2.quarter;
        companyDerivedData2.year = (byte) 10;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0502");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", (int) '#', 1);
        boolean boolean5 = indexDerived3.isInList("hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0503");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        int int5 = companyDerived3.getQuarter();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getLtInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getCurrAssetsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0504");
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
        boolean boolean27 = indexDerived3.isInList("hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0505");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getTotalAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getTotalLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getIncPrimaryEpsQdata();
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
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0506");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 100, (int) (byte) -1);
        java.util.List<java.lang.String> strList4 = null;
        indexDerived3.addToList(strList4);
        boolean boolean7 = indexDerived3.isInList("hi!");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData> companyDerivedDataList8 = indexDerived3.idList;
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(companyDerivedDataList8);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0507");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getStDebtQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0508");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getCogsQdata();
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
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0509");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getNetMarginQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0510");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        boolean boolean4 = companyDerived3.isValid();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getEquityQdata();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0511");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) (short) 1, (int) (byte) 100, fieldData2);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0512");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getBvpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyDerived3.getOtherCurrAssetsQdata();
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
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0513");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getAdjToIncQdata();
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
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0514");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) (short) -1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getSalesQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0515");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getFcfQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0516");
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
        boolean boolean42 = indexDerived3.isInList("");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived46 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("hi!", (int) (byte) -1, (int) ' ');
        java.util.List<java.lang.String> strList47 = indexDerived46.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData50 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        companyDerivedData50.year = 1;
        int int53 = companyDerivedData50.year;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData56 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData59 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((int) (short) 0, 0);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData62 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData65 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        companyDerivedData65.year = 1;
        int int68 = companyDerivedData65.year;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList69 = companyDerivedData65.dList;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData72 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        companyDerivedData72.year = 1;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList75 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.getAgList();
        companyDerivedData72.dList = companyDerivedList75;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData[] companyDerivedDataArray77 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData[] { companyDerivedData50, companyDerivedData56, companyDerivedData59, companyDerivedData62, companyDerivedData65, companyDerivedData72 };
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData> companyDerivedDataList78 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData>) companyDerivedDataList78, companyDerivedDataArray77);
        indexDerived46.idList = companyDerivedDataList78;
        indexDerived3.idList = companyDerivedDataList78;
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNull(companyDerivedDataList39);
        org.junit.Assert.assertNull(companyDerivedDataList40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(strList47);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
        org.junit.Assert.assertNotNull(companyDerivedList69);
        org.junit.Assert.assertNotNull(companyDerivedList75);
        org.junit.Assert.assertNotNull(companyDerivedDataArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0517");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        java.util.List<java.lang.String> strList4 = indexDerived3.indexList;
        indexDerived3.readList("");
        indexDerived3.valid = false;
        indexDerived3.listName = "";
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived15 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived15.writeList("");
        java.util.List<java.lang.String> strList18 = indexDerived15.indexList;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray21 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList22, fieldDataArray21);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList24 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList18, 10, (int) (short) 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList22);
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived27 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", strList18, (int) (byte) 0, 100);
        indexDerived3.addToList(strList18);
        java.lang.String str29 = indexDerived3.listName;
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(fieldDataArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(companyDerivedList24);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0518");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getLiabEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getTotalOpExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getCashFromInvQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getCashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getIntTotQdata();
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
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0519");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getCurrentRatioQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getSalesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getCogsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0520");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        boolean boolean4 = companyDerived3.isValid();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getDividendQdata();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0521");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getTotalLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getTotalAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getNonrecurringItemsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0522");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        int int5 = companyDerived3.getQuarter();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getCogsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getLtDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getCashFromOpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getEpsContQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0523");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        boolean boolean4 = companyDerived3.isValid();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getWcfcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getOtherLtAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getFcfQdata();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0524");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) (short) -1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getAdjToIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getGrossIncQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0525");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived(100, (int) 'a', fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getInventoryQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getStDebtQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0526");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyDerived3.getAcctPayableQdata();
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
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0527");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getCurrentRatioQdata();
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
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0528");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.loadDb((int) (byte) 1, (int) (short) 10, filetypeEnum2);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0529");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getCogsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getTotalOpExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getPrefStockQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getTanAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getLtDebtQdata();
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
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0530");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        java.util.List<java.lang.String> strList4 = indexDerived3.indexList;
        indexDerived3.valid = true;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData> companyDerivedDataList7 = indexDerived3.idList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived11 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived11.writeList("");
        java.util.List<java.lang.String> strList14 = indexDerived11.indexList;
        indexDerived3.indexList = strList14;
        boolean boolean16 = indexDerived3.valid;
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNull(companyDerivedDataList7);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0531");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getIncTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getRoeQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getIncTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getNetIncQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0532");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", (int) (short) 1, (int) (short) 100);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0533");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived3.writeList("");
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
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived48 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("hi!", (int) (byte) -1, (int) ' ');
        java.util.List<java.lang.String> strList49 = indexDerived48.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived55 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived55.writeList("");
        java.util.List<java.lang.String> strList58 = indexDerived55.indexList;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray61 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList62 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList62, fieldDataArray61);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList64 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList58, 10, (int) (short) 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList62);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList65 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList49, 100, 0, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList62);
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived71 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived71.writeList("");
        java.util.List<java.lang.String> strList74 = indexDerived71.indexList;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray77 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList78 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList78, fieldDataArray77);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList80 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList74, 10, (int) (short) 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList78);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList81 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList49, (int) (byte) 0, 10, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList78);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList82 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList10, (int) (byte) 1, 0, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList78);
        indexDerived3.indexList = strList10;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData> companyDerivedDataList84 = indexDerived3.idList;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass85 = companyDerivedDataList84.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(strList49);
        org.junit.Assert.assertNotNull(strList58);
        org.junit.Assert.assertNotNull(fieldDataArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(companyDerivedList64);
        org.junit.Assert.assertNotNull(companyDerivedList65);
        org.junit.Assert.assertNotNull(strList74);
        org.junit.Assert.assertNotNull(fieldDataArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(companyDerivedList80);
        org.junit.Assert.assertNotNull(companyDerivedList81);
        org.junit.Assert.assertNotNull(companyDerivedList82);
        org.junit.Assert.assertNull(companyDerivedDataList84);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0534");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        int int5 = companyDerived3.getQuarter();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getIncTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getLtDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getIntExpNonOpQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0535");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyDerived3.getOtherCurrLiabQdata();
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
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0536");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived(0, (int) (short) 100, fieldData2);
        int int4 = companyDerived3.getYear();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherCurrLiabQdata();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(quarterlyDouble5);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0537");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.loadDb(0, (int) (byte) 100, filetypeEnum2);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0538");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData2 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData(35, (int) '4');
        companyDerivedData2.quarter = (byte) 100;
        companyDerivedData2.quarter = (byte) 0;
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0539");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getPeQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getStDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getPrefStockQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getCurrentRatioQdata();
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
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0540");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getTotalAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getOtherCurrAssetsQdata();
        int int10 = companyDerived3.getQuarter();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getCurrentRatioQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getOtherLtAssetsQdata();
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
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0541");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getIncPrimaryEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getTanAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getLtInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getTanAssetsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0542");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", (int) '#', 1);
        java.util.List<java.lang.String> strList4 = null;
        indexDerived3.indexList = strList4;
        indexDerived3.valid = false;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData> companyDerivedDataList8 = indexDerived3.idList;
        org.junit.Assert.assertNull(companyDerivedDataList8);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0543");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData2 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData(100, (int) '#');
        int int3 = companyDerivedData2.quarter;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList4 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.getAgList();
        companyDerivedData2.dList = companyDerivedList4;
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
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData46 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData(100, (int) '#');
        int int47 = companyDerivedData46.quarter;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList48 = companyDerivedData46.dList;
        companyDerivedData2.dList = companyDerivedList48;
        int int50 = companyDerivedData2.year;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertNotNull(companyDerivedList4);
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
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 35 + "'", int47 == 35);
        org.junit.Assert.assertNotNull(companyDerivedList48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 100 + "'", int50 == 100);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0544");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("hi!", 1, (int) (short) -1);
        indexDerived3.valid = true;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived9 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", (int) (short) 10, (int) (short) 10);
        boolean boolean11 = indexDerived9.isInList("");
        indexDerived9.listName = "";
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived17 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived17.writeList("");
        java.util.List<java.lang.String> strList20 = indexDerived17.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived24 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived24.writeList("");
        java.util.List<java.lang.String> strList27 = indexDerived24.indexList;
        indexDerived17.indexList = strList27;
        indexDerived17.readList("");
        java.util.List<java.lang.String> strList31 = indexDerived17.indexList;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray34 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList35 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35, fieldDataArray34);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList37 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList31, (int) 'a', (int) (byte) 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35);
        indexDerived9.indexList = strList31;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived42 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived42.writeList("");
        java.util.List<java.lang.String> strList45 = indexDerived42.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived51 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("hi!", (int) (byte) -1, (int) ' ');
        java.util.List<java.lang.String> strList52 = indexDerived51.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived58 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived58.writeList("");
        java.util.List<java.lang.String> strList61 = indexDerived58.indexList;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray64 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList65 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList65, fieldDataArray64);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList67 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList61, 10, (int) (short) 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList65);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList68 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList52, 100, 0, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList65);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList69 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList45, (int) (byte) 1, (int) (short) 0, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList65);
        indexDerived9.addToList(strList45);
        indexDerived3.indexList = strList45;
        indexDerived3.valid = false;
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertNotNull(fieldDataArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(companyDerivedList37);
        org.junit.Assert.assertNotNull(strList45);
        org.junit.Assert.assertNotNull(strList52);
        org.junit.Assert.assertNotNull(strList61);
        org.junit.Assert.assertNotNull(fieldDataArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(companyDerivedList67);
        org.junit.Assert.assertNotNull(companyDerivedList68);
        org.junit.Assert.assertNotNull(companyDerivedList69);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0545");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getBvpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getWorkingCapitalQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0546");
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
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived46 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("hi!", (int) (byte) -1, (int) ' ');
        java.util.List<java.lang.String> strList47 = indexDerived46.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived53 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived53.writeList("");
        java.util.List<java.lang.String> strList56 = indexDerived53.indexList;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray59 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList60 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList60, fieldDataArray59);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList62 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList56, 10, (int) (short) 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList60);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList63 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList47, 100, 0, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList60);
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived69 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived69.writeList("");
        java.util.List<java.lang.String> strList72 = indexDerived69.indexList;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray75 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList76 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList76, fieldDataArray75);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList78 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList72, 10, (int) (short) 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList76);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList79 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList47, (int) (byte) 0, 10, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList76);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList80 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList5, (int) (short) 1, 35, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList76);
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
        org.junit.Assert.assertNotNull(strList47);
        org.junit.Assert.assertNotNull(strList56);
        org.junit.Assert.assertNotNull(fieldDataArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(companyDerivedList62);
        org.junit.Assert.assertNotNull(companyDerivedList63);
        org.junit.Assert.assertNotNull(strList72);
        org.junit.Assert.assertNotNull(fieldDataArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(companyDerivedList78);
        org.junit.Assert.assertNotNull(companyDerivedList79);
        org.junit.Assert.assertNotNull(companyDerivedList80);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0547");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyDerived3.getLtDebtQdata();
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
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0548");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getWcfcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getLtDebtQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0549");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getTotalAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getOtherCurrAssetsQdata();
        int int10 = companyDerived3.getQuarter();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getCurrentRatioQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getInventoryQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyDerived3.getInventoryQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(quarterlyDouble11);
        org.junit.Assert.assertNull(quarterlyDouble12);
        org.junit.Assert.assertNull(quarterlyDouble13);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0550");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getTotalAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getOtherIncQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0551");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getTotalAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getInventoryQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getUnusualIncQdata();
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
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0552");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived8 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", (java.util.List<java.lang.String>) strList4, 1, (int) (short) 0);
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        indexDerived8.indexList = strList12;
        indexDerived8.writeList("");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0553");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getIncPrimaryEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getTanAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getSalesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getNonrecurringItemsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0554");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyDerived3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyDerived3.getAcctPayableQdata();
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
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0555");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) (byte) 1, 10, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getDivCostQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getIncTaxQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0556");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived3.writeList("");
        java.util.List<java.lang.String> strList6 = indexDerived3.indexList;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray9 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList10, fieldDataArray9);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList12 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList6, 10, (int) (short) 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList10);
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived18 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", (int) (short) 10, (int) (short) 10);
        boolean boolean20 = indexDerived18.isInList("");
        java.util.List<java.lang.String> strList21 = indexDerived18.indexList;
        java.util.List<java.lang.String> strList24 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived30 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("hi!", (int) (byte) -1, (int) ' ');
        java.util.List<java.lang.String> strList31 = indexDerived30.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived37 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived37.writeList("");
        java.util.List<java.lang.String> strList40 = indexDerived37.indexList;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray43 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList44 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList44, fieldDataArray43);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList46 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList40, 10, (int) (short) 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList44);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList47 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList31, 100, 0, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList44);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList48 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList24, 10, (-1), (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList44);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList49 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList21, 100, 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList44);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList50 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList6, 10, 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList44);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(fieldDataArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(companyDerivedList12);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertNotNull(strList40);
        org.junit.Assert.assertNotNull(fieldDataArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(companyDerivedList46);
        org.junit.Assert.assertNotNull(companyDerivedList47);
        org.junit.Assert.assertNotNull(companyDerivedList48);
        org.junit.Assert.assertNotNull(companyDerivedList49);
        org.junit.Assert.assertNotNull(companyDerivedList50);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0557");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getTotalAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getOtherCurrAssetsQdata();
        int int10 = companyDerived3.getQuarter();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getIntExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getRdQdata();
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
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0558");
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
        java.util.List<java.lang.String> strList41 = indexDerived3.indexList;
        boolean boolean43 = indexDerived3.isInList("hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNull(companyDerivedDataList39);
        org.junit.Assert.assertNull(companyDerivedDataList40);
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0559");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        int int5 = companyDerived3.getQuarter();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getWorkingCapitalQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getIncPrimaryEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getNetIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyDerived3.getCogsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyDerived3.getNonrecurringItemsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = companyDerived3.getCashflowQdata();
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
        org.junit.Assert.assertNull(quarterlyDouble14);
        org.junit.Assert.assertNull(quarterlyDouble15);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0560");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyDerived3.getWcfcfQdata();
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
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0561");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData2 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData(0, (int) ' ');
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0562");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("hi!", (int) (byte) -1, (int) ' ');
        java.util.List<java.lang.String> strList4 = indexDerived3.indexList;
        indexDerived3.valid = true;
        indexDerived3.valid = false;
        java.util.List<java.lang.String> strList9 = indexDerived3.indexList;
        indexDerived3.listName = "";
        java.util.List<java.lang.String> strList12 = indexDerived3.indexList;
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0563");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData2 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        companyDerivedData2.year = 1;
        int int5 = companyDerivedData2.year;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList6 = companyDerivedData2.dList;
        int int7 = companyDerivedData2.quarter;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList8 = companyDerivedData2.dList;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList9 = companyDerivedData2.dList;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(companyDerivedList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(companyDerivedList8);
        org.junit.Assert.assertNotNull(companyDerivedList9);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0564");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        int int5 = companyDerived3.getQuarter();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getNetMarginQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(quarterlyDouble6);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0565");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived4 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        java.util.List<java.lang.String> strList5 = indexDerived4.indexList;
        indexDerived4.listName = "";
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived11 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived11.writeList("");
        java.util.List<java.lang.String> strList14 = indexDerived11.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived18 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived18.writeList("");
        java.util.List<java.lang.String> strList21 = indexDerived18.indexList;
        indexDerived11.indexList = strList21;
        indexDerived4.addToList(strList21);
        indexDerived4.readList("");
        boolean boolean26 = indexDerived4.valid;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived30 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", (int) '#', 1);
        indexDerived30.writeList("hi!");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived36 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived36.writeList("");
        java.util.List<java.lang.String> strList39 = indexDerived36.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived43 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived43.writeList("");
        java.util.List<java.lang.String> strList46 = indexDerived43.indexList;
        indexDerived36.indexList = strList46;
        indexDerived36.readList("");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData> companyDerivedDataList50 = indexDerived36.idList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived54 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        java.util.List<java.lang.String> strList55 = indexDerived54.indexList;
        indexDerived54.readList("");
        indexDerived54.valid = false;
        indexDerived54.listName = "";
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived66 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived66.writeList("");
        java.util.List<java.lang.String> strList69 = indexDerived66.indexList;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray72 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList73 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList73, fieldDataArray72);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList75 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList69, 10, (int) (short) 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList73);
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived78 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", strList69, (int) (byte) 0, 100);
        indexDerived54.addToList(strList69);
        indexDerived36.indexList = strList69;
        indexDerived30.indexList = strList69;
        indexDerived4.addToList(strList69);
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived85 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", strList69, 0, (int) (short) 0);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(strList39);
        org.junit.Assert.assertNotNull(strList46);
        org.junit.Assert.assertNull(companyDerivedDataList50);
        org.junit.Assert.assertNotNull(strList55);
        org.junit.Assert.assertNotNull(strList69);
        org.junit.Assert.assertNotNull(fieldDataArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(companyDerivedList75);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0566");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getCogsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getRoeQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0567");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getLtDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getDepreciationQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0568");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getIntExpNonOpQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0569");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) (short) -1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getAdjToIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getGrossOpIncQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0570");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyDerived3.getFcfQdata();
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
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0571");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getTotalLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getIntExpNonOpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getGrossOpIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getAcctRxQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0572");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getAdjToIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getCashFromInvQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getLtInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getCashFromInvQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getDividendQdata();
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
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0573");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        int int5 = companyDerived3.getQuarter();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getWorkingCapitalQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getIntExpNonOpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getEpsContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getTotalLiabQdata();
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
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0574");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyDerived3.getOtherLtAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = companyDerived3.getLtInvestQdata();
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
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0575");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        int int5 = companyDerived3.getQuarter();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getWorkingCapitalQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getIncPrimaryEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getCurrLiabQdata();
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
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0576");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData2 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((int) (short) -1, (int) (short) 1);
        int int3 = companyDerivedData2.quarter;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0577");
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
        indexDerived3.readList("");
        boolean boolean43 = indexDerived3.valid;
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNull(companyDerivedDataList15);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertNotNull(fieldDataArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(companyDerivedList39);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0578");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData2 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData(0, (int) (byte) 0);
        companyDerivedData2.quarter = (short) 10;
        companyDerivedData2.quarter = (short) 100;
        companyDerivedData2.quarter = (short) 100;
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0579");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        int int5 = companyDerived3.getQuarter();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getWorkingCapitalQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getIntExpNonOpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getPricesQdata();
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
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0580");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived(100, 10, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyDerived3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0581");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getRdQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getRoeQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0582");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getGrossIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getOtherCurrLiabQdata();
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
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0583");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", (int) (short) 10, (int) (short) 10);
        java.util.List<java.lang.String> strList4 = indexDerived3.indexList;
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0584");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getGrossIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getEpsQdata();
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
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0585");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getBvpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyDerived3.getGrossIncQdata();
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
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0586");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getCogsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getTotalOpExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getTotalLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getNetcashflowQdata();
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
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0587");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData2 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        companyDerivedData2.year = ' ';
        int int5 = companyDerivedData2.year;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0588");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) (byte) 1, 10, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getAcctPayableQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0589");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyDerived3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = companyDerived3.getWorkingCapitalQdata();
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
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0590");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.loadDb((int) (byte) 100, 32, filetypeEnum2);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0591");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getIntExpNonOpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getCurrentRatioQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0592");
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
        boolean boolean42 = indexDerived3.valid;
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNull(companyDerivedDataList39);
        org.junit.Assert.assertNull(companyDerivedDataList40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0593");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getIntExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getWcfcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getDivCostQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0594");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getGrossOpIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getCashFromInvQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getCashFromOpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getCapExQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0595");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData2 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((int) (short) 10, 35);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0596");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getWorkingCapitalQdata();
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
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0597");
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
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived29 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", (int) '#', 1);
        indexDerived29.writeList("hi!");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived35 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived35.writeList("");
        java.util.List<java.lang.String> strList38 = indexDerived35.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived42 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived42.writeList("");
        java.util.List<java.lang.String> strList45 = indexDerived42.indexList;
        indexDerived35.indexList = strList45;
        indexDerived35.readList("");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData> companyDerivedDataList49 = indexDerived35.idList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived53 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        java.util.List<java.lang.String> strList54 = indexDerived53.indexList;
        indexDerived53.readList("");
        indexDerived53.valid = false;
        indexDerived53.listName = "";
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived65 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived65.writeList("");
        java.util.List<java.lang.String> strList68 = indexDerived65.indexList;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray71 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList72 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList72, fieldDataArray71);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList74 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList68, 10, (int) (short) 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList72);
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived77 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", strList68, (int) (byte) 0, 100);
        indexDerived53.addToList(strList68);
        indexDerived35.indexList = strList68;
        indexDerived29.indexList = strList68;
        indexDerived3.addToList(strList68);
        java.lang.String str82 = indexDerived3.listName;
        indexDerived3.listName = "hi!";
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strList38);
        org.junit.Assert.assertNotNull(strList45);
        org.junit.Assert.assertNull(companyDerivedDataList49);
        org.junit.Assert.assertNotNull(strList54);
        org.junit.Assert.assertNotNull(strList68);
        org.junit.Assert.assertNotNull(fieldDataArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(companyDerivedList74);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0598");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getGrossIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getNetIncQdata();
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
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0599");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getStDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getLtInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getNetcashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getCashFromFinQdata();
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
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0600");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getAcctPayableQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getLiabEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getLtDebtQdata();
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
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0601");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getCashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getNetcashflowQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0602");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived(100, (int) 'a', fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getInventoryQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEpsContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getIntExpNonOpQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0603");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPeQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getCashFromFinQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getLtDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getLtDebtQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0604");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getEquityQdata();
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
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0605");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getAcctPayableQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getLiabEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getCashflowQdata();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = quarterlyDouble10.getClass();
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
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0606");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = companyDerived3.getCurrentRatioQdata();
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
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0607");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getGrossOpIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getNetcashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getDivCostQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getOtherCurrAssetsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0608");
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
        indexDerived3.readList("");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(fieldDataArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(companyDerivedList30);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0609");
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
        int int60 = companyDerivedData2.year;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData63 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        companyDerivedData63.year = 1;
        int int66 = companyDerivedData63.year;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList67 = companyDerivedData63.dList;
        companyDerivedData2.dList = companyDerivedList67;
        int int69 = companyDerivedData2.year;
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
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertNotNull(companyDerivedList67);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0610");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getIncPrimaryEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getSalesQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0611");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getTotalAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getOtherCurrAssetsQdata();
        int int10 = companyDerived3.getQuarter();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getNetFixedAssetsQdata();
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
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0612");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getAcctPayableQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getBvpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getRoeQdata();
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
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0613");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getTotalAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getOtherCurrAssetsQdata();
        boolean boolean9 = companyDerived3.isValid();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getLtDebtQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0614");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getRdQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getDivCostQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getCashFromInvQdata();
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
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0615");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getIntTotQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getNetcashflowQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0616");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyDerived3.getFcfQdata();
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
        org.junit.Assert.assertNull(quarterlyDouble14);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0617");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) (short) 1, (int) (short) 10, fieldData2);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0618");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getNonrecurringItemsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getGrossOpIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getLtInvestQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0619");
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
        int int63 = companyDerivedData2.year;
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
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0620");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData2 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        companyDerivedData2.year = 1;
        int int5 = companyDerivedData2.year;
        companyDerivedData2.quarter = (short) 1;
        int int8 = companyDerivedData2.year;
        int int9 = companyDerivedData2.quarter;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData12 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((int) (short) 0, (int) (short) 100);
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived16 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("hi!", (int) (byte) -1, (int) ' ');
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived20 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("hi!", (int) (byte) -1, (int) ' ');
        java.util.List<java.lang.String> strList21 = indexDerived20.indexList;
        indexDerived16.indexList = strList21;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived28 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived28.writeList("");
        java.util.List<java.lang.String> strList31 = indexDerived28.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived37 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("hi!", (int) (byte) -1, (int) ' ');
        java.util.List<java.lang.String> strList38 = indexDerived37.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived44 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived44.writeList("");
        java.util.List<java.lang.String> strList47 = indexDerived44.indexList;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray50 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList51 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList51, fieldDataArray50);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList53 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList47, 10, (int) (short) 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList51);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList54 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList38, 100, 0, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList51);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList55 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList31, (int) (byte) 1, (int) (short) 0, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList51);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList56 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList21, (int) (short) -1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList51);
        companyDerivedData12.dList = companyDerivedList56;
        companyDerivedData2.dList = companyDerivedList56;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertNotNull(strList38);
        org.junit.Assert.assertNotNull(strList47);
        org.junit.Assert.assertNotNull(fieldDataArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(companyDerivedList53);
        org.junit.Assert.assertNotNull(companyDerivedList54);
        org.junit.Assert.assertNotNull(companyDerivedList55);
        org.junit.Assert.assertNotNull(companyDerivedList56);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0621");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyDerived3.getSharesQdata();
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
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0622");
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
        indexDerived3.writeList("");
        java.util.List<java.lang.String> strList65 = indexDerived3.indexList;
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
        org.junit.Assert.assertNotNull(strList65);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0623");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getCapExQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0624");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        int int5 = companyDerived3.getQuarter();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getIncTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getLtDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getOtherLtAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getBvpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getEpsDilQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0625");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        int int5 = companyDerived3.getYear();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getStDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getCogsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0626");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getTotalAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getPreTaxIncQdata();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = quarterlyDouble10.getClass();
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
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0627");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getGrossOpIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getNetcashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getSalesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getFcfQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0628");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getTotalLiabQdata();
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
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0629");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getTotalAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getTotalLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getIncAfterTaxQdata();
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
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0630");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getTotalLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getNonrecurringItemsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getLiabEquityQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0631");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyDerived3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyDerived3.getRoeQdata();
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
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0632");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getDividendQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getTanAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getEquityQdata();
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
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0633");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData2 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData(10, (-1));
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0634");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getGrossIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getCapExQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getIntTotQdata();
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
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0635");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.loadDb(10, 32, filetypeEnum2);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0636");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getDividendQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getTanAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getDividendQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getCurrentRatioQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getWcfcfQdata();
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
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0637");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getAcctPayableQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getIntExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getEpsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0638");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 100, (int) (byte) -1);
        java.util.List<java.lang.String> strList4 = null;
        indexDerived3.addToList(strList4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData> companyDerivedDataList6 = null;
        indexDerived3.idList = companyDerivedDataList6;
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0639");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        int int6 = companyDerived3.getYear();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getCashFromInvQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getCogsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0640");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyDerived3.getIntExpNonOpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyDerived3.getEpsDilQdata();
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
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0641");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 100, (int) (byte) -1);
        indexDerived3.listName = "hi!";
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
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived48 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("hi!", (int) (byte) -1, (int) ' ');
        java.util.List<java.lang.String> strList49 = indexDerived48.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived55 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived55.writeList("");
        java.util.List<java.lang.String> strList58 = indexDerived55.indexList;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray61 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList62 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList62, fieldDataArray61);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList64 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList58, 10, (int) (short) 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList62);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList65 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList49, 100, 0, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList62);
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived71 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived71.writeList("");
        java.util.List<java.lang.String> strList74 = indexDerived71.indexList;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray77 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList78 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList78, fieldDataArray77);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList80 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList74, 10, (int) (short) 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList78);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList81 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList49, (int) (byte) 0, 10, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList78);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList82 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList10, (int) (byte) 1, 0, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList78);
        indexDerived3.addToList(strList10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData> companyDerivedDataList84 = indexDerived3.idList;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData> companyDerivedDataList85 = indexDerived3.idList;
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
        org.junit.Assert.assertNotNull(strList49);
        org.junit.Assert.assertNotNull(strList58);
        org.junit.Assert.assertNotNull(fieldDataArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(companyDerivedList64);
        org.junit.Assert.assertNotNull(companyDerivedList65);
        org.junit.Assert.assertNotNull(strList74);
        org.junit.Assert.assertNotNull(fieldDataArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(companyDerivedList80);
        org.junit.Assert.assertNotNull(companyDerivedList81);
        org.junit.Assert.assertNotNull(companyDerivedList82);
        org.junit.Assert.assertNull(companyDerivedDataList84);
        org.junit.Assert.assertNull(companyDerivedDataList85);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0642");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getGrossOpIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getWorkingCapitalQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getDividendQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getIncAfterTaxQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0643");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived3.writeList("");
        java.util.List<java.lang.String> strList6 = indexDerived3.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived10 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived10.writeList("");
        java.util.List<java.lang.String> strList13 = indexDerived10.indexList;
        indexDerived3.indexList = strList13;
        indexDerived3.readList("");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData> companyDerivedDataList17 = indexDerived3.idList;
        indexDerived3.valid = true;
        indexDerived3.listName = "";
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNull(companyDerivedDataList17);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0644");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getCurrentRatioQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyDerived3.getNetcashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyDerived3.getNetFixedAssetsQdata();
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
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0645");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("hi!", (int) (byte) 10, 32);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0646");
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
        indexDerived3.listName = "";
        indexDerived3.writeList("hi!");
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
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0647");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getCurrentRatioQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getEpsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0648");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getEpsContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getIncPrimaryEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getLiabEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getNetFixedAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getAcctPayableQdata();
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
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0649");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getStDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getTotalOpExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getIncTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getWcfcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getDividendQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getIntExpNonOpQdata();
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
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0650");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getTotalAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getOtherCurrAssetsQdata();
        boolean boolean9 = companyDerived3.isValid();
        int int10 = companyDerived3.getQuarter();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getCogsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getLtDebtQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(quarterlyDouble11);
        org.junit.Assert.assertNull(quarterlyDouble12);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0651");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", (int) (short) 10, (int) (short) 10);
        boolean boolean5 = indexDerived3.isInList("");
        java.util.List<java.lang.String> strList6 = indexDerived3.indexList;
        boolean boolean8 = indexDerived3.isInList("");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData> companyDerivedDataList9 = indexDerived3.idList;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(companyDerivedDataList9);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0652");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getGrossIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getCapExQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getOpMarginQdata();
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
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0653");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        int int5 = companyDerived3.getQuarter();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getNonrecurringItemsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getIncPrimaryEpsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0654");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getCogsQdata();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = quarterlyDouble12.getClass();
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
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0655");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getCogsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getNetcashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getEquityQdata();
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
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0656");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getCogsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getTotalOpExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getAdjToIncQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0657");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyDerived3.getNonrecurringItemsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyDerived3.getCurrAssetsQdata();
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
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0658");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData2 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((int) '4', (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList3 = companyDerivedData2.dList;
        int int4 = companyDerivedData2.quarter;
        org.junit.Assert.assertNotNull(companyDerivedList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0659");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherLtAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getIntTotQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getEquityQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0660");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getDividendQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getGrossOpIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getTotalAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getPrefStockQdata();
        java.lang.Class<?> wildcardClass11 = companyDerived3.getClass();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0661");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getIncPrimaryEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getInventoryQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getPeQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getIncTaxQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0662");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getIncPrimaryEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getCogsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getSharesQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0663");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 100, (int) (byte) -1);
        java.util.List<java.lang.String> strList4 = indexDerived3.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived8 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived8.writeList("");
        java.util.List<java.lang.String> strList11 = indexDerived8.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived17 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("hi!", (int) (byte) -1, (int) ' ');
        java.util.List<java.lang.String> strList18 = indexDerived17.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived24 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived24.writeList("");
        java.util.List<java.lang.String> strList27 = indexDerived24.indexList;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray30 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList31 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList31, fieldDataArray30);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList33 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList27, 10, (int) (short) 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList31);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList34 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList18, 100, 0, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList31);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList35 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList11, (int) (byte) 1, (int) (short) 0, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList31);
        indexDerived3.addToList(strList11);
        indexDerived3.valid = false;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived42 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("hi!", (int) (byte) -1, (int) ' ');
        java.util.List<java.lang.String> strList43 = indexDerived42.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived49 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived49.writeList("");
        java.util.List<java.lang.String> strList52 = indexDerived49.indexList;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray55 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList56 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList56, fieldDataArray55);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList58 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList52, 10, (int) (short) 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList56);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList59 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList43, 100, 0, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList56);
        indexDerived3.addToList(strList43);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNotNull(fieldDataArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(companyDerivedList33);
        org.junit.Assert.assertNotNull(companyDerivedList34);
        org.junit.Assert.assertNotNull(companyDerivedList35);
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertNotNull(strList52);
        org.junit.Assert.assertNotNull(fieldDataArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(companyDerivedList58);
        org.junit.Assert.assertNotNull(companyDerivedList59);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0664");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        int int5 = companyDerived3.getQuarter();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getIncTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getLtDebtQdata();
        int int8 = companyDerived3.getQuarter();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getAcctPayableQdata();
        int int10 = companyDerived3.getQuarter();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0665");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyDerived3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyDerived3.getDividendQdata();
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
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0666");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getIntTotQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getRoeQdata();
        boolean boolean9 = companyDerived3.isValid();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0667");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getIntExpNonOpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getStDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getLtDebtQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0668");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyDerived3.getOtherIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = companyDerived3.getEpsDilQdata();
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
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0669");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPeQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getCashFromFinQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getLtDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getEquityQdata();
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
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0670");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getCogsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getTotalOpExpQdata();
        int int9 = companyDerived3.getQuarter();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getCashFromOpsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0671");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.loadDb(32, (int) (short) 0, filetypeEnum2);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0672");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        int int5 = companyDerived3.getQuarter();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getNetIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getCurrLiabQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0673");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getGrossIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getNetIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getCurrAssetsQdata();
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
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0674");
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
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData63 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData(0, (int) (byte) 0);
        int int64 = companyDerivedData63.year;
        java.util.List<java.lang.String> strList65 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived71 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived71.writeList("");
        java.util.List<java.lang.String> strList74 = indexDerived71.indexList;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray77 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList78 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList78, fieldDataArray77);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList80 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList74, 10, (int) (short) 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList78);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList81 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList65, (int) (short) 1, 0, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList78);
        companyDerivedData63.dList = companyDerivedList81;
        companyDerivedData2.dList = companyDerivedList81;
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
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(strList74);
        org.junit.Assert.assertNotNull(fieldDataArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(companyDerivedList80);
        org.junit.Assert.assertNotNull(companyDerivedList81);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0675");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherIncQdata();
        boolean boolean5 = companyDerived3.isValid();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherLtAssetsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(quarterlyDouble6);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0676");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) (short) -1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getEpsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0677");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.write((int) ' ', (int) (byte) 1);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0678");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getEpsContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getNetIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getGrossIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getSharesQdata();
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
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0679");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getSalesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getEpsQdata();
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
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0680");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        int int5 = companyDerived3.getQuarter();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getIncTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getStDebtQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0681");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getCogsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getNetcashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getWorkingCapitalQdata();
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
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0682");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherLtAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getTotalAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getIncAfterTaxQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0683");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getIntExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getTotalLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getCashFromFinQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getEquityQdata();
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
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0684");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getCurrentRatioQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getAdjToIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getEpsContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getSharesQdata();
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
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0685");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getIncTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getCashflowQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0686");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived4 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        java.util.List<java.lang.String> strList5 = indexDerived4.indexList;
        indexDerived4.listName = "";
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived11 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived11.writeList("");
        java.util.List<java.lang.String> strList14 = indexDerived11.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived18 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived18.writeList("");
        java.util.List<java.lang.String> strList21 = indexDerived18.indexList;
        indexDerived11.indexList = strList21;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData> companyDerivedDataList23 = indexDerived11.idList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived27 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived27.writeList("");
        java.util.List<java.lang.String> strList30 = indexDerived27.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived34 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived34.writeList("");
        java.util.List<java.lang.String> strList37 = indexDerived34.indexList;
        indexDerived27.indexList = strList37;
        indexDerived27.readList("");
        java.util.List<java.lang.String> strList41 = indexDerived27.indexList;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray44 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList45 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList45, fieldDataArray44);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList47 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList41, (int) 'a', (int) (byte) 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList45);
        indexDerived11.addToList(strList41);
        java.util.List<java.lang.String> strList51 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived57 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("hi!", (int) (byte) -1, (int) ' ');
        java.util.List<java.lang.String> strList58 = indexDerived57.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived64 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived64.writeList("");
        java.util.List<java.lang.String> strList67 = indexDerived64.indexList;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray70 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList71 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList71, fieldDataArray70);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList73 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList67, 10, (int) (short) 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList71);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList74 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList58, 100, 0, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList71);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList75 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList51, 10, (-1), (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList71);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList76 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList41, (int) (short) 1, (int) '4', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList71);
        indexDerived4.indexList = strList41;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived80 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("hi!", strList41, (-1), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNull(companyDerivedDataList23);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(strList37);
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertNotNull(fieldDataArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(companyDerivedList47);
        org.junit.Assert.assertNotNull(strList58);
        org.junit.Assert.assertNotNull(strList67);
        org.junit.Assert.assertNotNull(fieldDataArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(companyDerivedList73);
        org.junit.Assert.assertNotNull(companyDerivedList74);
        org.junit.Assert.assertNotNull(companyDerivedList75);
        org.junit.Assert.assertNotNull(companyDerivedList76);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0687");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getCogsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getTotalOpExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getPrefStockQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getIntExpQdata();
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
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0688");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getCurrentRatioQdata();
        boolean boolean9 = companyDerived3.isValid();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0689");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getTotalAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getOtherCurrAssetsQdata();
        int int10 = companyDerived3.getQuarter();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getCurrentRatioQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getInventoryQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyDerived3.getPricesQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(quarterlyDouble11);
        org.junit.Assert.assertNull(quarterlyDouble12);
        org.junit.Assert.assertNull(quarterlyDouble13);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0690");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived(100, (int) (short) -1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOpMarginQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0691");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = companyDerived3.getCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = companyDerived3.getRoeQdata();
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
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0692");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getCurrentRatioQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherLtAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getNonrecurringItemsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getIncPrimaryEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getAdjToIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyDerived3.getGrossOpIncQdata();
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
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0693");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getCurrentRatioQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getCogsQdata();
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
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0694");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", (int) '4', (-1));
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived7 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived7.writeList("");
        java.util.List<java.lang.String> strList10 = indexDerived7.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived14 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived14.writeList("");
        java.util.List<java.lang.String> strList17 = indexDerived14.indexList;
        indexDerived7.indexList = strList17;
        indexDerived7.readList("");
        java.util.List<java.lang.String> strList21 = indexDerived7.indexList;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList25, fieldDataArray24);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList27 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList21, (int) 'a', (int) (byte) 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList25);
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived33 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", (int) (short) 10, (int) (short) 10);
        boolean boolean35 = indexDerived33.isInList("");
        java.util.List<java.lang.String> strList36 = indexDerived33.indexList;
        java.util.List<java.lang.String> strList39 = null;
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
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList63 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList39, 10, (-1), (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList59);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList64 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList36, 100, 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList59);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList65 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList21, (int) (byte) 1, (int) 'a', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList59);
        indexDerived3.indexList = strList21;
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(fieldDataArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(companyDerivedList27);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNotNull(strList46);
        org.junit.Assert.assertNotNull(strList55);
        org.junit.Assert.assertNotNull(fieldDataArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(companyDerivedList61);
        org.junit.Assert.assertNotNull(companyDerivedList62);
        org.junit.Assert.assertNotNull(companyDerivedList63);
        org.junit.Assert.assertNotNull(companyDerivedList64);
        org.junit.Assert.assertNotNull(companyDerivedList65);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0695");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) (byte) -1, (int) (short) 100, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getIncTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getCashFromFinQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0696");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("hi!", (int) '#', (int) '4');
        indexDerived3.valid = true;
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0697");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", (int) '#', 1);
        indexDerived3.writeList("hi!");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived9 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived9.writeList("");
        java.util.List<java.lang.String> strList12 = indexDerived9.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived16 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived16.writeList("");
        java.util.List<java.lang.String> strList19 = indexDerived16.indexList;
        indexDerived9.indexList = strList19;
        indexDerived9.readList("");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData> companyDerivedDataList23 = indexDerived9.idList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived27 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        java.util.List<java.lang.String> strList28 = indexDerived27.indexList;
        indexDerived27.readList("");
        indexDerived27.valid = false;
        indexDerived27.listName = "";
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived39 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived39.writeList("");
        java.util.List<java.lang.String> strList42 = indexDerived39.indexList;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray45 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList46 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList46, fieldDataArray45);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList48 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList42, 10, (int) (short) 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList46);
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived51 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", strList42, (int) (byte) 0, 100);
        indexDerived27.addToList(strList42);
        indexDerived9.indexList = strList42;
        indexDerived3.indexList = strList42;
        indexDerived3.listName = "";
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNull(companyDerivedDataList23);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertNotNull(fieldDataArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(companyDerivedList48);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0698");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getEpsContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getIntExpQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0699");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getEquityQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0700");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData2 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        companyDerivedData2.year = 1;
        int int5 = companyDerivedData2.year;
        companyDerivedData2.quarter = (short) 1;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList8 = companyDerivedData2.dList;
        companyDerivedData2.quarter = (short) -1;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList11 = companyDerivedData2.dList;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(companyDerivedList8);
        org.junit.Assert.assertNotNull(companyDerivedList11);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0701");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getCashflowQdata();
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
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0702");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getIncPrimaryEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getTotalOpExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getNonrecurringItemsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getIntExpNonOpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getIntExpNonOpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getIncPrimaryEpsQdata();
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
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0703");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getAcctPayableQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getBvpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getDividendQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getCapExQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getNonrecurringItemsQdata();
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
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0704");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.write((int) (short) 100, (int) (byte) 0);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0705");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getLiabEquityQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0706");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        boolean boolean4 = companyDerived3.isValid();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getTotalLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getLtDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getLtInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getCashFromOpsQdata();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0707");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyDerived3.getLiabEquityQdata();
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
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0708");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getCurrentRatioQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getAdjToIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getBvpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getIncAfterTaxQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0709");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getDividendQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getGrossOpIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getTotalAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getPrefStockQdata();
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
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0710");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getLtDebtQdata();
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
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0711");
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
        indexDerived3.listName = "";
        indexDerived3.listName = "hi!";
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
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0712");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getGrossIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getTotalLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getIncPrimaryEpsQdata();
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
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0713");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        int int5 = companyDerived3.getYear();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getRoeQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getTotalLiabQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0714");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getTotalAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getOtherCurrAssetsQdata();
        int int10 = companyDerived3.getQuarter();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getAcctRxQdata();
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
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0715");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getAcctPayableQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getLiabEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getOtherLtLiabQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0716");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getCogsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getTotalOpExpQdata();
        int int10 = companyDerived3.getQuarter();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0717");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getLiabEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getTotalOpExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getCashFromInvQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getOtherCurrAssetsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0718");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 100, (int) (byte) -1);
        indexDerived3.listName = "hi!";
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData> companyDerivedDataList6 = indexDerived3.idList;
        indexDerived3.listName = "hi!";
        indexDerived3.valid = true;
        boolean boolean12 = indexDerived3.isInList("hi!");
        org.junit.Assert.assertNull(companyDerivedDataList6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0719");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getNetcashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getLiabEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getCashflowQdata();
        java.lang.Class<?> wildcardClass9 = companyDerived3.getClass();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0720");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getNetFixedAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getTotalLiabQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0721");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived7 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", (java.util.List<java.lang.String>) strList3, (int) (short) 10, (int) '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0722");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getCogsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getTotalOpExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getTanAssetsQdata();
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
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0723");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getRdQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getIncPrimaryEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getIntExpNonOpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getEpsContQdata();
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
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0724");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getPeQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getIncPrimaryEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getCashflowQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0725");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getIncPrimaryEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyDerived3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyDerived3.getIntTotQdata();
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
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0726");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.write((int) (byte) 10, 100);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0727");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getGrossIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getTotalLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getBvpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getEpsContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyDerived3.getNetFixedAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyDerived3.getGrossOpIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = companyDerived3.getCashFromInvQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = companyDerived3.getRoeQdata();
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
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0728");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        int int5 = companyDerived3.getQuarter();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getWorkingCapitalQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getIncPrimaryEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getNetIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyDerived3.getCogsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyDerived3.getNonrecurringItemsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = companyDerived3.getDivCostQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = companyDerived3.getWorkingCapitalQdata();
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
        org.junit.Assert.assertNull(quarterlyDouble14);
        org.junit.Assert.assertNull(quarterlyDouble15);
        org.junit.Assert.assertNull(quarterlyDouble16);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0729");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getCapExQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0730");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        int int5 = companyDerived3.getQuarter();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getWorkingCapitalQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getCashFromOpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getDividendQdata();
        int int12 = companyDerived3.getQuarter();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0731");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getTotalAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getNetIncQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0732");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getCurrentRatioQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getAdjToIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getEpsContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getIntTotQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0733");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        int int5 = companyDerived3.getQuarter();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getIncTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getLtDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getPricesQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0734");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        int int5 = companyDerived3.getYear();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getRoeQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getIntExpNonOpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getLiabEquityQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0735");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getOtherLtAssetsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0736");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getLiabEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getTanAssetsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0737");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getLiabEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getTotalOpExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getCashFromInvQdata();
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
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0738");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getLtDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getTotalOpExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getDivCostQdata();
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
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0739");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        int int5 = companyDerived3.getQuarter();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getIncTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getCogsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getLtInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getPreTaxIncQdata();
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
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0740");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getIntExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getCashQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0741");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData2 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData(35, (int) '4');
        int int3 = companyDerivedData2.year;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList4 = companyDerivedData2.dList;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList5 = companyDerivedData2.dList;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertNotNull(companyDerivedList4);
        org.junit.Assert.assertNotNull(companyDerivedList5);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0742");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 1, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData> companyDerivedDataList4 = indexDerived3.idList;
        indexDerived3.valid = false;
        org.junit.Assert.assertNull(companyDerivedDataList4);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0743");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getCurrentRatioQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getCogsQdata();
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
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0744");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getRdQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getIncPrimaryEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getIntExpNonOpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getNetFixedAssetsQdata();
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
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0745");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getRdQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getDivCostQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getCashFromInvQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getIntExpQdata();
        boolean boolean11 = companyDerived3.isValid();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getRdQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(quarterlyDouble12);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0746");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getCurrentRatioQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherLtAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getNonrecurringItemsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getIncPrimaryEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getOtherIncQdata();
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
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0747");
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
        int int60 = companyDerivedData2.year;
        int int61 = companyDerivedData2.quarter;
        companyDerivedData2.quarter = ' ';
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
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0748");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getRdQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getDivCostQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getCashFromInvQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getBvpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getGrossIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getTanAssetsQdata();
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
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0749");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived3.writeList("");
        java.util.List<java.lang.String> strList6 = indexDerived3.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived10 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived10.writeList("");
        java.util.List<java.lang.String> strList13 = indexDerived10.indexList;
        indexDerived3.indexList = strList13;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData> companyDerivedDataList15 = indexDerived3.idList;
        indexDerived3.readList("");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived21 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived21.writeList("");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived27 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        java.util.List<java.lang.String> strList28 = indexDerived27.indexList;
        indexDerived27.listName = "";
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived34 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived34.writeList("");
        java.util.List<java.lang.String> strList37 = indexDerived34.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived41 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived41.writeList("");
        java.util.List<java.lang.String> strList44 = indexDerived41.indexList;
        indexDerived34.indexList = strList44;
        indexDerived27.addToList(strList44);
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived50 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived50.writeList("");
        java.util.List<java.lang.String> strList53 = indexDerived50.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived57 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived57.writeList("");
        java.util.List<java.lang.String> strList60 = indexDerived57.indexList;
        indexDerived50.indexList = strList60;
        indexDerived27.addToList(strList60);
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived66 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived66.writeList("");
        java.util.List<java.lang.String> strList69 = indexDerived66.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived73 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived73.writeList("");
        java.util.List<java.lang.String> strList76 = indexDerived73.indexList;
        indexDerived66.indexList = strList76;
        indexDerived66.readList("");
        java.util.List<java.lang.String> strList80 = indexDerived66.indexList;
        indexDerived27.indexList = strList80;
        indexDerived21.indexList = strList80;
        indexDerived3.addToList(strList80);
        java.lang.String str84 = indexDerived3.listName;
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNull(companyDerivedDataList15);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertNotNull(strList37);
        org.junit.Assert.assertNotNull(strList44);
        org.junit.Assert.assertNotNull(strList53);
        org.junit.Assert.assertNotNull(strList60);
        org.junit.Assert.assertNotNull(strList69);
        org.junit.Assert.assertNotNull(strList76);
        org.junit.Assert.assertNotNull(strList80);
        org.junit.Assert.assertNull(str84);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0750");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getLtDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getGrossOpIncQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0751");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        java.util.List<java.lang.String> strList4 = indexDerived3.indexList;
        indexDerived3.valid = true;
        boolean boolean8 = indexDerived3.isInList("hi!");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData> companyDerivedDataList9 = indexDerived3.idList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived13 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("hi!", (int) (byte) -1, (int) ' ');
        java.util.List<java.lang.String> strList14 = indexDerived13.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData17 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        companyDerivedData17.year = 1;
        int int20 = companyDerivedData17.year;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData23 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData26 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((int) (short) 0, 0);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData29 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData32 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        companyDerivedData32.year = 1;
        int int35 = companyDerivedData32.year;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList36 = companyDerivedData32.dList;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData39 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        companyDerivedData39.year = 1;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList42 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.getAgList();
        companyDerivedData39.dList = companyDerivedList42;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData[] companyDerivedDataArray44 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData[] { companyDerivedData17, companyDerivedData23, companyDerivedData26, companyDerivedData29, companyDerivedData32, companyDerivedData39 };
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData> companyDerivedDataList45 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData>) companyDerivedDataList45, companyDerivedDataArray44);
        indexDerived13.idList = companyDerivedDataList45;
        java.util.List<java.lang.String> strList48 = indexDerived13.indexList;
        indexDerived13.writeList("");
        java.util.List<java.lang.String> strList51 = indexDerived13.indexList;
        boolean boolean52 = indexDerived13.valid;
        boolean boolean54 = indexDerived13.isInList("");
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
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived82 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived82.writeList("");
        java.util.List<java.lang.String> strList85 = indexDerived82.indexList;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray88 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList89 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList89, fieldDataArray88);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList91 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList85, 10, (int) (short) 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList89);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList92 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList60, (int) (byte) 0, 10, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList89);
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived95 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", strList60, (int) 'a', (int) (byte) 100);
        indexDerived13.indexList = strList60;
        indexDerived3.indexList = strList60;
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(companyDerivedDataList9);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(companyDerivedList36);
        org.junit.Assert.assertNotNull(companyDerivedList42);
        org.junit.Assert.assertNotNull(companyDerivedDataArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertNotNull(strList51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(strList60);
        org.junit.Assert.assertNotNull(strList69);
        org.junit.Assert.assertNotNull(fieldDataArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(companyDerivedList75);
        org.junit.Assert.assertNotNull(companyDerivedList76);
        org.junit.Assert.assertNotNull(strList85);
        org.junit.Assert.assertNotNull(fieldDataArray88);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(companyDerivedList91);
        org.junit.Assert.assertNotNull(companyDerivedList92);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0752");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData2 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData(0, (int) (short) 100);
        companyDerivedData2.quarter = (short) 0;
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0753");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getTotalAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getNonrecurringItemsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getIncTaxQdata();
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
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0754");
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
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0755");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherLtAssetsQdata();
        boolean boolean7 = companyDerived3.isValid();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getCashFromInvQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0756");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getPeQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getIncAfterTaxQdata();
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
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0757");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getGrossOpIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getNetcashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getBvpsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0758");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getIncPrimaryEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getTotalOpExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getEpsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0759");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData2 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        int int3 = companyDerivedData2.year;
        int int4 = companyDerivedData2.year;
        int int5 = companyDerivedData2.quarter;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0760");
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
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived51 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("hi!", (int) (byte) -1, (int) ' ');
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived55 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("hi!", (int) (byte) -1, (int) ' ');
        java.util.List<java.lang.String> strList56 = indexDerived55.indexList;
        indexDerived51.indexList = strList56;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived63 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived63.writeList("");
        java.util.List<java.lang.String> strList66 = indexDerived63.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived72 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("hi!", (int) (byte) -1, (int) ' ');
        java.util.List<java.lang.String> strList73 = indexDerived72.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived79 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived79.writeList("");
        java.util.List<java.lang.String> strList82 = indexDerived79.indexList;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray85 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList86 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList86, fieldDataArray85);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList88 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList82, 10, (int) (short) 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList86);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList89 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList73, 100, 0, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList86);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList90 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList66, (int) (byte) 1, (int) (short) 0, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList86);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList91 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList56, (int) (short) -1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList86);
        companyDerivedData2.dList = companyDerivedList91;
        int int93 = companyDerivedData2.quarter;
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
        org.junit.Assert.assertNotNull(strList56);
        org.junit.Assert.assertNotNull(strList66);
        org.junit.Assert.assertNotNull(strList73);
        org.junit.Assert.assertNotNull(strList82);
        org.junit.Assert.assertNotNull(fieldDataArray85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(companyDerivedList88);
        org.junit.Assert.assertNotNull(companyDerivedList89);
        org.junit.Assert.assertNotNull(companyDerivedList90);
        org.junit.Assert.assertNotNull(companyDerivedList91);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + (-1) + "'", int93 == (-1));
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0761");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getRdQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getEpsContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getCurrAssetsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0762");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getCogsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getTotalOpExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getLtDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getWorkingCapitalQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getPrefStockQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyDerived3.getCurrLiabQdata();
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
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0763");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getCogsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getTotalOpExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getTotalLiabQdata();
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
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0764");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getEpsContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getWorkingCapitalQdata();
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
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0765");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 100, (int) (byte) -1);
        indexDerived3.listName = "hi!";
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
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived48 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("hi!", (int) (byte) -1, (int) ' ');
        java.util.List<java.lang.String> strList49 = indexDerived48.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived55 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived55.writeList("");
        java.util.List<java.lang.String> strList58 = indexDerived55.indexList;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray61 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList62 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList62, fieldDataArray61);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList64 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList58, 10, (int) (short) 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList62);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList65 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList49, 100, 0, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList62);
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived71 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived71.writeList("");
        java.util.List<java.lang.String> strList74 = indexDerived71.indexList;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray77 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList78 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList78, fieldDataArray77);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList80 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList74, 10, (int) (short) 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList78);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList81 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList49, (int) (byte) 0, 10, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList78);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList82 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList10, (int) (byte) 1, 0, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList78);
        indexDerived3.addToList(strList10);
        boolean boolean85 = indexDerived3.isInList("");
        indexDerived3.listName = "";
        indexDerived3.valid = true;
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
        org.junit.Assert.assertNotNull(strList49);
        org.junit.Assert.assertNotNull(strList58);
        org.junit.Assert.assertNotNull(fieldDataArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(companyDerivedList64);
        org.junit.Assert.assertNotNull(companyDerivedList65);
        org.junit.Assert.assertNotNull(strList74);
        org.junit.Assert.assertNotNull(fieldDataArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(companyDerivedList80);
        org.junit.Assert.assertNotNull(companyDerivedList81);
        org.junit.Assert.assertNotNull(companyDerivedList82);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0766");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getStDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getLtInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getNetcashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getOtherCurrAssetsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0767");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        java.util.List<java.lang.String> strList4 = indexDerived3.indexList;
        indexDerived3.readList("");
        indexDerived3.valid = false;
        indexDerived3.writeList("");
        indexDerived3.valid = false;
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0768");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyDerived3.getTanAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = companyDerived3.getCashFromOpsQdata();
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
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0769");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getOpMarginQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0770");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getSalesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getWorkingCapitalQdata();
        int int11 = companyDerived3.getYear();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0771");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived3.writeList("");
        indexDerived3.valid = false;
        java.lang.String str8 = indexDerived3.listName;
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0772");
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
        java.util.List<java.lang.String> strList41 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived47 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived47.writeList("");
        java.util.List<java.lang.String> strList50 = indexDerived47.indexList;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray53 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList54 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList54, fieldDataArray53);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList56 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList50, 10, (int) (short) 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList54);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList57 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList41, (int) (short) 1, 0, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList54);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList58 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList36, (int) (short) 1, (int) (byte) -1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList54);
        java.util.List<java.lang.String> strList61 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived67 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("hi!", (int) (byte) -1, (int) ' ');
        java.util.List<java.lang.String> strList68 = indexDerived67.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived74 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived74.writeList("");
        java.util.List<java.lang.String> strList77 = indexDerived74.indexList;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray80 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList81 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList81, fieldDataArray80);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList83 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList77, 10, (int) (short) 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList81);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList84 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList68, 100, 0, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList81);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList85 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList61, 10, (-1), (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList81);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList86 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList36, 1, 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList81);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNotNull(strList50);
        org.junit.Assert.assertNotNull(fieldDataArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(companyDerivedList56);
        org.junit.Assert.assertNotNull(companyDerivedList57);
        org.junit.Assert.assertNotNull(companyDerivedList58);
        org.junit.Assert.assertNotNull(strList68);
        org.junit.Assert.assertNotNull(strList77);
        org.junit.Assert.assertNotNull(fieldDataArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(companyDerivedList83);
        org.junit.Assert.assertNotNull(companyDerivedList84);
        org.junit.Assert.assertNotNull(companyDerivedList85);
        org.junit.Assert.assertNotNull(companyDerivedList86);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0773");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", (int) (short) 10, (int) (short) 10);
        boolean boolean5 = indexDerived3.isInList("");
        indexDerived3.listName = "";
        boolean boolean8 = indexDerived3.valid;
        boolean boolean10 = indexDerived3.isInList("");
        java.lang.String str11 = indexDerived3.listName;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0774");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getCurrentRatioQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getEpsDilContQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0775");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        int int5 = companyDerived3.getQuarter();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getIncTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getTotalOpExpQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0776");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getOtherLtLiabQdata();
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
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0777");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getCurrentRatioQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getSalesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getCurrentRatioQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0778");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("hi!", 1, (int) (short) -1);
        indexDerived3.valid = true;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived9 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", (int) (short) 10, (int) (short) 10);
        boolean boolean11 = indexDerived9.isInList("");
        indexDerived9.listName = "";
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived17 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived17.writeList("");
        java.util.List<java.lang.String> strList20 = indexDerived17.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived24 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived24.writeList("");
        java.util.List<java.lang.String> strList27 = indexDerived24.indexList;
        indexDerived17.indexList = strList27;
        indexDerived17.readList("");
        java.util.List<java.lang.String> strList31 = indexDerived17.indexList;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray34 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList35 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35, fieldDataArray34);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList37 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList31, (int) 'a', (int) (byte) 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35);
        indexDerived9.indexList = strList31;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived42 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived42.writeList("");
        java.util.List<java.lang.String> strList45 = indexDerived42.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived51 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("hi!", (int) (byte) -1, (int) ' ');
        java.util.List<java.lang.String> strList52 = indexDerived51.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived58 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived58.writeList("");
        java.util.List<java.lang.String> strList61 = indexDerived58.indexList;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray64 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList65 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList65, fieldDataArray64);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList67 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList61, 10, (int) (short) 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList65);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList68 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList52, 100, 0, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList65);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList69 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList45, (int) (byte) 1, (int) (short) 0, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList65);
        indexDerived9.addToList(strList45);
        indexDerived3.indexList = strList45;
        indexDerived3.readList("");
        indexDerived3.listName = "hi!";
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertNotNull(fieldDataArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(companyDerivedList37);
        org.junit.Assert.assertNotNull(strList45);
        org.junit.Assert.assertNotNull(strList52);
        org.junit.Assert.assertNotNull(strList61);
        org.junit.Assert.assertNotNull(fieldDataArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(companyDerivedList67);
        org.junit.Assert.assertNotNull(companyDerivedList68);
        org.junit.Assert.assertNotNull(companyDerivedList69);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0779");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getEpsContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getLtInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getEpsContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getPeQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyDerived3.getAcctPayableQdata();
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
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0780");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getCurrentRatioQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getAdjToIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getDivCostQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getTotalOpExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getIntExpQdata();
        boolean boolean12 = companyDerived3.isValid();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyDerived3.getInventoryQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyDerived3.getOtherCurrAssetsQdata();
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
        org.junit.Assert.assertNull(quarterlyDouble14);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0781");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getNonrecurringItemsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getGrossOpIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getSalesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getWorkingCapitalQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0782");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getCogsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getAcctPayableQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0783");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getSalesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getDividendQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0784");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherIncQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0785");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getWcfcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getCashFromInvQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getWorkingCapitalQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0786");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEquityQdata();
        boolean boolean6 = companyDerived3.isValid();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherIncQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(quarterlyDouble7);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0787");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getTotalAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getGrossOpIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getEquityQdata();
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
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0788");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyDerived3.getDivCostQdata();
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
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0789");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        boolean boolean4 = companyDerived3.isValid();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getCashFromOpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getRdQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getNetMarginQdata();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0790");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        int int5 = companyDerived3.getQuarter();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getIntExpNonOpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getDivCostQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0791");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getIncPrimaryEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getTanAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getWcfcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherLtAssetsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0792");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.write((int) 'a', (-1));
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0793");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getNetcashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getWorkingCapitalQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getStInvestQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0794");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getCurrentRatioQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getEpsDilQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0795");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getStDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getLtInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getTotalLiabQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0796");
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
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData> companyDerivedDataList25 = null;
        indexDerived3.idList = companyDerivedDataList25;
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList20);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0797");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getPrefStockQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getDividendQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0798");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getGrossIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getTotalLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getTotalAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyDerived3.getOtherCurrAssetsQdata();
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
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0799");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getGrossOpIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getNetcashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getIntTotQdata();
        boolean boolean9 = companyDerived3.isValid();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getLtInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getNetcashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getDepreciationQdata();
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
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0800");
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
        java.util.List<java.lang.String> strList26 = indexDerived3.indexList;
        boolean boolean27 = indexDerived3.valid;
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0801");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.loadDb((-1), 0, filetypeEnum2);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0802");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        int int5 = companyDerived3.getQuarter();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getIncTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getLtDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getTotalLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getAcctPayableQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getLiabEquityQdata();
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
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0803");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getTotalAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getSalesQdata();
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
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0804");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getCogsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getTotalOpExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getGrossOpIncQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0805");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getCurrentRatioQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getLtDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getStInvestQdata();
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
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0806");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getTotalAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getPreTaxIncQdata();
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
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0807");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", (int) (short) 10, (int) (short) 10);
        boolean boolean5 = indexDerived3.isInList("");
        indexDerived3.listName = "";
        boolean boolean8 = indexDerived3.valid;
        boolean boolean10 = indexDerived3.isInList("");
        indexDerived3.listName = "hi!";
        java.util.List<java.lang.String> strList13 = indexDerived3.indexList;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0808");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", (int) (short) 10, (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData> companyDerivedDataList4 = indexDerived3.idList;
        org.junit.Assert.assertNull(companyDerivedDataList4);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0809");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getRoeQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getIntTotQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0810");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getGrossOpIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getNetcashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getNonrecurringItemsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getStDebtQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0811");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getSalesQdata();
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
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0812");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        boolean boolean4 = companyDerived3.isValid();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getNetcashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getTotalOpExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getTotalAssetsQdata();
        int int9 = companyDerived3.getQuarter();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0813");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getStDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getLtInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getNetcashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getCashQdata();
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
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0814");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getOtherCurrAssetsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0815");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getCurrentRatioQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getCashFromFinQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0816");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getCogsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getTotalOpExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getDivCostQdata();
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
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0817");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getOtherCurrAssetsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0818");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getStDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getLtInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getNetcashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getStDebtQdata();
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
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0819");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getCogsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getCashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getOpMarginQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0820");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getRdQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getIncPrimaryEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getCashFromFinQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getOtherLtAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getTotalAssetsQdata();
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
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0821");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyDerived3.getPrefStockQdata();
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
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0822");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyDerived3.getNetcashflowQdata();
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
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0823");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getGrossIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getCapExQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getIntTotQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyDerived3.getIntTotQdata();
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
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0824");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyDerived3.getPeQdata();
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
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0825");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getCashFromFinQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getIntExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getNetcashflowQdata();
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
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0826");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        int int5 = companyDerived3.getQuarter();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getCogsQdata();
        int int7 = companyDerived3.getYear();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getEpsDilContQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0827");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getTotalAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getOtherCurrAssetsQdata();
        boolean boolean9 = companyDerived3.isValid();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getCashFromFinQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getGoodwillQdata();
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
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0828");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getGrossOpIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getNetcashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getDivCostQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getOtherCurrLiabQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0829");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getIncTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getCashFromFinQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0830");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        int int5 = companyDerived3.getQuarter();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getIncTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getLtDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getTotalLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getIncPrimaryEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getCashFromOpsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0831");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getAcctPayableQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getLiabEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getCashflowQdata();
        int int11 = companyDerived3.getQuarter();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getOtherLtAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyDerived3.getTotalOpExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyDerived3.getIntExpQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(quarterlyDouble12);
        org.junit.Assert.assertNull(quarterlyDouble13);
        org.junit.Assert.assertNull(quarterlyDouble14);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0832");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) (short) -1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getAdjToIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getNetcashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getSalesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getStDebtQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0833");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        int int5 = companyDerived3.getYear();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getRoeQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getNetIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getWorkingCapitalQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getEpsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0834");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getAcctPayableQdata();
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
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0835");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 100, (int) (byte) -1);
        indexDerived3.listName = "hi!";
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
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived48 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("hi!", (int) (byte) -1, (int) ' ');
        java.util.List<java.lang.String> strList49 = indexDerived48.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived55 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived55.writeList("");
        java.util.List<java.lang.String> strList58 = indexDerived55.indexList;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray61 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList62 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList62, fieldDataArray61);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList64 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList58, 10, (int) (short) 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList62);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList65 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList49, 100, 0, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList62);
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived71 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived71.writeList("");
        java.util.List<java.lang.String> strList74 = indexDerived71.indexList;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray77 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList78 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList78, fieldDataArray77);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList80 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList74, 10, (int) (short) 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList78);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList81 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList49, (int) (byte) 0, 10, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList78);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList82 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList10, (int) (byte) 1, 0, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList78);
        indexDerived3.addToList(strList10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData> companyDerivedDataList84 = indexDerived3.idList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived88 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 100, (int) (byte) -1);
        java.util.List<java.lang.String> strList89 = indexDerived88.indexList;
        indexDerived3.addToList(strList89);
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
        org.junit.Assert.assertNotNull(strList49);
        org.junit.Assert.assertNotNull(strList58);
        org.junit.Assert.assertNotNull(fieldDataArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(companyDerivedList64);
        org.junit.Assert.assertNotNull(companyDerivedList65);
        org.junit.Assert.assertNotNull(strList74);
        org.junit.Assert.assertNotNull(fieldDataArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(companyDerivedList80);
        org.junit.Assert.assertNotNull(companyDerivedList81);
        org.junit.Assert.assertNotNull(companyDerivedList82);
        org.junit.Assert.assertNull(companyDerivedDataList84);
        org.junit.Assert.assertNotNull(strList89);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0836");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = companyDerived3.getPrefStockQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = companyDerived3.getDividendQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = companyDerived3.getIntExpNonOpQdata();
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
        org.junit.Assert.assertNull(quarterlyDouble17);
        org.junit.Assert.assertNull(quarterlyDouble18);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0837");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData2 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((int) (short) 0, 0);
        companyDerivedData2.year = 0;
        companyDerivedData2.year = 0;
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0838");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getGrossIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getTotalLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getBvpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getOtherLtAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyDerived3.getOtherCurrLiabQdata();
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
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0839");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getCurrAssetsQdata();
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
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0840");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getNetIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getNetcashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getCashFromFinQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getCashFromFinQdata();
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
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0841");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getTotalLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getNonrecurringItemsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getRdQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0842");
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
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived46 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived46.writeList("");
        java.util.List<java.lang.String> strList49 = indexDerived46.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived53 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived53.writeList("");
        java.util.List<java.lang.String> strList56 = indexDerived53.indexList;
        indexDerived46.indexList = strList56;
        indexDerived46.readList("");
        java.util.List<java.lang.String> strList60 = indexDerived46.indexList;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray63 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList64 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList64, fieldDataArray63);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList66 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList60, (int) 'a', (int) (byte) 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList64);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList67 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList33, 0, (int) ' ', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList64);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNull(companyDerivedDataList15);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertNotNull(fieldDataArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(companyDerivedList39);
        org.junit.Assert.assertNotNull(strList49);
        org.junit.Assert.assertNotNull(strList56);
        org.junit.Assert.assertNotNull(strList60);
        org.junit.Assert.assertNotNull(fieldDataArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(companyDerivedList66);
        org.junit.Assert.assertNotNull(companyDerivedList67);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0843");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getCurrentRatioQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherLtAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getNonrecurringItemsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getIncPrimaryEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getUnusualIncQdata();
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
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0844");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData2 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData(35, (int) '4');
        int int3 = companyDerivedData2.year;
        companyDerivedData2.quarter = (short) 1;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0845");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) (short) -1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCogsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0846");
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
        companyDerivedData2.quarter = 100;
        int int50 = companyDerivedData2.quarter;
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
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 100 + "'", int50 == 100);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0847");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        int int5 = companyDerived3.getQuarter();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getIncTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getLtDebtQdata();
        int int8 = companyDerived3.getQuarter();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getAcctPayableQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getInventoryQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0848");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.loadDb(1, (int) ' ', filetypeEnum2);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0849");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getLtInvestQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0850");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getTotalAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getOtherLtLiabQdata();
        int int10 = companyDerived3.getQuarter();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0851");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getRdQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getCashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getRoeQdata();
        int int11 = companyDerived3.getYear();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getOtherIncQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertNull(quarterlyDouble12);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0852");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getSalesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getGoodwillQdata();
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
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0853");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getNetcashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getLiabEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getCashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getIntTotQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getDepreciationQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0854");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) (short) -1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getCapExQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0855");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getSalesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getGoodwillQdata();
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
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0856");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 100, (int) ' ');
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
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData> companyDerivedDataList61 = indexDerived7.idList;
        indexDerived3.idList = companyDerivedDataList61;
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
        org.junit.Assert.assertNotNull(companyDerivedDataList61);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0857");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived3.writeList("");
        boolean boolean7 = indexDerived3.isInList("");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData> companyDerivedDataList8 = indexDerived3.idList;
        java.util.List<java.lang.String> strList9 = indexDerived3.indexList;
        java.util.List<java.lang.String> strList10 = indexDerived3.indexList;
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(companyDerivedDataList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0858");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getNetcashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getLiabEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getPreTaxIncQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0859");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getCogsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0860");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", (int) (short) 10, (int) (short) 10);
        boolean boolean5 = indexDerived3.isInList("");
        java.util.List<java.lang.String> strList6 = indexDerived3.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived10 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived10.writeList("");
        java.util.List<java.lang.String> strList13 = indexDerived10.indexList;
        indexDerived3.indexList = strList13;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0861");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getDividendQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getGrossOpIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getTotalAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getPrefStockQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getRdQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getSharesQdata();
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
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0862");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getStDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getIntExpNonOpQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0863");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyDerived3.getOtherLtAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = companyDerived3.getWcfcfQdata();
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
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0864");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getCurrentRatioQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getAdjToIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getIncPrimaryEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getTotalLiabQdata();
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
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0865");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getCurrentRatioQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getAdjToIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getEpsContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getSharesQdata();
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
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0866");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getStDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getDivCostQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getDivCostQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getCurrLiabQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0867");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getNetIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getNetcashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getCapExQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getNetcashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getLtDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getEquityQdata();
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
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0868");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived(0, (int) (byte) 1, fieldData2);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0869");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived3.writeList("");
        java.util.List<java.lang.String> strList6 = indexDerived3.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived10 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived10.writeList("");
        java.util.List<java.lang.String> strList13 = indexDerived10.indexList;
        indexDerived3.indexList = strList13;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData> companyDerivedDataList15 = null;
        indexDerived3.idList = companyDerivedDataList15;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived20 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived20.writeList("");
        java.util.List<java.lang.String> strList23 = indexDerived20.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived27 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived27.writeList("");
        java.util.List<java.lang.String> strList30 = indexDerived27.indexList;
        indexDerived20.indexList = strList30;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData> companyDerivedDataList32 = indexDerived20.idList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived36 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived36.writeList("");
        java.util.List<java.lang.String> strList39 = indexDerived36.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived43 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived43.writeList("");
        java.util.List<java.lang.String> strList46 = indexDerived43.indexList;
        indexDerived36.indexList = strList46;
        indexDerived36.readList("");
        java.util.List<java.lang.String> strList50 = indexDerived36.indexList;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray53 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList54 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList54, fieldDataArray53);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList56 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList50, (int) 'a', (int) (byte) 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList54);
        indexDerived20.addToList(strList50);
        java.util.List<java.lang.String> strList60 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived66 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("hi!", (int) (byte) -1, (int) ' ');
        java.util.List<java.lang.String> strList67 = indexDerived66.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived73 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived73.writeList("");
        java.util.List<java.lang.String> strList76 = indexDerived73.indexList;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray79 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList80 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList80, fieldDataArray79);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList82 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList76, 10, (int) (short) 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList80);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList83 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList67, 100, 0, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList80);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList84 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList60, 10, (-1), (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList80);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList85 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList50, (int) (short) 1, (int) '4', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList80);
        indexDerived3.addToList(strList50);
        boolean boolean87 = indexDerived3.valid;
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNull(companyDerivedDataList32);
        org.junit.Assert.assertNotNull(strList39);
        org.junit.Assert.assertNotNull(strList46);
        org.junit.Assert.assertNotNull(strList50);
        org.junit.Assert.assertNotNull(fieldDataArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(companyDerivedList56);
        org.junit.Assert.assertNotNull(strList67);
        org.junit.Assert.assertNotNull(strList76);
        org.junit.Assert.assertNotNull(fieldDataArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(companyDerivedList82);
        org.junit.Assert.assertNotNull(companyDerivedList83);
        org.junit.Assert.assertNotNull(companyDerivedList84);
        org.junit.Assert.assertNotNull(companyDerivedList85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0870");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        int int5 = companyDerived3.getQuarter();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getIncTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getLtDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getLtDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getGrossOpIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getEpsDilQdata();
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
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0871");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        boolean boolean4 = companyDerived3.isValid();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getCashFromFinQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getIntExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getGoodwillQdata();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0872");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getGrossOpIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getNetcashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getWorkingCapitalQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getCurrLiabQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0873");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getDivCostQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getAcctPayableQdata();
        boolean boolean9 = companyDerived3.isValid();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0874");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", (int) (short) 10, (int) (short) 10);
        indexDerived3.listName = "";
        boolean boolean6 = indexDerived3.valid;
        boolean boolean8 = indexDerived3.isInList("hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0875");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getIncPrimaryEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getTotalOpExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getTotalLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getIntExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getFcfQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0876");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData2 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData(100, (int) '#');
        int int3 = companyDerivedData2.quarter;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList4 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.getAgList();
        companyDerivedData2.dList = companyDerivedList4;
        int int6 = companyDerivedData2.quarter;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList7 = companyDerivedData2.dList;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertNotNull(companyDerivedList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(companyDerivedList7);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0877");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        int int5 = companyDerived3.getQuarter();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getIncTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getLtDebtQdata();
        int int8 = companyDerived3.getQuarter();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getOpMarginQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0878");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getAcctPayableQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyDerived3.getSalesQdata();
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
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0879");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getStDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getLtInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getWorkingCapitalQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0880");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getCapExQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getGoodwillQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0881");
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
        java.util.List<java.lang.String> strList41 = indexDerived3.indexList;
        boolean boolean42 = indexDerived3.valid;
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNull(companyDerivedDataList39);
        org.junit.Assert.assertNull(companyDerivedDataList40);
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0882");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDividendQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherIncQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0883");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived3.writeList("");
        boolean boolean7 = indexDerived3.isInList("hi!");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived11 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", (int) '#', 1);
        indexDerived11.writeList("hi!");
        java.util.List<java.lang.String> strList14 = indexDerived11.indexList;
        indexDerived3.addToList(strList14);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0884");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) (short) -1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getAdjToIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getGrossOpIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getNetcashflowQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0885");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 100, (int) (byte) -1);
        java.util.List<java.lang.String> strList4 = null;
        indexDerived3.addToList(strList4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData> companyDerivedDataList6 = indexDerived3.idList;
        org.junit.Assert.assertNull(companyDerivedDataList6);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0886");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        int int5 = companyDerived3.getYear();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getStDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getDepreciationQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0887");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        boolean boolean4 = companyDerived3.isValid();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getNetIncQdata();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0888");
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
        companyDerivedData2.quarter = 100;
        companyDerivedData2.quarter = (short) 100;
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
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0889");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived4 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived4.writeList("");
        java.util.List<java.lang.String> strList7 = indexDerived4.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived11 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived11.writeList("");
        java.util.List<java.lang.String> strList14 = indexDerived11.indexList;
        indexDerived4.indexList = strList14;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData> companyDerivedDataList16 = indexDerived4.idList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived20 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived20.writeList("");
        java.util.List<java.lang.String> strList23 = indexDerived20.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived27 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived27.writeList("");
        java.util.List<java.lang.String> strList30 = indexDerived27.indexList;
        indexDerived20.indexList = strList30;
        indexDerived4.addToList(strList30);
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived35 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", strList30, (int) ' ', (int) (byte) 10);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNull(companyDerivedDataList16);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(strList30);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0890");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        int int5 = companyDerived3.getYear();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getRoeQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getGrossOpIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getPrefStockQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getBvpsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0891");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getAcctPayableQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getLiabEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getCashflowQdata();
        int int11 = companyDerived3.getQuarter();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getOtherLtAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyDerived3.getAdjToIncQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(quarterlyDouble12);
        org.junit.Assert.assertNull(quarterlyDouble13);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0892");
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
        boolean boolean13 = companyDerived3.isValid();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
        org.junit.Assert.assertNull(quarterlyDouble12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0893");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getIncPrimaryEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getTanAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getLtDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getLtInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getLtInvestQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0894");
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
        java.util.List<java.lang.String> strList19 = indexDerived3.indexList;
        boolean boolean20 = indexDerived3.valid;
        indexDerived3.listName = "";
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0895");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getAcctPayableQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getLiabEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getLtDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getIncAfterTaxQdata();
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
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0896");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getCogsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getTotalOpExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getTotalLiabQdata();
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
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0897");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", (int) (short) 10, 100);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0898");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getGrossIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getCapExQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getNonrecurringItemsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyDerived3.getOtherLtAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyDerived3.getCurrentRatioQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = companyDerived3.getOtherCurrAssetsQdata();
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
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0899");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("hi!", (int) (byte) -1, (int) ' ');
        java.util.List<java.lang.String> strList4 = indexDerived3.indexList;
        indexDerived3.writeList("");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived10 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        java.util.List<java.lang.String> strList11 = indexDerived10.indexList;
        indexDerived10.valid = true;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData> companyDerivedDataList14 = indexDerived10.idList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived18 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived18.writeList("");
        boolean boolean22 = indexDerived18.isInList("");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData> companyDerivedDataList23 = indexDerived18.idList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived27 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("hi!", (int) (byte) -1, (int) ' ');
        java.util.List<java.lang.String> strList28 = indexDerived27.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData31 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        companyDerivedData31.year = 1;
        int int34 = companyDerivedData31.year;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData37 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData40 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((int) (short) 0, 0);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData43 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData46 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        companyDerivedData46.year = 1;
        int int49 = companyDerivedData46.year;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList50 = companyDerivedData46.dList;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData53 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        companyDerivedData53.year = 1;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList56 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.getAgList();
        companyDerivedData53.dList = companyDerivedList56;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData[] companyDerivedDataArray58 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData[] { companyDerivedData31, companyDerivedData37, companyDerivedData40, companyDerivedData43, companyDerivedData46, companyDerivedData53 };
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData> companyDerivedDataList59 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData>) companyDerivedDataList59, companyDerivedDataArray58);
        indexDerived27.idList = companyDerivedDataList59;
        indexDerived18.idList = companyDerivedDataList59;
        indexDerived10.idList = companyDerivedDataList59;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData> companyDerivedDataList64 = indexDerived10.idList;
        indexDerived3.idList = companyDerivedDataList64;
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNull(companyDerivedDataList14);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(companyDerivedDataList23);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertNotNull(companyDerivedList50);
        org.junit.Assert.assertNotNull(companyDerivedList56);
        org.junit.Assert.assertNotNull(companyDerivedDataArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(companyDerivedDataList64);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0900");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData2 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        companyDerivedData2.year = 1;
        int int5 = companyDerivedData2.year;
        int int6 = companyDerivedData2.quarter;
        companyDerivedData2.year = '#';
        int int9 = companyDerivedData2.quarter;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0901");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getIncPrimaryEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyDerived3.getAdjToIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyDerived3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = companyDerived3.getCapExQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = companyDerived3.getTanAssetsQdata();
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
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0902");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        int int5 = companyDerived3.getQuarter();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getDividendQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getOtherLtAssetsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0903");
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
        indexDerived3.valid = true;
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
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0904");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData2 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData(0, (int) (byte) 0);
        int int3 = companyDerivedData2.year;
        companyDerivedData2.year = 0;
        companyDerivedData2.year = (short) -1;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0905");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getCurrentRatioQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getIntExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getTanAssetsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0906");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyDerived3.getSalesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyDerived3.getSharesQdata();
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
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0907");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        boolean boolean4 = companyDerived3.isValid();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getNetcashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getOtherIncQdata();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0908");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getSalesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getGrossIncQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0909");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) (byte) 1, 10, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getDivCostQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getLiabEquityQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0910");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getAcctPayableQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getIntExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getIntExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getCurrAssetsQdata();
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
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0911");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getStDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getLtInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getNetcashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getCurrAssetsQdata();
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
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0912");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived(100, 1, fieldData2);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0913");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getGrossIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getTotalLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getBvpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getEpsContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyDerived3.getTotalAssetsQdata();
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
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0914");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        int int5 = companyDerived3.getYear();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getRoeQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getNetIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getWorkingCapitalQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getAcctPayableQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0915");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getTotalAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getOtherLtAssetsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0916");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getTotalLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getSalesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getGrossIncQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0917");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getEpsContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getLtInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getCurrLiabQdata();
        int int11 = companyDerived3.getYear();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getCashFromOpsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertNull(quarterlyDouble12);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0918");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived3.writeList("");
        java.util.List<java.lang.String> strList6 = indexDerived3.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived10 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived10.writeList("");
        java.util.List<java.lang.String> strList13 = indexDerived10.indexList;
        indexDerived3.indexList = strList13;
        boolean boolean15 = indexDerived3.valid;
        indexDerived3.writeList("");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0919");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getStDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getLtInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getStDebtQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0920");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getGrossOpIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getWcfcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getTotalLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getCapExQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0921");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.loadDb((int) (byte) 0, (int) (short) 100, filetypeEnum2);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0922");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getAcctPayableQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getBvpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getDividendQdata();
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
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0923");
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
        java.lang.String str42 = indexDerived3.listName;
        indexDerived3.listName = "hi!";
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(companyDerivedList26);
        org.junit.Assert.assertNotNull(companyDerivedList32);
        org.junit.Assert.assertNotNull(companyDerivedDataArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(strList38);
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0924");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPeQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getCashFromFinQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getLtDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getEquityQdata();
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
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0925");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        boolean boolean4 = companyDerived3.isValid();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getTotalLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getLtDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getLtInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getOtherCurrAssetsQdata();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0926");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived4 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        java.util.List<java.lang.String> strList5 = indexDerived4.indexList;
        indexDerived4.listName = "";
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived11 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived11.writeList("");
        java.util.List<java.lang.String> strList14 = indexDerived11.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived18 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived18.writeList("");
        java.util.List<java.lang.String> strList21 = indexDerived18.indexList;
        indexDerived11.indexList = strList21;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData> companyDerivedDataList23 = indexDerived11.idList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived27 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived27.writeList("");
        java.util.List<java.lang.String> strList30 = indexDerived27.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived34 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived34.writeList("");
        java.util.List<java.lang.String> strList37 = indexDerived34.indexList;
        indexDerived27.indexList = strList37;
        indexDerived27.readList("");
        java.util.List<java.lang.String> strList41 = indexDerived27.indexList;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray44 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList45 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList45, fieldDataArray44);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList47 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList41, (int) 'a', (int) (byte) 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList45);
        indexDerived11.addToList(strList41);
        java.util.List<java.lang.String> strList51 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived57 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("hi!", (int) (byte) -1, (int) ' ');
        java.util.List<java.lang.String> strList58 = indexDerived57.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived64 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived64.writeList("");
        java.util.List<java.lang.String> strList67 = indexDerived64.indexList;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray70 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList71 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList71, fieldDataArray70);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList73 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList67, 10, (int) (short) 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList71);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList74 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList58, 100, 0, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList71);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList75 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList51, 10, (-1), (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList71);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList76 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList41, (int) (short) 1, (int) '4', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList71);
        indexDerived4.indexList = strList41;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived80 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", strList41, 35, (int) '#');
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNull(companyDerivedDataList23);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(strList37);
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertNotNull(fieldDataArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(companyDerivedList47);
        org.junit.Assert.assertNotNull(strList58);
        org.junit.Assert.assertNotNull(strList67);
        org.junit.Assert.assertNotNull(fieldDataArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(companyDerivedList73);
        org.junit.Assert.assertNotNull(companyDerivedList74);
        org.junit.Assert.assertNotNull(companyDerivedList75);
        org.junit.Assert.assertNotNull(companyDerivedList76);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0927");
        java.util.List<java.lang.String> strList1 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived4 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", strList1, (int) '#', (int) (byte) 0);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0928");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getStDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getLtInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getDivCostQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0929");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData2 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData(100, (int) '#');
        int int3 = companyDerivedData2.quarter;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList4 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.getAgList();
        companyDerivedData2.dList = companyDerivedList4;
        int int6 = companyDerivedData2.quarter;
        companyDerivedData2.year = (short) -1;
        companyDerivedData2.year = 35;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertNotNull(companyDerivedList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0930");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = companyDerived3.getOtherLtAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = companyDerived3.getOpMarginQdata();
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
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0931");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getAcctPayableQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getLiabEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getCashflowQdata();
        int int11 = companyDerived3.getQuarter();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getDivCostQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyDerived3.getCapExQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyDerived3.getOtherLtLiabQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(quarterlyDouble12);
        org.junit.Assert.assertNull(quarterlyDouble13);
        org.junit.Assert.assertNull(quarterlyDouble14);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0932");
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
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0933");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getWcfcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getNetcashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getAdjToIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getLtDebtQdata();
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
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0934");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        boolean boolean4 = companyDerived3.isValid();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getCashFromOpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getRdQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getNetIncQdata();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0935");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived3.writeList("");
        java.util.List<java.lang.String> strList6 = indexDerived3.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived10 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived10.writeList("");
        java.util.List<java.lang.String> strList13 = indexDerived10.indexList;
        indexDerived3.indexList = strList13;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData> companyDerivedDataList15 = indexDerived3.idList;
        boolean boolean17 = indexDerived3.isInList("");
        boolean boolean18 = indexDerived3.valid;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived22 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("hi!", (int) (byte) -1, (int) ' ');
        java.util.List<java.lang.String> strList23 = indexDerived22.indexList;
        indexDerived22.valid = true;
        indexDerived22.valid = false;
        java.util.List<java.lang.String> strList28 = indexDerived22.indexList;
        indexDerived3.indexList = strList28;
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNull(companyDerivedDataList15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(strList28);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0936");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        boolean boolean4 = companyDerived3.isValid();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getCogsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getIntTotQdata();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0937");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getNonrecurringItemsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getIncAfterTaxQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0938");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", (int) (byte) -1, 0);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0939");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        int int5 = companyDerived3.getQuarter();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getWcfcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getPrefStockQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0940");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getCogsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getNetcashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getNetcashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getCurrLiabQdata();
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
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0941");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getTotalAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getDepreciationQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0942");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        int int5 = companyDerived3.getYear();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getRoeQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getGrossOpIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getDivCostQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getOpMarginQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0943");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getSalesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getStDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getCashFromFinQdata();
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
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0944");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getIncPrimaryEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getTotalOpExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getGrossIncQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0945");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        boolean boolean4 = companyDerived3.isValid();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getNetcashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getPeQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getIntExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getLtDebtQdata();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0946");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) (short) -1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getAdjToIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getNetcashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getSalesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getCashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getCogsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0947");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getDividendQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getTanAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getEquityQdata();
        int int10 = companyDerived3.getQuarter();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0948");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        java.util.List<java.lang.String> strList4 = indexDerived3.indexList;
        indexDerived3.readList("");
        indexDerived3.valid = false;
        indexDerived3.writeList("hi!");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData> companyDerivedDataList11 = indexDerived3.idList;
        java.lang.String str12 = indexDerived3.listName;
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNull(companyDerivedDataList11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0949");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getFcfQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0950");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getCurrentRatioQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getAdjToIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getEpsContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getSharesQdata();
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
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0951");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getEpsDilQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0952");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        boolean boolean4 = companyDerived3.isValid();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getCashFromInvQdata();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0953");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        boolean boolean4 = companyDerived3.isValid();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getNetcashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getTotalOpExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getOtherCurrAssetsQdata();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0954");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getInventoryQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getBvpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getCashFromInvQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getIncPrimaryEpsQdata();
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
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0955");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getIncPrimaryEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getEquityQdata();
        int int8 = companyDerived3.getYear();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0956");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getCashFromInvQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getGrossOpIncQdata();
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
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0957");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getCogsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getTotalOpExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getTotalLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getNetcashflowQdata();
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
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0958");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getDividendQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getGrossOpIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getTotalAssetsQdata();
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
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0959");
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
        companyDerivedData2.quarter = (byte) -1;
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
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0960");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getNonrecurringItemsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getRoeQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0961");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        int int5 = companyDerived3.getQuarter();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getWorkingCapitalQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getIncPrimaryEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getOtherCurrAssetsQdata();
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
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0962");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getStInvestQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0963");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        boolean boolean4 = companyDerived3.isValid();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getCashFromFinQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getStDebtQdata();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0964");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getGrossIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getTotalLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getBvpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getEpsContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyDerived3.getCashQdata();
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
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0965");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        int int5 = companyDerived3.getQuarter();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getIncTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getLtDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getTotalLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getTotalLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getGrossIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyDerived3.getCashflowQdata();
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
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0966");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.write(0, (int) (byte) 0);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0967");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        int int5 = companyDerived3.getQuarter();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getWorkingCapitalQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getIncPrimaryEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getTotalOpExpQdata();
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
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0968");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        java.util.List<java.lang.String> strList4 = indexDerived3.indexList;
        indexDerived3.readList("");
        indexDerived3.valid = false;
        indexDerived3.writeList("");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData> companyDerivedDataList11 = indexDerived3.idList;
        indexDerived3.writeList("hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNull(companyDerivedDataList11);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0969");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getDividendQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getGrossOpIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getTotalAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getPrefStockQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getStDebtQdata();
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
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0970");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived3.writeList("");
        boolean boolean7 = indexDerived3.isInList("hi!");
        java.lang.String str8 = indexDerived3.listName;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived12 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("hi!", (int) (byte) -1, (int) ' ');
        java.util.List<java.lang.String> strList13 = indexDerived12.indexList;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData> companyDerivedDataList14 = indexDerived12.idList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived18 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        java.util.List<java.lang.String> strList19 = indexDerived18.indexList;
        indexDerived18.listName = "";
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived25 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived25.writeList("");
        java.util.List<java.lang.String> strList28 = indexDerived25.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived32 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived32.writeList("");
        java.util.List<java.lang.String> strList35 = indexDerived32.indexList;
        indexDerived25.indexList = strList35;
        indexDerived18.addToList(strList35);
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived41 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived41.writeList("");
        java.util.List<java.lang.String> strList44 = indexDerived41.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived48 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived48.writeList("");
        java.util.List<java.lang.String> strList51 = indexDerived48.indexList;
        indexDerived41.indexList = strList51;
        indexDerived18.addToList(strList51);
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived57 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived57.writeList("");
        java.util.List<java.lang.String> strList60 = indexDerived57.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived64 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived64.writeList("");
        java.util.List<java.lang.String> strList67 = indexDerived64.indexList;
        indexDerived57.indexList = strList67;
        indexDerived57.readList("");
        java.util.List<java.lang.String> strList71 = indexDerived57.indexList;
        indexDerived18.indexList = strList71;
        indexDerived12.indexList = strList71;
        indexDerived3.indexList = strList71;
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNull(companyDerivedDataList14);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertNotNull(strList44);
        org.junit.Assert.assertNotNull(strList51);
        org.junit.Assert.assertNotNull(strList60);
        org.junit.Assert.assertNotNull(strList67);
        org.junit.Assert.assertNotNull(strList71);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0971");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getTotalLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getTotalAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getRdQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0972");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getDividendQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getGrossOpIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getTotalAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getPrefStockQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getRdQdata();
        int int12 = companyDerived3.getQuarter();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyDerived3.getRoeQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyDerived3.getAcctPayableQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(quarterlyDouble13);
        org.junit.Assert.assertNull(quarterlyDouble14);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0973");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getDivCostQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getAcctPayableQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getCashFromOpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getOtherCurrAssetsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0974");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getSalesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getTotalAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getIntExpNonOpQdata();
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
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0975");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getLiabEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getTotalOpExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getWcfcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getLtInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getLtInvestQdata();
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
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0976");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getIncPrimaryEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getWorkingCapitalQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getGrossOpIncQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0977");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) (short) -1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getAcctPayableQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0978");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = companyDerived3.getPrefStockQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = companyDerived3.getEpsContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = companyDerived3.getAcctRxQdata();
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
        org.junit.Assert.assertNull(quarterlyDouble17);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0979");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        boolean boolean4 = companyDerived3.isValid();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getCashFromFinQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getSalesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getTotalLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getCashFromFinQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getOtherLtLiabQdata();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0980");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getCogsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getTotalOpExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getPrefStockQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getIntExpQdata();
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
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0981");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyDerived3.getDivCostQdata();
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
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0982");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData2 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((int) (short) 0, 0);
        companyDerivedData2.year = 10;
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0983");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        int int5 = companyDerived3.getQuarter();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getPrefStockQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getOtherCurrLiabQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0984");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getAcctPayableQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getLiabEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getLtDebtQdata();
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
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0985");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getAcctPayableQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getLiabEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getPrefStockQdata();
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
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0986");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) (byte) 0, (int) ' ', fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getBvpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getRdQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getIncTaxQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0987");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived(35, 0, fieldData2);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0988");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getTotalLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getGrossOpIncQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0989");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getCurrentRatioQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherLtAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getNonrecurringItemsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getIncPrimaryEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getOtherIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getCashFromFinQdata();
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
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0990");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyDerived3.getCapExQdata();
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
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0991");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getIncPrimaryEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getEquityQdata();
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
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0992");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 100, (int) (byte) -1);
        indexDerived3.listName = "hi!";
        indexDerived3.writeList("");
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0993");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData2 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((int) (byte) 10, (int) '4');
        companyDerivedData2.year = 35;
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0994");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.write((int) (short) 0, (int) '4');
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0995");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getDividendQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getIntExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getAdjToIncQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0996");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getCashFromInvQdata();
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
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0997");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getStDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getPrefStockQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getStDebtQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0998");
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
        int int50 = companyDerivedData2.quarter;
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
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0999");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("hi!", (int) '4', (int) (byte) -1);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test1000");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getCogsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getTotalOpExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getNetIncQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
    }
}

