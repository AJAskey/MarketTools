package net.ajaskey.market.tools.SIP.BigDB.dataio;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DataIoTests0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0001");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.find("");
        org.junit.Assert.assertNull(companyFileData1);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0002");
        int int0 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.getListCount();
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0003");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData5 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0004");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.find("hi!");
        org.junit.Assert.assertNull(incSheetFileData1);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0005");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData> companyFileDataList0 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.getCfdList();
        org.junit.Assert.assertNotNull(companyFileDataList0);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0006");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData11 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(strArray6, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0007");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData> companyFileDataList0 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.getList();
        org.junit.Assert.assertNotNull(companyFileDataList0);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0008");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean3 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.parseSipData((int) (short) 1, (int) (short) 10, filetypeEnum2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0009");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.clearList();
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0010");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getQFromMemory((int) (byte) 100, (int) (short) -1);
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0011");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
        java.lang.String str1 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getExchangeStr(exchEnum0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "NONE" + "'", str1, "NONE");
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0012");
        int int0 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.getListCount();
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0013");
        java.lang.String str0 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.listToString();
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "" + "'", str0, "");
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0014");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData> cashFileDataList0 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.getCashfdList();
        org.junit.Assert.assertNotNull(cashFileDataList0);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0015");
        java.lang.String[] strArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(strArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0016");
        java.lang.Throwable throwable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getError(throwable0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0017");
        java.lang.String str0 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.outbasedir;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "out/BigDB/" + "'", str0, "out/BigDB/");
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0018");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getStInvestYr();
        double[] doubleArray3 = balSheetFileData0.getTotalAssetsQtr();
        double[] doubleArray4 = balSheetFileData0.getOtherLtLiabQtr();
        double[] doubleArray5 = balSheetFileData0.getTotalAssetsYr();
        java.lang.Class<?> wildcardClass6 = balSheetFileData0.getClass();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0019");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readSipData("NONE");
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0020");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readSipData("null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000");
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0021");
        int int0 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.getListCount();
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0022");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.find("");
        org.junit.Assert.assertNull(balSheetFileData1);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0023");
        java.lang.String str4 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getOutfileName((int) (byte) 100, (int) ' ', "hi!", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "out/BigDB/100/Q32/hi!-fundamental-data-100Q32." + "'", str4, "out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0024");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.find("null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000");
        org.junit.Assert.assertNull(cashFileData1);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0025");
        java.lang.Throwable throwable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getWarning(throwable0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0026");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.clearList();
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0027");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        java.lang.String str10 = sharesFileData1.getTicker();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = sharesFileData1.toDbOutput();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0028");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.clearList();
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0029");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getCurrLiabYr();
        double[] doubleArray3 = balSheetFileData0.getCashYr();
        double[] doubleArray4 = balSheetFileData0.getOtherLtLiabQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0030");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.clearList();
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0031");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getUnusualIncQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = null;
        // The following exception was thrown during execution in test generation
        try {
            incSheetFileData5.setNameFields(companyFileData8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0032");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getQFromMemory((int) ' ', (int) '4');
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0033");
        java.util.List<java.lang.String> strList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb(strList0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0034");
        java.lang.String str0 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.inbasedir;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "data/BigDB/" + "'", str0, "data/BigDB/");
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0035");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.find("null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000");
        org.junit.Assert.assertNull(companyFileData1);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0036");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setDollar3m("null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = sharesFileData1.toDbOutput();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0037");
        int int0 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.getListCount();
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0038");
        java.lang.String[] strArray5 = new java.lang.String[] { "NONE", "null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000", "NONE", "hi!", "" };
        java.lang.String[] strArray8 = new java.lang.String[] { "data/BigDB/", "out/BigDB/" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData9 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(strArray5, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0039");
        int int0 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.getListCount();
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0040");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.find("hi!");
        org.junit.Assert.assertNull(estimateFileData1);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0041");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getFromDb("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.", (int) (byte) 10, (int) (short) 1, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0042");
        java.lang.String[] strArray6 = new java.lang.String[] { "NONE", "data/BigDB/", "out/BigDB/", "out/BigDB/", "out/BigDB/100/Q32/hi!-fundamental-data-100Q32.", "" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0043");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getPrefStockQtr();
        double[] doubleArray3 = balSheetFileData0.getLtDebtQtr();
        double[] doubleArray4 = balSheetFileData0.getEquityQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0044");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        sharesFileData1.setDollar3m("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        sharesFileData1.setInstSellShrs("null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000");
        int int14 = sharesFileData1.getInsiderSellShrs();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0045");
        java.lang.String str0 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.listToString();
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "" + "'", str0, "");
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0046");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.find("null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000");
        org.junit.Assert.assertNull(incSheetFileData1);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0047");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getStInvestYr();
        double[] doubleArray3 = balSheetFileData0.getTotalAssetsQtr();
        double[] doubleArray4 = balSheetFileData0.getOtherLtLiabQtr();
        double[] doubleArray5 = balSheetFileData0.getTotalAssetsYr();
        double[] doubleArray6 = balSheetFileData0.getOtherLtLiabQtr();
        double[] doubleArray7 = balSheetFileData0.getGoodwillYr();
        double[] doubleArray8 = balSheetFileData0.getStDebtQtr();
        java.lang.String str9 = balSheetFileData0.getSector();
        double[] doubleArray10 = balSheetFileData0.getGoodwillQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0048");
        java.lang.String[] strArray6 = new java.lang.String[] { "NONE", "hi!", "hi!", "NONE", "NONE", "out/BigDB/" };
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "out/BigDB/100/Q32/hi!-fundamental-data-100Q32.", "null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData13 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(strArray6, strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0049");
        int int0 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.getADR();
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0050");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        sharesFileData1.setDollar3m("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        double double12 = sharesFileData1.getFloatshr();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0051");
        java.lang.String[] strArray1 = new java.lang.String[] { "out/BigDB/100/Q32/hi!-fundamental-data-100Q32." };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0052");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getLtInvestYr();
        double[] doubleArray3 = balSheetFileData0.getStDebtYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0053");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getQFromMemory((int) '#', 100);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter5 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter((int) 'a', (int) (byte) 1, fieldDataList4);
        int int6 = fieldDataQuarter5.getQuarter();
        org.junit.Assert.assertNotNull(fieldDataList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0054");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getQFromMemory((int) '#', 100);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter5 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter((int) 'a', (int) (byte) 1, fieldDataList4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = fieldDataQuarter5.fieldDataList;
        java.lang.Class<?> wildcardClass7 = fieldDataQuarter5.getClass();
        org.junit.Assert.assertNotNull(fieldDataList4);
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0055");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        companyFileData7.setSnpIndex("NONE");
        java.lang.String str10 = companyFileData7.toString();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0056");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        sharesFileData1.setVolume10d("null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData12 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData13 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData12);
        sharesFileData13.setInstOwnership("NONE");
        double[] doubleArray20 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData13.setSharesY(doubleArray20);
        sharesFileData1.setSharesY(doubleArray20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = sharesFileData1.toDbOutput();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[1.0, -1.0, 10.0, 10.0]");
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0057");
        java.lang.String str0 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.listToString();
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "" + "'", str0, "");
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0058");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "out/BigDB/100/Q32/hi!-fundamental-data-100Q32.", "out/BigDB/", "data/BigDB/", "NONE" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0059");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean3 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.parseSipData((int) 'a', (int) (byte) 1, filetypeEnum2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0060");
        java.lang.String str0 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.listToString();
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "" + "'", str0, "");
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0061");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getPrefStockQtr();
        double[] doubleArray3 = balSheetFileData0.getTotalAssetsYr();
        double[] doubleArray4 = balSheetFileData0.getGoodwillYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0062");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        java.lang.String str8 = companyFileData7.getDowIndexStr();
        companyFileData7.setZip("data/BigDB/");
        java.lang.String str11 = companyFileData7.getZip();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "data/BigDB/" + "'", str11, "data/BigDB/");
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0063");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getCurrLiabYr();
        double[] doubleArray3 = balSheetFileData0.getGoodwillQtr();
        double[] doubleArray4 = balSheetFileData0.getAcctPayableQtr();
        double[] doubleArray5 = balSheetFileData0.getAcctPayableQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0064");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        int int10 = sharesFileData1.getInsiderSells();
        sharesFileData1.setInsiderSells("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        java.lang.String[] strArray15 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData18 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList16);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData19 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList16);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList16);
        companyFileData20.setState("out/BigDB/");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData23 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double24 = estimateFileData23.getEpsQ1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData25 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData26 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData25);
        sharesFileData26.setInstOwnership("NONE");
        double[] doubleArray33 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData26.setSharesY(doubleArray33);
        java.lang.String str35 = sharesFileData26.getTicker();
        sharesFileData26.setFloatshr("NONE");
        sharesFileData26.setVolume3m("hi!");
        java.lang.String[] strArray42 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData45 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList43);
        double[] doubleArray46 = incSheetFileData45.getNonrecurringItemsQtr();
        double[] doubleArray47 = incSheetFileData45.getDividendYr();
        double[] doubleArray48 = incSheetFileData45.getEpsContQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData49 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray50 = balSheetFileData49.getOtherLtLiabYr();
        double[] doubleArray51 = balSheetFileData49.getCurrLiabYr();
        double[] doubleArray52 = balSheetFileData49.getAcctPayableQtr();
        double[] doubleArray53 = balSheetFileData49.getAcctPayableQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData54 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData55 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData54);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData58 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData20, estimateFileData23, sharesFileData26, incSheetFileData45, balSheetFileData49, cashFileData54, 100, (int) 'a');
        sharesFileData1.setNameFields(companyFileData20);
        companyFileData20.setExchange("NONE");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(incSheetFileData18);
        org.junit.Assert.assertNotNull(estimateFileData19);
        org.junit.Assert.assertNotNull(companyFileData20);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(incSheetFileData45);
        org.junit.Assert.assertNull(doubleArray46);
        org.junit.Assert.assertNull(doubleArray47);
        org.junit.Assert.assertNull(doubleArray48);
        org.junit.Assert.assertNull(doubleArray50);
        org.junit.Assert.assertNull(doubleArray51);
        org.junit.Assert.assertNull(doubleArray52);
        org.junit.Assert.assertNull(doubleArray53);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0065");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getCurrLiabYr();
        double[] doubleArray3 = balSheetFileData0.getInventoryQtr();
        double[] doubleArray4 = balSheetFileData0.getCashQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0066");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getStDebtQtr();
        double[] doubleArray2 = balSheetFileData0.getAcctRxQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0067");
        java.lang.String str0 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.listToString();
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "" + "'", str0, "");
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0068");
        java.lang.String str4 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getOutfileName((int) (byte) -1, 1, "null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000", "out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32." + "'", str4, "out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0069");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum1 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.convertExchange("data/BigDB/");
        org.junit.Assert.assertTrue("'" + exchEnum1 + "' != '" + net.ajaskey.market.tools.SIP.BigDB.ExchEnum.NONE + "'", exchEnum1.equals(net.ajaskey.market.tools.SIP.BigDB.ExchEnum.NONE));
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0070");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readSipData("data/BigDB/");
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0071");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getUnusualIncQtr();
        java.lang.String str8 = incSheetFileData5.getTicker();
        double[] doubleArray9 = incSheetFileData5.getEpsDilYr();
        double[] doubleArray10 = incSheetFileData5.getNetIncQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0072");
        int int0 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.getListCount();
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0073");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getFromMemory("", (int) (short) 0, (int) ' ');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0074");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getUnusualIncQtr();
        java.lang.String str8 = incSheetFileData5.getTicker();
        double[] doubleArray9 = incSheetFileData5.getIntExpNonOpYr();
        double[] doubleArray10 = incSheetFileData5.getGrossOpIncYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0075");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsYr();
        double[] doubleArray7 = incSheetFileData5.getDepreciationQtr();
        java.lang.String str8 = incSheetFileData5.getName();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0076");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getGrossOpIncQtr();
        double[] doubleArray8 = incSheetFileData5.getDepreciationYr();
        double[] doubleArray9 = incSheetFileData5.getDepreciationQtr();
        double[] doubleArray10 = incSheetFileData5.getTotalOpExpYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0077");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double1 = estimateFileData0.getEpsQ1();
        java.lang.String str2 = estimateFileData0.getIndustry();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0078");
        java.lang.String[] strArray1 = new java.lang.String[] { "out/BigDB/" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0079");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        companyFileData7.setName("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        companyFileData7.setSic("out/BigDB/");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0080");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        int int8 = companyFileData7.getNumEmployees();
        companyFileData7.setStreet("");
        java.lang.String str11 = companyFileData7.getCountry();
        companyFileData7.setTicker("");
        java.lang.String str14 = companyFileData7.getZip();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0081");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getFromMemory("null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000", 100, 10);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0082");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getLtInvestYr();
        java.lang.String str3 = balSheetFileData0.getSector();
        double[] doubleArray4 = balSheetFileData0.getAcctRxYr();
        double[] doubleArray5 = balSheetFileData0.getTotalLiabYr();
        double[] doubleArray6 = balSheetFileData0.getCurrAssetsQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0083");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        java.lang.String str1 = sharesFileData0.getName();
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0084");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        int int8 = companyFileData7.getNumEmployees();
        companyFileData7.setCountry("hi!");
        int int11 = companyFileData7.getNumEmployees();
        java.lang.String[] strArray14 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData17 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData18 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList15);
        java.util.List<java.lang.String> strList19 = companyFileData7.set((java.util.List<java.lang.String>) strList15);
        companyFileData7.setStreet("out/BigDB/");
        java.lang.String str22 = companyFileData7.getSector();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(incSheetFileData17);
        org.junit.Assert.assertNotNull(estimateFileData18);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0085");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) '4', (int) 'a');
        java.lang.String str3 = fieldData2.getIndustry();
        java.lang.String str4 = fieldData2.getName();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData5 = fieldData2.getBalSheetData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData6 = fieldData2.getIncSheetData();
        java.lang.String str7 = fieldData2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(balSheetFileData5);
        org.junit.Assert.assertNotNull(incSheetFileData6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "52 Q97\r\n  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n" + "'", str7, "52 Q97\r\n  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0086");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getLtInvestYr();
        java.lang.String str3 = balSheetFileData0.getSector();
        double[] doubleArray4 = balSheetFileData0.getTotalLiabQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0087");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getFromDb("52 Q97\r\n  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n", (int) (byte) -1, (int) (short) 0, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0088");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear((int) (short) 1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter3 = fieldDataYear1.getQ(10);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter4 = fieldDataYear1.getQ2();
        org.junit.Assert.assertNull(fieldDataQuarter3);
        org.junit.Assert.assertNull(fieldDataQuarter4);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0089");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getUnusualIncQtr();
        java.lang.String str8 = incSheetFileData5.getTicker();
        double[] doubleArray9 = incSheetFileData5.getNonrecurringItemsYr();
        double[] doubleArray10 = incSheetFileData5.getPreTaxIncQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0090");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        int int8 = companyFileData7.getNumEmployees();
        companyFileData7.setCountry("hi!");
        int int11 = companyFileData7.getNumEmployees();
        java.lang.String[] strArray14 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData17 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData18 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList15);
        java.util.List<java.lang.String> strList19 = companyFileData7.set((java.util.List<java.lang.String>) strList15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb(strList19);
        sharesFileData20.setInsiderBuys("null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(incSheetFileData17);
        org.junit.Assert.assertNotNull(estimateFileData18);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(sharesFileData20);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0091");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readSipData("", "hi!");
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0092");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getDividendYr();
        double[] doubleArray8 = incSheetFileData5.getUnusualIncQtr();
        double[] doubleArray9 = incSheetFileData5.getDividendQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0093");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        int int8 = companyFileData7.getNumEmployees();
        companyFileData7.setCountry("hi!");
        int int11 = companyFileData7.getNumEmployees();
        java.lang.String[] strArray14 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData17 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData18 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList15);
        java.util.List<java.lang.String> strList19 = companyFileData7.set((java.util.List<java.lang.String>) strList15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb(strList19);
        net.ajaskey.common.DateTime dateTime21 = estimateFileData20.getLatestQtrEps();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(incSheetFileData17);
        org.junit.Assert.assertNotNull(estimateFileData18);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(estimateFileData20);
        org.junit.Assert.assertNull(dateTime21);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0094");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        java.lang.String str8 = companyFileData7.getDowIndexStr();
        java.lang.String str9 = companyFileData7.getCity();
        java.lang.String str10 = companyFileData7.getCity();
        double[] doubleArray11 = companyFileData7.getPriceQtr();
        java.lang.String str12 = companyFileData7.toString();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0095");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readSipData("hi!");
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0096");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        int int4 = sharesFileData1.getInsiderBuys();
        sharesFileData1.setInsiderNetPercentOutstanding("out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0097");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear((int) (short) 1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter3 = fieldDataYear1.getQ(10);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter4 = fieldDataYear1.getQ4();
        org.junit.Assert.assertNull(fieldDataQuarter3);
        org.junit.Assert.assertNull(fieldDataQuarter4);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0098");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInsiderBuyShrs();
        sharesFileData0.setDollar3m("data/BigDB/");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0099");
        java.lang.String[] strArray5 = new java.lang.String[] { "Cash File Data", "data/BigDB/", "", "null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000", "Cash File Data" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0100");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double1 = estimateFileData0.getEpsQ1();
        java.lang.String str2 = estimateFileData0.getSector();
        double double3 = estimateFileData0.getEpsQ0();
        net.ajaskey.common.DateTime dateTime4 = estimateFileData0.getCurrFiscalYear();
        net.ajaskey.common.DateTime dateTime5 = estimateFileData0.getLatestQtrEps();
        double double6 = estimateFileData0.getEpsY0();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(dateTime4);
        org.junit.Assert.assertNull(dateTime5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0101");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getFromMemory("null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000", (int) 'a', (int) (byte) 1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0102");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str1 = estimateFileData0.toString();
        double double2 = estimateFileData0.getEpsQ1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000" + "'", str1, "null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0103");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.setMemory((int) (byte) 100, (int) ' ', filetypeEnum2);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0104");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsYr();
        double[] doubleArray7 = incSheetFileData5.getSalesYr();
        double[] doubleArray8 = incSheetFileData5.getEpsContQtr();
        double[] doubleArray9 = incSheetFileData5.getEpsDilContYr();
        double[] doubleArray10 = incSheetFileData5.getEpsDilContQtr();
        double[] doubleArray11 = incSheetFileData5.getGrossOpIncYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0105");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData0);
        java.lang.String str2 = cashFileData1.getTicker();
        double[] doubleArray3 = cashFileData1.getCashFromFinQtr();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(doubleArray3);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0106");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getGrossIncQtr();
        double[] doubleArray8 = incSheetFileData5.getEpsQtr();
        double[] doubleArray9 = incSheetFileData5.getGrossIncQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0107");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        int int10 = sharesFileData1.getInsiderSells();
        sharesFileData1.setInsiderSells("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        java.lang.String[] strArray15 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData18 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList16);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData19 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList16);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList16);
        companyFileData20.setState("out/BigDB/");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData23 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double24 = estimateFileData23.getEpsQ1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData25 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData26 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData25);
        sharesFileData26.setInstOwnership("NONE");
        double[] doubleArray33 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData26.setSharesY(doubleArray33);
        java.lang.String str35 = sharesFileData26.getTicker();
        sharesFileData26.setFloatshr("NONE");
        sharesFileData26.setVolume3m("hi!");
        java.lang.String[] strArray42 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData45 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList43);
        double[] doubleArray46 = incSheetFileData45.getNonrecurringItemsQtr();
        double[] doubleArray47 = incSheetFileData45.getDividendYr();
        double[] doubleArray48 = incSheetFileData45.getEpsContQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData49 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray50 = balSheetFileData49.getOtherLtLiabYr();
        double[] doubleArray51 = balSheetFileData49.getCurrLiabYr();
        double[] doubleArray52 = balSheetFileData49.getAcctPayableQtr();
        double[] doubleArray53 = balSheetFileData49.getAcctPayableQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData54 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData55 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData54);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData58 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData20, estimateFileData23, sharesFileData26, incSheetFileData45, balSheetFileData49, cashFileData54, 100, (int) 'a');
        sharesFileData1.setNameFields(companyFileData20);
        java.lang.String str60 = companyFileData20.toDbOuput();
        java.lang.String str61 = companyFileData20.toDbOuput();
        companyFileData20.setDowIndex("Data for  from 52 Q97\r\n  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(incSheetFileData18);
        org.junit.Assert.assertNotNull(estimateFileData19);
        org.junit.Assert.assertNotNull(companyFileData20);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(incSheetFileData45);
        org.junit.Assert.assertNull(doubleArray46);
        org.junit.Assert.assertNull(doubleArray47);
        org.junit.Assert.assertNull(doubleArray48);
        org.junit.Assert.assertNull(doubleArray50);
        org.junit.Assert.assertNull(doubleArray51);
        org.junit.Assert.assertNull(doubleArray52);
        org.junit.Assert.assertNull(doubleArray53);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0108");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        companyFileData7.setState("out/BigDB/");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData10 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double11 = estimateFileData10.getEpsQ1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData12 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData13 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData12);
        sharesFileData13.setInstOwnership("NONE");
        double[] doubleArray20 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData13.setSharesY(doubleArray20);
        java.lang.String str22 = sharesFileData13.getTicker();
        sharesFileData13.setFloatshr("NONE");
        sharesFileData13.setVolume3m("hi!");
        java.lang.String[] strArray29 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData32 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList30);
        double[] doubleArray33 = incSheetFileData32.getNonrecurringItemsQtr();
        double[] doubleArray34 = incSheetFileData32.getDividendYr();
        double[] doubleArray35 = incSheetFileData32.getEpsContQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData36 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray37 = balSheetFileData36.getOtherLtLiabYr();
        double[] doubleArray38 = balSheetFileData36.getCurrLiabYr();
        double[] doubleArray39 = balSheetFileData36.getAcctPayableQtr();
        double[] doubleArray40 = balSheetFileData36.getAcctPayableQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData41 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData42 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData41);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData45 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData7, estimateFileData10, sharesFileData13, incSheetFileData32, balSheetFileData36, cashFileData41, 100, (int) 'a');
        net.ajaskey.common.DateTime dateTime46 = estimateFileData10.getLatestQtrEps();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum47 = estimateFileData10.getExchange();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum48 = estimateFileData10.getExchange();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(incSheetFileData32);
        org.junit.Assert.assertNull(doubleArray33);
        org.junit.Assert.assertNull(doubleArray34);
        org.junit.Assert.assertNull(doubleArray35);
        org.junit.Assert.assertNull(doubleArray37);
        org.junit.Assert.assertNull(doubleArray38);
        org.junit.Assert.assertNull(doubleArray39);
        org.junit.Assert.assertNull(doubleArray40);
        org.junit.Assert.assertNull(dateTime46);
        org.junit.Assert.assertNull(exchEnum47);
        org.junit.Assert.assertNull(exchEnum48);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0109");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) '4', (int) 'a');
        java.lang.String str3 = fieldData2.getTicker();
        int int4 = fieldData2.getYear();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0110");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData0);
        java.lang.String str2 = cashFileData1.getTicker();
        java.lang.String str3 = cashFileData1.getTicker();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData1);
        double[] doubleArray5 = cashFileData4.getCashFromFinQtr();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0111");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsYr();
        double[] doubleArray7 = incSheetFileData5.getDepreciationQtr();
        double[] doubleArray8 = incSheetFileData5.getRdQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0112");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getRdYr();
        double[] doubleArray8 = incSheetFileData5.getUnusualIncQtr();
        double[] doubleArray9 = incSheetFileData5.getPreTaxIncYr();
        double[] doubleArray10 = incSheetFileData5.getOtherIncYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0113");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.find("52 Q97\r\n  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        org.junit.Assert.assertNull(companyFileData1);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0114");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData10 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        java.lang.String[] strArray13 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData16 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList14);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData17 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList14);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData18 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList14);
        java.lang.String str19 = companyFileData18.getDowIndexStr();
        java.lang.String str20 = companyFileData18.getCity();
        estimateFileData10.setNameFields(companyFileData18);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(estimateFileData10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(incSheetFileData16);
        org.junit.Assert.assertNotNull(estimateFileData17);
        org.junit.Assert.assertNotNull(companyFileData18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0115");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readSipData("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.", "Cash File Data");
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0116");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getLtInvestYr();
        java.lang.String str3 = balSheetFileData0.getSector();
        double[] doubleArray4 = balSheetFileData0.getAcctRxYr();
        double[] doubleArray5 = balSheetFileData0.getOtherCurrAssetsYr();
        java.lang.String str6 = balSheetFileData0.getIndustry();
        double[] doubleArray7 = balSheetFileData0.getInventoryYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0117");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getGrossIncQtr();
        double[] doubleArray8 = incSheetFileData5.getUnusualIncQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0118");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.clearList();
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0119");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getStInvestYr();
        double[] doubleArray3 = balSheetFileData0.getTotalAssetsQtr();
        double[] doubleArray4 = balSheetFileData0.getOtherLtLiabQtr();
        double[] doubleArray5 = balSheetFileData0.getTotalAssetsYr();
        java.lang.String str6 = balSheetFileData0.toDbOutput();
        double[] doubleArray7 = balSheetFileData0.getLtInvestQtr();
        double[] doubleArray8 = balSheetFileData0.getPrefStockQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0120");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getFromDb("NONE", (int) (byte) 10, (int) (short) 100, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0121");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getFromDb("", (int) (short) -1, 52, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0122");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        java.lang.String str4 = sharesFileData1.getName();
        int int5 = sharesFileData1.getInsiderBuyShrs();
        sharesFileData1.setInsiderSellShrs("null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000");
        sharesFileData1.setBeta("Data for  from 52 Q97\r\n  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0123");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        java.lang.String str10 = sharesFileData1.getTicker();
        sharesFileData1.setFloatshr("NONE");
        sharesFileData1.setVolume3m("hi!");
        int int15 = sharesFileData1.getInsiderBuys();
        sharesFileData1.setBeta("NONE");
        java.lang.String str18 = sharesFileData1.getTicker();
        double double19 = sharesFileData1.getPrice52hi();
        double[] doubleArray20 = sharesFileData1.getSharesQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData21 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData22 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData21);
        sharesFileData22.setInstOwnership("NONE");
        sharesFileData22.setFloatshr("out/BigDB/");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData27 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData28 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData27);
        sharesFileData28.setInstOwnership("NONE");
        double[] doubleArray35 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData28.setSharesY(doubleArray35);
        sharesFileData28.setVolume10d("null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData39 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData40 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData39);
        sharesFileData40.setInstOwnership("NONE");
        double[] doubleArray47 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData40.setSharesY(doubleArray47);
        sharesFileData28.setSharesY(doubleArray47);
        sharesFileData22.setSharesY(doubleArray47);
        sharesFileData1.setSharesQ(doubleArray47);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[1.0, -1.0, 10.0, 10.0]");
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0124");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readSipData("null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000");
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0125");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "out/BigDB/100/Q32/hi!-fundamental-data-100Q32.", "null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000", "out/BigDB/", "" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0126");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getStInvestYr();
        double[] doubleArray3 = balSheetFileData0.getTotalAssetsQtr();
        double[] doubleArray4 = balSheetFileData0.getOtherLtLiabQtr();
        double[] doubleArray5 = balSheetFileData0.getTotalAssetsYr();
        double[] doubleArray6 = balSheetFileData0.getPrefStockYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0127");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        java.lang.String str8 = companyFileData7.getDowIndexStr();
        java.lang.String str9 = companyFileData7.getSnpIndexStr();
        companyFileData7.setPhone("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0128");
        java.lang.String[] strArray6 = new java.lang.String[] { "Cash File Data", "", "null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000", "data/BigDB/", "", "null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0129");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData1);
        java.lang.String str3 = cashFileData2.toDbOutput();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0130");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) 'a', (int) (byte) 1);
        boolean boolean3 = fieldData2.isDataValid();
        java.lang.String str4 = fieldData2.getTicker();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0131");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getStInvestYr();
        double[] doubleArray3 = balSheetFileData0.getTotalAssetsQtr();
        double[] doubleArray4 = balSheetFileData0.getOtherLtLiabQtr();
        double[] doubleArray5 = balSheetFileData0.getOtherCurrAssetsYr();
        double[] doubleArray6 = balSheetFileData0.getTotalLiabYr();
        java.lang.String str7 = balSheetFileData0.getIndustry();
        double[] doubleArray8 = balSheetFileData0.getLtInvestYr();
        java.lang.String str9 = balSheetFileData0.getExchange();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0132");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getRdYr();
        double[] doubleArray8 = incSheetFileData5.getUnusualIncQtr();
        java.lang.String str9 = incSheetFileData5.getSector();
        double[] doubleArray10 = incSheetFileData5.getOtherIncYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0133");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) '4', (int) 'a');
        java.lang.String str3 = fieldData2.getTicker();
        fieldData2.setQuarter((int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0134");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getStInvestYr();
        double[] doubleArray3 = balSheetFileData0.getTotalAssetsQtr();
        double[] doubleArray4 = balSheetFileData0.getOtherLtLiabQtr();
        double[] doubleArray5 = balSheetFileData0.getOtherCurrAssetsYr();
        double[] doubleArray6 = balSheetFileData0.getTotalLiabYr();
        double[] doubleArray7 = balSheetFileData0.getLtDebtYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0135");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getDividendYr();
        double[] doubleArray8 = incSheetFileData5.getUnusualIncQtr();
        double[] doubleArray9 = incSheetFileData5.getNonrecurringItemsYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0136");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getStInvestYr();
        double[] doubleArray3 = balSheetFileData0.getTotalAssetsQtr();
        double[] doubleArray4 = balSheetFileData0.getOtherLtLiabQtr();
        double[] doubleArray5 = balSheetFileData0.getTotalAssetsYr();
        double[] doubleArray6 = balSheetFileData0.getOtherLtLiabQtr();
        double[] doubleArray7 = balSheetFileData0.getGoodwillYr();
        double[] doubleArray8 = balSheetFileData0.getStDebtQtr();
        java.lang.String str9 = balSheetFileData0.getSector();
        double[] doubleArray10 = balSheetFileData0.getOtherCurrLiabQtr();
        double[] doubleArray11 = balSheetFileData0.getCurrLiabYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0137");
        java.lang.String[] strArray4 = new java.lang.String[] { "out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.", "Data for  from 52 Q97\r\n  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n", "hi!", "out/BigDB/" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData5 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0138");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        java.lang.String str10 = sharesFileData1.getTicker();
        sharesFileData1.setFloatshr("NONE");
        double double13 = sharesFileData1.getInstOwnership();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = sharesFileData1.toDbOutput();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0139");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        int int8 = companyFileData7.getNumEmployees();
        companyFileData7.setCountry("hi!");
        int int11 = companyFileData7.getNumEmployees();
        java.lang.String[] strArray14 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData17 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData18 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList15);
        java.util.List<java.lang.String> strList19 = companyFileData7.set((java.util.List<java.lang.String>) strList15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readFromDb((java.util.List<java.lang.String>) strList15);
        double[] doubleArray21 = balSheetFileData20.getTotalAssetsQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(incSheetFileData17);
        org.junit.Assert.assertNotNull(estimateFileData18);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(balSheetFileData20);
        org.junit.Assert.assertNull(doubleArray21);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0140");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData0);
        java.lang.String str2 = cashFileData1.getTicker();
        java.lang.String str3 = cashFileData1.toString();
        java.lang.String str4 = cashFileData1.getTicker();
        java.lang.String str5 = cashFileData1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Cash File Data" + "'", str3, "Cash File Data");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cash File Data" + "'", str5, "Cash File Data");
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0141");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        int int10 = sharesFileData1.getInsiderSells();
        sharesFileData1.setInsiderSells("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        java.lang.String[] strArray15 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData18 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList16);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData19 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList16);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList16);
        companyFileData20.setState("out/BigDB/");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData23 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double24 = estimateFileData23.getEpsQ1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData25 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData26 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData25);
        sharesFileData26.setInstOwnership("NONE");
        double[] doubleArray33 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData26.setSharesY(doubleArray33);
        java.lang.String str35 = sharesFileData26.getTicker();
        sharesFileData26.setFloatshr("NONE");
        sharesFileData26.setVolume3m("hi!");
        java.lang.String[] strArray42 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData45 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList43);
        double[] doubleArray46 = incSheetFileData45.getNonrecurringItemsQtr();
        double[] doubleArray47 = incSheetFileData45.getDividendYr();
        double[] doubleArray48 = incSheetFileData45.getEpsContQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData49 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray50 = balSheetFileData49.getOtherLtLiabYr();
        double[] doubleArray51 = balSheetFileData49.getCurrLiabYr();
        double[] doubleArray52 = balSheetFileData49.getAcctPayableQtr();
        double[] doubleArray53 = balSheetFileData49.getAcctPayableQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData54 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData55 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData54);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData58 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData20, estimateFileData23, sharesFileData26, incSheetFileData45, balSheetFileData49, cashFileData54, 100, (int) 'a');
        sharesFileData1.setNameFields(companyFileData20);
        java.lang.String str60 = companyFileData20.getSic();
        companyFileData20.setName("");
        boolean boolean63 = companyFileData20.isAdr();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(incSheetFileData18);
        org.junit.Assert.assertNotNull(estimateFileData19);
        org.junit.Assert.assertNotNull(companyFileData20);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(incSheetFileData45);
        org.junit.Assert.assertNull(doubleArray46);
        org.junit.Assert.assertNull(doubleArray47);
        org.junit.Assert.assertNull(doubleArray48);
        org.junit.Assert.assertNull(doubleArray50);
        org.junit.Assert.assertNull(doubleArray51);
        org.junit.Assert.assertNull(doubleArray52);
        org.junit.Assert.assertNull(doubleArray53);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0142");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getLtInvestYr();
        double[] doubleArray3 = balSheetFileData0.getLtInvestYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0143");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setDollar3m("null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000");
        int int4 = sharesFileData1.getInsiderNetTrades();
        sharesFileData1.setInstOwnership("data/BigDB/");
        double double7 = sharesFileData1.getPrice52lo();
        int int8 = sharesFileData1.getInstBuyShrs();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0144");
        java.lang.String str0 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.listToString();
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "" + "'", str0, "");
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0145");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInsiderBuyShrs();
        sharesFileData0.setInstBuyShrs("Data for  from 52 Q97\r\n  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        java.lang.String str4 = sharesFileData0.getName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0146");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getCurrLiabYr();
        double[] doubleArray3 = balSheetFileData0.getAcctPayableQtr();
        double[] doubleArray4 = balSheetFileData0.getAcctPayableQtr();
        double[] doubleArray5 = balSheetFileData0.getPrefStockYr();
        double[] doubleArray6 = balSheetFileData0.getCurrAssetsYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0147");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsYr();
        double[] doubleArray7 = incSheetFileData5.getSalesYr();
        double[] doubleArray8 = incSheetFileData5.getEpsContQtr();
        double[] doubleArray9 = incSheetFileData5.getIncPrimaryEpsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData10 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData5);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0148");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        int int8 = companyFileData7.getNumEmployees();
        companyFileData7.setCountry("hi!");
        int int11 = companyFileData7.getNumEmployees();
        double[] doubleArray12 = companyFileData7.getPriceQtr();
        companyFileData7.setAdr("Data for  from 52 Q97\r\n  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        java.lang.String str15 = companyFileData7.getPhone();
        java.lang.String str16 = companyFileData7.getIndustry();
        java.lang.String str17 = companyFileData7.getTicker();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0149");
        java.lang.String[] strArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(strArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0150");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) '4', (int) 'a');
        java.lang.String str3 = fieldData2.getIndustry();
        java.lang.String str4 = fieldData2.getName();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData5 = fieldData2.getBalSheetData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData6 = fieldData2.getIncSheetData();
        double[] doubleArray7 = incSheetFileData6.getIncPrimaryEpsYr();
        java.lang.String str8 = incSheetFileData6.getSector();
        double[] doubleArray9 = incSheetFileData6.getCogsYr();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(balSheetFileData5);
        org.junit.Assert.assertNotNull(incSheetFileData6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0151");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readSipData("");
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0152");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsYr();
        double[] doubleArray7 = incSheetFileData5.getDepreciationYr();
        double[] doubleArray8 = incSheetFileData5.getCogsQtr();
        java.lang.String[] strArray11 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData15 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData16 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        java.lang.String str17 = companyFileData16.getDowIndexStr();
        incSheetFileData5.setNameFields(companyFileData16);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData19 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData16);
        companyFileData19.setTicker("Cash File Data");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNotNull(estimateFileData15);
        org.junit.Assert.assertNotNull(companyFileData16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0153");
        java.lang.String str4 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getOutfileName(52, (int) (short) 1, "out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "out/BigDB/52/Q1/out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.-fundamental-data-52Q1." + "'", str4, "out/BigDB/52/Q1/out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.-fundamental-data-52Q1.");
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0154");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        java.lang.String str10 = sharesFileData1.getTicker();
        sharesFileData1.setFloatshr("NONE");
        sharesFileData1.setVolume3m("hi!");
        sharesFileData1.setInstSellShrs("Cash File Data");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0155");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        sharesFileData1.setFloatshr("out/BigDB/");
        double[] doubleArray6 = sharesFileData1.getSharesYr();
        int int7 = sharesFileData1.getInsiderBuyShrs();
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0156");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear((int) (short) 100);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0157");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear((int) (short) 1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter2 = fieldDataYear1.getQ3();
        org.junit.Assert.assertNull(fieldDataQuarter2);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0158");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) '4', (int) 'a');
        java.lang.String str3 = fieldData2.getIndustry();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum4 = fieldData2.getExchange();
        fieldData2.setQuarter((int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(exchEnum4);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0159");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readSipData("out/BigDB/52/Q1/out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.-fundamental-data-52Q1.");
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0160");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.find("out/BigDB/");
        org.junit.Assert.assertNull(companyFileData1);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0161");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData1);
        java.lang.String str3 = cashFileData1.getTicker();
        double[] doubleArray4 = cashFileData1.getCapExQtr();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(doubleArray4);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0162");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear((int) (short) 1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter3 = fieldDataYear1.getQ(10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getQFromMemory((int) '#', 100);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter10 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter((int) 'a', (int) (byte) 1, fieldDataList9);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = fieldDataQuarter10.fieldDataList;
        fieldDataYear1.set((int) (short) 0, fieldDataQuarter10);
        boolean boolean14 = fieldDataYear1.quarterDataAvailable((int) (byte) 10);
        org.junit.Assert.assertNull(fieldDataQuarter3);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0163");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        companyFileData7.setSnpIndex("NONE");
        java.lang.String str10 = companyFileData7.getState();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0164");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        sharesFileData1.setDollar3m("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        long long12 = sharesFileData1.getVolume10d();
        sharesFileData1.setInstOwnership("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        sharesFileData1.setPrice("");
        double double17 = sharesFileData1.getDollar3m();
        double double18 = sharesFileData1.getFloatshr();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0165");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsYr();
        double[] doubleArray7 = incSheetFileData5.getDepreciationYr();
        double[] doubleArray8 = incSheetFileData5.getEpsDilYr();
        double[] doubleArray9 = incSheetFileData5.getIncAfterTaxQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0166");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getGrossOpIncQtr();
        double[] doubleArray8 = incSheetFileData5.getIncTaxYr();
        double[] doubleArray9 = incSheetFileData5.getEpsContYr();
        double[] doubleArray10 = incSheetFileData5.getEpsDilQtr();
        double[] doubleArray11 = incSheetFileData5.getEpsYr();
        java.lang.String str12 = incSheetFileData5.getSector();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0167");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        sharesFileData1.setFloatshr("out/BigDB/");
        sharesFileData1.setInsiderBuyShrs("Data for  from 52 Q97\r\n  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        double double8 = sharesFileData1.getInsiderOwnership();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0168");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) '4', (int) 'a');
        java.lang.String str3 = fieldData2.getIndustry();
        java.lang.String str4 = fieldData2.getName();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData5 = fieldData2.getBalSheetData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData6 = fieldData2.getIncSheetData();
        java.lang.String str7 = fieldData2.getSector();
        java.lang.String str8 = fieldData2.getIndustry();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum9 = fieldData2.getExchange();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(balSheetFileData5);
        org.junit.Assert.assertNotNull(incSheetFileData6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(exchEnum9);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0169");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        java.lang.String str8 = companyFileData7.getDowIndexStr();
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum9 = companyFileData7.getSnpIndex();
        companyFileData7.setName("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData12 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData7);
        java.lang.String str13 = companyFileData7.toString();
        companyFileData7.setCountry("");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(snpEnum9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0170");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsYr();
        double[] doubleArray7 = incSheetFileData5.getDepreciationYr();
        double[] doubleArray8 = incSheetFileData5.getCogsQtr();
        java.lang.String[] strArray11 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData15 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData16 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        java.lang.String str17 = companyFileData16.getDowIndexStr();
        incSheetFileData5.setNameFields(companyFileData16);
        companyFileData16.setExchange("NONE");
        companyFileData16.setWeb("NONE");
        java.lang.String str23 = companyFileData16.toString();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNotNull(estimateFileData15);
        org.junit.Assert.assertNotNull(companyFileData16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0171");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        int int8 = companyFileData7.getNumEmployees();
        companyFileData7.setCountry("hi!");
        int int11 = companyFileData7.getNumEmployees();
        java.lang.String str12 = companyFileData7.getTicker();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0172");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getPrefStockQtr();
        double[] doubleArray3 = balSheetFileData0.getTotalAssetsYr();
        double[] doubleArray4 = balSheetFileData0.getOtherLtLiabYr();
        java.lang.String str5 = balSheetFileData0.getName();
        double[] doubleArray6 = balSheetFileData0.getOtherCurrAssetsYr();
        double[] doubleArray7 = balSheetFileData0.getLtDebtQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0173");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        companyFileData7.setName("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        companyFileData7.setCountry("Data for  from 52 Q97\r\n  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        java.lang.String str12 = companyFileData7.getSic();
        java.lang.String str13 = companyFileData7.toString();
        java.lang.String str14 = companyFileData7.getTicker();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0174");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setFloatshr("");
        sharesFileData1.setPrice("Data for  from 52 Q97\r\n  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        double double6 = sharesFileData1.getInstOwnership();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0175");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.find("");
        org.junit.Assert.assertNull(incSheetFileData1);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0176");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getAcctPayableYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0177");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getCurrAssetsYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0178");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.setQMemory((int) (short) 100, (int) (byte) 1, filetypeEnum2);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0179");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getStInvestYr();
        double[] doubleArray3 = balSheetFileData0.getTotalAssetsQtr();
        double[] doubleArray4 = balSheetFileData0.getOtherLtLiabQtr();
        double[] doubleArray5 = balSheetFileData0.getOtherCurrAssetsYr();
        double[] doubleArray6 = balSheetFileData0.getStDebtYr();
        double[] doubleArray7 = balSheetFileData0.getCashQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0180");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        java.lang.String str8 = companyFileData7.getDowIndexStr();
        companyFileData7.setSnpIndex("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        companyFileData7.setWeb("Data for  from 52 Q97\r\n  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0181");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        java.lang.String str8 = companyFileData7.getDowIndexStr();
        java.lang.String str9 = companyFileData7.getCity();
        boolean boolean10 = companyFileData7.isAdr();
        java.lang.String str11 = companyFileData7.getWeb();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum12 = companyFileData7.getExchange();
        companyFileData7.setSnpIndex("hi!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(exchEnum12);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0182");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getRdYr();
        double[] doubleArray8 = incSheetFileData5.getUnusualIncQtr();
        java.lang.String str9 = incSheetFileData5.getSector();
        double[] doubleArray10 = incSheetFileData5.getIncPrimaryEpsYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0183");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) '4', (int) 'a');
        java.lang.String str3 = fieldData2.getTicker();
        boolean boolean4 = fieldData2.isDataValid();
        int int5 = fieldData2.getQuarter();
        int int6 = fieldData2.getQuarter();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0184");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getStInvestYr();
        double[] doubleArray3 = balSheetFileData0.getTotalAssetsQtr();
        double[] doubleArray4 = balSheetFileData0.getOtherLtLiabQtr();
        double[] doubleArray5 = balSheetFileData0.getOtherCurrAssetsYr();
        double[] doubleArray6 = balSheetFileData0.getCashQtr();
        double[] doubleArray7 = balSheetFileData0.getCurrAssetsQtr();
        double[] doubleArray8 = balSheetFileData0.getNetFixedAssetsYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0185");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        java.lang.String str4 = sharesFileData1.getName();
        double double5 = sharesFileData1.getPrice();
        sharesFileData1.setDollar3m("NONE");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0186");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getDividendYr();
        double[] doubleArray8 = incSheetFileData5.getEpsContQtr();
        double[] doubleArray9 = incSheetFileData5.getSalesYr();
        double[] doubleArray10 = incSheetFileData5.getOtherIncQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0187");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double1 = estimateFileData0.getEpsQ1();
        java.lang.String str2 = estimateFileData0.getSector();
        double double3 = estimateFileData0.getEpsQ0();
        net.ajaskey.common.DateTime dateTime4 = estimateFileData0.getCurrFiscalYear();
        double double5 = estimateFileData0.getEpsY1();
        java.lang.String str6 = estimateFileData0.toDbOutput();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(dateTime4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0188");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double1 = estimateFileData0.getEpsQ1();
        java.lang.String str2 = estimateFileData0.getSector();
        double double3 = estimateFileData0.getEpsQ0();
        net.ajaskey.common.DateTime dateTime4 = estimateFileData0.getCurrFiscalYear();
        java.lang.String str5 = estimateFileData0.getSector();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(dateTime4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0189");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double1 = estimateFileData0.getEpsQ1();
        java.lang.String str2 = estimateFileData0.getSector();
        double double3 = estimateFileData0.getEpsQ0();
        java.lang.String str4 = estimateFileData0.getSector();
        java.lang.String str5 = estimateFileData0.toString();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000" + "'", str5, "null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000");
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0190");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getStInvestYr();
        double[] doubleArray3 = balSheetFileData0.getTotalAssetsQtr();
        double[] doubleArray4 = balSheetFileData0.getOtherLtLiabQtr();
        double[] doubleArray5 = balSheetFileData0.getTotalAssetsYr();
        double[] doubleArray6 = balSheetFileData0.getOtherLtLiabQtr();
        double[] doubleArray7 = balSheetFileData0.getGoodwillYr();
        double[] doubleArray8 = balSheetFileData0.getStDebtQtr();
        java.lang.String str9 = balSheetFileData0.getSector();
        double[] doubleArray10 = balSheetFileData0.getPrefStockQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0191");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        java.lang.String str8 = companyFileData7.getDowIndexStr();
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum9 = companyFileData7.getSnpIndex();
        companyFileData7.setName("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        companyFileData7.setCountry("data/BigDB/");
        java.lang.String str14 = companyFileData7.getDowIndexStr();
        companyFileData7.setSnpIndex("Data for  from 52 Q97\r\n  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        java.lang.String str17 = companyFileData7.getDowIndexStr();
        // The following exception was thrown during execution in test generation
        try {
            companyFileData7.setExchange("null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No enum constant net.ajaskey.market.tools.SIP.BigDB.ExchEnum.null      ?null                                    ?NONE                ?null                                    ?null??  null  null??  Est Q0 Q1    :      0.000      0.000??  Est Y0 Y1 Y2 :      0.000       0.00      0.000");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(snpEnum9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0192");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        companyFileData7.setState("out/BigDB/");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData10 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double11 = estimateFileData10.getEpsQ1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData12 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData13 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData12);
        sharesFileData13.setInstOwnership("NONE");
        double[] doubleArray20 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData13.setSharesY(doubleArray20);
        java.lang.String str22 = sharesFileData13.getTicker();
        sharesFileData13.setFloatshr("NONE");
        sharesFileData13.setVolume3m("hi!");
        java.lang.String[] strArray29 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData32 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList30);
        double[] doubleArray33 = incSheetFileData32.getNonrecurringItemsQtr();
        double[] doubleArray34 = incSheetFileData32.getDividendYr();
        double[] doubleArray35 = incSheetFileData32.getEpsContQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData36 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray37 = balSheetFileData36.getOtherLtLiabYr();
        double[] doubleArray38 = balSheetFileData36.getCurrLiabYr();
        double[] doubleArray39 = balSheetFileData36.getAcctPayableQtr();
        double[] doubleArray40 = balSheetFileData36.getAcctPayableQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData41 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData42 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData41);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData45 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData7, estimateFileData10, sharesFileData13, incSheetFileData32, balSheetFileData36, cashFileData41, 100, (int) 'a');
        double[] doubleArray46 = incSheetFileData32.getPreTaxIncYr();
        double[] doubleArray47 = incSheetFileData32.getEpsDilYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(incSheetFileData32);
        org.junit.Assert.assertNull(doubleArray33);
        org.junit.Assert.assertNull(doubleArray34);
        org.junit.Assert.assertNull(doubleArray35);
        org.junit.Assert.assertNull(doubleArray37);
        org.junit.Assert.assertNull(doubleArray38);
        org.junit.Assert.assertNull(doubleArray39);
        org.junit.Assert.assertNull(doubleArray40);
        org.junit.Assert.assertNull(doubleArray46);
        org.junit.Assert.assertNull(doubleArray47);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0193");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        java.lang.String str8 = companyFileData7.getDowIndexStr();
        java.lang.String str9 = companyFileData7.getTicker();
        companyFileData7.setCity("null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000");
        companyFileData7.setSnpIndex("Cash File Data");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0194");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getStInvestYr();
        double[] doubleArray3 = balSheetFileData0.getTotalAssetsQtr();
        double[] doubleArray4 = balSheetFileData0.getOtherLtLiabQtr();
        double[] doubleArray5 = balSheetFileData0.getTotalAssetsYr();
        double[] doubleArray6 = balSheetFileData0.getOtherLtLiabQtr();
        double[] doubleArray7 = balSheetFileData0.getGoodwillYr();
        double[] doubleArray8 = balSheetFileData0.getStDebtQtr();
        java.lang.String str9 = balSheetFileData0.getSector();
        double[] doubleArray10 = balSheetFileData0.getOtherCurrLiabQtr();
        java.lang.String str11 = balSheetFileData0.getSector();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0195");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getPrefStockQtr();
        double[] doubleArray3 = balSheetFileData0.getAcctPayableYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0196");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getStInvestYr();
        double[] doubleArray3 = balSheetFileData0.getTotalAssetsQtr();
        double[] doubleArray4 = balSheetFileData0.getOtherLtLiabQtr();
        double[] doubleArray5 = balSheetFileData0.getOtherCurrAssetsYr();
        double[] doubleArray6 = balSheetFileData0.getTotalLiabYr();
        java.lang.String str7 = balSheetFileData0.getIndustry();
        double[] doubleArray8 = balSheetFileData0.getLtInvestYr();
        double[] doubleArray9 = balSheetFileData0.getCurrLiabQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0197");
        java.util.List<java.lang.String> strList0 = null;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory(strList0, 0, (int) (byte) -1);
        org.junit.Assert.assertNotNull(fieldDataList3);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0198");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double1 = estimateFileData0.getEpsQ1();
        java.lang.String str2 = estimateFileData0.getSector();
        double double3 = estimateFileData0.getEpsY0();
        java.lang.String str4 = estimateFileData0.getSector();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0199");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        java.lang.String str4 = sharesFileData1.getName();
        double double5 = sharesFileData1.getPrice();
        java.lang.String str6 = sharesFileData1.getName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = sharesFileData1.toDbOutput();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0200");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getRdQtr();
        double[] doubleArray8 = incSheetFileData5.getIntExpNonOpYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0201");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getPrefStockQtr();
        double[] doubleArray3 = balSheetFileData0.getTotalAssetsYr();
        double[] doubleArray4 = balSheetFileData0.getOtherLtLiabYr();
        java.lang.String str5 = balSheetFileData0.getName();
        double[] doubleArray6 = balSheetFileData0.getOtherCurrAssetsYr();
        double[] doubleArray7 = balSheetFileData0.getEquityQtr();
        double[] doubleArray8 = balSheetFileData0.getStDebtYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0202");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getCurrLiabYr();
        double[] doubleArray3 = balSheetFileData0.getAcctPayableQtr();
        double[] doubleArray4 = balSheetFileData0.getAcctPayableQtr();
        double[] doubleArray5 = balSheetFileData0.getTotalAssetsYr();
        java.lang.String str6 = balSheetFileData0.getExchange();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0203");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        int int10 = sharesFileData1.getInsiderSells();
        sharesFileData1.setInsiderSells("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        java.lang.String[] strArray15 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData18 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList16);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData19 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList16);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList16);
        companyFileData20.setState("out/BigDB/");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData23 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double24 = estimateFileData23.getEpsQ1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData25 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData26 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData25);
        sharesFileData26.setInstOwnership("NONE");
        double[] doubleArray33 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData26.setSharesY(doubleArray33);
        java.lang.String str35 = sharesFileData26.getTicker();
        sharesFileData26.setFloatshr("NONE");
        sharesFileData26.setVolume3m("hi!");
        java.lang.String[] strArray42 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData45 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList43);
        double[] doubleArray46 = incSheetFileData45.getNonrecurringItemsQtr();
        double[] doubleArray47 = incSheetFileData45.getDividendYr();
        double[] doubleArray48 = incSheetFileData45.getEpsContQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData49 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray50 = balSheetFileData49.getOtherLtLiabYr();
        double[] doubleArray51 = balSheetFileData49.getCurrLiabYr();
        double[] doubleArray52 = balSheetFileData49.getAcctPayableQtr();
        double[] doubleArray53 = balSheetFileData49.getAcctPayableQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData54 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData55 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData54);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData58 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData20, estimateFileData23, sharesFileData26, incSheetFileData45, balSheetFileData49, cashFileData54, 100, (int) 'a');
        sharesFileData1.setNameFields(companyFileData20);
        java.lang.String str60 = companyFileData20.getSic();
        java.lang.String str61 = companyFileData20.getTicker();
        companyFileData20.setSnpIndex("hi!");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(incSheetFileData18);
        org.junit.Assert.assertNotNull(estimateFileData19);
        org.junit.Assert.assertNotNull(companyFileData20);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(incSheetFileData45);
        org.junit.Assert.assertNull(doubleArray46);
        org.junit.Assert.assertNull(doubleArray47);
        org.junit.Assert.assertNull(doubleArray48);
        org.junit.Assert.assertNull(doubleArray50);
        org.junit.Assert.assertNull(doubleArray51);
        org.junit.Assert.assertNull(doubleArray52);
        org.junit.Assert.assertNull(doubleArray53);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0204");
        java.lang.String[] strArray6 = new java.lang.String[] { "data/BigDB/", "null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000", "out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.", "Cash File Data", "out/BigDB/52/Q1/out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.-fundamental-data-52Q1.", "out/BigDB/" };
        java.lang.String[] strArray8 = new java.lang.String[] { "out/BigDB/52/Q1/out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.-fundamental-data-52Q1." };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData9 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(strArray6, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0205");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum1 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.convertExchange("null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000");
        org.junit.Assert.assertTrue("'" + exchEnum1 + "' != '" + net.ajaskey.market.tools.SIP.BigDB.ExchEnum.NONE + "'", exchEnum1.equals(net.ajaskey.market.tools.SIP.BigDB.ExchEnum.NONE));
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0206");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.find("null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000");
        org.junit.Assert.assertNull(sharesFileData1);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0207");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.find("NONE");
        org.junit.Assert.assertNull(sharesFileData1);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0208");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        java.lang.String str10 = sharesFileData1.getTicker();
        sharesFileData1.setFloatshr("NONE");
        sharesFileData1.setVolume3m("hi!");
        int int15 = sharesFileData1.getInsiderBuys();
        sharesFileData1.setBeta("NONE");
        java.lang.String str18 = sharesFileData1.getTicker();
        sharesFileData1.setVolume3m("data/BigDB/");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0209");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) '4', (int) 'a');
        java.lang.String str3 = fieldData2.getTicker();
        boolean boolean4 = fieldData2.isDataValid();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = fieldData2.getCompanyInfo();
        java.lang.String str6 = fieldData2.getIndustry();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData7 = fieldData2.getCashData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData8 = fieldData2.getIncSheetData();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(cashFileData7);
        org.junit.Assert.assertNotNull(incSheetFileData8);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0210");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getIncAfterTaxYr();
        double[] doubleArray8 = incSheetFileData5.getDividendQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0211");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) '4', (int) 'a');
        boolean boolean3 = fieldData2.isDataValid();
        java.lang.String str4 = fieldData2.getName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0212");
        java.lang.String[] strArray6 = new java.lang.String[] { "out/BigDB/", "null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000", "NONE", "Cash File Data", "out/BigDB/52/Q1/out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.-fundamental-data-52Q1.", "null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000" };
        java.lang.String[] strArray9 = new java.lang.String[] { "out/BigDB/", "" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData10 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(strArray6, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0213");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setDollar3m("null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000");
        int int4 = sharesFileData1.getInsiderNetTrades();
        sharesFileData1.setInstOwnership("data/BigDB/");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData7 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData7);
        sharesFileData8.setInstOwnership("NONE");
        java.lang.String str11 = sharesFileData8.getName();
        sharesFileData8.setInstBuyShrs("NONE");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData14 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData15 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData14);
        sharesFileData15.setInstOwnership("NONE");
        sharesFileData15.setFloatshr("out/BigDB/");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData20 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData21 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData20);
        sharesFileData21.setInstOwnership("NONE");
        double[] doubleArray28 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData21.setSharesY(doubleArray28);
        sharesFileData21.setVolume10d("null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData32 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData33 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData32);
        sharesFileData33.setInstOwnership("NONE");
        double[] doubleArray40 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData33.setSharesY(doubleArray40);
        sharesFileData21.setSharesY(doubleArray40);
        sharesFileData15.setSharesY(doubleArray40);
        sharesFileData8.setSharesY(doubleArray40);
        sharesFileData1.setSharesQ(doubleArray40);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[1.0, -1.0, 10.0, 10.0]");
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0214");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        int int8 = companyFileData7.getNumEmployees();
        companyFileData7.setCountry("hi!");
        int int11 = companyFileData7.getNumEmployees();
        double[] doubleArray12 = companyFileData7.getPriceQtr();
        companyFileData7.setAdr("Data for  from 52 Q97\r\n  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        double[] doubleArray15 = companyFileData7.getPriceQtr();
        companyFileData7.setSic("out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray15);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0215");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear((int) (short) -1);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0216");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        int int10 = sharesFileData1.getInsiderSells();
        sharesFileData1.setFloatshr("out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        sharesFileData1.setPrice("null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0217");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsYr();
        double[] doubleArray7 = incSheetFileData5.getSalesYr();
        double[] doubleArray8 = incSheetFileData5.getEpsContQtr();
        double[] doubleArray9 = incSheetFileData5.getEpsDilContYr();
        double[] doubleArray10 = incSheetFileData5.getEpsDilContYr();
        java.lang.String str11 = incSheetFileData5.getName();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0218");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        companyFileData7.setState("out/BigDB/");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData10 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double11 = estimateFileData10.getEpsQ1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData12 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData13 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData12);
        sharesFileData13.setInstOwnership("NONE");
        double[] doubleArray20 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData13.setSharesY(doubleArray20);
        java.lang.String str22 = sharesFileData13.getTicker();
        sharesFileData13.setFloatshr("NONE");
        sharesFileData13.setVolume3m("hi!");
        java.lang.String[] strArray29 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData32 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList30);
        double[] doubleArray33 = incSheetFileData32.getNonrecurringItemsQtr();
        double[] doubleArray34 = incSheetFileData32.getDividendYr();
        double[] doubleArray35 = incSheetFileData32.getEpsContQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData36 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray37 = balSheetFileData36.getOtherLtLiabYr();
        double[] doubleArray38 = balSheetFileData36.getCurrLiabYr();
        double[] doubleArray39 = balSheetFileData36.getAcctPayableQtr();
        double[] doubleArray40 = balSheetFileData36.getAcctPayableQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData41 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData42 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData41);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData45 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData7, estimateFileData10, sharesFileData13, incSheetFileData32, balSheetFileData36, cashFileData41, 100, (int) 'a');
        net.ajaskey.common.DateTime dateTime46 = estimateFileData10.getLatestQtrEps();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum47 = estimateFileData10.getExchange();
        net.ajaskey.common.DateTime dateTime48 = estimateFileData10.getLatestQtrEps();
        double double49 = estimateFileData10.getEpsQ1();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(incSheetFileData32);
        org.junit.Assert.assertNull(doubleArray33);
        org.junit.Assert.assertNull(doubleArray34);
        org.junit.Assert.assertNull(doubleArray35);
        org.junit.Assert.assertNull(doubleArray37);
        org.junit.Assert.assertNull(doubleArray38);
        org.junit.Assert.assertNull(doubleArray39);
        org.junit.Assert.assertNull(doubleArray40);
        org.junit.Assert.assertNull(dateTime46);
        org.junit.Assert.assertNull(exchEnum47);
        org.junit.Assert.assertNull(dateTime48);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0219");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getCurrLiabYr();
        double[] doubleArray3 = balSheetFileData0.getCurrLiabYr();
        double[] doubleArray4 = balSheetFileData0.getCurrAssetsYr();
        double[] doubleArray5 = balSheetFileData0.getCashQtr();
        double[] doubleArray6 = balSheetFileData0.getLtDebtYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0220");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str1 = estimateFileData0.getTicker();
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0221");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        java.lang.String str10 = sharesFileData1.getTicker();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData11 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData12 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData11);
        sharesFileData12.setInstOwnership("NONE");
        double[] doubleArray19 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData12.setSharesY(doubleArray19);
        sharesFileData12.setVolume10d("null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData23 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData23);
        sharesFileData24.setInstOwnership("NONE");
        double[] doubleArray31 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData24.setSharesY(doubleArray31);
        sharesFileData12.setSharesY(doubleArray31);
        sharesFileData1.setSharesQ(doubleArray31);
        double double35 = sharesFileData1.getPrice();
        sharesFileData1.setFromReport((int) (byte) 1, 100);
        sharesFileData1.setFromReport((int) (short) -1, (int) (short) 100);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0222");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContQtr();
        double[] doubleArray7 = incSheetFileData5.getIncTaxYr();
        double[] doubleArray8 = incSheetFileData5.getPreTaxIncYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0223");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        java.lang.String str10 = sharesFileData1.getTicker();
        sharesFileData1.setFloatshr("NONE");
        sharesFileData1.setVolume3m("hi!");
        int int15 = sharesFileData1.getInsiderBuys();
        sharesFileData1.setBeta("NONE");
        double double18 = sharesFileData1.getInsiderOwnership();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0224");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        int int10 = sharesFileData1.getInsiderSells();
        sharesFileData1.setInsiderSells("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        java.lang.String[] strArray15 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData18 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList16);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData19 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList16);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList16);
        companyFileData20.setState("out/BigDB/");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData23 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double24 = estimateFileData23.getEpsQ1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData25 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData26 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData25);
        sharesFileData26.setInstOwnership("NONE");
        double[] doubleArray33 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData26.setSharesY(doubleArray33);
        java.lang.String str35 = sharesFileData26.getTicker();
        sharesFileData26.setFloatshr("NONE");
        sharesFileData26.setVolume3m("hi!");
        java.lang.String[] strArray42 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData45 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList43);
        double[] doubleArray46 = incSheetFileData45.getNonrecurringItemsQtr();
        double[] doubleArray47 = incSheetFileData45.getDividendYr();
        double[] doubleArray48 = incSheetFileData45.getEpsContQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData49 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray50 = balSheetFileData49.getOtherLtLiabYr();
        double[] doubleArray51 = balSheetFileData49.getCurrLiabYr();
        double[] doubleArray52 = balSheetFileData49.getAcctPayableQtr();
        double[] doubleArray53 = balSheetFileData49.getAcctPayableQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData54 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData55 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData54);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData58 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData20, estimateFileData23, sharesFileData26, incSheetFileData45, balSheetFileData49, cashFileData54, 100, (int) 'a');
        sharesFileData1.setNameFields(companyFileData20);
        java.lang.String str60 = companyFileData20.getSic();
        companyFileData20.setSnpIndex("");
        java.lang.String str63 = companyFileData20.getSnpIndexStr();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(incSheetFileData18);
        org.junit.Assert.assertNotNull(estimateFileData19);
        org.junit.Assert.assertNotNull(companyFileData20);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(incSheetFileData45);
        org.junit.Assert.assertNull(doubleArray46);
        org.junit.Assert.assertNull(doubleArray47);
        org.junit.Assert.assertNull(doubleArray48);
        org.junit.Assert.assertNull(doubleArray50);
        org.junit.Assert.assertNull(doubleArray51);
        org.junit.Assert.assertNull(doubleArray52);
        org.junit.Assert.assertNull(doubleArray53);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "NONE" + "'", str63, "NONE");
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0225");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.find("Data for  from 52 Q97\r\n  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        org.junit.Assert.assertNull(balSheetFileData1);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0226");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) '4', (int) 'a');
        java.lang.String str3 = fieldData2.getTicker();
        boolean boolean4 = fieldData2.isDataValid();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = fieldData2.getCompanyInfo();
        boolean boolean6 = companyFileData5.isAdr();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0227");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getCurrLiabYr();
        double[] doubleArray3 = balSheetFileData0.getGoodwillQtr();
        double[] doubleArray4 = balSheetFileData0.getTotalLiabQtr();
        java.lang.String str5 = balSheetFileData0.getName();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0228");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        boolean boolean1 = companyFileData0.isAdr();
        // The following exception was thrown during execution in test generation
        try {
            companyFileData0.setExchange("Cash File Data");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No enum constant net.ajaskey.market.tools.SIP.BigDB.ExchEnum.Cash File Data");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0229");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        int int4 = sharesFileData1.getInsiderBuys();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum5 = sharesFileData1.getExchange();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(exchEnum5);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0230");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readSipData("");
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0231");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        companyFileData7.setState("out/BigDB/");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData10 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double11 = estimateFileData10.getEpsQ1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData12 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData13 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData12);
        sharesFileData13.setInstOwnership("NONE");
        double[] doubleArray20 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData13.setSharesY(doubleArray20);
        java.lang.String str22 = sharesFileData13.getTicker();
        sharesFileData13.setFloatshr("NONE");
        sharesFileData13.setVolume3m("hi!");
        java.lang.String[] strArray29 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData32 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList30);
        double[] doubleArray33 = incSheetFileData32.getNonrecurringItemsQtr();
        double[] doubleArray34 = incSheetFileData32.getDividendYr();
        double[] doubleArray35 = incSheetFileData32.getEpsContQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData36 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray37 = balSheetFileData36.getOtherLtLiabYr();
        double[] doubleArray38 = balSheetFileData36.getCurrLiabYr();
        double[] doubleArray39 = balSheetFileData36.getAcctPayableQtr();
        double[] doubleArray40 = balSheetFileData36.getAcctPayableQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData41 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData42 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData41);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData45 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData7, estimateFileData10, sharesFileData13, incSheetFileData32, balSheetFileData36, cashFileData41, 100, (int) 'a');
        boolean boolean46 = fieldData45.isDataValid();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(incSheetFileData32);
        org.junit.Assert.assertNull(doubleArray33);
        org.junit.Assert.assertNull(doubleArray34);
        org.junit.Assert.assertNull(doubleArray35);
        org.junit.Assert.assertNull(doubleArray37);
        org.junit.Assert.assertNull(doubleArray38);
        org.junit.Assert.assertNull(doubleArray39);
        org.junit.Assert.assertNull(doubleArray40);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0232");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setFloatshr("");
        sharesFileData1.setPrice("Data for  from 52 Q97\r\n  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        long long6 = sharesFileData1.getVolume10d();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0233");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.setMemory(52, 52, filetypeEnum2);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0234");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getCurrLiabYr();
        java.lang.String str3 = balSheetFileData0.getName();
        double[] doubleArray4 = balSheetFileData0.getAcctRxQtr();
        double[] doubleArray5 = balSheetFileData0.getAcctPayableYr();
        double[] doubleArray6 = balSheetFileData0.getAcctPayableQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0235");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getStInvestYr();
        double[] doubleArray3 = balSheetFileData0.getTotalAssetsQtr();
        double[] doubleArray4 = balSheetFileData0.getOtherLtLiabQtr();
        double[] doubleArray5 = balSheetFileData0.getOtherCurrAssetsYr();
        double[] doubleArray6 = balSheetFileData0.getCashQtr();
        double[] doubleArray7 = balSheetFileData0.getStInvestYr();
        double[] doubleArray8 = balSheetFileData0.getAcctPayableQtr();
        double[] doubleArray9 = balSheetFileData0.getStInvestQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0236");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        sharesFileData1.setDollar3m("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        long long12 = sharesFileData1.getVolume10d();
        sharesFileData1.setInsiderBuys("NONE");
        sharesFileData1.setInsiderNetTrades("out/BigDB/52/Q1/out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.-fundamental-data-52Q1.");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0237");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear((int) (short) 1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter3 = fieldDataYear1.getQ((int) '4');
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter4 = fieldDataYear1.getQ4();
        int int5 = fieldDataYear1.getYear();
        org.junit.Assert.assertNull(fieldDataQuarter3);
        org.junit.Assert.assertNull(fieldDataQuarter4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0238");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readSipData("NONE");
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0239");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getFromDb("null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000", 100, (int) (byte) -1, filetypeEnum3);
        org.junit.Assert.assertNull(fieldData4);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0240");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getStInvestYr();
        double[] doubleArray3 = balSheetFileData0.getTotalAssetsQtr();
        double[] doubleArray4 = balSheetFileData0.getOtherLtLiabQtr();
        double[] doubleArray5 = balSheetFileData0.getOtherCurrAssetsYr();
        double[] doubleArray6 = balSheetFileData0.getStDebtYr();
        double[] doubleArray7 = balSheetFileData0.getPrefStockYr();
        double[] doubleArray8 = balSheetFileData0.getEquityQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0241");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray9 = cashFileData8.getCashFromInvQtr();
        double[] doubleArray10 = cashFileData8.getCashFromInvQtr();
        double[] doubleArray11 = cashFileData8.getCapExQtr();
        double[] doubleArray12 = cashFileData8.getCashFromOpsQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertNotNull(cashFileData8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0242");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        sharesFileData1.setFromReport((int) (short) 100, 32);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0243");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getGrossOpIncQtr();
        double[] doubleArray8 = incSheetFileData5.getIncTaxYr();
        double[] doubleArray9 = incSheetFileData5.getEpsContYr();
        double[] doubleArray10 = incSheetFileData5.getEpsDilQtr();
        double[] doubleArray11 = incSheetFileData5.getEpsYr();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum12 = incSheetFileData5.getExchange();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(exchEnum12);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0244");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        java.lang.String str8 = companyFileData7.getDowIndexStr();
        companyFileData7.setZip("data/BigDB/");
        java.lang.String str11 = companyFileData7.toDbOuput();
        java.lang.String str12 = companyFileData7.getZip();
        java.lang.String str13 = companyFileData7.getTicker();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "data/BigDB/" + "'", str12, "data/BigDB/");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0245");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        java.lang.String str4 = sharesFileData1.getName();
        int int5 = sharesFileData1.getInstSellShrs();
        java.lang.Class<?> wildcardClass6 = sharesFileData1.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0246");
        java.lang.String[] strArray5 = new java.lang.String[] { "Data for  from 52 Q97\r\n  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n", "Data for  from 52 Q97\r\n  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n", "Cash File Data", "null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000", "Cash File Data" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0247");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean3 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.parseSipData(0, (int) (short) 0, filetypeEnum2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0248");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        java.lang.String str10 = sharesFileData1.getTicker();
        sharesFileData1.setFloatshr("NONE");
        sharesFileData1.setVolume3m("hi!");
        int int15 = sharesFileData1.getInsiderBuys();
        sharesFileData1.setBeta("NONE");
        java.lang.String str18 = sharesFileData1.getTicker();
        double double19 = sharesFileData1.getPrice52hi();
        sharesFileData1.setInsiderBuys("out/BigDB/52/Q1/out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.-fundamental-data-52Q1.");
        sharesFileData1.setInsiderBuys("data/BigDB/");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0249");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear((int) (short) 1);
        boolean boolean3 = fieldDataYear1.quarterDataAvailable((-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0250");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getDividendYr();
        double[] doubleArray8 = incSheetFileData5.getAdjToIncQtr();
        double[] doubleArray9 = incSheetFileData5.getNetIncQtr();
        double[] doubleArray10 = incSheetFileData5.getGrossOpIncYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0251");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.clearList();
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0252");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setDollar3m("");
        sharesFileData0.setInsiderBuys("out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        sharesFileData0.setBeta("out/BigDB/");
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0253");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double double7 = estimateFileData6.getEpsY1();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0254");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear((int) (short) 1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter3 = fieldDataYear1.getQ((int) '4');
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter4 = fieldDataYear1.getQ4();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter5 = fieldDataYear1.getQ2();
        org.junit.Assert.assertNull(fieldDataQuarter3);
        org.junit.Assert.assertNull(fieldDataQuarter4);
        org.junit.Assert.assertNull(fieldDataQuarter5);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0255");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readSipData("out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.", "NONE");
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0256");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getDividendYr();
        double[] doubleArray8 = incSheetFileData5.getAdjToIncQtr();
        java.lang.String str9 = incSheetFileData5.getSector();
        double[] doubleArray10 = incSheetFileData5.getEpsContYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0257");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.find("52 Q97\r\n  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        org.junit.Assert.assertNull(sharesFileData1);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0258");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double1 = estimateFileData0.getEpsQ1();
        java.lang.String str2 = estimateFileData0.getSector();
        double double3 = estimateFileData0.getEpsQ0();
        net.ajaskey.common.DateTime dateTime4 = estimateFileData0.getCurrFiscalYear();
        double double5 = estimateFileData0.getEpsY1();
        java.lang.String str6 = estimateFileData0.getTicker();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(dateTime4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0259");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double1 = estimateFileData0.getEpsQ1();
        java.lang.String str2 = estimateFileData0.getSector();
        double double3 = estimateFileData0.getEpsQ0();
        java.lang.String str4 = estimateFileData0.getSector();
        double double5 = estimateFileData0.getEpsY2();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0260");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getGrossOpIncQtr();
        double[] doubleArray8 = incSheetFileData5.getGrossOpIncYr();
        double[] doubleArray9 = incSheetFileData5.getGrossOpIncQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0261");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getStDebtQtr();
        java.lang.String str2 = balSheetFileData0.getTicker();
        double[] doubleArray3 = balSheetFileData0.getTotalLiabQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(doubleArray3);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0262");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        java.lang.String str8 = companyFileData7.getDowIndexStr();
        java.lang.String str9 = companyFileData7.getTicker();
        companyFileData7.setName("null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000");
        java.lang.String str12 = companyFileData7.getCity();
        java.lang.String str13 = companyFileData7.getPhone();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0263");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        int int8 = companyFileData7.getNumEmployees();
        companyFileData7.setCountry("hi!");
        companyFileData7.setPhone("52 Q97\r\n  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0264");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) 'a', (int) (byte) 1);
        boolean boolean3 = fieldData2.isDataValid();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData4 = fieldData2.getIncSheetData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData5 = fieldData2.getEstimateData();
        net.ajaskey.common.DateTime dateTime6 = estimateFileData5.getCurrFiscalYear();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(incSheetFileData4);
        org.junit.Assert.assertNotNull(estimateFileData5);
        org.junit.Assert.assertNull(dateTime6);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0265");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        companyFileData7.setState("out/BigDB/");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData10 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double11 = estimateFileData10.getEpsQ1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData12 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData13 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData12);
        sharesFileData13.setInstOwnership("NONE");
        double[] doubleArray20 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData13.setSharesY(doubleArray20);
        java.lang.String str22 = sharesFileData13.getTicker();
        sharesFileData13.setFloatshr("NONE");
        sharesFileData13.setVolume3m("hi!");
        java.lang.String[] strArray29 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData32 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList30);
        double[] doubleArray33 = incSheetFileData32.getNonrecurringItemsQtr();
        double[] doubleArray34 = incSheetFileData32.getDividendYr();
        double[] doubleArray35 = incSheetFileData32.getEpsContQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData36 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray37 = balSheetFileData36.getOtherLtLiabYr();
        double[] doubleArray38 = balSheetFileData36.getCurrLiabYr();
        double[] doubleArray39 = balSheetFileData36.getAcctPayableQtr();
        double[] doubleArray40 = balSheetFileData36.getAcctPayableQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData41 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData42 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData41);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData45 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData7, estimateFileData10, sharesFileData13, incSheetFileData32, balSheetFileData36, cashFileData41, 100, (int) 'a');
        double[] doubleArray46 = null;
        sharesFileData13.setSharesQ(doubleArray46);
        double double48 = sharesFileData13.getDollar3m();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(incSheetFileData32);
        org.junit.Assert.assertNull(doubleArray33);
        org.junit.Assert.assertNull(doubleArray34);
        org.junit.Assert.assertNull(doubleArray35);
        org.junit.Assert.assertNull(doubleArray37);
        org.junit.Assert.assertNull(doubleArray38);
        org.junit.Assert.assertNull(doubleArray39);
        org.junit.Assert.assertNull(doubleArray40);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0266");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getGrossOpIncQtr();
        double[] doubleArray8 = incSheetFileData5.getIncTaxYr();
        double[] doubleArray9 = incSheetFileData5.getEpsContYr();
        double[] doubleArray10 = incSheetFileData5.getEpsDilQtr();
        double[] doubleArray11 = incSheetFileData5.getEpsYr();
        double[] doubleArray12 = incSheetFileData5.getDepreciationYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0267");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean3 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.parseSipData(0, (int) (short) 1, filetypeEnum2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0268");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        java.lang.String str10 = sharesFileData1.getTicker();
        sharesFileData1.setFloatshr("NONE");
        sharesFileData1.setVolume3m("hi!");
        int int15 = sharesFileData1.getInsiderBuyShrs();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0269");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getGrossOpIncQtr();
        double[] doubleArray8 = incSheetFileData5.getDepreciationYr();
        double[] doubleArray9 = incSheetFileData5.getDepreciationQtr();
        java.lang.String str10 = incSheetFileData5.getSector();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0270");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsYr();
        double[] doubleArray7 = incSheetFileData5.getSalesYr();
        double[] doubleArray8 = incSheetFileData5.getEpsContQtr();
        double[] doubleArray9 = incSheetFileData5.getCogsQtr();
        double[] doubleArray10 = incSheetFileData5.getIntExpNonOpQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0271");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        sharesFileData1.setDollar3m("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        sharesFileData1.setInstSellShrs("null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000");
        double double14 = sharesFileData1.getInstOwnership();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0272");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        int int8 = companyFileData7.getNumEmployees();
        companyFileData7.setStreet("");
        java.lang.String str11 = companyFileData7.getCountry();
        companyFileData7.setTicker("");
        companyFileData7.setName("null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0273");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        java.lang.String str8 = companyFileData7.getDowIndexStr();
        java.lang.String str9 = companyFileData7.getTicker();
        java.lang.String str10 = companyFileData7.getSector();
        java.lang.String str11 = companyFileData7.getName();
        java.lang.String str12 = companyFileData7.getZip();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum13 = companyFileData7.getExchange();
        java.lang.String str14 = companyFileData7.getPhone();
        companyFileData7.setCity("");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(exchEnum13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0274");
        java.lang.String[] strArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(strArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0275");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear(6);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0276");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear((int) (byte) 10);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter2 = fieldDataYear1.getQ2();
        org.junit.Assert.assertNull(fieldDataQuarter2);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0277");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getQFromDb((int) (byte) 10, (int) '#', filetypeEnum2);
        org.junit.Assert.assertNotNull(fieldDataList3);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0278");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getStInvestYr();
        double[] doubleArray3 = balSheetFileData0.getTotalAssetsQtr();
        double[] doubleArray4 = balSheetFileData0.getOtherLtLiabQtr();
        double[] doubleArray5 = balSheetFileData0.getTotalAssetsYr();
        double[] doubleArray6 = balSheetFileData0.getOtherLtLiabQtr();
        double[] doubleArray7 = balSheetFileData0.getGoodwillYr();
        double[] doubleArray8 = balSheetFileData0.getStDebtQtr();
        java.lang.String str9 = balSheetFileData0.getSector();
        double[] doubleArray10 = balSheetFileData0.getOtherCurrLiabQtr();
        double[] doubleArray11 = balSheetFileData0.getStInvestQtr();
        double[] doubleArray12 = balSheetFileData0.getTotalLiabQtr();
        double[] doubleArray13 = balSheetFileData0.getOtherCurrAssetsQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0279");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        sharesFileData1.setDollar3m("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        sharesFileData1.setInstSellShrs("null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000");
        int int14 = sharesFileData1.getInsiderBuyShrs();
        sharesFileData1.setMktCap("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0280");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getStInvestYr();
        double[] doubleArray3 = balSheetFileData0.getTotalAssetsQtr();
        double[] doubleArray4 = balSheetFileData0.getOtherLtLiabQtr();
        double[] doubleArray5 = balSheetFileData0.getTotalAssetsYr();
        double[] doubleArray6 = balSheetFileData0.getOtherLtLiabQtr();
        double[] doubleArray7 = balSheetFileData0.getGoodwillYr();
        double[] doubleArray8 = balSheetFileData0.getBvpsYr();
        double[] doubleArray9 = balSheetFileData0.getLtDebtYr();
        java.lang.String str10 = balSheetFileData0.getIndustry();
        double[] doubleArray11 = balSheetFileData0.getOtherLtAssetsQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0281");
        java.lang.String str4 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getOutfileName((int) (byte) 1, (int) (byte) 0, "out/BigDB/52/Q1/out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.-fundamental-data-52Q1.", "NONE");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "out/BigDB/1/Q0/out/BigDB/52/Q1/out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.-fundamental-data-52Q1.-fundamental-data-1Q0.NONE" + "'", str4, "out/BigDB/1/Q0/out/BigDB/52/Q1/out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.-fundamental-data-52Q1.-fundamental-data-1Q0.NONE");
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0282");
        java.lang.String[] strArray4 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter12 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter(100, (int) ' ', fieldDataList11);
        int int13 = fieldDataQuarter12.getYear();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(incSheetFileData7);
        org.junit.Assert.assertNotNull(estimateFileData8);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0283");
        java.lang.String str4 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getOutfileName((int) (byte) 100, (int) (byte) 100, "Cash File Data", "NONE");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "out/BigDB/100/Q100/Cash File Data-fundamental-data-100Q100.NONE" + "'", str4, "out/BigDB/100/Q100/Cash File Data-fundamental-data-100Q100.NONE");
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0284");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getStInvestYr();
        double[] doubleArray3 = balSheetFileData0.getTotalAssetsQtr();
        double[] doubleArray4 = balSheetFileData0.getOtherLtLiabQtr();
        double[] doubleArray5 = balSheetFileData0.getGoodwillQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0285");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getUnusualIncQtr();
        java.lang.String str8 = incSheetFileData5.getTicker();
        double[] doubleArray9 = incSheetFileData5.getEpsDilYr();
        java.lang.String str10 = incSheetFileData5.toDbOutput();
        double[] doubleArray11 = incSheetFileData5.getDepreciationYr();
        double[] doubleArray12 = incSheetFileData5.getAdjToIncYr();
        double[] doubleArray13 = incSheetFileData5.getDividendQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0286");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getStInvestYr();
        double[] doubleArray3 = balSheetFileData0.getTotalAssetsQtr();
        double[] doubleArray4 = balSheetFileData0.getOtherLtLiabQtr();
        double[] doubleArray5 = balSheetFileData0.getOtherCurrAssetsYr();
        double[] doubleArray6 = balSheetFileData0.getTotalLiabYr();
        java.lang.String str7 = balSheetFileData0.toDbOutput();
        java.lang.String str8 = balSheetFileData0.getTicker();
        double[] doubleArray9 = balSheetFileData0.getEquityQtr();
        double[] doubleArray10 = balSheetFileData0.getAcctRxQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0287");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        java.lang.String str8 = companyFileData7.getDowIndexStr();
        java.lang.String str9 = companyFileData7.getTicker();
        companyFileData7.setName("null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000");
        java.lang.String str12 = companyFileData7.getCity();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData13 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double14 = estimateFileData13.getEpsQ1();
        java.lang.String str15 = estimateFileData13.getSector();
        double double16 = estimateFileData13.getEpsQ1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData17 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData18 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData17);
        sharesFileData18.setInstOwnership("NONE");
        double[] doubleArray25 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData18.setSharesY(doubleArray25);
        double double27 = sharesFileData18.getMktCap();
        double[] doubleArray28 = null;
        sharesFileData18.setSharesQ(doubleArray28);
        java.lang.String[] strArray32 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData35 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList33);
        double[] doubleArray36 = incSheetFileData35.getEpsContQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData37 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray38 = balSheetFileData37.getOtherLtLiabYr();
        double[] doubleArray39 = balSheetFileData37.getStInvestYr();
        double[] doubleArray40 = balSheetFileData37.getTotalAssetsQtr();
        double[] doubleArray41 = balSheetFileData37.getOtherLtLiabQtr();
        double[] doubleArray42 = balSheetFileData37.getTotalAssetsYr();
        double[] doubleArray43 = balSheetFileData37.getOtherLtLiabQtr();
        double[] doubleArray44 = balSheetFileData37.getGoodwillYr();
        double[] doubleArray45 = balSheetFileData37.getStDebtQtr();
        java.lang.String str46 = balSheetFileData37.getSector();
        double[] doubleArray47 = balSheetFileData37.getOtherCurrLiabQtr();
        double[] doubleArray48 = balSheetFileData37.getStInvestQtr();
        java.lang.String str49 = balSheetFileData37.getTicker();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData50 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData51 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData50);
        java.lang.String str52 = cashFileData51.getTicker();
        java.lang.String str53 = cashFileData51.getTicker();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData54 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData51);
        java.lang.String str55 = cashFileData54.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData58 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData7, estimateFileData13, sharesFileData18, incSheetFileData35, balSheetFileData37, cashFileData54, (int) '4', 10);
        double double59 = estimateFileData13.getEpsY1();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(incSheetFileData35);
        org.junit.Assert.assertNull(doubleArray36);
        org.junit.Assert.assertNull(doubleArray38);
        org.junit.Assert.assertNull(doubleArray39);
        org.junit.Assert.assertNull(doubleArray40);
        org.junit.Assert.assertNull(doubleArray41);
        org.junit.Assert.assertNull(doubleArray42);
        org.junit.Assert.assertNull(doubleArray43);
        org.junit.Assert.assertNull(doubleArray44);
        org.junit.Assert.assertNull(doubleArray45);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNull(doubleArray47);
        org.junit.Assert.assertNull(doubleArray48);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.0d + "'", double59 == 0.0d);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0288");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        java.lang.String str8 = companyFileData7.getDowIndexStr();
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum9 = companyFileData7.getSnpIndex();
        companyFileData7.setName("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        companyFileData7.setCountry("data/BigDB/");
        java.lang.String str14 = companyFileData7.getDowIndexStr();
        companyFileData7.setSnpIndex("Data for  from 52 Q97\r\n  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum17 = companyFileData7.getDowIndex();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(snpEnum9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(dowEnum17);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0289");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        int int8 = companyFileData7.getNumEmployees();
        companyFileData7.setCountry("hi!");
        int int11 = companyFileData7.getNumEmployees();
        java.lang.String str12 = companyFileData7.getIndustry();
        java.lang.Class<?> wildcardClass13 = companyFileData7.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0290");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double[] doubleArray2 = sharesFileData1.getSharesYr();
        java.lang.String str3 = sharesFileData1.toString();
        sharesFileData1.setInsiderOwnership("out/BigDB/");
        sharesFileData1.setInsiderNetTrades("Data for  from 52 Q97\r\n  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        double double8 = sharesFileData1.getInsiderNetPercentOutstanding();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0291");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear((int) (short) 1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter3 = fieldDataYear1.getQ(10);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter5 = fieldDataYear1.getQ((int) (short) 100);
        boolean boolean6 = fieldDataYear1.isInUse();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter7 = fieldDataYear1.getQ2();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter8 = fieldDataYear1.getQ3();
        org.junit.Assert.assertNull(fieldDataQuarter3);
        org.junit.Assert.assertNull(fieldDataQuarter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(fieldDataQuarter7);
        org.junit.Assert.assertNull(fieldDataQuarter8);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0292");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) 'a', (int) (byte) 1);
        boolean boolean3 = fieldData2.isDataValid();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData4 = fieldData2.getIncSheetData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData5 = fieldData2.getEstimateData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData6 = fieldData2.getBalSheetData();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(incSheetFileData4);
        org.junit.Assert.assertNotNull(estimateFileData5);
        org.junit.Assert.assertNotNull(balSheetFileData6);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0293");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        java.lang.String str8 = companyFileData7.getDowIndexStr();
        java.lang.String str9 = companyFileData7.getTicker();
        java.lang.String str10 = companyFileData7.getSector();
        java.lang.String str11 = companyFileData7.getName();
        double[] doubleArray12 = companyFileData7.getPriceQtr();
        companyFileData7.setZip("out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(doubleArray12);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0294");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear((int) (short) 1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter3 = fieldDataYear1.getQ(10);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter5 = fieldDataYear1.getQ((int) (short) 100);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter6 = fieldDataYear1.getQ1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter7 = fieldDataYear1.getQ4();
        org.junit.Assert.assertNull(fieldDataQuarter3);
        org.junit.Assert.assertNull(fieldDataQuarter5);
        org.junit.Assert.assertNull(fieldDataQuarter6);
        org.junit.Assert.assertNull(fieldDataQuarter7);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0295");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double1 = estimateFileData0.getEpsQ1();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum2 = estimateFileData0.getExchange();
        java.lang.String str3 = estimateFileData0.getIndustry();
        java.lang.String str4 = estimateFileData0.getIndustry();
        java.lang.String str5 = estimateFileData0.toDbOutput();
        java.lang.String[] strArray8 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData11 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList9);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData12 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList9);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData13 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList9);
        estimateFileData0.setNameFields(companyFileData13);
        java.lang.String str15 = companyFileData13.getState();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(exchEnum2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(incSheetFileData11);
        org.junit.Assert.assertNotNull(estimateFileData12);
        org.junit.Assert.assertNotNull(companyFileData13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0296");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getStInvestYr();
        double[] doubleArray3 = balSheetFileData0.getLtInvestYr();
        double[] doubleArray4 = balSheetFileData0.getAcctRxYr();
        double[] doubleArray5 = balSheetFileData0.getOtherLtAssetsYr();
        java.lang.String str6 = balSheetFileData0.toString();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0297");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getPrefStockQtr();
        double[] doubleArray3 = balSheetFileData0.getTotalAssetsYr();
        double[] doubleArray4 = balSheetFileData0.getBvpsYr();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = doubleArray4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0298");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsYr();
        double[] doubleArray7 = incSheetFileData5.getDepreciationYr();
        double[] doubleArray8 = incSheetFileData5.getCogsQtr();
        java.lang.String[] strArray11 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData15 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData16 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        java.lang.String str17 = companyFileData16.getDowIndexStr();
        incSheetFileData5.setNameFields(companyFileData16);
        double[] doubleArray19 = incSheetFileData5.getAdjToIncYr();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum20 = incSheetFileData5.getExchange();
        double[] doubleArray21 = incSheetFileData5.getEpsContQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNotNull(estimateFileData15);
        org.junit.Assert.assertNotNull(companyFileData16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(exchEnum20);
        org.junit.Assert.assertNull(doubleArray21);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0299");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getDividendYr();
        double[] doubleArray8 = incSheetFileData5.getEpsContQtr();
        double[] doubleArray9 = incSheetFileData5.getSalesYr();
        double[] doubleArray10 = incSheetFileData5.getIntExpNonOpQtr();
        double[] doubleArray11 = incSheetFileData5.getNonrecurringItemsQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0300");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData0);
        java.lang.String str2 = cashFileData1.getTicker();
        java.lang.String str3 = cashFileData1.toString();
        java.lang.String str4 = cashFileData1.getTicker();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData1);
        double[] doubleArray6 = cashFileData5.getCashFromFinQtr();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Cash File Data" + "'", str3, "Cash File Data");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0301");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        sharesFileData1.setDollar3m("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        sharesFileData1.setInstSellShrs("null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000");
        double double14 = sharesFileData1.getPrice52lo();
        sharesFileData1.setPrice("out/BigDB/52/Q1/out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.-fundamental-data-52Q1.");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0302");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        java.lang.String str4 = sharesFileData1.getName();
        double double5 = sharesFileData1.getPrice();
        sharesFileData1.setVolume10d("hi!");
        sharesFileData1.setPrice("out/BigDB/");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0303");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        sharesFileData1.setDollar3m("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        java.lang.String str12 = sharesFileData1.getTicker();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0304");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) '4', (int) 'a');
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = fieldData2.getIncSheetData();
        double[] doubleArray4 = incSheetFileData3.getAdjToIncQtr();
        java.lang.String str5 = incSheetFileData3.getSector();
        org.junit.Assert.assertNotNull(incSheetFileData3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0305");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getCurrLiabYr();
        double[] doubleArray3 = balSheetFileData0.getCurrLiabYr();
        double[] doubleArray4 = balSheetFileData0.getCurrAssetsYr();
        double[] doubleArray5 = balSheetFileData0.getCashQtr();
        double[] doubleArray6 = balSheetFileData0.getPrefStockYr();
        double[] doubleArray7 = balSheetFileData0.getOtherCurrAssetsYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0306");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        java.lang.String str10 = sharesFileData1.getTicker();
        sharesFileData1.setFloatshr("NONE");
        sharesFileData1.setVolume3m("hi!");
        int int15 = sharesFileData1.getInsiderBuys();
        sharesFileData1.setBeta("NONE");
        java.lang.String str18 = sharesFileData1.getTicker();
        double double19 = sharesFileData1.getPrice52hi();
        double[] doubleArray20 = sharesFileData1.getSharesQtr();
        sharesFileData1.setFromReport(0, (int) (byte) -1);
        sharesFileData1.setInsiderNetPercentOutstanding("52 Q97\r\n  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNull(doubleArray20);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0307");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double1 = estimateFileData0.getEpsQ1();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum2 = estimateFileData0.getExchange();
        java.lang.String str3 = estimateFileData0.getIndustry();
        java.lang.String str4 = estimateFileData0.getIndustry();
        java.lang.String str5 = estimateFileData0.toDbOutput();
        java.lang.String[] strArray8 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData11 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList9);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData12 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList9);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData13 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList9);
        estimateFileData0.setNameFields(companyFileData13);
        companyFileData13.setState("");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(exchEnum2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(incSheetFileData11);
        org.junit.Assert.assertNotNull(estimateFileData12);
        org.junit.Assert.assertNotNull(companyFileData13);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0308");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear((int) (short) 1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter3 = fieldDataYear1.getQ(10);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter5 = fieldDataYear1.getQ((int) (short) 100);
        int int6 = fieldDataYear1.getYear();
        org.junit.Assert.assertNull(fieldDataQuarter3);
        org.junit.Assert.assertNull(fieldDataQuarter5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0309");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getGrossIncQtr();
        double[] doubleArray8 = incSheetFileData5.getSalesYr();
        double[] doubleArray9 = incSheetFileData5.getOtherIncYr();
        double[] doubleArray10 = incSheetFileData5.getNetIncQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0310");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getPrefStockQtr();
        double[] doubleArray3 = balSheetFileData0.getTotalAssetsYr();
        double[] doubleArray4 = balSheetFileData0.getOtherLtLiabYr();
        java.lang.String str5 = balSheetFileData0.getName();
        double[] doubleArray6 = balSheetFileData0.getOtherCurrAssetsYr();
        double[] doubleArray7 = balSheetFileData0.getStInvestYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0311");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        java.lang.String str8 = companyFileData7.getDowIndexStr();
        java.lang.String str9 = companyFileData7.getTicker();
        companyFileData7.setName("null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000");
        java.lang.String str12 = companyFileData7.getCity();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData13 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double14 = estimateFileData13.getEpsQ1();
        java.lang.String str15 = estimateFileData13.getSector();
        double double16 = estimateFileData13.getEpsQ1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData17 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData18 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData17);
        sharesFileData18.setInstOwnership("NONE");
        double[] doubleArray25 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData18.setSharesY(doubleArray25);
        double double27 = sharesFileData18.getMktCap();
        double[] doubleArray28 = null;
        sharesFileData18.setSharesQ(doubleArray28);
        java.lang.String[] strArray32 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData35 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList33);
        double[] doubleArray36 = incSheetFileData35.getEpsContQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData37 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray38 = balSheetFileData37.getOtherLtLiabYr();
        double[] doubleArray39 = balSheetFileData37.getStInvestYr();
        double[] doubleArray40 = balSheetFileData37.getTotalAssetsQtr();
        double[] doubleArray41 = balSheetFileData37.getOtherLtLiabQtr();
        double[] doubleArray42 = balSheetFileData37.getTotalAssetsYr();
        double[] doubleArray43 = balSheetFileData37.getOtherLtLiabQtr();
        double[] doubleArray44 = balSheetFileData37.getGoodwillYr();
        double[] doubleArray45 = balSheetFileData37.getStDebtQtr();
        java.lang.String str46 = balSheetFileData37.getSector();
        double[] doubleArray47 = balSheetFileData37.getOtherCurrLiabQtr();
        double[] doubleArray48 = balSheetFileData37.getStInvestQtr();
        java.lang.String str49 = balSheetFileData37.getTicker();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData50 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData51 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData50);
        java.lang.String str52 = cashFileData51.getTicker();
        java.lang.String str53 = cashFileData51.getTicker();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData54 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData51);
        java.lang.String str55 = cashFileData54.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData58 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData7, estimateFileData13, sharesFileData18, incSheetFileData35, balSheetFileData37, cashFileData54, (int) '4', 10);
        java.lang.String str59 = estimateFileData13.getIndustry();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(incSheetFileData35);
        org.junit.Assert.assertNull(doubleArray36);
        org.junit.Assert.assertNull(doubleArray38);
        org.junit.Assert.assertNull(doubleArray39);
        org.junit.Assert.assertNull(doubleArray40);
        org.junit.Assert.assertNull(doubleArray41);
        org.junit.Assert.assertNull(doubleArray42);
        org.junit.Assert.assertNull(doubleArray43);
        org.junit.Assert.assertNull(doubleArray44);
        org.junit.Assert.assertNull(doubleArray45);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNull(doubleArray47);
        org.junit.Assert.assertNull(doubleArray48);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNull(str59);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0312");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readSipData("out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0313");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        int int10 = sharesFileData1.getInsiderSells();
        sharesFileData1.setInsiderSells("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        java.lang.String[] strArray15 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData18 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList16);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData19 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList16);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList16);
        companyFileData20.setState("out/BigDB/");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData23 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double24 = estimateFileData23.getEpsQ1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData25 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData26 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData25);
        sharesFileData26.setInstOwnership("NONE");
        double[] doubleArray33 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData26.setSharesY(doubleArray33);
        java.lang.String str35 = sharesFileData26.getTicker();
        sharesFileData26.setFloatshr("NONE");
        sharesFileData26.setVolume3m("hi!");
        java.lang.String[] strArray42 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData45 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList43);
        double[] doubleArray46 = incSheetFileData45.getNonrecurringItemsQtr();
        double[] doubleArray47 = incSheetFileData45.getDividendYr();
        double[] doubleArray48 = incSheetFileData45.getEpsContQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData49 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray50 = balSheetFileData49.getOtherLtLiabYr();
        double[] doubleArray51 = balSheetFileData49.getCurrLiabYr();
        double[] doubleArray52 = balSheetFileData49.getAcctPayableQtr();
        double[] doubleArray53 = balSheetFileData49.getAcctPayableQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData54 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData55 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData54);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData58 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData20, estimateFileData23, sharesFileData26, incSheetFileData45, balSheetFileData49, cashFileData54, 100, (int) 'a');
        sharesFileData1.setNameFields(companyFileData20);
        sharesFileData1.setPrice("52 Q97\r\n  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        sharesFileData1.setPrice("NONE");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(incSheetFileData18);
        org.junit.Assert.assertNotNull(estimateFileData19);
        org.junit.Assert.assertNotNull(companyFileData20);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(incSheetFileData45);
        org.junit.Assert.assertNull(doubleArray46);
        org.junit.Assert.assertNull(doubleArray47);
        org.junit.Assert.assertNull(doubleArray48);
        org.junit.Assert.assertNull(doubleArray50);
        org.junit.Assert.assertNull(doubleArray51);
        org.junit.Assert.assertNull(doubleArray52);
        org.junit.Assert.assertNull(doubleArray53);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0314");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsYr();
        double[] doubleArray7 = incSheetFileData5.getDepreciationYr();
        double[] doubleArray8 = incSheetFileData5.getDividendQtr();
        double[] doubleArray9 = incSheetFileData5.getCogsQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0315");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getLtInvestYr();
        java.lang.String str3 = balSheetFileData0.getSector();
        double[] doubleArray4 = balSheetFileData0.getLtDebtQtr();
        double[] doubleArray5 = balSheetFileData0.getCashQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0316");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getRdYr();
        double[] doubleArray8 = incSheetFileData5.getUnusualIncQtr();
        java.lang.String str9 = incSheetFileData5.getSector();
        double[] doubleArray10 = incSheetFileData5.getIncAfterTaxQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0317");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData10 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertNotNull(cashFileData8);
        org.junit.Assert.assertNotNull(estimateFileData9);
        org.junit.Assert.assertNotNull(incSheetFileData10);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0318");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        int int10 = sharesFileData1.getInsiderSells();
        sharesFileData1.setInsiderSells("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        java.lang.String[] strArray15 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData18 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList16);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData19 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList16);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList16);
        companyFileData20.setState("out/BigDB/");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData23 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double24 = estimateFileData23.getEpsQ1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData25 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData26 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData25);
        sharesFileData26.setInstOwnership("NONE");
        double[] doubleArray33 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData26.setSharesY(doubleArray33);
        java.lang.String str35 = sharesFileData26.getTicker();
        sharesFileData26.setFloatshr("NONE");
        sharesFileData26.setVolume3m("hi!");
        java.lang.String[] strArray42 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData45 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList43);
        double[] doubleArray46 = incSheetFileData45.getNonrecurringItemsQtr();
        double[] doubleArray47 = incSheetFileData45.getDividendYr();
        double[] doubleArray48 = incSheetFileData45.getEpsContQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData49 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray50 = balSheetFileData49.getOtherLtLiabYr();
        double[] doubleArray51 = balSheetFileData49.getCurrLiabYr();
        double[] doubleArray52 = balSheetFileData49.getAcctPayableQtr();
        double[] doubleArray53 = balSheetFileData49.getAcctPayableQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData54 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData55 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData54);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData58 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData20, estimateFileData23, sharesFileData26, incSheetFileData45, balSheetFileData49, cashFileData54, 100, (int) 'a');
        sharesFileData1.setNameFields(companyFileData20);
        companyFileData20.setWeb("52 Q97\r\n  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        companyFileData20.setStreet("data/BigDB/");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(incSheetFileData18);
        org.junit.Assert.assertNotNull(estimateFileData19);
        org.junit.Assert.assertNotNull(companyFileData20);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(incSheetFileData45);
        org.junit.Assert.assertNull(doubleArray46);
        org.junit.Assert.assertNull(doubleArray47);
        org.junit.Assert.assertNull(doubleArray48);
        org.junit.Assert.assertNull(doubleArray50);
        org.junit.Assert.assertNull(doubleArray51);
        org.junit.Assert.assertNull(doubleArray52);
        org.junit.Assert.assertNull(doubleArray53);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0319");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        boolean boolean1 = companyFileData0.isAdr();
        java.lang.String str2 = companyFileData0.toString();
        java.lang.String str3 = companyFileData0.getWeb();
        java.lang.String str4 = companyFileData0.getName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0320");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getStDebtQtr();
        double[] doubleArray2 = balSheetFileData0.getTotalLiabYr();
        double[] doubleArray3 = balSheetFileData0.getInventoryYr();
        double[] doubleArray4 = balSheetFileData0.getGoodwillQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0321");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getFromMemory("", 0, (int) ' ');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0322");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        int int4 = sharesFileData1.getInsiderBuys();
        double double5 = sharesFileData1.getDollar3m();
        sharesFileData1.setBeta("out/BigDB/");
        sharesFileData1.setInstShareholders("data/BigDB/");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0323");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getDividendYr();
        double[] doubleArray8 = incSheetFileData5.getAdjToIncQtr();
        java.lang.String str9 = incSheetFileData5.getSector();
        double[] doubleArray10 = incSheetFileData5.getGrossIncQtr();
        double[] doubleArray11 = incSheetFileData5.getNonrecurringItemsQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0324");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readSipData("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.", "out/BigDB/52/Q1/out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.-fundamental-data-52Q1.");
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0325");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        int int8 = companyFileData7.getNumEmployees();
        companyFileData7.setStreet("");
        java.lang.String str11 = companyFileData7.getCountry();
        companyFileData7.setTicker("");
        companyFileData7.setIndustry("out/BigDB/");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0326");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        sharesFileData1.setDollar3m("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        long long12 = sharesFileData1.getVolume10d();
        double double13 = sharesFileData1.getPrice52lo();
        sharesFileData1.setInstSellShrs("out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        double double16 = sharesFileData1.getMktCap();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0327");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getStInvestYr();
        double[] doubleArray3 = balSheetFileData0.getTotalAssetsQtr();
        double[] doubleArray4 = balSheetFileData0.getOtherLtLiabQtr();
        double[] doubleArray5 = balSheetFileData0.getOtherCurrAssetsYr();
        double[] doubleArray6 = balSheetFileData0.getStDebtYr();
        double[] doubleArray7 = balSheetFileData0.getAcctRxQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0328");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        sharesFileData1.setFloatshr("out/BigDB/");
        java.lang.String str6 = sharesFileData1.getSector();
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0329");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getCurrLiabYr();
        double[] doubleArray3 = balSheetFileData0.getAcctPayableQtr();
        double[] doubleArray4 = balSheetFileData0.getAcctPayableQtr();
        double[] doubleArray5 = balSheetFileData0.getTotalAssetsYr();
        java.lang.String str6 = balSheetFileData0.toString();
        java.lang.String[] strArray9 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData12 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList10);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData13 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList10);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList10);
        java.lang.String str15 = companyFileData14.getDowIndexStr();
        companyFileData14.setZip("data/BigDB/");
        java.lang.String str18 = companyFileData14.getName();
        balSheetFileData0.setNameFields(companyFileData14);
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(incSheetFileData12);
        org.junit.Assert.assertNotNull(estimateFileData13);
        org.junit.Assert.assertNotNull(companyFileData14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0330");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getStInvestYr();
        double[] doubleArray3 = balSheetFileData0.getTotalAssetsQtr();
        double[] doubleArray4 = balSheetFileData0.getOtherLtLiabQtr();
        double[] doubleArray5 = balSheetFileData0.getTotalAssetsYr();
        double[] doubleArray6 = balSheetFileData0.getOtherLtLiabQtr();
        double[] doubleArray7 = balSheetFileData0.getGoodwillYr();
        double[] doubleArray8 = balSheetFileData0.getStDebtQtr();
        java.lang.String str9 = balSheetFileData0.getSector();
        double[] doubleArray10 = balSheetFileData0.getOtherCurrLiabQtr();
        double[] doubleArray11 = balSheetFileData0.getLtInvestYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0331");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getPrefStockQtr();
        double[] doubleArray3 = balSheetFileData0.getLtDebtQtr();
        double[] doubleArray4 = balSheetFileData0.getNetFixedAssetsYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0332");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getStInvestYr();
        double[] doubleArray3 = balSheetFileData0.getTotalAssetsQtr();
        double[] doubleArray4 = balSheetFileData0.getOtherLtLiabQtr();
        double[] doubleArray5 = balSheetFileData0.getTotalAssetsYr();
        double[] doubleArray6 = balSheetFileData0.getOtherLtLiabQtr();
        double[] doubleArray7 = balSheetFileData0.getGoodwillYr();
        double[] doubleArray8 = balSheetFileData0.getStDebtQtr();
        java.lang.String str9 = balSheetFileData0.getSector();
        double[] doubleArray10 = balSheetFileData0.getOtherCurrLiabQtr();
        double[] doubleArray11 = balSheetFileData0.getStInvestQtr();
        double[] doubleArray12 = balSheetFileData0.getOtherLtAssetsQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0333");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsYr();
        double[] doubleArray7 = incSheetFileData5.getSalesYr();
        double[] doubleArray8 = incSheetFileData5.getEpsContQtr();
        double[] doubleArray9 = incSheetFileData5.getEpsDilContYr();
        double[] doubleArray10 = incSheetFileData5.getEpsDilContYr();
        java.lang.String str11 = incSheetFileData5.getIndustry();
        double[] doubleArray12 = incSheetFileData5.getIncAfterTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData13 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData5);
        double[] doubleArray14 = incSheetFileData13.getUnusualIncQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray14);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0334");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getCogsQtr();
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0335");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        int int8 = companyFileData7.getNumEmployees();
        companyFileData7.setCountry("hi!");
        int int11 = companyFileData7.getNumEmployees();
        java.lang.String[] strArray14 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData17 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData18 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList15);
        java.util.List<java.lang.String> strList19 = companyFileData7.set((java.util.List<java.lang.String>) strList15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb(strList19);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData21 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb(strList19);
        double[] doubleArray22 = incSheetFileData21.getEpsYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(incSheetFileData17);
        org.junit.Assert.assertNotNull(estimateFileData18);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(sharesFileData20);
        org.junit.Assert.assertNotNull(incSheetFileData21);
        org.junit.Assert.assertNull(doubleArray22);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0336");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getStInvestYr();
        double[] doubleArray3 = balSheetFileData0.getTotalAssetsQtr();
        double[] doubleArray4 = balSheetFileData0.getOtherLtLiabQtr();
        double[] doubleArray5 = balSheetFileData0.getOtherCurrAssetsYr();
        double[] doubleArray6 = balSheetFileData0.getCashQtr();
        double[] doubleArray7 = balSheetFileData0.getOtherLtAssetsQtr();
        double[] doubleArray8 = balSheetFileData0.getTotalAssetsYr();
        double[] doubleArray9 = balSheetFileData0.getLiabEquityYr();
        double[] doubleArray10 = balSheetFileData0.getCashQtr();
        java.lang.String str11 = balSheetFileData0.getTicker();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0337");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getCurrLiabYr();
        double[] doubleArray3 = balSheetFileData0.getCurrLiabYr();
        java.lang.String str4 = balSheetFileData0.getIndustry();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0338");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        java.lang.String str4 = sharesFileData1.getName();
        int int5 = sharesFileData1.getInsiderBuyShrs();
        sharesFileData1.setInsiderSellShrs("null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000");
        int int8 = sharesFileData1.getInstSellShrs();
        sharesFileData1.setPrice("");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0339");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getCurrLiabYr();
        java.lang.String str3 = balSheetFileData0.getName();
        double[] doubleArray4 = balSheetFileData0.getAcctRxQtr();
        double[] doubleArray5 = balSheetFileData0.getAcctPayableYr();
        double[] doubleArray6 = balSheetFileData0.getLtDebtYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0340");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        int int8 = companyFileData7.getNumEmployees();
        companyFileData7.setCountry("hi!");
        int int11 = companyFileData7.getNumEmployees();
        double[] doubleArray12 = companyFileData7.getPriceQtr();
        companyFileData7.setAdr("Data for  from 52 Q97\r\n  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        java.lang.String str15 = companyFileData7.getPhone();
        java.lang.String str16 = companyFileData7.getIndustry();
        java.lang.String str17 = companyFileData7.getWeb();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0341");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsYr();
        double[] doubleArray7 = incSheetFileData5.getSalesYr();
        double[] doubleArray8 = incSheetFileData5.getEpsContQtr();
        double[] doubleArray9 = incSheetFileData5.getEpsDilContYr();
        double[] doubleArray10 = incSheetFileData5.getIncAfterTaxQtr();
        double[] doubleArray11 = incSheetFileData5.getEpsDilQtr();
        double[] doubleArray12 = incSheetFileData5.getNetIncYr();
        java.lang.String str13 = incSheetFileData5.getSector();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0342");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getIncAfterTaxYr();
        double[] doubleArray8 = incSheetFileData5.getIncTaxYr();
        java.lang.String str9 = incSheetFileData5.getTicker();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum10 = incSheetFileData5.getExchange();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(exchEnum10);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0343");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double[] doubleArray2 = sharesFileData1.getSharesYr();
        java.lang.String str3 = sharesFileData1.toString();
        sharesFileData1.setInsiderOwnership("out/BigDB/");
        double[] doubleArray6 = sharesFileData1.getSharesYr();
        double double7 = sharesFileData1.getInstOwnership();
        sharesFileData1.setInsiderBuys("out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0344");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getPrefStockQtr();
        double[] doubleArray3 = balSheetFileData0.getTotalAssetsYr();
        double[] doubleArray4 = balSheetFileData0.getOtherLtLiabYr();
        java.lang.String str5 = balSheetFileData0.getName();
        double[] doubleArray6 = balSheetFileData0.getOtherLtLiabYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0345");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getStInvestYr();
        double[] doubleArray3 = balSheetFileData0.getTotalAssetsQtr();
        double[] doubleArray4 = balSheetFileData0.getOtherLtLiabQtr();
        double[] doubleArray5 = balSheetFileData0.getOtherCurrAssetsYr();
        double[] doubleArray6 = balSheetFileData0.getStDebtYr();
        java.lang.String str7 = balSheetFileData0.getTicker();
        double[] doubleArray8 = balSheetFileData0.getOtherCurrAssetsQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0346");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        java.lang.String str10 = sharesFileData1.getTicker();
        sharesFileData1.setFloatshr("NONE");
        sharesFileData1.setVolume3m("hi!");
        java.lang.String str15 = sharesFileData1.getTicker();
        int int16 = sharesFileData1.getInstBuyShrs();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData1);
        long long18 = sharesFileData17.getVolume10d();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0347");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getStInvestYr();
        double[] doubleArray3 = balSheetFileData0.getTotalAssetsQtr();
        double[] doubleArray4 = balSheetFileData0.getOtherLtLiabQtr();
        double[] doubleArray5 = balSheetFileData0.getTotalAssetsYr();
        double[] doubleArray6 = balSheetFileData0.getOtherLtLiabQtr();
        double[] doubleArray7 = balSheetFileData0.getStInvestQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0348");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        java.lang.String str8 = companyFileData7.getDowIndexStr();
        companyFileData7.setZip("data/BigDB/");
        java.lang.String str11 = companyFileData7.getName();
        java.lang.String str12 = companyFileData7.getState();
        java.lang.String str13 = companyFileData7.toString();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0349");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getQFromMemory(32, (int) (short) 0);
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0350");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsYr();
        double[] doubleArray7 = incSheetFileData5.getDepreciationYr();
        double[] doubleArray8 = incSheetFileData5.getCogsQtr();
        java.lang.String[] strArray11 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData15 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData16 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        java.lang.String str17 = companyFileData16.getDowIndexStr();
        incSheetFileData5.setNameFields(companyFileData16);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData19 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData16);
        companyFileData19.setIndustry("out/BigDB/");
        java.lang.String str22 = companyFileData19.getSic();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNotNull(estimateFileData15);
        org.junit.Assert.assertNotNull(companyFileData16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0351");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str1 = estimateFileData0.getIndustry();
        java.lang.String str2 = estimateFileData0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000" + "'", str2, "null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000");
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0352");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readSipData("out/BigDB/100/Q100/Cash File Data-fundamental-data-100Q100.NONE");
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0353");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getCurrLiabYr();
        double[] doubleArray3 = balSheetFileData0.getAcctPayableQtr();
        double[] doubleArray4 = balSheetFileData0.getLiabEquityYr();
        double[] doubleArray5 = balSheetFileData0.getAcctPayableYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0354");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getStInvestYr();
        double[] doubleArray3 = balSheetFileData0.getTotalAssetsQtr();
        double[] doubleArray4 = balSheetFileData0.getOtherLtLiabQtr();
        double[] doubleArray5 = balSheetFileData0.getTotalAssetsYr();
        double[] doubleArray6 = balSheetFileData0.getInventoryYr();
        double[] doubleArray7 = balSheetFileData0.getCurrLiabQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0355");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getCurrLiabYr();
        java.lang.String str3 = balSheetFileData0.getName();
        double[] doubleArray4 = balSheetFileData0.getAcctRxQtr();
        double[] doubleArray5 = balSheetFileData0.getInventoryQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0356");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsYr();
        double[] doubleArray7 = incSheetFileData5.getSalesYr();
        double[] doubleArray8 = incSheetFileData5.getEpsContQtr();
        double[] doubleArray9 = incSheetFileData5.getEpsDilContYr();
        double[] doubleArray10 = incSheetFileData5.getEpsDilContYr();
        double[] doubleArray11 = incSheetFileData5.getEpsContYr();
        double[] doubleArray12 = incSheetFileData5.getUnusualIncQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0357");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getCurrLiabYr();
        java.lang.String str3 = balSheetFileData0.getName();
        double[] doubleArray4 = balSheetFileData0.getOtherCurrAssetsQtr();
        double[] doubleArray5 = balSheetFileData0.getLtInvestQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0358");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getPrefStockQtr();
        double[] doubleArray3 = balSheetFileData0.getTotalAssetsYr();
        double[] doubleArray4 = balSheetFileData0.getOtherLtLiabYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData5 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0359");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getUnusualIncQtr();
        java.lang.String str8 = incSheetFileData5.getTicker();
        double[] doubleArray9 = incSheetFileData5.getNonrecurringItemsYr();
        double[] doubleArray10 = incSheetFileData5.getCogsYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0360");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.find("");
        org.junit.Assert.assertNull(sharesFileData1);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0361");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getStInvestYr();
        double[] doubleArray3 = balSheetFileData0.getTotalAssetsQtr();
        double[] doubleArray4 = balSheetFileData0.getOtherLtLiabQtr();
        double[] doubleArray5 = balSheetFileData0.getTotalAssetsYr();
        double[] doubleArray6 = balSheetFileData0.getOtherLtLiabQtr();
        double[] doubleArray7 = balSheetFileData0.getGoodwillYr();
        double[] doubleArray8 = balSheetFileData0.getStDebtQtr();
        java.lang.String str9 = balSheetFileData0.getSector();
        double[] doubleArray10 = balSheetFileData0.getOtherCurrLiabQtr();
        double[] doubleArray11 = balSheetFileData0.getStInvestQtr();
        java.lang.String str12 = balSheetFileData0.getTicker();
        double[] doubleArray13 = balSheetFileData0.getCurrLiabQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(doubleArray13);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0362");
        java.lang.String[] strArray6 = new java.lang.String[] { "Data for  from 52 Q97\r\n  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n", "out/BigDB/52/Q1/out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.-fundamental-data-52Q1.", "Data for  from 52 Q97\r\n  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n", "out/BigDB/52/Q1/out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.-fundamental-data-52Q1.", "", "Data for  from 52 Q97\r\n  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0363");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear((int) (short) 1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter3 = fieldDataYear1.getQ((int) '4');
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter5 = fieldDataYear1.getQ(0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter6 = fieldDataYear1.getQ3();
        boolean boolean8 = fieldDataYear1.quarterDataAvailable(0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter9 = fieldDataYear1.getQ2();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter10 = fieldDataYear1.getQ2();
        org.junit.Assert.assertNull(fieldDataQuarter3);
        org.junit.Assert.assertNull(fieldDataQuarter5);
        org.junit.Assert.assertNull(fieldDataQuarter6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(fieldDataQuarter9);
        org.junit.Assert.assertNull(fieldDataQuarter10);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0364");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getUnusualIncYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0365");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getPrefStockQtr();
        double[] doubleArray3 = balSheetFileData0.getAcctPayableYr();
        double[] doubleArray4 = balSheetFileData0.getGoodwillQtr();
        double[] doubleArray5 = balSheetFileData0.getAcctPayableYr();
        double[] doubleArray6 = balSheetFileData0.getStDebtYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0366");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        int int10 = sharesFileData1.getInsiderSells();
        sharesFileData1.setInsiderSells("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        java.lang.String[] strArray15 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData18 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList16);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData19 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList16);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList16);
        companyFileData20.setState("out/BigDB/");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData23 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double24 = estimateFileData23.getEpsQ1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData25 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData26 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData25);
        sharesFileData26.setInstOwnership("NONE");
        double[] doubleArray33 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData26.setSharesY(doubleArray33);
        java.lang.String str35 = sharesFileData26.getTicker();
        sharesFileData26.setFloatshr("NONE");
        sharesFileData26.setVolume3m("hi!");
        java.lang.String[] strArray42 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData45 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList43);
        double[] doubleArray46 = incSheetFileData45.getNonrecurringItemsQtr();
        double[] doubleArray47 = incSheetFileData45.getDividendYr();
        double[] doubleArray48 = incSheetFileData45.getEpsContQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData49 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray50 = balSheetFileData49.getOtherLtLiabYr();
        double[] doubleArray51 = balSheetFileData49.getCurrLiabYr();
        double[] doubleArray52 = balSheetFileData49.getAcctPayableQtr();
        double[] doubleArray53 = balSheetFileData49.getAcctPayableQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData54 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData55 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData54);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData58 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData20, estimateFileData23, sharesFileData26, incSheetFileData45, balSheetFileData49, cashFileData54, 100, (int) 'a');
        sharesFileData1.setNameFields(companyFileData20);
        java.lang.String str60 = companyFileData20.getSic();
        companyFileData20.setName("");
        companyFileData20.setCity("null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(incSheetFileData18);
        org.junit.Assert.assertNotNull(estimateFileData19);
        org.junit.Assert.assertNotNull(companyFileData20);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(incSheetFileData45);
        org.junit.Assert.assertNull(doubleArray46);
        org.junit.Assert.assertNull(doubleArray47);
        org.junit.Assert.assertNull(doubleArray48);
        org.junit.Assert.assertNull(doubleArray50);
        org.junit.Assert.assertNull(doubleArray51);
        org.junit.Assert.assertNull(doubleArray52);
        org.junit.Assert.assertNull(doubleArray53);
        org.junit.Assert.assertNull(str60);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0367");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getStInvestYr();
        double[] doubleArray3 = balSheetFileData0.getBvpsQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0368");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getPrefStockQtr();
        double[] doubleArray3 = balSheetFileData0.getTotalAssetsYr();
        double[] doubleArray4 = balSheetFileData0.getOtherLtLiabYr();
        java.lang.String str5 = balSheetFileData0.getName();
        double[] doubleArray6 = balSheetFileData0.getInventoryYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0369");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) 'a', (int) (byte) 1);
        boolean boolean3 = fieldData2.isDataValid();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData4 = fieldData2.getIncSheetData();
        double[] doubleArray5 = incSheetFileData4.getOtherIncQtr();
        double[] doubleArray6 = incSheetFileData4.getRdQtr();
        double[] doubleArray7 = incSheetFileData4.getIncAfterTaxQtr();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(incSheetFileData4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0370");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double1 = estimateFileData0.getEpsQ1();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum2 = estimateFileData0.getExchange();
        java.lang.String str3 = estimateFileData0.getIndustry();
        java.lang.String str4 = estimateFileData0.getIndustry();
        java.lang.String str5 = estimateFileData0.toDbOutput();
        java.lang.String[] strArray8 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData11 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList9);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData12 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList9);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData13 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList9);
        estimateFileData0.setNameFields(companyFileData13);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData15 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(exchEnum2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(incSheetFileData11);
        org.junit.Assert.assertNotNull(estimateFileData12);
        org.junit.Assert.assertNotNull(companyFileData13);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0371");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double1 = estimateFileData0.getEpsQ1();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum2 = estimateFileData0.getExchange();
        java.lang.String str3 = estimateFileData0.getIndustry();
        java.lang.String str4 = estimateFileData0.getIndustry();
        java.lang.String str5 = estimateFileData0.toDbOutput();
        java.lang.String[] strArray8 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData11 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList9);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData12 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList9);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData13 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList9);
        estimateFileData0.setNameFields(companyFileData13);
        companyFileData13.setIndustry("hi!");
        java.lang.String str17 = companyFileData13.getDowIndexStr();
        int int18 = companyFileData13.getNumEmployees();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(exchEnum2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(incSheetFileData11);
        org.junit.Assert.assertNotNull(estimateFileData12);
        org.junit.Assert.assertNotNull(companyFileData13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0372");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getStInvestYr();
        double[] doubleArray3 = balSheetFileData0.getTotalAssetsQtr();
        double[] doubleArray4 = balSheetFileData0.getOtherLtLiabQtr();
        double[] doubleArray5 = balSheetFileData0.getOtherCurrAssetsYr();
        double[] doubleArray6 = balSheetFileData0.getCashQtr();
        double[] doubleArray7 = balSheetFileData0.getStInvestYr();
        double[] doubleArray8 = balSheetFileData0.getAcctPayableQtr();
        double[] doubleArray9 = balSheetFileData0.getOtherLtLiabYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0373");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsYr();
        double[] doubleArray7 = incSheetFileData5.getDepreciationYr();
        java.lang.String str8 = incSheetFileData5.toString();
        double[] doubleArray9 = incSheetFileData5.getUnusualIncYr();
        double[] doubleArray10 = incSheetFileData5.getTotalOpExpQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0374");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        sharesFileData1.setDollar3m("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        long long12 = sharesFileData1.getVolume10d();
        sharesFileData1.setInstOwnership("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        sharesFileData1.setInsiderSellShrs("");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0375");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getPrefStockQtr();
        double[] doubleArray3 = balSheetFileData0.getAcctPayableYr();
        double[] doubleArray4 = balSheetFileData0.getLiabEquityYr();
        double[] doubleArray5 = balSheetFileData0.getOtherCurrAssetsYr();
        double[] doubleArray6 = balSheetFileData0.getPrefStockYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0376");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        java.lang.String str1 = companyFileData0.getSector();
        java.lang.String str2 = companyFileData0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0377");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getQFromMemory((int) (byte) 0, 6);
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0378");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readSipData("");
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0379");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getUnusualIncQtr();
        java.lang.String str8 = incSheetFileData5.getTicker();
        double[] doubleArray9 = incSheetFileData5.getNonrecurringItemsYr();
        double[] doubleArray10 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray11 = incSheetFileData5.getTotalOpExpYr();
        double[] doubleArray12 = incSheetFileData5.getGrossOpIncQtr();
        double[] doubleArray13 = incSheetFileData5.getEpsDilContYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0380");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) '4', (int) 'a');
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = fieldData2.getIncSheetData();
        java.lang.String str4 = fieldData2.getName();
        org.junit.Assert.assertNotNull(incSheetFileData3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0381");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getStInvestYr();
        double[] doubleArray3 = balSheetFileData0.getTotalAssetsQtr();
        double[] doubleArray4 = balSheetFileData0.getOtherLtLiabQtr();
        double[] doubleArray5 = balSheetFileData0.getOtherCurrAssetsYr();
        double[] doubleArray6 = balSheetFileData0.getTotalLiabYr();
        java.lang.String str7 = balSheetFileData0.getIndustry();
        java.lang.String str8 = balSheetFileData0.getSector();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0382");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getIncAfterTaxYr();
        double[] doubleArray8 = incSheetFileData5.getIncTaxYr();
        double[] doubleArray9 = incSheetFileData5.getEpsDilContYr();
        double[] doubleArray10 = incSheetFileData5.getEpsContYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0383");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(6, 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData3 = fieldData2.getEstimateData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = fieldData2.getShareData();
        org.junit.Assert.assertNotNull(estimateFileData3);
        org.junit.Assert.assertNotNull(sharesFileData4);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0384");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double double10 = estimateFileData9.getEpsY0();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum11 = estimateFileData9.getExchange();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertNotNull(cashFileData8);
        org.junit.Assert.assertNotNull(estimateFileData9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(exchEnum11);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0385");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getSalesYr();
        double[] doubleArray7 = incSheetFileData5.getDepreciationYr();
        double[] doubleArray8 = incSheetFileData5.getRdQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0386");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(6, 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData3 = fieldData2.getEstimateData();
        double double4 = estimateFileData3.getEpsQ0();
        java.lang.String str5 = estimateFileData3.toString();
        org.junit.Assert.assertNotNull(estimateFileData3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000" + "'", str5, "null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000");
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0387");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        java.lang.String str8 = companyFileData7.getDowIndexStr();
        java.lang.String str9 = companyFileData7.getTicker();
        java.lang.String str10 = companyFileData7.getSector();
        java.lang.String str11 = companyFileData7.getName();
        java.lang.String str12 = companyFileData7.getZip();
        companyFileData7.setWeb("");
        companyFileData7.setWeb("NONE");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0388");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) 'a', (int) (byte) 1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData3 = fieldData2.getEstimateData();
        org.junit.Assert.assertNotNull(estimateFileData3);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0389");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getLtInvestYr();
        java.lang.String str3 = balSheetFileData0.getSector();
        double[] doubleArray4 = balSheetFileData0.getAcctRxYr();
        double[] doubleArray5 = balSheetFileData0.getTotalLiabYr();
        java.lang.String str6 = balSheetFileData0.getExchange();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0390");
        java.lang.String str4 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getOutfileName((int) (short) 0, (int) (short) -1, "out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.", "out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "out/BigDB/0/Q-1/out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.-fundamental-data-0Q-1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32." + "'", str4, "out/BigDB/0/Q-1/out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.-fundamental-data-0Q-1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0391");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getStDebtQtr();
        double[] doubleArray2 = balSheetFileData0.getTotalLiabYr();
        double[] doubleArray3 = balSheetFileData0.getLiabEquityQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0392");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getStInvestYr();
        double[] doubleArray3 = balSheetFileData0.getTotalAssetsQtr();
        double[] doubleArray4 = balSheetFileData0.getOtherLtLiabQtr();
        double[] doubleArray5 = balSheetFileData0.getOtherCurrAssetsYr();
        double[] doubleArray6 = balSheetFileData0.getCashQtr();
        double[] doubleArray7 = balSheetFileData0.getOtherLtAssetsQtr();
        java.lang.String str8 = balSheetFileData0.getExchange();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0393");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getStDebtQtr();
        double[] doubleArray2 = balSheetFileData0.getBvpsQtr();
        double[] doubleArray3 = balSheetFileData0.getOtherLtLiabQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0394");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        double double10 = sharesFileData1.getMktCap();
        double[] doubleArray11 = null;
        sharesFileData1.setSharesQ(doubleArray11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = sharesFileData1.toDbOutput();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0395");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getUnusualIncQtr();
        java.lang.String str8 = incSheetFileData5.getTicker();
        double[] doubleArray9 = incSheetFileData5.getNonrecurringItemsYr();
        double[] doubleArray10 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray11 = incSheetFileData5.getTotalOpExpYr();
        double[] doubleArray12 = incSheetFileData5.getDividendQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0396");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getGrossOpIncQtr();
        double[] doubleArray8 = incSheetFileData5.getIntExpNonOpQtr();
        double[] doubleArray9 = incSheetFileData5.getCogsQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0397");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getFromMemory("out/BigDB/", 10, (-1));
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0398");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        int int4 = sharesFileData1.getInsiderBuys();
        double double5 = sharesFileData1.getFloatshr();
        int int6 = sharesFileData1.getInstSellShrs();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0399");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getUnusualIncQtr();
        java.lang.String str8 = incSheetFileData5.getTicker();
        double[] doubleArray9 = incSheetFileData5.getNonrecurringItemsYr();
        double[] doubleArray10 = incSheetFileData5.getTotalOpExpQtr();
        double[] doubleArray11 = incSheetFileData5.getIncTaxQtr();
        java.lang.String[] strArray14 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData17 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData18 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData19 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList15);
        java.lang.String str20 = companyFileData19.getDowIndexStr();
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum21 = companyFileData19.getSnpIndex();
        companyFileData19.setName("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData19);
        incSheetFileData5.setNameFields(companyFileData19);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(incSheetFileData17);
        org.junit.Assert.assertNotNull(estimateFileData18);
        org.junit.Assert.assertNotNull(companyFileData19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(snpEnum21);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0400");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double1 = estimateFileData0.getEpsQ1();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum2 = estimateFileData0.getExchange();
        java.lang.String str3 = estimateFileData0.getIndustry();
        java.lang.String str4 = estimateFileData0.getIndustry();
        java.lang.String str5 = estimateFileData0.toDbOutput();
        java.lang.String[] strArray8 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData11 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList9);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData12 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList9);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData13 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList9);
        estimateFileData0.setNameFields(companyFileData13);
        companyFileData13.setIndustry("hi!");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum17 = companyFileData13.getSnpIndex();
        java.lang.String str18 = companyFileData13.getStreet();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(exchEnum2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(incSheetFileData11);
        org.junit.Assert.assertNotNull(estimateFileData12);
        org.junit.Assert.assertNotNull(companyFileData13);
        org.junit.Assert.assertNull(snpEnum17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0401");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        java.lang.String str8 = companyFileData7.getDowIndexStr();
        companyFileData7.setSnpIndex("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        companyFileData7.setNumEmployees("NONE");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum13 = companyFileData7.getDowIndex();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(dowEnum13);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0402");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        java.lang.String str8 = companyFileData7.getDowIndexStr();
        companyFileData7.setZip("data/BigDB/");
        java.lang.String str11 = companyFileData7.getName();
        java.lang.String str12 = companyFileData7.getState();
        java.lang.String str13 = companyFileData7.getExchangeStr();
        java.lang.String str14 = companyFileData7.getCountry();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "NONE" + "'", str13, "NONE");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0403");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum1 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.convertExchange("out/BigDB/0/Q-1/out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.-fundamental-data-0Q-1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        org.junit.Assert.assertTrue("'" + exchEnum1 + "' != '" + net.ajaskey.market.tools.SIP.BigDB.ExchEnum.NONE + "'", exchEnum1.equals(net.ajaskey.market.tools.SIP.BigDB.ExchEnum.NONE));
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0404");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getDividendYr();
        double[] doubleArray8 = incSheetFileData5.getEpsContQtr();
        double[] doubleArray9 = incSheetFileData5.getSalesYr();
        double[] doubleArray10 = incSheetFileData5.getIntExpNonOpQtr();
        java.lang.String str11 = incSheetFileData5.toString();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0405");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getPrefStockQtr();
        double[] doubleArray3 = balSheetFileData0.getTotalAssetsYr();
        double[] doubleArray4 = balSheetFileData0.getBvpsYr();
        double[] doubleArray5 = balSheetFileData0.getAcctRxYr();
        double[] doubleArray6 = balSheetFileData0.getAcctPayableYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0406");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        int int8 = companyFileData7.getNumEmployees();
        companyFileData7.setCountry("hi!");
        int int11 = companyFileData7.getNumEmployees();
        java.lang.String[] strArray14 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData17 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData18 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList15);
        java.util.List<java.lang.String> strList19 = companyFileData7.set((java.util.List<java.lang.String>) strList15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readFromDb((java.util.List<java.lang.String>) strList15);
        double[] doubleArray21 = balSheetFileData20.getInventoryYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData22 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData20);
        double[] doubleArray23 = balSheetFileData20.getLiabEquityQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(incSheetFileData17);
        org.junit.Assert.assertNotNull(estimateFileData18);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(balSheetFileData20);
        org.junit.Assert.assertNull(doubleArray21);
        org.junit.Assert.assertNull(doubleArray23);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0407");
        java.lang.String[] strArray4 = new java.lang.String[] { "Data for  from 52 Q97\r\n  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n", "data/BigDB/", "hi!", "out/BigDB/" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0408");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean3 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.parseSipData((int) (short) 0, (int) ' ', filetypeEnum2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0409");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        java.lang.String str8 = companyFileData7.getDowIndexStr();
        companyFileData7.setSnpIndex("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        companyFileData7.setSic("out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        boolean boolean13 = companyFileData7.isAdr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0410");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        companyFileData7.setName("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        java.lang.String str10 = companyFileData7.getCity();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum11 = companyFileData7.getExchange();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(exchEnum11);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0411");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear((int) (short) 1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter3 = fieldDataYear1.getQ(10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getQFromMemory((int) '#', 100);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter10 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter((int) 'a', (int) (byte) 1, fieldDataList9);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = fieldDataQuarter10.fieldDataList;
        fieldDataYear1.set((int) (short) 0, fieldDataQuarter10);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter13 = fieldDataYear1.getQ1();
        boolean boolean15 = fieldDataYear1.quarterDataAvailable((-1));
        org.junit.Assert.assertNull(fieldDataQuarter3);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNull(fieldDataQuarter13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0412");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getRdYr();
        double[] doubleArray8 = incSheetFileData5.getUnusualIncQtr();
        double[] doubleArray9 = incSheetFileData5.getCogsYr();
        double[] doubleArray10 = incSheetFileData5.getRdYr();
        double[] doubleArray11 = incSheetFileData5.getEpsYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0413");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        int int10 = sharesFileData1.getInsiderSells();
        long long11 = sharesFileData1.getVolume10d();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0414");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        int int4 = sharesFileData1.getInsiderBuys();
        double double5 = sharesFileData1.getDollar3m();
        sharesFileData1.setVolume3m("NONE");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0415");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double1 = estimateFileData0.getEpsQ1();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum2 = estimateFileData0.getExchange();
        double double3 = estimateFileData0.getEpsY1();
        net.ajaskey.common.DateTime dateTime4 = estimateFileData0.getCurrFiscalYear();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(exchEnum2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(dateTime4);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0416");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        sharesFileData1.setVolume10d("null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData12 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData13 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData12);
        sharesFileData13.setInstOwnership("NONE");
        double[] doubleArray20 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData13.setSharesY(doubleArray20);
        sharesFileData1.setSharesY(doubleArray20);
        java.lang.String str23 = sharesFileData1.getTicker();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0417");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        boolean boolean3 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.parseSipData((int) (short) 100, (int) '4', filetypeEnum2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0418");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsYr();
        double[] doubleArray7 = incSheetFileData5.getSalesYr();
        double[] doubleArray8 = incSheetFileData5.getEpsContQtr();
        double[] doubleArray9 = incSheetFileData5.getEpsDilContYr();
        double[] doubleArray10 = incSheetFileData5.getEpsDilContYr();
        double[] doubleArray11 = incSheetFileData5.getEpsDilContYr();
        double[] doubleArray12 = incSheetFileData5.getIncAfterTaxYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0419");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.find("null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000");
        org.junit.Assert.assertNull(estimateFileData1);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0420");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getFromMemory("out/BigDB/0/Q-1/out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.-fundamental-data-0Q-1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.", (int) (byte) 10, (int) (short) -1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0421");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        java.lang.String str8 = companyFileData7.getDowIndexStr();
        java.lang.String str9 = companyFileData7.getTicker();
        companyFileData7.setName("null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000");
        java.lang.String str12 = companyFileData7.getCity();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData13 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double14 = estimateFileData13.getEpsQ1();
        java.lang.String str15 = estimateFileData13.getSector();
        double double16 = estimateFileData13.getEpsQ1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData17 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData18 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData17);
        sharesFileData18.setInstOwnership("NONE");
        double[] doubleArray25 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData18.setSharesY(doubleArray25);
        double double27 = sharesFileData18.getMktCap();
        double[] doubleArray28 = null;
        sharesFileData18.setSharesQ(doubleArray28);
        java.lang.String[] strArray32 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData35 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList33);
        double[] doubleArray36 = incSheetFileData35.getEpsContQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData37 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray38 = balSheetFileData37.getOtherLtLiabYr();
        double[] doubleArray39 = balSheetFileData37.getStInvestYr();
        double[] doubleArray40 = balSheetFileData37.getTotalAssetsQtr();
        double[] doubleArray41 = balSheetFileData37.getOtherLtLiabQtr();
        double[] doubleArray42 = balSheetFileData37.getTotalAssetsYr();
        double[] doubleArray43 = balSheetFileData37.getOtherLtLiabQtr();
        double[] doubleArray44 = balSheetFileData37.getGoodwillYr();
        double[] doubleArray45 = balSheetFileData37.getStDebtQtr();
        java.lang.String str46 = balSheetFileData37.getSector();
        double[] doubleArray47 = balSheetFileData37.getOtherCurrLiabQtr();
        double[] doubleArray48 = balSheetFileData37.getStInvestQtr();
        java.lang.String str49 = balSheetFileData37.getTicker();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData50 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData51 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData50);
        java.lang.String str52 = cashFileData51.getTicker();
        java.lang.String str53 = cashFileData51.getTicker();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData54 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData51);
        java.lang.String str55 = cashFileData54.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData58 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData7, estimateFileData13, sharesFileData18, incSheetFileData35, balSheetFileData37, cashFileData54, (int) '4', 10);
        double double59 = estimateFileData13.getEpsQ0();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(incSheetFileData35);
        org.junit.Assert.assertNull(doubleArray36);
        org.junit.Assert.assertNull(doubleArray38);
        org.junit.Assert.assertNull(doubleArray39);
        org.junit.Assert.assertNull(doubleArray40);
        org.junit.Assert.assertNull(doubleArray41);
        org.junit.Assert.assertNull(doubleArray42);
        org.junit.Assert.assertNull(doubleArray43);
        org.junit.Assert.assertNull(doubleArray44);
        org.junit.Assert.assertNull(doubleArray45);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNull(doubleArray47);
        org.junit.Assert.assertNull(doubleArray48);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.0d + "'", double59 == 0.0d);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0422");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        java.lang.String str10 = sharesFileData1.getTicker();
        sharesFileData1.setFloatshr("NONE");
        sharesFileData1.setInsiderNetPercentOutstanding("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        java.lang.String str15 = sharesFileData1.getIndustry();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0423");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getGrossOpIncQtr();
        double[] doubleArray8 = incSheetFileData5.getIncTaxYr();
        double[] doubleArray9 = incSheetFileData5.getEpsContYr();
        double[] doubleArray10 = incSheetFileData5.getDividendQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0424");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        java.lang.String str9 = cashFileData8.toDbOutput();
        java.lang.String str10 = cashFileData8.toString();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertNotNull(cashFileData8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cash File Data" + "'", str10, "Cash File Data");
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0425");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getPrefStockQtr();
        double[] doubleArray3 = balSheetFileData0.getTotalAssetsYr();
        double[] doubleArray4 = balSheetFileData0.getBvpsYr();
        double[] doubleArray5 = balSheetFileData0.getCurrLiabQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray7 = balSheetFileData0.getTotalLiabQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0426");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getDividendYr();
        double[] doubleArray8 = incSheetFileData5.getEpsContQtr();
        double[] doubleArray9 = incSheetFileData5.getSalesYr();
        double[] doubleArray10 = incSheetFileData5.getIntExpNonOpQtr();
        double[] doubleArray11 = incSheetFileData5.getAdjToIncYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0427");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) '4', (int) 'a');
        java.lang.String str3 = fieldData2.getIndustry();
        java.lang.String str4 = fieldData2.getName();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData5 = fieldData2.getBalSheetData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData6 = fieldData2.getIncSheetData();
        java.lang.String str7 = fieldData2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(balSheetFileData5);
        org.junit.Assert.assertNotNull(incSheetFileData6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0428");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData1);
        double[] doubleArray3 = cashFileData2.getCapExQtr();
        org.junit.Assert.assertNull(doubleArray3);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0429");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        sharesFileData1.setDollar3m("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        int int12 = sharesFileData1.getInsiderSells();
        sharesFileData1.setInsiderNetTrades("null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000");
        sharesFileData1.setVolume3m("data/BigDB/");
        java.lang.String str17 = sharesFileData1.getName();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0430");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsYr();
        double[] doubleArray7 = incSheetFileData5.getSalesYr();
        double[] doubleArray8 = incSheetFileData5.getEpsContQtr();
        double[] doubleArray9 = incSheetFileData5.getIncPrimaryEpsQtr();
        double[] doubleArray10 = incSheetFileData5.getDividendQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0431");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        sharesFileData1.setDollar3m("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        int int12 = sharesFileData1.getInsiderSells();
        int int13 = sharesFileData1.getInsiderSellShrs();
        double double14 = sharesFileData1.getInsiderOwnership();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0432");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsYr();
        double[] doubleArray7 = incSheetFileData5.getSalesYr();
        double[] doubleArray8 = incSheetFileData5.getEpsContQtr();
        double[] doubleArray9 = incSheetFileData5.getIncPrimaryEpsQtr();
        java.lang.String str10 = incSheetFileData5.getTicker();
        double[] doubleArray11 = incSheetFileData5.getPreTaxIncQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0433");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getCurrLiabYr();
        double[] doubleArray3 = balSheetFileData0.getGoodwillQtr();
        double[] doubleArray4 = balSheetFileData0.getAcctPayableQtr();
        double[] doubleArray5 = balSheetFileData0.getStDebtYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0434");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getCurrLiabYr();
        double[] doubleArray3 = balSheetFileData0.getAcctPayableQtr();
        double[] doubleArray4 = balSheetFileData0.getAcctPayableQtr();
        double[] doubleArray5 = balSheetFileData0.getTotalAssetsYr();
        double[] doubleArray6 = balSheetFileData0.getLtDebtYr();
        double[] doubleArray7 = balSheetFileData0.getOtherCurrAssetsYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0435");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getFromMemory("Cash File Data", (int) (short) 100, (int) (short) 100);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0436");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        java.lang.String str8 = companyFileData7.getDowIndexStr();
        java.lang.String str9 = companyFileData7.getCity();
        companyFileData7.setDowIndex("hi!");
        java.lang.String str12 = companyFileData7.getSnpIndexStr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0437");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getCurrLiabYr();
        double[] doubleArray3 = balSheetFileData0.getAcctPayableQtr();
        double[] doubleArray4 = balSheetFileData0.getInventoryYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0438");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double1 = estimateFileData0.getEpsY2();
        java.lang.String[] strArray4 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        java.lang.String str10 = companyFileData9.getSnpIndexStr();
        estimateFileData0.setNameFields(companyFileData9);
        double double12 = estimateFileData0.getEpsY0();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(incSheetFileData7);
        org.junit.Assert.assertNotNull(estimateFileData8);
        org.junit.Assert.assertNotNull(companyFileData9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0439");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getStDebtQtr();
        double[] doubleArray2 = balSheetFileData0.getBvpsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData3 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray4 = balSheetFileData3.getInventoryYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray4);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0440");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readSipData("out/BigDB/1/Q0/out/BigDB/52/Q1/out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.-fundamental-data-52Q1.-fundamental-data-1Q0.NONE");
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0441");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        companyFileData7.setName("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        companyFileData7.setCountry("Data for  from 52 Q97\r\n  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        java.lang.String str12 = companyFileData7.getSic();
        java.lang.String str13 = companyFileData7.toString();
        java.lang.String str14 = companyFileData7.toString();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0442");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double1 = estimateFileData0.getEpsQ1();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum2 = estimateFileData0.getExchange();
        java.lang.String str3 = estimateFileData0.getIndustry();
        java.lang.String str4 = estimateFileData0.getIndustry();
        double double5 = estimateFileData0.getEpsY2();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(exchEnum2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0443");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getStInvestYr();
        double[] doubleArray3 = balSheetFileData0.getTotalAssetsQtr();
        double[] doubleArray4 = balSheetFileData0.getOtherLtLiabQtr();
        double[] doubleArray5 = balSheetFileData0.getOtherCurrAssetsYr();
        double[] doubleArray6 = balSheetFileData0.getStDebtYr();
        java.lang.String str7 = balSheetFileData0.toString();
        double[] doubleArray8 = balSheetFileData0.getBvpsYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0444");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        java.lang.String str10 = sharesFileData1.getTicker();
        sharesFileData1.setFloatshr("NONE");
        sharesFileData1.setVolume3m("hi!");
        java.lang.String str15 = sharesFileData1.getTicker();
        int int16 = sharesFileData1.getInsiderSells();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0445");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) '4', (int) 'a');
        java.lang.String str3 = fieldData2.getTicker();
        boolean boolean4 = fieldData2.isDataValid();
        int int5 = fieldData2.getQuarter();
        java.lang.String str6 = fieldData2.toString();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData7 = fieldData2.getCashData();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "52 Q97\r\n  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n" + "'", str6, "52 Q97\r\n  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        org.junit.Assert.assertNotNull(cashFileData7);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0446");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double[] doubleArray2 = sharesFileData1.getSharesYr();
        java.lang.String str3 = sharesFileData1.toString();
        sharesFileData1.setInsiderOwnership("out/BigDB/");
        double double6 = sharesFileData1.getPrice52hi();
        long long7 = sharesFileData1.getVolume10d();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0447");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        companyFileData7.setState("out/BigDB/");
        java.lang.String str10 = companyFileData7.toDbOuput();
        java.lang.String str11 = companyFileData7.toString();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0448");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsYr();
        double[] doubleArray7 = incSheetFileData5.getSalesYr();
        double[] doubleArray8 = incSheetFileData5.getEpsContQtr();
        double[] doubleArray9 = incSheetFileData5.getEpsDilContYr();
        double[] doubleArray10 = incSheetFileData5.getEpsDilContYr();
        double[] doubleArray11 = incSheetFileData5.getAdjToIncYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0449");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        sharesFileData1.setDollar3m("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        int int12 = sharesFileData1.getInsiderSells();
        double double13 = sharesFileData1.getInstOwnership();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0450");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsYr();
        double[] doubleArray7 = incSheetFileData5.getSalesYr();
        double[] doubleArray8 = incSheetFileData5.getEpsContQtr();
        double[] doubleArray9 = incSheetFileData5.getEpsDilContYr();
        double[] doubleArray10 = incSheetFileData5.getNonrecurringItemsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData11 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData5);
        double[] doubleArray12 = incSheetFileData11.getGrossIncYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray12);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0451");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        companyFileData7.setState("out/BigDB/");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData10 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double11 = estimateFileData10.getEpsQ1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData12 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData13 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData12);
        sharesFileData13.setInstOwnership("NONE");
        double[] doubleArray20 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData13.setSharesY(doubleArray20);
        java.lang.String str22 = sharesFileData13.getTicker();
        sharesFileData13.setFloatshr("NONE");
        sharesFileData13.setVolume3m("hi!");
        java.lang.String[] strArray29 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData32 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList30);
        double[] doubleArray33 = incSheetFileData32.getNonrecurringItemsQtr();
        double[] doubleArray34 = incSheetFileData32.getDividendYr();
        double[] doubleArray35 = incSheetFileData32.getEpsContQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData36 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray37 = balSheetFileData36.getOtherLtLiabYr();
        double[] doubleArray38 = balSheetFileData36.getCurrLiabYr();
        double[] doubleArray39 = balSheetFileData36.getAcctPayableQtr();
        double[] doubleArray40 = balSheetFileData36.getAcctPayableQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData41 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData42 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData41);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData45 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData7, estimateFileData10, sharesFileData13, incSheetFileData32, balSheetFileData36, cashFileData41, 100, (int) 'a');
        double[] doubleArray46 = incSheetFileData32.getIncAfterTaxQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(incSheetFileData32);
        org.junit.Assert.assertNull(doubleArray33);
        org.junit.Assert.assertNull(doubleArray34);
        org.junit.Assert.assertNull(doubleArray35);
        org.junit.Assert.assertNull(doubleArray37);
        org.junit.Assert.assertNull(doubleArray38);
        org.junit.Assert.assertNull(doubleArray39);
        org.junit.Assert.assertNull(doubleArray40);
        org.junit.Assert.assertNull(doubleArray46);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0452");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double1 = estimateFileData0.getEpsQ1();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum2 = estimateFileData0.getExchange();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum3 = estimateFileData0.getExchange();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData0);
        double double5 = estimateFileData0.getEpsY0();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(exchEnum2);
        org.junit.Assert.assertNull(exchEnum3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0453");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        java.lang.String str4 = sharesFileData1.getName();
        int int5 = sharesFileData1.getInsiderBuyShrs();
        sharesFileData1.setInsiderSellShrs("null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000");
        long long8 = sharesFileData1.getVolume10d();
        int int9 = sharesFileData1.getInsiderNetTrades();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0454");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getDividendYr();
        double[] doubleArray8 = incSheetFileData5.getUnusualIncQtr();
        double[] doubleArray9 = incSheetFileData5.getEpsDilContYr();
        double[] doubleArray10 = incSheetFileData5.getDepreciationQtr();
        double[] doubleArray11 = incSheetFileData5.getAdjToIncYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0455");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        java.lang.String str4 = sharesFileData1.getName();
        int int5 = sharesFileData1.getInsiderBuyShrs();
        sharesFileData1.setInsiderSellShrs("null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000");
        int int8 = sharesFileData1.getInstSellShrs();
        double double9 = sharesFileData1.getInsiderOwnership();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0456");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getDividendYr();
        double[] doubleArray8 = incSheetFileData5.getEpsQtr();
        double[] doubleArray9 = incSheetFileData5.getCogsYr();
        double[] doubleArray10 = incSheetFileData5.getRdYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0457");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getPrefStockQtr();
        double[] doubleArray3 = balSheetFileData0.getTotalAssetsYr();
        double[] doubleArray4 = balSheetFileData0.getBvpsYr();
        double[] doubleArray5 = balSheetFileData0.getCurrLiabQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray7 = balSheetFileData6.getBvpsYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0458");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        java.lang.String str8 = companyFileData7.getDowIndexStr();
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum9 = companyFileData7.getSnpIndex();
        companyFileData7.setName("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        companyFileData7.setCountry("data/BigDB/");
        java.lang.String str14 = companyFileData7.getDowIndexStr();
        java.lang.String str15 = companyFileData7.getCountry();
        boolean boolean16 = companyFileData7.isAdr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(snpEnum9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "data/BigDB/" + "'", str15, "data/BigDB/");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0459");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getStInvestYr();
        double[] doubleArray3 = balSheetFileData0.getTotalAssetsQtr();
        double[] doubleArray4 = balSheetFileData0.getOtherLtLiabQtr();
        double[] doubleArray5 = balSheetFileData0.getOtherCurrAssetsYr();
        double[] doubleArray6 = balSheetFileData0.getTotalLiabYr();
        java.lang.String str7 = balSheetFileData0.toDbOutput();
        java.lang.String str8 = balSheetFileData0.getTicker();
        double[] doubleArray9 = balSheetFileData0.getOtherCurrLiabQtr();
        double[] doubleArray10 = balSheetFileData0.getStInvestYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0460");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str7 = cashFileData6.getTicker();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(estimateFileData5);
        org.junit.Assert.assertNotNull(cashFileData6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0461");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        java.lang.String str4 = sharesFileData1.getName();
        double double5 = sharesFileData1.getPrice();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum6 = sharesFileData1.getExchange();
        int int7 = sharesFileData1.getInsiderSellShrs();
        sharesFileData1.setInstBuyShrs("52 Q97\r\n  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        long long10 = sharesFileData1.getVolumeMonth3m();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(exchEnum6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0462");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        java.lang.String str10 = sharesFileData1.getTicker();
        sharesFileData1.setFloatshr("NONE");
        sharesFileData1.setVolume3m("hi!");
        int int15 = sharesFileData1.getInsiderBuys();
        sharesFileData1.setBeta("NONE");
        java.lang.String str18 = sharesFileData1.getTicker();
        double[] doubleArray25 = new double[] { (-1.0f), 100L, (-1.0f), 'a', (short) -1, (-1.0d) };
        sharesFileData1.setSharesY(doubleArray25);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, 100.0, -1.0, 97.0, -1.0, -1.0]");
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0463");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        int int10 = sharesFileData1.getInsiderSells();
        sharesFileData1.setInstOwnership("null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0464");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double[] doubleArray2 = sharesFileData1.getSharesYr();
        java.lang.String str3 = sharesFileData1.toString();
        double double4 = sharesFileData1.getPrice52lo();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0465");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getIncAfterTaxYr();
        double[] doubleArray8 = incSheetFileData5.getIncTaxYr();
        double[] doubleArray9 = incSheetFileData5.getEpsDilContYr();
        double[] doubleArray10 = incSheetFileData5.getRdQtr();
        double[] doubleArray11 = incSheetFileData5.getTotalOpExpYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0466");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        java.lang.String str8 = companyFileData7.getDowIndexStr();
        java.lang.String str9 = companyFileData7.getTicker();
        java.lang.String str10 = companyFileData7.getSector();
        java.lang.String str11 = companyFileData7.getName();
        java.lang.String str12 = companyFileData7.getZip();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum13 = companyFileData7.getExchange();
        java.lang.String str14 = companyFileData7.getPhone();
        companyFileData7.setAdr("out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(exchEnum13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0467");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) '4', (int) (short) 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        double[] doubleArray10 = balSheetFileData9.getOtherCurrLiabYr();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(fieldDataList7);
        org.junit.Assert.assertNotNull(estimateFileData8);
        org.junit.Assert.assertNotNull(balSheetFileData9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0468");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        java.lang.String str4 = sharesFileData1.getName();
        sharesFileData1.setInstBuyShrs("NONE");
        java.lang.String[] strArray9 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData12 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList10);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData13 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList10);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList10);
        java.lang.String str15 = companyFileData14.getDowIndexStr();
        companyFileData14.setZip("data/BigDB/");
        java.lang.String str18 = companyFileData14.getName();
        java.lang.String str19 = companyFileData14.getPhone();
        sharesFileData1.setNameFields(companyFileData14);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(incSheetFileData12);
        org.junit.Assert.assertNotNull(estimateFileData13);
        org.junit.Assert.assertNotNull(companyFileData14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0469");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getUnusualIncQtr();
        java.lang.String str8 = incSheetFileData5.getTicker();
        double[] doubleArray9 = incSheetFileData5.getGrossIncYr();
        double[] doubleArray10 = incSheetFileData5.getIncPrimaryEpsYr();
        double[] doubleArray11 = incSheetFileData5.getSalesYr();
        double[] doubleArray12 = incSheetFileData5.getPreTaxIncQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0470");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getDividendYr();
        double[] doubleArray8 = incSheetFileData5.getAdjToIncQtr();
        double[] doubleArray9 = incSheetFileData5.getNetIncQtr();
        double[] doubleArray10 = incSheetFileData5.getGrossIncQtr();
        double[] doubleArray11 = incSheetFileData5.getGrossOpIncYr();
        double[] doubleArray12 = incSheetFileData5.getNonrecurringItemsQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0471");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setDollar3m("");
        int int3 = sharesFileData0.getInsiderNetTrades();
        double double4 = sharesFileData0.getBeta();
        int int5 = sharesFileData0.getInsiderBuyShrs();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0472");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getGrossIncQtr();
        double[] doubleArray8 = incSheetFileData5.getSalesYr();
        double[] doubleArray9 = incSheetFileData5.getOtherIncYr();
        double[] doubleArray10 = incSheetFileData5.getIntExpNonOpYr();
        double[] doubleArray11 = incSheetFileData5.getRdYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0473");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getOtherLtAssetsYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0474");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        java.lang.String str8 = companyFileData7.getDowIndexStr();
        java.lang.String str9 = companyFileData7.getTicker();
        java.lang.String str10 = companyFileData7.getSector();
        java.lang.String str11 = companyFileData7.getName();
        java.lang.String str12 = companyFileData7.getZip();
        companyFileData7.setWeb("");
        companyFileData7.setStreet("out/BigDB/100/Q100/Cash File Data-fundamental-data-100Q100.NONE");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0475");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.setQMemory(32, (int) (byte) -1, filetypeEnum2);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0476");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getCurrLiabYr();
        double[] doubleArray3 = balSheetFileData0.getAcctPayableQtr();
        double[] doubleArray4 = balSheetFileData0.getLiabEquityYr();
        double[] doubleArray5 = balSheetFileData0.getStDebtYr();
        java.lang.String str6 = balSheetFileData0.getSector();
        java.lang.String str7 = balSheetFileData0.toDbOutput();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0477");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData0);
        java.lang.String str2 = cashFileData1.getTicker();
        double[] doubleArray3 = cashFileData1.getCashFromInvQtr();
        double[] doubleArray4 = cashFileData1.getCapExQtr();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0478");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        int int8 = companyFileData7.getNumEmployees();
        companyFileData7.setCountry("hi!");
        int int11 = companyFileData7.getNumEmployees();
        boolean boolean12 = companyFileData7.isAdr();
        companyFileData7.setName("out/BigDB/");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0479");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        sharesFileData1.setDollar3m("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        long long12 = sharesFileData1.getVolume10d();
        sharesFileData1.setInstOwnership("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        sharesFileData1.setPrice("");
        double double17 = sharesFileData1.getMktCap();
        sharesFileData1.setDollar3m("out/BigDB/52/Q1/out/BigDB/-1/Q1/null      \tnull                                    \tNONE                \tnull                                    \tnull\r\n  null  null\r\n  Est Q0 Q1    :      0.000      0.000\r\n  Est Y0 Y1 Y2 :      0.000       0.00      0.000-fundamental-data--1Q1.out/BigDB/100/Q32/hi!-fundamental-data-100Q32.-fundamental-data-52Q1.");
        sharesFileData1.setInsiderBuyShrs("out/BigDB/100/Q100/Cash File Data-fundamental-data-100Q100.NONE");
        double double22 = sharesFileData1.getPrice52lo();
        long long23 = sharesFileData1.getVolumeMonth3m();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0480");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsYr();
        double[] doubleArray7 = incSheetFileData5.getDepreciationYr();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum8 = incSheetFileData5.getExchange();
        double[] doubleArray9 = incSheetFileData5.getIntExpYr();
        double[] doubleArray10 = incSheetFileData5.getIncTaxQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(exchEnum8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0481");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsYr();
        double[] doubleArray7 = incSheetFileData5.getDepreciationYr();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum8 = incSheetFileData5.getExchange();
        java.lang.String str9 = incSheetFileData5.getIndustry();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(exchEnum8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0482");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) '4', (int) 'a');
        java.lang.String str3 = fieldData2.getTicker();
        boolean boolean4 = fieldData2.isDataValid();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = fieldData2.getCashData();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cashFileData5);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0483");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        java.lang.String str8 = companyFileData7.getDowIndexStr();
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum9 = companyFileData7.getSnpIndex();
        companyFileData7.setName("out/BigDB/100/Q32/hi!-fundamental-data-100Q32.");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData12 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData7);
        companyFileData12.setState("data/BigDB/");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(snpEnum9);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0484");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        java.lang.String str4 = sharesFileData1.getName();
        int int5 = sharesFileData1.getInsiderBuyShrs();
        double double6 = sharesFileData1.getMktCap();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0485");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInsiderBuyShrs();
        sharesFileData0.setVolume10d("hi!");
        sharesFileData0.setVolume10d("out/BigDB/");
        sharesFileData0.setInstOwnership("NONE");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0486");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getStInvestYr();
        double[] doubleArray3 = balSheetFileData0.getTotalAssetsQtr();
        double[] doubleArray4 = balSheetFileData0.getOtherLtLiabQtr();
        double[] doubleArray5 = balSheetFileData0.getTotalAssetsYr();
        double[] doubleArray6 = balSheetFileData0.getInventoryYr();
        double[] doubleArray7 = balSheetFileData0.getStInvestYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0487");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        int int8 = companyFileData7.getNumEmployees();
        companyFileData7.setCity("Cash File Data");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0488");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInstOwnership("NONE");
        double[] doubleArray8 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        sharesFileData1.setSharesY(doubleArray8);
        java.lang.String str10 = sharesFileData1.getTicker();
        sharesFileData1.setFloatshr("NONE");
        double double13 = sharesFileData1.getInstOwnership();
        double[] doubleArray14 = sharesFileData1.getSharesYr();
        double double15 = sharesFileData1.getInsiderNetPercentOutstanding();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0489");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double double10 = estimateFileData9.getEpsY0();
        java.lang.String str11 = estimateFileData9.getIndustry();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertNotNull(cashFileData8);
        org.junit.Assert.assertNotNull(estimateFileData9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0490");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getStInvestYr();
        double[] doubleArray3 = balSheetFileData0.getTotalAssetsQtr();
        java.lang.String str4 = balSheetFileData0.getTicker();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0491");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readSipData("NONE", "hi!");
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0492");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) '4', (int) 'a');
        java.lang.String str3 = fieldData2.getIndustry();
        java.lang.String str4 = fieldData2.getName();
        java.lang.String str5 = fieldData2.genOutput();
        java.lang.String str6 = fieldData2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Data for  from 52 Q97\r\n  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n" + "'", str5, "Data for  from 52 Q97\r\n  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "52 Q97\r\n  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n" + "'", str6, "52 Q97\r\n  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0493");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getDividendYr();
        double[] doubleArray8 = incSheetFileData5.getUnusualIncQtr();
        double[] doubleArray9 = incSheetFileData5.getIntExpYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0494");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getUnusualIncQtr();
        java.lang.String str8 = incSheetFileData5.getTicker();
        double[] doubleArray9 = incSheetFileData5.getEpsDilYr();
        java.lang.String str10 = incSheetFileData5.toDbOutput();
        double[] doubleArray11 = incSheetFileData5.getNonrecurringItemsQtr();
        java.lang.String str12 = incSheetFileData5.getSector();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0495");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData5.getDividendYr();
        double[] doubleArray8 = incSheetFileData5.getEpsQtr();
        double[] doubleArray9 = incSheetFileData5.getEpsDilContQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0496");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.find("out/BigDB/100/Q100/Cash File Data-fundamental-data-100Q100.NONE");
        org.junit.Assert.assertNull(sharesFileData1);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0497");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) '4', (int) (short) 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData10 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(fieldDataList7);
        org.junit.Assert.assertNotNull(incSheetFileData8);
        org.junit.Assert.assertNotNull(companyFileData9);
        org.junit.Assert.assertNotNull(balSheetFileData10);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0498");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getOtherLtLiabYr();
        double[] doubleArray2 = balSheetFileData0.getStInvestYr();
        double[] doubleArray3 = balSheetFileData0.getTotalAssetsQtr();
        double[] doubleArray4 = balSheetFileData0.getOtherLtLiabQtr();
        double[] doubleArray5 = balSheetFileData0.getAcctPayableYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0499");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData0);
        java.lang.String str2 = cashFileData1.getTicker();
        java.lang.String str3 = cashFileData1.toString();
        java.lang.String str4 = cashFileData1.getTicker();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData1);
        java.lang.String str6 = cashFileData5.getTicker();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData5);
        java.lang.String str8 = cashFileData5.toDbOutput();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Cash File Data" + "'", str3, "Cash File Data");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0500");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsYr();
        double[] doubleArray7 = incSheetFileData5.getPreTaxIncQtr();
        double[] doubleArray8 = incSheetFileData5.getNetIncQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }
}

