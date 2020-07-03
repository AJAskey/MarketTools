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
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPeQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getCashFromFinQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getLtDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getSharesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getInventoryQdata();
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
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1002");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getIncPrimaryEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getEquityQdata();
        boolean boolean8 = companyDerived3.isValid();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1003");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getEpsContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getLtInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getCashFromOpsQdata();
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
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1004");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData2 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData(100, (int) '#');
        int int3 = companyDerivedData2.quarter;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList4 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.getAgList();
        companyDerivedData2.dList = companyDerivedList4;
        int int6 = companyDerivedData2.quarter;
        int int7 = companyDerivedData2.quarter;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList8 = companyDerivedData2.dList;
        companyDerivedData2.year = (byte) 1;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertNotNull(companyDerivedList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(companyDerivedList8);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1005");
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
        boolean boolean39 = indexDerived3.valid;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived43 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("hi!", (int) (byte) -1, (int) ' ');
        java.util.List<java.lang.String> strList44 = indexDerived43.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData47 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        companyDerivedData47.year = 1;
        int int50 = companyDerivedData47.year;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData53 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData56 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((int) (short) 0, 0);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData59 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData62 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        companyDerivedData62.year = 1;
        int int65 = companyDerivedData62.year;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList66 = companyDerivedData62.dList;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData69 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        companyDerivedData69.year = 1;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList72 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.getAgList();
        companyDerivedData69.dList = companyDerivedList72;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData[] companyDerivedDataArray74 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData[] { companyDerivedData47, companyDerivedData53, companyDerivedData56, companyDerivedData59, companyDerivedData62, companyDerivedData69 };
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData> companyDerivedDataList75 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData>) companyDerivedDataList75, companyDerivedDataArray74);
        indexDerived43.idList = companyDerivedDataList75;
        java.util.List<java.lang.String> strList78 = indexDerived43.indexList;
        java.util.List<java.lang.String> strList79 = indexDerived43.indexList;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData> companyDerivedDataList80 = indexDerived43.idList;
        indexDerived3.idList = companyDerivedDataList80;
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(strList44);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertNotNull(companyDerivedList66);
        org.junit.Assert.assertNotNull(companyDerivedList72);
        org.junit.Assert.assertNotNull(companyDerivedDataArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(strList78);
        org.junit.Assert.assertNotNull(strList79);
        org.junit.Assert.assertNotNull(companyDerivedDataList80);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1006");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getIncPrimaryEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getTotalOpExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getNonrecurringItemsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getSalesQdata();
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
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1007");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyDerived3.getEpsQdata();
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
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1008");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (byte) -1, fieldData2);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1009");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        int int5 = companyDerived3.getQuarter();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getTanAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getIncPrimaryEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getCapExQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1010");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getRdQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getIncPrimaryEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getCashFromFinQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getFcfQdata();
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
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1011");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) (byte) -1, (int) (short) 100, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getAcctRxQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1012");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getNonrecurringItemsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getEpsDilQdata();
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
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1013");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData2 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((int) (byte) 1, 10);
        companyDerivedData2.year = 0;
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1014");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getIncPrimaryEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getCashFromOpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getIncTaxQdata();
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
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1015");
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
        boolean boolean88 = indexDerived3.valid;
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
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1016");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getDivCostQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1017");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyDerived3.getLtInvestQdata();
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
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1018");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getIncPrimaryEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getCogsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getTotalLiabQdata();
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
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1019");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getCurrentRatioQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherLtAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getNonrecurringItemsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getCashFromInvQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getTotalOpExpQdata();
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
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1020");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getCogsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getNetcashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getEquityQdata();
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
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1021");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getTotalAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getOtherCurrAssetsQdata();
        int int10 = companyDerived3.getQuarter();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getCashFromOpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getFcfQdata();
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
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1022");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getTotalAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getIntTotQdata();
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
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1023");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getCashFromInvQdata();
        boolean boolean9 = companyDerived3.isValid();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getSharesQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1024");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getEpsContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getLtInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getCashFromOpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getCurrLiabQdata();
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
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1025");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getAcctPayableQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getLiabEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getStDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getCashFromOpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getCashFromFinQdata();
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
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1026");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getGrossOpIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getNetcashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getIntTotQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getIncPrimaryEpsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1027");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        boolean boolean4 = companyDerived3.isValid();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getNetcashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getTotalOpExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getTotalAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getIntTotQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getDivCostQdata();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1028");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyDerived3.getSalesQdata();
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
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1029");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData2 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        int int3 = companyDerivedData2.year;
        int int4 = companyDerivedData2.year;
        companyDerivedData2.year = (short) 1;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1030");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPeQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getLtDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getCashFromInvQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1031");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData2 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData(32, (int) (short) 0);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1032");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getTotalAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getOtherCurrAssetsQdata();
        int int10 = companyDerived3.getQuarter();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getCashFromOpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getDivCostQdata();
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
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1033");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        int int5 = companyDerived3.getQuarter();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getDividendQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getFcfQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1034");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData2 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData(0, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList3 = companyDerivedData2.dList;
        org.junit.Assert.assertNotNull(companyDerivedList3);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1035");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getAcctPayableQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getLiabEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getStDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getCashFromOpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getPeQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getWorkingCapitalQdata();
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
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1036");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getOtherLtLiabQdata();
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
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1037");
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
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1038");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived3.writeList("");
        java.util.List<java.lang.String> strList6 = indexDerived3.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived10 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived10.writeList("");
        java.util.List<java.lang.String> strList13 = indexDerived10.indexList;
        indexDerived3.indexList = strList13;
        boolean boolean15 = indexDerived3.valid;
        indexDerived3.listName = "hi!";
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1039");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        java.util.List<java.lang.String> strList4 = indexDerived3.indexList;
        indexDerived3.valid = true;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData> companyDerivedDataList7 = indexDerived3.idList;
        indexDerived3.writeList("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNull(companyDerivedDataList7);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1040");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getGrossOpIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getCashFromOpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getIntExpNonOpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getOtherCurrAssetsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1041");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData2 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        companyDerivedData2.year = 10;
        int int5 = companyDerivedData2.quarter;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1042");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) (short) 100, (int) (byte) 100, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashFromInvQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1043");
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
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1044");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("hi!", (int) (byte) -1, (int) ' ');
        java.util.List<java.lang.String> strList4 = indexDerived3.indexList;
        indexDerived3.valid = true;
        indexDerived3.valid = false;
        java.util.List<java.lang.String> strList9 = indexDerived3.indexList;
        indexDerived3.listName = "";
        indexDerived3.readList("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1045");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyDerived3.getIntExpQdata();
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
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1046");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData2 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        companyDerivedData2.year = 1;
        int int5 = companyDerivedData2.year;
        companyDerivedData2.quarter = (short) 1;
        int int8 = companyDerivedData2.year;
        int int9 = companyDerivedData2.year;
        companyDerivedData2.quarter = (short) 1;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1047");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getInventoryQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getTotalAssetsQdata();
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
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1048");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getCashQdata();
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
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1049");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getCashFromOpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getAdjToIncQdata();
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
        boolean boolean40 = indexDerived3.isInList("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(companyDerivedList26);
        org.junit.Assert.assertNotNull(companyDerivedList32);
        org.junit.Assert.assertNotNull(companyDerivedDataArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(strList38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1051");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        int int5 = companyDerived3.getQuarter();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getCogsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getPrefStockQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getGrossOpIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getOpMarginQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1052");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = companyDerived3.getIntExpNonOpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = companyDerived3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = companyDerived3.getIncTaxQdata();
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
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1053");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getPeQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getTanAssetsQdata();
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
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1054");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getStDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyDerived3.getEpsQdata();
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
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1055");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = companyDerived3.getDividendQdata();
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
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1056");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        java.util.List<java.lang.String> strList4 = indexDerived3.indexList;
        indexDerived3.valid = true;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData> companyDerivedDataList7 = indexDerived3.idList;
        java.util.List<java.lang.String> strList8 = indexDerived3.indexList;
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNull(companyDerivedDataList7);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1057");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData2 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData(0, (int) (byte) 1);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1058");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getNonrecurringItemsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getGrossOpIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getSalesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getTotalLiabQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1059");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData2 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((-1), (int) (short) -1);
        companyDerivedData2.year = 1;
        companyDerivedData2.quarter = '4';
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1060");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getAcctPayableQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getBvpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getRoeQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getStInvestQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1061");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) (byte) 0, 10, fieldData2);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1062");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPeQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getLtDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getUnusualIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getLiabEquityQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1063");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData2 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((int) '#', 100);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1064");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        boolean boolean4 = companyDerived3.isValid();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getCashFromFinQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getPrefStockQdata();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1065");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getTotalAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getEpsDilQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getIncPrimaryEpsQdata();
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
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1066");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getEpsContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getCashFromOpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getLtInvestQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1067");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getEpsDilContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getStDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getGrossIncQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1068");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getGoodwillQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getEpsContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getGrossIncQdata();
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
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1069");
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
        int int12 = companyDerived3.getYear();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
        org.junit.Assert.assertNull(quarterlyDouble11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1070");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getAdjToIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getCashFromInvQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getInventoryQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1071");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOpMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getIncPrimaryEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getCogsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getDivCostQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getTotalOpExpQdata();
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
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1073");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherLtAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getWcfcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getStInvestQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1074");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getWorkingCapitalQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getEpsDilContQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1075");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getIncPrimaryEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getInventoryQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getWorkingCapitalQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1076");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getNetMarginQdata();
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
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1077");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived4 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("hi!", 1, (int) (byte) 0);
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived8 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived8.writeList("");
        java.util.List<java.lang.String> strList11 = indexDerived8.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived15 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived15.writeList("");
        java.util.List<java.lang.String> strList18 = indexDerived15.indexList;
        indexDerived8.indexList = strList18;
        indexDerived8.readList("");
        java.util.List<java.lang.String> strList22 = indexDerived8.indexList;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray25 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList26 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList26, fieldDataArray25);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList28 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList22, (int) 'a', (int) (byte) 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList26);
        indexDerived4.indexList = strList22;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived32 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", strList22, (int) '#', (int) (byte) 1);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(fieldDataArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(companyDerivedList28);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1078");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData2 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData(35, (int) '4');
        int int3 = companyDerivedData2.year;
        int int4 = companyDerivedData2.quarter;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1079");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getCurrentRatioQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getLtDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getCurrentRatioQdata();
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
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1080");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", (int) '#', 1);
        indexDerived3.valid = true;
        indexDerived3.writeList("hi!");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived11 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("hi!", (int) (byte) -1, (int) ' ');
        java.util.List<java.lang.String> strList12 = indexDerived11.indexList;
        indexDerived11.valid = true;
        indexDerived11.valid = false;
        indexDerived11.writeList("");
        java.util.List<java.lang.String> strList19 = indexDerived11.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived23 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 100, (int) (byte) -1);
        java.util.List<java.lang.String> strList24 = indexDerived23.indexList;
        indexDerived11.addToList(strList24);
        indexDerived3.indexList = strList24;
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(strList24);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1081");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) (short) -1, 0, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherLtAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getLtDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getNetMarginQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1082");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getAdjToIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getEpsDilQdata();
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyDerived3.getDividendQdata();
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
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1084");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData2 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((int) (short) 0, 0);
        companyDerivedData2.quarter = (byte) 100;
        companyDerivedData2.year = 10;
        int int7 = companyDerivedData2.year;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData10 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData(100, (int) '#');
        int int11 = companyDerivedData10.quarter;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList12 = companyDerivedData10.dList;
        companyDerivedData2.dList = companyDerivedList12;
        companyDerivedData2.year = (byte) 0;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertNotNull(companyDerivedList12);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1085");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyDerived3.getRdQdata();
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
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1086");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getCogsQdata();
        boolean boolean8 = companyDerived3.isValid();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getEpsDilQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1087");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = companyDerived3.getCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = companyDerived3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = companyDerived3.getLtInvestQdata();
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
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1088");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.write(10, 32);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1089");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getLiabEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getTotalOpExpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getWcfcfQdata();
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
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1090");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherLtLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getIncPrimaryEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getInventoryQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getIncPrimaryEpsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1091");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyDerived3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = companyDerived3.getGrossIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = companyDerived3.getStDebtQdata();
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
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1092");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData2 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData(0, (int) (byte) 0);
        int int3 = companyDerivedData2.year;
        java.util.List<java.lang.String> strList4 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived10 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived10.writeList("");
        java.util.List<java.lang.String> strList13 = indexDerived10.indexList;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray16 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList17, fieldDataArray16);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList19 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList13, 10, (int) (short) 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList17);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList20 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList4, (int) (short) 1, 0, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList17);
        companyDerivedData2.dList = companyDerivedList20;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList22 = companyDerivedData2.dList;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(fieldDataArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(companyDerivedList19);
        org.junit.Assert.assertNotNull(companyDerivedList20);
        org.junit.Assert.assertNotNull(companyDerivedList22);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1093");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData companyDerivedData2 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerivedData((int) (byte) 10, (int) (byte) 1);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1094");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        int int5 = companyDerived3.getYear();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getRoeQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getNetIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getCashFromInvQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getCashFromFinQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getPrefStockQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
        org.junit.Assert.assertNull(quarterlyDouble10);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1095");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyDerived3.getStInvestQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyDerived3.getIntExpQdata();
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
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1096");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getEquityQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getPricesQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getEpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getTanAssetsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1097");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) (byte) 0, (int) ' ', fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getBvpsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getLtInvestQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1098");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = companyDerived3.getTotalLiabQdata();
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
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1099");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getNetMarginQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getEpsContQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getStDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getGrossOpIncQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertNull(quarterlyDouble9);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1100");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getAcctRxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getTotalAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getOtherCurrAssetsQdata();
        boolean boolean9 = companyDerived3.isValid();
        int int10 = companyDerived3.getQuarter();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getCashFromOpsQdata();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(quarterlyDouble11);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1101");
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived3.writeList("");
        java.util.List<java.lang.String> strList6 = indexDerived3.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived10 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived10.writeList("");
        java.util.List<java.lang.String> strList13 = indexDerived10.indexList;
        indexDerived3.indexList = strList13;
        indexDerived3.readList("");
        java.util.List<java.lang.String> strList17 = indexDerived3.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived23 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        java.util.List<java.lang.String> strList24 = indexDerived23.indexList;
        indexDerived23.listName = "";
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived30 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived30.writeList("");
        java.util.List<java.lang.String> strList33 = indexDerived30.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived37 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived37.writeList("");
        java.util.List<java.lang.String> strList40 = indexDerived37.indexList;
        indexDerived30.indexList = strList40;
        indexDerived23.addToList(strList40);
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived46 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived46.writeList("");
        java.util.List<java.lang.String> strList49 = indexDerived46.indexList;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived53 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived53.writeList("");
        java.util.List<java.lang.String> strList56 = indexDerived53.indexList;
        indexDerived46.indexList = strList56;
        indexDerived23.addToList(strList56);
        java.util.List<java.lang.String> strList61 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived indexDerived67 = new net.ajaskey.market.tools.SIP.BigDB.derived.IndexDerived("", 10, 0);
        indexDerived67.writeList("");
        java.util.List<java.lang.String> strList70 = indexDerived67.indexList;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray73 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList74 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList74, fieldDataArray73);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList76 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList70, 10, (int) (short) 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList74);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList77 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList61, (int) (short) 1, 0, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList74);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList78 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList56, (int) (short) 1, (int) (byte) -1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList74);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived> companyDerivedList79 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived.processList(strList17, 100, 10, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList74);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertNotNull(strList40);
        org.junit.Assert.assertNotNull(strList49);
        org.junit.Assert.assertNotNull(strList56);
        org.junit.Assert.assertNotNull(strList70);
        org.junit.Assert.assertNotNull(fieldDataArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(companyDerivedList76);
        org.junit.Assert.assertNotNull(companyDerivedList77);
        org.junit.Assert.assertNotNull(companyDerivedList78);
        org.junit.Assert.assertNotNull(companyDerivedList79);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1102");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getIncAfterTaxQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getCurrentRatioQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherLtAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getDivCostQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getPreTaxIncQdata();
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
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1103");
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
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1104");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getCashQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getGrossOpIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getNetcashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getFcfQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getDivCostQdata();
        boolean boolean9 = companyDerived3.isValid();
        org.junit.Assert.assertNull(quarterlyDouble4);
        org.junit.Assert.assertNull(quarterlyDouble5);
        org.junit.Assert.assertNull(quarterlyDouble6);
        org.junit.Assert.assertNull(quarterlyDouble7);
        org.junit.Assert.assertNull(quarterlyDouble8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1105");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived companyDerived3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyDerived((int) '#', (int) (short) 1, fieldData2);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = companyDerived3.getOtherCurrAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = companyDerived3.getPreTaxIncQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = companyDerived3.getDepreciationQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = companyDerived3.getOtherCurrLiabQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = companyDerived3.getIntExpNonOpQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = companyDerived3.getStDebtQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = companyDerived3.getNetFixedAssetsQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = companyDerived3.getOtherCurrLiabQdata();
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
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1106");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = companyDerived3.getCashFromInvQdata();
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
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests2.test1107");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = companyDerived3.getCashflowQdata();
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = companyDerived3.getEpsDilQdata();
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
}

