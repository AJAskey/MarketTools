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
        double[] doubleArray0 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            double double1 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getTtm(doubleArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0002");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readSipData("hi!");
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0003");
        int int0 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.getListCount();
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0004");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.clearList();
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0005");
        java.lang.String str4 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getOutfileName(0, 100, "Cash File Data", "Cash File Data");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" + "'", str4, "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0006");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.find("");
        org.junit.Assert.assertNull(cashFileData1);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0007");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.setMemory((int) (byte) 10, (int) (byte) -1, filetypeEnum2);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0008");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.find("Cash File Data");
        org.junit.Assert.assertNull(estimateFileData1);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0009");
        int int0 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.getListCount();
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0010");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.find("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        org.junit.Assert.assertNull(estimateFileData1);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0011");
        java.lang.String str0 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.listToString();
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "" + "'", str0, "");
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0012");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getFromDb("hi!", (int) (byte) 1, 10, filetypeEnum3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0013");
        int int0 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.getListCount();
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0014");
        java.lang.String str0 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.outbasedir;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "out/BigDB/" + "'", str0, "out/BigDB/");
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0015");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.clearList();
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0016");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData> cashFileDataList0 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.getCashfdList();
        org.junit.Assert.assertNotNull(cashFileDataList0);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0017");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readSipData("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0018");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getFromDb("Cash File Data", (int) (byte) -1, (int) (short) 1, filetypeEnum3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0019");
        java.lang.String[] strArray6 = new java.lang.String[] { "out/BigDB/", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "Cash File Data", "hi!" };
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
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0020");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getExchangeStr(exchEnum0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0021");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getFromDb("out/BigDB/", (-1), (int) (short) 0, filetypeEnum3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0022");
        java.lang.String str0 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.listToString();
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "" + "'", str0, "");
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0023");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.find("");
        org.junit.Assert.assertNull(estimateFileData1);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0024");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.parseSipData((int) (short) 100, 0, filetypeEnum2);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0025");
        int int0 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.getListCount();
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0026");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.clearList();
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0027");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readSipData("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "hi!");
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0028");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        companyFileData1.setPhone("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        // The following exception was thrown during execution in test generation
        try {
            companyFileData1.setExchange("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No enum constant net.ajaskey.market.tools.SIP.BigDB.ExchEnum.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0029");
        java.lang.String str0 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.inbasedir;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "data/BigDB/" + "'", str0, "data/BigDB/");
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0030");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setPrice("hi!");
        sharesFileData1.setMktCap("");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0031");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList7);
        balSheetFileData1.setNameFields(companyFileData9);
        double[] doubleArray11 = balSheetFileData1.getOtherLtAssetsYr();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(companyFileData9);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0032");
        java.lang.String str0 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.listToString();
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "" + "'", str0, "");
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0033");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.clearList();
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0034");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.clearList();
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0035");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getAdjToIncQtr();
        double[] doubleArray3 = incSheetFileData1.getGrossOpIncQtr();
        double[] doubleArray4 = incSheetFileData1.getUnusualIncYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0036");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = companyFileData1.getExchangeStr();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0037");
        java.lang.String[] strArray4 = new java.lang.String[] { "data/BigDB/", "hi!", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/" };
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
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0038");
        java.lang.String str0 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.listToString();
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "" + "'", str0, "");
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0039");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        sharesFileData1.setVolume10d("out/BigDB/");
        double[] doubleArray11 = new double[] { ' ', (short) -1, 100.0f };
        sharesFileData1.setSharesQ(doubleArray11);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getTtm(doubleArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[32.0, -1.0, 100.0]");
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0040");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setInstBuyShrs("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        sharesFileData1.setInstSellShrs("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0041");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.clearList();
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0042");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        sharesFileData1.setInstBuyShrs("out/BigDB/");
        sharesFileData1.setDollar3m("hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0043");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getOtherCurrLiabYr();
        double[] doubleArray3 = balSheetFileData1.getEquityQtr();
        double[] doubleArray4 = balSheetFileData1.getCurrLiabYr();
        double[] doubleArray5 = balSheetFileData1.getStInvestQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0044");
        java.lang.String[] strArray1 = new java.lang.String[] { "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.lang.String[] strArray5 = new java.lang.String[] { "out/BigDB/", "hi!", "out/BigDB/" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(strArray1, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0045");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getAdjToIncQtr();
        double[] doubleArray3 = incSheetFileData1.getGrossOpIncQtr();
        java.lang.String str4 = incSheetFileData1.getTicker();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0046");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInsiderSellShrs("Cash File Data");
        int int4 = sharesFileData1.getInstSellShrs();
        int int5 = sharesFileData1.getInsiderSells();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0047");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        sharesFileData1.setVolume10d("out/BigDB/");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum8 = sharesFileData1.getExchange();
        sharesFileData1.setDollar3m("");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNull(exchEnum8);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0048");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.setMemory((int) (short) 10, (int) (short) 1, filetypeEnum2);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0049");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readSipData("", "data/BigDB/");
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0050");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        java.lang.String str6 = sharesFileData1.getSector();
        sharesFileData1.setFloatshr("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = sharesFileData1.toDbOutput();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0051");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.setMemory((int) '#', (int) '4', filetypeEnum2);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0052");
        int int0 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.getListCount();
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0053");
        int int0 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.getListCount();
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0054");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getFloatshr();
        sharesFileData1.setDollar3m("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        java.lang.String str5 = sharesFileData1.getTicker();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0055");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        java.lang.String str4 = companyFileData1.getStreet();
        companyFileData1.setState("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0056");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        java.lang.String str1 = cashFileData0.toDbOutput();
        java.lang.String str2 = cashFileData0.toString();
        java.lang.String str3 = cashFileData0.getTicker();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Cash File Data" + "'", str2, "Cash File Data");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0057");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getLtDebtYr();
        double[] doubleArray3 = balSheetFileData1.getLtInvestQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0058");
        java.lang.String str0 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.listToString();
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "" + "'", str0, "");
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0059");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "data/BigDB/", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "" };
        java.lang.String[] strArray12 = new java.lang.String[] { "data/BigDB/", "Cash File Data", "out/BigDB/", "data/BigDB/", "Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData13 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(strArray5, strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0060");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        java.lang.String str4 = companyFileData1.getStreet();
        companyFileData1.setPhone("");
        companyFileData1.setAdr("out/BigDB/");
        java.lang.String str9 = companyFileData1.getSic();
        // The following exception was thrown during execution in test generation
        try {
            companyFileData1.setExchange("out/BigDB/");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No enum constant net.ajaskey.market.tools.SIP.BigDB.ExchEnum.out/BigDB/");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0061");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        java.lang.String str1 = cashFileData0.toDbOutput();
        double[] doubleArray2 = cashFileData0.getCashFromFinQtr();
        double[] doubleArray3 = cashFileData0.getCashFromInvQtr();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0062");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getOtherCurrLiabYr();
        double[] doubleArray3 = balSheetFileData1.getCurrAssetsQtr();
        java.lang.String str4 = balSheetFileData1.getExchange();
        double[] doubleArray5 = balSheetFileData1.getCurrAssetsYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0063");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData> companyFileDataList0 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.getList();
        org.junit.Assert.assertNotNull(companyFileDataList0);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0064");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        java.lang.String str6 = sharesFileData1.getSector();
        sharesFileData1.setFloatshr("");
        sharesFileData1.setVolume10d("Cash File Data");
        int int11 = sharesFileData1.getInsiderSellShrs();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0065");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getFromMemory("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", 0, (-1));
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0066");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getFloatshr();
        sharesFileData1.setDollar3m("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        double double5 = sharesFileData1.getPrice52hi();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0067");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        sharesFileData1.setVolume10d("out/BigDB/");
        double[] doubleArray8 = sharesFileData1.getSharesYr();
        sharesFileData1.setInstOwnership("data/BigDB/");
        long long11 = sharesFileData1.getVolume10d();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0068");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getQFromDb((int) 'a', (int) (short) 10, filetypeEnum2);
        org.junit.Assert.assertNull(fieldDataList3);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0069");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readSipData("Cash File Data", "hi!");
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0070");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        java.lang.String str4 = companyFileData1.getStreet();
        companyFileData1.setPhone("");
        companyFileData1.setState("out/BigDB/");
        companyFileData1.setState("out/BigDB/");
        java.lang.String str11 = companyFileData1.getCity();
        java.lang.String str12 = companyFileData1.getSic();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0071");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, (int) (byte) -1);
        java.lang.String str3 = fieldData2.getIndustry();
        fieldData2.setQuarter(0);
        fieldData2.setQuarter((int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0072");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getStInvestQtr();
        double[] doubleArray3 = balSheetFileData1.getEquityQtr();
        java.lang.String str4 = balSheetFileData1.getIndustry();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0073");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        java.lang.String str1 = cashFileData0.toDbOutput();
        double[] doubleArray2 = cashFileData0.getCashFromFinQtr();
        double[] doubleArray3 = cashFileData0.getCashFromOpsQtr();
        java.lang.String str4 = cashFileData0.toDbOutput();
        java.lang.String str5 = cashFileData0.toDbOutput();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0074");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        java.lang.String str4 = companyFileData1.getStreet();
        companyFileData1.setPhone("");
        companyFileData1.setAdr("out/BigDB/");
        java.lang.String str9 = companyFileData1.getSic();
        companyFileData1.setState("data/BigDB/");
        java.lang.String str12 = companyFileData1.getZip();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0075");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.find("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        org.junit.Assert.assertNull(balSheetFileData1);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0076");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0077");
        java.lang.String[] strArray6 = new java.lang.String[] { "data/BigDB/", "data/BigDB/", "data/BigDB/", "Cash File Data", "Cash File Data", "out/BigDB/" };
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
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0078");
        java.lang.String[] strArray2 = new java.lang.String[] { "out/BigDB/", "out/BigDB/" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData3 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(strArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0079");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getFromDb("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", (int) (byte) 0, (int) (byte) 10, filetypeEnum3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0080");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getFloatshr();
        int int3 = sharesFileData1.getInsiderSells();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0081");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInsiderSellShrs("Cash File Data");
        int int4 = sharesFileData1.getInstSellShrs();
        java.lang.Class<?> wildcardClass5 = sharesFileData1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0082");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getAdjToIncQtr();
        double[] doubleArray3 = incSheetFileData1.getGrossOpIncQtr();
        double[] doubleArray4 = incSheetFileData1.getIncTaxQtr();
        double[] doubleArray5 = incSheetFileData1.getEpsDilContQtr();
        double[] doubleArray6 = incSheetFileData1.getGrossIncYr();
        java.lang.String str7 = incSheetFileData1.getTicker();
        double[] doubleArray8 = incSheetFileData1.getEpsDilContYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0083");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readSipData("", "Cash File Data");
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0084");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        java.lang.String str1 = cashFileData0.toDbOutput();
        double[] doubleArray2 = cashFileData0.getCashFromFinQtr();
        double[] doubleArray3 = cashFileData0.getCashFromOpsQtr();
        java.lang.String str4 = cashFileData0.toDbOutput();
        double[] doubleArray5 = cashFileData0.getCashFromOpsQtr();
        double[] doubleArray6 = cashFileData0.getCapExQtr();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0085");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        java.lang.String str4 = companyFileData1.getStreet();
        companyFileData1.setPhone("");
        companyFileData1.setState("out/BigDB/");
        java.lang.String str9 = companyFileData1.getWeb();
        companyFileData1.setZip("");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0086");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        java.lang.String str4 = companyFileData1.getStreet();
        companyFileData1.setPhone("");
        companyFileData1.setAdr("out/BigDB/");
        java.lang.String str9 = companyFileData1.getCountry();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0087");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertNotNull(cashFileData8);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0088");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData1);
        companyFileData2.setTicker("");
        estimateFileData0.setNameFields(companyFileData2);
        java.lang.String str6 = estimateFileData0.getName();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData0);
        net.ajaskey.common.DateTime dateTime8 = estimateFileData0.getCurrFiscalYear();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(dateTime8);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0089");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData1);
        companyFileData2.setTicker("");
        estimateFileData0.setNameFields(companyFileData2);
        companyFileData2.setCity("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = companyFileData2.getExchangeStr();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0090");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        java.lang.String str1 = cashFileData0.toString();
        double[] doubleArray2 = cashFileData0.getCashFromInvQtr();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Cash File Data" + "'", str1, "Cash File Data");
        org.junit.Assert.assertNull(doubleArray2);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0091");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!", "", "data/BigDB/" };
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
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0092");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getStInvestQtr();
        double[] doubleArray3 = balSheetFileData1.getOtherLtAssetsYr();
        double[] doubleArray4 = balSheetFileData1.getOtherLtAssetsQtr();
        double[] doubleArray5 = balSheetFileData1.getOtherLtLiabYr();
        double[] doubleArray6 = balSheetFileData1.getAcctRxQtr();
        double[] doubleArray7 = balSheetFileData1.getNetFixedAssetsQtr();
        double[] doubleArray8 = balSheetFileData1.getLiabEquityQtr();
        double[] doubleArray9 = balSheetFileData1.getPrefStockQtr();
        double[] doubleArray10 = balSheetFileData1.getAcctPayableYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0093");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readSipData("");
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0094");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.find("out/BigDB/");
        org.junit.Assert.assertNull(sharesFileData1);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0095");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInsiderSellShrs("Cash File Data");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData5 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData4);
        double double6 = sharesFileData5.getInsiderNetPercentOutstanding();
        sharesFileData5.setFromReport((int) (short) -1, (-1));
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData[] sharesFileDataArray10 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData[] { sharesFileData1, sharesFileData5 };
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData> sharesFileDataList11 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData>) sharesFileDataList11, sharesFileDataArray10);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.setSfdList((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData>) sharesFileDataList11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.setSfdList((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData>) sharesFileDataList11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.setSfdList((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData>) sharesFileDataList11);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(sharesFileDataArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0096");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getFromMemory("Cash File Data", 1, 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0097");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getFromMemory("data/BigDB/", (int) (byte) 10, (int) (byte) 1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0098");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getStInvestQtr();
        double[] doubleArray3 = balSheetFileData1.getOtherLtAssetsYr();
        double[] doubleArray4 = balSheetFileData1.getOtherLtAssetsQtr();
        double[] doubleArray5 = balSheetFileData1.getOtherLtLiabYr();
        double[] doubleArray6 = balSheetFileData1.getAcctRxQtr();
        double[] doubleArray7 = balSheetFileData1.getNetFixedAssetsQtr();
        double[] doubleArray8 = balSheetFileData1.getStInvestYr();
        double[] doubleArray9 = balSheetFileData1.getStInvestYr();
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
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0099");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInsiderSellShrs("Cash File Data");
        int int4 = sharesFileData1.getInstSellShrs();
        int int5 = sharesFileData1.getInsiderBuys();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0100");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getAdjToIncQtr();
        double[] doubleArray3 = incSheetFileData1.getGrossOpIncQtr();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData11 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList9);
        companyFileData11.setSector("out/BigDB/");
        java.lang.String str14 = companyFileData11.getPhone();
        incSheetFileData1.setNameFields(companyFileData11);
        double[] doubleArray16 = incSheetFileData1.getAdjToIncQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(companyFileData11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(doubleArray16);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0101");
        java.lang.String[] strArray2 = new java.lang.String[] { "Cash File Data", "" };
        java.lang.String[] strArray8 = new java.lang.String[] { "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "", "data/BigDB/", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData9 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(strArray2, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0102");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getIncTaxYr();
        java.lang.String str3 = incSheetFileData1.toDbOutput();
        double[] doubleArray4 = incSheetFileData1.getGrossIncQtr();
        java.lang.String str5 = incSheetFileData1.getSector();
        double[] doubleArray6 = incSheetFileData1.getPreTaxIncYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0103");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        java.lang.String str4 = companyFileData1.getStreet();
        companyFileData1.setPhone("");
        companyFileData1.setState("out/BigDB/");
        java.lang.String str9 = companyFileData1.getWeb();
        boolean boolean10 = companyFileData1.isAdr();
        java.lang.String str11 = companyFileData1.getSnpIndexStr();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0104");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getIncTaxYr();
        double[] doubleArray3 = incSheetFileData1.getNetIncQtr();
        double[] doubleArray4 = incSheetFileData1.getGrossOpIncYr();
        double[] doubleArray5 = incSheetFileData1.getPreTaxIncYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0105");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) 'a', 1);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0106");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData7);
        companyFileData8.setTicker("");
        estimateFileData6.setNameFields(companyFileData8);
        sharesFileData1.setNameFields(companyFileData8);
        sharesFileData1.setVolume3m("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        double double15 = sharesFileData1.getDollar3m();
        int int16 = sharesFileData1.getInstSellShrs();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0107");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readSipData("data/BigDB/");
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0108");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        sharesFileData1.setInstBuyShrs("out/BigDB/");
        java.lang.String str8 = sharesFileData1.getTicker();
        sharesFileData1.setFloatshr("hi!");
        int int11 = sharesFileData1.getInsiderSells();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0109");
        java.lang.String[] strArray6 = new java.lang.String[] { "out/BigDB/", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "hi!", "out/BigDB/", "", "Cash File Data" };
        java.lang.String[] strArray10 = new java.lang.String[] { "Cash File Data", "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
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
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0110");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getQFromDb((int) '#', 0, filetypeEnum2);
        org.junit.Assert.assertNull(fieldDataList3);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0111");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "Cash File Data", "", "Cash File Data" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        sharesFileData7.setInstOwnership("Cash File Data");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(sharesFileData7);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0112");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getCogsYr();
        double[] doubleArray3 = incSheetFileData1.getGrossIncYr();
        double[] doubleArray4 = incSheetFileData1.getIncPrimaryEpsYr();
        double[] doubleArray5 = incSheetFileData1.getIntExpNonOpYr();
        double[] doubleArray6 = incSheetFileData1.getIntExpYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0113");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        java.lang.String str4 = companyFileData1.getStreet();
        companyFileData1.setPhone("");
        companyFileData1.setState("out/BigDB/");
        companyFileData1.setState("out/BigDB/");
        java.lang.String str11 = companyFileData1.getCity();
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum12 = companyFileData1.getSnpIndex();
        java.lang.String str13 = companyFileData1.getWeb();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(snpEnum12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0114");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInsiderSellShrs("Cash File Data");
        sharesFileData1.setInsiderBuys("hi!");
        sharesFileData1.setFloatshr("Cash File Data");
        long long8 = sharesFileData1.getVolumeMonth3m();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0115");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear(0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter2 = fieldDataYear1.getQ4();
        org.junit.Assert.assertNull(fieldDataQuarter2);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0116");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getStInvestQtr();
        double[] doubleArray3 = balSheetFileData1.getOtherLtAssetsYr();
        double[] doubleArray4 = balSheetFileData1.getOtherLtAssetsQtr();
        double[] doubleArray5 = balSheetFileData1.getOtherLtLiabYr();
        double[] doubleArray6 = balSheetFileData1.getAcctRxQtr();
        double[] doubleArray7 = balSheetFileData1.getNetFixedAssetsYr();
        double[] doubleArray8 = balSheetFileData1.getGoodwillYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0117");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getIncTaxYr();
        java.lang.String str3 = incSheetFileData1.toDbOutput();
        double[] doubleArray4 = incSheetFileData1.getEpsQtr();
        double[] doubleArray5 = incSheetFileData1.getRdQtr();
        double[] doubleArray6 = incSheetFileData1.getPreTaxIncQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0118");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        java.lang.String str4 = companyFileData1.getStreet();
        companyFileData1.setPhone("");
        companyFileData1.setState("out/BigDB/");
        java.lang.String str9 = companyFileData1.getZip();
        int int10 = companyFileData1.getNumEmployees();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0119");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readSipData("hi!", "hi!");
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0120");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, (int) (byte) -1);
        java.lang.String str3 = fieldData2.getIndustry();
        fieldData2.setQuarter(0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData6 = fieldData2.getCashData();
        double[] doubleArray7 = cashFileData6.getCashFromFinQtr();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(cashFileData6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0121");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getLiabEquityQtr();
        double[] doubleArray3 = balSheetFileData1.getTotalAssetsQtr();
        double[] doubleArray4 = balSheetFileData1.getCurrLiabQtr();
        double[] doubleArray5 = balSheetFileData1.getGoodwillYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0122");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInsiderSellShrs("Cash File Data");
        double double4 = sharesFileData1.getBeta();
        double double5 = sharesFileData1.getInsiderNetPercentOutstanding();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0123");
        java.lang.String[] strArray3 = new java.lang.String[] { "Cash File Data", "", "Cash File Data" };
        java.lang.String[] strArray7 = new java.lang.String[] { "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "", "data/BigDB/" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(strArray3, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0124");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        java.lang.String str4 = companyFileData1.getStreet();
        companyFileData1.setPhone("");
        java.lang.String str7 = companyFileData1.getSector();
        java.lang.String str8 = companyFileData1.getTicker();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = companyFileData1.getExchangeStr();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0125");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.find("data/BigDB/");
        org.junit.Assert.assertNull(sharesFileData1);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0126");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        java.lang.String str3 = sharesFileData1.toString();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0127");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        java.lang.String str6 = sharesFileData1.getSector();
        sharesFileData1.setInstShareholders("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        double double9 = sharesFileData1.getPrice();
        double[] doubleArray10 = sharesFileData1.getSharesYr();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0128");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(strArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0129");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getFloatshr();
        sharesFileData1.setDollar3m("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData5);
        companyFileData6.setTicker("");
        java.lang.String str9 = companyFileData6.getStreet();
        companyFileData6.setPhone("");
        companyFileData6.setState("out/BigDB/");
        java.lang.String str14 = companyFileData6.getWeb();
        boolean boolean15 = companyFileData6.isAdr();
        sharesFileData1.setNameFields(companyFileData6);
        double[] doubleArray17 = companyFileData6.getPriceQtr();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(doubleArray17);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0130");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInsiderSellShrs("Cash File Data");
        sharesFileData1.setInsiderBuys("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = sharesFileData1.toDbOutput();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0131");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData1);
        companyFileData2.setTicker("");
        estimateFileData0.setNameFields(companyFileData2);
        java.lang.String str6 = estimateFileData0.toDbOutput();
        double double7 = estimateFileData0.getEpsY2();
        java.lang.String str8 = estimateFileData0.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0132");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getLiabEquityQtr();
        double[] doubleArray3 = balSheetFileData1.getTotalAssetsQtr();
        double[] doubleArray4 = balSheetFileData1.getCurrLiabQtr();
        java.lang.String str5 = balSheetFileData1.toDbOutput();
        java.lang.String str6 = balSheetFileData1.getIndustry();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0133");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getFromDb("data/BigDB/", 10, 35, filetypeEnum3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0134");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.parseSipData((int) (short) 1, (int) (short) -1, filetypeEnum2);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0135");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        java.lang.String str1 = cashFileData0.toDbOutput();
        double[] doubleArray2 = cashFileData0.getCashFromFinQtr();
        double[] doubleArray3 = cashFileData0.getCashFromOpsQtr();
        java.lang.String str4 = cashFileData0.toDbOutput();
        double[] doubleArray5 = cashFileData0.getCashFromOpsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData0);
        double[] doubleArray7 = cashFileData6.getCashFromInvQtr();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0136");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInsiderSellShrs("Cash File Data");
        sharesFileData1.setInsiderBuys("hi!");
        double double6 = sharesFileData1.getBeta();
        sharesFileData1.setDollar3m("hi!");
        double double9 = sharesFileData1.getPrice52hi();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0137");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData1);
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum3 = companyFileData2.getExchange();
        companyFileData2.setState("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        org.junit.Assert.assertNull(exchEnum3);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0138");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData> companyFileDataList0 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.getCfdList();
        org.junit.Assert.assertNotNull(companyFileDataList0);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0139");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        java.lang.String str1 = cashFileData0.toDbOutput();
        java.lang.String str2 = cashFileData0.toString();
        double[] doubleArray3 = cashFileData0.getCashFromInvQtr();
        java.lang.String str4 = cashFileData0.getTicker();
        java.lang.String str5 = cashFileData0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Cash File Data" + "'", str2, "Cash File Data");
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cash File Data" + "'", str5, "Cash File Data");
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0140");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.find("data/BigDB/");
        org.junit.Assert.assertNull(estimateFileData1);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0141");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        java.lang.String str1 = cashFileData0.toDbOutput();
        java.lang.String str2 = cashFileData0.toString();
        double[] doubleArray3 = cashFileData0.getCashFromInvQtr();
        java.lang.String str4 = cashFileData0.toDbOutput();
        java.lang.String str5 = cashFileData0.getTicker();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Cash File Data" + "'", str2, "Cash File Data");
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0142");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getStInvestQtr();
        double[] doubleArray3 = balSheetFileData1.getOtherLtAssetsYr();
        double[] doubleArray4 = balSheetFileData1.getOtherLtAssetsQtr();
        double[] doubleArray5 = balSheetFileData1.getOtherLtLiabYr();
        double[] doubleArray6 = balSheetFileData1.getInventoryYr();
        double[] doubleArray7 = balSheetFileData1.getGoodwillQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0143");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getCurrAssetsYr();
        org.junit.Assert.assertNull(doubleArray2);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0144");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getCogsYr();
        double[] doubleArray3 = incSheetFileData1.getGrossIncYr();
        double[] doubleArray4 = incSheetFileData1.getIncPrimaryEpsYr();
        double[] doubleArray5 = incSheetFileData1.getPreTaxIncQtr();
        double[] doubleArray6 = incSheetFileData1.getIntExpQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0145");
        java.lang.String str4 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getOutfileName((int) (short) 10, 1, "data/BigDB/", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" + "'", str4, "out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0146");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList7);
        balSheetFileData1.setNameFields(companyFileData9);
        double[] doubleArray11 = balSheetFileData1.getStDebtYr();
        double[] doubleArray12 = balSheetFileData1.getEquityQtr();
        double[] doubleArray13 = balSheetFileData1.getOtherCurrAssetsQtr();
        double[] doubleArray14 = balSheetFileData1.getGoodwillQtr();
        double[] doubleArray15 = balSheetFileData1.getLtInvestQtr();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(companyFileData9);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(doubleArray14);
        org.junit.Assert.assertNull(doubleArray15);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0147");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getCogsYr();
        double[] doubleArray3 = incSheetFileData1.getGrossIncYr();
        double[] doubleArray4 = incSheetFileData1.getIncPrimaryEpsYr();
        double[] doubleArray5 = incSheetFileData1.getDividendQtr();
        double[] doubleArray6 = incSheetFileData1.getAdjToIncYr();
        double[] doubleArray7 = incSheetFileData1.getIncPrimaryEpsQtr();
        double[] doubleArray8 = incSheetFileData1.getRdYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0148");
        java.lang.String[] strArray0 = null;
        java.lang.String[] strArray2 = new java.lang.String[] { "data/BigDB/" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData3 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(strArray0, strArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0149");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        java.lang.String str1 = cashFileData0.toDbOutput();
        double[] doubleArray2 = cashFileData0.getCashFromOpsQtr();
        double[] doubleArray3 = cashFileData0.getCashFromInvQtr();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0150");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        java.lang.String str4 = companyFileData1.getStreet();
        companyFileData1.setPhone("");
        companyFileData1.setState("out/BigDB/");
        companyFileData1.setState("out/BigDB/");
        java.lang.String str11 = companyFileData1.getCity();
        java.lang.String str12 = companyFileData1.getCity();
        java.lang.String str13 = companyFileData1.getCountry();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0151");
        java.lang.String[] strArray7 = new java.lang.String[] { "out/BigDB/", "Cash File Data", "Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory((java.util.List<java.lang.String>) strList8, (int) (byte) 100, 1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter13 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter(100, (int) (byte) -1, fieldDataList12);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = fieldDataQuarter13.fieldDataList;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = fieldDataQuarter13.fieldDataList;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = fieldDataQuarter13.fieldDataList;
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList14);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(fieldDataList16);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0152");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        companyFileData1.setSector("data/BigDB/");
        java.lang.String[] strArray11 = new java.lang.String[] { "out/BigDB/", "Cash File Data", "Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory((java.util.List<java.lang.String>) strList12, (int) (byte) 100, 1);
        java.util.List<java.lang.String> strList17 = companyFileData1.set((java.util.List<java.lang.String>) strList12);
        java.lang.String str18 = companyFileData1.getCountry();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = companyFileData1.toDbOuput();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(fieldDataList16);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0153");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getCogsYr();
        double[] doubleArray3 = incSheetFileData1.getEpsDilContYr();
        double[] doubleArray4 = incSheetFileData1.getIntExpQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0154");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getLiabEquityQtr();
        double[] doubleArray3 = balSheetFileData1.getLtInvestYr();
        double[] doubleArray4 = balSheetFileData1.getBvpsYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0155");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readSipData("");
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0156");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getFromMemory("", (int) (byte) 100, (int) 'a');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0157");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInsiderSellShrs("Cash File Data");
        java.lang.String str4 = sharesFileData1.getTicker();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0158");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        java.lang.String str4 = companyFileData1.getStreet();
        companyFileData1.setPhone("");
        companyFileData1.setState("out/BigDB/");
        java.lang.String str9 = companyFileData1.getStreet();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0159");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.find("hi!");
        org.junit.Assert.assertNull(cashFileData1);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0160");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInsiderSellShrs("Cash File Data");
        sharesFileData1.setFromReport((int) '4', (int) (short) 0);
        double double7 = sharesFileData1.getPrice52hi();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0161");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getStInvestQtr();
        double[] doubleArray3 = balSheetFileData1.getOtherLtAssetsYr();
        double[] doubleArray4 = balSheetFileData1.getOtherLtAssetsQtr();
        double[] doubleArray5 = balSheetFileData1.getOtherLtLiabYr();
        double[] doubleArray6 = balSheetFileData1.getAcctRxQtr();
        java.lang.String str7 = balSheetFileData1.getTicker();
        double[] doubleArray8 = balSheetFileData1.getAcctPayableYr();
        double[] doubleArray9 = balSheetFileData1.getNetFixedAssetsYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0162");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList7);
        balSheetFileData1.setNameFields(companyFileData9);
        double[] doubleArray11 = balSheetFileData1.getEquityQtr();
        java.lang.String str12 = balSheetFileData1.getTicker();
        double[] doubleArray13 = balSheetFileData1.getLtDebtYr();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(companyFileData9);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(doubleArray13);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0163");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        java.lang.String str4 = companyFileData1.getStreet();
        companyFileData1.setPhone("");
        java.lang.String str7 = companyFileData1.getSector();
        java.lang.String str8 = companyFileData1.getIndustry();
        boolean boolean9 = companyFileData1.isAdr();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0164");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum1 = companyFileData0.getSnpIndex();
        org.junit.Assert.assertNull(snpEnum1);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0165");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getFromDb("Cash File Data", (int) (byte) 10, (int) (short) 1, filetypeEnum3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0166");
        java.lang.String str0 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.listToString();
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "" + "'", str0, "");
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0167");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getAdjToIncQtr();
        double[] doubleArray3 = incSheetFileData1.getGrossOpIncQtr();
        double[] doubleArray4 = incSheetFileData1.getIncTaxQtr();
        double[] doubleArray5 = incSheetFileData1.getEpsDilContQtr();
        double[] doubleArray6 = incSheetFileData1.getIncTaxQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0168");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getAdjToIncQtr();
        double[] doubleArray3 = incSheetFileData1.getGrossOpIncQtr();
        double[] doubleArray4 = incSheetFileData1.getIncTaxQtr();
        double[] doubleArray5 = incSheetFileData1.getEpsDilContQtr();
        double[] doubleArray6 = incSheetFileData1.getGrossIncYr();
        java.lang.String str7 = incSheetFileData1.getTicker();
        double[] doubleArray8 = incSheetFileData1.getIncPrimaryEpsYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0169");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInsiderSellShrs("Cash File Data");
        sharesFileData1.setInsiderBuys("hi!");
        sharesFileData1.setFloatshr("Cash File Data");
        sharesFileData1.setFromReport((int) ' ', (int) (byte) 100);
        int int11 = sharesFileData1.getInsiderNetTrades();
        long long12 = sharesFileData1.getVolume10d();
        sharesFileData1.setMktCap("out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0170");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList7);
        balSheetFileData1.setNameFields(companyFileData9);
        double[] doubleArray11 = balSheetFileData1.getStDebtYr();
        double[] doubleArray12 = balSheetFileData1.getTotalLiabQtr();
        java.lang.String str13 = balSheetFileData1.getExchange();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(companyFileData9);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0171");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList7);
        balSheetFileData1.setNameFields(companyFileData9);
        double[] doubleArray11 = balSheetFileData1.getStDebtYr();
        double[] doubleArray12 = balSheetFileData1.getEquityQtr();
        double[] doubleArray13 = balSheetFileData1.getNetFixedAssetsYr();
        double[] doubleArray14 = balSheetFileData1.getNetFixedAssetsYr();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(companyFileData9);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(doubleArray14);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0172");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getIncTaxYr();
        java.lang.String str3 = incSheetFileData1.toDbOutput();
        double[] doubleArray4 = incSheetFileData1.getGrossIncQtr();
        double[] doubleArray5 = incSheetFileData1.getDepreciationQtr();
        double[] doubleArray6 = incSheetFileData1.getTotalOpExpYr();
        double[] doubleArray7 = incSheetFileData1.getIntExpNonOpYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0173");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getFloatshr();
        sharesFileData1.setDollar3m("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        int int5 = sharesFileData1.getInsiderBuyShrs();
        sharesFileData1.setInsiderNetTrades("out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0174");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getAdjToIncQtr();
        double[] doubleArray3 = incSheetFileData1.getGrossOpIncQtr();
        double[] doubleArray4 = incSheetFileData1.getEpsDilContQtr();
        double[] doubleArray5 = incSheetFileData1.getRdQtr();
        double[] doubleArray6 = incSheetFileData1.getOtherIncQtr();
        double[] doubleArray7 = incSheetFileData1.getTotalOpExpYr();
        double[] doubleArray8 = incSheetFileData1.getEpsDilQtr();
        double[] doubleArray9 = incSheetFileData1.getIncAfterTaxYr();
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
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0175");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData1);
        java.lang.String str3 = companyFileData2.getSnpIndexStr();
        companyFileData2.setPhone("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0176");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum3 = incSheetFileData1.getExchange();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(exchEnum3);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0177");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList7);
        balSheetFileData1.setNameFields(companyFileData9);
        companyFileData9.setStreet("data/BigDB/");
        companyFileData9.setWeb("out/BigDB/");
        companyFileData9.setSnpIndex("out/BigDB/");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(companyFileData9);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0178");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getStInvestQtr();
        double[] doubleArray3 = balSheetFileData1.getOtherLtAssetsYr();
        double[] doubleArray4 = balSheetFileData1.getOtherLtAssetsQtr();
        double[] doubleArray5 = balSheetFileData1.getOtherLtLiabYr();
        double[] doubleArray6 = balSheetFileData1.getAcctRxQtr();
        double[] doubleArray7 = balSheetFileData1.getNetFixedAssetsQtr();
        double[] doubleArray8 = balSheetFileData1.getTotalAssetsQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0179");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(strArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0180");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInsiderSellShrs("Cash File Data");
        sharesFileData1.setInsiderBuys("hi!");
        sharesFileData1.setFloatshr("Cash File Data");
        sharesFileData1.setFromReport((int) ' ', (int) (byte) 100);
        int int11 = sharesFileData1.getInsiderNetTrades();
        long long12 = sharesFileData1.getVolume10d();
        int int13 = sharesFileData1.getInsiderNetTrades();
        java.lang.String str14 = sharesFileData1.getSector();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0181");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getIncTaxYr();
        double[] doubleArray3 = incSheetFileData1.getNetIncQtr();
        double[] doubleArray4 = incSheetFileData1.getAdjToIncYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData1);
        java.lang.Class<?> wildcardClass6 = incSheetFileData5.getClass();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0182");
        java.lang.String[] strArray2 = new java.lang.String[] { "data/BigDB/", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData3 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(strArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0183");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        sharesFileData1.setFromReport((int) (short) -1, (int) (byte) 10);
        double double9 = sharesFileData1.getDollar3m();
        java.lang.String str10 = sharesFileData1.getSector();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0184");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        sharesFileData8.setMktCap("out/BigDB/");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertNotNull(sharesFileData8);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0185");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        java.lang.String str1 = cashFileData0.toDbOutput();
        double[] doubleArray2 = cashFileData0.getCashFromFinQtr();
        double[] doubleArray3 = cashFileData0.getCashFromOpsQtr();
        java.lang.String str4 = cashFileData0.toDbOutput();
        double[] doubleArray5 = cashFileData0.getCashFromOpsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData0);
        java.lang.String str7 = cashFileData0.toString();
        double[] doubleArray8 = cashFileData0.getCashFromInvQtr();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cash File Data" + "'", str7, "Cash File Data");
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0186");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, (int) (byte) -1);
        java.lang.String str3 = fieldData2.getSector();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = fieldData2.getShareData();
        sharesFileData4.setInsiderSells("data/BigDB/");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(sharesFileData4);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0187");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.find("hi!");
        org.junit.Assert.assertNull(companyFileData1);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0188");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getAdjToIncQtr();
        double[] doubleArray3 = incSheetFileData1.getGrossOpIncQtr();
        double[] doubleArray4 = incSheetFileData1.getIncTaxQtr();
        double[] doubleArray5 = incSheetFileData1.getEpsDilContQtr();
        java.lang.String str6 = incSheetFileData1.getTicker();
        double[] doubleArray7 = incSheetFileData1.getPreTaxIncQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0189");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getOtherCurrLiabYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData3 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray4 = balSheetFileData1.getAcctPayableYr();
        double[] doubleArray5 = balSheetFileData1.getCurrAssetsQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0190");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        java.lang.String str4 = companyFileData1.getStreet();
        companyFileData1.setPhone("");
        java.lang.String str7 = companyFileData1.getSector();
        companyFileData1.setStreet("out/BigDB/");
        java.lang.String str10 = companyFileData1.getName();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0191");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear(0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter2 = fieldDataYear1.getQ2();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter3 = fieldDataYear1.getQ2();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter4 = fieldDataYear1.getQ4();
        boolean boolean5 = fieldDataYear1.isInUse();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter6 = fieldDataYear1.getQ2();
        boolean boolean8 = fieldDataYear1.quarterDataAvailable(0);
        org.junit.Assert.assertNull(fieldDataQuarter2);
        org.junit.Assert.assertNull(fieldDataQuarter3);
        org.junit.Assert.assertNull(fieldDataQuarter4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(fieldDataQuarter6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0192");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList7);
        balSheetFileData1.setNameFields(companyFileData9);
        double[] doubleArray11 = balSheetFileData1.getStDebtYr();
        double[] doubleArray12 = balSheetFileData1.getTotalLiabQtr();
        double[] doubleArray13 = balSheetFileData1.getEquityYr();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(companyFileData9);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0193");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getStInvestQtr();
        double[] doubleArray3 = balSheetFileData1.getLtInvestYr();
        double[] doubleArray4 = balSheetFileData1.getOtherCurrLiabYr();
        java.lang.String str5 = balSheetFileData1.toDbOutput();
        java.lang.String str6 = balSheetFileData1.getTicker();
        double[] doubleArray7 = balSheetFileData1.getNetFixedAssetsQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0194");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getIncTaxYr();
        double[] doubleArray3 = incSheetFileData1.getPreTaxIncQtr();
        double[] doubleArray4 = incSheetFileData1.getEpsDilYr();
        double[] doubleArray5 = incSheetFileData1.getEpsDilContQtr();
        double[] doubleArray6 = incSheetFileData1.getIntExpQtr();
        double[] doubleArray7 = incSheetFileData1.getUnusualIncQtr();
        double[] doubleArray8 = incSheetFileData1.getRdQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0195");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        double[] doubleArray8 = new double[] { 0, 1.0f, (short) 1, 100.0f, 1 };
        sharesFileData1.setSharesY(doubleArray8);
        java.lang.String str10 = sharesFileData1.getSector();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 1.0, 1.0, 100.0, 1.0]");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0196");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        companyFileData7.setSector("out/BigDB/");
        java.lang.String str10 = companyFileData7.getPhone();
        companyFileData7.setZip("out/BigDB/");
        double[] doubleArray13 = companyFileData7.getPriceQtr();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(doubleArray13);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0197");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getFromDb("out/BigDB/", (int) (byte) 0, (int) (byte) -1, filetypeEnum3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0198");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getStInvestQtr();
        double[] doubleArray3 = balSheetFileData1.getEquityQtr();
        double[] doubleArray4 = balSheetFileData1.getNetFixedAssetsQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0199");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        sharesFileData1.setInstBuyShrs("out/BigDB/");
        java.lang.String str8 = sharesFileData1.getTicker();
        sharesFileData1.setDollar3m("hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0200");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (byte) -1, (int) (byte) 1);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0201");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getAdjToIncQtr();
        double[] doubleArray3 = incSheetFileData1.getGrossOpIncQtr();
        double[] doubleArray4 = incSheetFileData1.getEpsDilContQtr();
        double[] doubleArray5 = incSheetFileData1.getEpsContQtr();
        double[] doubleArray6 = incSheetFileData1.getPreTaxIncYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0202");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        sharesFileData1.setInstBuyShrs("out/BigDB/");
        sharesFileData1.setVolume10d("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum10 = sharesFileData1.getExchange();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNull(exchEnum10);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0203");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, (int) (byte) -1);
        java.lang.String str3 = fieldData2.getIndustry();
        fieldData2.setQuarter(0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData6 = fieldData2.getCashData();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum7 = fieldData2.getExchange();
        java.lang.String str8 = fieldData2.getName();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData9 = fieldData2.getShareData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData10 = fieldData2.getCashData();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(cashFileData6);
        org.junit.Assert.assertNull(exchEnum7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(sharesFileData9);
        org.junit.Assert.assertNotNull(cashFileData10);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0204");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (byte) 10, 0);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0205");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getAdjToIncQtr();
        double[] doubleArray3 = incSheetFileData1.getGrossOpIncQtr();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData11 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList9);
        companyFileData11.setSector("out/BigDB/");
        java.lang.String str14 = companyFileData11.getPhone();
        incSheetFileData1.setNameFields(companyFileData11);
        companyFileData11.setZip("out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(companyFileData11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0206");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        java.lang.String str4 = companyFileData1.getStreet();
        companyFileData1.setWeb("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        companyFileData1.setCity("Cash File Data");
        java.lang.String str9 = companyFileData1.getStreet();
        java.lang.String str10 = companyFileData1.getState();
        java.lang.String str11 = companyFileData1.getIndustry();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0207");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInsiderSellShrs("Cash File Data");
        sharesFileData1.setInsiderBuys("hi!");
        sharesFileData1.setFloatshr("Cash File Data");
        sharesFileData1.setFromReport((int) ' ', (int) (byte) 100);
        double double11 = sharesFileData1.getInstOwnership();
        double double12 = sharesFileData1.getInsiderNetPercentOutstanding();
        int int13 = sharesFileData1.getInsiderBuyShrs();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0208");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getQFromDb((int) ' ', 1, filetypeEnum2);
        org.junit.Assert.assertNull(fieldDataList3);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0209");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList7);
        balSheetFileData1.setNameFields(companyFileData9);
        double[] doubleArray11 = balSheetFileData1.getEquityQtr();
        double[] doubleArray12 = balSheetFileData1.getLtInvestYr();
        java.lang.String str13 = balSheetFileData1.toDbOutput();
        double[] doubleArray14 = balSheetFileData1.getInventoryQtr();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(companyFileData9);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(doubleArray14);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0210");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        java.lang.String str4 = companyFileData1.getStreet();
        companyFileData1.setPhone("");
        java.lang.String str7 = companyFileData1.getSector();
        java.lang.String str8 = companyFileData1.getZip();
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum9 = companyFileData1.getDowIndex();
        java.lang.String str10 = companyFileData1.getSic();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(dowEnum9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0211");
        java.util.List<java.lang.String> strList0 = null;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory(strList0, 0, (int) (short) 10);
        org.junit.Assert.assertNotNull(fieldDataList3);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0212");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, (int) (byte) -1);
        java.lang.String str3 = fieldData2.toString();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum4 = fieldData2.getExchange();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum5 = fieldData2.getExchange();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = fieldData2.getEstimateData();
        fieldData2.setQuarter((int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(exchEnum4);
        org.junit.Assert.assertNull(exchEnum5);
        org.junit.Assert.assertNotNull(estimateFileData6);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0213");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        sharesFileData1.setVolume10d("out/BigDB/");
        double[] doubleArray11 = new double[] { ' ', (short) -1, 100.0f };
        sharesFileData1.setSharesQ(doubleArray11);
        int int13 = sharesFileData1.getInsiderNetTrades();
        double[] doubleArray14 = sharesFileData1.getSharesYr();
        int int15 = sharesFileData1.getInsiderBuys();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[32.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(doubleArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0214");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        java.lang.String str4 = companyFileData1.getStreet();
        companyFileData1.setCountry("data/BigDB/");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0215");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData0);
        double double2 = estimateFileData1.getEpsQ0();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0216");
        java.lang.String[] strArray4 = new java.lang.String[] { "data/BigDB/", "", "out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "Cash File Data" };
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "data/BigDB/", "Cash File Data" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData10 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(strArray4, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0217");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        companyFileData7.setSector("out/BigDB/");
        companyFileData7.setPhone("out/BigDB/");
        java.lang.String str12 = companyFileData7.getCountry();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0218");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        java.lang.String str4 = companyFileData1.getStreet();
        companyFileData1.setPhone("");
        companyFileData1.setAdr("out/BigDB/");
        java.lang.String str9 = companyFileData1.getSic();
        java.lang.String str10 = companyFileData1.getZip();
        int int11 = companyFileData1.getNumEmployees();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0219");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList7);
        balSheetFileData1.setNameFields(companyFileData9);
        double[] doubleArray11 = balSheetFileData1.getEquityQtr();
        double[] doubleArray12 = balSheetFileData1.getTotalAssetsQtr();
        double[] doubleArray13 = balSheetFileData1.getOtherLtAssetsYr();
        java.lang.String str14 = balSheetFileData1.getIndustry();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(companyFileData9);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0220");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        sharesFileData1.setInstBuyShrs("out/BigDB/");
        java.lang.String str8 = sharesFileData1.getTicker();
        double double9 = sharesFileData1.getBeta();
        java.lang.String str10 = sharesFileData1.toString();
        int int11 = sharesFileData1.getInstSellShrs();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0221");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInsiderSellShrs("Cash File Data");
        sharesFileData1.setInsiderSellShrs("Cash File Data");
        java.lang.String str6 = sharesFileData1.getTicker();
        int int7 = sharesFileData1.getInsiderSells();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData8 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData9 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData8);
        double double10 = sharesFileData9.getInsiderNetPercentOutstanding();
        sharesFileData9.setFromReport((int) (short) -1, (-1));
        sharesFileData9.setVolume10d("out/BigDB/");
        double[] doubleArray19 = new double[] { ' ', (short) -1, 100.0f };
        sharesFileData9.setSharesQ(doubleArray19);
        sharesFileData1.setSharesQ(doubleArray19);
        // The following exception was thrown during execution in test generation
        try {
            double double22 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getTtm(doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[32.0, -1.0, 100.0]");
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0222");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        java.lang.String str4 = companyFileData1.getStreet();
        companyFileData1.setPhone("");
        companyFileData1.setAdr("out/BigDB/");
        java.lang.String str9 = companyFileData1.getSic();
        companyFileData1.setState("data/BigDB/");
        companyFileData1.setZip("out/BigDB/");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData14 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str15 = estimateFileData14.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData16);
        double double18 = sharesFileData17.getFloatshr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData19 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData19);
        double[] doubleArray21 = incSheetFileData20.getCogsYr();
        double[] doubleArray22 = incSheetFileData20.getGrossIncYr();
        double[] doubleArray23 = incSheetFileData20.getIncPrimaryEpsYr();
        double[] doubleArray24 = incSheetFileData20.getIntExpNonOpYr();
        double[] doubleArray25 = incSheetFileData20.getIncTaxQtr();
        double[] doubleArray26 = incSheetFileData20.getIncAfterTaxYr();
        double[] doubleArray27 = incSheetFileData20.getEpsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData28 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData29 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData28);
        double[] doubleArray30 = balSheetFileData29.getStInvestQtr();
        double[] doubleArray31 = balSheetFileData29.getEquityQtr();
        double[] doubleArray32 = balSheetFileData29.getLtInvestQtr();
        double[] doubleArray33 = balSheetFileData29.getCashYr();
        double[] doubleArray34 = balSheetFileData29.getPrefStockQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData35 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        java.lang.String str36 = cashFileData35.toDbOutput();
        java.lang.String str37 = cashFileData35.toString();
        double[] doubleArray38 = cashFileData35.getCashFromInvQtr();
        java.lang.String str39 = cashFileData35.getTicker();
        double[] doubleArray40 = cashFileData35.getCashFromOpsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData43 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData14, sharesFileData17, incSheetFileData20, balSheetFileData29, cashFileData35, 35, 1);
        java.lang.String str44 = companyFileData1.getIndustry();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNull(doubleArray21);
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(doubleArray24);
        org.junit.Assert.assertNull(doubleArray25);
        org.junit.Assert.assertNull(doubleArray26);
        org.junit.Assert.assertNull(doubleArray27);
        org.junit.Assert.assertNull(doubleArray30);
        org.junit.Assert.assertNull(doubleArray31);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertNull(doubleArray33);
        org.junit.Assert.assertNull(doubleArray34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Cash File Data" + "'", str37, "Cash File Data");
        org.junit.Assert.assertNull(doubleArray38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNull(doubleArray40);
        org.junit.Assert.assertNull(str44);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0223");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear(0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter2 = fieldDataYear1.getQ2();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter3 = fieldDataYear1.getQ4();
        int int4 = fieldDataYear1.getYear();
        org.junit.Assert.assertNull(fieldDataQuarter2);
        org.junit.Assert.assertNull(fieldDataQuarter3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0224");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getCogsYr();
        double[] doubleArray3 = incSheetFileData1.getCogsQtr();
        double[] doubleArray4 = incSheetFileData1.getIntExpYr();
        double[] doubleArray5 = incSheetFileData1.getCogsYr();
        double[] doubleArray6 = incSheetFileData1.getIntExpNonOpYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0225");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, (int) (byte) -1);
        java.lang.String str3 = fieldData2.toString();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum4 = fieldData2.getExchange();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum5 = fieldData2.getExchange();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData6 = fieldData2.getShareData();
        int int7 = fieldData2.getYear();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(exchEnum4);
        org.junit.Assert.assertNull(exchEnum5);
        org.junit.Assert.assertNotNull(sharesFileData6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0226");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getIncTaxYr();
        double[] doubleArray3 = incSheetFileData1.getNetIncQtr();
        double[] doubleArray4 = incSheetFileData1.getGrossOpIncYr();
        double[] doubleArray5 = incSheetFileData1.getNetIncQtr();
        double[] doubleArray6 = incSheetFileData1.getEpsContQtr();
        double[] doubleArray7 = incSheetFileData1.getGrossIncQtr();
        double[] doubleArray8 = incSheetFileData1.getEpsQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0227");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getStInvestQtr();
        double[] doubleArray3 = balSheetFileData1.getLtInvestYr();
        double[] doubleArray4 = balSheetFileData1.getOtherCurrLiabYr();
        java.lang.String str5 = balSheetFileData1.toDbOutput();
        java.lang.String str6 = balSheetFileData1.getTicker();
        double[] doubleArray7 = balSheetFileData1.getPrefStockYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0228");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        java.lang.String str4 = companyFileData1.getStreet();
        java.lang.String str5 = companyFileData1.getSnpIndexStr();
        companyFileData1.setSic("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0229");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, (int) (byte) -1);
        java.lang.String str3 = fieldData2.getSector();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = fieldData2.getShareData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData5 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData5);
        double double7 = sharesFileData6.getInsiderNetPercentOutstanding();
        sharesFileData6.setFromReport((int) (short) -1, (-1));
        sharesFileData6.setVolume10d("out/BigDB/");
        double[] doubleArray17 = new double[] { (byte) 0, 0L, (-1), 35 };
        sharesFileData6.setSharesY(doubleArray17);
        sharesFileData4.setSharesQ(doubleArray17);
        sharesFileData4.setInsiderBuys("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(sharesFileData4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 0.0, -1.0, 35.0]");
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0230");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData7);
        companyFileData8.setTicker("");
        estimateFileData6.setNameFields(companyFileData8);
        sharesFileData1.setNameFields(companyFileData8);
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum13 = companyFileData8.getDowIndex();
        companyFileData8.setIndustry("out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNull(dowEnum13);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0231");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readSipData("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "data/BigDB/");
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0232");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData1);
        java.lang.String str3 = companyFileData2.getSnpIndexStr();
        double[] doubleArray4 = companyFileData2.getPriceQtr();
        java.lang.String str5 = companyFileData2.getStreet();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0233");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.find("Cash File Data");
        org.junit.Assert.assertNull(incSheetFileData1);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0234");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.setMemory(1, (int) (byte) 0, filetypeEnum2);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0235");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setPrice("hi!");
        java.lang.String str5 = sharesFileData1.toString();
        double double6 = sharesFileData1.getPrice();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0236");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList7);
        balSheetFileData1.setNameFields(companyFileData9);
        double[] doubleArray11 = balSheetFileData1.getEquityQtr();
        double[] doubleArray12 = balSheetFileData1.getLtInvestYr();
        java.lang.String str13 = balSheetFileData1.toDbOutput();
        double[] doubleArray14 = balSheetFileData1.getCurrLiabYr();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(companyFileData9);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(doubleArray14);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0237");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, (int) (byte) -1);
        java.lang.String str3 = fieldData2.toString();
        fieldData2.setYear((int) '#');
        java.lang.String str6 = fieldData2.genOutput();
        int int7 = fieldData2.getYear();
        int int8 = fieldData2.getQuarter();
        java.lang.String str9 = fieldData2.getIndustry();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0238");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        java.lang.String str6 = sharesFileData1.getSector();
        sharesFileData1.setInsiderSells("");
        sharesFileData1.setInstSellShrs("Cash File Data");
        int int11 = sharesFileData1.getInsiderBuyShrs();
        double double12 = sharesFileData1.getPrice52lo();
        double double13 = sharesFileData1.getMktCap();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0239");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getAdjToIncQtr();
        double[] doubleArray3 = incSheetFileData1.getGrossOpIncQtr();
        double[] doubleArray4 = incSheetFileData1.getIncTaxQtr();
        double[] doubleArray5 = incSheetFileData1.getIncAfterTaxYr();
        double[] doubleArray6 = incSheetFileData1.getEpsDilQtr();
        double[] doubleArray7 = incSheetFileData1.getNonrecurringItemsYr();
        double[] doubleArray8 = incSheetFileData1.getOtherIncYr();
        double[] doubleArray9 = incSheetFileData1.getGrossOpIncQtr();
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
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0240");
        double[] doubleArray1 = new double[] { (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            double double2 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getTtm(doubleArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-1.0]");
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0241");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, (int) (short) 1);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0242");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getAdjToIncQtr();
        double[] doubleArray3 = incSheetFileData1.getAdjToIncYr();
        double[] doubleArray4 = incSheetFileData1.getGrossIncQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0243");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getLiabEquityQtr();
        double[] doubleArray3 = balSheetFileData1.getTotalAssetsQtr();
        double[] doubleArray4 = balSheetFileData1.getCurrLiabQtr();
        java.lang.String str5 = balSheetFileData1.toDbOutput();
        double[] doubleArray6 = balSheetFileData1.getBvpsYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0244");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, (int) (byte) -1);
        java.lang.String str3 = fieldData2.getIndustry();
        fieldData2.setQuarter(0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData6 = fieldData2.getCashData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData7 = fieldData2.getCashData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData7);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(cashFileData6);
        org.junit.Assert.assertNotNull(cashFileData7);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0245");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        sharesFileData1.setInstBuyShrs("out/BigDB/");
        java.lang.String str8 = sharesFileData1.getTicker();
        double double9 = sharesFileData1.getBeta();
        java.lang.String str10 = sharesFileData1.toString();
        sharesFileData1.setInstOwnership("Cash File Data");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0246");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readSipData("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0247");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList7);
        balSheetFileData1.setNameFields(companyFileData9);
        double[] doubleArray11 = balSheetFileData1.getEquityQtr();
        double[] doubleArray12 = balSheetFileData1.getOtherLtAssetsYr();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(companyFileData9);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0248");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData1);
        companyFileData2.setTicker("");
        estimateFileData0.setNameFields(companyFileData2);
        java.lang.String str6 = estimateFileData0.toDbOutput();
        double double7 = estimateFileData0.getEpsY1();
        java.lang.String str8 = estimateFileData0.getSector();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0249");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getCogsYr();
        double[] doubleArray3 = incSheetFileData1.getGrossIncYr();
        double[] doubleArray4 = incSheetFileData1.getIncPrimaryEpsYr();
        double[] doubleArray5 = incSheetFileData1.getIntExpNonOpYr();
        double[] doubleArray6 = incSheetFileData1.getSalesYr();
        double[] doubleArray7 = incSheetFileData1.getIncPrimaryEpsQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0250");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.find("out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        org.junit.Assert.assertNull(companyFileData1);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0251");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        sharesFileData1.setInstShareholders("hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0252");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        companyFileData1.setSector("data/BigDB/");
        java.lang.String[] strArray11 = new java.lang.String[] { "out/BigDB/", "Cash File Data", "Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory((java.util.List<java.lang.String>) strList12, (int) (byte) 100, 1);
        java.util.List<java.lang.String> strList17 = companyFileData1.set((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData18 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        companyFileData18.setWeb("out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(fieldDataList16);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(companyFileData18);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0253");
        java.lang.String[] strArray7 = new java.lang.String[] { "out/BigDB/", "Cash File Data", "Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory((java.util.List<java.lang.String>) strList8, (int) (byte) 100, 1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter13 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter(100, (int) (byte) -1, fieldDataList12);
        int int14 = fieldDataQuarter13.getYear();
        int int15 = fieldDataQuarter13.getYear();
        int int16 = fieldDataQuarter13.getYear();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0254");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInsiderSellShrs("Cash File Data");
        double double4 = sharesFileData1.getBeta();
        double double5 = sharesFileData1.getBeta();
        sharesFileData1.setFloatshr("out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        java.lang.String str8 = sharesFileData1.getSector();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0255");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        java.lang.String str4 = companyFileData1.getStreet();
        companyFileData1.setPhone("");
        java.lang.String str7 = companyFileData1.getSector();
        java.lang.String str8 = companyFileData1.getDowIndexStr();
        java.lang.String str9 = companyFileData1.getDowIndexStr();
        java.lang.String str10 = companyFileData1.getCountry();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0256");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.lang.String[] strArray4 = new java.lang.String[] { "", "data/BigDB/" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData5 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(strArray1, strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0257");
        java.lang.String[] strArray3 = new java.lang.String[] { "out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "Cash File Data", "" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0258");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList7);
        balSheetFileData1.setNameFields(companyFileData9);
        double[] doubleArray11 = balSheetFileData1.getEquityQtr();
        double[] doubleArray12 = balSheetFileData1.getLtInvestYr();
        double[] doubleArray13 = balSheetFileData1.getOtherCurrLiabYr();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(companyFileData9);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0259");
        java.lang.String[] strArray6 = new java.lang.String[] { "data/BigDB/", "out/BigDB/", "hi!", "out/BigDB/", "data/BigDB/", "out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.lang.String[] strArray7 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(strArray6, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0260");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        java.lang.String str4 = companyFileData1.getStreet();
        companyFileData1.setPhone("");
        java.lang.String str7 = companyFileData1.getSector();
        double[] doubleArray8 = companyFileData1.getPriceQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = companyFileData1.getExchangeStr();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0261");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData1);
        companyFileData2.setTicker("");
        estimateFileData0.setNameFields(companyFileData2);
        java.lang.String str6 = estimateFileData0.toDbOutput();
        net.ajaskey.common.DateTime dateTime7 = estimateFileData0.getCurrFiscalYear();
        java.lang.String str8 = estimateFileData0.getTicker();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum9 = estimateFileData0.getExchange();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(dateTime7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(exchEnum9);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0262");
        java.lang.String[] strArray7 = new java.lang.String[] { "out/BigDB/", "Cash File Data", "Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory((java.util.List<java.lang.String>) strList8, (int) (byte) 100, 1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter13 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter(100, (int) (byte) -1, fieldDataList12);
        int int14 = fieldDataQuarter13.getYear();
        int int15 = fieldDataQuarter13.getYear();
        int int16 = fieldDataQuarter13.getQuarter();
        int int17 = fieldDataQuarter13.getYear();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0263");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        java.lang.String str4 = companyFileData1.getStreet();
        companyFileData1.setSic("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData8);
        companyFileData9.setTicker("");
        estimateFileData7.setNameFields(companyFileData9);
        java.lang.String str13 = estimateFileData7.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData14 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData15 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData16 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData15);
        double[] doubleArray17 = incSheetFileData16.getCogsYr();
        double[] doubleArray18 = incSheetFileData16.getGrossIncYr();
        double[] doubleArray19 = incSheetFileData16.getIncPrimaryEpsYr();
        double[] doubleArray20 = incSheetFileData16.getIntExpNonOpYr();
        double[] doubleArray21 = incSheetFileData16.getIncPrimaryEpsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData22 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData23 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData22);
        double[] doubleArray24 = balSheetFileData23.getLiabEquityQtr();
        double[] doubleArray25 = balSheetFileData23.getLtInvestYr();
        double[] doubleArray26 = balSheetFileData23.getStInvestYr();
        double[] doubleArray27 = balSheetFileData23.getNetFixedAssetsQtr();
        java.lang.String[] strArray32 = new java.lang.String[] { "", "Cash File Data", "", "Cash File Data" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData35 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList33);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData36 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList33);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData39 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData7, sharesFileData14, incSheetFileData16, balSheetFileData23, cashFileData36, (int) (short) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str40 = companyFileData1.getExchangeStr();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(doubleArray17);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertNull(doubleArray21);
        org.junit.Assert.assertNull(doubleArray24);
        org.junit.Assert.assertNull(doubleArray25);
        org.junit.Assert.assertNull(doubleArray26);
        org.junit.Assert.assertNull(doubleArray27);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(sharesFileData35);
        org.junit.Assert.assertNotNull(cashFileData36);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0264");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        java.lang.String str4 = companyFileData1.getStreet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = companyFileData1.getExchangeStr();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0265");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getIncTaxYr();
        java.lang.String str3 = incSheetFileData1.toDbOutput();
        double[] doubleArray4 = incSheetFileData1.getPreTaxIncQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(doubleArray4);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0266");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData0);
        double double2 = estimateFileData1.getEpsY1();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0267");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData1);
        companyFileData2.setTicker("");
        estimateFileData0.setNameFields(companyFileData2);
        java.lang.String str6 = estimateFileData0.getName();
        java.lang.String str7 = estimateFileData0.toString();
        net.ajaskey.common.DateTime dateTime8 = estimateFileData0.getLatestQtrEps();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(dateTime8);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0268");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getStInvestQtr();
        double[] doubleArray3 = balSheetFileData1.getOtherLtAssetsYr();
        double[] doubleArray4 = balSheetFileData1.getStDebtQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData5);
        double[] doubleArray7 = incSheetFileData6.getAdjToIncQtr();
        double[] doubleArray8 = incSheetFileData6.getGrossOpIncQtr();
        java.lang.String[] strArray13 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData16 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList14);
        companyFileData16.setSector("out/BigDB/");
        java.lang.String str19 = companyFileData16.getPhone();
        incSheetFileData6.setNameFields(companyFileData16);
        balSheetFileData1.setNameFields(companyFileData16);
        companyFileData16.setCity("Cash File Data");
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(companyFileData16);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0269");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getFromDb("out/BigDB/", 35, 100, filetypeEnum3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0270");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData1);
        companyFileData2.setTicker("");
        estimateFileData0.setNameFields(companyFileData2);
        companyFileData2.setCity("hi!");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum8 = companyFileData2.getSnpIndex();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum9 = companyFileData2.getExchange();
        org.junit.Assert.assertNull(snpEnum8);
        org.junit.Assert.assertNull(exchEnum9);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0271");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(10, (int) (short) 1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData3 = fieldData2.getCashData();
        org.junit.Assert.assertNotNull(cashFileData3);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0272");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        java.lang.String str2 = sharesFileData1.getTicker();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData3);
        companyFileData4.setTicker("");
        java.lang.String str7 = companyFileData4.getStreet();
        companyFileData4.setPhone("");
        companyFileData4.setState("out/BigDB/");
        sharesFileData1.setNameFields(companyFileData4);
        double[] doubleArray13 = sharesFileData1.getSharesQtr();
        java.lang.String str14 = sharesFileData1.getName();
        double double15 = sharesFileData1.getInsiderNetPercentOutstanding();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0273");
        java.lang.String[] strArray7 = new java.lang.String[] { "out/BigDB/", "Cash File Data", "Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory((java.util.List<java.lang.String>) strList8, (int) (byte) 100, 1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter13 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter(100, (int) (byte) -1, fieldDataList12);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = fieldDataQuarter13.fieldDataList;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = fieldDataQuarter13.fieldDataList;
        int int16 = fieldDataQuarter13.getQuarter();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList14);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0274");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList7);
        balSheetFileData1.setNameFields(companyFileData9);
        double[] doubleArray11 = balSheetFileData1.getCurrLiabQtr();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(companyFileData9);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0275");
        java.lang.String[] strArray9 = new java.lang.String[] { "out/BigDB/", "Cash File Data", "Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory((java.util.List<java.lang.String>) strList10, (int) (byte) 100, 1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter15 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter(100, (int) (byte) -1, fieldDataList14);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter16 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter(0, (int) (byte) 10, fieldDataList14);
        java.lang.String[] strArray24 = new java.lang.String[] { "out/BigDB/", "Cash File Data", "Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "" };
        java.util.ArrayList<java.lang.String> strList25 = new java.util.ArrayList<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList25, strArray24);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList29 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory((java.util.List<java.lang.String>) strList25, (int) (byte) 100, 1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter30 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter(100, (int) (byte) -1, fieldDataList29);
        fieldDataQuarter16.fieldDataList = fieldDataList29;
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(fieldDataList14);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(fieldDataList29);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0276");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getLiabEquityQtr();
        double[] doubleArray3 = balSheetFileData1.getLtInvestYr();
        double[] doubleArray4 = balSheetFileData1.getStInvestYr();
        double[] doubleArray5 = balSheetFileData1.getNetFixedAssetsQtr();
        java.lang.String str6 = balSheetFileData1.toDbOutput();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0277");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData1);
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum3 = companyFileData2.getExchange();
        companyFileData2.setStreet("data/BigDB/");
        java.lang.String str6 = companyFileData2.getZip();
        org.junit.Assert.assertNull(exchEnum3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0278");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList7);
        balSheetFileData1.setNameFields(companyFileData9);
        double[] doubleArray11 = balSheetFileData1.getStDebtYr();
        double[] doubleArray12 = balSheetFileData1.getEquityQtr();
        double[] doubleArray13 = balSheetFileData1.getNetFixedAssetsYr();
        java.lang.String str14 = balSheetFileData1.getSector();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(companyFileData9);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0279");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, (int) (byte) -1);
        java.lang.String str3 = fieldData2.getIndustry();
        java.lang.String str4 = fieldData2.genOutput();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum5 = fieldData2.getExchange();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(exchEnum5);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0280");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        java.lang.String str4 = companyFileData1.getStreet();
        companyFileData1.setSic("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData8);
        companyFileData9.setTicker("");
        estimateFileData7.setNameFields(companyFileData9);
        java.lang.String str13 = estimateFileData7.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData14 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData15 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData16 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData15);
        double[] doubleArray17 = incSheetFileData16.getCogsYr();
        double[] doubleArray18 = incSheetFileData16.getGrossIncYr();
        double[] doubleArray19 = incSheetFileData16.getIncPrimaryEpsYr();
        double[] doubleArray20 = incSheetFileData16.getIntExpNonOpYr();
        double[] doubleArray21 = incSheetFileData16.getIncPrimaryEpsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData22 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData23 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData22);
        double[] doubleArray24 = balSheetFileData23.getLiabEquityQtr();
        double[] doubleArray25 = balSheetFileData23.getLtInvestYr();
        double[] doubleArray26 = balSheetFileData23.getStInvestYr();
        double[] doubleArray27 = balSheetFileData23.getNetFixedAssetsQtr();
        java.lang.String[] strArray32 = new java.lang.String[] { "", "Cash File Data", "", "Cash File Data" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData35 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList33);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData36 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList33);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData39 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData7, sharesFileData14, incSheetFileData16, balSheetFileData23, cashFileData36, (int) (short) 1, (int) (short) 1);
        double[] doubleArray40 = balSheetFileData23.getPrefStockYr();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(doubleArray17);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertNull(doubleArray21);
        org.junit.Assert.assertNull(doubleArray24);
        org.junit.Assert.assertNull(doubleArray25);
        org.junit.Assert.assertNull(doubleArray26);
        org.junit.Assert.assertNull(doubleArray27);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(sharesFileData35);
        org.junit.Assert.assertNotNull(cashFileData36);
        org.junit.Assert.assertNull(doubleArray40);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0281");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear(0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter2 = fieldDataYear1.getQ2();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter3 = fieldDataYear1.getQ2();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter4 = fieldDataYear1.getQ4();
        boolean boolean5 = fieldDataYear1.isInUse();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter6 = fieldDataYear1.getQ2();
        java.lang.String[] strArray17 = new java.lang.String[] { "out/BigDB/", "Cash File Data", "Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory((java.util.List<java.lang.String>) strList18, (int) (byte) 100, 1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter23 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter(100, (int) (byte) -1, fieldDataList22);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter(0, (int) (byte) 10, fieldDataList22);
        int int25 = fieldDataQuarter24.getQuarter();
        fieldDataYear1.set((int) (short) 1, fieldDataQuarter24);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter27 = fieldDataYear1.getQ2();
        boolean boolean29 = fieldDataYear1.quarterDataAvailable(1);
        org.junit.Assert.assertNull(fieldDataQuarter2);
        org.junit.Assert.assertNull(fieldDataQuarter3);
        org.junit.Assert.assertNull(fieldDataQuarter4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(fieldDataQuarter6);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(fieldDataList22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertNull(fieldDataQuarter27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0282");
        java.lang.String[] strArray7 = new java.lang.String[] { "out/BigDB/", "Cash File Data", "Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory((java.util.List<java.lang.String>) strList8, (int) (byte) 100, 1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter13 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter(100, (int) (byte) -1, fieldDataList12);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = fieldDataQuarter13.fieldDataList;
        int int15 = fieldDataQuarter13.getQuarter();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0283");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getStInvestQtr();
        double[] doubleArray3 = balSheetFileData1.getCurrLiabQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0284");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(10, (int) (short) 1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData3 = fieldData2.getCompanyInfo();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = fieldData2.getShareData();
        java.lang.String str5 = fieldData2.toString();
        org.junit.Assert.assertNotNull(companyFileData3);
        org.junit.Assert.assertNotNull(sharesFileData4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0285");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getCogsYr();
        double[] doubleArray3 = incSheetFileData1.getGrossIncYr();
        double[] doubleArray4 = incSheetFileData1.getIncPrimaryEpsYr();
        double[] doubleArray5 = incSheetFileData1.getIntExpNonOpYr();
        double[] doubleArray6 = incSheetFileData1.getOtherIncYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0286");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.parseSipData(0, 35, filetypeEnum2);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0287");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        java.lang.String str6 = sharesFileData1.getSector();
        sharesFileData1.setFloatshr("");
        sharesFileData1.setVolume10d("Cash File Data");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData11 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData12 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData11);
        double double13 = sharesFileData12.getInsiderNetPercentOutstanding();
        double[] doubleArray19 = new double[] { 0, 1.0f, (short) 1, 100.0f, 1 };
        sharesFileData12.setSharesY(doubleArray19);
        sharesFileData1.setSharesY(doubleArray19);
        double double22 = sharesFileData1.getFloatshr();
        java.lang.String str23 = sharesFileData1.toString();
        double double24 = sharesFileData1.getPrice52hi();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 1.0, 1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0288");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.setMemory(0, 1, filetypeEnum2);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0289");
        java.lang.String str4 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getOutfileName((int) 'a', (int) (short) 0, "out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "data/BigDB/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "out/BigDB/97/Q0/out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data-fundamental-data-97Q0.data/BigDB/" + "'", str4, "out/BigDB/97/Q0/out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data-fundamental-data-97Q0.data/BigDB/");
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0290");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData1);
        java.lang.String str3 = companyFileData2.getSnpIndexStr();
        java.lang.String str4 = companyFileData2.getName();
        boolean boolean5 = companyFileData2.isAdr();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0291");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        java.lang.String str4 = companyFileData1.getStreet();
        companyFileData1.setPhone("");
        companyFileData1.setAdr("out/BigDB/");
        java.lang.String str9 = companyFileData1.getSic();
        companyFileData1.setState("data/BigDB/");
        companyFileData1.setZip("out/BigDB/");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum14 = companyFileData1.getSnpIndex();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(snpEnum14);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0292");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getStInvestQtr();
        double[] doubleArray3 = balSheetFileData1.getOtherLtAssetsYr();
        double[] doubleArray4 = balSheetFileData1.getTotalLiabQtr();
        double[] doubleArray5 = balSheetFileData1.getEquityQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0293");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getStInvestQtr();
        double[] doubleArray3 = balSheetFileData1.getOtherLtAssetsYr();
        double[] doubleArray4 = balSheetFileData1.getOtherLtAssetsQtr();
        double[] doubleArray5 = balSheetFileData1.getOtherLtLiabYr();
        double[] doubleArray6 = balSheetFileData1.getStInvestQtr();
        double[] doubleArray7 = balSheetFileData1.getGoodwillQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0294");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.parseSipData((int) '#', (int) '#', filetypeEnum2);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0295");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData7);
        companyFileData8.setTicker("");
        estimateFileData6.setNameFields(companyFileData8);
        sharesFileData1.setNameFields(companyFileData8);
        sharesFileData1.setVolume3m("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        int int15 = sharesFileData1.getInsiderBuyShrs();
        java.lang.String str16 = sharesFileData1.getSector();
        sharesFileData1.setInstShareholders("out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0296");
        java.lang.String str4 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getOutfileName((int) 'a', 35, "hi!", "out/BigDB/97/Q0/out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data-fundamental-data-97Q0.data/BigDB/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "out/BigDB/97/Q35/hi!-fundamental-data-97Q35.out/BigDB/97/Q0/out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data-fundamental-data-97Q0.data/BigDB/" + "'", str4, "out/BigDB/97/Q35/hi!-fundamental-data-97Q35.out/BigDB/97/Q0/out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data-fundamental-data-97Q0.data/BigDB/");
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0297");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        java.lang.String str4 = companyFileData1.getStreet();
        companyFileData1.setPhone("");
        java.lang.String str7 = companyFileData1.toString();
        java.lang.String str8 = companyFileData1.getSnpIndexStr();
        companyFileData1.setStreet("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0298");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, (int) (byte) -1);
        java.lang.String str3 = fieldData2.getIndustry();
        fieldData2.setQuarter(0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData6 = fieldData2.getCashData();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum7 = fieldData2.getExchange();
        java.lang.String str8 = fieldData2.getName();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData9 = fieldData2.getShareData();
        sharesFileData9.setInsiderBuyShrs("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(cashFileData6);
        org.junit.Assert.assertNull(exchEnum7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(sharesFileData9);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0299");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData0);
        double double2 = estimateFileData1.getEpsQ1();
        double double3 = estimateFileData1.getEpsY1();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0300");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInsiderSellShrs("Cash File Data");
        sharesFileData1.setFromReport((int) '4', (int) (short) 0);
        sharesFileData1.setMktCap("");
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0301");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getEquityYr();
        double[] doubleArray3 = balSheetFileData1.getLtDebtYr();
        double[] doubleArray4 = balSheetFileData1.getPrefStockQtr();
        double[] doubleArray5 = balSheetFileData1.getPrefStockYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0302");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getStInvestQtr();
        double[] doubleArray3 = balSheetFileData1.getOtherLtAssetsYr();
        double[] doubleArray4 = balSheetFileData1.getOtherLtAssetsQtr();
        double[] doubleArray5 = balSheetFileData1.getOtherLtLiabYr();
        double[] doubleArray6 = balSheetFileData1.getAcctRxQtr();
        double[] doubleArray7 = balSheetFileData1.getNetFixedAssetsQtr();
        double[] doubleArray8 = balSheetFileData1.getStInvestYr();
        double[] doubleArray9 = balSheetFileData1.getOtherCurrLiabQtr();
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
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0303");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getCogsYr();
        double[] doubleArray3 = incSheetFileData1.getGrossIncYr();
        double[] doubleArray4 = incSheetFileData1.getIncPrimaryEpsYr();
        double[] doubleArray5 = incSheetFileData1.getDividendQtr();
        double[] doubleArray6 = incSheetFileData1.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData1.getAdjToIncYr();
        double[] doubleArray8 = incSheetFileData1.getUnusualIncYr();
        java.lang.String str9 = incSheetFileData1.getTicker();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0304");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readSipData("out/BigDB/97/Q35/hi!-fundamental-data-97Q35.out/BigDB/97/Q0/out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data-fundamental-data-97Q0.data/BigDB/", "Cash File Data");
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0305");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        java.lang.String str4 = companyFileData1.getStreet();
        companyFileData1.setSic("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData8);
        companyFileData9.setTicker("");
        estimateFileData7.setNameFields(companyFileData9);
        java.lang.String str13 = estimateFileData7.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData14 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData15 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData16 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData15);
        double[] doubleArray17 = incSheetFileData16.getCogsYr();
        double[] doubleArray18 = incSheetFileData16.getGrossIncYr();
        double[] doubleArray19 = incSheetFileData16.getIncPrimaryEpsYr();
        double[] doubleArray20 = incSheetFileData16.getIntExpNonOpYr();
        double[] doubleArray21 = incSheetFileData16.getIncPrimaryEpsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData22 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData23 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData22);
        double[] doubleArray24 = balSheetFileData23.getLiabEquityQtr();
        double[] doubleArray25 = balSheetFileData23.getLtInvestYr();
        double[] doubleArray26 = balSheetFileData23.getStInvestYr();
        double[] doubleArray27 = balSheetFileData23.getNetFixedAssetsQtr();
        java.lang.String[] strArray32 = new java.lang.String[] { "", "Cash File Data", "", "Cash File Data" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData35 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList33);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData36 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList33);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData39 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData7, sharesFileData14, incSheetFileData16, balSheetFileData23, cashFileData36, (int) (short) 1, (int) (short) 1);
        companyFileData1.setTicker("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(doubleArray17);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertNull(doubleArray21);
        org.junit.Assert.assertNull(doubleArray24);
        org.junit.Assert.assertNull(doubleArray25);
        org.junit.Assert.assertNull(doubleArray26);
        org.junit.Assert.assertNull(doubleArray27);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(sharesFileData35);
        org.junit.Assert.assertNotNull(cashFileData36);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0306");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInsiderSellShrs("Cash File Data");
        sharesFileData1.setInsiderBuys("hi!");
        sharesFileData1.setFloatshr("Cash File Data");
        sharesFileData1.setFromReport((int) ' ', (int) (byte) 100);
        double double11 = sharesFileData1.getInstOwnership();
        double double12 = sharesFileData1.getInsiderNetPercentOutstanding();
        int int13 = sharesFileData1.getInstSellShrs();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0307");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getOtherCurrLiabYr();
        double[] doubleArray3 = balSheetFileData1.getCurrAssetsQtr();
        java.lang.String str4 = balSheetFileData1.getExchange();
        java.lang.String str5 = balSheetFileData1.getExchange();
        double[] doubleArray6 = balSheetFileData1.getPrefStockYr();
        double[] doubleArray7 = balSheetFileData1.getNetFixedAssetsYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0308");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        java.lang.String str4 = companyFileData1.getStreet();
        companyFileData1.setPhone("");
        companyFileData1.setState("out/BigDB/");
        companyFileData1.setState("out/BigDB/");
        java.lang.String str11 = companyFileData1.getCity();
        companyFileData1.setState("out/BigDB/");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0309");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear(0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter2 = fieldDataYear1.getQ1();
        org.junit.Assert.assertNull(fieldDataQuarter2);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0310");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        java.lang.String str1 = cashFileData0.toDbOutput();
        double[] doubleArray2 = cashFileData0.getCashFromFinQtr();
        double[] doubleArray3 = cashFileData0.getCashFromOpsQtr();
        java.lang.String str4 = cashFileData0.toDbOutput();
        double[] doubleArray5 = cashFileData0.getCashFromOpsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData0);
        java.lang.String str7 = cashFileData6.toDbOutput();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0311");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getAdjToIncQtr();
        double[] doubleArray3 = incSheetFileData1.getGrossOpIncQtr();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData11 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList9);
        companyFileData11.setSector("out/BigDB/");
        java.lang.String str14 = companyFileData11.getPhone();
        incSheetFileData1.setNameFields(companyFileData11);
        java.lang.String str16 = companyFileData11.getDowIndexStr();
        java.lang.String str17 = companyFileData11.getSector();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(companyFileData11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "out/BigDB/" + "'", str17, "out/BigDB/");
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0312");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getAdjToIncQtr();
        double[] doubleArray3 = incSheetFileData1.getGrossOpIncQtr();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData11 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList9);
        companyFileData11.setSector("out/BigDB/");
        java.lang.String str14 = companyFileData11.getPhone();
        incSheetFileData1.setNameFields(companyFileData11);
        java.lang.String str16 = incSheetFileData1.toDbOutput();
        double[] doubleArray17 = incSheetFileData1.getCogsQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(companyFileData11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(doubleArray17);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0313");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getStInvestQtr();
        double[] doubleArray3 = balSheetFileData1.getCashYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0314");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData1);
        companyFileData2.setTicker("");
        estimateFileData0.setNameFields(companyFileData2);
        java.lang.String str6 = estimateFileData0.toDbOutput();
        net.ajaskey.common.DateTime dateTime7 = estimateFileData0.getCurrFiscalYear();
        java.lang.String str8 = estimateFileData0.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(dateTime7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0315");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getStInvestQtr();
        double[] doubleArray3 = balSheetFileData1.getEquityQtr();
        double[] doubleArray4 = balSheetFileData1.getLiabEquityQtr();
        double[] doubleArray5 = balSheetFileData1.getGoodwillQtr();
        double[] doubleArray6 = balSheetFileData1.getOtherLtLiabQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0316");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getCogsYr();
        double[] doubleArray3 = incSheetFileData1.getCogsQtr();
        double[] doubleArray4 = incSheetFileData1.getRdQtr();
        double[] doubleArray5 = incSheetFileData1.getDepreciationQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0317");
        java.lang.String[] strArray5 = new java.lang.String[] { "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "data/BigDB/", "Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
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
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0318");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList7);
        balSheetFileData1.setNameFields(companyFileData9);
        companyFileData9.setPhone("data/BigDB/");
        companyFileData9.setZip("out/BigDB/");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(companyFileData9);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0319");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        java.lang.String str4 = companyFileData1.getStreet();
        companyFileData1.setWeb("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        companyFileData1.setCity("Cash File Data");
        companyFileData1.setPhone("data/BigDB/");
        java.lang.String str11 = companyFileData1.getSic();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0320");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getIncTaxYr();
        java.lang.String str3 = incSheetFileData1.toDbOutput();
        double[] doubleArray4 = incSheetFileData1.getGrossIncQtr();
        java.lang.String str5 = incSheetFileData1.getSector();
        double[] doubleArray6 = incSheetFileData1.getIncPrimaryEpsQtr();
        double[] doubleArray7 = incSheetFileData1.getIncAfterTaxYr();
        double[] doubleArray8 = incSheetFileData1.getIntExpNonOpYr();
        double[] doubleArray9 = incSheetFileData1.getGrossIncQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0321");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getAdjToIncQtr();
        double[] doubleArray3 = incSheetFileData1.getGrossOpIncQtr();
        double[] doubleArray4 = incSheetFileData1.getIncTaxQtr();
        double[] doubleArray5 = incSheetFileData1.getEpsDilContQtr();
        double[] doubleArray6 = incSheetFileData1.getGrossIncYr();
        java.lang.String str7 = incSheetFileData1.getTicker();
        double[] doubleArray8 = incSheetFileData1.getDepreciationQtr();
        double[] doubleArray9 = incSheetFileData1.getPreTaxIncYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0322");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData1);
        companyFileData2.setTicker("");
        estimateFileData0.setNameFields(companyFileData2);
        java.lang.String str6 = estimateFileData0.toDbOutput();
        double double7 = estimateFileData0.getEpsY1();
        java.lang.String str8 = estimateFileData0.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0323");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getStInvestQtr();
        double[] doubleArray3 = balSheetFileData1.getOtherLtAssetsYr();
        double[] doubleArray4 = balSheetFileData1.getStDebtQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData5);
        double[] doubleArray7 = incSheetFileData6.getAdjToIncQtr();
        double[] doubleArray8 = incSheetFileData6.getGrossOpIncQtr();
        java.lang.String[] strArray13 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData16 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList14);
        companyFileData16.setSector("out/BigDB/");
        java.lang.String str19 = companyFileData16.getPhone();
        incSheetFileData6.setNameFields(companyFileData16);
        balSheetFileData1.setNameFields(companyFileData16);
        java.lang.String str22 = companyFileData16.getPhone();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(companyFileData16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0324");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getQFromDb((-1), (int) (byte) 0, filetypeEnum2);
        org.junit.Assert.assertNull(fieldDataList3);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0325");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getAdjToIncQtr();
        double[] doubleArray3 = incSheetFileData1.getGrossOpIncQtr();
        double[] doubleArray4 = incSheetFileData1.getIncTaxQtr();
        double[] doubleArray5 = incSheetFileData1.getIncAfterTaxYr();
        double[] doubleArray6 = incSheetFileData1.getEpsDilQtr();
        double[] doubleArray7 = incSheetFileData1.getNonrecurringItemsYr();
        double[] doubleArray8 = incSheetFileData1.getOtherIncYr();
        double[] doubleArray9 = incSheetFileData1.getRdYr();
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
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0326");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        java.lang.String str1 = cashFileData0.toString();
        java.lang.String str2 = cashFileData0.getTicker();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Cash File Data" + "'", str1, "Cash File Data");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0327");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        java.lang.String str6 = sharesFileData1.getSector();
        sharesFileData1.setInsiderSells("");
        sharesFileData1.setInstSellShrs("Cash File Data");
        sharesFileData1.setMktCap("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        double double13 = sharesFileData1.getPrice52hi();
        sharesFileData1.setMktCap("out/BigDB/97/Q0/out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data-fundamental-data-97Q0.data/BigDB/");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0328");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getAdjToIncQtr();
        java.lang.String str3 = incSheetFileData1.getName();
        double[] doubleArray4 = incSheetFileData1.getSalesYr();
        double[] doubleArray5 = incSheetFileData1.getIncTaxYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0329");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData1);
        companyFileData2.setTicker("");
        estimateFileData0.setNameFields(companyFileData2);
        java.lang.String str6 = estimateFileData0.toDbOutput();
        net.ajaskey.common.DateTime dateTime7 = estimateFileData0.getCurrFiscalYear();
        double double8 = estimateFileData0.getEpsQ1();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(dateTime7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0330");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear((int) (short) 1);
        boolean boolean3 = fieldDataYear1.quarterDataAvailable((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0331");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        double[] doubleArray8 = new double[] { 0, 1.0f, (short) 1, 100.0f, 1 };
        sharesFileData1.setSharesY(doubleArray8);
        sharesFileData1.setDollar3m("out/BigDB/97/Q0/out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data-fundamental-data-97Q0.data/BigDB/");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 1.0, 1.0, 100.0, 1.0]");
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0332");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.setMemory((int) (short) 10, (int) ' ', filetypeEnum2);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0333");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear((int) (short) 1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter2 = fieldDataYear1.getQ2();
        boolean boolean3 = fieldDataYear1.isInUse();
        org.junit.Assert.assertNull(fieldDataQuarter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0334");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str1 = estimateFileData0.toDbOutput();
        java.lang.String str2 = estimateFileData0.getSector();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0335");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        java.lang.String str4 = companyFileData1.getStreet();
        companyFileData1.setPhone("");
        java.lang.String str7 = companyFileData1.getSector();
        companyFileData1.setStreet("out/BigDB/");
        java.lang.String str10 = companyFileData1.getStreet();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "out/BigDB/" + "'", str10, "out/BigDB/");
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0336");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        java.lang.String str1 = cashFileData0.toDbOutput();
        java.lang.String str2 = cashFileData0.toString();
        double[] doubleArray3 = cashFileData0.getCashFromInvQtr();
        java.lang.String str4 = cashFileData0.getTicker();
        double[] doubleArray5 = cashFileData0.getCashFromOpsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData0);
        java.lang.String str7 = cashFileData6.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Cash File Data" + "'", str2, "Cash File Data");
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cash File Data" + "'", str7, "Cash File Data");
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0337");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData1);
        companyFileData2.setTicker("");
        estimateFileData0.setNameFields(companyFileData2);
        double double6 = estimateFileData0.getEpsQ1();
        net.ajaskey.common.DateTime dateTime7 = estimateFileData0.getLatestQtrEps();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(dateTime7);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0338");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList7);
        balSheetFileData1.setNameFields(companyFileData9);
        double[] doubleArray11 = balSheetFileData1.getStInvestQtr();
        double[] doubleArray12 = balSheetFileData1.getNetFixedAssetsYr();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(companyFileData9);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0339");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        java.lang.String str6 = sharesFileData1.getSector();
        sharesFileData1.setFloatshr("");
        sharesFileData1.setVolume10d("Cash File Data");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData11 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData12 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData11);
        double double13 = sharesFileData12.getInsiderNetPercentOutstanding();
        double[] doubleArray19 = new double[] { 0, 1.0f, (short) 1, 100.0f, 1 };
        sharesFileData12.setSharesY(doubleArray19);
        sharesFileData1.setSharesY(doubleArray19);
        int int22 = sharesFileData1.getInsiderSellShrs();
        sharesFileData1.setInsiderBuyShrs("out/BigDB/");
        double double25 = sharesFileData1.getPrice52lo();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 1.0, 1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0340");
        java.lang.String[] strArray3 = new java.lang.String[] { "out/BigDB/97/Q0/out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data-fundamental-data-97Q0.data/BigDB/", "out/BigDB/97/Q0/out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data-fundamental-data-97Q0.data/BigDB/", "Cash File Data" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0341");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getStInvestQtr();
        double[] doubleArray3 = balSheetFileData1.getEquityQtr();
        double[] doubleArray4 = balSheetFileData1.getLtInvestQtr();
        double[] doubleArray5 = balSheetFileData1.getCashYr();
        double[] doubleArray6 = balSheetFileData1.getGoodwillQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0342");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.find("out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        org.junit.Assert.assertNull(estimateFileData1);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0343");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData1);
        companyFileData2.setZip("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        java.lang.String str5 = companyFileData2.getName();
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0344");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getEquityYr();
        double[] doubleArray3 = balSheetFileData1.getOtherCurrAssetsQtr();
        double[] doubleArray4 = balSheetFileData1.getEquityYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0345");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        java.lang.String str4 = companyFileData1.getStreet();
        companyFileData1.setWeb("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        companyFileData1.setCountry("");
        companyFileData1.setSnpIndex("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        java.lang.String str11 = companyFileData1.getDowIndexStr();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0346");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.find("out/BigDB/97/Q0/out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data-fundamental-data-97Q0.data/BigDB/");
        org.junit.Assert.assertNull(cashFileData1);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0347");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getAdjToIncQtr();
        double[] doubleArray3 = incSheetFileData1.getGrossOpIncQtr();
        double[] doubleArray4 = incSheetFileData1.getEpsDilContQtr();
        double[] doubleArray5 = incSheetFileData1.getRdQtr();
        double[] doubleArray6 = incSheetFileData1.getOtherIncQtr();
        double[] doubleArray7 = incSheetFileData1.getGrossOpIncYr();
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
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        java.lang.String str6 = sharesFileData1.getSector();
        sharesFileData1.setFloatshr("");
        sharesFileData1.setInstBuyShrs("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = sharesFileData1.toDbOutput();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0349");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        sharesFileData1.setVolume10d("out/BigDB/");
        double[] doubleArray11 = new double[] { ' ', (short) -1, 100.0f };
        sharesFileData1.setSharesQ(doubleArray11);
        java.lang.String str13 = sharesFileData1.getTicker();
        sharesFileData1.setInsiderNetTrades("out/BigDB/97/Q35/hi!-fundamental-data-97Q35.out/BigDB/97/Q0/out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data-fundamental-data-97Q0.data/BigDB/");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[32.0, -1.0, 100.0]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0350");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        java.lang.String str4 = companyFileData1.getStreet();
        companyFileData1.setSic("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData8);
        companyFileData9.setTicker("");
        estimateFileData7.setNameFields(companyFileData9);
        java.lang.String str13 = estimateFileData7.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData14 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData15 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData16 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData15);
        double[] doubleArray17 = incSheetFileData16.getCogsYr();
        double[] doubleArray18 = incSheetFileData16.getGrossIncYr();
        double[] doubleArray19 = incSheetFileData16.getIncPrimaryEpsYr();
        double[] doubleArray20 = incSheetFileData16.getIntExpNonOpYr();
        double[] doubleArray21 = incSheetFileData16.getIncPrimaryEpsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData22 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData23 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData22);
        double[] doubleArray24 = balSheetFileData23.getLiabEquityQtr();
        double[] doubleArray25 = balSheetFileData23.getLtInvestYr();
        double[] doubleArray26 = balSheetFileData23.getStInvestYr();
        double[] doubleArray27 = balSheetFileData23.getNetFixedAssetsQtr();
        java.lang.String[] strArray32 = new java.lang.String[] { "", "Cash File Data", "", "Cash File Data" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData35 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList33);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData36 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList33);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData39 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData7, sharesFileData14, incSheetFileData16, balSheetFileData23, cashFileData36, (int) (short) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str40 = companyFileData1.toDbOuput();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(doubleArray17);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertNull(doubleArray21);
        org.junit.Assert.assertNull(doubleArray24);
        org.junit.Assert.assertNull(doubleArray25);
        org.junit.Assert.assertNull(doubleArray26);
        org.junit.Assert.assertNull(doubleArray27);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(sharesFileData35);
        org.junit.Assert.assertNotNull(cashFileData36);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0351");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getIncTaxYr();
        java.lang.String str3 = incSheetFileData1.toDbOutput();
        double[] doubleArray4 = incSheetFileData1.getGrossIncQtr();
        double[] doubleArray5 = incSheetFileData1.getDepreciationQtr();
        double[] doubleArray6 = incSheetFileData1.getEpsContYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0352");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear(0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter2 = fieldDataYear1.getQ2();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter3 = fieldDataYear1.getQ2();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter4 = fieldDataYear1.getQ4();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter6 = fieldDataYear1.getQ(0);
        int int7 = fieldDataYear1.getYear();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter8 = fieldDataYear1.getQ3();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter9 = fieldDataYear1.getQ4();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter10 = fieldDataYear1.getQ1();
        org.junit.Assert.assertNull(fieldDataQuarter2);
        org.junit.Assert.assertNull(fieldDataQuarter3);
        org.junit.Assert.assertNull(fieldDataQuarter4);
        org.junit.Assert.assertNull(fieldDataQuarter6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(fieldDataQuarter8);
        org.junit.Assert.assertNull(fieldDataQuarter9);
        org.junit.Assert.assertNull(fieldDataQuarter10);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0353");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getStInvestQtr();
        double[] doubleArray3 = balSheetFileData1.getLtInvestYr();
        double[] doubleArray4 = balSheetFileData1.getNetFixedAssetsYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0354");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getTotalLiabYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData3);
        companyFileData4.setTicker("");
        companyFileData4.setSector("data/BigDB/");
        java.lang.String[] strArray14 = new java.lang.String[] { "out/BigDB/", "Cash File Data", "Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory((java.util.List<java.lang.String>) strList15, (int) (byte) 100, 1);
        java.util.List<java.lang.String> strList20 = companyFileData4.set((java.util.List<java.lang.String>) strList15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData21 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData22 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData23 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData23);
        companyFileData24.setTicker("");
        estimateFileData22.setNameFields(companyFileData24);
        java.lang.String str28 = estimateFileData22.toDbOutput();
        double double29 = estimateFileData22.getEpsY1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData30 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData31 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData30);
        double double32 = sharesFileData31.getFloatshr();
        sharesFileData31.setDollar3m("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        int int35 = sharesFileData31.getInsiderBuyShrs();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData36 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData37 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData36);
        double[] doubleArray38 = incSheetFileData37.getIncTaxYr();
        java.lang.String str39 = incSheetFileData37.toDbOutput();
        double[] doubleArray40 = incSheetFileData37.getGrossIncQtr();
        java.lang.String str41 = incSheetFileData37.getSector();
        double[] doubleArray42 = incSheetFileData37.getGrossOpIncYr();
        double[] doubleArray43 = incSheetFileData37.getAdjToIncYr();
        double[] doubleArray44 = incSheetFileData37.getIncTaxQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData45 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData46 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData45);
        double[] doubleArray47 = balSheetFileData46.getStDebtYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData48 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData51 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData21, estimateFileData22, sharesFileData31, incSheetFileData37, balSheetFileData46, cashFileData48, 1, (int) (short) 10);
        balSheetFileData1.setNameFields(companyFileData21);
        double[] doubleArray53 = balSheetFileData1.getTotalLiabYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(fieldDataList19);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(companyFileData21);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(doubleArray38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNull(doubleArray40);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(doubleArray42);
        org.junit.Assert.assertNull(doubleArray43);
        org.junit.Assert.assertNull(doubleArray44);
        org.junit.Assert.assertNull(doubleArray47);
        org.junit.Assert.assertNull(doubleArray53);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0355");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.find("");
        org.junit.Assert.assertNull(incSheetFileData1);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0356");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getFromDb("out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", (int) (byte) 10, (int) (byte) 1, filetypeEnum3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0357");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList7);
        balSheetFileData1.setNameFields(companyFileData9);
        double[] doubleArray11 = balSheetFileData1.getStDebtYr();
        double[] doubleArray12 = balSheetFileData1.getEquityQtr();
        double[] doubleArray13 = balSheetFileData1.getEquityQtr();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(companyFileData9);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0358");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList7);
        balSheetFileData1.setNameFields(companyFileData9);
        double[] doubleArray11 = balSheetFileData1.getEquityQtr();
        double[] doubleArray12 = balSheetFileData1.getTotalAssetsQtr();
        double[] doubleArray13 = balSheetFileData1.getOtherLtAssetsYr();
        double[] doubleArray14 = balSheetFileData1.getStDebtQtr();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(companyFileData9);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(doubleArray14);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0359");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getCogsYr();
        double[] doubleArray3 = incSheetFileData1.getGrossIncYr();
        double[] doubleArray4 = incSheetFileData1.getIncPrimaryEpsYr();
        double[] doubleArray5 = incSheetFileData1.getIntExpNonOpYr();
        double[] doubleArray6 = incSheetFileData1.getUnusualIncQtr();
        double[] doubleArray7 = incSheetFileData1.getPreTaxIncQtr();
        double[] doubleArray8 = incSheetFileData1.getIntExpQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0360");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData1);
        companyFileData2.setTicker("");
        estimateFileData0.setNameFields(companyFileData2);
        double double6 = estimateFileData0.getEpsQ0();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData0);
        net.ajaskey.common.DateTime dateTime8 = estimateFileData0.getLatestQtrEps();
        java.lang.String str9 = estimateFileData0.getSector();
        double double10 = estimateFileData0.getEpsQ1();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(dateTime8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0361");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList7);
        balSheetFileData1.setNameFields(companyFileData9);
        double[] doubleArray11 = balSheetFileData1.getStDebtYr();
        double[] doubleArray12 = balSheetFileData1.getEquityQtr();
        double[] doubleArray13 = balSheetFileData1.getGoodwillYr();
        double[] doubleArray14 = balSheetFileData1.getBvpsYr();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(companyFileData9);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(doubleArray14);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0362");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        companyFileData1.setSector("data/BigDB/");
        java.lang.String[] strArray11 = new java.lang.String[] { "out/BigDB/", "Cash File Data", "Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory((java.util.List<java.lang.String>) strList12, (int) (byte) 100, 1);
        java.util.List<java.lang.String> strList17 = companyFileData1.set((java.util.List<java.lang.String>) strList12);
        java.lang.String str18 = companyFileData1.getCountry();
        companyFileData1.setCity("data/BigDB/");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(fieldDataList16);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0363");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList7);
        balSheetFileData1.setNameFields(companyFileData9);
        double[] doubleArray11 = balSheetFileData1.getStDebtYr();
        double[] doubleArray12 = balSheetFileData1.getEquityQtr();
        double[] doubleArray13 = balSheetFileData1.getPrefStockQtr();
        double[] doubleArray14 = balSheetFileData1.getInventoryQtr();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(companyFileData9);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(doubleArray14);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0364");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        sharesFileData1.setVolume10d("out/BigDB/");
        double[] doubleArray8 = sharesFileData1.getSharesYr();
        sharesFileData1.setInstOwnership("data/BigDB/");
        double[] doubleArray11 = sharesFileData1.getSharesYr();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0365");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "Cash File Data", "", "Cash File Data" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        java.lang.String str10 = cashFileData9.toString();
        double[] doubleArray11 = cashFileData9.getCashFromInvQtr();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(sharesFileData7);
        org.junit.Assert.assertNotNull(cashFileData8);
        org.junit.Assert.assertNotNull(cashFileData9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cash File Data" + "'", str10, "Cash File Data");
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0366");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getStInvestQtr();
        double[] doubleArray3 = balSheetFileData1.getLtInvestYr();
        double[] doubleArray4 = balSheetFileData1.getOtherCurrLiabYr();
        double[] doubleArray5 = balSheetFileData1.getLtInvestYr();
        java.lang.String str6 = balSheetFileData1.toString();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0367");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getStInvestQtr();
        double[] doubleArray3 = balSheetFileData1.getOtherLtAssetsYr();
        double[] doubleArray4 = balSheetFileData1.getOtherLtAssetsQtr();
        double[] doubleArray5 = balSheetFileData1.getStDebtQtr();
        double[] doubleArray6 = balSheetFileData1.getOtherCurrAssetsYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0368");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, (int) (byte) -1);
        java.lang.String str3 = fieldData2.getIndustry();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = fieldData2.getEstimateData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = fieldData2.getCashData();
        fieldData2.setQuarter(35);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(cashFileData5);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0369");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getStInvestQtr();
        double[] doubleArray3 = balSheetFileData1.getLtInvestYr();
        double[] doubleArray4 = balSheetFileData1.getOtherCurrLiabYr();
        java.lang.String str5 = balSheetFileData1.toDbOutput();
        java.lang.String str6 = balSheetFileData1.getTicker();
        double[] doubleArray7 = balSheetFileData1.getTotalAssetsYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0370");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        java.lang.String str1 = cashFileData0.toDbOutput();
        double[] doubleArray2 = cashFileData0.getCashFromFinQtr();
        double[] doubleArray3 = cashFileData0.getCashFromOpsQtr();
        java.lang.String str4 = cashFileData0.toDbOutput();
        double[] doubleArray5 = cashFileData0.getCashFromOpsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData0);
        java.lang.String str7 = cashFileData6.toString();
        double[] doubleArray8 = cashFileData6.getCashFromFinQtr();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cash File Data" + "'", str7, "Cash File Data");
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0371");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList7);
        balSheetFileData1.setNameFields(companyFileData9);
        double[] doubleArray11 = balSheetFileData1.getTotalAssetsYr();
        double[] doubleArray12 = balSheetFileData1.getGoodwillYr();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(companyFileData9);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0372");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getAdjToIncQtr();
        double[] doubleArray3 = incSheetFileData1.getGrossOpIncQtr();
        double[] doubleArray4 = incSheetFileData1.getIncTaxQtr();
        double[] doubleArray5 = incSheetFileData1.getEpsDilContQtr();
        double[] doubleArray6 = incSheetFileData1.getEpsContYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0373");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getAdjToIncQtr();
        double[] doubleArray3 = incSheetFileData1.getGrossOpIncQtr();
        double[] doubleArray4 = incSheetFileData1.getIncTaxQtr();
        double[] doubleArray5 = incSheetFileData1.getEpsDilContQtr();
        double[] doubleArray6 = incSheetFileData1.getGrossIncYr();
        double[] doubleArray7 = incSheetFileData1.getPreTaxIncQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0374");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getQFromMemory((int) (short) 0, (int) (short) 1);
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0375");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        java.lang.String str4 = companyFileData1.getStreet();
        companyFileData1.setPhone("");
        companyFileData1.setState("out/BigDB/");
        java.lang.String str9 = companyFileData1.getWeb();
        boolean boolean10 = companyFileData1.isAdr();
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum11 = companyFileData1.getDowIndex();
        companyFileData1.setSector("out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum14 = companyFileData1.getDowIndex();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(dowEnum11);
        org.junit.Assert.assertNull(dowEnum14);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0376");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInsiderSellShrs("Cash File Data");
        sharesFileData1.setVolume3m("");
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0377");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) -1, (int) 'a');
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0378");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getFloatshr();
        double double3 = sharesFileData1.getPrice52hi();
        sharesFileData1.setInsiderOwnership("out/BigDB/97/Q0/out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data-fundamental-data-97Q0.data/BigDB/");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0379");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        double[] doubleArray8 = new double[] { 0, 1.0f, (short) 1, 100.0f, 1 };
        sharesFileData1.setSharesY(doubleArray8);
        java.lang.String str10 = sharesFileData1.getTicker();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 1.0, 1.0, 100.0, 1.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0380");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, (int) (byte) -1);
        java.lang.String str3 = fieldData2.toString();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum4 = fieldData2.getExchange();
        java.lang.String str5 = fieldData2.genOutput();
        fieldData2.setYear((-1));
        java.lang.String str8 = fieldData2.genOutput();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(exchEnum4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0381");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData7);
        companyFileData8.setTicker("");
        estimateFileData6.setNameFields(companyFileData8);
        sharesFileData1.setNameFields(companyFileData8);
        sharesFileData1.setVolume3m("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        int int15 = sharesFileData1.getInsiderBuyShrs();
        int int16 = sharesFileData1.getInsiderBuys();
        int int17 = sharesFileData1.getInsiderSells();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0382");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData7);
        companyFileData8.setTicker("");
        estimateFileData6.setNameFields(companyFileData8);
        sharesFileData1.setNameFields(companyFileData8);
        sharesFileData1.setVolume3m("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        int int15 = sharesFileData1.getInsiderBuyShrs();
        sharesFileData1.setInsiderBuys("out/BigDB/");
        int int18 = sharesFileData1.getInsiderNetTrades();
        sharesFileData1.setBeta("data/BigDB/");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0383");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getCogsYr();
        double[] doubleArray3 = incSheetFileData1.getGrossIncYr();
        double[] doubleArray4 = incSheetFileData1.getIncPrimaryEpsYr();
        double[] doubleArray5 = incSheetFileData1.getIncPrimaryEpsYr();
        double[] doubleArray6 = incSheetFileData1.getRdQtr();
        double[] doubleArray7 = incSheetFileData1.getCogsQtr();
        java.lang.String str8 = incSheetFileData1.getName();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0384");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList7);
        balSheetFileData1.setNameFields(companyFileData9);
        double[] doubleArray11 = balSheetFileData1.getStDebtYr();
        double[] doubleArray12 = balSheetFileData1.getEquityQtr();
        double[] doubleArray13 = balSheetFileData1.getOtherCurrAssetsQtr();
        double[] doubleArray14 = balSheetFileData1.getGoodwillQtr();
        double[] doubleArray15 = balSheetFileData1.getStInvestYr();
        double[] doubleArray16 = balSheetFileData1.getOtherLtLiabYr();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(companyFileData9);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(doubleArray14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray16);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0385");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        sharesFileData1.setInstBuyShrs("out/BigDB/");
        sharesFileData1.setVolume10d("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        sharesFileData1.setDollar3m("");
        java.lang.String str12 = sharesFileData1.getSector();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0386");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        java.lang.String str4 = companyFileData1.getStreet();
        companyFileData1.setPhone("");
        companyFileData1.setState("out/BigDB/");
        companyFileData1.setState("out/BigDB/");
        java.lang.String str11 = companyFileData1.getPhone();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0387");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear(0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter2 = fieldDataYear1.getQ2();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter3 = fieldDataYear1.getQ2();
        java.lang.String[] strArray12 = new java.lang.String[] { "out/BigDB/", "Cash File Data", "Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory((java.util.List<java.lang.String>) strList13, (int) (byte) 100, 1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter18 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter(100, (int) (byte) -1, fieldDataList17);
        fieldDataYear1.set(0, fieldDataQuarter18);
        boolean boolean21 = fieldDataYear1.quarterDataAvailable(10);
        boolean boolean23 = fieldDataYear1.quarterDataAvailable((int) (short) -1);
        org.junit.Assert.assertNull(fieldDataQuarter2);
        org.junit.Assert.assertNull(fieldDataQuarter3);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(fieldDataList17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0388");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setPrice("hi!");
        java.lang.String str5 = sharesFileData1.toString();
        long long6 = sharesFileData1.getVolumeMonth3m();
        int int7 = sharesFileData1.getInstBuyShrs();
        double[] doubleArray8 = sharesFileData1.getSharesYr();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0389");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData1);
        companyFileData2.setTicker("");
        estimateFileData0.setNameFields(companyFileData2);
        companyFileData2.setCity("hi!");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData2);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0390");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData1);
        companyFileData2.setTicker("");
        estimateFileData0.setNameFields(companyFileData2);
        double double6 = estimateFileData0.getEpsQ0();
        java.lang.String str7 = estimateFileData0.getSector();
        java.lang.String str8 = estimateFileData0.getIndustry();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0391");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getIncTaxYr();
        java.lang.String str3 = incSheetFileData1.toDbOutput();
        double[] doubleArray4 = incSheetFileData1.getGrossIncQtr();
        double[] doubleArray5 = incSheetFileData1.getDepreciationQtr();
        double[] doubleArray6 = incSheetFileData1.getTotalOpExpYr();
        double[] doubleArray7 = incSheetFileData1.getSalesYr();
        double[] doubleArray8 = incSheetFileData1.getEpsQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0392");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        sharesFileData1.setInstBuyShrs("out/BigDB/");
        java.lang.String str8 = sharesFileData1.getTicker();
        double double9 = sharesFileData1.getBeta();
        java.lang.String str10 = sharesFileData1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = sharesFileData1.toDbOutput();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0393");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData0.setCountry("out/BigDB/");
        java.lang.String str3 = companyFileData0.getWeb();
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0394");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData7);
        companyFileData8.setTicker("");
        estimateFileData6.setNameFields(companyFileData8);
        sharesFileData1.setNameFields(companyFileData8);
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum13 = companyFileData8.getExchange();
        companyFileData8.setSector("data/BigDB/");
        companyFileData8.setCountry("Cash File Data");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNull(exchEnum13);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0395");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getAdjToIncQtr();
        double[] doubleArray3 = incSheetFileData1.getGrossOpIncQtr();
        double[] doubleArray4 = incSheetFileData1.getCogsQtr();
        double[] doubleArray5 = incSheetFileData1.getIntExpYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0396");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        java.lang.String str6 = sharesFileData1.getSector();
        sharesFileData1.setInsiderSells("");
        sharesFileData1.setInstSellShrs("Cash File Data");
        int int11 = sharesFileData1.getInsiderBuyShrs();
        double double12 = sharesFileData1.getPrice52lo();
        int int13 = sharesFileData1.getInsiderBuyShrs();
        double[] doubleArray14 = sharesFileData1.getSharesQtr();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(doubleArray14);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0397");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData1);
        companyFileData2.setTicker("");
        estimateFileData0.setNameFields(companyFileData2);
        java.lang.String str6 = estimateFileData0.getName();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData0);
        java.lang.String str8 = estimateFileData0.toDbOutput();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0398");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        companyFileData1.setSector("data/BigDB/");
        java.lang.String[] strArray11 = new java.lang.String[] { "out/BigDB/", "Cash File Data", "Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory((java.util.List<java.lang.String>) strList12, (int) (byte) 100, 1);
        java.util.List<java.lang.String> strList17 = companyFileData1.set((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData18 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData19 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData20 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData21 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData20);
        companyFileData21.setTicker("");
        estimateFileData19.setNameFields(companyFileData21);
        java.lang.String str25 = estimateFileData19.toDbOutput();
        double double26 = estimateFileData19.getEpsY1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData27 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData28 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData27);
        double double29 = sharesFileData28.getFloatshr();
        sharesFileData28.setDollar3m("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        int int32 = sharesFileData28.getInsiderBuyShrs();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData33 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData34 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData33);
        double[] doubleArray35 = incSheetFileData34.getIncTaxYr();
        java.lang.String str36 = incSheetFileData34.toDbOutput();
        double[] doubleArray37 = incSheetFileData34.getGrossIncQtr();
        java.lang.String str38 = incSheetFileData34.getSector();
        double[] doubleArray39 = incSheetFileData34.getGrossOpIncYr();
        double[] doubleArray40 = incSheetFileData34.getAdjToIncYr();
        double[] doubleArray41 = incSheetFileData34.getIncTaxQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData42 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData43 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData42);
        double[] doubleArray44 = balSheetFileData43.getStDebtYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData45 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData48 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData18, estimateFileData19, sharesFileData28, incSheetFileData34, balSheetFileData43, cashFileData45, 1, (int) (short) 10);
        companyFileData18.setZip("out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(fieldDataList16);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(companyFileData18);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(doubleArray35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNull(doubleArray37);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(doubleArray39);
        org.junit.Assert.assertNull(doubleArray40);
        org.junit.Assert.assertNull(doubleArray41);
        org.junit.Assert.assertNull(doubleArray44);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0399");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getLiabEquityQtr();
        double[] doubleArray3 = balSheetFileData1.getTotalAssetsQtr();
        double[] doubleArray4 = balSheetFileData1.getCurrLiabYr();
        double[] doubleArray5 = balSheetFileData1.getInventoryYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0400");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        java.lang.String str4 = companyFileData1.getStreet();
        companyFileData1.setPhone("");
        java.lang.String str7 = companyFileData1.toString();
        double[] doubleArray8 = companyFileData1.getPriceQtr();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0401");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInsiderSellShrs("Cash File Data");
        double double4 = sharesFileData1.getFloatshr();
        double double5 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setMktCap("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        sharesFileData1.setVolume10d("");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0402");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.setQMemory((int) (byte) 0, 35, filetypeEnum2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0403");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        java.lang.String str4 = companyFileData1.getStreet();
        companyFileData1.setPhone("");
        java.lang.String str7 = companyFileData1.getSector();
        java.lang.String str8 = companyFileData1.getZip();
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum9 = companyFileData1.getDowIndex();
        companyFileData1.setSic("out/BigDB/97/Q35/hi!-fundamental-data-97Q35.out/BigDB/97/Q0/out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data-fundamental-data-97Q0.data/BigDB/");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(dowEnum9);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0404");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String[] strArray3 = new java.lang.String[] { "out/BigDB/", "out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(strArray0, strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0405");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getCogsYr();
        double[] doubleArray3 = incSheetFileData1.getGrossIncYr();
        double[] doubleArray4 = incSheetFileData1.getIncPrimaryEpsYr();
        double[] doubleArray5 = incSheetFileData1.getIncPrimaryEpsYr();
        double[] doubleArray6 = incSheetFileData1.getEpsDilContYr();
        double[] doubleArray7 = incSheetFileData1.getTotalOpExpQtr();
        double[] doubleArray8 = incSheetFileData1.getIntExpQtr();
        double[] doubleArray9 = incSheetFileData1.getGrossOpIncYr();
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
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0406");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList7);
        balSheetFileData1.setNameFields(companyFileData9);
        double[] doubleArray11 = balSheetFileData1.getTotalLiabYr();
        double[] doubleArray12 = balSheetFileData1.getCurrLiabQtr();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(companyFileData9);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0407");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        java.lang.String str4 = companyFileData1.getStreet();
        companyFileData1.setPhone("");
        java.lang.String str7 = companyFileData1.getSector();
        double[] doubleArray8 = companyFileData1.getPriceQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData1);
        companyFileData1.setSnpIndex("");
        java.lang.String str12 = companyFileData1.toString();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0408");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        sharesFileData1.setFromReport((int) (short) -1, (int) (byte) 10);
        sharesFileData1.setInstShareholders("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        double double11 = sharesFileData1.getPrice();
        int int12 = sharesFileData1.getInsiderSellShrs();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0409");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInsiderSellShrs("Cash File Data");
        int int4 = sharesFileData1.getInstSellShrs();
        long long5 = sharesFileData1.getVolume10d();
        int int6 = sharesFileData1.getInsiderSells();
        double double7 = sharesFileData1.getPrice();
        double double8 = sharesFileData1.getInsiderNetPercentOutstanding();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0410");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, (int) (byte) -1);
        java.lang.String str3 = fieldData2.toString();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum4 = fieldData2.getExchange();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum5 = fieldData2.getExchange();
        fieldData2.setYear((int) ' ');
        java.lang.String str8 = fieldData2.genOutput();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(exchEnum4);
        org.junit.Assert.assertNull(exchEnum5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0411");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        companyFileData1.setSector("data/BigDB/");
        java.lang.String[] strArray11 = new java.lang.String[] { "out/BigDB/", "Cash File Data", "Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory((java.util.List<java.lang.String>) strList12, (int) (byte) 100, 1);
        java.util.List<java.lang.String> strList17 = companyFileData1.set((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum18 = companyFileData1.getExchange();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(fieldDataList16);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNull(exchEnum18);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0412");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        java.lang.String str6 = sharesFileData1.getSector();
        sharesFileData1.setInsiderSells("");
        sharesFileData1.setInstSellShrs("Cash File Data");
        sharesFileData1.setMktCap("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        double double13 = sharesFileData1.getMktCap();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0413");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.parseSipData(10, (int) (byte) 1, filetypeEnum2);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0414");
        java.lang.String[] strArray2 = new java.lang.String[] { "out/BigDB/", "Cash File Data" };
        java.lang.String[] strArray6 = new java.lang.String[] { "out/BigDB/97/Q0/out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data-fundamental-data-97Q0.data/BigDB/", "out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(strArray2, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0415");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        sharesFileData1.setInstBuyShrs("out/BigDB/");
        sharesFileData1.setVolume10d("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        java.lang.String[] strArray14 = new java.lang.String[] { "", "Cash File Data", "", "Cash File Data" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData17 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData18 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData19 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData18);
        double double20 = sharesFileData19.getInsiderNetPercentOutstanding();
        double[] doubleArray26 = new double[] { 0, 1.0f, (short) 1, 100.0f, 1 };
        sharesFileData19.setSharesY(doubleArray26);
        double double28 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getTtm(doubleArray26);
        sharesFileData17.setSharesY(doubleArray26);
        sharesFileData1.setSharesQ(doubleArray26);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(sharesFileData17);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[0.0, 1.0, 1.0, 100.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 103.0d + "'", double28 == 103.0d);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0416");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readSipData("out/BigDB/97/Q35/hi!-fundamental-data-97Q35.out/BigDB/97/Q0/out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data-fundamental-data-97Q0.data/BigDB/");
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0417");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData1);
        companyFileData2.setTicker("");
        estimateFileData0.setNameFields(companyFileData2);
        double double6 = estimateFileData0.getEpsQ1();
        java.lang.String str7 = estimateFileData0.toString();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0418");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList7);
        balSheetFileData1.setNameFields(companyFileData9);
        double[] doubleArray11 = balSheetFileData1.getStDebtYr();
        double[] doubleArray12 = balSheetFileData1.getNetFixedAssetsQtr();
        double[] doubleArray13 = balSheetFileData1.getLiabEquityQtr();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(companyFileData9);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0419");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getQFromDb((int) (short) 0, 35, filetypeEnum2);
        org.junit.Assert.assertNull(fieldDataList3);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0420");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.setQMemory(100, (int) ' ', filetypeEnum2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0421");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getStInvestQtr();
        double[] doubleArray3 = balSheetFileData1.getOtherLtAssetsYr();
        double[] doubleArray4 = balSheetFileData1.getOtherLtAssetsQtr();
        double[] doubleArray5 = balSheetFileData1.getOtherLtLiabYr();
        double[] doubleArray6 = balSheetFileData1.getAcctRxQtr();
        double[] doubleArray7 = balSheetFileData1.getNetFixedAssetsQtr();
        double[] doubleArray8 = balSheetFileData1.getLiabEquityQtr();
        double[] doubleArray9 = balSheetFileData1.getPrefStockQtr();
        double[] doubleArray10 = balSheetFileData1.getStDebtQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0422");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList7);
        balSheetFileData1.setNameFields(companyFileData9);
        double[] doubleArray11 = balSheetFileData1.getEquityQtr();
        java.lang.String str12 = balSheetFileData1.getTicker();
        double[] doubleArray13 = balSheetFileData1.getTotalLiabYr();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(companyFileData9);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(doubleArray13);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0423");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getIncTaxYr();
        java.lang.String str3 = incSheetFileData1.toDbOutput();
        double[] doubleArray4 = incSheetFileData1.getEpsQtr();
        double[] doubleArray5 = incSheetFileData1.getRdQtr();
        double[] doubleArray6 = incSheetFileData1.getIncTaxQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0424");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readSipData("data/BigDB/");
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0425");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getLiabEquityQtr();
        double[] doubleArray3 = balSheetFileData1.getOtherLtLiabQtr();
        double[] doubleArray4 = balSheetFileData1.getCurrAssetsQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0426");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getOtherCurrLiabYr();
        double[] doubleArray3 = balSheetFileData1.getCurrAssetsQtr();
        java.lang.String str4 = balSheetFileData1.getExchange();
        java.lang.String str5 = balSheetFileData1.getExchange();
        double[] doubleArray6 = balSheetFileData1.getTotalAssetsQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0427");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        java.lang.String str4 = companyFileData1.getStreet();
        companyFileData1.setPhone("");
        java.lang.String str7 = companyFileData1.getSector();
        java.lang.String str8 = companyFileData1.getZip();
        double[] doubleArray9 = companyFileData1.getPriceQtr();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = companyFileData1.getExchangeStr();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0428");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getAdjToIncQtr();
        double[] doubleArray3 = incSheetFileData1.getGrossOpIncQtr();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData11 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList9);
        companyFileData11.setSector("out/BigDB/");
        java.lang.String str14 = companyFileData11.getPhone();
        incSheetFileData1.setNameFields(companyFileData11);
        java.lang.String str16 = companyFileData11.getDowIndexStr();
        // The following exception was thrown during execution in test generation
        try {
            companyFileData11.setExchange("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No enum constant net.ajaskey.market.tools.SIP.BigDB.ExchEnum.hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(companyFileData11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0429");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, (int) (byte) -1);
        java.lang.String str3 = fieldData2.getIndustry();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = fieldData2.getEstimateData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = fieldData2.getCashData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData5);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(cashFileData5);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0430");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData7);
        companyFileData8.setTicker("");
        estimateFileData6.setNameFields(companyFileData8);
        sharesFileData1.setNameFields(companyFileData8);
        sharesFileData1.setVolume10d("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        int int15 = sharesFileData1.getInstShareholders();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0431");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getCogsYr();
        double[] doubleArray3 = incSheetFileData1.getGrossIncYr();
        double[] doubleArray4 = incSheetFileData1.getIncPrimaryEpsYr();
        double[] doubleArray5 = incSheetFileData1.getDividendQtr();
        double[] doubleArray6 = incSheetFileData1.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData1.getAdjToIncYr();
        double[] doubleArray8 = incSheetFileData1.getUnusualIncYr();
        double[] doubleArray9 = incSheetFileData1.getEpsDilContQtr();
        double[] doubleArray10 = incSheetFileData1.getRdQtr();
        double[] doubleArray11 = incSheetFileData1.getGrossIncQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0432");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (byte) 0, (int) (short) 1);
        int int3 = fieldData2.getQuarter();
        java.lang.String str4 = fieldData2.getTicker();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0433");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getCogsYr();
        double[] doubleArray3 = incSheetFileData1.getEpsDilContYr();
        double[] doubleArray4 = incSheetFileData1.getAdjToIncYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0434");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        java.lang.String str4 = companyFileData1.getStreet();
        companyFileData1.setPhone("");
        companyFileData1.setAdr("out/BigDB/");
        java.lang.String str9 = companyFileData1.getSic();
        companyFileData1.setState("data/BigDB/");
        companyFileData1.setZip("out/BigDB/");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData14 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str15 = estimateFileData14.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData16);
        double double18 = sharesFileData17.getFloatshr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData19 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData19);
        double[] doubleArray21 = incSheetFileData20.getCogsYr();
        double[] doubleArray22 = incSheetFileData20.getGrossIncYr();
        double[] doubleArray23 = incSheetFileData20.getIncPrimaryEpsYr();
        double[] doubleArray24 = incSheetFileData20.getIntExpNonOpYr();
        double[] doubleArray25 = incSheetFileData20.getIncTaxQtr();
        double[] doubleArray26 = incSheetFileData20.getIncAfterTaxYr();
        double[] doubleArray27 = incSheetFileData20.getEpsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData28 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData29 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData28);
        double[] doubleArray30 = balSheetFileData29.getStInvestQtr();
        double[] doubleArray31 = balSheetFileData29.getEquityQtr();
        double[] doubleArray32 = balSheetFileData29.getLtInvestQtr();
        double[] doubleArray33 = balSheetFileData29.getCashYr();
        double[] doubleArray34 = balSheetFileData29.getPrefStockQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData35 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        java.lang.String str36 = cashFileData35.toDbOutput();
        java.lang.String str37 = cashFileData35.toString();
        double[] doubleArray38 = cashFileData35.getCashFromInvQtr();
        java.lang.String str39 = cashFileData35.getTicker();
        double[] doubleArray40 = cashFileData35.getCashFromOpsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData43 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData14, sharesFileData17, incSheetFileData20, balSheetFileData29, cashFileData35, 35, 1);
        java.lang.String str44 = companyFileData1.getStreet();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNull(doubleArray21);
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(doubleArray24);
        org.junit.Assert.assertNull(doubleArray25);
        org.junit.Assert.assertNull(doubleArray26);
        org.junit.Assert.assertNull(doubleArray27);
        org.junit.Assert.assertNull(doubleArray30);
        org.junit.Assert.assertNull(doubleArray31);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertNull(doubleArray33);
        org.junit.Assert.assertNull(doubleArray34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Cash File Data" + "'", str37, "Cash File Data");
        org.junit.Assert.assertNull(doubleArray38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNull(doubleArray40);
        org.junit.Assert.assertNull(str44);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0435");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        java.lang.String str4 = companyFileData1.getStreet();
        companyFileData1.setWeb("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        companyFileData1.setCity("Cash File Data");
        double[] doubleArray9 = companyFileData1.getPriceQtr();
        companyFileData1.setWeb("");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0436");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getAdjToIncQtr();
        double[] doubleArray3 = incSheetFileData1.getGrossOpIncQtr();
        double[] doubleArray4 = incSheetFileData1.getIncTaxQtr();
        double[] doubleArray5 = incSheetFileData1.getIncAfterTaxYr();
        double[] doubleArray6 = incSheetFileData1.getEpsDilQtr();
        double[] doubleArray7 = incSheetFileData1.getPreTaxIncQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0437");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, (int) (byte) -1);
        java.lang.String str3 = fieldData2.toString();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum4 = fieldData2.getExchange();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum5 = fieldData2.getExchange();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData6 = fieldData2.getShareData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData7 = fieldData2.getBalSheetData();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(exchEnum4);
        org.junit.Assert.assertNull(exchEnum5);
        org.junit.Assert.assertNotNull(sharesFileData6);
        org.junit.Assert.assertNotNull(balSheetFileData7);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0438");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getAdjToIncQtr();
        double[] doubleArray3 = incSheetFileData1.getGrossOpIncQtr();
        double[] doubleArray4 = incSheetFileData1.getIncTaxQtr();
        double[] doubleArray5 = incSheetFileData1.getEpsDilContQtr();
        double[] doubleArray6 = incSheetFileData1.getGrossIncYr();
        java.lang.String str7 = incSheetFileData1.toDbOutput();
        double[] doubleArray8 = incSheetFileData1.getTotalOpExpQtr();
        double[] doubleArray9 = incSheetFileData1.getUnusualIncQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0439");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double1 = estimateFileData0.getEpsY1();
        java.lang.String str2 = estimateFileData0.getSector();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData3);
        companyFileData4.setTicker("");
        java.lang.String str7 = companyFileData4.getStreet();
        companyFileData4.setPhone("");
        java.lang.String str10 = companyFileData4.getSector();
        double[] doubleArray11 = companyFileData4.getPriceQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData12 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData4);
        estimateFileData0.setNameFields(companyFileData12);
        java.lang.String str14 = companyFileData12.getName();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0440");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData1);
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum3 = companyFileData2.getExchange();
        companyFileData2.setStreet("data/BigDB/");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum6 = companyFileData2.getExchange();
        java.lang.String str7 = companyFileData2.getCity();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum8 = companyFileData2.getExchange();
        java.lang.String str9 = companyFileData2.getDowIndexStr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData10 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData11 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData10);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData12 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData10);
        java.lang.String str13 = estimateFileData12.getName();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData14 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData15 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData14);
        sharesFileData15.setInsiderSellShrs("Cash File Data");
        double double18 = sharesFileData15.getBeta();
        double double19 = sharesFileData15.getBeta();
        sharesFileData15.setFloatshr("out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        java.lang.String str22 = sharesFileData15.toString();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData23 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData23);
        double[] doubleArray25 = incSheetFileData24.getAdjToIncQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData26 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData26);
        double[] doubleArray28 = balSheetFileData27.getOtherCurrLiabYr();
        double[] doubleArray29 = balSheetFileData27.getCurrAssetsQtr();
        double[] doubleArray30 = balSheetFileData27.getAcctPayableQtr();
        java.lang.String[] strArray35 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData38 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList36);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData39 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList36);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData40 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList36);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData43 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData2, estimateFileData12, sharesFileData15, incSheetFileData24, balSheetFileData27, cashFileData40, (int) '#', 0);
        // The following exception was thrown during execution in test generation
        try {
            companyFileData2.setExchange("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No enum constant net.ajaskey.market.tools.SIP.BigDB.ExchEnum.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(exchEnum3);
        org.junit.Assert.assertNull(exchEnum6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(exchEnum8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(doubleArray25);
        org.junit.Assert.assertNull(doubleArray28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertNull(doubleArray30);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(companyFileData38);
        org.junit.Assert.assertNotNull(sharesFileData39);
        org.junit.Assert.assertNotNull(cashFileData40);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0441");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData7);
        companyFileData8.setTicker("");
        estimateFileData6.setNameFields(companyFileData8);
        sharesFileData1.setNameFields(companyFileData8);
        sharesFileData1.setVolume3m("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        double double15 = sharesFileData1.getDollar3m();
        sharesFileData1.setInstShareholders("hi!");
        int int18 = sharesFileData1.getInsiderSellShrs();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0442");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getOtherCurrLiabYr();
        double[] doubleArray3 = balSheetFileData1.getCurrAssetsQtr();
        java.lang.String str4 = balSheetFileData1.getExchange();
        java.lang.String str5 = balSheetFileData1.toString();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0443");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList7);
        balSheetFileData1.setNameFields(companyFileData9);
        double[] doubleArray11 = balSheetFileData1.getStDebtYr();
        double[] doubleArray12 = balSheetFileData1.getEquityQtr();
        double[] doubleArray13 = balSheetFileData1.getOtherCurrAssetsQtr();
        double[] doubleArray14 = balSheetFileData1.getGoodwillQtr();
        double[] doubleArray15 = balSheetFileData1.getBvpsQtr();
        double[] doubleArray16 = balSheetFileData1.getTotalLiabQtr();
        double[] doubleArray17 = balSheetFileData1.getTotalAssetsYr();
        double[] doubleArray18 = balSheetFileData1.getTotalLiabYr();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(companyFileData9);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(doubleArray14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray16);
        org.junit.Assert.assertNull(doubleArray17);
        org.junit.Assert.assertNull(doubleArray18);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0444");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (byte) 0, (int) (short) 1);
        int int3 = fieldData2.getQuarter();
        java.lang.String str4 = fieldData2.getIndustry();
        fieldData2.setQuarter((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0445");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        companyFileData1.setSector("data/BigDB/");
        java.lang.String[] strArray11 = new java.lang.String[] { "out/BigDB/", "Cash File Data", "Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory((java.util.List<java.lang.String>) strList12, (int) (byte) 100, 1);
        java.util.List<java.lang.String> strList17 = companyFileData1.set((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData18 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData19 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData20 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData21 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData20);
        companyFileData21.setTicker("");
        estimateFileData19.setNameFields(companyFileData21);
        java.lang.String str25 = estimateFileData19.toDbOutput();
        double double26 = estimateFileData19.getEpsY1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData27 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData28 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData27);
        double double29 = sharesFileData28.getFloatshr();
        sharesFileData28.setDollar3m("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        int int32 = sharesFileData28.getInsiderBuyShrs();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData33 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData34 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData33);
        double[] doubleArray35 = incSheetFileData34.getIncTaxYr();
        java.lang.String str36 = incSheetFileData34.toDbOutput();
        double[] doubleArray37 = incSheetFileData34.getGrossIncQtr();
        java.lang.String str38 = incSheetFileData34.getSector();
        double[] doubleArray39 = incSheetFileData34.getGrossOpIncYr();
        double[] doubleArray40 = incSheetFileData34.getAdjToIncYr();
        double[] doubleArray41 = incSheetFileData34.getIncTaxQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData42 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData43 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData42);
        double[] doubleArray44 = balSheetFileData43.getStDebtYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData45 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData48 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData18, estimateFileData19, sharesFileData28, incSheetFileData34, balSheetFileData43, cashFileData45, 1, (int) (short) 10);
        java.lang.String str49 = estimateFileData19.getSector();
        double double50 = estimateFileData19.getEpsQ1();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum51 = estimateFileData19.getExchange();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum52 = estimateFileData19.getExchange();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(fieldDataList16);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(companyFileData18);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(doubleArray35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNull(doubleArray37);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(doubleArray39);
        org.junit.Assert.assertNull(doubleArray40);
        org.junit.Assert.assertNull(doubleArray41);
        org.junit.Assert.assertNull(doubleArray44);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertNull(exchEnum51);
        org.junit.Assert.assertNull(exchEnum52);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0446");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInsiderSellShrs("Cash File Data");
        sharesFileData1.setInsiderBuys("hi!");
        java.lang.String str6 = sharesFileData1.getName();
        sharesFileData1.setInsiderOwnership("hi!");
        sharesFileData1.setInsiderNetTrades("out/BigDB/97/Q35/hi!-fundamental-data-97Q35.out/BigDB/97/Q0/out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data-fundamental-data-97Q0.data/BigDB/");
        int int11 = sharesFileData1.getInsiderBuys();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0447");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, (int) (byte) -1);
        java.lang.String str3 = fieldData2.getSector();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData4 = fieldData2.getIncSheetData();
        double[] doubleArray5 = incSheetFileData4.getDepreciationYr();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(incSheetFileData4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0448");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 100, (int) (byte) -1);
        fieldData2.setQuarter((int) (byte) 100);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0449");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getCogsYr();
        double[] doubleArray3 = incSheetFileData1.getGrossIncYr();
        double[] doubleArray4 = incSheetFileData1.getIncPrimaryEpsYr();
        double[] doubleArray5 = incSheetFileData1.getDividendQtr();
        double[] doubleArray6 = incSheetFileData1.getAdjToIncYr();
        double[] doubleArray7 = incSheetFileData1.getEpsDilYr();
        java.lang.String str8 = incSheetFileData1.toDbOutput();
        double[] doubleArray9 = incSheetFileData1.getIncPrimaryEpsYr();
        double[] doubleArray10 = incSheetFileData1.getEpsContYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0450");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, (int) (byte) -1);
        java.lang.String str3 = fieldData2.getIndustry();
        fieldData2.setQuarter(0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData6 = fieldData2.getCashData();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum7 = fieldData2.getExchange();
        java.lang.String str8 = fieldData2.getName();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData9 = fieldData2.getShareData();
        double double10 = sharesFileData9.getInstOwnership();
        int int11 = sharesFileData9.getInsiderSells();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(cashFileData6);
        org.junit.Assert.assertNull(exchEnum7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(sharesFileData9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0451");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear(0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter2 = fieldDataYear1.getQ2();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter3 = fieldDataYear1.getQ2();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter4 = fieldDataYear1.getQ4();
        boolean boolean5 = fieldDataYear1.isInUse();
        boolean boolean6 = fieldDataYear1.isInUse();
        int int7 = fieldDataYear1.getYear();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter8 = fieldDataYear1.getQ4();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter9 = fieldDataYear1.getQ3();
        org.junit.Assert.assertNull(fieldDataQuarter2);
        org.junit.Assert.assertNull(fieldDataQuarter3);
        org.junit.Assert.assertNull(fieldDataQuarter4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(fieldDataQuarter8);
        org.junit.Assert.assertNull(fieldDataQuarter9);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0452");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        sharesFileData1.setVolume10d("out/BigDB/");
        double[] doubleArray8 = sharesFileData1.getSharesYr();
        sharesFileData1.setInstOwnership("data/BigDB/");
        sharesFileData1.setDollar3m("Cash File Data");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0453");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getOtherCurrLiabYr();
        double[] doubleArray3 = balSheetFileData1.getEquityQtr();
        double[] doubleArray4 = balSheetFileData1.getBvpsYr();
        double[] doubleArray5 = balSheetFileData1.getAcctRxYr();
        double[] doubleArray6 = balSheetFileData1.getCurrLiabQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0454");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData7);
        companyFileData8.setTicker("");
        estimateFileData6.setNameFields(companyFileData8);
        sharesFileData1.setNameFields(companyFileData8);
        sharesFileData1.setInsiderNetPercentOutstanding("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        sharesFileData1.setInsiderBuys("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = sharesFileData1.toDbOutput();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0455");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getCogsYr();
        double[] doubleArray3 = incSheetFileData1.getGrossIncYr();
        double[] doubleArray4 = incSheetFileData1.getIncPrimaryEpsYr();
        double[] doubleArray5 = incSheetFileData1.getIntExpNonOpYr();
        double[] doubleArray6 = incSheetFileData1.getIncTaxQtr();
        double[] doubleArray7 = incSheetFileData1.getIncAfterTaxYr();
        double[] doubleArray8 = incSheetFileData1.getAdjToIncQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData9 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0456");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData1);
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum3 = companyFileData2.getExchange();
        companyFileData2.setStreet("data/BigDB/");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum6 = companyFileData2.getExchange();
        companyFileData2.setPhone("out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        org.junit.Assert.assertNull(exchEnum3);
        org.junit.Assert.assertNull(exchEnum6);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0457");
        java.lang.String[] strArray3 = new java.lang.String[] { "out/BigDB/", "out/BigDB/", "out/BigDB/97/Q35/hi!-fundamental-data-97Q35.out/BigDB/97/Q0/out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data-fundamental-data-97Q0.data/BigDB/" };
        java.lang.String[] strArray9 = new java.lang.String[] { "out/BigDB/97/Q35/hi!-fundamental-data-97Q35.out/BigDB/97/Q0/out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data-fundamental-data-97Q0.data/BigDB/", "Cash File Data", "Cash File Data", "", "out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData10 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(strArray3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0458");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInsiderSellShrs("Cash File Data");
        sharesFileData1.setInsiderBuys("hi!");
        double double6 = sharesFileData1.getBeta();
        sharesFileData1.setDollar3m("data/BigDB/");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0459");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        sharesFileData1.setVolume10d("out/BigDB/");
        double[] doubleArray11 = new double[] { ' ', (short) -1, 100.0f };
        sharesFileData1.setSharesQ(doubleArray11);
        sharesFileData1.setMktCap("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[32.0, -1.0, 100.0]");
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0460");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear(0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter2 = fieldDataYear1.getQ2();
        boolean boolean3 = fieldDataYear1.isInUse();
        boolean boolean5 = fieldDataYear1.quarterDataAvailable((int) (short) 0);
        org.junit.Assert.assertNull(fieldDataQuarter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0461");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readSipData("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "Cash File Data");
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0462");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getStInvestQtr();
        double[] doubleArray3 = balSheetFileData1.getOtherLtAssetsYr();
        double[] doubleArray4 = balSheetFileData1.getOtherLtAssetsQtr();
        double[] doubleArray5 = balSheetFileData1.getOtherLtLiabYr();
        double[] doubleArray6 = balSheetFileData1.getAcctRxQtr();
        double[] doubleArray7 = balSheetFileData1.getNetFixedAssetsQtr();
        double[] doubleArray8 = balSheetFileData1.getLiabEquityQtr();
        java.lang.String str9 = balSheetFileData1.getName();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0463");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getAdjToIncQtr();
        double[] doubleArray3 = incSheetFileData1.getGrossOpIncQtr();
        double[] doubleArray4 = incSheetFileData1.getDepreciationQtr();
        double[] doubleArray5 = incSheetFileData1.getOtherIncQtr();
        double[] doubleArray6 = incSheetFileData1.getGrossOpIncQtr();
        double[] doubleArray7 = incSheetFileData1.getUnusualIncQtr();
        double[] doubleArray8 = incSheetFileData1.getUnusualIncQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0464");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        java.lang.String str4 = companyFileData1.getStreet();
        companyFileData1.setPhone("");
        companyFileData1.setState("out/BigDB/");
        java.lang.String str9 = companyFileData1.getWeb();
        boolean boolean10 = companyFileData1.isAdr();
        java.lang.String str11 = companyFileData1.getWeb();
        companyFileData1.setCountry("Cash File Data");
        int int14 = companyFileData1.getNumEmployees();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0465");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getAdjToIncQtr();
        double[] doubleArray3 = incSheetFileData1.getGrossOpIncQtr();
        double[] doubleArray4 = incSheetFileData1.getIntExpNonOpQtr();
        double[] doubleArray5 = incSheetFileData1.getAdjToIncYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0466");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList7);
        balSheetFileData1.setNameFields(companyFileData9);
        double[] doubleArray11 = balSheetFileData1.getEquityQtr();
        java.lang.String str12 = balSheetFileData1.getTicker();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData13 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray14 = balSheetFileData1.getBvpsQtr();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(companyFileData9);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(doubleArray14);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0467");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData1.setInsiderSellShrs("Cash File Data");
        int int4 = sharesFileData1.getInstSellShrs();
        sharesFileData1.setDollar3m("hi!");
        sharesFileData1.setInstSellShrs("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        double double9 = sharesFileData1.getFloatshr();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0468");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        companyFileData1.setSector("data/BigDB/");
        java.lang.String[] strArray11 = new java.lang.String[] { "out/BigDB/", "Cash File Data", "Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory((java.util.List<java.lang.String>) strList12, (int) (byte) 100, 1);
        java.util.List<java.lang.String> strList17 = companyFileData1.set((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData18 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData19 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData21 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData22 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(fieldDataList16);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(companyFileData18);
        org.junit.Assert.assertNotNull(companyFileData19);
        org.junit.Assert.assertNotNull(estimateFileData20);
        org.junit.Assert.assertNotNull(incSheetFileData21);
        org.junit.Assert.assertNotNull(incSheetFileData22);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0469");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getEquityYr();
        double[] doubleArray3 = balSheetFileData1.getLtDebtYr();
        java.lang.String str4 = balSheetFileData1.toDbOutput();
        double[] doubleArray5 = balSheetFileData1.getStInvestYr();
        double[] doubleArray6 = balSheetFileData1.getLiabEquityQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0470");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        sharesFileData1.setVolume10d("out/BigDB/");
        double[] doubleArray11 = new double[] { ' ', (short) -1, 100.0f };
        sharesFileData1.setSharesQ(doubleArray11);
        int int13 = sharesFileData1.getInsiderNetTrades();
        double[] doubleArray14 = sharesFileData1.getSharesYr();
        double double15 = sharesFileData1.getDollar3m();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[32.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(doubleArray14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0471");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        java.lang.String str4 = companyFileData1.getStreet();
        companyFileData1.setPhone("");
        companyFileData1.setAdr("out/BigDB/");
        java.lang.String str9 = companyFileData1.getSic();
        companyFileData1.setState("data/BigDB/");
        companyFileData1.setZip("out/BigDB/");
        companyFileData1.setPhone("");
        java.lang.String str16 = companyFileData1.getIndustry();
        // The following exception was thrown during execution in test generation
        try {
            companyFileData1.setExchange("Cash File Data");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No enum constant net.ajaskey.market.tools.SIP.BigDB.ExchEnum.Cash File Data");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0472");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData0);
        java.lang.String str2 = estimateFileData1.getIndustry();
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0473");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        java.lang.String str6 = sharesFileData1.getSector();
        sharesFileData1.setInstShareholders("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        sharesFileData1.setInsiderBuyShrs("hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0474");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        java.lang.String str6 = sharesFileData1.getSector();
        sharesFileData1.setFloatshr("");
        sharesFileData1.setVolume10d("Cash File Data");
        double double11 = sharesFileData1.getPrice52hi();
        double double12 = sharesFileData1.getFloatshr();
        double double13 = sharesFileData1.getDollar3m();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0475");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        sharesFileData1.setInstBuyShrs("out/BigDB/");
        java.lang.String str8 = sharesFileData1.getTicker();
        double double9 = sharesFileData1.getBeta();
        sharesFileData1.setBeta("out/BigDB/");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0476");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        java.lang.String str2 = sharesFileData1.getTicker();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData3 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData3);
        companyFileData4.setTicker("");
        java.lang.String str7 = companyFileData4.getStreet();
        companyFileData4.setPhone("");
        companyFileData4.setState("out/BigDB/");
        sharesFileData1.setNameFields(companyFileData4);
        double double13 = sharesFileData1.getBeta();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0477");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getStDebtYr();
        java.lang.String str3 = balSheetFileData1.getTicker();
        double[] doubleArray4 = balSheetFileData1.getBvpsYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(doubleArray4);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0478");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        java.lang.String str4 = companyFileData1.getStreet();
        companyFileData1.setPhone("");
        java.lang.String str7 = companyFileData1.getSector();
        companyFileData1.setTicker("out/BigDB/97/Q35/hi!-fundamental-data-97Q35.out/BigDB/97/Q0/out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data-fundamental-data-97Q0.data/BigDB/");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0479");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.parseSipData(10, (int) 'a', filetypeEnum2);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0480");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData1);
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum3 = companyFileData2.getExchange();
        java.lang.String str4 = companyFileData2.getTicker();
        org.junit.Assert.assertNull(exchEnum3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0481");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getCogsYr();
        double[] doubleArray3 = incSheetFileData1.getGrossIncYr();
        double[] doubleArray4 = incSheetFileData1.getIncPrimaryEpsYr();
        double[] doubleArray5 = incSheetFileData1.getIntExpNonOpYr();
        double[] doubleArray6 = incSheetFileData1.getIncTaxQtr();
        double[] doubleArray7 = incSheetFileData1.getTotalOpExpQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0482");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getCogsYr();
        double[] doubleArray3 = incSheetFileData1.getGrossIncYr();
        double[] doubleArray4 = incSheetFileData1.getIncPrimaryEpsYr();
        double[] doubleArray5 = incSheetFileData1.getDividendQtr();
        double[] doubleArray6 = incSheetFileData1.getAdjToIncYr();
        double[] doubleArray7 = incSheetFileData1.getEpsDilYr();
        java.lang.String str8 = incSheetFileData1.toDbOutput();
        double[] doubleArray9 = incSheetFileData1.getEpsContQtr();
        double[] doubleArray10 = incSheetFileData1.getDepreciationQtr();
        double[] doubleArray11 = incSheetFileData1.getEpsContQtr();
        java.lang.String str12 = incSheetFileData1.getIndustry();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0483");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getCogsYr();
        double[] doubleArray3 = incSheetFileData1.getGrossIncYr();
        double[] doubleArray4 = incSheetFileData1.getIncPrimaryEpsYr();
        double[] doubleArray5 = incSheetFileData1.getDividendQtr();
        double[] doubleArray6 = incSheetFileData1.getAdjToIncYr();
        double[] doubleArray7 = incSheetFileData1.getEpsDilYr();
        java.lang.String str8 = incSheetFileData1.toDbOutput();
        double[] doubleArray9 = incSheetFileData1.getIncPrimaryEpsQtr();
        double[] doubleArray10 = incSheetFileData1.getDividendYr();
        double[] doubleArray11 = incSheetFileData1.getUnusualIncYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0484");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear(0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter2 = fieldDataYear1.getQ2();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter3 = fieldDataYear1.getQ2();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter4 = fieldDataYear1.getQ4();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter6 = fieldDataYear1.getQ(0);
        int int7 = fieldDataYear1.getYear();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter8 = fieldDataYear1.getQ3();
        int int9 = fieldDataYear1.getYear();
        org.junit.Assert.assertNull(fieldDataQuarter2);
        org.junit.Assert.assertNull(fieldDataQuarter3);
        org.junit.Assert.assertNull(fieldDataQuarter4);
        org.junit.Assert.assertNull(fieldDataQuarter6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(fieldDataQuarter8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0485");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear(0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter2 = fieldDataYear1.getQ2();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter3 = fieldDataYear1.getQ2();
        java.lang.String[] strArray12 = new java.lang.String[] { "out/BigDB/", "Cash File Data", "Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory((java.util.List<java.lang.String>) strList13, (int) (byte) 100, 1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter18 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter(100, (int) (byte) -1, fieldDataList17);
        fieldDataYear1.set(0, fieldDataQuarter18);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter21 = fieldDataYear1.getQ((int) (short) 1);
        org.junit.Assert.assertNull(fieldDataQuarter2);
        org.junit.Assert.assertNull(fieldDataQuarter3);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(fieldDataList17);
        org.junit.Assert.assertNull(fieldDataQuarter21);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0486");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getNetFixedAssetsYr();
        java.lang.String str3 = balSheetFileData1.getIndustry();
        double[] doubleArray4 = balSheetFileData1.getCashQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0487");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getStInvestQtr();
        double[] doubleArray3 = balSheetFileData1.getEquityQtr();
        double[] doubleArray4 = balSheetFileData1.getLtInvestQtr();
        double[] doubleArray5 = balSheetFileData1.getCashYr();
        double[] doubleArray6 = balSheetFileData1.getPrefStockQtr();
        java.lang.String str7 = balSheetFileData1.getName();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0488");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.setMemory((int) (short) 100, 0, filetypeEnum2);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0489");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        java.lang.String str4 = companyFileData1.getStreet();
        companyFileData1.setPhone("");
        java.lang.String str7 = companyFileData1.getSector();
        java.lang.String[] strArray12 = new java.lang.String[] { "", "Cash File Data", "", "Cash File Data" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData15 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList13);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData16 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList13);
        java.util.List<java.lang.String> strList17 = companyFileData1.set((java.util.List<java.lang.String>) strList13);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData18 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList13);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData19 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList13);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(sharesFileData15);
        org.junit.Assert.assertNotNull(cashFileData16);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(sharesFileData18);
        org.junit.Assert.assertNotNull(cashFileData19);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0490");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setNumEmployees("out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0491");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        companyFileData1.setSector("data/BigDB/");
        java.lang.String[] strArray11 = new java.lang.String[] { "out/BigDB/", "Cash File Data", "Cash File Data", "out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data", "" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory((java.util.List<java.lang.String>) strList12, (int) (byte) 100, 1);
        java.util.List<java.lang.String> strList17 = companyFileData1.set((java.util.List<java.lang.String>) strList12);
        java.lang.String str18 = companyFileData1.getSector();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(fieldDataList16);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "data/BigDB/" + "'", str18, "data/BigDB/");
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0492");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getFloatshr();
        sharesFileData1.setDollar3m("out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
        double double5 = sharesFileData1.getInsiderNetPercentOutstanding();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0493");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        sharesFileData1.setInstBuyShrs("out/BigDB/");
        java.lang.String str8 = sharesFileData1.getTicker();
        double double9 = sharesFileData1.getBeta();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData10 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData1);
        sharesFileData10.setInsiderSells("out/BigDB/97/Q35/hi!-fundamental-data-97Q35.out/BigDB/97/Q0/out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data-fundamental-data-97Q0.data/BigDB/");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0494");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getAdjToIncQtr();
        double[] doubleArray3 = incSheetFileData1.getGrossOpIncQtr();
        double[] doubleArray4 = incSheetFileData1.getEpsDilContQtr();
        double[] doubleArray5 = incSheetFileData1.getRdQtr();
        double[] doubleArray6 = incSheetFileData1.getOtherIncQtr();
        double[] doubleArray7 = incSheetFileData1.getTotalOpExpYr();
        double[] doubleArray8 = incSheetFileData1.getEpsDilQtr();
        double[] doubleArray9 = incSheetFileData1.getNetIncYr();
        double[] doubleArray10 = incSheetFileData1.getIntExpYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0495");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readSipData("Cash File Data", "out/BigDB/10/Q1/data/BigDB/-fundamental-data-10Q1.out/BigDB/0/Q100/Cash File Data-fundamental-data-0Q100.Cash File Data");
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0496");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setTicker("");
        java.lang.String str4 = companyFileData1.getStreet();
        companyFileData1.setPhone("");
        java.lang.String str7 = companyFileData1.getSector();
        java.lang.String[] strArray12 = new java.lang.String[] { "", "Cash File Data", "", "Cash File Data" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData15 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList13);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData16 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList13);
        java.util.List<java.lang.String> strList17 = companyFileData1.set((java.util.List<java.lang.String>) strList13);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData18 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readFromDb(strList17);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(sharesFileData15);
        org.junit.Assert.assertNotNull(cashFileData16);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(balSheetFileData18);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0497");
        int int0 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.getADR();
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0498");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getOtherCurrLiabYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData3 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray4 = balSheetFileData1.getAcctPayableYr();
        double[] doubleArray5 = balSheetFileData1.getCurrLiabYr();
        double[] doubleArray6 = balSheetFileData1.getOtherLtLiabYr();
        double[] doubleArray7 = balSheetFileData1.getLiabEquityYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0499");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double double2 = sharesFileData1.getInsiderNetPercentOutstanding();
        sharesFileData1.setFromReport((int) (short) -1, (-1));
        sharesFileData1.setVolume10d("out/BigDB/");
        double[] doubleArray12 = new double[] { (byte) 0, 0L, (-1), 35 };
        sharesFileData1.setSharesY(doubleArray12);
        double double14 = sharesFileData1.getPrice52hi();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 0.0, -1.0, 35.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0500");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getOtherCurrLiabYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData3 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray4 = balSheetFileData1.getAcctPayableYr();
        double[] doubleArray5 = balSheetFileData1.getCurrAssetsYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
    }
}

