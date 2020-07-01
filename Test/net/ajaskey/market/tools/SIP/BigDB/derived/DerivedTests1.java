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
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getIntExpNonOpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getTotalAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getOtherLtAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getCashFromFinQdata();
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
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0502");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getNetFixedAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getAdjToIncQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0503");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getDividendQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGrossOpIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getRdQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getDivCostQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0504");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getIntTotQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getAdjToIncQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0505");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getCashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getDividendQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getBvpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getTotalLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getCapExQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0506");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getIncTaxQdata();
        int int7 = companyAggregate3.getYear();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getEpsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0507");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getOtherLtAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getTotalAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getPricesQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0508");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getEquityQdata();
        int int9 = companyAggregate3.getYear();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getRoeQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getIntExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getNetFixedAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getOtherCurrAssetsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
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
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getOtherLtAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGrossOpIncQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0510");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getNetIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getIntExpNonOpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getPeQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getLtDebtQdata();
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
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0511");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getCashFromFinQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getOtherCurrLiabQdata();
        java.lang.Class<?> wildcardClass7 = companyAggregate3.getClass();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0512");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getSalesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getIncPrimaryEpsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0513");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getDividendQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getCashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getNetFixedAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getAdjToIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getPeQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getDepreciationQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0514");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getAdjToIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getIncPrimaryEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getLtDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getCashflowQdata();
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
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0515");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getEquityQdata();
        int int9 = companyAggregate3.getYear();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getStInvestQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
        org.junit.Assert.assertNull(quarterlyDouble12);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0516");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getIntExpNonOpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getPrefStockQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getCashFromInvQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getEpsContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getStDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getCashFromOpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyAggregate3.getRoeQdata();
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
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0517");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getOtherIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getCashFromOpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getNetcashflowQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0518");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getWorkingCapitalQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getLiabEquityQdata();
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
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0519");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getLtInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getGrossIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getGrossOpIncQdata();
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
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0520");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getNetFixedAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getIncTaxQdata();
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
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0521");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getEquityQdata();
        int int9 = companyAggregate3.getYear();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getCashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getCashFromFinQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
        org.junit.Assert.assertNull(quarterlyDouble12);
        org.junit.Assert.assertNull(quarterlyDouble13);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0522");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getWcfcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getOtherLtAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getRdQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyAggregate3.getCurrAssetsQdata();
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
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0523");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (byte) 0, 100, filetypeEnum2);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0524");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getEpsContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getOtherLtAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getIntTotQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0525");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getWcfcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getCapExQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getOpMarginQdata();
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
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0526");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getRoeQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getOtherCurrAssetsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0527");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getNetIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getNetcashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getNonrecurringItemsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getLtDebtQdata();
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
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0528");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getOtherLtLiabQdata();
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
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0529");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getIntExpNonOpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getTotalLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getOtherCurrLiabQdata();
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
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getDividendQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGrossOpIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getAcctPayableQdata();
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
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0531");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getStDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getLiabEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getBvpsQdata();
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
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0532");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getSalesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getIncTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getIncPrimaryEpsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0533");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getWcfcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getCapExQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getOtherIncQdata();
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
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0534");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getIntExpNonOpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getTotalAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getRdQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getWorkingCapitalQdata();
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
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0535");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getDividendQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getPeQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getEpsContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getPricesQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0536");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getTotalOpExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getDividendQdata();
        int int9 = companyAggregate3.getYear();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getCurrentRatioQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0537");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getWcfcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getNetcashflowQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0538");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getWcfcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getGrossIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getDivCostQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getIncTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyAggregate3.getEpsContQdata();
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
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0539");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.write((int) (short) 100, 1);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0540");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getWcfcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getGrossIncQdata();
        boolean boolean12 = companyAggregate3.isValid();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getCashFromFinQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyAggregate3.getLtInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = companyAggregate3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = companyAggregate3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = companyAggregate3.getPrefStockQdata();
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
        org.junit.Assert.assertNull(quarterlyDouble15);
        org.junit.Assert.assertNull(quarterlyDouble16);
        org.junit.Assert.assertNull(quarterlyDouble17);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0541");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb(10, (int) (byte) -1, filetypeEnum2);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0542");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getIntExpNonOpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getGrossIncQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0543");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getAcctPayableQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getLtDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getOtherLtLiabQdata();
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
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0544");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getEquityQdata();
        int int9 = companyAggregate3.getYear();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getRoeQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getNetIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getWorkingCapitalQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
        org.junit.Assert.assertNull(quarterlyDouble12);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0545");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getAcctPayableQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getNetFixedAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getNetIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getIncPrimaryEpsQdata();
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
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getLtInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getCurrAssetsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0547");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.write(10, 100);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0548");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getStDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getIntExpNonOpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getIntExpNonOpQdata();
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
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0549");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getTanAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getDivCostQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getGrossIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyAggregate3.getIncTaxQdata();
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
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0550");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getAcctPayableQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getOpMarginQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0551");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (byte) 100, 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getCashFromFinQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getCashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getWcfcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getDepreciationQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0552");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getCashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getGrossOpIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getTotalAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getCashFromOpsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0553");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getRoeQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getCogsQdata();
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
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0554");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getPrefStockQdata();
        int int8 = companyAggregate3.getYear();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getSalesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getUnusualIncQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0555");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getNetFixedAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getInventoryQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getCashFromInvQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getTotalAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getOtherIncQdata();
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
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0556");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getWcfcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getGrossIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getEpsDilQdata();
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
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0557");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) '4', (int) (short) -1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getTotalLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getIntTotQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0558");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getEquityQdata();
        int int9 = companyAggregate3.getYear();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getRoeQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getSharesQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
        org.junit.Assert.assertNull(quarterlyDouble12);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0559");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getNetIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getNetcashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getNonrecurringItemsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getWorkingCapitalQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getNetMarginQdata();
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
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0560");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getIntExpNonOpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getIncTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getIntTotQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getDivCostQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getTanAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyAggregate3.getBvpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = companyAggregate3.getIntExpNonOpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = companyAggregate3.getBvpsQdata();
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
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0561");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getEquityQdata();
        int int9 = companyAggregate3.getYear();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getNetcashflowQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
        org.junit.Assert.assertNull(quarterlyDouble12);
        org.junit.Assert.assertNull(quarterlyDouble13);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0562");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getAdjToIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getGrossOpIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getCapExQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getTotalOpExpQdata();
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
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0563");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8, fieldDataArray7);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (short) 0, (int) '4', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21, fieldDataArray20);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) (short) 0, (int) '4', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (-1), (int) (short) 10, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray34 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList35 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35, fieldDataArray34);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList30, (int) (short) 0, (int) '4', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray40 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList41 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList41, fieldDataArray40);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList30, 0, (int) '4', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList41);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (-1), (int) ' ', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList41);
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList50 = new java.util.ArrayList<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList50, strArray49);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray54 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList55 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList55, fieldDataArray54);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList50, (int) (short) 0, (int) '4', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList55);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (short) 100, (int) (byte) -1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList55);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList61 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (short) 10, (int) (byte) 10, fieldDataList61);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(fieldDataArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(fieldDataArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(fieldDataArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(fieldDataArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(fieldDataArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0564");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getNetIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getNetcashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getNetIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getCashQdata();
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
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0565");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getIntExpNonOpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getPrefStockQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getCashFromInvQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getEpsContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getStDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyAggregate3.getTotalOpExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = companyAggregate3.getCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = companyAggregate3.getPreTaxIncQdata();
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
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0566");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getNetIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getIntExpNonOpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getAcctPayableQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getTotalAssetsQdata();
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
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0567");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getWcfcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getTotalLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getAcctRxQdata();
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
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0568");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getDividendQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getStDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getNetIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getCashFromOpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getWcfcfQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0569");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getNetFixedAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getInventoryQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getCashFromInvQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getAcctPayableQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyAggregate3.getEpsContQdata();
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
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0570");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getCashFromFinQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getInventoryQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getCashFromFinQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getGrossIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyAggregate3.getWorkingCapitalQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = companyAggregate3.getBvpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = companyAggregate3.getInventoryQdata();
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
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0571");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getWcfcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getGrossIncQdata();
        boolean boolean12 = companyAggregate3.isValid();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getCashFromFinQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyAggregate3.getCashFromInvQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = companyAggregate3.getSalesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = companyAggregate3.getStDebtQdata();
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
        org.junit.Assert.assertNull(quarterlyDouble15);
        org.junit.Assert.assertNull(quarterlyDouble16);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0572");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getAdjToIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getWorkingCapitalQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getNetIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getDivCostQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyAggregate3.getIntExpQdata();
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
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0573");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getWcfcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getPeQdata();
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
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0574");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getDivCostQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0575");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getCapExQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getCashFromInvQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getCashFromInvQdata();
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
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0576");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getIntExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getInventoryQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getAcctPayableQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0577");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getWcfcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getCapExQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getEpsContQdata();
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
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0578");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getIntExpNonOpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getIncTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getPrefStockQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getBvpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyAggregate3.getRdQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = companyAggregate3.getBvpsQdata();
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
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0579");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getNetIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getSalesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getNetIncQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0580");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getIntExpNonOpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getIncTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getIntExpNonOpQdata();
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
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0581");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getIntExpNonOpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getPrefStockQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getBvpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getStInvestQdata();
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
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0582");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getPrefStockQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getTanAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getPeQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getEpsQdata();
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
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0583");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getCashFromInvQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getNetIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getCogsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getEpsQdata();
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
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0584");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getWcfcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getGrossIncQdata();
        boolean boolean12 = companyAggregate3.isValid();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getCashFromFinQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyAggregate3.getStInvestQdata();
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
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0585");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getDividendQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getNetIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getNonrecurringItemsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getLiabEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getBvpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getTanAssetsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0586");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getOtherIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getCashFromOpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getRoeQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getIntTotQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getGrossOpIncQdata();
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
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0587");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getCashFromFinQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getInventoryQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getOtherIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyAggregate3.getCogsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = companyAggregate3.getBvpsQdata();
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
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0588");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getTanAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getOtherLtLiabQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0589");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getEquityQdata();
        int int9 = companyAggregate3.getYear();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getRoeQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getIntExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getNetFixedAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getGrossOpIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyAggregate3.getOtherCurrLiabQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
        org.junit.Assert.assertNull(quarterlyDouble12);
        org.junit.Assert.assertNull(quarterlyDouble13);
        org.junit.Assert.assertNull(quarterlyDouble14);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0590");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getPrefStockQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getTanAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getInventoryQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getBvpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getCurrLiabQdata();
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
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0591");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getCashFromInvQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getNetIncQdata();
        int int10 = companyAggregate3.getQuarter();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0592");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getPrefStockQdata();
        int int8 = companyAggregate3.getYear();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getNetcashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getTanAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getTanAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getCashFromFinQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
        org.junit.Assert.assertNull(quarterlyDouble12);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0593");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getIntExpNonOpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getIncTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyAggregate3.getOtherLtLiabQdata();
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
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0594");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getWcfcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getGrossIncQdata();
        boolean boolean12 = companyAggregate3.isValid();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getSalesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyAggregate3.getSalesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = companyAggregate3.getCashFromFinQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = companyAggregate3.getCurrLiabQdata();
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
        org.junit.Assert.assertNull(quarterlyDouble15);
        org.junit.Assert.assertNull(quarterlyDouble16);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0595");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getWcfcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getEpsContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getDividendQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getCashFromFinQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getRdQdata();
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
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0596");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getEquityQdata();
        int int9 = companyAggregate3.getYear();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getWorkingCapitalQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getDividendQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyAggregate3.getBvpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = companyAggregate3.getLiabEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = companyAggregate3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = companyAggregate3.getIncTaxQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
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
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0597");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getDividendQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getNetIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getNonrecurringItemsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getLiabEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getBvpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getOtherIncQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0598");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getDivCostQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getCapExQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getBvpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getGrossOpIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyAggregate3.getRoeQdata();
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
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0599");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.write((int) (byte) 10, 10);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0600");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getPreTaxIncQdata();
        int int10 = companyAggregate3.getYear();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getAcctRxQdata();
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
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0601");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getNetFixedAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getLiabEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getOpMarginQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0602");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getEquityQdata();
        int int9 = companyAggregate3.getYear();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getWorkingCapitalQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getDividendQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyAggregate3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = companyAggregate3.getPeQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
        org.junit.Assert.assertNull(quarterlyDouble12);
        org.junit.Assert.assertNull(quarterlyDouble13);
        org.junit.Assert.assertNull(quarterlyDouble14);
        org.junit.Assert.assertNull(quarterlyDouble15);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0603");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getNetIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getIntExpNonOpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getTanAssetsQdata();
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
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getDepreciationQdata();
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
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0605");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getLtInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getTotalAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getNetIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getCapExQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0606");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getWcfcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getTotalLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getNetMarginQdata();
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
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0607");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getPrefStockQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getTanAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getIncTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getOtherLtAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getNetIncQdata();
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
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0608");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getRoeQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getNetFixedAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getEpsDilContQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0609");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getIntExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getAcctPayableQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getIntExpNonOpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getNetIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getCashflowQdata();
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
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0610");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getCurrentRatioQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0611");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getAdjToIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getSalesQdata();
        boolean boolean12 = companyAggregate3.isValid();
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
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0612");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getCashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getBvpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getNonrecurringItemsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0613");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getLtInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getIncAfterTaxQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0614");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getLtInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getTotalAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getIntExpQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0615");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getOtherLtAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getTotalAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getCurrentRatioQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getAcctPayableQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getCurrAssetsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0616");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getEquityQdata();
        int int9 = companyAggregate3.getYear();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getWorkingCapitalQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = companyAggregate3.getRdQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
        org.junit.Assert.assertNull(quarterlyDouble12);
        org.junit.Assert.assertNull(quarterlyDouble13);
        org.junit.Assert.assertNull(quarterlyDouble14);
        org.junit.Assert.assertNull(quarterlyDouble15);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0617");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getIntTotQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getIntTotQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getNetIncQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0618");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getLtInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getGrossIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getIncAfterTaxQdata();
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
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0619");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getBvpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getCashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getTanAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getSalesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getSalesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getAcctPayableQdata();
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
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0620");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getCashFromFinQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getIncTaxQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0621");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getIntExpNonOpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getTotalAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getCashFromInvQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getRoeQdata();
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
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0622");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getNetIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getIntExpNonOpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getAcctPayableQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getGrossOpIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getLiabEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getCashQdata();
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
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0623");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getDivCostQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getDivCostQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getAcctRxQdata();
        int int12 = companyAggregate3.getYear();
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
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0624");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getNonrecurringItemsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getNetFixedAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getLtInvestQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0625");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getOtherCurrLiabQdata();
        boolean boolean8 = companyAggregate3.isValid();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getCashFromOpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getPricesQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0626");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getCashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getCashFromFinQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getOtherLtAssetsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0627");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetFixedAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getInventoryQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getGoodwillQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0628");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getLtInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSalesQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0629");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getNetFixedAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getDivCostQdata();
        boolean boolean11 = companyAggregate3.isValid();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0630");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getCashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getLtInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getNonrecurringItemsQdata();
        boolean boolean7 = companyAggregate3.isValid();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getEpsDilContQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0631");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getNetIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getWcfcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getDivCostQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getDividendQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getPeQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getDivCostQdata();
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
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0632");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getNetIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getLtDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getTotalLiabQdata();
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
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0633");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getStInvestQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0634");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getIntExpNonOpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getPrefStockQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getCashFromInvQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getIncTaxQdata();
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
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0635");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getCashFromFinQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getInventoryQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getCashFromFinQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getRoeQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyAggregate3.getNetcashflowQdata();
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
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0636");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getAdjToIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getSalesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getCashFromOpsQdata();
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
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0637");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getAdjToIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getGrossOpIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getTotalOpExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getPricesQdata();
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
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0638");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getLtInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getGrossIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getIntTotQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyAggregate3.getOpMarginQdata();
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
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0639");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getSalesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getIncPrimaryEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getNetIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getNonrecurringItemsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0640");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getAdjToIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getIncPrimaryEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getNetMarginQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0641");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getTotalOpExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getDividendQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getWcfcfQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0642");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) '#', (int) ' ', filetypeEnum2);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0643");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetFixedAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getTanAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getOtherIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getDividendQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getOtherIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getGoodwillQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0644");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getRdQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getSharesQdata();
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
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0645");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getSalesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getCashflowQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0646");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getWcfcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getGrossIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getCurrentRatioQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getCashQdata();
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
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0647");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getNetFixedAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getLiabEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getCashFromFinQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getTotalAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getIntExpNonOpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyAggregate3.getCogsQdata();
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
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0648");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getDividendQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getCurrentRatioQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getWcfcfQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0649");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getWcfcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getGrossIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getDivCostQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyAggregate3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = companyAggregate3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = companyAggregate3.getAdjToIncQdata();
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
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0650");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getDivCostQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getLiabEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getWcfcfQdata();
        int int11 = companyAggregate3.getYear();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0651");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getCapExQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getCashFromInvQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getIncTaxQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0652");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getPrefStockQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getTanAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getCashFromOpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getGrossIncQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0653");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getEquityQdata();
        int int9 = companyAggregate3.getYear();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getIntExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getDividendQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyAggregate3.getPrefStockQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = companyAggregate3.getCurrentRatioQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
        org.junit.Assert.assertNull(quarterlyDouble12);
        org.junit.Assert.assertNull(quarterlyDouble13);
        org.junit.Assert.assertNull(quarterlyDouble14);
        org.junit.Assert.assertNull(quarterlyDouble15);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0654");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getTotalOpExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getFcfQdata();
        boolean boolean9 = companyAggregate3.isValid();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getPreTaxIncQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0655");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) 'a', (int) (short) 100, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getPreTaxIncQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0656");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getWcfcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getGrossIncQdata();
        boolean boolean12 = companyAggregate3.isValid();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getSalesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyAggregate3.getUnusualIncQdata();
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
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0657");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getCashQdata();
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
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0658");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getAdjToIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getIncPrimaryEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getOtherLtAssetsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0659");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getNetIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getNetcashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getNetIncQdata();
        int int12 = companyAggregate3.getQuarter();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0660");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getEquityQdata();
        int int9 = companyAggregate3.getYear();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getWorkingCapitalQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getDividendQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyAggregate3.getDivCostQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
        org.junit.Assert.assertNull(quarterlyDouble12);
        org.junit.Assert.assertNull(quarterlyDouble13);
        org.junit.Assert.assertNull(quarterlyDouble14);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0661");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getAdjToIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getInventoryQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getNetIncQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0662");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getIntTotQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getNetIncQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0663");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getWcfcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getEpsContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getLtDebtQdata();
        int int11 = companyAggregate3.getYear();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getTotalOpExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getOtherCurrLiabQdata();
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
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0664");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getWcfcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getOtherLtAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getDivCostQdata();
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
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0665");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getEquityQdata();
        int int9 = companyAggregate3.getYear();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getWorkingCapitalQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getDividendQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyAggregate3.getBvpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = companyAggregate3.getLiabEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = companyAggregate3.getPricesQdata();
        int int17 = companyAggregate3.getYear();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = companyAggregate3.getRoeQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = companyAggregate3.getRoeQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = companyAggregate3.getEpsDilQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
        org.junit.Assert.assertNull(quarterlyDouble12);
        org.junit.Assert.assertNull(quarterlyDouble13);
        org.junit.Assert.assertNull(quarterlyDouble14);
        org.junit.Assert.assertNull(quarterlyDouble15);
        org.junit.Assert.assertNull(quarterlyDouble16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNull(quarterlyDouble18);
        org.junit.Assert.assertNull(quarterlyDouble19);
        org.junit.Assert.assertNull(quarterlyDouble20);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0666");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getIntExpNonOpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getIncTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getIntTotQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getIncTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getCapExQdata();
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
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0667");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getTotalOpExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getDividendQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getCurrLiabQdata();
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
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0668");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getEquityQdata();
        int int9 = companyAggregate3.getYear();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getBvpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getOtherLtLiabQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
        org.junit.Assert.assertNull(quarterlyDouble12);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0669");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getAcctPayableQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getNetFixedAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getCashFromOpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getRoeQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0670");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getNetIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getRoeQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getIntTotQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getInventoryQdata();
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
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0671");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getCogsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getWorkingCapitalQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0672");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getDividendQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGrossOpIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getNetIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getCurrentRatioQdata();
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
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0673");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getDividendQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getStDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getEpsContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getIncPrimaryEpsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0674");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getIntExpNonOpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getIncTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getIntTotQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getPeQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = companyAggregate3.getNetFixedAssetsQdata();
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
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0675");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getCashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getIncAfterTaxQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0676");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getAdjToIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getIncPrimaryEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getEpsContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getRoeQdata();
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
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0677");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getCashFromFinQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getNetFixedAssetsQdata();
        boolean boolean13 = companyAggregate3.isValid();
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
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0678");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getPrefStockQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getInventoryQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getWorkingCapitalQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0679");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.write((int) (byte) 10, (int) ' ');
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0680");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getIntExpNonOpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getOtherLtLiabQdata();
        int int10 = companyAggregate3.getYear();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getGoodwillQdata();
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
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0681");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) '4', (int) (short) 1, filetypeEnum2);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0682");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getDivCostQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getAcctPayableQdata();
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
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getOtherIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getAcctPayableQdata();
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
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0684");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getIntExpNonOpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getGrossIncQdata();
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
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getAdjToIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getWorkingCapitalQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getNetIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getNetFixedAssetsQdata();
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
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0686");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getWcfcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getGrossIncQdata();
        boolean boolean12 = companyAggregate3.isValid();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getCashFromFinQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = companyAggregate3.getLiabEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = companyAggregate3.getPeQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = companyAggregate3.getDivCostQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = companyAggregate3.getStDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = companyAggregate3.getAcctRxQdata();
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
        org.junit.Assert.assertNull(quarterlyDouble15);
        org.junit.Assert.assertNull(quarterlyDouble16);
        org.junit.Assert.assertNull(quarterlyDouble17);
        org.junit.Assert.assertNull(quarterlyDouble18);
        org.junit.Assert.assertNull(quarterlyDouble19);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0687");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getTanAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getDivCostQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getOtherLtAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyAggregate3.getIncAfterTaxQdata();
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
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0688");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getNonrecurringItemsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getCashFromOpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getOtherLtAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getBvpsQdata();
        int int11 = companyAggregate3.getYear();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getPeQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getLtDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyAggregate3.getCurrAssetsQdata();
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
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0689");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getAdjToIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getEpsContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getStInvestQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0690");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate(0, (int) (byte) 10, fieldData2);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0691");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8, fieldDataArray7);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (short) 0, (int) '4', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray13 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList14, fieldDataArray13);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, 0, (int) '4', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList14);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray26 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList27, fieldDataArray26);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList22, (int) (short) 0, (int) '4', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList27);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray32 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList33 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList33, fieldDataArray32);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList22, 0, (int) '4', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList33);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (short) 0, (int) (byte) 0, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList33);
        java.lang.String[] strArray41 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList42 = new java.util.ArrayList<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList42, strArray41);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray46 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList47 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList47, fieldDataArray46);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList42, (int) (short) 0, (int) '4', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList47);
        java.lang.String[] strArray54 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList55 = new java.util.ArrayList<java.lang.String>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList55, strArray54);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray59 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList60 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList60, fieldDataArray59);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList55, (int) (short) 0, (int) '4', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList60);
        java.lang.String[] strArray67 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList68 = new java.util.ArrayList<java.lang.String>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList68, strArray67);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray72 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList73 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList73, fieldDataArray72);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList68, (int) (short) 0, (int) '4', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList73);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList55, 1, (int) ' ', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList73);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList42, (int) (short) -1, 10, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList73);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (short) 1, (int) (short) 0, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList73);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(fieldDataArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(fieldDataArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(fieldDataArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(fieldDataArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(fieldDataArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(fieldDataArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(fieldDataArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0692");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getWcfcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getOtherLtAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getGrossIncQdata();
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
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getDividendQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getPeQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getEpsContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getNetIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getCogsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getSharesQdata();
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
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0694");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getWorkingCapitalQdata();
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
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0695");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getIntExpNonOpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getWcfcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getCashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getAcctPayableQdata();
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
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0696");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getAdjToIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getGrossOpIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getTanAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getPricesQdata();
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
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0697");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getLtDebtQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0698");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (byte) 100, 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getStDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getLtInvestQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0699");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getAdjToIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getIncPrimaryEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getLtDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getGrossIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getCashQdata();
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
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0700");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getTotalOpExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getDividendQdata();
        int int9 = companyAggregate3.getYear();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getCashFromInvQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getInventoryQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getTotalLiabQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
        org.junit.Assert.assertNull(quarterlyDouble12);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0701");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getCashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getIncTaxQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0702");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getDivCostQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getCapExQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getBvpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getGrossOpIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getNonrecurringItemsQdata();
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
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0703");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getTotalOpExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getEpsContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getLtInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getSharesQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0704");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getNetIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getLtDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getPreTaxIncQdata();
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
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0705");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getOtherIncQdata();
        int int9 = companyAggregate3.getYear();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getStDebtQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
        org.junit.Assert.assertNull(quarterlyDouble12);
        org.junit.Assert.assertNull(quarterlyDouble13);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0706");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getDivCostQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getDivCostQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getOpMarginQdata();
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
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0707");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getLtInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getCashFromOpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getDividendQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0708");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getDivCostQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getLiabEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getTotalOpExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getLtInvestQdata();
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
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0709");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPeQdata();
        int int7 = companyAggregate3.getQuarter();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0710");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getDividendQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getCurrentRatioQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getNetFixedAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getNetcashflowQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0711");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getOtherIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getCashFromOpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getTotalLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getDividendQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyAggregate3.getNetFixedAssetsQdata();
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
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0712");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getOtherIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getEpsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0713");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getNetFixedAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getDepreciationQdata();
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
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0714");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getWcfcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getCapExQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0715");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate(1, (int) (byte) 100, fieldData2);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0716");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getNetIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getEpsDilContQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0717");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getWcfcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getTotalLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getRdQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getPrefStockQdata();
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
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0718");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getWcfcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getGrossIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getOpMarginQdata();
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
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0719");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getNetFixedAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getFcfQdata();
        int int10 = companyAggregate3.getYear();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0720");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getCogsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getAdjToIncQdata();
        int int11 = companyAggregate3.getQuarter();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getNonrecurringItemsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(quarterlyDouble12);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0721");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getOtherLtAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getTotalAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getLiabEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getAcctPayableQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0722");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getIntExpNonOpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getPrefStockQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getCashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getLtDebtQdata();
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
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getOtherLtAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPrefStockQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getCashFromOpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getRdQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0724");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getDivCostQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getCapExQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getWcfcfQdata();
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
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0725");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getWcfcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getGrossIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getPeQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getCapExQdata();
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
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0726");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getWcfcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getCapExQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getNetFixedAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getWorkingCapitalQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyAggregate3.getOtherCurrLiabQdata();
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
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0727");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getOtherIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getCashFromOpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getTotalLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getDividendQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getNetcashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyAggregate3.getEpsDilQdata();
        java.lang.Class<?> wildcardClass15 = companyAggregate3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0728");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getTanAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getTotalLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getOtherLtAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getCashFromOpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyAggregate3.getTotalLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = companyAggregate3.getOtherCurrAssetsQdata();
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
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0729");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getIntExpNonOpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getWcfcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getCashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getCapExQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getGrossIncQdata();
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
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0730");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getWcfcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getCapExQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getNetFixedAssetsQdata();
        int int13 = companyAggregate3.getYear();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyAggregate3.getIntExpQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
        org.junit.Assert.assertNull(quarterlyDouble12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(quarterlyDouble14);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0731");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getCashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getDividendQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getBvpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getDivCostQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getPrefStockQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getCashFromInvQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getEpsDilContQdata();
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
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getAcctPayableQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getAcctPayableQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getIntExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getCurrLiabQdata();
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
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0733");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getTanAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getTotalLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getCashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getWcfcfQdata();
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
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0734");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getStDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getTotalLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getOtherLtAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyAggregate3.getCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = companyAggregate3.getWorkingCapitalQdata();
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
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0735");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getEpsContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getTotalAssetsQdata();
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
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getNetIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getNetcashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getNonrecurringItemsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getIntExpNonOpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getBvpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getGrossIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyAggregate3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = companyAggregate3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = companyAggregate3.getStInvestQdata();
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
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0737");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getNetIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getNetcashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getDividendQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyAggregate3.getLtDebtQdata();
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
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0738");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getRoeQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getDividendQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getOpMarginQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0739");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getCashFromFinQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getInventoryQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getCashFromFinQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getGrossIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyAggregate3.getWorkingCapitalQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = companyAggregate3.getCashFromOpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = companyAggregate3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = companyAggregate3.getIntExpQdata();
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
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0740");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getDividendQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getCashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getNetFixedAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getAdjToIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getOpMarginQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0741");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getNetFixedAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getPrefStockQdata();
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
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0742");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getStDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getBvpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getIntTotQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getGoodwillQdata();
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
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0743");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getIntExpNonOpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getCashFromFinQdata();
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
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getCapExQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getAdjToIncQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0745");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (short) 0, 100, filetypeEnum2);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0746");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getLtInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getCogsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getOtherLtAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getSalesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getTotalLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyAggregate3.getCashFromOpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = companyAggregate3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = companyAggregate3.getInventoryQdata();
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
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0747");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getEpsDilQdata();
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
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0748");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetFixedAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getNetIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getOtherCurrAssetsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0749");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getTanAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getDivCostQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getOtherLtAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyAggregate3.getOtherLtLiabQdata();
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
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0750");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (byte) 100, 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getTotalOpExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getUnusualIncQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0751");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getPrefStockQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getTanAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getPeQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getLtInvestQdata();
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
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0752");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8, fieldDataArray7);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (short) 0, (int) '4', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21, fieldDataArray20);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) (short) 0, (int) '4', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (-1), (int) (short) 10, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray34 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList35 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35, fieldDataArray34);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList30, (int) (short) 0, (int) '4', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray40 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList41 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList41, fieldDataArray40);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList30, 0, (int) '4', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList41);
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList49 = new java.util.ArrayList<java.lang.String>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList49, strArray48);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray53 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList54 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList54, fieldDataArray53);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList49, (int) (short) 0, (int) '4', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList54);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray59 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList60 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList60, fieldDataArray59);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList49, 0, (int) '4', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList60);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList30, (int) (short) 0, (int) (byte) 0, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList60);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList60);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(fieldDataArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(fieldDataArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(fieldDataArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(fieldDataArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(fieldDataArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(fieldDataArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0753");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getAcctPayableQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getAcctPayableQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getNetcashflowQdata();
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
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getCashFromFinQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getInventoryQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getOtherLtAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyAggregate3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = companyAggregate3.getEpsDilQdata();
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
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0755");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getPrefStockQdata();
        int int8 = companyAggregate3.getYear();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getNetcashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getTanAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getTanAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getCurrentRatioQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
        org.junit.Assert.assertNull(quarterlyDouble12);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0756");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getLtInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getGrossIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getIntTotQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyAggregate3.getUnusualIncQdata();
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
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0757");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getIntTotQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getIntTotQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getAdjToIncQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0758");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getEquityQdata();
        int int9 = companyAggregate3.getYear();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getTanAssetsQdata();
        int int13 = companyAggregate3.getYear();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
        org.junit.Assert.assertNull(quarterlyDouble12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0759");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getIntExpNonOpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getPrefStockQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getBvpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getGrossIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getCashFromFinQdata();
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
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0760");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray13 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList14, fieldDataArray13);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList9, (int) (short) 0, (int) '4', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList14);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray26 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList27, fieldDataArray26);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList22, (int) (short) 0, (int) '4', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList27);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList9, (-1), (int) (short) 10, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList27);
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray40 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList41 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList41, fieldDataArray40);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList36, (int) (short) 0, (int) '4', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList41);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray46 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList47 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList47, fieldDataArray46);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList36, 0, (int) '4', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList47);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList9, (-1), (int) ' ', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList47);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList2, 0, (int) (short) -1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList47);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(fieldDataArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(fieldDataArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(fieldDataArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(fieldDataArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0761");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getDividendQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getNonrecurringItemsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getLtDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getSalesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getOtherCurrLiabQdata();
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
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getCashFromFinQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getInventoryQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getCashFromFinQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyAggregate3.getOtherLtAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = companyAggregate3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = companyAggregate3.getCashflowQdata();
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
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0763");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.write(10, (int) (byte) 0);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0764");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getIntExpNonOpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getIncTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getPrefStockQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getBvpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyAggregate3.getRdQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = companyAggregate3.getOtherLtLiabQdata();
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
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0765");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (byte) 1, (int) (byte) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0766");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getAdjToIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getGrossOpIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getTotalOpExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyAggregate3.getIntExpQdata();
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
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0767");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getPreTaxIncQdata();
        int int10 = companyAggregate3.getYear();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getNonrecurringItemsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getEpsContQdata();
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
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0768");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getNetFixedAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getAdjToIncQdata();
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
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0769");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getLtInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getIncTaxQdata();
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
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0770");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getIntExpNonOpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getTotalAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getCashflowQdata();
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
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0771");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getWcfcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getOtherIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getIncTaxQdata();
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
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0772");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getNetIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getLtDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getGrossOpIncQdata();
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
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0773");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getNetIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getGrossOpIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getLiabEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getPrefStockQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getOtherCurrLiabQdata();
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
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0774");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getNonrecurringItemsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getCashFromOpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getOtherLtAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getBvpsQdata();
        int int11 = companyAggregate3.getYear();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getPeQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getLtDebtQdata();
        java.lang.Class<?> wildcardClass14 = companyAggregate3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0775");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getNetIncQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0776");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getAcctPayableQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getCashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getNetFixedAssetsQdata();
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
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getNetFixedAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getInventoryQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getCashFromInvQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getTotalOpExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyAggregate3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = companyAggregate3.getIntExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = companyAggregate3.getCashFromOpsQdata();
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
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0778");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getCashFromFinQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getInventoryQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getCashFromFinQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyAggregate3.getOtherLtAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = companyAggregate3.getPricesQdata();
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
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0779");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getRdQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getIncPrimaryEpsQdata();
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
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0780");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getEquityQdata();
        int int9 = companyAggregate3.getYear();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getWorkingCapitalQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getDividendQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyAggregate3.getBvpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = companyAggregate3.getTanAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = companyAggregate3.getRdQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
        org.junit.Assert.assertNull(quarterlyDouble12);
        org.junit.Assert.assertNull(quarterlyDouble13);
        org.junit.Assert.assertNull(quarterlyDouble14);
        org.junit.Assert.assertNull(quarterlyDouble15);
        org.junit.Assert.assertNull(quarterlyDouble16);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0781");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getDividendQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGrossOpIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getWorkingCapitalQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getStInvestQdata();
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
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0782");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getIntExpNonOpQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0783");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getTanAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getDivCostQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyAggregate3.getLiabEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = companyAggregate3.getEpsDilQdata();
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
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0784");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getTanAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getCapExQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0785");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getLtInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getCapExQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getTanAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getCashFromInvQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0786");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getTanAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getDivCostQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyAggregate3.getLiabEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = companyAggregate3.getDividendQdata();
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
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0787");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8, fieldDataArray7);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (short) 0, (int) '4', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21, fieldDataArray20);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) (short) 0, (int) '4', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, 1, (int) ' ', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList37 = new java.util.ArrayList<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList37, strArray36);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray41 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList42 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList42, fieldDataArray41);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList37, (int) (short) 0, (int) '4', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList42);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray47 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList48 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList48, fieldDataArray47);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList37, 0, (int) '4', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList48);
        java.lang.String[] strArray55 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList56 = new java.util.ArrayList<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList56, strArray55);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray60 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList61 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList61, fieldDataArray60);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList56, (int) (short) 0, (int) '4', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList61);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray66 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList67 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList67, fieldDataArray66);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList56, 0, (int) '4', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList67);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList37, (int) (byte) 0, (int) (byte) -1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList67);
        java.lang.String[] strArray75 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList76 = new java.util.ArrayList<java.lang.String>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList76, strArray75);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray80 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList81 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList81, fieldDataArray80);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList76, (int) (short) 0, (int) '4', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList81);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList37, (int) (byte) 10, (int) (short) 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList81);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList30, (int) (byte) 0, (int) 'a', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList81);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 0, (int) '4', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList81);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(fieldDataArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(fieldDataArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(fieldDataArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(fieldDataArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(fieldDataArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(fieldDataArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(fieldDataArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0788");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.write(0, (int) (byte) 0);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0789");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getDividendQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getGrossOpIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getStDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getPeQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0790");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getNetIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getIntExpNonOpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getAcctPayableQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getGrossOpIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getRdQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getAdjToIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = companyAggregate3.getRdQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = companyAggregate3.getAdjToIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = companyAggregate3.getTotalLiabQdata();
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
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0791");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getNetIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getNetcashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getCashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getDivCostQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getStInvestQdata();
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
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0792");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getTanAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getTotalLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getWcfcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getWcfcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyAggregate3.getLtInvestQdata();
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
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0793");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getIntTotQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getIntExpNonOpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getLtDebtQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0794");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate(0, 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getGrossOpIncQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0795");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getWcfcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getCapExQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getNetIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getOtherLtAssetsQdata();
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
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0796");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getLtInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getOtherLtAssetsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0797");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getNonrecurringItemsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getCashFromOpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getOtherLtAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getBvpsQdata();
        int int11 = companyAggregate3.getYear();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getIntExpQdata();
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
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0798");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getPrefStockQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getTanAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getPeQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getCashFromInvQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getCashFromOpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getFcfQdata();
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
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getLtInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getLtInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getNonrecurringItemsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getIncTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyAggregate3.getOpMarginQdata();
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
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0800");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getTotalOpExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getCurrentRatioQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getIncPrimaryEpsQdata();
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
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0801");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getDividendQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getCashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getNetFixedAssetsQdata();
        boolean boolean8 = companyAggregate3.isValid();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getTotalAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getIntExpQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0802");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getIntExpNonOpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getPrefStockQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getCashFromInvQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getEpsContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getStDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyAggregate3.getCurrentRatioQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = companyAggregate3.getInventoryQdata();
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
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0803");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getIntExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getEquityQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0804");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getIntExpNonOpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getTotalLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getUnusualIncQdata();
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
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0805");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getPrefStockQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getTanAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getInventoryQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getBvpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getLiabEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getStInvestQdata();
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
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0806");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getLtInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getCapExQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getCapExQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getTotalAssetsQdata();
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
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0807");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) ' ', (int) (byte) 100, fieldData2);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0808");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getDivCostQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getLiabEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getOtherLtAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getWorkingCapitalQdata();
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
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0809");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getEquityQdata();
        int int9 = companyAggregate3.getYear();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getWorkingCapitalQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getDividendQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyAggregate3.getBvpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = companyAggregate3.getAcctPayableQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = companyAggregate3.getOtherLtLiabQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
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
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0810");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getLtInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getInventoryQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getCashFromOpsQdata();
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
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0811");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getWcfcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getEpsContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getLtDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getDivCostQdata();
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
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0812");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetFixedAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getTanAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getWorkingCapitalQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getEpsDilContQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0813");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getEquityQdata();
        int int9 = companyAggregate3.getYear();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getWorkingCapitalQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getDividendQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyAggregate3.getBvpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = companyAggregate3.getTanAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = companyAggregate3.getCogsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = companyAggregate3.getCapExQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
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
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0814");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getWcfcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getOtherLtAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getCashFromFinQdata();
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
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0815");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getPrefStockQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getTanAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getIncTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getGrossIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getDividendQdata();
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
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0816");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getDividendQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getNetIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getNonrecurringItemsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getLiabEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getOpMarginQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0817");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getNetIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getIntExpNonOpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getPeQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getSalesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getPeQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyAggregate3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = companyAggregate3.getSharesQdata();
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
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0818");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getAdjToIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getGrossOpIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getGrossOpIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getNonrecurringItemsQdata();
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
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getOtherLtAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getTotalAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getLiabEquityQdata();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = quarterlyDouble7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0820");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getTotalOpExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getNonrecurringItemsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getIntExpNonOpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getCurrLiabQdata();
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
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0821");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getTotalOpExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getDividendQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getStInvestQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0822");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getCashFromInvQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getGrossIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getOtherCurrAssetsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0823");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getWcfcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getGrossIncQdata();
        boolean boolean12 = companyAggregate3.isValid();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getCashFromFinQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = companyAggregate3.getLiabEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = companyAggregate3.getPeQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = companyAggregate3.getDividendQdata();
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
        org.junit.Assert.assertNull(quarterlyDouble15);
        org.junit.Assert.assertNull(quarterlyDouble16);
        org.junit.Assert.assertNull(quarterlyDouble17);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0824");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getWcfcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getOtherIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getEquityQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0825");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getOtherLtAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getTotalAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getCurrentRatioQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getAcctPayableQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getIncPrimaryEpsQdata();
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
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0826");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getIntExpNonOpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getNonrecurringItemsQdata();
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
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0827");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getIntExpNonOpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getIncTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getRdQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getRdQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyAggregate3.getCashFromOpsQdata();
        int int15 = companyAggregate3.getYear();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = companyAggregate3.getBvpsQdata();
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
        org.junit.Assert.assertNull(quarterlyDouble16);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0828");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getNetIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getRoeQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getNetFixedAssetsQdata();
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
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0829");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getStDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getIntExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getOpMarginQdata();
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
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0830");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getSalesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getIncTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getCashflowQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0831");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getNetFixedAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getUnusualIncQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0832");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getOtherIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getCashFromOpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getBvpsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0833");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getNonrecurringItemsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getCashFromOpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getCurrentRatioQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getPrefStockQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getStDebtQdata();
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
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0834");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getEquityQdata();
        int int9 = companyAggregate3.getYear();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getRoeQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getNetIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getOtherLtAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getTotalOpExpQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
        org.junit.Assert.assertNull(quarterlyDouble12);
        org.junit.Assert.assertNull(quarterlyDouble13);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0835");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getEquityQdata();
        int int9 = companyAggregate3.getYear();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getStDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getSharesQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
        org.junit.Assert.assertNull(quarterlyDouble12);
        org.junit.Assert.assertNull(quarterlyDouble13);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0836");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.write((int) (byte) 0, 0);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0837");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getNetIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getDividendQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0838");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getIntTotQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getRdQdata();
        int int10 = companyAggregate3.getYear();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0839");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 100, (int) '4', fieldData2);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0840");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getTotalOpExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getEpsContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getLtInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getGrossIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getIntExpQdata();
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
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getNetIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getIntExpNonOpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getAcctPayableQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getNonrecurringItemsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getIntExpNonOpQdata();
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
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0842");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getDividendQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getPeQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getEpsContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getAcctPayableQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getIncTaxQdata();
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
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0843");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getDividendQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getDivCostQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getIntExpQdata();
        boolean boolean11 = companyAggregate3.isValid();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getRoeQdata();
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
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0844");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getEquityQdata();
        int int9 = companyAggregate3.getYear();
        int int10 = companyAggregate3.getQuarter();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0845");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getWcfcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getCapExQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getPrefStockQdata();
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
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0846");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) '4', (int) (short) -1, filetypeEnum2);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0847");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getNetFixedAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getEpsQdata();
        boolean boolean13 = companyAggregate3.isValid();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyAggregate3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = companyAggregate3.getIntTotQdata();
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
        org.junit.Assert.assertNull(quarterlyDouble14);
        org.junit.Assert.assertNull(quarterlyDouble15);
        org.junit.Assert.assertNull(quarterlyDouble16);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0848");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getOtherLtAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPrefStockQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getCashFromOpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getEquityQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0849");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getIntExpNonOpQdata();
        int int9 = companyAggregate3.getQuarter();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getCurrAssetsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0850");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getDivCostQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getCapExQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getBvpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getEpsContQdata();
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
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0851");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getNetIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getNetcashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getNonrecurringItemsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getEpsQdata();
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
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0852");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getCurrLiabQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0853");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getDividendQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGrossOpIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getWorkingCapitalQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getCashFromFinQdata();
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
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0854");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getNetIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getRoeQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getNonrecurringItemsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getTanAssetsQdata();
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
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0855");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getIntExpNonOpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getPrefStockQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getCashFromInvQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getEpsContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getStDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getCashFromOpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyAggregate3.getNetFixedAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = companyAggregate3.getNetMarginQdata();
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
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0856");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getIntExpNonOpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getPrefStockQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getCashFromInvQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getCurrAssetsQdata();
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
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0857");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getEpsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0858");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getLtInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getNetFixedAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getIncPrimaryEpsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0859");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getIntExpNonOpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getTotalAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getCashFromInvQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getCashFromOpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyAggregate3.getAcctPayableQdata();
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
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0860");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getBvpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getCashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getBvpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getOtherIncQdata();
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
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0861");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getCashFromInvQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getGrossIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getIntExpNonOpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getCogsQdata();
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
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getLtInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getGrossIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getLiabEquityQdata();
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
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0863");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getStDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getIntExpNonOpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyAggregate3.getCurrentRatioQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = companyAggregate3.getCashFromInvQdata();
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
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getOtherLtAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getNetIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getOtherCurrLiabQdata();
        int int9 = companyAggregate3.getYear();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getNetFixedAssetsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0865");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getLtInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getTotalAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getNetIncQdata();
        boolean boolean7 = companyAggregate3.isValid();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0866");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getBvpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getCashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getLtInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getTotalLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getTanAssetsQdata();
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
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0867");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getPrefStockQdata();
        int int8 = companyAggregate3.getYear();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getSalesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getAcctRxQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0868");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getNetFixedAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getIntExpNonOpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getIntExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getIncPrimaryEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getGoodwillQdata();
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
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0869");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getWcfcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getRdQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getOtherLtLiabQdata();
        boolean boolean14 = companyAggregate3.isValid();
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
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0870");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getCashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getTotalLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStDebtQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0871");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getEquityQdata();
        int int9 = companyAggregate3.getYear();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getStDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getCurrLiabQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
        org.junit.Assert.assertNull(quarterlyDouble12);
        org.junit.Assert.assertNull(quarterlyDouble13);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0872");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (short) 0, 1, filetypeEnum2);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0873");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getWcfcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getGrossIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getInventoryQdata();
        boolean boolean13 = companyAggregate3.isValid();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyAggregate3.getInventoryQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = companyAggregate3.getEpsDilContQdata();
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
        org.junit.Assert.assertNull(quarterlyDouble14);
        org.junit.Assert.assertNull(quarterlyDouble15);
        org.junit.Assert.assertNull(quarterlyDouble16);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0874");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getSalesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getIncPrimaryEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getCashQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0875");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getEquityQdata();
        int int9 = companyAggregate3.getYear();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getRoeQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getInventoryQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
        org.junit.Assert.assertNull(quarterlyDouble12);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0876");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getStDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getCurrAssetsQdata();
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
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0877");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getIntExpNonOpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getIncTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getPrefStockQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyAggregate3.getUnusualIncQdata();
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
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0878");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getTotalOpExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getDividendQdata();
        int int9 = companyAggregate3.getYear();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getCashFromInvQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getInventoryQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getLiabEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getSalesQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
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
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getOtherLtAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getTotalAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getCurrentRatioQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getDividendQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getIntTotQdata();
        int int10 = companyAggregate3.getQuarter();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0880");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getSalesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getCashFromOpsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0881");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getTanAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getTotalLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getWcfcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getStDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyAggregate3.getCashFromInvQdata();
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
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0882");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getRdQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getIntExpQdata();
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
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0883");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getNetFixedAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getInventoryQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getEpsContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getCashFromInvQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getIncTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyAggregate3.getEpsQdata();
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
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0884");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getNetIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getWcfcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getOtherIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getCurrAssetsQdata();
        boolean boolean12 = companyAggregate3.isValid();
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
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0885");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getNonrecurringItemsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getCashFromOpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getPrefStockQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getOtherIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getTanAssetsQdata();
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
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0886");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getIntExpNonOpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getBvpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getIntExpNonOpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getDividendQdata();
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
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0887");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getLtInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getCogsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getOtherLtAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getDivCostQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyAggregate3.getAcctPayableQdata();
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
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0888");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (byte) -1, (int) (short) 10, filetypeEnum2);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0889");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getNetIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getWcfcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getTotalOpExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getStInvestQdata();
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
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0890");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getBvpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getCashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getDividendQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getCogsQdata();
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
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0891");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getBvpsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0892");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getWcfcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getGrossIncQdata();
        boolean boolean12 = companyAggregate3.isValid();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getSalesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyAggregate3.getSalesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = companyAggregate3.getIncPrimaryEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = companyAggregate3.getNetIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = companyAggregate3.getTotalOpExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = companyAggregate3.getIncTaxQdata();
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
        org.junit.Assert.assertNull(quarterlyDouble15);
        org.junit.Assert.assertNull(quarterlyDouble16);
        org.junit.Assert.assertNull(quarterlyDouble17);
        org.junit.Assert.assertNull(quarterlyDouble18);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0893");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getIntExpNonOpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getTotalAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getOtherLtAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getIntTotQdata();
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
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0894");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getInventoryQdata();
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
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0895");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getBvpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getCashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getDividendQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getWcfcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getBvpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getStDebtQdata();
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
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0896");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getWcfcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getGrossIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getIncTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getCashQdata();
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
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0897");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetcashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getTotalAssetsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0898");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getIntExpNonOpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getTotalOpExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getWcfcfQdata();
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
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0899");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getOtherLtAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getTotalAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getCurrentRatioQdata();
        java.lang.Class<?> wildcardClass8 = companyAggregate3.getClass();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0900");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getEquityQdata();
        int int9 = companyAggregate3.getYear();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getStDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyAggregate3.getGrossOpIncQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
        org.junit.Assert.assertNull(quarterlyDouble12);
        org.junit.Assert.assertNull(quarterlyDouble13);
        org.junit.Assert.assertNull(quarterlyDouble14);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0901");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.write((int) (byte) 0, 100);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0902");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getAdjToIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getGrossOpIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getRdQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getGrossOpIncQdata();
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
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0903");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getStDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getLiabEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getLtDebtQdata();
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
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0904");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (byte) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getCurrLiabQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0905");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getNetIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getNetcashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getDividendQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyAggregate3.getBvpsQdata();
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
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0906");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getLtInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getNetFixedAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getNetcashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getStInvestQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0907");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getDivCostQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getNonrecurringItemsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getLtInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getGrossIncQdata();
        int int12 = companyAggregate3.getQuarter();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0908");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getDividendQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getStDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getEpsContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getOtherLtAssetsQdata();
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
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getCashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getGrossOpIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getNetcashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getPreTaxIncQdata();
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
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getOtherLtAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getNetIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getEquityQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0911");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getWcfcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getUnusualIncQdata();
        boolean boolean10 = companyAggregate3.isValid();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getGrossIncQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(quarterlyDouble11);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0912");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.write((int) (short) 10, (int) 'a');
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0913");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate(10, (int) (byte) 100, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getCashFromInvQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0914");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getNetIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getSharesQdata();
        int int9 = companyAggregate3.getQuarter();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0915");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getTotalOpExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getIntExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getDividendQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0916");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getDivCostQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getEpsDilQdata();
        boolean boolean8 = companyAggregate3.isValid();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getOtherLtLiabQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0917");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getNetFixedAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getInventoryQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getCashFromInvQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getTotalOpExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyAggregate3.getCurrAssetsQdata();
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
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0918");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getCashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getCashFromFinQdata();
        boolean boolean7 = companyAggregate3.isValid();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getTotalAssetsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0919");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getRoeQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getPricesQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0920");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (byte) 1, (int) (byte) 100, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getCurrentRatioQdata();
        int int5 = companyAggregate3.getYear();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0921");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getNetIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getWcfcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getGoodwillQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0922");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getDividendQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getGrossOpIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getNonrecurringItemsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getStInvestQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0923");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getRoeQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getEpsDilContQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0924");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getWcfcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getEpsContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getLtDebtQdata();
        boolean boolean11 = companyAggregate3.isValid();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getOtherLtLiabQdata();
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
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0925");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getDividendQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getGrossOpIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getCurrAssetsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0926");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getOtherLtAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPrefStockQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getCashFromOpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getCapExQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0927");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getRoeQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0928");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getNetIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getRoeQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getIntTotQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getWorkingCapitalQdata();
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
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0929");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getCashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getEquityQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0930");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getIntExpNonOpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getNonrecurringItemsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0931");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getAdjToIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getIncPrimaryEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getTanAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getStDebtQdata();
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
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0932");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getCashFromFinQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getGrossIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getIncTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getBvpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getWcfcfQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0933");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getNetIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getGrossOpIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getLiabEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getPrefStockQdata();
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
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0934");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getLtInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getInventoryQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getWcfcfQdata();
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
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0935");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getGrossIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getEpsDilContQdata();
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
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0936");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getIntExpNonOpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getCurrLiabQdata();
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
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0937");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getDivCostQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getLiabEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getTotalOpExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyAggregate3.getNetFixedAssetsQdata();
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
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0938");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getDivCostQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getPrefStockQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getRdQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0939");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getAdjToIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getIncPrimaryEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getEpsContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getOpMarginQdata();
        int int12 = companyAggregate3.getQuarter();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0940");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getBvpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getCashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getTanAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getWcfcfQdata();
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
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0941");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getNonrecurringItemsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getCashFromOpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getOtherIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getRdQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getNetFixedAssetsQdata();
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
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0942");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getEpsContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getTanAssetsQdata();
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
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0943");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getIntExpNonOpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getGrossIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getTotalAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyAggregate3.getRdQdata();
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
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0944");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getNetFixedAssetsQdata();
        int int9 = companyAggregate3.getQuarter();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getOtherIncQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0945");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getCashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getLtInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getNonrecurringItemsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getBvpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getAcctPayableQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
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
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getEquityQdata();
        int int9 = companyAggregate3.getYear();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getRoeQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getNetIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getCogsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getAcctPayableQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
        org.junit.Assert.assertNull(quarterlyDouble12);
        org.junit.Assert.assertNull(quarterlyDouble13);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0947");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getTotalOpExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getLiabEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getOtherIncQdata();
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
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0948");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getPrefStockQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getCapExQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getCashFromInvQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0949");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getIntExpNonOpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getPrefStockQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getNonrecurringItemsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getNonrecurringItemsQdata();
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
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0950");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getBvpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getCashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getLtInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getTotalLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getBvpsQdata();
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
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getNetcashflowQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0952");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getNetFixedAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getDivCostQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getGrossOpIncQdata();
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
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0953");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getDivCostQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getCapExQdata();
        boolean boolean11 = companyAggregate3.isValid();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getOpMarginQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(quarterlyDouble12);
        org.junit.Assert.assertNull(quarterlyDouble13);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0954");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getCashFromFinQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getDepreciationQdata();
        boolean boolean7 = companyAggregate3.isValid();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0955");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getBvpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getCashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getBvpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getFcfQdata();
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
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0956");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getNetFixedAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getLiabEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getCashQdata();
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
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getIntExpNonOpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getOtherIncQdata();
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
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getEquityQdata();
        int int9 = companyAggregate3.getYear();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getWorkingCapitalQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getDividendQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyAggregate3.getIncPrimaryEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = companyAggregate3.getNonrecurringItemsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
        org.junit.Assert.assertNull(quarterlyDouble12);
        org.junit.Assert.assertNull(quarterlyDouble13);
        org.junit.Assert.assertNull(quarterlyDouble14);
        org.junit.Assert.assertNull(quarterlyDouble15);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0959");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPeQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getCashFromFinQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0960");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getNonrecurringItemsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getCashFromOpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getAcctPayableQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getCurrAssetsQdata();
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
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0961");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getIntExpNonOpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getCashFromInvQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getRoeQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0962");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getAdjToIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getGrossOpIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getTotalOpExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getDividendQdata();
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
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0963");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (byte) 100, 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getTotalOpExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getCurrentRatioQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGrossOpIncQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0964");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getTotalOpExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getDividendQdata();
        int int9 = companyAggregate3.getYear();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getCashFromInvQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getInventoryQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getLiabEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getBvpsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
        org.junit.Assert.assertNull(quarterlyDouble12);
        org.junit.Assert.assertNull(quarterlyDouble13);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0965");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getWcfcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getOtherIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getIncPrimaryEpsQdata();
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
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0966");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getPrefStockQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getCurrentRatioQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0967");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPeQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0968");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getCashFromFinQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getInventoryQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getCashFromFinQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getGrossIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyAggregate3.getWorkingCapitalQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = companyAggregate3.getTotalAssetsQdata();
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
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0969");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getOtherLtAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getDepreciationQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0970");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getPrefStockQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getNetFixedAssetsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0971");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getOtherLtAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getTotalAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getLiabEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getOtherLtLiabQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0972");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getIntExpNonOpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getInventoryQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getBvpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getBvpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getCogsQdata();
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
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0973");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getNetFixedAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getInventoryQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getIntExpNonOpQdata();
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
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0974");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getNetIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getNetcashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getNetIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getEquityQdata();
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
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0975");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getDivCostQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getCapExQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getBvpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getGrossOpIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getIncTaxQdata();
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
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0976");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getDividendQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getCurrentRatioQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getNetFixedAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getAdjToIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getBvpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getPricesQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0977");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getWorkingCapitalQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getIncTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyAggregate3.getEpsContQdata();
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
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0978");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (byte) 100, (int) '#', filetypeEnum2);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0979");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getAdjToIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getWorkingCapitalQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getNetIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getLtDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getIntExpQdata();
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
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0980");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getEquityQdata();
        int int9 = companyAggregate3.getYear();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getWorkingCapitalQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getDividendQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyAggregate3.getBvpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = companyAggregate3.getAcctPayableQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = companyAggregate3.getCurrentRatioQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
        org.junit.Assert.assertNull(quarterlyDouble12);
        org.junit.Assert.assertNull(quarterlyDouble13);
        org.junit.Assert.assertNull(quarterlyDouble14);
        org.junit.Assert.assertNull(quarterlyDouble15);
        org.junit.Assert.assertNull(quarterlyDouble16);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0981");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getWcfcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getTotalLiabQdata();
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
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0982");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getOtherIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getCashFromOpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getTotalLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getDepreciationQdata();
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
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0983");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getNonrecurringItemsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0984");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getCashQdata();
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
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0985");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getOtherLtAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getNetIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getOtherCurrLiabQdata();
        int int9 = companyAggregate3.getYear();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getPreTaxIncQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0986");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getWcfcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getEpsContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getWorkingCapitalQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getCashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getTotalAssetsQdata();
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
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0987");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getNetIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getLtDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getRdQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getEpsContQdata();
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
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0988");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getLtDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getCurrLiabQdata();
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
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0989");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getIntExpNonOpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getPrefStockQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getCashFromInvQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getEpsContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getStDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getOtherCurrLiabQdata();
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
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetFixedAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getTanAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getTotalOpExpQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0991");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getAdjToIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getGrossOpIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getGrossOpIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getGrossOpIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getSalesQdata();
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
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0992");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getAdjToIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getWorkingCapitalQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getNetIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getDivCostQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getStInvestQdata();
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
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0993");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetFixedAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getCogsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getLtDebtQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0994");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getEquityQdata();
        int int9 = companyAggregate3.getYear();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getRoeQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getIntExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getNetFixedAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getStDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyAggregate3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = companyAggregate3.getOtherIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = companyAggregate3.getCogsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
        org.junit.Assert.assertNull(quarterlyDouble12);
        org.junit.Assert.assertNull(quarterlyDouble13);
        org.junit.Assert.assertNull(quarterlyDouble14);
        org.junit.Assert.assertNull(quarterlyDouble15);
        org.junit.Assert.assertNull(quarterlyDouble16);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0995");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getNonrecurringItemsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getRoeQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getLiabEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getIntExpQdata();
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
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getWcfcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getEpsContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getLtDebtQdata();
        int int11 = companyAggregate3.getYear();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getTotalOpExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getTotalAssetsQdata();
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
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0997");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getDividendQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getCashFromFinQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getBvpsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0998");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (byte) 0, (int) (byte) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getCurrentRatioQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getIncPrimaryEpsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test0999");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getPrefStockQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getEquityQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests1.test1000");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getDividendQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getCashFromFinQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getAdjToIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getCashflowQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }
}

