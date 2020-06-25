package net.ajaskey.market.tools.SIP.BigDB.dataio;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DataIoTests0 {

    public static boolean debug = false;

    @Test
    public void test00001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00001");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.clearList();
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00002");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(strArray0, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00003");
        java.lang.String str4 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getOutfileName(0, 100, "", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!" + "'", str4, "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00004");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.find("");
        org.junit.Assert.assertNull(companyFileData1);
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00005");
        int int0 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.getListCount();
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00006");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData> companyFileDataList0 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.getCfdList();
        org.junit.Assert.assertNotNull(companyFileDataList0);
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00007");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.clearList();
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00008");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.clearList();
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00009");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "hi!", "", "" };
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
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00010");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FiletypeEnum filetypeEnum2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getAllFromDb((int) (byte) 100, (int) (short) -1, filetypeEnum2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00011");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.clearList();
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00012");
        int int0 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.getListCount();
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00013");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.parseSipData((int) ' ', 0, filetypeEnum2);
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00014");
        java.lang.String[] strArray6 = new java.lang.String[] { "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "hi!", "", "hi!", "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "" };
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
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00015");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(strArray0, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00016");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.find("hi!");
        org.junit.Assert.assertNull(companyFileData1);
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00017");
        int int0 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.getListCount();
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00018");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readSipData("", "hi!");
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00019");
        int int0 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.getListCount();
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00020");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.find("hi!");
        org.junit.Assert.assertNull(incSheetFileData1);
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00021");
        java.lang.String str4 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getOutfileName(0, (int) (byte) 100, "NONE", "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!" + "'", str4, "out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00022");
        java.lang.String str0 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.outbasedir;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "out/BigDB/" + "'", str0, "out/BigDB/");
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00023");
        java.lang.String str0 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.listToString();
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "" + "'", str0, "");
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00024");
        java.lang.String[] strArray4 = new java.lang.String[] { "out/BigDB/", "", "NONE", "out/BigDB/" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData5 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00025");
        int int0 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.getListCount();
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00026");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData> companyFileDataList0 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.getList();
        org.junit.Assert.assertNotNull(companyFileDataList0);
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00027");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.find("out/BigDB/");
        org.junit.Assert.assertNull(sharesFileData1);
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00028");
        java.lang.String[] strArray3 = new java.lang.String[] { "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n", "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n", "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00029");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double double6 = fieldData2.getEpsQ1();
        double[] doubleArray7 = fieldData2.getAcctPayableQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum8 = fieldData2.getExchange();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(exchEnum8);
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00030");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getFromMemory("NONE", (int) (byte) 1, (int) '4');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00031");
        java.lang.String str0 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.listToString();
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "" + "'", str0, "");
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00032");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getAllFromMemory((int) (byte) 10, (int) (short) 100);
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00033");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FiletypeEnum filetypeEnum3 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getFromDb("", (int) (short) 100, (int) '#', filetypeEnum3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00034");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData> cashFileDataList0 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.getCashfdList();
        org.junit.Assert.assertNotNull(cashFileDataList0);
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00035");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getAllFromMemory((int) (short) 0, 100);
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00036");
        java.lang.String str0 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.listToString();
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "" + "'", str0, "");
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00037");
        java.lang.String str0 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.listToString();
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "" + "'", str0, "");
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00038");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.find("NONE");
        org.junit.Assert.assertNull(cashFileData1);
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00039");
        int int0 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.getADR();
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00040");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData0);
        net.ajaskey.common.DateTime dateTime2 = estimateFileData1.getLatestQtrEps();
        double double3 = estimateFileData1.getEpsY2();
        double double4 = estimateFileData1.getEpsQ0();
        org.junit.Assert.assertNull(dateTime2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00041");
        int int0 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.getListCount();
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00042");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!" };
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(strArray2, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00043");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.find("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        org.junit.Assert.assertNull(estimateFileData1);
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00044");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.parseSipData((int) (short) 1, (int) (byte) 10, filetypeEnum2);
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00045");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum1 = sharesFileData0.getExchange();
        org.junit.Assert.assertNull(exchEnum1);
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00046");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.find("out/BigDB/");
        org.junit.Assert.assertNull(estimateFileData1);
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00047");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double double7 = fieldData2.getFloatshr();
        double[] doubleArray8 = fieldData2.getCogsYr();
        double[] doubleArray9 = fieldData2.getPreTaxIncYr();
        double[] doubleArray10 = fieldData2.getOtherIncQtr();
        double[] doubleArray11 = fieldData2.getUnusualIncQtr();
        double[] doubleArray12 = fieldData2.getGrossOpExpQtr();
        long long13 = fieldData2.getVolume10d();
        double[] doubleArray14 = fieldData2.getNetFixedAssetsQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNull(doubleArray14);
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00048");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readSipData("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00049");
        double[] doubleArray4 = new double[] { 0, (byte) 1, (short) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            double double5 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getTtm(doubleArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[0.0, 1.0, -1.0, 1.0]");
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00050");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getFromMemory("out/BigDB/", 10, 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00051");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        double[] doubleArray7 = incSheetFileData5.getCogsYr();
        double[] doubleArray8 = incSheetFileData5.getGrossIncYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00052");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.parseSipData((int) '4', 0, filetypeEnum2);
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00053");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.find("out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        org.junit.Assert.assertNull(companyFileData1);
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00054");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        java.lang.String str7 = incSheetFileData5.getIndustry();
        double[] doubleArray8 = incSheetFileData5.getSalesQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        java.lang.String str10 = companyFileData9.getStreet();
        companyFileData9.setPhone("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        companyFileData9.setCity("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        java.lang.String str15 = companyFileData9.getSic();
        java.lang.String str16 = companyFileData9.getIndustry();
        incSheetFileData5.setNameFields(companyFileData9);
        // The following exception was thrown during execution in test generation
        try {
            companyFileData9.setExchange("out/BigDB/");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No enum constant net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum.out/BigDB/");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00055");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray3 = balSheetFileData2.getLtDebtYr();
        java.lang.String str4 = balSheetFileData2.toDbOutput();
        double[] doubleArray5 = balSheetFileData2.getOtherLtLiabYr();
        double[] doubleArray6 = balSheetFileData2.getCurrAssetsYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00056");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        java.lang.String str7 = incSheetFileData5.getIndustry();
        double[] doubleArray8 = incSheetFileData5.getSalesQtr();
        double[] doubleArray9 = incSheetFileData5.getIntExpNonOpYr();
        double[] doubleArray10 = incSheetFileData5.getNonrecurringItemsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData11 = null;
        // The following exception was thrown during execution in test generation
        try {
            incSheetFileData5.setNameFields(companyFileData11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00057");
        java.lang.String[] strArray3 = new java.lang.String[] { "Cash File Data", "out/BigDB/", "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00058");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double double7 = fieldData2.getFloatshr();
        double[] doubleArray8 = fieldData2.getGoodwillYr();
        double double9 = fieldData2.getEpsY1();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00059");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = fieldData2.getBalSheetData();
        java.lang.Class<?> wildcardClass5 = balSheetFileData4.getClass();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNotNull(balSheetFileData4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00060");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double[] doubleArray7 = fieldData2.getCogsQtr();
        double[] doubleArray8 = fieldData2.getIntExpQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00061");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.parseSipData((int) ' ', (int) (byte) 1, filetypeEnum2);
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00062");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.setMemory((int) (short) 0, 100, filetypeEnum2);
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00063");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        java.lang.String str1 = companyFileData0.getState();
        // The following exception was thrown during execution in test generation
        try {
            companyFileData0.setExchange("out/BigDB/");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No enum constant net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum.out/BigDB/");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00064");
        double[] doubleArray1 = new double[] { 100 };
        // The following exception was thrown during execution in test generation
        try {
            double double2 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getTtm(doubleArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[100.0]");
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00065");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.clearList();
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00066");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double1 = estimateFileData0.getEpsQ0();
        double double2 = estimateFileData0.getEpsY1();
        java.lang.String str3 = estimateFileData0.getSector();
        java.lang.String str4 = estimateFileData0.getName();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00067");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getAllFromMemory(0, (int) (short) 10);
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00068");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getAllFromMemory((int) (short) 0, (int) ' ');
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00069");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        double[] doubleArray7 = incSheetFileData5.getPreTaxIncQtr();
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
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00070");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readSipData("NONE");
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00071");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.find("out/BigDB/");
        org.junit.Assert.assertNull(cashFileData1);
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00072");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInstShareholders();
        java.lang.String str2 = sharesFileData0.getName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        sharesFileData0.setNameFields(companyFileData9);
        // The following exception was thrown during execution in test generation
        try {
            companyFileData9.setExchange("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No enum constant net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum.  price               : 0.000000??  price 52w high      : 0.000000??  price 52w low       : 0.000000??  float               : 0.000000??  market cap          : 0.000000??  volume 10d avg      : 0??  volume 3m avg       : 0??  dollars 3m avg      : 0.000000??  beta                : 0.000000??  insider ownership   : 0.000000??  insider buys        : 0??  insider sells       : 0??  insider buy shares  : 0??  insider sell shares : 0??  insider net shares  : 0??  inst buy shares     : 0??  inst sell shares    : 0??  inst shareholders   : 0??  inst ownership      : 0.000000??  shares quarterly    : ??  shares yearly       : ??");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(incSheetFileData8);
        org.junit.Assert.assertNotNull(companyFileData9);
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00073");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double double7 = fieldData2.getFloatshr();
        double[] doubleArray8 = fieldData2.getCogsYr();
        double[] doubleArray9 = fieldData2.getPreTaxIncYr();
        double[] doubleArray10 = fieldData2.getOtherIncQtr();
        double[] doubleArray11 = fieldData2.getCashYr();
        java.lang.String str12 = fieldData2.getSnpIndexStr();
        double[] doubleArray13 = fieldData2.getTotalOpExpQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(doubleArray13);
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00074");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getEquityYr();
        double[] doubleArray5 = fieldData2.getOtherLtLiabYr();
        double[] doubleArray6 = fieldData2.getIncPrimaryEpsYr();
        java.lang.String str7 = fieldData2.getState();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00075");
        java.lang.String[] strArray1 = new java.lang.String[] { "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n" };
        java.lang.String[] strArray7 = new java.lang.String[] { "out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n", "NONE", "NONE", "Cash File Data" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(strArray1, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00076");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str1 = estimateFileData0.getSector();
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00077");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getCurrLiabYr();
        double[] doubleArray3 = balSheetFileData1.getCurrAssetsYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData4.setSector("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        companyFileData4.setName("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        balSheetFileData1.setNameFields(companyFileData4);
        java.lang.String str10 = companyFileData4.getPhone();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00078");
        java.lang.String str0 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.listToString();
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "" + "'", str0, "");
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00079");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double double7 = fieldData2.getFloatshr();
        double[] doubleArray8 = fieldData2.getCogsYr();
        double[] doubleArray9 = fieldData2.getPreTaxIncYr();
        double[] doubleArray10 = fieldData2.getOtherIncQtr();
        java.lang.String str11 = fieldData2.getSnpIndexStr();
        int int12 = fieldData2.getInstBuyShrs();
        net.ajaskey.common.DateTime dateTime13 = fieldData2.getLatestQtrEps();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(dateTime13);
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00080");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.find("");
        org.junit.Assert.assertNull(sharesFileData1);
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00081");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.find("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        org.junit.Assert.assertNull(incSheetFileData1);
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00082");
        java.lang.String str0 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.inbasedir;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "data/BigDB/" + "'", str0, "data/BigDB/");
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00083");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.setMemory((int) '#', 0, filetypeEnum2);
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00084");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData> sharesFileDataList0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.setSfdList(sharesFileDataList0);
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00085");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.find("NONE");
        org.junit.Assert.assertNull(estimateFileData1);
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00086");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readSipData("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00087");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInstSellShrs();
        sharesFileData0.setInsiderSells("hi!");
        double double4 = sharesFileData0.getInstOwnership();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData5 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int6 = sharesFileData5.getInstShareholders();
        double double7 = sharesFileData5.getPrice();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData8.setFromReport((int) (byte) 0, 0);
        double[] doubleArray12 = sharesFileData8.getSharesQ();
        sharesFileData5.setSharesQ(doubleArray12);
        sharesFileData0.setSharesQ(doubleArray12);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getTtm(doubleArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0]");
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00088");
        java.lang.String str4 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getOutfileName((int) (short) 10, 6, "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n", "out/BigDB/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "out/BigDB/10/Q6/  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n-fundamental-data-10Q6.out/BigDB/" + "'", str4, "out/BigDB/10/Q6/  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n-fundamental-data-10Q6.out/BigDB/");
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00089");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData0.setAdr("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData3 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double4 = estimateFileData3.getEpsQ0();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData5 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int6 = sharesFileData5.getInstShareholders();
        double double7 = sharesFileData5.getPrice();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData8.setFromReport((int) (byte) 0, 0);
        double[] doubleArray12 = sharesFileData8.getSharesQ();
        sharesFileData5.setSharesQ(doubleArray12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData14 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData5);
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList18);
        double[] doubleArray21 = incSheetFileData20.getEpsContYr();
        double[] doubleArray22 = incSheetFileData20.getCogsYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData23 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData23);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData25 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData24);
        double[] doubleArray26 = balSheetFileData25.getLtDebtYr();
        java.lang.String str27 = balSheetFileData25.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData30 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData31 = fieldData30.getCashData();
        double[] doubleArray32 = cashFileData31.getCashFromFinQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData35 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData0, estimateFileData3, sharesFileData14, incSheetFileData20, balSheetFileData25, cashFileData31, (int) '#', 0);
        java.lang.String str36 = estimateFileData3.getIndustry();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum37 = estimateFileData3.getExchange();
        java.lang.String str38 = estimateFileData3.getName();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0]");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(incSheetFileData20);
        org.junit.Assert.assertNull(doubleArray21);
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(cashFileData31);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(exchEnum37);
        org.junit.Assert.assertNull(str38);
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00090");
        java.lang.String[] strArray4 = new java.lang.String[] { "out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "out/BigDB/", "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "Cash File Data" };
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
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00091");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        java.lang.String str4 = fieldData2.getZip();
        double[] doubleArray5 = fieldData2.getIncTaxYr();
        double[] doubleArray6 = fieldData2.getInventoryQtr();
        java.lang.String str7 = fieldData2.getState();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00092");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInstShareholders();
        double double2 = sharesFileData0.getInsiderNetPercentOutstanding();
        double double3 = sharesFileData0.getPrice52lo();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00093");
        java.lang.String str4 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getOutfileName((int) (byte) 100, 100, "NONE", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!" + "'", str4, "out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!");
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00094");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getOtherLtLiabQtr();
        double[] doubleArray3 = balSheetFileData1.getStInvestQtr();
        double[] doubleArray4 = balSheetFileData1.getTotalAssetsQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00095");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FiletypeEnum filetypeEnum2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getAllFromDb((int) (short) 0, (int) (short) 0, filetypeEnum2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00096");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readSipData("");
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00097");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        boolean boolean1 = companyFileData0.isAdr();
        java.lang.String str2 = companyFileData0.getDowIndexStr();
        boolean boolean3 = companyFileData0.isDrp();
        companyFileData0.setState("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        java.lang.String str6 = companyFileData0.toDbOuput();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n" + "'", str6, "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00098");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.setMemory((int) (short) 10, (int) (byte) -1, filetypeEnum2);
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00099");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray3 = balSheetFileData2.getLtDebtYr();
        java.lang.String str4 = balSheetFileData2.toDbOutput();
        java.lang.String str5 = balSheetFileData2.getName();
        double[] doubleArray6 = balSheetFileData2.getAcctRxYr();
        java.lang.String str7 = balSheetFileData2.toDbOutput();
        double[] doubleArray8 = balSheetFileData2.getCurrAssetsYr();
        java.lang.Class<?> wildcardClass9 = balSheetFileData2.getClass();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00100");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double double7 = fieldData2.getFloatshr();
        double[] doubleArray8 = fieldData2.getCogsYr();
        double[] doubleArray9 = fieldData2.getPreTaxIncYr();
        double[] doubleArray10 = fieldData2.getRdQtr();
        double[] doubleArray11 = fieldData2.getCurrAssetsQtr();
        double[] doubleArray12 = fieldData2.getCurrLiabYr();
        double double13 = fieldData2.getMktCap();
        int int14 = fieldData2.getYear();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00101");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.find("out/BigDB/10/Q6/  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n-fundamental-data-10Q6.out/BigDB/");
        org.junit.Assert.assertNull(estimateFileData1);
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00102");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double[] doubleArray6 = fieldData2.getDividendYr();
        double[] doubleArray7 = fieldData2.getAcctPayableYr();
        double[] doubleArray8 = fieldData2.getLtDebtYr();
        int int9 = fieldData2.getQuarter();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00103");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getCurrLiabYr();
        double[] doubleArray3 = balSheetFileData1.getCurrAssetsYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData4.setSector("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        companyFileData4.setName("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        balSheetFileData1.setNameFields(companyFileData4);
        companyFileData4.setState("");
        companyFileData4.setSic("NONE");
        companyFileData4.setName("out/BigDB/10/Q6/  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n-fundamental-data-10Q6.out/BigDB/");
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00104");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double double4 = fieldData2.getEpsQ0();
        double double5 = fieldData2.getEpsQ1();
        int int6 = fieldData2.getInsiderSells();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00105");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FiletypeEnum filetypeEnum2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getAllFromDb(6, 0, filetypeEnum2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00106");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readSipData("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00107");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInstShareholders();
        double double2 = sharesFileData0.getPrice();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData3 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData3.setFromReport((int) (byte) 0, 0);
        double[] doubleArray7 = sharesFileData3.getSharesQ();
        sharesFileData0.setSharesQ(doubleArray7);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData9 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        double[] doubleArray10 = sharesFileData9.getSharesQ();
        double double11 = sharesFileData9.getInsiderOwnership();
        sharesFileData9.setInstShareholders("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        java.lang.Class<?> wildcardClass14 = sharesFileData9.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00108");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        int int5 = fieldData2.getInsiderNetTrades();
        double[] doubleArray6 = fieldData2.getIntExpNonOpYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00109");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getCurrLiabYr();
        double[] doubleArray3 = balSheetFileData1.getCurrAssetsYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData4.setSector("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        companyFileData4.setName("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        balSheetFileData1.setNameFields(companyFileData4);
        double[] doubleArray10 = balSheetFileData1.getNetFixedAssetsYr();
        java.lang.String str11 = balSheetFileData1.toString();
        double[] doubleArray12 = balSheetFileData1.getAcctRxQtr();
        double[] doubleArray13 = balSheetFileData1.getOtherCurrLiabQtr();
        java.lang.String str14 = balSheetFileData1.toDbOutput();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00110");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray3 = balSheetFileData2.getLtDebtYr();
        double[] doubleArray4 = balSheetFileData2.getOtherCurrAssetsQtr();
        double[] doubleArray5 = balSheetFileData2.getCashYr();
        double[] doubleArray6 = balSheetFileData2.getAcctPayableYr();
        double[] doubleArray7 = balSheetFileData2.getCurrAssetsQtr();
        double[] doubleArray8 = balSheetFileData2.getTotalLiabYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00111");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getAllFromMemory((int) (byte) -1, (int) ' ');
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00112");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData0.setAdr("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData3 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double4 = estimateFileData3.getEpsQ0();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData5 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int6 = sharesFileData5.getInstShareholders();
        double double7 = sharesFileData5.getPrice();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData8.setFromReport((int) (byte) 0, 0);
        double[] doubleArray12 = sharesFileData8.getSharesQ();
        sharesFileData5.setSharesQ(doubleArray12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData14 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData5);
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList18);
        double[] doubleArray21 = incSheetFileData20.getEpsContYr();
        double[] doubleArray22 = incSheetFileData20.getCogsYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData23 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData23);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData25 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData24);
        double[] doubleArray26 = balSheetFileData25.getLtDebtYr();
        java.lang.String str27 = balSheetFileData25.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData30 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData31 = fieldData30.getCashData();
        double[] doubleArray32 = cashFileData31.getCashFromFinQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData35 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData0, estimateFileData3, sharesFileData14, incSheetFileData20, balSheetFileData25, cashFileData31, (int) '#', 0);
        double[] doubleArray36 = fieldData35.getEpsContQtr();
        double[] doubleArray37 = fieldData35.getIncTaxYr();
        double[] doubleArray38 = fieldData35.getInventoryYr();
        java.lang.Class<?> wildcardClass39 = fieldData35.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0]");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(incSheetFileData20);
        org.junit.Assert.assertNull(doubleArray21);
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(cashFileData31);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertNull(doubleArray36);
        org.junit.Assert.assertNull(doubleArray37);
        org.junit.Assert.assertNull(doubleArray38);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00113");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        sharesFileData0.setVolume3m("");
        double double6 = sharesFileData0.getInsiderNetPercentOutstanding();
        java.lang.Class<?> wildcardClass7 = sharesFileData0.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00114");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double[] doubleArray6 = fieldData2.getDividendYr();
        net.ajaskey.common.DateTime dateTime7 = fieldData2.getLatestQtrEps();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData8 = fieldData2.getShares();
        double[] doubleArray9 = fieldData2.getIntExpYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(dateTime7);
        org.junit.Assert.assertNotNull(sharesFileData8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00115");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray3 = balSheetFileData2.getLtDebtYr();
        java.lang.String str4 = balSheetFileData2.toDbOutput();
        double[] doubleArray5 = balSheetFileData2.getOtherLtLiabYr();
        double[] doubleArray6 = balSheetFileData2.getTotalAssetsQtr();
        java.lang.String str7 = balSheetFileData2.getIndustry();
        double[] doubleArray8 = balSheetFileData2.getAcctPayableQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00116");
        java.lang.String str0 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.listToString();
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "" + "'", str0, "");
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00117");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!", "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "NONE", "out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00118");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getFromMemory("out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!", (int) (short) 100, 1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00119");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readSipData("out/BigDB/10/Q6/  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n-fundamental-data-10Q6.out/BigDB/", "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00120");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double double6 = fieldData2.getEpsQ1();
        double[] doubleArray7 = fieldData2.getAcctPayableQtr();
        double[] doubleArray8 = fieldData2.getNonrecurringItemsYr();
        double[] doubleArray9 = fieldData2.getLiabEquityQtr();
        double[] doubleArray10 = fieldData2.getSharesY();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getTtm(doubleArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0]");
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00121");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        double double4 = sharesFileData0.getFloatshr();
        java.lang.String str5 = sharesFileData0.getTicker();
        sharesFileData0.setFromReport((int) 'a', 6);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00122");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.find("data/BigDB/");
        org.junit.Assert.assertNull(companyFileData1);
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00123");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getIncAfterTaxYr();
        double[] doubleArray7 = incSheetFileData5.getIntExpNonOpQtr();
        double[] doubleArray8 = incSheetFileData5.getRdQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00124");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData0.setAdr("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData3 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double4 = estimateFileData3.getEpsQ0();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData5 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int6 = sharesFileData5.getInstShareholders();
        double double7 = sharesFileData5.getPrice();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData8.setFromReport((int) (byte) 0, 0);
        double[] doubleArray12 = sharesFileData8.getSharesQ();
        sharesFileData5.setSharesQ(doubleArray12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData14 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData5);
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList18);
        double[] doubleArray21 = incSheetFileData20.getEpsContYr();
        double[] doubleArray22 = incSheetFileData20.getCogsYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData23 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData23);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData25 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData24);
        double[] doubleArray26 = balSheetFileData25.getLtDebtYr();
        java.lang.String str27 = balSheetFileData25.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData30 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData31 = fieldData30.getCashData();
        double[] doubleArray32 = cashFileData31.getCashFromFinQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData35 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData0, estimateFileData3, sharesFileData14, incSheetFileData20, balSheetFileData25, cashFileData31, (int) '#', 0);
        double[] doubleArray36 = balSheetFileData25.getGoodwillYr();
        double[] doubleArray37 = balSheetFileData25.getNetFixedAssetsYr();
        double[] doubleArray38 = balSheetFileData25.getNetFixedAssetsQtr();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0]");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(incSheetFileData20);
        org.junit.Assert.assertNull(doubleArray21);
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(cashFileData31);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertNull(doubleArray36);
        org.junit.Assert.assertNull(doubleArray37);
        org.junit.Assert.assertNull(doubleArray38);
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00125");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.find("hi!");
        org.junit.Assert.assertNull(balSheetFileData1);
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00126");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
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
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00127");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray3 = balSheetFileData2.getLtDebtYr();
        java.lang.String str4 = balSheetFileData2.toDbOutput();
        java.lang.String str5 = balSheetFileData2.getName();
        double[] doubleArray6 = balSheetFileData2.getAcctRxYr();
        java.lang.String str7 = balSheetFileData2.toDbOutput();
        double[] doubleArray8 = balSheetFileData2.getTotalAssetsQtr();
        double[] doubleArray9 = balSheetFileData2.getTotalLiabQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00128");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        sharesFileData0.setVolume3m("");
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum6 = sharesFileData0.getExchange();
        java.lang.String str7 = sharesFileData0.getName();
        long long8 = sharesFileData0.getVolumeMonth3m();
        sharesFileData0.setInstBuyShrs("hi!");
        org.junit.Assert.assertNull(exchEnum6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00129");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FiletypeEnum filetypeEnum3 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getFromDb("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n", (-1), (int) (byte) 100, filetypeEnum3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00130");
        java.lang.String[] strArray3 = new java.lang.String[] { "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "NONE", "out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00131");
        java.lang.String[] strArray5 = new java.lang.String[] { "out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!", "hi!", "out/BigDB/10/Q6/  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n-fundamental-data-10Q6.out/BigDB/", "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "out/BigDB/10/Q6/  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n-fundamental-data-10Q6.out/BigDB/" };
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
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00132");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        boolean boolean5 = fieldData2.isAdr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00133");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double1 = estimateFileData0.getEpsQ0();
        double double2 = estimateFileData0.getEpsY1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData3 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData0);
        java.lang.String str4 = estimateFileData0.toString();
        java.lang.String str5 = estimateFileData0.getIndustry();
        java.lang.String str6 = estimateFileData0.getSector();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00134");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FiletypeEnum filetypeEnum2 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.parseSipData((int) (byte) -1, (int) (short) -1, filetypeEnum2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00135");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getInventoryYr();
        double[] doubleArray2 = balSheetFileData0.getInventoryQtr();
        double[] doubleArray3 = balSheetFileData0.getLtDebtQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00136");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getGrossOpExpQtr();
        double[] doubleArray4 = fieldData2.getAcctPayableQtr();
        double[] doubleArray5 = fieldData2.getPrefStockQtr();
        double double6 = fieldData2.getPrice52hi();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00137");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        boolean boolean1 = companyFileData0.isAdr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.DowEnum dowEnum2 = companyFileData0.getDowIndex();
        java.lang.String str3 = companyFileData0.getDowIndexStr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum4 = companyFileData0.getExchange();
        // The following exception was thrown during execution in test generation
        try {
            companyFileData0.setExchange("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No enum constant net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(dowEnum2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(exchEnum4);
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00138");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double[] doubleArray7 = fieldData2.getCogsQtr();
        double[] doubleArray8 = fieldData2.getAcctPayableYr();
        double[] doubleArray9 = fieldData2.getCashYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00139");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FiletypeEnum filetypeEnum2 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.parseSipData((int) '4', (int) (short) -1, filetypeEnum2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00140");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double double7 = fieldData2.getFloatshr();
        double[] doubleArray8 = fieldData2.getCogsYr();
        double[] doubleArray9 = fieldData2.getPreTaxIncYr();
        double[] doubleArray10 = fieldData2.getDepreciationYr();
        double[] doubleArray11 = fieldData2.getAcctRxQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData12 = fieldData2.getEstimateData();
        double double13 = estimateFileData12.getEpsY2();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData14 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData12);
        java.lang.String str15 = estimateFileData14.getSector();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNotNull(estimateFileData12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00141");
        java.lang.String[] strArray5 = new java.lang.String[] { "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "", "NONE", "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SnpEnum snpEnum10 = companyFileData9.getSnpIndex();
        net.ajaskey.market.tools.SIP.BigDB.dataio.DowEnum dowEnum11 = companyFileData9.getDowIndex();
        companyFileData9.setNumEmployees("out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(companyFileData8);
        org.junit.Assert.assertNotNull(companyFileData9);
        org.junit.Assert.assertNull(snpEnum10);
        org.junit.Assert.assertNull(dowEnum11);
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00142");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        double[] doubleArray7 = incSheetFileData5.getOtherIncQtr();
        double[] doubleArray8 = incSheetFileData5.getCogsQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00143");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.setMemory((int) (short) -1, (int) (short) 0, filetypeEnum2);
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00144");
        java.lang.String[] strArray3 = new java.lang.String[] { "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n", "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!" };
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
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00145");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FiletypeEnum filetypeEnum2 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.parseSipData((int) (short) 10, (int) '#', filetypeEnum2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00146");
        java.lang.String[] strArray4 = new java.lang.String[] { "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "out/BigDB/", "", "out/BigDB/10/Q6/  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n-fundamental-data-10Q6.out/BigDB/" };
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
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00147");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double[] doubleArray5 = fieldData2.getAdjToIncQtr();
        double[] doubleArray6 = fieldData2.getGoodwillYr();
        java.lang.String str7 = fieldData2.getCity();
        int int8 = fieldData2.getInstBuyShrs();
        double[] doubleArray9 = fieldData2.getCashFromInv();
        double[] doubleArray10 = fieldData2.getOtherLtAssetsYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00148");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getNonrecurringItemsYr();
        double[] doubleArray4 = fieldData2.getAdjToIncQtr();
        double[] doubleArray5 = fieldData2.getOtherCurrLiabYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00149");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        java.lang.String str7 = incSheetFileData5.getIndustry();
        double[] doubleArray8 = incSheetFileData5.getSalesQtr();
        double[] doubleArray9 = incSheetFileData5.getIntExpNonOpYr();
        double[] doubleArray10 = incSheetFileData5.getDepreciationYr();
        java.lang.String str11 = incSheetFileData5.toString();
        double[] doubleArray12 = incSheetFileData5.getIncPrimaryEpsYr();
        double[] doubleArray13 = incSheetFileData5.getNonrecurringItemsYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00150");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double double6 = fieldData2.getEpsQ1();
        double[] doubleArray7 = fieldData2.getAcctPayableQtr();
        double[] doubleArray8 = fieldData2.getOtherLtAssetsQtr();
        net.ajaskey.common.DateTime dateTime9 = fieldData2.getLatestQtrEps();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(dateTime9);
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00151");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData3 = fieldData2.getCashData();
        double[] doubleArray4 = fieldData2.getCurrAssetsQtr();
        double[] doubleArray5 = fieldData2.getOtherCurrLiabYr();
        double[] doubleArray6 = fieldData2.getDepreciationQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum7 = fieldData2.getExchange();
        double double8 = fieldData2.getPrice();
        org.junit.Assert.assertNotNull(cashFileData3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(exchEnum7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00152");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double double7 = fieldData2.getFloatshr();
        double[] doubleArray8 = fieldData2.getCogsYr();
        double[] doubleArray9 = fieldData2.getPreTaxIncYr();
        double[] doubleArray10 = fieldData2.getGrossIncQtr();
        double[] doubleArray11 = fieldData2.getEquityQtr();
        double[] doubleArray12 = fieldData2.getLtDebtYr();
        double[] doubleArray13 = fieldData2.getIncAfterTaxYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00153");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData3 = fieldData2.getCashData();
        double[] doubleArray4 = fieldData2.getCurrAssetsQtr();
        double[] doubleArray5 = fieldData2.getNetFixedAssetsYr();
        org.junit.Assert.assertNotNull(cashFileData3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00154");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        double[] doubleArray7 = incSheetFileData5.getIncTaxYr();
        double[] doubleArray8 = incSheetFileData5.getNetIncYr();
        double[] doubleArray9 = incSheetFileData5.getGrossIncQtr();
        double[] doubleArray10 = incSheetFileData5.getAdjToIncYr();
        java.lang.Class<?> wildcardClass11 = incSheetFileData5.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00155");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getCurrLiabYr();
        double[] doubleArray3 = balSheetFileData1.getAcctRxYr();
        double[] doubleArray4 = balSheetFileData1.getAcctRxYr();
        double[] doubleArray5 = balSheetFileData1.getInventoryQtr();
        double[] doubleArray6 = balSheetFileData1.getOtherLtLiabQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00156");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getAllFromMemory((int) (byte) 100, (int) (short) 10);
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00157");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double double7 = fieldData2.getFloatshr();
        double[] doubleArray8 = fieldData2.getCogsYr();
        double[] doubleArray9 = fieldData2.getPreTaxIncYr();
        double[] doubleArray10 = fieldData2.getDepreciationYr();
        double double11 = fieldData2.getEpsQ1();
        double[] doubleArray12 = fieldData2.getIncAfterTaxQtr();
        net.ajaskey.common.DateTime dateTime13 = fieldData2.getLatestQtrEps();
        double[] doubleArray14 = fieldData2.getAcctPayableYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(dateTime13);
        org.junit.Assert.assertNull(doubleArray14);
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00158");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readSipData("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n", "NONE");
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00159");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getOtherLtLiabQtr();
        double[] doubleArray3 = balSheetFileData1.getNetFixedAssetsQtr();
        double[] doubleArray4 = balSheetFileData1.getLtDebtQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00160");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readSipData("out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!");
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00161");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getAllFromMemory(100, (-1));
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00162");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double double7 = fieldData2.getFloatshr();
        double[] doubleArray8 = fieldData2.getCogsYr();
        double[] doubleArray9 = fieldData2.getPreTaxIncYr();
        double[] doubleArray10 = fieldData2.getGrossIncQtr();
        double[] doubleArray11 = fieldData2.getEquityQtr();
        double[] doubleArray12 = fieldData2.getGrossOpExpYr();
        int int13 = fieldData2.getInstSellShrs();
        double[] doubleArray14 = fieldData2.getIncTaxQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(doubleArray14);
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00163");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        java.lang.String str7 = incSheetFileData5.getIndustry();
        double[] doubleArray8 = incSheetFileData5.getSalesQtr();
        double[] doubleArray9 = incSheetFileData5.getDepreciationYr();
        double[] doubleArray10 = incSheetFileData5.getAdjToIncQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00164");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray3 = balSheetFileData2.getLtDebtYr();
        double[] doubleArray4 = balSheetFileData2.getLtDebtYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00165");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double double7 = fieldData2.getFloatshr();
        double[] doubleArray8 = fieldData2.getCogsYr();
        double[] doubleArray9 = fieldData2.getNetIncQtr();
        double[] doubleArray10 = fieldData2.getSharesY();
        double[] doubleArray11 = fieldData2.getGoodwillYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0]");
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00166");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData0.setAdr("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData3 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double4 = estimateFileData3.getEpsQ0();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData5 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int6 = sharesFileData5.getInstShareholders();
        double double7 = sharesFileData5.getPrice();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData8.setFromReport((int) (byte) 0, 0);
        double[] doubleArray12 = sharesFileData8.getSharesQ();
        sharesFileData5.setSharesQ(doubleArray12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData14 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData5);
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList18);
        double[] doubleArray21 = incSheetFileData20.getEpsContYr();
        double[] doubleArray22 = incSheetFileData20.getCogsYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData23 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData23);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData25 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData24);
        double[] doubleArray26 = balSheetFileData25.getLtDebtYr();
        java.lang.String str27 = balSheetFileData25.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData30 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData31 = fieldData30.getCashData();
        double[] doubleArray32 = cashFileData31.getCashFromFinQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData35 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData0, estimateFileData3, sharesFileData14, incSheetFileData20, balSheetFileData25, cashFileData31, (int) '#', 0);
        double[] doubleArray36 = balSheetFileData25.getGoodwillYr();
        double[] doubleArray37 = balSheetFileData25.getBvpsYr();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0]");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(incSheetFileData20);
        org.junit.Assert.assertNull(doubleArray21);
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(cashFileData31);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertNull(doubleArray36);
        org.junit.Assert.assertNull(doubleArray37);
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00167");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        boolean boolean1 = companyFileData0.isAdr();
        java.lang.String str2 = companyFileData0.getState();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SnpEnum snpEnum3 = companyFileData0.getSnpIndex();
        java.lang.String str4 = companyFileData0.toString();
        companyFileData0.setDowIndex("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double8 = estimateFileData7.getEpsQ0();
        double double9 = estimateFileData7.getEpsY1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData10 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData7);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData11 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int12 = sharesFileData11.getInstShareholders();
        double double13 = sharesFileData11.getDollar3m();
        double double14 = sharesFileData11.getDollar3m();
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList18);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData21 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData22 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData21);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData23 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData22);
        double[] doubleArray24 = balSheetFileData22.getCurrLiabYr();
        double[] doubleArray25 = balSheetFileData22.getStDebtQtr();
        double[] doubleArray26 = balSheetFileData22.getOtherLtLiabYr();
        java.lang.String[] strArray32 = new java.lang.String[] { "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "", "NONE", "" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData35 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList33);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData36 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList33);
        double[] doubleArray37 = cashFileData36.getCashFromInvQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData40 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData0, estimateFileData10, sharesFileData11, incSheetFileData20, balSheetFileData22, cashFileData36, (int) (short) 10, (int) (byte) 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum41 = companyFileData0.getExchange();
        companyFileData0.setIndustry("data/BigDB/");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(snpEnum3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(incSheetFileData20);
        org.junit.Assert.assertNull(doubleArray24);
        org.junit.Assert.assertNull(doubleArray25);
        org.junit.Assert.assertNull(doubleArray26);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(companyFileData35);
        org.junit.Assert.assertNotNull(cashFileData36);
        org.junit.Assert.assertNull(doubleArray37);
        org.junit.Assert.assertNull(exchEnum41);
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00168");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FiletypeEnum filetypeEnum2 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.parseSipData((int) (short) 10, (int) '4', filetypeEnum2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00169");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData0.setAdr("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData3 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double4 = estimateFileData3.getEpsQ0();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData5 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int6 = sharesFileData5.getInstShareholders();
        double double7 = sharesFileData5.getPrice();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData8.setFromReport((int) (byte) 0, 0);
        double[] doubleArray12 = sharesFileData8.getSharesQ();
        sharesFileData5.setSharesQ(doubleArray12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData14 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData5);
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList18);
        double[] doubleArray21 = incSheetFileData20.getEpsContYr();
        double[] doubleArray22 = incSheetFileData20.getCogsYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData23 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData23);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData25 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData24);
        double[] doubleArray26 = balSheetFileData25.getLtDebtYr();
        java.lang.String str27 = balSheetFileData25.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData30 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData31 = fieldData30.getCashData();
        double[] doubleArray32 = cashFileData31.getCashFromFinQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData35 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData0, estimateFileData3, sharesFileData14, incSheetFileData20, balSheetFileData25, cashFileData31, (int) '#', 0);
        double[] doubleArray36 = fieldData35.getEpsContQtr();
        double[] doubleArray37 = fieldData35.getIncTaxYr();
        double[] doubleArray38 = fieldData35.getOtherIncYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.DowEnum dowEnum39 = fieldData35.getDowIndex();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0]");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(incSheetFileData20);
        org.junit.Assert.assertNull(doubleArray21);
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(cashFileData31);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertNull(doubleArray36);
        org.junit.Assert.assertNull(doubleArray37);
        org.junit.Assert.assertNull(doubleArray38);
        org.junit.Assert.assertNull(dowEnum39);
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00170");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FiletypeEnum filetypeEnum2 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.parseSipData(100, (int) (short) 10, filetypeEnum2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00171");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getCurrLiabYr();
        double[] doubleArray3 = balSheetFileData1.getOtherLtLiabYr();
        double[] doubleArray4 = balSheetFileData1.getLiabEquityYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00172");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        boolean boolean1 = companyFileData0.isAdr();
        java.lang.String str2 = companyFileData0.getState();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SnpEnum snpEnum3 = companyFileData0.getSnpIndex();
        java.lang.String str4 = companyFileData0.toString();
        companyFileData0.setAdr("data/BigDB/");
        companyFileData0.setCountry("out/BigDB/10/Q6/  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n-fundamental-data-10Q6.out/BigDB/");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(snpEnum3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00173");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInstShareholders();
        double double2 = sharesFileData0.getDollar3m();
        sharesFileData0.setInsiderBuys("");
        int int5 = sharesFileData0.getInsiderSellShrs();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00174");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData0.setAdr("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData3 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double4 = estimateFileData3.getEpsQ0();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData5 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int6 = sharesFileData5.getInstShareholders();
        double double7 = sharesFileData5.getPrice();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData8.setFromReport((int) (byte) 0, 0);
        double[] doubleArray12 = sharesFileData8.getSharesQ();
        sharesFileData5.setSharesQ(doubleArray12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData14 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData5);
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList18);
        double[] doubleArray21 = incSheetFileData20.getEpsContYr();
        double[] doubleArray22 = incSheetFileData20.getCogsYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData23 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData23);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData25 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData24);
        double[] doubleArray26 = balSheetFileData25.getLtDebtYr();
        java.lang.String str27 = balSheetFileData25.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData30 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData31 = fieldData30.getCashData();
        double[] doubleArray32 = cashFileData31.getCashFromFinQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData35 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData0, estimateFileData3, sharesFileData14, incSheetFileData20, balSheetFileData25, cashFileData31, (int) '#', 0);
        double[] doubleArray36 = incSheetFileData20.getCogsQtr();
        double[] doubleArray37 = incSheetFileData20.getEpsContYr();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0]");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(incSheetFileData20);
        org.junit.Assert.assertNull(doubleArray21);
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(cashFileData31);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertNull(doubleArray36);
        org.junit.Assert.assertNull(doubleArray37);
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00175");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInstShareholders();
        double double2 = sharesFileData0.getDollar3m();
        sharesFileData0.setVolume10d("");
        sharesFileData0.setVolume3m("out/BigDB/");
        int int7 = sharesFileData0.getInsiderSells();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00176");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        java.lang.String str4 = sharesFileData0.getTicker();
        long long5 = sharesFileData0.getVolume10d();
        sharesFileData0.setFloatshr("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        java.lang.String str8 = sharesFileData0.getName();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00177");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        double double4 = sharesFileData0.getFloatshr();
        int int5 = sharesFileData0.getInsiderSells();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum6 = sharesFileData0.getExchange();
        sharesFileData0.setInstSellShrs("");
        double double9 = sharesFileData0.getMktCap();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(exchEnum6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00178");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        java.lang.String str1 = companyFileData0.getStreet();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum2 = companyFileData0.getExchange();
        companyFileData0.setDrp("NONE");
        boolean boolean5 = companyFileData0.isAdr();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(exchEnum2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00179");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        boolean boolean1 = companyFileData0.isAdr();
        java.lang.String str2 = companyFileData0.getState();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SnpEnum snpEnum3 = companyFileData0.getSnpIndex();
        java.lang.String str4 = companyFileData0.toString();
        companyFileData0.setZip("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        java.lang.String str7 = companyFileData0.getSector();
        java.lang.String str8 = companyFileData0.getSic();
        boolean boolean9 = companyFileData0.isAdr();
        java.lang.String str10 = companyFileData0.getZip();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(snpEnum3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!" + "'", str10, "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00180");
        java.lang.String[] strArray1 = new java.lang.String[] { "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!" };
        java.lang.String[] strArray3 = new java.lang.String[] { "out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(strArray1, strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00181");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInstShareholders();
        double double2 = sharesFileData0.getDollar3m();
        double double3 = sharesFileData0.getDollar3m();
        int int4 = sharesFileData0.getInsiderNetTrades();
        int int5 = sharesFileData0.getInsiderSellShrs();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int7 = sharesFileData6.getInstShareholders();
        double double8 = sharesFileData6.getPrice();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData9 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData9.setFromReport((int) (byte) 0, 0);
        double[] doubleArray13 = sharesFileData9.getSharesQ();
        sharesFileData6.setSharesQ(doubleArray13);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData15 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData6);
        double[] doubleArray16 = sharesFileData15.getSharesQ();
        sharesFileData0.setSharesQ(doubleArray16);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0]");
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00182");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getEquityYr();
        double[] doubleArray5 = fieldData2.getOtherLtLiabYr();
        double[] doubleArray6 = fieldData2.getEpsDilContYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00183");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "NONE", "NONE", "data/BigDB/", "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n", "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  web       : null\r\n" };
        java.lang.String[] strArray9 = new java.lang.String[] { "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n", "Cash File Data" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData10 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(strArray6, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00184");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.setMemory((-1), (int) (short) -1, filetypeEnum2);
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00185");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double[] doubleArray5 = fieldData2.getAdjToIncYr();
        double[] doubleArray6 = fieldData2.getStDebtYr();
        double double7 = fieldData2.getMktCap();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00186");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double double7 = fieldData2.getFloatshr();
        double[] doubleArray8 = fieldData2.getCogsYr();
        double[] doubleArray9 = fieldData2.getPreTaxIncYr();
        double[] doubleArray10 = fieldData2.getDepreciationYr();
        double[] doubleArray11 = fieldData2.getAcctRxQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum12 = fieldData2.getExchange();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(exchEnum12);
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00187");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readSipData("hi!");
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00188");
        java.lang.String[] strArray4 = new java.lang.String[] { "out/BigDB/10/Q6/  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n-fundamental-data-10Q6.out/BigDB/", "out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "hi!", "Cash File Data" };
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
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00189");
        java.lang.String[] strArray1 = new java.lang.String[] { "Cash File Data" };
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
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00190");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray3 = balSheetFileData1.getCurrLiabYr();
        double[] doubleArray4 = balSheetFileData1.getStDebtQtr();
        double[] doubleArray5 = balSheetFileData1.getEquityYr();
        double[] doubleArray6 = balSheetFileData1.getStDebtYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00191");
        java.lang.String[] strArray2 = new java.lang.String[] { "out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!", "data/BigDB/" };
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
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00192");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        double[] doubleArray7 = incSheetFileData5.getCogsYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum8 = incSheetFileData5.getExchange();
        double[] doubleArray9 = incSheetFileData5.getDepreciationQtr();
        double[] doubleArray10 = incSheetFileData5.getAdjToIncYr();
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
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00193");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double double7 = fieldData2.getFloatshr();
        double[] doubleArray8 = fieldData2.getCogsYr();
        double[] doubleArray9 = fieldData2.getPreTaxIncYr();
        double[] doubleArray10 = fieldData2.getOtherIncQtr();
        java.lang.String str11 = fieldData2.getSnpIndexStr();
        int int12 = fieldData2.getInstBuyShrs();
        double double13 = fieldData2.getInsiderOwnership();
        net.ajaskey.market.tools.SIP.BigDB.dataio.DowEnum dowEnum14 = fieldData2.getDowIndex();
        double[] doubleArray15 = fieldData2.getEpsQtr();
        net.ajaskey.common.DateTime dateTime16 = fieldData2.getLatestQtrEps();
        java.lang.String str17 = fieldData2.getCountry();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNull(dowEnum14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(dateTime16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00194");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double[] doubleArray7 = fieldData2.getCogsQtr();
        double double8 = fieldData2.getBeta();
        java.lang.String str9 = fieldData2.getTicker();
        double[] doubleArray10 = fieldData2.getEpsContQtr();
        double[] doubleArray11 = fieldData2.getNetFixedAssetsYr();
        double[] doubleArray12 = fieldData2.getStInvestQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00195");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        sharesFileData0.setVolume3m("");
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum6 = sharesFileData0.getExchange();
        java.lang.String str7 = sharesFileData0.getName();
        int int8 = sharesFileData0.getInstShareholders();
        sharesFileData0.setInsiderNetTrades("hi!");
        sharesFileData0.setFromReport((int) (short) 0, (int) (short) 10);
        double[] doubleArray14 = sharesFileData0.getSharesY();
        sharesFileData0.setInsiderOwnership("out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!");
        org.junit.Assert.assertNull(exchEnum6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0]");
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00196");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readSipData("out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00197");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readSipData("");
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00198");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        java.lang.String str1 = companyFileData0.getStreet();
        companyFileData0.setPhone("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        companyFileData0.setCity("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        java.lang.String str6 = companyFileData0.getSic();
        java.lang.String str7 = companyFileData0.getIndustry();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum8 = companyFileData0.getExchange();
        net.ajaskey.market.tools.SIP.BigDB.dataio.DowEnum dowEnum9 = companyFileData0.getDowIndex();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(exchEnum8);
        org.junit.Assert.assertNull(dowEnum9);
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00199");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getIncAfterTaxYr();
        double[] doubleArray7 = incSheetFileData5.getIntExpNonOpQtr();
        double[] doubleArray8 = incSheetFileData5.getEpsContYr();
        double[] doubleArray9 = incSheetFileData5.getTotalOpExpQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00200");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        java.lang.String str4 = fieldData2.getZip();
        double[] doubleArray5 = fieldData2.getIncTaxYr();
        double double6 = fieldData2.getEpsY2();
        double[] doubleArray7 = fieldData2.getBvpsQtr();
        double double8 = fieldData2.getEpsY2();
        java.lang.String str9 = fieldData2.getTicker();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00201");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData0.setAdr("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData3 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double4 = estimateFileData3.getEpsQ0();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData5 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int6 = sharesFileData5.getInstShareholders();
        double double7 = sharesFileData5.getPrice();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData8.setFromReport((int) (byte) 0, 0);
        double[] doubleArray12 = sharesFileData8.getSharesQ();
        sharesFileData5.setSharesQ(doubleArray12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData14 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData5);
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList18);
        double[] doubleArray21 = incSheetFileData20.getEpsContYr();
        double[] doubleArray22 = incSheetFileData20.getCogsYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData23 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData23);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData25 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData24);
        double[] doubleArray26 = balSheetFileData25.getLtDebtYr();
        java.lang.String str27 = balSheetFileData25.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData30 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData31 = fieldData30.getCashData();
        double[] doubleArray32 = cashFileData31.getCashFromFinQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData35 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData0, estimateFileData3, sharesFileData14, incSheetFileData20, balSheetFileData25, cashFileData31, (int) '#', 0);
        double[] doubleArray36 = fieldData35.getEpsContQtr();
        java.lang.String str37 = fieldData35.getPhone();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0]");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(incSheetFileData20);
        org.junit.Assert.assertNull(doubleArray21);
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(cashFileData31);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertNull(doubleArray36);
        org.junit.Assert.assertNull(str37);
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00202");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        java.lang.String str7 = incSheetFileData5.getIndustry();
        double[] doubleArray8 = incSheetFileData5.getSalesQtr();
        double[] doubleArray9 = incSheetFileData5.getIncPrimaryEpsYr();
        double[] doubleArray10 = incSheetFileData5.getEpsContQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00203");
        java.lang.String str4 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getOutfileName((int) (byte) 1, 6, "out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!", "data/BigDB/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "out/BigDB/1/Q6/out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!-fundamental-data-1Q6.data/BigDB/" + "'", str4, "out/BigDB/1/Q6/out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!-fundamental-data-1Q6.data/BigDB/");
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00204");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        double[] doubleArray7 = incSheetFileData5.getIncTaxYr();
        double[] doubleArray8 = incSheetFileData5.getEpsYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00205");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FiletypeEnum filetypeEnum2 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.parseSipData((int) (byte) 0, 6, filetypeEnum2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00206");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        java.lang.String str1 = companyFileData0.getStreet();
        companyFileData0.setPhone("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        companyFileData0.setCity("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        java.lang.String str6 = companyFileData0.getSic();
        java.lang.String str7 = companyFileData0.getIndustry();
        java.lang.String str8 = companyFileData0.getZip();
        boolean boolean9 = companyFileData0.isAdr();
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData15 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList13);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData16 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList13);
        java.util.List<java.lang.String> strList17 = companyFileData0.set((java.util.List<java.lang.String>) strList13);
        java.lang.String str18 = companyFileData0.getState();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(incSheetFileData15);
        org.junit.Assert.assertNotNull(sharesFileData16);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00207");
        java.lang.String[] strArray1 = new java.lang.String[] { "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!" };
        java.lang.String[] strArray4 = new java.lang.String[] { "out/BigDB/1/Q6/out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!-fundamental-data-1Q6.data/BigDB/", "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n" };
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
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00208");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.find("out/BigDB/1/Q6/out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!-fundamental-data-1Q6.data/BigDB/");
        org.junit.Assert.assertNull(incSheetFileData1);
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00209");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getIncAfterTaxYr();
        double[] doubleArray7 = incSheetFileData5.getEpsYr();
        double[] doubleArray8 = incSheetFileData5.getCogsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData9 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData5);
        double[] doubleArray10 = incSheetFileData5.getEpsYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00210");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.find("out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!");
        org.junit.Assert.assertNull(estimateFileData1);
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00211");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getAdjToIncYr();
        double[] doubleArray2 = incSheetFileData0.getUnusualIncYr();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = doubleArray2.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00212");
        java.lang.String[] strArray5 = new java.lang.String[] { "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "", "NONE", "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData10 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData11 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData12 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(companyFileData8);
        org.junit.Assert.assertNotNull(companyFileData9);
        org.junit.Assert.assertNotNull(sharesFileData10);
        org.junit.Assert.assertNotNull(incSheetFileData11);
        org.junit.Assert.assertNotNull(sharesFileData12);
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00213");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double double7 = fieldData2.getFloatshr();
        double[] doubleArray8 = fieldData2.getCogsYr();
        double[] doubleArray9 = fieldData2.getPreTaxIncYr();
        double[] doubleArray10 = fieldData2.getGrossIncQtr();
        double[] doubleArray11 = fieldData2.getEquityQtr();
        double[] doubleArray12 = fieldData2.getGrossOpExpYr();
        int int13 = fieldData2.getInstSellShrs();
        double[] doubleArray14 = fieldData2.getEquityYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(doubleArray14);
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00214");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        double[] doubleArray7 = incSheetFileData5.getCogsYr();
        double[] doubleArray8 = incSheetFileData5.getIntExpNonOpYr();
        double[] doubleArray9 = incSheetFileData5.getUnusualIncQtr();
        double[] doubleArray10 = incSheetFileData5.getIncPrimaryEpsYr();
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
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00215");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        sharesFileData0.setVolume3m("");
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum6 = sharesFileData0.getExchange();
        java.lang.String str7 = sharesFileData0.getName();
        int int8 = sharesFileData0.getInstShareholders();
        long long9 = sharesFileData0.getVolumeMonth3m();
        sharesFileData0.setVolume3m("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        org.junit.Assert.assertNull(exchEnum6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00216");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, (int) '4');
        java.lang.Class<?> wildcardClass3 = fieldData2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00217");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double double6 = fieldData2.getEpsQ1();
        double[] doubleArray7 = fieldData2.getAcctPayableQtr();
        double[] doubleArray8 = fieldData2.getIncTaxYr();
        java.lang.String str9 = fieldData2.getSic();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00218");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        double[] doubleArray7 = incSheetFileData5.getCogsYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum8 = incSheetFileData5.getExchange();
        double[] doubleArray9 = incSheetFileData5.getDepreciationQtr();
        double[] doubleArray10 = incSheetFileData5.getAdjToIncQtr();
        double[] doubleArray11 = incSheetFileData5.getUnusualIncYr();
        java.lang.String str12 = incSheetFileData5.toDbOutput();
        double[] doubleArray13 = incSheetFileData5.getCogsQtr();
        double[] doubleArray14 = incSheetFileData5.getDividendYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(exchEnum8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(doubleArray14);
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00219");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        sharesFileData0.setFloatshr("");
        int int6 = sharesFileData0.getInstShareholders();
        java.lang.String str7 = sharesFileData0.getSector();
        int int8 = sharesFileData0.getInsiderBuys();
        java.lang.String str9 = sharesFileData0.getIndustry();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00220");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        boolean boolean1 = companyFileData0.isAdr();
        java.lang.String str2 = companyFileData0.getDowIndexStr();
        boolean boolean3 = companyFileData0.isAdr();
        companyFileData0.setIndustry("out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        java.lang.Class<?> wildcardClass6 = companyFileData0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00221");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.find("out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!");
        org.junit.Assert.assertNull(balSheetFileData1);
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00222");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getPreTaxIncQtr();
        double[] doubleArray7 = incSheetFileData5.getCogsQtr();
        java.lang.String str8 = incSheetFileData5.getSector();
        double[] doubleArray9 = incSheetFileData5.getPreTaxIncYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData10 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        java.lang.String str11 = companyFileData10.getStreet();
        companyFileData10.setPhone("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        companyFileData10.setCity("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        java.lang.String str16 = companyFileData10.getSic();
        java.lang.String str17 = companyFileData10.getIndustry();
        java.lang.String str18 = companyFileData10.getZip();
        boolean boolean19 = companyFileData10.isAdr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum20 = companyFileData10.getExchange();
        companyFileData10.setDrp("Cash File Data");
        boolean boolean23 = companyFileData10.isDrp();
        incSheetFileData5.setNameFields(companyFileData10);
        int int25 = companyFileData10.getNumEmployees();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(exchEnum20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00223");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getStDebtYr();
        double double7 = fieldData2.getEpsQ0();
        double[] doubleArray8 = fieldData2.getSalesYr();
        double[] doubleArray9 = fieldData2.getOtherLtLiabQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00224");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        double double4 = sharesFileData0.getFloatshr();
        java.lang.String str5 = sharesFileData0.toDbOutput();
        sharesFileData0.setMktCap("Cash File Data");
        double double8 = sharesFileData0.getInsiderOwnership();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n" + "'", str5, "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00225");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double double7 = fieldData2.getFloatshr();
        double[] doubleArray8 = fieldData2.getCogsYr();
        double[] doubleArray9 = fieldData2.getPreTaxIncYr();
        double[] doubleArray10 = fieldData2.getDepreciationYr();
        double[] doubleArray11 = fieldData2.getAcctRxQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData12 = fieldData2.getEstimateData();
        double double13 = estimateFileData12.getEpsY2();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData14 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData12);
        java.lang.String str15 = estimateFileData12.getIndustry();
        java.lang.String str16 = estimateFileData12.getTicker();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNotNull(estimateFileData12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00226");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double[] doubleArray5 = fieldData2.getAdjToIncQtr();
        double[] doubleArray6 = fieldData2.getGoodwillYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData7 = fieldData2.getCashData();
        double[] doubleArray8 = fieldData2.getRdQtr();
        double[] doubleArray9 = fieldData2.getPreTaxIncYr();
        int int10 = fieldData2.getInstBuyShrs();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNotNull(cashFileData7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00227");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double double7 = fieldData2.getFloatshr();
        double[] doubleArray8 = fieldData2.getCogsYr();
        double[] doubleArray9 = fieldData2.getPreTaxIncYr();
        double[] doubleArray10 = fieldData2.getOtherIncQtr();
        double[] doubleArray11 = fieldData2.getUnusualIncQtr();
        double[] doubleArray12 = fieldData2.getGrossOpExpQtr();
        long long13 = fieldData2.getVolume10d();
        net.ajaskey.common.DateTime dateTime14 = fieldData2.getCurrFiscalYear();
        double double15 = fieldData2.getPrice();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNull(dateTime14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00228");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double[] doubleArray7 = fieldData2.getCogsQtr();
        double double8 = fieldData2.getBeta();
        java.lang.String str9 = fieldData2.getTicker();
        double[] doubleArray10 = fieldData2.getPrefStockYr();
        double[] doubleArray11 = fieldData2.getSharesQ();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getTtm(doubleArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0]");
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00229");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getAllFromMemory((int) (byte) 100, (int) (byte) 100);
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00230");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getCurrLiabYr();
        double[] doubleArray3 = balSheetFileData1.getAcctRxYr();
        double[] doubleArray4 = balSheetFileData1.getStInvestQtr();
        double[] doubleArray5 = balSheetFileData1.getCurrAssetsQtr();
        java.lang.String str6 = balSheetFileData1.toDbOutput();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00231");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData0.setAdr("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData3 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double4 = estimateFileData3.getEpsQ0();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData5 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int6 = sharesFileData5.getInstShareholders();
        double double7 = sharesFileData5.getPrice();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData8.setFromReport((int) (byte) 0, 0);
        double[] doubleArray12 = sharesFileData8.getSharesQ();
        sharesFileData5.setSharesQ(doubleArray12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData14 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData5);
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList18);
        double[] doubleArray21 = incSheetFileData20.getEpsContYr();
        double[] doubleArray22 = incSheetFileData20.getCogsYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData23 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData23);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData25 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData24);
        double[] doubleArray26 = balSheetFileData25.getLtDebtYr();
        java.lang.String str27 = balSheetFileData25.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData30 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData31 = fieldData30.getCashData();
        double[] doubleArray32 = cashFileData31.getCashFromFinQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData35 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData0, estimateFileData3, sharesFileData14, incSheetFileData20, balSheetFileData25, cashFileData31, (int) '#', 0);
        double[] doubleArray36 = incSheetFileData20.getPreTaxIncYr();
        double[] doubleArray37 = incSheetFileData20.getEpsDilContYr();
        double[] doubleArray38 = incSheetFileData20.getAdjToIncYr();
        double[] doubleArray39 = incSheetFileData20.getIncPrimaryEpsQtr();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0]");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(incSheetFileData20);
        org.junit.Assert.assertNull(doubleArray21);
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(cashFileData31);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertNull(doubleArray36);
        org.junit.Assert.assertNull(doubleArray37);
        org.junit.Assert.assertNull(doubleArray38);
        org.junit.Assert.assertNull(doubleArray39);
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00232");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.find("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  web       : null\r\n");
        org.junit.Assert.assertNull(cashFileData1);
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00233");
        java.lang.String[] strArray2 = new java.lang.String[] { "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n", "hi!" };
        java.lang.String[] strArray4 = new java.lang.String[] { "Cash File Data" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData5 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(strArray2, strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00234");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getOtherLtLiabQtr();
        double[] doubleArray3 = balSheetFileData1.getNetFixedAssetsQtr();
        double[] doubleArray4 = balSheetFileData1.getTotalLiabYr();
        double[] doubleArray5 = balSheetFileData1.getOtherLtAssetsQtr();
        double[] doubleArray6 = balSheetFileData1.getEquityQtr();
        double[] doubleArray7 = balSheetFileData1.getTotalAssetsQtr();
        double[] doubleArray8 = balSheetFileData1.getLiabEquityQtr();
        double[] doubleArray9 = balSheetFileData1.getCurrAssetsYr();
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
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00235");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData0.setAdr("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData3 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double4 = estimateFileData3.getEpsQ0();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData5 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int6 = sharesFileData5.getInstShareholders();
        double double7 = sharesFileData5.getPrice();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData8.setFromReport((int) (byte) 0, 0);
        double[] doubleArray12 = sharesFileData8.getSharesQ();
        sharesFileData5.setSharesQ(doubleArray12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData14 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData5);
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList18);
        double[] doubleArray21 = incSheetFileData20.getEpsContYr();
        double[] doubleArray22 = incSheetFileData20.getCogsYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData23 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData23);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData25 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData24);
        double[] doubleArray26 = balSheetFileData25.getLtDebtYr();
        java.lang.String str27 = balSheetFileData25.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData30 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData31 = fieldData30.getCashData();
        double[] doubleArray32 = cashFileData31.getCashFromFinQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData35 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData0, estimateFileData3, sharesFileData14, incSheetFileData20, balSheetFileData25, cashFileData31, (int) '#', 0);
        java.lang.String str36 = companyFileData0.getZip();
        companyFileData0.setNumEmployees("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        java.lang.String str39 = companyFileData0.getWeb();
        companyFileData0.setNumEmployees("");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0]");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(incSheetFileData20);
        org.junit.Assert.assertNull(doubleArray21);
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(cashFileData31);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str39);
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00236");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FiletypeEnum filetypeEnum2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getAllFromDb(6, 10, filetypeEnum2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00237");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        double double4 = sharesFileData0.getFloatshr();
        java.lang.String str5 = sharesFileData0.toDbOutput();
        sharesFileData0.setMktCap("Cash File Data");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData8.setFromReport((int) '4', (int) '4');
        sharesFileData8.setInstSellShrs("out/BigDB/");
        sharesFileData8.setInsiderNetPercentOutstanding("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n" + "'", str5, "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00238");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        double[] doubleArray7 = incSheetFileData5.getPreTaxIncQtr();
        double[] doubleArray8 = incSheetFileData5.getNetIncQtr();
        double[] doubleArray9 = incSheetFileData5.getUnusualIncYr();
        double[] doubleArray10 = incSheetFileData5.getSalesYr();
        java.lang.String str11 = incSheetFileData5.getName();
        double[] doubleArray12 = incSheetFileData5.getIntExpYr();
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
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00239");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readSipData("NONE", "Cash File Data");
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00240");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray3 = balSheetFileData2.getLtDebtYr();
        double[] doubleArray4 = balSheetFileData2.getOtherCurrAssetsQtr();
        double[] doubleArray5 = balSheetFileData2.getCashYr();
        double[] doubleArray6 = balSheetFileData2.getAcctPayableYr();
        double[] doubleArray7 = balSheetFileData2.getLtDebtYr();
        double[] doubleArray8 = balSheetFileData2.getCashQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00241");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getCurrLiabYr();
        double[] doubleArray3 = balSheetFileData1.getGoodwillYr();
        double[] doubleArray4 = balSheetFileData1.getEquityYr();
        double[] doubleArray5 = balSheetFileData1.getStInvestYr();
        double[] doubleArray6 = balSheetFileData1.getPrefStockYr();
        double[] doubleArray7 = balSheetFileData1.getGoodwillYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00242");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getFromMemory("out/BigDB/1/Q6/out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!-fundamental-data-1Q6.data/BigDB/", 1, (int) 'a');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00243");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        java.lang.String str4 = fieldData2.getZip();
        double[] doubleArray5 = fieldData2.getIncTaxYr();
        java.lang.String str6 = fieldData2.getSnpIndexStr();
        double double7 = fieldData2.getFloatshr();
        double[] doubleArray8 = fieldData2.getEpsDilYr();
        java.lang.String str9 = fieldData2.getSnpIndexStr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00244");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double[] doubleArray5 = fieldData2.getEpsDilContQtr();
        double[] doubleArray6 = fieldData2.getCurrLiabQtr();
        double[] doubleArray7 = fieldData2.getGrossOpExpQtr();
        int int8 = fieldData2.getInsiderSellShrs();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00245");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double1 = estimateFileData0.getEpsQ0();
        double double2 = estimateFileData0.getEpsY1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData3 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData0);
        double double4 = estimateFileData3.getEpsY0();
        java.lang.String str5 = estimateFileData3.getTicker();
        double double6 = estimateFileData3.getEpsY1();
        java.lang.String str7 = estimateFileData3.getSector();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00246");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getAllFromMemory((int) (byte) 10, (int) (short) 0);
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00247");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double[] doubleArray5 = fieldData2.getEpsDilContQtr();
        double[] doubleArray6 = fieldData2.getCurrLiabQtr();
        double[] doubleArray7 = fieldData2.getGrossOpExpQtr();
        double[] doubleArray8 = fieldData2.getEpsContYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00248");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        boolean boolean1 = companyFileData0.isAdr();
        java.lang.String str2 = companyFileData0.getState();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SnpEnum snpEnum3 = companyFileData0.getSnpIndex();
        java.lang.String str4 = companyFileData0.toString();
        companyFileData0.setDowIndex("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double8 = estimateFileData7.getEpsQ0();
        double double9 = estimateFileData7.getEpsY1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData10 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData7);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData11 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int12 = sharesFileData11.getInstShareholders();
        double double13 = sharesFileData11.getDollar3m();
        double double14 = sharesFileData11.getDollar3m();
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList18);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData21 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData22 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData21);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData23 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData22);
        double[] doubleArray24 = balSheetFileData22.getCurrLiabYr();
        double[] doubleArray25 = balSheetFileData22.getStDebtQtr();
        double[] doubleArray26 = balSheetFileData22.getOtherLtLiabYr();
        java.lang.String[] strArray32 = new java.lang.String[] { "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "", "NONE", "" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData35 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList33);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData36 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList33);
        double[] doubleArray37 = cashFileData36.getCashFromInvQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData40 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData0, estimateFileData10, sharesFileData11, incSheetFileData20, balSheetFileData22, cashFileData36, (int) (short) 10, (int) (byte) 0);
        java.lang.Class<?> wildcardClass41 = cashFileData36.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(snpEnum3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(incSheetFileData20);
        org.junit.Assert.assertNull(doubleArray24);
        org.junit.Assert.assertNull(doubleArray25);
        org.junit.Assert.assertNull(doubleArray26);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(companyFileData35);
        org.junit.Assert.assertNotNull(cashFileData36);
        org.junit.Assert.assertNull(doubleArray37);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00249");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getBvpsQtr();
        double[] doubleArray3 = balSheetFileData1.getInventoryYr();
        double[] doubleArray4 = balSheetFileData1.getLiabEquityYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00250");
        java.lang.String[] strArray5 = new java.lang.String[] { "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  web       : null\r\n", "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "Cash File Data", "out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "out/BigDB/" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00251");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getFromMemory("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n", (int) (byte) 1, (-1));
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00252");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FiletypeEnum filetypeEnum2 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.parseSipData((int) (byte) 10, 10, filetypeEnum2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00253");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getAdjToIncYr();
        double[] doubleArray2 = incSheetFileData0.getRdQtr();
        java.lang.String str3 = incSheetFileData0.getTicker();
        java.lang.String str4 = incSheetFileData0.toString();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00254");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FiletypeEnum filetypeEnum2 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.parseSipData((int) ' ', (int) (byte) 10, filetypeEnum2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00255");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (byte) 0, 0);
        double[] doubleArray4 = sharesFileData0.getSharesQ();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray8 = fieldData7.getCogsYr();
        double[] doubleArray9 = fieldData7.getGrossIncQtr();
        double double10 = fieldData7.getEpsY1();
        double double11 = fieldData7.getEpsQ1();
        double[] doubleArray12 = fieldData7.getAcctPayableQtr();
        double[] doubleArray13 = fieldData7.getNonrecurringItemsYr();
        double[] doubleArray14 = fieldData7.getLiabEquityQtr();
        double[] doubleArray15 = fieldData7.getSharesY();
        sharesFileData0.setSharesY(doubleArray15);
        double double17 = sharesFileData0.getDollar3m();
        java.lang.String str18 = sharesFileData0.getTicker();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[0.0]");
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(doubleArray14);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00256");
        java.lang.String[] strArray1 = new java.lang.String[] { "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  web       : null\r\n" };
        java.lang.String[] strArray2 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData3 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(strArray1, strArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00257");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        double[] doubleArray4 = sharesFileData0.getSharesY();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getTtm(doubleArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[0.0]");
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00258");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        boolean boolean1 = companyFileData0.isAdr();
        java.lang.String str2 = companyFileData0.getState();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SnpEnum snpEnum3 = companyFileData0.getSnpIndex();
        java.lang.String str4 = companyFileData0.toString();
        companyFileData0.setDowIndex("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double8 = estimateFileData7.getEpsQ0();
        double double9 = estimateFileData7.getEpsY1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData10 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData7);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData11 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int12 = sharesFileData11.getInstShareholders();
        double double13 = sharesFileData11.getDollar3m();
        double double14 = sharesFileData11.getDollar3m();
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList18);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData21 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData22 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData21);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData23 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData22);
        double[] doubleArray24 = balSheetFileData22.getCurrLiabYr();
        double[] doubleArray25 = balSheetFileData22.getStDebtQtr();
        double[] doubleArray26 = balSheetFileData22.getOtherLtLiabYr();
        java.lang.String[] strArray32 = new java.lang.String[] { "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "", "NONE", "" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData35 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList33);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData36 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList33);
        double[] doubleArray37 = cashFileData36.getCashFromInvQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData40 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData0, estimateFileData10, sharesFileData11, incSheetFileData20, balSheetFileData22, cashFileData36, (int) (short) 10, (int) (byte) 0);
        double double41 = sharesFileData11.getBeta();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(snpEnum3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(incSheetFileData20);
        org.junit.Assert.assertNull(doubleArray24);
        org.junit.Assert.assertNull(doubleArray25);
        org.junit.Assert.assertNull(doubleArray26);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(companyFileData35);
        org.junit.Assert.assertNotNull(cashFileData36);
        org.junit.Assert.assertNull(doubleArray37);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00259");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getInventoryYr();
        double[] doubleArray2 = balSheetFileData0.getOtherCurrLiabYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00260");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double double6 = fieldData2.getEpsQ1();
        double[] doubleArray7 = fieldData2.getAcctPayableQtr();
        double[] doubleArray8 = fieldData2.getNonrecurringItemsYr();
        double[] doubleArray9 = fieldData2.getSalesYr();
        double[] doubleArray10 = fieldData2.getNetFixedAssetsYr();
        double[] doubleArray11 = fieldData2.getGoodwillQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00261");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double double7 = fieldData2.getFloatshr();
        double[] doubleArray8 = fieldData2.getGoodwillYr();
        java.lang.String str9 = fieldData2.getSnpIndexStr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData10 = fieldData2.getCompanyInfo();
        double[] doubleArray11 = fieldData2.getIntExpYr();
        double[] doubleArray12 = fieldData2.getStDebtYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(companyFileData10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00262");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FiletypeEnum filetypeEnum2 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.parseSipData((int) ' ', (int) (short) -1, filetypeEnum2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00263");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double double7 = fieldData2.getFloatshr();
        double[] doubleArray8 = fieldData2.getCogsYr();
        double[] doubleArray9 = fieldData2.getPreTaxIncYr();
        double[] doubleArray10 = fieldData2.getDepreciationYr();
        double double11 = fieldData2.getEpsQ1();
        boolean boolean12 = fieldData2.isAdr();
        double[] doubleArray13 = fieldData2.getOtherLtAssetsQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(doubleArray13);
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00264");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        java.lang.String str7 = incSheetFileData5.getIndustry();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData5);
        double[] doubleArray9 = incSheetFileData5.getCogsQtr();
        double[] doubleArray10 = incSheetFileData5.getCogsYr();
        double[] doubleArray11 = incSheetFileData5.getSalesQtr();
        double[] doubleArray12 = incSheetFileData5.getEpsDilContYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum13 = incSheetFileData5.getExchange();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(exchEnum13);
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00265");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readSipData("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n", "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00266");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        net.ajaskey.common.DateTime dateTime7 = fieldData2.getLatestQtrEps();
        double[] doubleArray8 = fieldData2.getCashYr();
        double[] doubleArray9 = fieldData2.getEpsContQtr();
        double[] doubleArray10 = fieldData2.getIncAfterTaxQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(dateTime7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00267");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        java.lang.String str1 = companyFileData0.getStreet();
        companyFileData0.setPhone("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        companyFileData0.setCity("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        java.lang.String str6 = companyFileData0.getSic();
        java.lang.String str7 = companyFileData0.getIndustry();
        java.lang.String str8 = companyFileData0.getZip();
        boolean boolean9 = companyFileData0.isAdr();
        companyFileData0.setName("hi!");
        java.lang.String str12 = companyFileData0.getWeb();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum13 = companyFileData0.getExchange();
        java.lang.String str14 = companyFileData0.getName();
        java.lang.String str15 = companyFileData0.getState();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(exchEnum13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00268");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getCurrLiabYr();
        double[] doubleArray3 = balSheetFileData1.getCurrAssetsYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData4.setSector("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        companyFileData4.setName("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        balSheetFileData1.setNameFields(companyFileData4);
        double[] doubleArray10 = balSheetFileData1.getGoodwillQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00269");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FiletypeEnum filetypeEnum2 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.parseSipData(0, (int) (short) 1, filetypeEnum2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00270");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FiletypeEnum filetypeEnum3 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getFromDb("data/BigDB/", (int) (short) 100, 1, filetypeEnum3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00271");
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum1 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.convertExchange("");
        java.lang.String str2 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getExchangeStr(exchEnum1);
        java.lang.String str3 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getExchangeStr(exchEnum1);
        java.lang.String str4 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getExchangeStr(exchEnum1);
        java.lang.String str5 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getExchangeStr(exchEnum1);
        org.junit.Assert.assertTrue("'" + exchEnum1 + "' != '" + net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum.NONE + "'", exchEnum1.equals(net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum.NONE));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NONE" + "'", str2, "NONE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NONE" + "'", str3, "NONE");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "NONE" + "'", str4, "NONE");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "NONE" + "'", str5, "NONE");
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00272");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getEquityYr();
        double[] doubleArray5 = fieldData2.getOtherLtLiabYr();
        double[] doubleArray6 = fieldData2.getPrefStockQtr();
        double[] doubleArray7 = fieldData2.getCashFromOps();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00273");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double double6 = fieldData2.getEpsQ1();
        double[] doubleArray7 = fieldData2.getAcctPayableQtr();
        double[] doubleArray8 = fieldData2.getIntExpYr();
        double[] doubleArray9 = fieldData2.getLtDebtYr();
        double[] doubleArray10 = fieldData2.getUnusualIncYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00274");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        double[] doubleArray7 = incSheetFileData5.getIncTaxYr();
        double[] doubleArray8 = incSheetFileData5.getNetIncYr();
        double[] doubleArray9 = incSheetFileData5.getEpsContQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00275");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double double7 = fieldData2.getFloatshr();
        double[] doubleArray8 = fieldData2.getCogsYr();
        double[] doubleArray9 = fieldData2.getPreTaxIncYr();
        double[] doubleArray10 = fieldData2.getGrossIncQtr();
        double[] doubleArray11 = fieldData2.getTotalOpExpQtr();
        int int12 = fieldData2.getInsiderNetTrades();
        double[] doubleArray13 = fieldData2.getPreTaxIncQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(doubleArray13);
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00276");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        java.lang.String str7 = incSheetFileData5.getIndustry();
        double[] doubleArray8 = incSheetFileData5.getSalesQtr();
        double[] doubleArray9 = incSheetFileData5.getIntExpNonOpYr();
        double[] doubleArray10 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray11 = incSheetFileData5.getIncTaxYr();
        double[] doubleArray12 = incSheetFileData5.getAdjToIncYr();
        double[] doubleArray13 = incSheetFileData5.getSalesYr();
        double[] doubleArray14 = incSheetFileData5.getPreTaxIncQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(doubleArray14);
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00277");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray3 = balSheetFileData2.getLtDebtYr();
        double[] doubleArray4 = balSheetFileData2.getOtherCurrAssetsQtr();
        double[] doubleArray5 = balSheetFileData2.getCashYr();
        double[] doubleArray6 = balSheetFileData2.getAcctPayableYr();
        double[] doubleArray7 = balSheetFileData2.getOtherLtAssetsQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00278");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double double6 = fieldData2.getEpsQ1();
        double[] doubleArray7 = fieldData2.getAcctPayableQtr();
        double[] doubleArray8 = fieldData2.getNonrecurringItemsYr();
        double[] doubleArray9 = fieldData2.getLiabEquityQtr();
        java.lang.String str10 = fieldData2.getName();
        double[] doubleArray11 = fieldData2.getLtDebtQtr();
        double[] doubleArray12 = fieldData2.getDividendYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00279");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData0.setSector("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        java.lang.String str3 = companyFileData0.getTicker();
        java.lang.String str4 = companyFileData0.getSic();
        java.lang.String str5 = companyFileData0.getCountry();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00280");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getIncAfterTaxYr();
        double[] doubleArray7 = incSheetFileData5.getEpsYr();
        double[] doubleArray8 = incSheetFileData5.getCogsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData9 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum10 = incSheetFileData9.getExchange();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(exchEnum10);
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00281");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getCurrLiabYr();
        double[] doubleArray3 = balSheetFileData1.getAcctRxYr();
        double[] doubleArray4 = balSheetFileData1.getInventoryYr();
        double[] doubleArray5 = balSheetFileData1.getEquityQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00282");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readSipData("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  web       : null\r\n");
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00283");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray3 = balSheetFileData2.getLtDebtYr();
        double[] doubleArray4 = balSheetFileData2.getAcctPayableQtr();
        double[] doubleArray5 = balSheetFileData2.getCurrAssetsYr();
        double[] doubleArray6 = balSheetFileData2.getCurrLiabQtr();
        java.lang.String str7 = balSheetFileData2.toDbOutput();
        double[] doubleArray8 = balSheetFileData2.getAcctPayableYr();
        double[] doubleArray9 = balSheetFileData2.getTotalAssetsYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00284");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double[] doubleArray6 = fieldData2.getDividendYr();
        double[] doubleArray7 = fieldData2.getOtherIncYr();
        double[] doubleArray8 = fieldData2.getCashFromInv();
        double[] doubleArray9 = fieldData2.getCapEx();
        double double10 = fieldData2.getEpsQ1();
        double[] doubleArray11 = fieldData2.getEpsDilContQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00285");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData0.setSector("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        companyFileData0.setName("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        companyFileData0.setCity("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        int int7 = companyFileData0.getNumEmployees();
        companyFileData0.setNumEmployees("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  web       : null\r\n");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00286");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getIncAfterTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = fieldData2.getShares();
        double[] doubleArray5 = fieldData2.getTotalOpExpQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNotNull(sharesFileData4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00287");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInstShareholders();
        double double2 = sharesFileData0.getInsiderNetPercentOutstanding();
        java.lang.String str3 = sharesFileData0.toDbOutput();
        sharesFileData0.setInstBuyShrs("hi!");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int7 = sharesFileData6.getInstSellShrs();
        sharesFileData6.setInsiderSells("hi!");
        double double10 = sharesFileData6.getInstOwnership();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData11 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int12 = sharesFileData11.getInstShareholders();
        double double13 = sharesFileData11.getPrice();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData14 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData14.setFromReport((int) (byte) 0, 0);
        double[] doubleArray18 = sharesFileData14.getSharesQ();
        sharesFileData11.setSharesQ(doubleArray18);
        sharesFileData6.setSharesQ(doubleArray18);
        sharesFileData0.setSharesQ(doubleArray18);
        java.lang.String str22 = sharesFileData0.getName();
        int int23 = sharesFileData0.getInsiderNetTrades();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n" + "'", str3, "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0]");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00288");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getCurrLiabYr();
        double[] doubleArray3 = balSheetFileData1.getGoodwillYr();
        double[] doubleArray4 = balSheetFileData1.getEquityYr();
        java.lang.String str5 = balSheetFileData1.getName();
        double[] doubleArray6 = balSheetFileData1.getPrefStockQtr();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = doubleArray6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00289");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double double7 = fieldData2.getFloatshr();
        double[] doubleArray8 = fieldData2.getCogsYr();
        double[] doubleArray9 = fieldData2.getPreTaxIncYr();
        double[] doubleArray10 = fieldData2.getOtherIncQtr();
        double[] doubleArray11 = fieldData2.getUnusualIncQtr();
        double[] doubleArray12 = fieldData2.getGrossOpExpQtr();
        int int13 = fieldData2.getNumEmployees();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00290");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        int int6 = fieldData2.getInsiderSells();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData7 = fieldData2.getBalSheetData();
        int int8 = fieldData2.getInstBuyShrs();
        int int9 = fieldData2.getInstShareholders();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(balSheetFileData7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00291");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readSipData("NONE", "out/BigDB/1/Q6/out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!-fundamental-data-1Q6.data/BigDB/");
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00292");
        java.lang.String[] strArray2 = new java.lang.String[] { "out/BigDB/10/Q6/  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n-fundamental-data-10Q6.out/BigDB/", "out/BigDB/1/Q6/out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!-fundamental-data-1Q6.data/BigDB/" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData3 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(strArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00293");
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
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00294");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double[] doubleArray6 = fieldData2.getDividendYr();
        net.ajaskey.common.DateTime dateTime7 = fieldData2.getLatestQtrEps();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData8 = fieldData2.getShares();
        sharesFileData8.setInsiderOwnership("out/BigDB/10/Q6/  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n-fundamental-data-10Q6.out/BigDB/");
        int int11 = sharesFileData8.getInsiderNetTrades();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(dateTime7);
        org.junit.Assert.assertNotNull(sharesFileData8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00295");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double double7 = fieldData2.getFloatshr();
        double[] doubleArray8 = fieldData2.getCogsYr();
        double[] doubleArray9 = fieldData2.getPreTaxIncYr();
        double[] doubleArray10 = fieldData2.getRdQtr();
        double[] doubleArray11 = fieldData2.getOtherCurrLiabYr();
        double double12 = fieldData2.getInsiderNetPercentOutstanding();
        double[] doubleArray13 = fieldData2.getCurrAssetsYr();
        double[] doubleArray14 = fieldData2.getEpsQtr();
        double double15 = fieldData2.getFloatshr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(doubleArray14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00296");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        boolean boolean1 = companyFileData0.isAdr();
        java.lang.String str2 = companyFileData0.getState();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SnpEnum snpEnum3 = companyFileData0.getSnpIndex();
        java.lang.String str4 = companyFileData0.toString();
        companyFileData0.setDowIndex("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double8 = estimateFileData7.getEpsQ0();
        double double9 = estimateFileData7.getEpsY1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData10 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData7);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData11 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int12 = sharesFileData11.getInstShareholders();
        double double13 = sharesFileData11.getDollar3m();
        double double14 = sharesFileData11.getDollar3m();
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList18);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData21 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData22 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData21);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData23 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData22);
        double[] doubleArray24 = balSheetFileData22.getCurrLiabYr();
        double[] doubleArray25 = balSheetFileData22.getStDebtQtr();
        double[] doubleArray26 = balSheetFileData22.getOtherLtLiabYr();
        java.lang.String[] strArray32 = new java.lang.String[] { "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "", "NONE", "" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData35 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList33);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData36 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList33);
        double[] doubleArray37 = cashFileData36.getCashFromInvQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData40 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData0, estimateFileData10, sharesFileData11, incSheetFileData20, balSheetFileData22, cashFileData36, (int) (short) 10, (int) (byte) 0);
        long long41 = sharesFileData11.getVolume10d();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(snpEnum3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(incSheetFileData20);
        org.junit.Assert.assertNull(doubleArray24);
        org.junit.Assert.assertNull(doubleArray25);
        org.junit.Assert.assertNull(doubleArray26);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(companyFileData35);
        org.junit.Assert.assertNotNull(cashFileData36);
        org.junit.Assert.assertNull(doubleArray37);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00297");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getPreTaxIncQtr();
        double[] doubleArray7 = incSheetFileData5.getCogsQtr();
        java.lang.String str8 = incSheetFileData5.getSector();
        double[] doubleArray9 = incSheetFileData5.getPreTaxIncYr();
        double[] doubleArray10 = incSheetFileData5.getGrossOpExpQtr();
        double[] doubleArray11 = incSheetFileData5.getIncAfterTaxQtr();
        double[] doubleArray12 = incSheetFileData5.getOtherIncYr();
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
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00298");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double double7 = fieldData2.getFloatshr();
        double[] doubleArray8 = fieldData2.getCogsYr();
        double[] doubleArray9 = fieldData2.getPreTaxIncYr();
        double[] doubleArray10 = fieldData2.getOtherIncQtr();
        double[] doubleArray11 = fieldData2.getUnusualIncQtr();
        java.lang.String str12 = fieldData2.getCountry();
        double[] doubleArray13 = fieldData2.getNonrecurringItemsYr();
        double[] doubleArray14 = fieldData2.getIncAfterTaxYr();
        double double15 = fieldData2.getFloatshr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(doubleArray14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00299");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getGrossOpExpQtr();
        java.lang.String str4 = fieldData2.getWeb();
        int int5 = fieldData2.getInsiderNetTrades();
        double[] doubleArray6 = fieldData2.getEpsDilYr();
        double double7 = fieldData2.getEpsY1();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00300");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.setMemory(10, 6, filetypeEnum2);
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00301");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInstSellShrs();
        double double2 = sharesFileData0.getBeta();
        double double3 = sharesFileData0.getPrice52hi();
        java.lang.String str4 = sharesFileData0.toDbOutput();
        sharesFileData0.setInstSellShrs("");
        double double7 = sharesFileData0.getFloatshr();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n" + "'", str4, "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00302");
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum1 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.convertExchange("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        org.junit.Assert.assertTrue("'" + exchEnum1 + "' != '" + net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum.NONE + "'", exchEnum1.equals(net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum.NONE));
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00303");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double[] doubleArray6 = fieldData2.getDividendYr();
        double[] doubleArray7 = fieldData2.getOtherIncYr();
        double[] doubleArray8 = fieldData2.getCashFromInv();
        double double9 = fieldData2.getMktCap();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData10 = fieldData2.getCompanyInfo();
        companyFileData10.setSic("out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!");
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(companyFileData10);
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00304");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        java.lang.String str1 = companyFileData0.getStreet();
        companyFileData0.setPhone("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        companyFileData0.setCity("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        java.lang.String str6 = companyFileData0.getSic();
        java.lang.String str7 = companyFileData0.getName();
        java.lang.String str8 = companyFileData0.getPhone();
        // The following exception was thrown during execution in test generation
        try {
            companyFileData0.setExchange("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No enum constant net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!" + "'", str8, "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00305");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "hi!", "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n" };
        java.lang.String[] strArray7 = new java.lang.String[] { "out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!", "out/BigDB/", "data/BigDB/" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(strArray3, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00306");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double double6 = fieldData2.getEpsQ1();
        double[] doubleArray7 = fieldData2.getAcctPayableQtr();
        double[] doubleArray8 = fieldData2.getIntExpYr();
        double[] doubleArray9 = fieldData2.getCogsYr();
        java.lang.String str10 = fieldData2.getSic();
        double[] doubleArray11 = fieldData2.getStInvestQtr();
        java.lang.String str12 = fieldData2.getDowIndexStr();
        double[] doubleArray13 = fieldData2.getOtherCurrAssetsYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(doubleArray13);
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00307");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readSipData("");
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00308");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readSipData("out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00309");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readSipData("NONE");
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00310");
        java.lang.String[] strArray1 = new java.lang.String[] { "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n" };
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
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00311");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readSipData("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  web       : null\r\n");
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00312");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double double7 = fieldData2.getFloatshr();
        double[] doubleArray8 = fieldData2.getCogsYr();
        double[] doubleArray9 = fieldData2.getPreTaxIncYr();
        double[] doubleArray10 = fieldData2.getGrossIncQtr();
        double[] doubleArray11 = fieldData2.getEquityQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData12 = fieldData2.getCompanyInfo();
        java.lang.String[] strArray18 = new java.lang.String[] { "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "", "NONE", "" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData21 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList19);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData22 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList19);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData23 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList19);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData24 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList19);
        double double25 = estimateFileData24.getEpsY1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData26 = null;
        estimateFileData24.setNameFields(companyFileData26);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData30 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray31 = fieldData30.getCogsYr();
        double[] doubleArray32 = fieldData30.getGrossIncQtr();
        double double33 = fieldData30.getEpsY1();
        double[] doubleArray34 = fieldData30.getDividendYr();
        net.ajaskey.common.DateTime dateTime35 = fieldData30.getLatestQtrEps();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData36 = fieldData30.getShares();
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData42 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList40);
        double[] doubleArray43 = incSheetFileData42.getEpsContYr();
        java.lang.String str44 = incSheetFileData42.getIndustry();
        double[] doubleArray45 = incSheetFileData42.getSalesQtr();
        double[] doubleArray46 = incSheetFileData42.getIntExpNonOpYr();
        double[] doubleArray47 = incSheetFileData42.getNonrecurringItemsQtr();
        double[] doubleArray48 = incSheetFileData42.getIncTaxYr();
        double[] doubleArray49 = incSheetFileData42.getNetIncYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData50 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData51 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData50);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData52 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData51);
        double[] doubleArray53 = balSheetFileData52.getLtDebtYr();
        java.lang.String str54 = balSheetFileData52.toDbOutput();
        java.lang.String str55 = balSheetFileData52.getName();
        double[] doubleArray56 = balSheetFileData52.getAcctRxYr();
        java.lang.String[] strArray62 = new java.lang.String[] { "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "", "NONE", "" };
        java.util.ArrayList<java.lang.String> strList63 = new java.util.ArrayList<java.lang.String>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList63, strArray62);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData65 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList63);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData66 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList63);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData69 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData12, estimateFileData24, sharesFileData36, incSheetFileData42, balSheetFileData52, cashFileData66, 0, 10);
        double[] doubleArray70 = incSheetFileData42.getGrossOpExpQtr();
        double[] doubleArray71 = incSheetFileData42.getIncTaxYr();
        double[] doubleArray72 = incSheetFileData42.getTotalOpExpYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNotNull(companyFileData12);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(companyFileData21);
        org.junit.Assert.assertNotNull(cashFileData22);
        org.junit.Assert.assertNotNull(incSheetFileData23);
        org.junit.Assert.assertNotNull(estimateFileData24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertNull(doubleArray31);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNull(doubleArray34);
        org.junit.Assert.assertNull(dateTime35);
        org.junit.Assert.assertNotNull(sharesFileData36);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(incSheetFileData42);
        org.junit.Assert.assertNull(doubleArray43);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNull(doubleArray45);
        org.junit.Assert.assertNull(doubleArray46);
        org.junit.Assert.assertNull(doubleArray47);
        org.junit.Assert.assertNull(doubleArray48);
        org.junit.Assert.assertNull(doubleArray49);
        org.junit.Assert.assertNull(doubleArray53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNull(doubleArray56);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(companyFileData65);
        org.junit.Assert.assertNotNull(cashFileData66);
        org.junit.Assert.assertNull(doubleArray70);
        org.junit.Assert.assertNull(doubleArray71);
        org.junit.Assert.assertNull(doubleArray72);
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00313");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData0.setAdr("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData3 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double4 = estimateFileData3.getEpsQ0();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData5 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int6 = sharesFileData5.getInstShareholders();
        double double7 = sharesFileData5.getPrice();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData8.setFromReport((int) (byte) 0, 0);
        double[] doubleArray12 = sharesFileData8.getSharesQ();
        sharesFileData5.setSharesQ(doubleArray12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData14 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData5);
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList18);
        double[] doubleArray21 = incSheetFileData20.getEpsContYr();
        double[] doubleArray22 = incSheetFileData20.getCogsYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData23 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData23);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData25 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData24);
        double[] doubleArray26 = balSheetFileData25.getLtDebtYr();
        java.lang.String str27 = balSheetFileData25.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData30 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData31 = fieldData30.getCashData();
        double[] doubleArray32 = cashFileData31.getCashFromFinQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData35 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData0, estimateFileData3, sharesFileData14, incSheetFileData20, balSheetFileData25, cashFileData31, (int) '#', 0);
        double[] doubleArray36 = fieldData35.getEpsContQtr();
        double[] doubleArray37 = fieldData35.getIncTaxYr();
        double[] doubleArray38 = fieldData35.getSharesQ();
        double[] doubleArray39 = fieldData35.getGoodwillQtr();
        double[] doubleArray40 = fieldData35.getAcctRxYr();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0]");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(incSheetFileData20);
        org.junit.Assert.assertNull(doubleArray21);
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(cashFileData31);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertNull(doubleArray36);
        org.junit.Assert.assertNull(doubleArray37);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[0.0]");
        org.junit.Assert.assertNull(doubleArray39);
        org.junit.Assert.assertNull(doubleArray40);
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00314");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        double[] doubleArray7 = incSheetFileData5.getPreTaxIncQtr();
        double[] doubleArray8 = incSheetFileData5.getNetIncQtr();
        double[] doubleArray9 = incSheetFileData5.getUnusualIncYr();
        double[] doubleArray10 = incSheetFileData5.getEpsDilContQtr();
        double[] doubleArray11 = incSheetFileData5.getIncTaxQtr();
        double[] doubleArray12 = incSheetFileData5.getEpsQtr();
        double[] doubleArray13 = incSheetFileData5.getRdQtr();
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
        org.junit.Assert.assertNull(doubleArray13);
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00315");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double1 = estimateFileData0.getEpsQ0();
        double double2 = estimateFileData0.getEpsY1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData3 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData0);
        double double4 = estimateFileData3.getEpsY0();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        boolean boolean6 = companyFileData5.isAdr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.DowEnum dowEnum7 = companyFileData5.getDowIndex();
        companyFileData5.setZip("");
        net.ajaskey.market.tools.SIP.BigDB.dataio.DowEnum dowEnum10 = companyFileData5.getDowIndex();
        estimateFileData3.setNameFields(companyFileData5);
        double double12 = estimateFileData3.getEpsQ0();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(dowEnum7);
        org.junit.Assert.assertNull(dowEnum10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00316");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double double7 = fieldData2.getFloatshr();
        double[] doubleArray8 = fieldData2.getCogsYr();
        double[] doubleArray9 = fieldData2.getPreTaxIncYr();
        double[] doubleArray10 = fieldData2.getOtherIncQtr();
        double[] doubleArray11 = fieldData2.getUnusualIncQtr();
        double[] doubleArray12 = fieldData2.getGrossOpExpYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00317");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double[] doubleArray6 = fieldData2.getDividendYr();
        double[] doubleArray7 = fieldData2.getAcctPayableYr();
        double[] doubleArray8 = fieldData2.getIncAfterTaxQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData9 = fieldData2.getBalSheetData();
        double[] doubleArray10 = balSheetFileData9.getNetFixedAssetsYr();
        java.lang.Class<?> wildcardClass11 = balSheetFileData9.getClass();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNotNull(balSheetFileData9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00318");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double double6 = fieldData2.getEpsQ1();
        double[] doubleArray7 = fieldData2.getAcctPayableQtr();
        double[] doubleArray8 = fieldData2.getNonrecurringItemsYr();
        double[] doubleArray9 = fieldData2.getAcctRxYr();
        double[] doubleArray10 = fieldData2.getCashFromInv();
        int int11 = fieldData2.getInsiderNetTrades();
        double[] doubleArray12 = fieldData2.getEpsDilQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(doubleArray12);
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00319");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "NONE", "data/BigDB/", "Cash File Data", "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n", "out/BigDB/1/Q6/out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!-fundamental-data-1Q6.data/BigDB/" };
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
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00320");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        boolean boolean1 = companyFileData0.isAdr();
        java.lang.String str2 = companyFileData0.getState();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SnpEnum snpEnum3 = companyFileData0.getSnpIndex();
        java.lang.String str4 = companyFileData0.toString();
        companyFileData0.setZip("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        java.lang.String str7 = companyFileData0.getTicker();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(snpEnum3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00321");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        sharesFileData0.setFloatshr("");
        java.lang.String str6 = sharesFileData0.getName();
        double double7 = sharesFileData0.getPrice52hi();
        sharesFileData0.setInstShareholders("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  web       : null\r\n");
        java.lang.String str10 = sharesFileData0.getIndustry();
        long long11 = sharesFileData0.getVolume10d();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00322");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInstShareholders();
        double double2 = sharesFileData0.getPrice();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData3 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData3.setFromReport((int) (byte) 0, 0);
        double[] doubleArray7 = sharesFileData3.getSharesQ();
        sharesFileData0.setSharesQ(doubleArray7);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getTtm(doubleArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00323");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getFromMemory("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", (int) '#', (int) (short) -1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00324");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double double4 = fieldData2.getEpsQ0();
        double double5 = fieldData2.getEpsQ1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData6 = fieldData2.getCashData();
        double[] doubleArray7 = fieldData2.getOtherIncQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(cashFileData6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00325");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double double6 = fieldData2.getEpsQ1();
        double[] doubleArray7 = fieldData2.getAcctPayableQtr();
        double[] doubleArray8 = fieldData2.getIntExpYr();
        double[] doubleArray9 = fieldData2.getCogsYr();
        java.lang.String str10 = fieldData2.getSic();
        double[] doubleArray11 = fieldData2.getStInvestQtr();
        java.lang.String str12 = fieldData2.getDowIndexStr();
        double[] doubleArray13 = fieldData2.getLiabEquityQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(doubleArray13);
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00326");
        java.lang.String str4 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getOutfileName(100, 6, "out/BigDB/", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "out/BigDB/100/Q6/out/BigDB/-fundamental-data-100Q6.hi!" + "'", str4, "out/BigDB/100/Q6/out/BigDB/-fundamental-data-100Q6.hi!");
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00327");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.find("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        org.junit.Assert.assertNull(incSheetFileData1);
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00328");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FiletypeEnum filetypeEnum2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getAllFromDb(1, (int) (short) 10, filetypeEnum2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00329");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.find("out/BigDB/100/Q6/out/BigDB/-fundamental-data-100Q6.hi!");
        org.junit.Assert.assertNull(companyFileData1);
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00330");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray3 = balSheetFileData2.getLtDebtYr();
        java.lang.String str4 = balSheetFileData2.toDbOutput();
        java.lang.String str5 = balSheetFileData2.getName();
        double[] doubleArray6 = balSheetFileData2.getAcctRxYr();
        java.lang.String str7 = balSheetFileData2.toDbOutput();
        double[] doubleArray8 = balSheetFileData2.getTotalLiabYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00331");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double[] doubleArray7 = fieldData2.getCogsQtr();
        double double8 = fieldData2.getBeta();
        java.lang.String str9 = fieldData2.getTicker();
        double[] doubleArray10 = fieldData2.getEpsContQtr();
        double[] doubleArray11 = fieldData2.getNetFixedAssetsYr();
        double[] doubleArray12 = fieldData2.getEpsQtr();
        double[] doubleArray13 = fieldData2.getCashFromFin();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00332");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double double7 = fieldData2.getFloatshr();
        double[] doubleArray8 = fieldData2.getCogsYr();
        double[] doubleArray9 = fieldData2.getPreTaxIncYr();
        double[] doubleArray10 = fieldData2.getOtherIncQtr();
        double[] doubleArray11 = fieldData2.getUnusualIncQtr();
        double[] doubleArray12 = fieldData2.getGrossOpExpQtr();
        long long13 = fieldData2.getVolume10d();
        double[] doubleArray14 = fieldData2.getLtDebtQtr();
        java.lang.String str15 = fieldData2.getWeb();
        double[] doubleArray16 = fieldData2.getCashFromInv();
        double double17 = fieldData2.getInsiderNetPercentOutstanding();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNull(doubleArray14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(doubleArray16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00333");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getLtDebtQtr();
        double[] doubleArray6 = fieldData2.getGoodwillYr();
        double double7 = fieldData2.getFloatshr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData8 = fieldData2.getCashData();
        double[] doubleArray9 = fieldData2.getOtherCurrLiabYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(cashFileData8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00334");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        java.lang.String str3 = fieldData2.getDowIndexStr();
        double[] doubleArray4 = fieldData2.getCashFromFin();
        double[] doubleArray5 = fieldData2.getPreTaxIncQtr();
        fieldData2.setYear(6);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00335");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.find("NONE");
        org.junit.Assert.assertNull(companyFileData1);
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00336");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData0.setAdr("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData3 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double4 = estimateFileData3.getEpsQ0();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData5 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int6 = sharesFileData5.getInstShareholders();
        double double7 = sharesFileData5.getPrice();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData8.setFromReport((int) (byte) 0, 0);
        double[] doubleArray12 = sharesFileData8.getSharesQ();
        sharesFileData5.setSharesQ(doubleArray12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData14 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData5);
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList18);
        double[] doubleArray21 = incSheetFileData20.getEpsContYr();
        double[] doubleArray22 = incSheetFileData20.getCogsYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData23 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData23);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData25 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData24);
        double[] doubleArray26 = balSheetFileData25.getLtDebtYr();
        java.lang.String str27 = balSheetFileData25.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData30 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData31 = fieldData30.getCashData();
        double[] doubleArray32 = cashFileData31.getCashFromFinQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData35 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData0, estimateFileData3, sharesFileData14, incSheetFileData20, balSheetFileData25, cashFileData31, (int) '#', 0);
        double[] doubleArray36 = incSheetFileData20.getIntExpYr();
        double[] doubleArray37 = incSheetFileData20.getEpsDilContYr();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0]");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(incSheetFileData20);
        org.junit.Assert.assertNull(doubleArray21);
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(cashFileData31);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertNull(doubleArray36);
        org.junit.Assert.assertNull(doubleArray37);
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00337");
        java.lang.String[] strArray3 = new java.lang.String[] { "out/BigDB/1/Q6/out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!-fundamental-data-1Q6.data/BigDB/", "NONE", "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n" };
        java.lang.String[] strArray4 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(strArray3, strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00338");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        double[] doubleArray7 = incSheetFileData5.getIncTaxYr();
        double[] doubleArray8 = incSheetFileData5.getGrossIncYr();
        double[] doubleArray9 = incSheetFileData5.getRdYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00339");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        double[] doubleArray7 = incSheetFileData5.getIncTaxYr();
        double[] doubleArray8 = incSheetFileData5.getGrossOpExpQtr();
        double[] doubleArray9 = incSheetFileData5.getEpsContYr();
        double[] doubleArray10 = incSheetFileData5.getDepreciationQtr();
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
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00340");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        boolean boolean1 = companyFileData0.isAdr();
        java.lang.String str2 = companyFileData0.getState();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SnpEnum snpEnum3 = companyFileData0.getSnpIndex();
        java.lang.String str4 = companyFileData0.toString();
        companyFileData0.setZip("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        java.lang.String str7 = companyFileData0.getSector();
        boolean boolean8 = companyFileData0.isAdr();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(snpEnum3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00341");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double double7 = fieldData2.getFloatshr();
        double[] doubleArray8 = fieldData2.getCogsYr();
        double[] doubleArray9 = fieldData2.getPreTaxIncYr();
        double[] doubleArray10 = fieldData2.getGrossIncQtr();
        double[] doubleArray11 = fieldData2.getEquityQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData12 = fieldData2.getCompanyInfo();
        double[] doubleArray13 = fieldData2.getLtDebtYr();
        java.lang.String str14 = fieldData2.getCountry();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNotNull(companyFileData12);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00342");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData0.setAdr("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData3 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double4 = estimateFileData3.getEpsQ0();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData5 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int6 = sharesFileData5.getInstShareholders();
        double double7 = sharesFileData5.getPrice();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData8.setFromReport((int) (byte) 0, 0);
        double[] doubleArray12 = sharesFileData8.getSharesQ();
        sharesFileData5.setSharesQ(doubleArray12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData14 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData5);
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList18);
        double[] doubleArray21 = incSheetFileData20.getEpsContYr();
        double[] doubleArray22 = incSheetFileData20.getCogsYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData23 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData23);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData25 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData24);
        double[] doubleArray26 = balSheetFileData25.getLtDebtYr();
        java.lang.String str27 = balSheetFileData25.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData30 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData31 = fieldData30.getCashData();
        double[] doubleArray32 = cashFileData31.getCashFromFinQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData35 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData0, estimateFileData3, sharesFileData14, incSheetFileData20, balSheetFileData25, cashFileData31, (int) '#', 0);
        double[] doubleArray36 = incSheetFileData20.getPreTaxIncYr();
        double[] doubleArray37 = incSheetFileData20.getEpsDilContYr();
        double[] doubleArray38 = incSheetFileData20.getEpsContQtr();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0]");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(incSheetFileData20);
        org.junit.Assert.assertNull(doubleArray21);
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(cashFileData31);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertNull(doubleArray36);
        org.junit.Assert.assertNull(doubleArray37);
        org.junit.Assert.assertNull(doubleArray38);
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00343");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double double7 = fieldData2.getFloatshr();
        double[] doubleArray8 = fieldData2.getTotalOpExpQtr();
        double double9 = fieldData2.getEpsY1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData10 = fieldData2.getCashData();
        double[] doubleArray11 = cashFileData10.getCashFromOpsQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(cashFileData10);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00344");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "out/BigDB/1/Q6/out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!-fundamental-data-1Q6.data/BigDB/", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00345");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData3 = fieldData2.getCashData();
        double[] doubleArray4 = fieldData2.getCurrAssetsQtr();
        double[] doubleArray5 = fieldData2.getOtherCurrLiabYr();
        int int6 = fieldData2.getInsiderSellShrs();
        int int7 = fieldData2.getInsiderSellShrs();
        double[] doubleArray8 = fieldData2.getEpsYr();
        org.junit.Assert.assertNotNull(cashFileData3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00346");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double double7 = fieldData2.getFloatshr();
        double[] doubleArray8 = fieldData2.getCogsYr();
        double[] doubleArray9 = fieldData2.getPreTaxIncYr();
        double[] doubleArray10 = fieldData2.getOtherIncQtr();
        double[] doubleArray11 = fieldData2.getUnusualIncQtr();
        double[] doubleArray12 = fieldData2.getGrossOpExpQtr();
        long long13 = fieldData2.getVolume10d();
        double[] doubleArray14 = fieldData2.getTotalOpExpYr();
        int int15 = fieldData2.getInstBuyShrs();
        double[] doubleArray16 = fieldData2.getPreTaxIncQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNull(doubleArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(doubleArray16);
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00347");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double double6 = fieldData2.getEpsQ1();
        double[] doubleArray7 = fieldData2.getGoodwillQtr();
        double double8 = fieldData2.getFloatshr();
        double[] doubleArray9 = fieldData2.getEpsDilContQtr();
        int int10 = fieldData2.getInsiderBuys();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00348");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        sharesFileData0.setVolume3m("");
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum6 = sharesFileData0.getExchange();
        java.lang.String str7 = sharesFileData0.getName();
        long long8 = sharesFileData0.getVolumeMonth3m();
        sharesFileData0.setBeta("out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        sharesFileData0.setInstBuyShrs("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  web       : null\r\n");
        sharesFileData0.setInsiderSellShrs("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  web       : null\r\n");
        org.junit.Assert.assertNull(exchEnum6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00349");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        double[] doubleArray7 = incSheetFileData5.getAdjToIncYr();
        double[] doubleArray8 = incSheetFileData5.getEpsDilContYr();
        double[] doubleArray9 = incSheetFileData5.getEpsQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00350");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.find("");
        org.junit.Assert.assertNull(cashFileData1);
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00351");
        java.lang.String[] strArray1 = new java.lang.String[] { "data/BigDB/" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00352");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double[] doubleArray7 = fieldData2.getCogsQtr();
        double double8 = fieldData2.getBeta();
        java.lang.String str9 = fieldData2.getTicker();
        double[] doubleArray10 = fieldData2.getEpsDilContQtr();
        double[] doubleArray11 = fieldData2.getCashFromFin();
        double[] doubleArray12 = fieldData2.getGrossIncQtr();
        double[] doubleArray13 = fieldData2.getInventoryYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00353");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double double7 = fieldData2.getFloatshr();
        double[] doubleArray8 = fieldData2.getTotalOpExpQtr();
        double[] doubleArray9 = fieldData2.getEpsContQtr();
        double[] doubleArray10 = fieldData2.getDividendQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00354");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        java.lang.String str7 = incSheetFileData5.getIndustry();
        double[] doubleArray8 = incSheetFileData5.getSalesQtr();
        double[] doubleArray9 = incSheetFileData5.getIntExpNonOpYr();
        double[] doubleArray10 = incSheetFileData5.getDepreciationYr();
        java.lang.String str11 = incSheetFileData5.toString();
        double[] doubleArray12 = incSheetFileData5.getGrossIncYr();
        double[] doubleArray13 = incSheetFileData5.getIncAfterTaxQtr();
        double[] doubleArray14 = incSheetFileData5.getGrossIncYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(doubleArray14);
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00355");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double[] doubleArray5 = fieldData2.getAdjToIncYr();
        net.ajaskey.common.DateTime dateTime6 = fieldData2.getLatestQtrEps();
        int int7 = fieldData2.getInsiderSellShrs();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(dateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00356");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        java.lang.String str7 = incSheetFileData5.getIndustry();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData5);
        double[] doubleArray9 = incSheetFileData5.getIncTaxQtr();
        double[] doubleArray10 = incSheetFileData5.getSalesYr();
        double[] doubleArray11 = incSheetFileData5.getTotalOpExpQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00357");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double[] doubleArray7 = fieldData2.getCogsQtr();
        double double8 = fieldData2.getBeta();
        java.lang.String str9 = fieldData2.getTicker();
        double[] doubleArray10 = fieldData2.getEpsContQtr();
        double[] doubleArray11 = fieldData2.getNetFixedAssetsYr();
        double[] doubleArray12 = fieldData2.getCapEx();
        double[] doubleArray13 = fieldData2.getLiabEquityYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00358");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readSipData("", "hi!");
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00359");
        java.lang.String[] strArray1 = new java.lang.String[] { "out/BigDB/" };
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
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00360");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData0.setSector("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        companyFileData0.setName("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        companyFileData0.setCity("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        companyFileData0.setName("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00361");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        java.lang.String str1 = companyFileData0.getStreet();
        companyFileData0.setName("NONE");
        companyFileData0.setStreet("NONE");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00362");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readSipData("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n", "out/BigDB/10/Q6/  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n-fundamental-data-10Q6.out/BigDB/");
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00363");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData0.setAdr("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData3 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double4 = estimateFileData3.getEpsQ0();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData5 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int6 = sharesFileData5.getInstShareholders();
        double double7 = sharesFileData5.getPrice();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData8.setFromReport((int) (byte) 0, 0);
        double[] doubleArray12 = sharesFileData8.getSharesQ();
        sharesFileData5.setSharesQ(doubleArray12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData14 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData5);
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList18);
        double[] doubleArray21 = incSheetFileData20.getEpsContYr();
        double[] doubleArray22 = incSheetFileData20.getCogsYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData23 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData23);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData25 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData24);
        double[] doubleArray26 = balSheetFileData25.getLtDebtYr();
        java.lang.String str27 = balSheetFileData25.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData30 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData31 = fieldData30.getCashData();
        double[] doubleArray32 = cashFileData31.getCashFromFinQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData35 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData0, estimateFileData3, sharesFileData14, incSheetFileData20, balSheetFileData25, cashFileData31, (int) '#', 0);
        java.lang.String str36 = estimateFileData3.getIndustry();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum37 = estimateFileData3.getExchange();
        java.lang.String str38 = estimateFileData3.toString();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum39 = estimateFileData3.getExchange();
        net.ajaskey.common.DateTime dateTime40 = estimateFileData3.getLatestQtrEps();
        java.lang.String str41 = estimateFileData3.toDbOutput();
        java.lang.String str42 = estimateFileData3.toString();
        net.ajaskey.common.DateTime dateTime43 = estimateFileData3.getLatestQtrEps();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0]");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(incSheetFileData20);
        org.junit.Assert.assertNull(doubleArray21);
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(cashFileData31);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(exchEnum37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNull(exchEnum39);
        org.junit.Assert.assertNull(dateTime40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNull(dateTime43);
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00364");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getFromMemory("hi!", (int) (short) 100, (int) 'a');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00365");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readSipData("out/BigDB/1/Q6/out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!-fundamental-data-1Q6.data/BigDB/");
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00366");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double double6 = fieldData2.getEpsQ1();
        double[] doubleArray7 = fieldData2.getGoodwillQtr();
        double[] doubleArray8 = fieldData2.getAcctRxQtr();
        double double9 = fieldData2.getInstOwnership();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00367");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double double7 = fieldData2.getFloatshr();
        double[] doubleArray8 = fieldData2.getCogsYr();
        double[] doubleArray9 = fieldData2.getPreTaxIncYr();
        double[] doubleArray10 = fieldData2.getGrossIncQtr();
        double[] doubleArray11 = fieldData2.getTotalOpExpQtr();
        double[] doubleArray12 = fieldData2.getCashFromOps();
        double[] doubleArray13 = fieldData2.getPreTaxIncYr();
        java.lang.String str14 = fieldData2.getSnpIndexStr();
        double[] doubleArray15 = fieldData2.getTotalOpExpQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(doubleArray15);
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00368");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData0.setAdr("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData3 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double4 = estimateFileData3.getEpsQ0();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData5 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int6 = sharesFileData5.getInstShareholders();
        double double7 = sharesFileData5.getPrice();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData8.setFromReport((int) (byte) 0, 0);
        double[] doubleArray12 = sharesFileData8.getSharesQ();
        sharesFileData5.setSharesQ(doubleArray12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData14 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData5);
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList18);
        double[] doubleArray21 = incSheetFileData20.getEpsContYr();
        double[] doubleArray22 = incSheetFileData20.getCogsYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData23 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData23);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData25 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData24);
        double[] doubleArray26 = balSheetFileData25.getLtDebtYr();
        java.lang.String str27 = balSheetFileData25.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData30 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData31 = fieldData30.getCashData();
        double[] doubleArray32 = cashFileData31.getCashFromFinQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData35 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData0, estimateFileData3, sharesFileData14, incSheetFileData20, balSheetFileData25, cashFileData31, (int) '#', 0);
        double[] doubleArray36 = incSheetFileData20.getUnusualIncQtr();
        double[] doubleArray37 = incSheetFileData20.getEpsYr();
        double[] doubleArray38 = incSheetFileData20.getUnusualIncQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum39 = incSheetFileData20.getExchange();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0]");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(incSheetFileData20);
        org.junit.Assert.assertNull(doubleArray21);
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(cashFileData31);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertNull(doubleArray36);
        org.junit.Assert.assertNull(doubleArray37);
        org.junit.Assert.assertNull(doubleArray38);
        org.junit.Assert.assertNull(exchEnum39);
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00369");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        double[] doubleArray4 = sharesFileData0.getSharesY();
        sharesFileData0.setFloatshr("Cash File Data");
        sharesFileData0.setInsiderBuys("out/BigDB/1/Q6/out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!-fundamental-data-1Q6.data/BigDB/");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[0.0]");
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00370");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00371");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData3 = fieldData2.getCashData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData3);
        java.lang.String str5 = cashFileData4.toDbOutput();
        java.lang.String str6 = cashFileData4.toDbOutput();
        org.junit.Assert.assertNotNull(cashFileData3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00372");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData3 = fieldData2.getCashData();
        double[] doubleArray4 = cashFileData3.getCashFromFinQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData3);
        java.lang.Class<?> wildcardClass6 = cashFileData5.getClass();
        org.junit.Assert.assertNotNull(cashFileData3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00373");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray3 = balSheetFileData2.getLtDebtYr();
        double[] doubleArray4 = balSheetFileData2.getOtherCurrAssetsQtr();
        double[] doubleArray5 = balSheetFileData2.getCashYr();
        double[] doubleArray6 = balSheetFileData2.getCashQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00374");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray3 = balSheetFileData1.getCurrLiabYr();
        double[] doubleArray4 = balSheetFileData1.getBvpsYr();
        double[] doubleArray5 = balSheetFileData1.getPrefStockQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00375");
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum1 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.convertExchange("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        org.junit.Assert.assertTrue("'" + exchEnum1 + "' != '" + net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum.NONE + "'", exchEnum1.equals(net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum.NONE));
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00376");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        java.lang.String str9 = cashFileData8.toString();
        double[] doubleArray10 = cashFileData8.getCashFromOpsQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(companyFileData6);
        org.junit.Assert.assertNotNull(estimateFileData7);
        org.junit.Assert.assertNotNull(cashFileData8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cash File Data" + "'", str9, "Cash File Data");
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00377");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double[] doubleArray6 = fieldData2.getDividendYr();
        double[] doubleArray7 = fieldData2.getOtherIncYr();
        double[] doubleArray8 = fieldData2.getCashFromInv();
        double double9 = fieldData2.getMktCap();
        java.lang.String str10 = fieldData2.getZip();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00378");
        java.lang.String[] strArray5 = new java.lang.String[] { "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "", "NONE", "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData10 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        double[] doubleArray11 = incSheetFileData10.getAdjToIncYr();
        double[] doubleArray12 = incSheetFileData10.getTotalOpExpQtr();
        double[] doubleArray13 = incSheetFileData10.getEpsDilContQtr();
        double[] doubleArray14 = incSheetFileData10.getRdYr();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(companyFileData8);
        org.junit.Assert.assertNotNull(companyFileData9);
        org.junit.Assert.assertNotNull(incSheetFileData10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(doubleArray14);
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00379");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData0.setAdr("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        int int3 = companyFileData0.getNumEmployees();
        java.lang.String str4 = companyFileData0.getSnpIndexStr();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00380");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double double7 = fieldData2.getFloatshr();
        double[] doubleArray8 = fieldData2.getCogsYr();
        double[] doubleArray9 = fieldData2.getPreTaxIncYr();
        double[] doubleArray10 = fieldData2.getOtherIncQtr();
        double[] doubleArray11 = fieldData2.getEpsQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00381");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getFromMemory("out/BigDB/", 0, (int) '4');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00382");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.find("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        org.junit.Assert.assertNull(balSheetFileData1);
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00383");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInstShareholders();
        double double2 = sharesFileData0.getInsiderNetPercentOutstanding();
        java.lang.String str3 = sharesFileData0.toDbOutput();
        sharesFileData0.setInstBuyShrs("hi!");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int7 = sharesFileData6.getInstSellShrs();
        sharesFileData6.setInsiderSells("hi!");
        double double10 = sharesFileData6.getInstOwnership();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData11 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int12 = sharesFileData11.getInstShareholders();
        double double13 = sharesFileData11.getPrice();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData14 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData14.setFromReport((int) (byte) 0, 0);
        double[] doubleArray18 = sharesFileData14.getSharesQ();
        sharesFileData11.setSharesQ(doubleArray18);
        sharesFileData6.setSharesQ(doubleArray18);
        sharesFileData0.setSharesQ(doubleArray18);
        sharesFileData0.setBeta("");
        java.lang.String str24 = sharesFileData0.getName();
        long long25 = sharesFileData0.getVolume10d();
        long long26 = sharesFileData0.getVolume10d();
        sharesFileData0.setInsiderOwnership("hi!");
        int int29 = sharesFileData0.getInsiderNetTrades();
        java.lang.Class<?> wildcardClass30 = sharesFileData0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n" + "'", str3, "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0]");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00384");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        double double4 = sharesFileData0.getFloatshr();
        java.lang.String str5 = sharesFileData0.toDbOutput();
        sharesFileData0.setMktCap("Cash File Data");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        int int9 = sharesFileData8.getInstSellShrs();
        sharesFileData8.setInsiderNetPercentOutstanding("out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        int int12 = sharesFileData8.getInsiderNetTrades();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n" + "'", str5, "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00385");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double[] doubleArray7 = fieldData2.getCogsQtr();
        double double8 = fieldData2.getBeta();
        double[] doubleArray9 = fieldData2.getEpsDilContQtr();
        double[] doubleArray10 = fieldData2.getOtherLtAssetsQtr();
        double[] doubleArray11 = fieldData2.getAdjToIncYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00386");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FiletypeEnum filetypeEnum2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getAllFromDb((int) '4', 0, filetypeEnum2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00387");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData0.setAdr("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData3 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double4 = estimateFileData3.getEpsQ0();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData5 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int6 = sharesFileData5.getInstShareholders();
        double double7 = sharesFileData5.getPrice();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData8.setFromReport((int) (byte) 0, 0);
        double[] doubleArray12 = sharesFileData8.getSharesQ();
        sharesFileData5.setSharesQ(doubleArray12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData14 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData5);
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList18);
        double[] doubleArray21 = incSheetFileData20.getEpsContYr();
        double[] doubleArray22 = incSheetFileData20.getCogsYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData23 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData23);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData25 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData24);
        double[] doubleArray26 = balSheetFileData25.getLtDebtYr();
        java.lang.String str27 = balSheetFileData25.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData30 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData31 = fieldData30.getCashData();
        double[] doubleArray32 = cashFileData31.getCashFromFinQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData35 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData0, estimateFileData3, sharesFileData14, incSheetFileData20, balSheetFileData25, cashFileData31, (int) '#', 0);
        double[] doubleArray36 = fieldData35.getPrefStockYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData37 = fieldData35.getCashData();
        java.lang.String str38 = cashFileData37.toDbOutput();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0]");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(incSheetFileData20);
        org.junit.Assert.assertNull(doubleArray21);
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(cashFileData31);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertNull(doubleArray36);
        org.junit.Assert.assertNotNull(cashFileData37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00388");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray7 = balSheetFileData6.getEquityQtr();
        java.lang.String str8 = balSheetFileData6.getName();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNotNull(balSheetFileData6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00389");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getNonrecurringItemsYr();
        double[] doubleArray4 = fieldData2.getIncPrimaryEpsYr();
        double double5 = fieldData2.getEpsY0();
        double[] doubleArray6 = fieldData2.getEpsDilContYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData7 = fieldData2.getIncSheetData();
        double[] doubleArray8 = incSheetFileData7.getEpsQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNotNull(incSheetFileData7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00390");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData0.setSector("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        companyFileData0.setName("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        java.lang.String str5 = companyFileData0.getZip();
        companyFileData0.setState("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  web       : null\r\n");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00391");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInstShareholders();
        double double2 = sharesFileData0.getPrice();
        int int3 = sharesFileData0.getInsiderBuys();
        java.lang.String str4 = sharesFileData0.getTicker();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00392");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        double[] doubleArray7 = incSheetFileData5.getIncTaxYr();
        double[] doubleArray8 = incSheetFileData5.getUnusualIncYr();
        double[] doubleArray9 = incSheetFileData5.getNonrecurringItemsQtr();
        double[] doubleArray10 = incSheetFileData5.getEpsQtr();
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
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00393");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        java.lang.String str7 = incSheetFileData5.getIndustry();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData5);
        double[] doubleArray9 = incSheetFileData5.getCogsQtr();
        double[] doubleArray10 = incSheetFileData5.getNetIncQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00394");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getAdjToIncYr();
        java.lang.String str2 = incSheetFileData0.getIndustry();
        double[] doubleArray3 = incSheetFileData0.getIncAfterTaxQtr();
        double[] doubleArray4 = incSheetFileData0.getIntExpQtr();
        double[] doubleArray5 = incSheetFileData0.getRdQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum6 = incSheetFileData0.getExchange();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(exchEnum6);
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00395");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        double double4 = sharesFileData0.getInsiderOwnership();
        sharesFileData0.setFromReport((int) (byte) -1, (int) (byte) 10);
        sharesFileData0.setInsiderBuys("Cash File Data");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00396");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FiletypeEnum filetypeEnum2 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.setQMemory((int) '4', 0, filetypeEnum2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00397");
        java.lang.String[] strArray5 = new java.lang.String[] { "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "", "NONE", "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData10 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData11 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        double double12 = estimateFileData11.getEpsY1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData13 = null;
        estimateFileData11.setNameFields(companyFileData13);
        double double15 = estimateFileData11.getEpsY0();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(companyFileData8);
        org.junit.Assert.assertNotNull(cashFileData9);
        org.junit.Assert.assertNotNull(incSheetFileData10);
        org.junit.Assert.assertNotNull(estimateFileData11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00398");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        sharesFileData0.setFloatshr("");
        sharesFileData0.setInsiderBuyShrs("out/BigDB/");
        double[] doubleArray8 = sharesFileData0.getSharesY();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getTtm(doubleArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0]");
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00399");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        sharesFileData0.setVolume3m("");
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum6 = sharesFileData0.getExchange();
        java.lang.String str7 = sharesFileData0.getName();
        long long8 = sharesFileData0.getVolumeMonth3m();
        sharesFileData0.setVolume10d("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        java.lang.String str11 = sharesFileData0.getTicker();
        sharesFileData0.setFloatshr("");
        org.junit.Assert.assertNull(exchEnum6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00400");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getNonrecurringItemsYr();
        double[] doubleArray4 = fieldData2.getAdjToIncQtr();
        long long5 = fieldData2.getVolumeMonth3m();
        double[] doubleArray6 = fieldData2.getAdjToIncYr();
        int int7 = fieldData2.getInstSellShrs();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00401");
        java.lang.String str4 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getOutfileName((-1), 1, "", "NONE");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "out/BigDB/-1/Q1/-fundamental-data--1Q1.NONE" + "'", str4, "out/BigDB/-1/Q1/-fundamental-data--1Q1.NONE");
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00402");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getCurrLiabYr();
        double[] doubleArray3 = balSheetFileData1.getAcctRxYr();
        double[] doubleArray4 = balSheetFileData1.getAcctRxYr();
        double[] doubleArray5 = balSheetFileData1.getOtherCurrLiabYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00403");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FiletypeEnum filetypeEnum2 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.parseSipData((int) '4', (int) ' ', filetypeEnum2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00404");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        double[] doubleArray7 = incSheetFileData5.getPreTaxIncQtr();
        double[] doubleArray8 = incSheetFileData5.getNetIncQtr();
        double[] doubleArray9 = incSheetFileData5.getUnusualIncYr();
        double[] doubleArray10 = incSheetFileData5.getNonrecurringItemsYr();
        double[] doubleArray11 = incSheetFileData5.getOtherIncQtr();
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
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00405");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double double7 = fieldData2.getFloatshr();
        double[] doubleArray8 = fieldData2.getCogsYr();
        double[] doubleArray9 = fieldData2.getPreTaxIncYr();
        double[] doubleArray10 = fieldData2.getGrossIncQtr();
        double[] doubleArray11 = fieldData2.getTotalOpExpQtr();
        double[] doubleArray12 = fieldData2.getCashFromOps();
        double[] doubleArray13 = fieldData2.getPreTaxIncYr();
        double[] doubleArray14 = fieldData2.getOtherCurrAssetsQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(doubleArray14);
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00406");
        double[] doubleArray2 = new double[] { (short) 0, 10L };
        // The following exception was thrown during execution in test generation
        try {
            double double3 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getTtm(doubleArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 10.0]");
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00407");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double[] doubleArray7 = fieldData2.getAcctPayableQtr();
        double[] doubleArray8 = fieldData2.getCapEx();
        double[] doubleArray9 = fieldData2.getIncPrimaryEpsYr();
        double[] doubleArray10 = fieldData2.getLtDebtQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00408");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getLtDebtQtr();
        double[] doubleArray6 = fieldData2.getGoodwillYr();
        double double7 = fieldData2.getFloatshr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData8 = fieldData2.getCashData();
        double[] doubleArray9 = cashFileData8.getCashFromFinQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(cashFileData8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00409");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray3 = balSheetFileData2.getLtDebtYr();
        java.lang.String str4 = balSheetFileData2.toDbOutput();
        java.lang.String str5 = balSheetFileData2.getIndustry();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        boolean boolean7 = companyFileData6.isAdr();
        java.lang.String str8 = companyFileData6.getState();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SnpEnum snpEnum9 = companyFileData6.getSnpIndex();
        java.lang.String str10 = companyFileData6.toString();
        companyFileData6.setZip("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        java.lang.String str13 = companyFileData6.getSector();
        companyFileData6.setCountry("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData16 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData6);
        balSheetFileData2.setNameFields(companyFileData16);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(snpEnum9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00410");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInstShareholders();
        double double2 = sharesFileData0.getPrice();
        int int3 = sharesFileData0.getInsiderBuys();
        sharesFileData0.setInsiderBuyShrs("");
        sharesFileData0.setInsiderNetTrades("out/BigDB/1/Q6/out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!-fundamental-data-1Q6.data/BigDB/");
        sharesFileData0.setInsiderBuys("NONE");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00411");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double1 = estimateFileData0.getEpsQ0();
        double double2 = estimateFileData0.getEpsY1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData3 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData0);
        double double4 = estimateFileData3.getEpsQ0();
        double double5 = estimateFileData3.getEpsQ1();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00412");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.find("out/BigDB/10/Q6/  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n-fundamental-data-10Q6.out/BigDB/");
        org.junit.Assert.assertNull(incSheetFileData1);
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00413");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData0.setAdr("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData3 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double4 = estimateFileData3.getEpsQ0();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData5 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int6 = sharesFileData5.getInstShareholders();
        double double7 = sharesFileData5.getPrice();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData8.setFromReport((int) (byte) 0, 0);
        double[] doubleArray12 = sharesFileData8.getSharesQ();
        sharesFileData5.setSharesQ(doubleArray12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData14 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData5);
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList18);
        double[] doubleArray21 = incSheetFileData20.getEpsContYr();
        double[] doubleArray22 = incSheetFileData20.getCogsYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData23 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData23);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData25 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData24);
        double[] doubleArray26 = balSheetFileData25.getLtDebtYr();
        java.lang.String str27 = balSheetFileData25.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData30 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData31 = fieldData30.getCashData();
        double[] doubleArray32 = cashFileData31.getCashFromFinQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData35 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData0, estimateFileData3, sharesFileData14, incSheetFileData20, balSheetFileData25, cashFileData31, (int) '#', 0);
        java.lang.String str36 = estimateFileData3.getIndustry();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum37 = estimateFileData3.getExchange();
        java.lang.String str38 = estimateFileData3.toString();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum39 = estimateFileData3.getExchange();
        java.lang.String str40 = estimateFileData3.getSector();
        double double41 = estimateFileData3.getEpsQ0();
        double double42 = estimateFileData3.getEpsQ1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum43 = estimateFileData3.getExchange();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0]");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(incSheetFileData20);
        org.junit.Assert.assertNull(doubleArray21);
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(cashFileData31);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(exchEnum37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNull(exchEnum39);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertNull(exchEnum43);
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00414");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double double6 = fieldData2.getEpsQ1();
        double double7 = fieldData2.getEpsY2();
        double[] doubleArray8 = fieldData2.getNonrecurringItemsQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00415");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        boolean boolean1 = companyFileData0.isAdr();
        java.lang.String str2 = companyFileData0.getState();
        companyFileData0.setNumEmployees("out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        java.lang.String str6 = companyFileData0.getStreet();
        companyFileData0.setNumEmployees("");
        java.lang.String str9 = companyFileData0.getCountry();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00416");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double[] doubleArray6 = fieldData2.getDividendYr();
        double[] doubleArray7 = fieldData2.getAcctPayableYr();
        double[] doubleArray8 = fieldData2.getLtDebtYr();
        double[] doubleArray9 = fieldData2.getCashFromOps();
        double double10 = fieldData2.getEpsY1();
        double[] doubleArray11 = fieldData2.getPrefStockYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00417");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        double double4 = sharesFileData0.getFloatshr();
        int int5 = sharesFileData0.getInsiderBuyShrs();
        double double6 = sharesFileData0.getFloatshr();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00418");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double double7 = fieldData2.getFloatshr();
        double[] doubleArray8 = fieldData2.getCogsYr();
        double[] doubleArray9 = fieldData2.getPreTaxIncYr();
        double[] doubleArray10 = fieldData2.getRdQtr();
        double[] doubleArray11 = fieldData2.getCurrAssetsQtr();
        double double12 = fieldData2.getPrice();
        int int13 = fieldData2.getInstShareholders();
        double[] doubleArray14 = fieldData2.getOtherCurrAssetsYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(doubleArray14);
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00419");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double double6 = fieldData2.getEpsQ1();
        double[] doubleArray7 = fieldData2.getAcctPayableQtr();
        double[] doubleArray8 = fieldData2.getNonrecurringItemsYr();
        double[] doubleArray9 = fieldData2.getLiabEquityQtr();
        java.lang.String str10 = fieldData2.getName();
        double[] doubleArray11 = fieldData2.getIntExpYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00420");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getCurrLiabYr();
        double[] doubleArray3 = balSheetFileData1.getGoodwillYr();
        double[] doubleArray4 = balSheetFileData1.getEquityYr();
        double[] doubleArray5 = balSheetFileData1.getStInvestYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray7 = balSheetFileData1.getLtInvestYr();
        double[] doubleArray8 = balSheetFileData1.getEquityQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00421");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        sharesFileData0.setVolume10d("out/BigDB/");
        int int6 = sharesFileData0.getInsiderSellShrs();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum7 = sharesFileData0.getExchange();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(exchEnum7);
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00422");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getIncAfterTaxYr();
        int int4 = fieldData2.getYear();
        long long5 = fieldData2.getVolume10d();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00423");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double double7 = fieldData2.getFloatshr();
        double[] doubleArray8 = fieldData2.getCogsYr();
        double[] doubleArray9 = fieldData2.getPreTaxIncYr();
        double[] doubleArray10 = fieldData2.getDepreciationYr();
        double[] doubleArray11 = fieldData2.getAcctRxQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData12 = fieldData2.getEstimateData();
        double double13 = estimateFileData12.getEpsY2();
        java.lang.String str14 = estimateFileData12.getTicker();
        java.lang.String str15 = estimateFileData12.getTicker();
        java.lang.String str16 = estimateFileData12.getIndustry();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNotNull(estimateFileData12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00424");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        sharesFileData0.setVolume3m("");
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum6 = sharesFileData0.getExchange();
        java.lang.String str7 = sharesFileData0.getName();
        int int8 = sharesFileData0.getInstShareholders();
        sharesFileData0.setInsiderNetTrades("hi!");
        int int11 = sharesFileData0.getInsiderSellShrs();
        double[] doubleArray12 = sharesFileData0.getSharesQ();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getTtm(doubleArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(exchEnum6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0]");
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00425");
        java.lang.String[] strArray6 = new java.lang.String[] { "data/BigDB/", "out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "data/BigDB/", "out/BigDB/10/Q6/  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n-fundamental-data-10Q6.out/BigDB/", "out/BigDB/100/Q6/out/BigDB/-fundamental-data-100Q6.hi!", "out/BigDB/10/Q6/  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n-fundamental-data-10Q6.out/BigDB/" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00426");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double[] doubleArray5 = fieldData2.getEpsDilContQtr();
        net.ajaskey.common.DateTime dateTime6 = fieldData2.getLatestQtrEps();
        double[] doubleArray7 = fieldData2.getUnusualIncQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData8 = fieldData2.getCashData();
        double[] doubleArray9 = cashFileData8.getCashFromFinQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(dateTime6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNotNull(cashFileData8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00427");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        java.lang.String str7 = incSheetFileData5.getIndustry();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData5);
        double[] doubleArray9 = incSheetFileData5.getCogsQtr();
        double[] doubleArray10 = incSheetFileData5.getAdjToIncYr();
        java.lang.String str11 = incSheetFileData5.getSector();
        java.lang.String str12 = incSheetFileData5.getSector();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00428");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getCurrLiabYr();
        double[] doubleArray3 = balSheetFileData1.getGoodwillYr();
        java.lang.String str4 = balSheetFileData1.getTicker();
        double[] doubleArray5 = balSheetFileData1.getAcctRxYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00429");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        double[] doubleArray7 = incSheetFileData5.getCogsYr();
        double[] doubleArray8 = incSheetFileData5.getSalesYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum9 = incSheetFileData5.getExchange();
        double[] doubleArray10 = incSheetFileData5.getGrossOpExpQtr();
        double[] doubleArray11 = incSheetFileData5.getIncTaxQtr();
        double[] doubleArray12 = incSheetFileData5.getIncTaxQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(exchEnum9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00430");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInstShareholders();
        double double2 = sharesFileData0.getInsiderNetPercentOutstanding();
        double double3 = sharesFileData0.getDollar3m();
        java.lang.String str4 = sharesFileData0.getTicker();
        sharesFileData0.setInsiderSellShrs("Cash File Data");
        double double7 = sharesFileData0.getDollar3m();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00431");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        double[] doubleArray7 = incSheetFileData5.getCogsYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum8 = incSheetFileData5.getExchange();
        double[] doubleArray9 = incSheetFileData5.getDepreciationQtr();
        double[] doubleArray10 = incSheetFileData5.getIncTaxYr();
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
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00432");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FiletypeEnum filetypeEnum2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getAllFromDb((int) (byte) 10, (int) (byte) 0, filetypeEnum2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00433");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getAllFromMemory((int) (byte) 0, 100);
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00434");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        java.lang.String str1 = companyFileData0.getStreet();
        companyFileData0.setPhone("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        companyFileData0.setCity("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        java.lang.String str6 = companyFileData0.getSic();
        java.lang.String str7 = companyFileData0.getIndustry();
        java.lang.String str8 = companyFileData0.getZip();
        companyFileData0.setTicker("hi!");
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum11 = companyFileData0.getExchange();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(exchEnum11);
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00435");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray3 = balSheetFileData2.getLtDebtYr();
        java.lang.String str4 = balSheetFileData2.toDbOutput();
        java.lang.String str5 = balSheetFileData2.getName();
        double[] doubleArray6 = balSheetFileData2.getAcctRxYr();
        double[] doubleArray7 = balSheetFileData2.getPrefStockYr();
        double[] doubleArray8 = balSheetFileData2.getOtherLtAssetsYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00436");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        double double4 = sharesFileData0.getFloatshr();
        java.lang.String str5 = sharesFileData0.getTicker();
        java.lang.String str6 = sharesFileData0.getIndustry();
        long long7 = sharesFileData0.getVolumeMonth3m();
        sharesFileData0.setInsiderBuys("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00437");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        sharesFileData0.setVolume3m("");
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum6 = sharesFileData0.getExchange();
        java.lang.String str7 = sharesFileData0.getName();
        int int8 = sharesFileData0.getInstShareholders();
        sharesFileData0.setInsiderNetTrades("hi!");
        double double11 = sharesFileData0.getInstOwnership();
        java.lang.String str12 = sharesFileData0.getSector();
        long long13 = sharesFileData0.getVolumeMonth3m();
        org.junit.Assert.assertNull(exchEnum6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00438");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        int int6 = fieldData2.getInsiderSells();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData7 = fieldData2.getBalSheetData();
        double[] doubleArray8 = balSheetFileData7.getAcctRxQtr();
        double[] doubleArray9 = balSheetFileData7.getAcctRxQtr();
        double[] doubleArray10 = balSheetFileData7.getBvpsYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(balSheetFileData7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00439");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FiletypeEnum filetypeEnum2 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.parseSipData(100, 10, filetypeEnum2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00440");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getFromMemory("out/BigDB/1/Q6/out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!-fundamental-data-1Q6.data/BigDB/", (int) (byte) 10, (int) (byte) 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00441");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double double6 = fieldData2.getEpsQ1();
        double[] doubleArray7 = fieldData2.getAcctPayableQtr();
        double[] doubleArray8 = fieldData2.getNonrecurringItemsYr();
        double[] doubleArray9 = fieldData2.getLiabEquityQtr();
        double[] doubleArray10 = fieldData2.getSharesY();
        double[] doubleArray11 = fieldData2.getNonrecurringItemsQtr();
        double[] doubleArray12 = fieldData2.getIncTaxYr();
        double[] doubleArray13 = fieldData2.getAcctPayableQtr();
        double[] doubleArray14 = fieldData2.getStInvestQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0]");
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(doubleArray14);
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00442");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        java.lang.String str4 = fieldData2.getZip();
        double[] doubleArray5 = fieldData2.getIncTaxYr();
        java.lang.String str6 = fieldData2.getSnpIndexStr();
        double double7 = fieldData2.getFloatshr();
        long long8 = fieldData2.getVolumeMonth3m();
        double[] doubleArray9 = fieldData2.getBvpsQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00443");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "data/BigDB/", "NONE" };
        java.lang.String[] strArray5 = new java.lang.String[] { "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(strArray3, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00444");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.find("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  web       : null\r\n");
        org.junit.Assert.assertNull(estimateFileData1);
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00445");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FiletypeEnum filetypeEnum2 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.parseSipData((int) (byte) -1, (int) ' ', filetypeEnum2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00446");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double double7 = fieldData2.getFloatshr();
        double[] doubleArray8 = fieldData2.getCogsYr();
        double[] doubleArray9 = fieldData2.getPreTaxIncYr();
        double[] doubleArray10 = fieldData2.getOtherIncQtr();
        double[] doubleArray11 = fieldData2.getUnusualIncQtr();
        double[] doubleArray12 = fieldData2.getGrossOpExpQtr();
        double double13 = fieldData2.getPrice52lo();
        double[] doubleArray14 = fieldData2.getDividendQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNull(doubleArray14);
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00447");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getGrossOpExpQtr();
        double[] doubleArray4 = fieldData2.getAcctPayableQtr();
        double[] doubleArray5 = fieldData2.getInventoryQtr();
        double[] doubleArray6 = fieldData2.getSalesQtr();
        double[] doubleArray7 = fieldData2.getEpsQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00448");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        java.lang.String str1 = companyFileData0.getStreet();
        companyFileData0.setPhone("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        companyFileData0.setCity("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        java.lang.String str6 = companyFileData0.getSic();
        java.lang.String str7 = companyFileData0.getIndustry();
        java.lang.String str8 = companyFileData0.getZip();
        boolean boolean9 = companyFileData0.isAdr();
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData15 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList13);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData16 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList13);
        java.util.List<java.lang.String> strList17 = companyFileData0.set((java.util.List<java.lang.String>) strList13);
        companyFileData0.setCity("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(incSheetFileData15);
        org.junit.Assert.assertNotNull(sharesFileData16);
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00449");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        java.lang.String str1 = companyFileData0.getStreet();
        companyFileData0.setPhone("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        companyFileData0.setCity("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        java.lang.String str6 = companyFileData0.getSic();
        java.lang.String str7 = companyFileData0.getIndustry();
        java.lang.String str8 = companyFileData0.getZip();
        boolean boolean9 = companyFileData0.isAdr();
        companyFileData0.setName("hi!");
        java.lang.String str12 = companyFileData0.getWeb();
        companyFileData0.setZip("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00450");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double double7 = fieldData2.getFloatshr();
        double[] doubleArray8 = fieldData2.getTotalOpExpQtr();
        long long9 = fieldData2.getVolume10d();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SnpEnum snpEnum10 = fieldData2.getSnpIndex();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(snpEnum10);
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00451");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.setMemory((-1), (int) '4', filetypeEnum2);
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00452");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData0.setSector("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        java.lang.String str3 = companyFileData0.getTicker();
        java.lang.String str4 = companyFileData0.getWeb();
        companyFileData0.setStreet("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  web       : null\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00453");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readSipData("out/BigDB/100/Q6/out/BigDB/-fundamental-data-100Q6.hi!", "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : out/BigDB/0/Q100/-fundamental-data-0Q100.hi!\r\n  web       : null\r\n");
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00454");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double double7 = fieldData2.getFloatshr();
        double[] doubleArray8 = fieldData2.getCogsYr();
        double[] doubleArray9 = fieldData2.getPreTaxIncYr();
        double[] doubleArray10 = fieldData2.getGrossIncQtr();
        double[] doubleArray11 = fieldData2.getEquityQtr();
        double[] doubleArray12 = fieldData2.getLtDebtYr();
        double[] doubleArray13 = fieldData2.getOtherLtAssetsQtr();
        double double14 = fieldData2.getEpsY1();
        double[] doubleArray15 = fieldData2.getLiabEquityYr();
        double[] doubleArray16 = fieldData2.getGoodwillYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray16);
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00455");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        java.lang.String str7 = incSheetFileData5.getIndustry();
        double[] doubleArray8 = incSheetFileData5.getSalesQtr();
        double[] doubleArray9 = incSheetFileData5.getIntExpNonOpYr();
        double[] doubleArray10 = incSheetFileData5.getDepreciationYr();
        java.lang.String str11 = incSheetFileData5.toString();
        double[] doubleArray12 = incSheetFileData5.getGrossIncYr();
        double[] doubleArray13 = incSheetFileData5.getIntExpNonOpQtr();
        double[] doubleArray14 = incSheetFileData5.getGrossOpExpYr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(doubleArray14);
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00456");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getOtherLtLiabQtr();
        double[] doubleArray3 = balSheetFileData1.getNetFixedAssetsQtr();
        double[] doubleArray4 = balSheetFileData1.getAcctPayableYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00457");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double double7 = fieldData2.getFloatshr();
        double[] doubleArray8 = fieldData2.getGoodwillYr();
        java.lang.String str9 = fieldData2.getSnpIndexStr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData10 = fieldData2.getCompanyInfo();
        double[] doubleArray11 = fieldData2.getLtInvestQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(companyFileData10);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00458");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double[] doubleArray5 = fieldData2.getAdjToIncQtr();
        double[] doubleArray6 = fieldData2.getGoodwillYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData7 = fieldData2.getCashData();
        double[] doubleArray8 = fieldData2.getRdQtr();
        double[] doubleArray9 = fieldData2.getPreTaxIncYr();
        double[] doubleArray10 = fieldData2.getEpsYr();
        double[] doubleArray11 = fieldData2.getIntExpQtr();
        double[] doubleArray12 = fieldData2.getCurrLiabYr();
        double double13 = fieldData2.getDollar3m();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNotNull(cashFileData7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00459");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readSipData("out/BigDB/10/Q6/  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n-fundamental-data-10Q6.out/BigDB/", "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00460");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FiletypeEnum filetypeEnum3 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getFromDb("out/BigDB/10/Q6/  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n-fundamental-data-10Q6.out/BigDB/", (int) (short) 100, (int) (short) 10, filetypeEnum3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00461");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getCurrLiabYr();
        double[] doubleArray3 = balSheetFileData1.getOtherLtLiabYr();
        double[] doubleArray4 = balSheetFileData1.getNetFixedAssetsYr();
        java.lang.String str5 = balSheetFileData1.getName();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00462");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData0.setSector("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        companyFileData0.setWeb("out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        java.lang.String str5 = companyFileData0.getZip();
        java.lang.String str6 = companyFileData0.getSic();
        companyFileData0.setSector("out/BigDB/10/Q6/  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n-fundamental-data-10Q6.out/BigDB/");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00463");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray3 = balSheetFileData1.getCurrLiabYr();
        double[] doubleArray4 = balSheetFileData1.getStDebtQtr();
        double[] doubleArray5 = balSheetFileData1.getOtherLtLiabYr();
        double[] doubleArray6 = balSheetFileData1.getOtherCurrAssetsYr();
        java.lang.String str7 = balSheetFileData1.getExchange();
        double[] doubleArray8 = balSheetFileData1.getLiabEquityQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00464");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        java.lang.String str4 = fieldData2.getZip();
        double[] doubleArray5 = fieldData2.getLtInvestQtr();
        double[] doubleArray6 = fieldData2.getInventoryQtr();
        double[] doubleArray7 = fieldData2.getIncTaxQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00465");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData0.setAdr("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData3 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double4 = estimateFileData3.getEpsQ0();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData5 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int6 = sharesFileData5.getInstShareholders();
        double double7 = sharesFileData5.getPrice();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData8.setFromReport((int) (byte) 0, 0);
        double[] doubleArray12 = sharesFileData8.getSharesQ();
        sharesFileData5.setSharesQ(doubleArray12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData14 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData5);
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList18);
        double[] doubleArray21 = incSheetFileData20.getEpsContYr();
        double[] doubleArray22 = incSheetFileData20.getCogsYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData23 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData23);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData25 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData24);
        double[] doubleArray26 = balSheetFileData25.getLtDebtYr();
        java.lang.String str27 = balSheetFileData25.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData30 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData31 = fieldData30.getCashData();
        double[] doubleArray32 = cashFileData31.getCashFromFinQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData35 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData0, estimateFileData3, sharesFileData14, incSheetFileData20, balSheetFileData25, cashFileData31, (int) '#', 0);
        double[] doubleArray36 = fieldData35.getPrefStockYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData37 = fieldData35.getCashData();
        double[] doubleArray38 = fieldData35.getNonrecurringItemsYr();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0]");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(incSheetFileData20);
        org.junit.Assert.assertNull(doubleArray21);
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(cashFileData31);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertNull(doubleArray36);
        org.junit.Assert.assertNotNull(cashFileData37);
        org.junit.Assert.assertNull(doubleArray38);
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00466");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData0);
        net.ajaskey.common.DateTime dateTime2 = estimateFileData1.getLatestQtrEps();
        java.lang.String str3 = estimateFileData1.getTicker();
        java.lang.String str4 = estimateFileData1.toDbOutput();
        org.junit.Assert.assertNull(dateTime2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00467");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData0.setAdr("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData3 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double4 = estimateFileData3.getEpsQ0();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData5 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int6 = sharesFileData5.getInstShareholders();
        double double7 = sharesFileData5.getPrice();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData8.setFromReport((int) (byte) 0, 0);
        double[] doubleArray12 = sharesFileData8.getSharesQ();
        sharesFileData5.setSharesQ(doubleArray12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData14 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData5);
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList18);
        double[] doubleArray21 = incSheetFileData20.getEpsContYr();
        double[] doubleArray22 = incSheetFileData20.getCogsYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData23 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData23);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData25 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData24);
        double[] doubleArray26 = balSheetFileData25.getLtDebtYr();
        java.lang.String str27 = balSheetFileData25.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData30 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData31 = fieldData30.getCashData();
        double[] doubleArray32 = cashFileData31.getCashFromFinQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData35 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData0, estimateFileData3, sharesFileData14, incSheetFileData20, balSheetFileData25, cashFileData31, (int) '#', 0);
        double[] doubleArray36 = incSheetFileData20.getIntExpNonOpYr();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0]");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(incSheetFileData20);
        org.junit.Assert.assertNull(doubleArray21);
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(cashFileData31);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertNull(doubleArray36);
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00468");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.find("out/BigDB/0/Q100/NONE-fundamental-data-0Q100.out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        org.junit.Assert.assertNull(cashFileData1);
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00469");
        java.lang.String[] strArray2 = new java.lang.String[] { "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "out/BigDB/10/Q6/  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n-fundamental-data-10Q6.out/BigDB/" };
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
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00470");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        double[] doubleArray7 = incSheetFileData5.getCogsYr();
        double[] doubleArray8 = incSheetFileData5.getSalesYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum9 = incSheetFileData5.getExchange();
        double[] doubleArray10 = incSheetFileData5.getGrossOpExpQtr();
        double[] doubleArray11 = incSheetFileData5.getPreTaxIncYr();
        double[] doubleArray12 = incSheetFileData5.getGrossOpExpQtr();
        double[] doubleArray13 = incSheetFileData5.getAdjToIncQtr();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(incSheetFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(exchEnum9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00471");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FiletypeEnum filetypeEnum2 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.setQMemory(6, (int) (short) 100, filetypeEnum2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00472");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double[] doubleArray6 = fieldData2.getDividendYr();
        double[] doubleArray7 = fieldData2.getAcctPayableYr();
        double[] doubleArray8 = fieldData2.getIncAfterTaxQtr();
        double[] doubleArray9 = fieldData2.getPreTaxIncYr();
        java.lang.String str10 = fieldData2.getCountry();
        double[] doubleArray11 = fieldData2.getEpsDilYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00473");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double double7 = fieldData2.getFloatshr();
        double[] doubleArray8 = fieldData2.getCogsYr();
        double[] doubleArray9 = fieldData2.getInventoryQtr();
        double[] doubleArray10 = fieldData2.getIntExpNonOpQtr();
        double[] doubleArray11 = fieldData2.getGrossOpExpQtr();
        double[] doubleArray12 = fieldData2.getOtherLtLiabYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum13 = fieldData2.getExchange();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(exchEnum13);
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00474");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readSipData("Cash File Data");
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00475");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double[] doubleArray6 = fieldData2.getDividendYr();
        double[] doubleArray7 = fieldData2.getOtherIncYr();
        double double8 = fieldData2.getInstOwnership();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData9 = fieldData2.getBalSheetData();
        java.lang.String str10 = balSheetFileData9.toString();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(balSheetFileData9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00476");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double double7 = fieldData2.getFloatshr();
        double[] doubleArray8 = fieldData2.getCogsYr();
        double[] doubleArray9 = fieldData2.getPreTaxIncYr();
        double[] doubleArray10 = fieldData2.getDepreciationYr();
        double[] doubleArray11 = fieldData2.getIntExpNonOpQtr();
        double[] doubleArray12 = fieldData2.getCashFromOps();
        java.lang.String str13 = fieldData2.getCountry();
        double[] doubleArray14 = fieldData2.getIncPrimaryEpsQtr();
        double double15 = fieldData2.getEpsQ1();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(doubleArray14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00477");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getNetIncYr();
        double[] doubleArray4 = fieldData2.getOtherCurrAssetsYr();
        java.lang.String str5 = fieldData2.getCountry();
        double[] doubleArray6 = fieldData2.getNonrecurringItemsQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00478");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        java.lang.String str1 = companyFileData0.getStreet();
        companyFileData0.setPhone("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        companyFileData0.setCity("out/BigDB/0/Q100/-fundamental-data-0Q100.hi!");
        java.lang.String str6 = companyFileData0.getSic();
        java.lang.String str7 = companyFileData0.getIndustry();
        java.lang.String str8 = companyFileData0.getZip();
        boolean boolean9 = companyFileData0.isAdr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum10 = companyFileData0.getExchange();
        java.lang.String str11 = companyFileData0.getState();
        companyFileData0.setNumEmployees("out/BigDB/10/Q6/  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n-fundamental-data-10Q6.out/BigDB/");
        companyFileData0.setPhone("out/BigDB/10/Q6/  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n-fundamental-data-10Q6.out/BigDB/");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(exchEnum10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00479");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.find("out/BigDB/100/Q6/out/BigDB/-fundamental-data-100Q6.hi!");
        org.junit.Assert.assertNull(estimateFileData1);
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00480");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double double7 = fieldData2.getFloatshr();
        double[] doubleArray8 = fieldData2.getCogsYr();
        double[] doubleArray9 = fieldData2.getPreTaxIncYr();
        double[] doubleArray10 = fieldData2.getOtherIncQtr();
        java.lang.String str11 = fieldData2.getSnpIndexStr();
        int int12 = fieldData2.getInstBuyShrs();
        double[] doubleArray13 = fieldData2.getSharesY();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getTtm(doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0]");
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00481");
        java.util.List<java.lang.String> strList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readFromDb(strList0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00482");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        sharesFileData0.setVolume3m("");
        double double6 = sharesFileData0.getInsiderNetPercentOutstanding();
        long long7 = sharesFileData0.getVolume10d();
        int int8 = sharesFileData0.getInsiderNetTrades();
        int int9 = sharesFileData0.getInstBuyShrs();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData12 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray13 = fieldData12.getCogsYr();
        int int14 = fieldData12.getNumEmployees();
        double double15 = fieldData12.getPrice52hi();
        double[] doubleArray16 = fieldData12.getStDebtYr();
        double[] doubleArray17 = fieldData12.getIntExpNonOpQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData18 = fieldData12.getCompanyInfo();
        sharesFileData0.setNameFields(companyFileData18);
        double[] doubleArray20 = sharesFileData0.getSharesQ();
        sharesFileData0.setInstSellShrs("NONE");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNull(doubleArray16);
        org.junit.Assert.assertNull(doubleArray17);
        org.junit.Assert.assertNotNull(companyFileData18);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[0.0]");
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00483");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double double7 = fieldData2.getFloatshr();
        double[] doubleArray8 = fieldData2.getCogsYr();
        double[] doubleArray9 = fieldData2.getPreTaxIncYr();
        double[] doubleArray10 = fieldData2.getOtherIncQtr();
        double[] doubleArray11 = fieldData2.getUnusualIncQtr();
        double[] doubleArray12 = fieldData2.getGrossOpExpQtr();
        long long13 = fieldData2.getVolume10d();
        double[] doubleArray14 = fieldData2.getTotalOpExpYr();
        double double15 = fieldData2.getEpsY2();
        double[] doubleArray16 = fieldData2.getTotalOpExpYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNull(doubleArray14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNull(doubleArray16);
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00484");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        java.lang.String str3 = balSheetFileData1.toString();
        double[] doubleArray4 = balSheetFileData1.getCashYr();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(doubleArray4);
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00485");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readSipData("out/BigDB/100/Q6/out/BigDB/-fundamental-data-100Q6.hi!");
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00486");
        java.lang.String[] strArray2 = new java.lang.String[] { "out/BigDB/1/Q6/out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!-fundamental-data-1Q6.data/BigDB/", "hi!" };
        java.lang.String[] strArray4 = new java.lang.String[] { "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData5 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(strArray2, strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00487");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double[] doubleArray7 = fieldData2.getCogsQtr();
        double double8 = fieldData2.getBeta();
        java.lang.String str9 = fieldData2.getTicker();
        double[] doubleArray10 = fieldData2.getEpsContQtr();
        double[] doubleArray11 = fieldData2.getNetFixedAssetsYr();
        double[] doubleArray12 = fieldData2.getNonrecurringItemsQtr();
        double[] doubleArray13 = fieldData2.getIncTaxQtr();
        double[] doubleArray14 = fieldData2.getEpsDilContQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(doubleArray14);
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00488");
        java.lang.String[] strArray1 = new java.lang.String[] { "out/BigDB/10/Q6/  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n-fundamental-data-10Q6.out/BigDB/" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00489");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getEquityYr();
        double double5 = fieldData2.getInsiderNetPercentOutstanding();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum6 = fieldData2.getExchange();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SnpEnum snpEnum7 = fieldData2.getSnpIndex();
        double[] doubleArray8 = fieldData2.getAcctRxYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(exchEnum6);
        org.junit.Assert.assertNull(snpEnum7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00490");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double[] doubleArray6 = fieldData2.getDividendYr();
        double[] doubleArray7 = fieldData2.getAcctPayableYr();
        double[] doubleArray8 = fieldData2.getIncAfterTaxQtr();
        double[] doubleArray9 = fieldData2.getPreTaxIncYr();
        java.lang.String str10 = fieldData2.getCountry();
        double[] doubleArray11 = fieldData2.getIncTaxYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00491");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData0.setAdr("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData3 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double4 = estimateFileData3.getEpsQ0();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData5 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int6 = sharesFileData5.getInstShareholders();
        double double7 = sharesFileData5.getPrice();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData8.setFromReport((int) (byte) 0, 0);
        double[] doubleArray12 = sharesFileData8.getSharesQ();
        sharesFileData5.setSharesQ(doubleArray12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData14 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData5);
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList18);
        double[] doubleArray21 = incSheetFileData20.getEpsContYr();
        double[] doubleArray22 = incSheetFileData20.getCogsYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData23 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData23);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData25 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData24);
        double[] doubleArray26 = balSheetFileData25.getLtDebtYr();
        java.lang.String str27 = balSheetFileData25.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData30 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData31 = fieldData30.getCashData();
        double[] doubleArray32 = cashFileData31.getCashFromFinQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData35 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData0, estimateFileData3, sharesFileData14, incSheetFileData20, balSheetFileData25, cashFileData31, (int) '#', 0);
        double double36 = estimateFileData3.getEpsY1();
        java.lang.String str37 = estimateFileData3.getSector();
        double double38 = estimateFileData3.getEpsQ0();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum39 = estimateFileData3.getExchange();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0]");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(incSheetFileData20);
        org.junit.Assert.assertNull(doubleArray21);
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(cashFileData31);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertNull(exchEnum39);
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00492");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        sharesFileData0.setVolume3m("");
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum6 = sharesFileData0.getExchange();
        java.lang.String str7 = sharesFileData0.getName();
        int int8 = sharesFileData0.getInstShareholders();
        long long9 = sharesFileData0.getVolumeMonth3m();
        sharesFileData0.setDollar3m("data/BigDB/");
        org.junit.Assert.assertNull(exchEnum6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00493");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList3);
        double[] doubleArray6 = incSheetFileData5.getEpsContYr();
        double[] doubleArray7 = incSheetFileData5.getPreTaxIncQtr();
        double[] doubleArray8 = incSheetFileData5.getNetIncQtr();
        double[] doubleArray9 = incSheetFileData5.getUnusualIncYr();
        double[] doubleArray10 = incSheetFileData5.getEpsDilContQtr();
        double[] doubleArray11 = incSheetFileData5.getGrossOpExpQtr();
        java.lang.String str12 = incSheetFileData5.getSector();
        double[] doubleArray13 = incSheetFileData5.getDividendQtr();
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
        org.junit.Assert.assertNull(doubleArray13);
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00494");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getStDebtYr();
        double[] doubleArray7 = fieldData2.getIntExpNonOpQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = fieldData2.getCompanyInfo();
        java.lang.String str9 = companyFileData8.getZip();
        companyFileData8.setWeb("NONE");
        companyFileData8.setZip("Cash File Data");
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNotNull(companyFileData8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00495");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInstShareholders();
        double double2 = sharesFileData0.getDollar3m();
        sharesFileData0.setInsiderBuys("");
        long long5 = sharesFileData0.getVolume10d();
        int int6 = sharesFileData0.getInstBuyShrs();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00496");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getFromMemory("out/BigDB/10/Q6/  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n-fundamental-data-10Q6.out/BigDB/", (int) (byte) 100, (int) (byte) 100);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00497");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        double[] doubleArray4 = fieldData2.getGrossIncQtr();
        double double5 = fieldData2.getEpsY1();
        double double6 = fieldData2.getEpsQ1();
        double[] doubleArray7 = fieldData2.getAcctPayableQtr();
        double[] doubleArray8 = fieldData2.getIntExpYr();
        double[] doubleArray9 = fieldData2.getCogsYr();
        java.lang.String str10 = fieldData2.getSic();
        double[] doubleArray11 = fieldData2.getStInvestQtr();
        java.lang.String str12 = fieldData2.getDowIndexStr();
        double[] doubleArray13 = fieldData2.getStInvestQtr();
        double[] doubleArray14 = fieldData2.getEpsDilContYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(doubleArray14);
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00498");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInstShareholders();
        double double2 = sharesFileData0.getInsiderNetPercentOutstanding();
        java.lang.String str3 = sharesFileData0.toDbOutput();
        sharesFileData0.setInstBuyShrs("hi!");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int7 = sharesFileData6.getInstSellShrs();
        sharesFileData6.setInsiderSells("hi!");
        double double10 = sharesFileData6.getInstOwnership();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData11 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int12 = sharesFileData11.getInstShareholders();
        double double13 = sharesFileData11.getPrice();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData14 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData14.setFromReport((int) (byte) 0, 0);
        double[] doubleArray18 = sharesFileData14.getSharesQ();
        sharesFileData11.setSharesQ(doubleArray18);
        sharesFileData6.setSharesQ(doubleArray18);
        sharesFileData0.setSharesQ(doubleArray18);
        sharesFileData0.setBeta("");
        java.lang.String str24 = sharesFileData0.getName();
        long long25 = sharesFileData0.getVolume10d();
        long long26 = sharesFileData0.getVolume10d();
        sharesFileData0.setInsiderOwnership("hi!");
        int int29 = sharesFileData0.getInsiderNetTrades();
        long long30 = sharesFileData0.getVolume10d();
        java.lang.String str31 = sharesFileData0.getName();
        sharesFileData0.setInsiderNetPercentOutstanding("out/BigDB/");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n" + "'", str3, "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0]");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00499");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) (short) 10, 0);
        double[] doubleArray3 = fieldData2.getCogsYr();
        int int4 = fieldData2.getNumEmployees();
        double double5 = fieldData2.getPrice52hi();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        double double7 = fieldData2.getFloatshr();
        double[] doubleArray8 = fieldData2.getCogsYr();
        double[] doubleArray9 = fieldData2.getPreTaxIncYr();
        double[] doubleArray10 = fieldData2.getOtherIncQtr();
        double[] doubleArray11 = fieldData2.getUnusualIncQtr();
        double double12 = fieldData2.getPrice();
        double[] doubleArray13 = fieldData2.getRdQtr();
        double[] doubleArray14 = fieldData2.getIncTaxQtr();
        double[] doubleArray15 = fieldData2.getCashQtr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(doubleArray14);
        org.junit.Assert.assertNull(doubleArray15);
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00500");
        java.lang.String[] strArray2 = new java.lang.String[] { "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n", "hi!" };
        java.lang.String[] strArray9 = new java.lang.String[] { "out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!", "out/BigDB/100/Q6/out/BigDB/-fundamental-data-100Q6.hi!", "", "out/BigDB/0/Q100/-fundamental-data-0Q100.hi!", "Cash File Data", "out/BigDB/1/Q6/out/BigDB/100/Q100/NONE-fundamental-data-100Q100.hi!-fundamental-data-1Q6.data/BigDB/" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData10 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(strArray2, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray9);
    }
}

