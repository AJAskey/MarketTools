package net.ajaskey.market.tools.SIP.BigDB.derived;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DerivedTests2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1001");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getEquityQdata();
        int int9 = companyAggregate3.getYear();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getNetFixedAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getPrefStockQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyAggregate3.getCashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = companyAggregate3.getLiabEquityQdata();
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
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1002");
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
        boolean boolean15 = companyAggregate3.isValid();
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1003");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getCashFromInvQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getGrossIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getSalesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getPeQdata();
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
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1004");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) '4', (int) (short) -1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getAcctPayableQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1005");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = companyAggregate3.getNetFixedAssetsQdata();
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
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1006");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getAcctRxQdata();
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
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1007");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getAdjToIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getCashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getRdQdata();
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
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1008");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyAggregate3.getTanAssetsQdata();
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
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1009");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getDividendQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getCurrentRatioQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getRoeQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getPreTaxIncQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1010");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getPreTaxIncQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(quarterlyDouble12);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1011");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyAggregate3.getOtherIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = companyAggregate3.getSalesQdata();
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
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1012");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getNetIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getCurrAssetsQdata();
        boolean boolean10 = companyAggregate3.isValid();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getNetMarginQdata();
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
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1013");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 100, (int) '#', fieldData2);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1014");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getOtherLtAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getTotalAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getCurrentRatioQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getDivCostQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getCashQdata();
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
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1015");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getOtherIncQdata();
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
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1016");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = companyAggregate3.getGrossOpIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = companyAggregate3.getUnusualIncQdata();
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
        org.junit.Assert.assertNull(quarterlyDouble20);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1017");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getNetIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getIncAfterTaxQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1018");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getTotalOpExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getDividendQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getEpsDilContQdata();
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
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1019");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = companyAggregate3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = companyAggregate3.getTotalOpExpQdata();
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
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1020");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getBvpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getCashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getInventoryQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1021");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb(10, (int) '#', filetypeEnum2);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1022");
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
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1023");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.write((int) (short) 100, (int) ' ');
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1024");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getIntExpNonOpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getPrefStockQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getCashFromInvQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getPreTaxIncQdata();
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
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1025");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = companyAggregate3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = companyAggregate3.getPrefStockQdata();
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
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1026");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getNetIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getCapExQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getTanAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getOtherLtLiabQdata();
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
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1027");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getIntTotQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getPreTaxIncQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1028");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getOpMarginQdata();
        boolean boolean8 = companyAggregate3.isValid();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1029");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate(1, (int) (short) 10, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        boolean boolean5 = companyAggregate3.isValid();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1030");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getDivCostQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getGoodwillQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1031");
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
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1032");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getDividendQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getCurrentRatioQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getNetFixedAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getLtDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getIntTotQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1033");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getPeQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getOtherCurrLiabQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1034");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getGrossIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyAggregate3.getBvpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = companyAggregate3.getLtDebtQdata();
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
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1035");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getTotalOpExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getDividendQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getCashflowQdata();
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
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1036");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getIntExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getAcctPayableQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getNetFixedAssetsQdata();
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
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1037");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getOtherLtAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPrefStockQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getRoeQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1038");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getEpsContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyAggregate3.getCashFromFinQdata();
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
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1039");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) ' ', (int) ' ', filetypeEnum2);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1040");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyAggregate3.getPricesQdata();
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
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1041");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = companyAggregate3.getNetFixedAssetsQdata();
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
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1042");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = companyAggregate3.getGrossOpIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = companyAggregate3.getTanAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = companyAggregate3.getNetFixedAssetsQdata();
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
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1043");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getIntExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getAcctPayableQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getIntExpNonOpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getAcctPayableQdata();
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
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1044");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getLtInvestQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1045");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getAdjToIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getGrossOpIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getCapExQdata();
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
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1046");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getPrefStockQdata();
        int int8 = companyAggregate3.getYear();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getSalesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getAdjToIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getCashFromOpsQdata();
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
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1047");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getAcctPayableQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getEpsQdata();
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
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1048");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getTotalOpExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getCashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getEquityQdata();
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
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1049");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getSalesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getIncTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getLiabEquityQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1050");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate(0, (int) ' ', fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getIncPrimaryEpsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1051");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getAdjToIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getIncPrimaryEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getLtDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getGrossIncQdata();
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
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1052");
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
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1053");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getNetIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyAggregate3.getWorkingCapitalQdata();
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
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1054");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getBvpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getCashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getLtInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getTotalLiabQdata();
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
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1055");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getCapExQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getGrossIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getIntTotQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getCapExQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getGrossIncQdata();
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
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1056");
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
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1057");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getNonrecurringItemsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getRoeQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getLiabEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getCurrLiabQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1058");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getOtherLtLiabQdata();
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
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1059");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb(0, 10, filetypeEnum2);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1060");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getCurrAssetsQdata();
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
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1061");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getGrossIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyAggregate3.getPricesQdata();
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
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1062");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((-1), 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getOtherLtLiabQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1063");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getLtInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getLtInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getNonrecurringItemsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getCurrentRatioQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getPeQdata();
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
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1064");
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
        boolean boolean15 = companyAggregate3.isValid();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = companyAggregate3.getOtherIncQdata();
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(quarterlyDouble16);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1065");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getAcctPayableQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getNetFixedAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getNetIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getSalesQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1066");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getIntExpNonOpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getOtherLtLiabQdata();
        int int10 = companyAggregate3.getYear();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getCashQdata();
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
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1067");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getOtherIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getEpsContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getTotalLiabQdata();
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
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1068");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getAdjToIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getLtInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getDivCostQdata();
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
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1069");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getIntExpNonOpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getAcctPayableQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getCurrLiabQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1070");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetFixedAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getLiabEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getCashFromFinQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1071");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getStInvestQdata();
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
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1072");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getEpsContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getCapExQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getWorkingCapitalQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1073");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getLtInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getEpsDilContQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1074");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getNetIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getNetcashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getLtInvestQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1075");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getCashFromInvQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getNetIncQdata();
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
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1076");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyAggregate3.getGoodwillQdata();
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
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1077");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getIntExpNonOpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getPrefStockQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getCashFromInvQdata();
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
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1078");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getBvpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getCashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getBvpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getIntExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getWorkingCapitalQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getNetFixedAssetsQdata();
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
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1079");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getNetIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getCurrLiabQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1080");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getIncAfterTaxQdata();
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
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1081");
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
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1082");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getCashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getPricesQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1083");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getTotalOpExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getDividendQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getDivCostQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getNonrecurringItemsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getIntTotQdata();
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
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1084");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getIntExpNonOpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getTotalLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyAggregate3.getDividendQdata();
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
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1085");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getIntTotQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getRoeQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getWcfcfQdata();
        java.lang.Class<?> wildcardClass11 = companyAggregate3.getClass();
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
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1086");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getLtInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getCapExQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getEpsDilContQdata();
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
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1087");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getNetIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getIntExpNonOpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyAggregate3.getBvpsQdata();
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
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1088");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getNonrecurringItemsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getCashFromOpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyAggregate3.getGrossIncQdata();
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
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1089");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyAggregate3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyAggregate3.getOtherLtAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyAggregate3.getTotalAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyAggregate3.getCurrentRatioQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyAggregate3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyAggregate3.getSalesQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1090");
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
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1091");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.write(10, (int) (byte) 100);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1092");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = companyAggregate3.getEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = companyAggregate3.getEpsContQdata();
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
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1093");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyAggregate3.getCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyAggregate3.getIntTotQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = companyAggregate3.getTotalOpExpQdata();
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
}

