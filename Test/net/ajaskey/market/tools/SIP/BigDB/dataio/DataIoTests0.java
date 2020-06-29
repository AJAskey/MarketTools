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
        java.lang.String str0 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.listToString();
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "" + "'", str0, "");
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00004");
        int int0 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.getListCount();
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00005");
        int int0 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.getListCount();
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00006");
        java.lang.String str0 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.listToString();
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "" + "'", str0, "");
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00007");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readSipData("hi!", "hi!");
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00008");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
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
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00009");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getFromMemory("hi!", (int) (byte) 0, (int) (short) 100);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00010");
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
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00011");
        int int0 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.getListCount();
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00012");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readSipData("hi!");
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00013");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getGrossIncQtr();
        double[] doubleArray3 = incSheetFileData1.getAdjToIncYr();
        double[] doubleArray4 = incSheetFileData1.getAdjToIncQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = null;
        // The following exception was thrown during execution in test generation
        try {
            incSheetFileData1.setNameFields(companyFileData5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00014");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setInsiderNetPercentOutstanding("");
        double[] doubleArray3 = sharesFileData0.getSharesQ();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getTtm(doubleArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0]");
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00015");
        java.lang.String str0 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.listToString();
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "" + "'", str0, "");
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00016");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.clearList();
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00017");
        java.lang.String str0 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.outbasedir;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "out/BigDB/" + "'", str0, "out/BigDB/");
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00018");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData> cashFileDataList0 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.getCashfdList();
        org.junit.Assert.assertNotNull(cashFileDataList0);
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00019");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.clearList();
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00020");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n", "out/BigDB/", "out/BigDB/", "hi!", "hi!" };
        java.lang.String[] strArray10 = new java.lang.String[] { "", "out/BigDB/", "out/BigDB/" };
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
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00021");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getFromMemory("out/BigDB/", (int) (short) 1, 100);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00022");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readSipData("hi!");
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00023");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.find("");
        org.junit.Assert.assertNull(incSheetFileData1);
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00024");
        java.lang.String str0 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.listToString();
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "" + "'", str0, "");
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00025");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n", "hi!", "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n", "", "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n" };
        java.lang.String[] strArray12 = new java.lang.String[] { "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n", "out/BigDB/", "out/BigDB/", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData13 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(strArray6, strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00026");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        java.lang.Class<?> wildcardClass1 = sharesFileData0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00027");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.find("out/BigDB/");
        org.junit.Assert.assertNull(cashFileData1);
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00028");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData> companyFileDataList0 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.getList();
        org.junit.Assert.assertNotNull(companyFileDataList0);
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00029");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.find("");
        org.junit.Assert.assertNull(estimateFileData1);
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00030");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(strArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
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
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readSipData("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00033");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "NONE" };
        java.lang.String[] strArray3 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(strArray2, strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00034");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.clearList();
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00035");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FiletypeEnum filetypeEnum2 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.setQMemory((int) ' ', (int) (short) 1, filetypeEnum2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00036");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "NONE", "out/BigDB/" };
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
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00037");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getQFromMemory((int) 'a', (int) (short) 100);
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00038");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setNumEmployees("hi!");
        java.lang.String str4 = companyFileData1.getState();
        // The following exception was thrown during execution in test generation
        try {
            companyFileData1.setExchange("out/BigDB/");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No enum constant net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum.out/BigDB/");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00039");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getQFromMemory(10, (int) (short) 100);
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00040");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setNumEmployees("hi!");
        java.lang.String str4 = companyFileData1.getPhone();
        java.lang.String str5 = companyFileData1.getIndustry();
        companyFileData1.setNumEmployees("out/BigDB/");
        boolean boolean8 = companyFileData1.isDrp();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00041");
        int int0 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.getListCount();
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00042");
        int int0 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.getListCount();
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00043");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getGrossIncQtr();
        double[] doubleArray3 = incSheetFileData1.getAdjToIncYr();
        double[] doubleArray4 = incSheetFileData1.getAdjToIncQtr();
        double[] doubleArray5 = incSheetFileData1.getOtherIncQtr();
        double[] doubleArray6 = incSheetFileData1.getIncTaxYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00044");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.setMemory((int) ' ', (int) (short) 1, filetypeEnum2);
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00045");
        java.lang.String str0 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.inbasedir;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "data/BigDB/" + "'", str0, "data/BigDB/");
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00046");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.find("data/BigDB/");
        org.junit.Assert.assertNull(cashFileData1);
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00047");
        java.lang.String[] strArray1 = new java.lang.String[] { "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n" };
        java.lang.String[] strArray5 = new java.lang.String[] { "NONE", "", "out/BigDB/" };
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
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00048");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.find("NONE");
        org.junit.Assert.assertNull(balSheetFileData1);
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00049");
        int int0 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.getADR();
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00050");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FiletypeEnum filetypeEnum3 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getFromDb("NONE", (int) (short) 100, (int) (byte) -1, filetypeEnum3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00051");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.clearList();
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00052");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData> companyFileDataList0 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.getCfdList();
        org.junit.Assert.assertNotNull(companyFileDataList0);
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00053");
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
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00054");
        int int0 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.getListCount();
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00055");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readSipData("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n", "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00056");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FiletypeEnum filetypeEnum2 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.setQMemory((int) (byte) 100, (int) 'a', filetypeEnum2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00057");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readSipData("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00058");
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
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00059");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.setMemory(1, (int) (short) 0, filetypeEnum2);
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00060");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.find("hi!");
        org.junit.Assert.assertNull(balSheetFileData1);
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00061");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readSipData("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00062");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FiletypeEnum filetypeEnum2 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.setQMemory((int) (short) -1, (int) (short) 1, filetypeEnum2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00063");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        sharesFileData0.setInsiderBuyShrs("hi!");
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum6 = sharesFileData0.getExchange();
        org.junit.Assert.assertNull(exchEnum6);
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00064");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readSipData("");
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00065");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.find("data/BigDB/");
        org.junit.Assert.assertNull(sharesFileData1);
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00066");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.find("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        org.junit.Assert.assertNull(cashFileData1);
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00067");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.find("NONE");
        org.junit.Assert.assertNull(cashFileData1);
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00068");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        java.lang.String str28 = fieldData27.getStreet();
        double[] doubleArray29 = fieldData27.getTotalOpExpQtr();
        double double30 = fieldData27.getEpsY0();
        int int31 = fieldData27.getInsiderSells();
        java.lang.String str32 = fieldData27.getTicker();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00069");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        java.lang.String str2 = companyFileData1.getIndustry();
        java.lang.String str3 = companyFileData1.getState();
        companyFileData1.setPhone("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        int int6 = companyFileData1.getNumEmployees();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00070");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        java.lang.String str2 = companyFileData1.getIndustry();
        companyFileData1.setIndustry("NONE");
        java.util.List<java.lang.String> strList5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList6 = companyFileData1.set(strList5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00071");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readSipData("");
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00072");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        java.lang.String str28 = fieldData27.getStreet();
        boolean boolean29 = fieldData27.isDrp();
        java.lang.String str30 = fieldData27.getIndustry();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00073");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        java.lang.String str28 = fieldData27.getStreet();
        double[] doubleArray29 = fieldData27.getTotalOpExpQtr();
        double double30 = fieldData27.getEpsY0();
        double[] doubleArray31 = fieldData27.getInventoryQtr();
        double[] doubleArray32 = fieldData27.getLtInvestYr();
        double[] doubleArray33 = fieldData27.getDividendQtr();
        java.lang.String str34 = fieldData27.getStreet();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNull(doubleArray31);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertNull(doubleArray33);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00074");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.find("out/BigDB/");
        org.junit.Assert.assertNull(balSheetFileData1);
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00075");
        java.lang.String[] strArray1 = new java.lang.String[] { "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum5 = estimateFileData4.getExchange();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNull(exchEnum5);
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00076");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readSipData("", "");
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00077");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getOtherLtLiabYr();
        double[] doubleArray3 = balSheetFileData1.getStDebtQtr();
        double[] doubleArray4 = balSheetFileData1.getLtInvestQtr();
        double[] doubleArray5 = balSheetFileData1.getOtherLtAssetsYr();
        double[] doubleArray6 = balSheetFileData1.getCurrLiabQtr();
        double[] doubleArray7 = balSheetFileData1.getStDebtQtr();
        double[] doubleArray8 = balSheetFileData1.getLtInvestYr();
        double[] doubleArray9 = balSheetFileData1.getLtDebtQtr();
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
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00078");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FiletypeEnum filetypeEnum3 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getFromDb("NONE", (int) 'a', 100, filetypeEnum3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00079");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.parseSipData((int) (short) 10, 0, filetypeEnum2);
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00080");
        java.lang.String[] strArray5 = new java.lang.String[] { "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n", "data/BigDB/", "Cash File Data", "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n", "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n" };
        java.lang.String[] strArray10 = new java.lang.String[] { "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n", "data/BigDB/", "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n", "" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData11 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(strArray5, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00081");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FiletypeEnum filetypeEnum2 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.setQMemory((int) (short) -1, 0, filetypeEnum2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00082");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readSipData("data/BigDB/");
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00083");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getGrossIncQtr();
        double[] doubleArray3 = incSheetFileData1.getNetIncYr();
        double[] doubleArray4 = incSheetFileData1.getSalesYr();
        double[] doubleArray5 = incSheetFileData1.getIncAfterTaxYr();
        double[] doubleArray6 = incSheetFileData1.getPreTaxIncYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00084");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        java.lang.String str28 = fieldData27.getStreet();
        double[] doubleArray29 = fieldData27.getOtherLtAssetsYr();
        double double30 = fieldData27.getEpsQ1();
        double[] doubleArray31 = fieldData27.getLtDebtQtr();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNull(doubleArray31);
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00085");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        double[] doubleArray5 = incSheetFileData4.getEpsDilContYr();
        double[] doubleArray6 = incSheetFileData4.getRdQtr();
        double[] doubleArray7 = incSheetFileData4.getEpsDilContQtr();
        java.lang.Class<?> wildcardClass8 = incSheetFileData4.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(incSheetFileData4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00086");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FiletypeEnum filetypeEnum2 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.setQMemory((int) (byte) 0, (int) (short) 1, filetypeEnum2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00087");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getOtherLtLiabYr();
        double[] doubleArray3 = balSheetFileData1.getStDebtQtr();
        double[] doubleArray4 = balSheetFileData1.getLtInvestQtr();
        double[] doubleArray5 = balSheetFileData1.getTotalAssetsYr();
        double[] doubleArray6 = balSheetFileData1.getNetFixedAssetsYr();
        double[] doubleArray7 = balSheetFileData1.getLtInvestQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData8);
        companyFileData9.setNumEmployees("hi!");
        java.lang.String str12 = companyFileData9.getState();
        balSheetFileData1.setNameFields(companyFileData9);
        // The following exception was thrown during execution in test generation
        try {
            companyFileData9.setExchange("Cash File Data");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No enum constant net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum.Cash File Data");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00088");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setInstShareholders("");
        java.lang.String str3 = sharesFileData0.getTicker();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum4 = sharesFileData0.getExchange();
        double double5 = sharesFileData0.getPrice();
        double double6 = sharesFileData0.getInsiderNetPercentOutstanding();
        sharesFileData0.setFromReport((int) (short) -1, (int) (short) 10);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(exchEnum4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00089");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "Cash File Data", "hi!" };
        java.lang.String[] strArray8 = new java.lang.String[] { "out/BigDB/", "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n", "", "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData9 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(strArray3, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00090");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getGrossIncQtr();
        double[] doubleArray3 = incSheetFileData1.getAdjToIncYr();
        double[] doubleArray4 = incSheetFileData1.getGrossOpIncYr();
        java.lang.Class<?> wildcardClass5 = incSheetFileData1.getClass();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00091");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setInstShareholders("");
        sharesFileData0.setVolume3m("");
        sharesFileData0.setDollar3m("");
        long long7 = sharesFileData0.getVolumeMonth3m();
        sharesFileData0.setFloatshr("out/BigDB/");
        sharesFileData0.setInsiderBuyShrs("");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00092");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.find("Cash File Data");
        org.junit.Assert.assertNull(sharesFileData1);
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00093");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.find("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        org.junit.Assert.assertNull(sharesFileData1);
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00094");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.parseSipData((int) (byte) 10, 100, filetypeEnum2);
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00095");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getQFromMemory(10, (int) (byte) 1);
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00096");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getOtherLtLiabYr();
        double[] doubleArray3 = balSheetFileData1.getStDebtQtr();
        double[] doubleArray4 = balSheetFileData1.getInventoryYr();
        java.lang.String str5 = balSheetFileData1.toString();
        double[] doubleArray6 = balSheetFileData1.getNetFixedAssetsYr();
        double[] doubleArray7 = balSheetFileData1.getAcctPayableQtr();
        double[] doubleArray8 = balSheetFileData1.getStInvestQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00097");
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
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00098");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getGrossIncQtr();
        double[] doubleArray3 = incSheetFileData1.getAdjToIncYr();
        double[] doubleArray4 = incSheetFileData1.getUnusualIncYr();
        double[] doubleArray5 = incSheetFileData1.getIncTaxYr();
        double[] doubleArray6 = incSheetFileData1.getUnusualIncQtr();
        double[] doubleArray7 = incSheetFileData1.getIntExpYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00099");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getGrossIncQtr();
        double[] doubleArray3 = incSheetFileData1.getAdjToIncYr();
        double[] doubleArray4 = incSheetFileData1.getEpsYr();
        java.lang.String str5 = incSheetFileData1.getName();
        double[] doubleArray6 = incSheetFileData1.getNetIncQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00100");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        java.lang.String str28 = fieldData27.getStreet();
        double[] doubleArray29 = fieldData27.getTotalOpExpQtr();
        double double30 = fieldData27.getEpsY0();
        double[] doubleArray31 = fieldData27.getInventoryQtr();
        double[] doubleArray32 = fieldData27.getBvpsQtr();
        java.lang.String str33 = fieldData27.getDowIndexStr();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNull(doubleArray31);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00101");
        java.lang.String[] strArray6 = new java.lang.String[] { "NONE", "hi!", "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n", "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n", "", "data/BigDB/" };
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
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00102");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "NONE", "data/BigDB/", "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n" };
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
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00103");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readSipData("data/BigDB/");
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00104");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setInstShareholders("");
        java.lang.String str3 = sharesFileData0.getTicker();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum4 = sharesFileData0.getExchange();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum5 = sharesFileData0.getExchange();
        sharesFileData0.setInsiderNetTrades("hi!");
        double double8 = sharesFileData0.getPrice();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(exchEnum4);
        org.junit.Assert.assertNull(exchEnum5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00105");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        java.lang.String str28 = fieldData27.getStreet();
        double[] doubleArray29 = fieldData27.getGoodwillYr();
        double[] doubleArray30 = fieldData27.getInventoryYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData31 = fieldData27.getCashData();
        double[] doubleArray32 = fieldData27.getUnusualIncYr();
        double[] doubleArray33 = fieldData27.getOtherIncYr();
        double[] doubleArray34 = fieldData27.getIncAfterTaxYr();
        double[] doubleArray35 = fieldData27.getStInvestYr();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertNull(doubleArray30);
        org.junit.Assert.assertNotNull(cashFileData31);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertNull(doubleArray33);
        org.junit.Assert.assertNull(doubleArray34);
        org.junit.Assert.assertNull(doubleArray35);
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00106");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        java.lang.String str28 = fieldData27.getStreet();
        double[] doubleArray29 = fieldData27.getTotalOpExpQtr();
        double double30 = fieldData27.getEpsY0();
        double[] doubleArray31 = fieldData27.getInventoryQtr();
        double[] doubleArray32 = fieldData27.getLtInvestYr();
        double[] doubleArray33 = fieldData27.getPrefStockQtr();
        double[] doubleArray34 = fieldData27.getPreTaxIncYr();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNull(doubleArray31);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertNull(doubleArray33);
        org.junit.Assert.assertNull(doubleArray34);
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00107");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str2 = estimateFileData1.getName();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData3 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        double double4 = sharesFileData3.getInsiderOwnership();
        sharesFileData3.setFromReport((int) '#', (int) (byte) 100);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData8 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData9 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData8);
        double[] doubleArray10 = incSheetFileData9.getGrossIncQtr();
        double[] doubleArray11 = incSheetFileData9.getAdjToIncYr();
        double[] doubleArray12 = incSheetFileData9.getUnusualIncYr();
        double[] doubleArray13 = incSheetFileData9.getIncTaxYr();
        double[] doubleArray14 = incSheetFileData9.getNetIncYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData15 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData15);
        double[] doubleArray17 = balSheetFileData16.getOtherLtLiabYr();
        double[] doubleArray18 = balSheetFileData16.getStDebtQtr();
        double[] doubleArray19 = balSheetFileData16.getLtInvestQtr();
        double[] doubleArray20 = balSheetFileData16.getOtherLtAssetsYr();
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData25 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList23);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData26 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList23);
        java.lang.String str27 = cashFileData26.getTicker();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData28 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData26);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData31 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData0, estimateFileData1, sharesFileData3, incSheetFileData9, balSheetFileData16, cashFileData28, (int) (short) 0, (int) (short) 100);
        double[] doubleArray32 = cashFileData28.getCashFromInvQtr();
        double[] doubleArray33 = cashFileData28.getCashFromInvQtr();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(doubleArray14);
        org.junit.Assert.assertNull(doubleArray17);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(incSheetFileData25);
        org.junit.Assert.assertNotNull(cashFileData26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertNull(doubleArray33);
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00108");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readSipData("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00109");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        double[] doubleArray6 = cashFileData5.getCashFromInvQtr();
        java.lang.String str7 = cashFileData5.toDbOutput();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(incSheetFileData4);
        org.junit.Assert.assertNotNull(cashFileData5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00110");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FiletypeEnum filetypeEnum2 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.setQMemory((int) (byte) 10, (int) (short) 100, filetypeEnum2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00111");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setNumEmployees("hi!");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData1);
        // The following exception was thrown during execution in test generation
        try {
            companyFileData1.setExchange("out/BigDB/");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No enum constant net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum.out/BigDB/");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00112");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        double[] doubleArray5 = incSheetFileData4.getIncTaxYr();
        double[] doubleArray6 = incSheetFileData4.getPreTaxIncQtr();
        double[] doubleArray7 = incSheetFileData4.getDividendYr();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(incSheetFileData4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00113");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        double[] doubleArray5 = incSheetFileData4.getEpsDilContYr();
        java.lang.Class<?> wildcardClass6 = incSheetFileData4.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(incSheetFileData4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00114");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getGrossIncQtr();
        double[] doubleArray3 = incSheetFileData1.getAdjToIncYr();
        double[] doubleArray4 = incSheetFileData1.getAdjToIncQtr();
        double[] doubleArray5 = incSheetFileData1.getEpsYr();
        double[] doubleArray6 = incSheetFileData1.getIncPrimaryEpsQtr();
        double[] doubleArray7 = incSheetFileData1.getAdjToIncQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00115");
        java.lang.String str0 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.listToString();
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "" + "'", str0, "");
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00116");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        double[] doubleArray28 = fieldData27.getEpsContYr();
        double[] doubleArray29 = fieldData27.getPrefStockQtr();
        double[] doubleArray30 = fieldData27.getOtherCurrLiabQtr();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(doubleArray28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertNull(doubleArray30);
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00117");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        java.lang.String str28 = fieldData27.getStreet();
        double[] doubleArray29 = fieldData27.getGoodwillYr();
        double[] doubleArray30 = fieldData27.getInventoryYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData31 = fieldData27.getCashData();
        double[] doubleArray32 = cashFileData31.getCashFromOpsQtr();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertNull(doubleArray30);
        org.junit.Assert.assertNotNull(cashFileData31);
        org.junit.Assert.assertNull(doubleArray32);
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00118");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FiletypeEnum filetypeEnum3 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getFromDb("out/BigDB/", (int) (short) 0, (int) '#', filetypeEnum3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00119");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getGrossIncQtr();
        double[] doubleArray3 = incSheetFileData1.getAdjToIncYr();
        double[] doubleArray4 = incSheetFileData1.getIntExpNonOpQtr();
        double[] doubleArray5 = incSheetFileData1.getTotalOpExpYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum6 = incSheetFileData1.getExchange();
        double[] doubleArray7 = incSheetFileData1.getEpsDilContQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(exchEnum6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00120");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getGrossIncQtr();
        double[] doubleArray3 = incSheetFileData1.getRdQtr();
        double[] doubleArray4 = incSheetFileData1.getAdjToIncYr();
        double[] doubleArray5 = incSheetFileData1.getIncPrimaryEpsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum6 = incSheetFileData1.getExchange();
        double[] doubleArray7 = incSheetFileData1.getGrossOpIncQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(exchEnum6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00121");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.clearList();
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00122");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getGrossIncQtr();
        double[] doubleArray3 = incSheetFileData1.getAdjToIncYr();
        double[] doubleArray4 = incSheetFileData1.getEpsDilContQtr();
        double[] doubleArray5 = incSheetFileData1.getNetIncYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00123");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.find("out/BigDB/");
        org.junit.Assert.assertNull(sharesFileData1);
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00124");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum1 = estimateFileData0.getExchange();
        java.lang.String str2 = estimateFileData0.getName();
        net.ajaskey.common.DateTime dateTime3 = estimateFileData0.getLatestQtrEps();
        net.ajaskey.common.DateTime dateTime4 = estimateFileData0.getLatestQtrEps();
        java.lang.String str5 = estimateFileData0.getName();
        org.junit.Assert.assertNull(exchEnum1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(dateTime3);
        org.junit.Assert.assertNull(dateTime4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00125");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        double double1 = sharesFileData0.getInsiderOwnership();
        sharesFileData0.setInstBuyShrs("hi!");
        double double4 = sharesFileData0.getDollar3m();
        java.lang.String str5 = sharesFileData0.getIndustry();
        sharesFileData0.setVolume3m("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : NONE\r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00126");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getGrossIncQtr();
        double[] doubleArray3 = incSheetFileData1.getAdjToIncYr();
        double[] doubleArray4 = incSheetFileData1.getIncPrimaryEpsQtr();
        double[] doubleArray5 = incSheetFileData1.getRdQtr();
        double[] doubleArray6 = incSheetFileData1.getIncPrimaryEpsYr();
        double[] doubleArray7 = incSheetFileData1.getIncAfterTaxQtr();
        double[] doubleArray8 = incSheetFileData1.getSalesYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00127");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        java.lang.String str2 = companyFileData1.getIndustry();
        companyFileData1.setSnpIndex("");
        java.lang.String str5 = companyFileData1.getName();
        companyFileData1.setExchange("NONE");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00128");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getGrossIncQtr();
        double[] doubleArray3 = incSheetFileData1.getAdjToIncYr();
        double[] doubleArray4 = incSheetFileData1.getIncPrimaryEpsQtr();
        double[] doubleArray5 = incSheetFileData1.getDividendYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00129");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        java.lang.String str28 = fieldData27.getStreet();
        double[] doubleArray29 = fieldData27.getTotalOpExpQtr();
        double double30 = fieldData27.getEpsY0();
        double[] doubleArray31 = fieldData27.getCurrAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData32 = fieldData27.getBalSheetData();
        java.lang.String str33 = balSheetFileData32.getExchange();
        java.lang.String str34 = balSheetFileData32.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNull(doubleArray31);
        org.junit.Assert.assertNotNull(balSheetFileData32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00130");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FiletypeEnum filetypeEnum3 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getFromDb("", 10, 1, filetypeEnum3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00131");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getFromMemory("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n", (int) (short) 10, (int) 'a');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00132");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.setMemory((int) ' ', (int) (short) 100, filetypeEnum2);
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00133");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        java.lang.String str28 = fieldData27.getStreet();
        double[] doubleArray29 = fieldData27.getGoodwillYr();
        double[] doubleArray30 = fieldData27.getInventoryYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData31 = fieldData27.getCashData();
        double double32 = fieldData27.getMktCap();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertNull(doubleArray30);
        org.junit.Assert.assertNotNull(cashFileData31);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00134");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getOtherCurrLiabQtr();
        double[] doubleArray3 = balSheetFileData1.getPrefStockYr();
        double[] doubleArray4 = balSheetFileData1.getEquityQtr();
        java.lang.String str5 = balSheetFileData1.getIndustry();
        double[] doubleArray6 = balSheetFileData1.getAcctPayableQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00135");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getFromMemory("data/BigDB/", (int) '4', (int) (short) 100);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00136");
        java.lang.String str4 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getOutfileName(100, (int) (short) 10, "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n", "Cash File Data");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "out/BigDB/100/Q10/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-100Q10.Cash File Data" + "'", str4, "out/BigDB/100/Q10/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-100Q10.Cash File Data");
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00137");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setInstShareholders("");
        sharesFileData0.setVolume3m("");
        sharesFileData0.setDollar3m("");
        long long7 = sharesFileData0.getVolumeMonth3m();
        sharesFileData0.setFloatshr("out/BigDB/");
        java.lang.String str10 = sharesFileData0.getTicker();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00138");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setInsiderNetPercentOutstanding("");
        double[] doubleArray3 = sharesFileData0.getSharesQ();
        sharesFileData0.setInsiderBuys("");
        double[] doubleArray6 = sharesFileData0.getSharesY();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getTtm(doubleArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0]");
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00139");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.find("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : NONE\r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        org.junit.Assert.assertNull(companyFileData1);
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00140");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        java.lang.String str28 = fieldData27.getStreet();
        double[] doubleArray29 = fieldData27.getTotalOpExpQtr();
        double double30 = fieldData27.getEpsY0();
        double[] doubleArray31 = fieldData27.getInventoryQtr();
        double[] doubleArray32 = fieldData27.getBvpsQtr();
        double[] doubleArray33 = fieldData27.getAdjToIncYr();
        double[] doubleArray34 = fieldData27.getDepreciationYr();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNull(doubleArray31);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertNull(doubleArray33);
        org.junit.Assert.assertNull(doubleArray34);
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00141");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getOtherLtLiabYr();
        double[] doubleArray3 = balSheetFileData1.getStDebtQtr();
        double[] doubleArray4 = balSheetFileData1.getLtInvestQtr();
        double[] doubleArray5 = balSheetFileData1.getCurrLiabQtr();
        double[] doubleArray6 = balSheetFileData1.getStDebtQtr();
        double[] doubleArray7 = balSheetFileData1.getAcctPayableQtr();
        double[] doubleArray8 = balSheetFileData1.getLtDebtYr();
        double[] doubleArray9 = balSheetFileData1.getPrefStockYr();
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
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00142");
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
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00143");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FiletypeEnum filetypeEnum3 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getFromDb("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : NONE\r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n", (int) (short) 100, (int) (byte) 1, filetypeEnum3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00144");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getOtherLtLiabYr();
        double[] doubleArray3 = balSheetFileData1.getStDebtQtr();
        double[] doubleArray4 = balSheetFileData1.getLtInvestQtr();
        double[] doubleArray5 = balSheetFileData1.getLiabEquityYr();
        double[] doubleArray6 = balSheetFileData1.getInventoryQtr();
        double[] doubleArray7 = balSheetFileData1.getTotalLiabQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00145");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.find("");
        org.junit.Assert.assertNull(sharesFileData1);
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00146");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.find("data/BigDB/");
        org.junit.Assert.assertNull(companyFileData1);
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00147");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        java.lang.String str28 = fieldData27.getStreet();
        double[] doubleArray29 = fieldData27.getTotalOpExpQtr();
        double double30 = fieldData27.getEpsY0();
        double[] doubleArray31 = fieldData27.getInventoryQtr();
        double[] doubleArray32 = fieldData27.getBvpsQtr();
        double double33 = fieldData27.getEpsQ1();
        double[] doubleArray34 = fieldData27.getOtherLtLiabYr();
        double[] doubleArray35 = fieldData27.getBvpsYr();
        double[] doubleArray36 = fieldData27.getOtherLtLiabYr();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNull(doubleArray31);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNull(doubleArray34);
        org.junit.Assert.assertNull(doubleArray35);
        org.junit.Assert.assertNull(doubleArray36);
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00148");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FiletypeEnum filetypeEnum2 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.setQMemory((int) '4', (int) (short) 100, filetypeEnum2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00149");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        java.lang.String str28 = fieldData27.getStreet();
        double[] doubleArray29 = fieldData27.getTotalOpExpQtr();
        double[] doubleArray30 = fieldData27.getDepreciationYr();
        java.lang.String str31 = fieldData27.getSector();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData32 = fieldData27.getCompanyInfo();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum33 = companyFileData32.getExchange();
        java.lang.String str34 = companyFileData32.getPhone();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertNull(doubleArray30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(companyFileData32);
        org.junit.Assert.assertNull(exchEnum33);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00150");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getOtherLtLiabYr();
        double[] doubleArray3 = balSheetFileData1.getStDebtQtr();
        double[] doubleArray4 = balSheetFileData1.getLtInvestQtr();
        double[] doubleArray5 = balSheetFileData1.getTotalAssetsYr();
        double[] doubleArray6 = balSheetFileData1.getOtherCurrLiabQtr();
        double[] doubleArray7 = balSheetFileData1.getOtherLtAssetsYr();
        double[] doubleArray8 = balSheetFileData1.getAcctRxQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00151");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.parseSipData((int) (byte) -1, (int) (short) -1, filetypeEnum2);
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00152");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FiletypeEnum filetypeEnum2 = null;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getQFromDb((int) (byte) 10, (int) '4', filetypeEnum2);
        org.junit.Assert.assertNull(fieldDataList3);
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00153");
        java.lang.String[] strArray5 = new java.lang.String[] { "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n", "out/BigDB/", "out/BigDB/", "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : NONE\r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : NONE\r\n  phone     : null\r\n  web       : null\r\n", "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n" };
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "NONE", "", "out/BigDB/100/Q10/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-100Q10.Cash File Data" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData11 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(strArray5, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00154");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.parseSipData((int) '4', (int) (short) -1, filetypeEnum2);
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00155");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        java.lang.String str28 = fieldData27.getStreet();
        double[] doubleArray29 = fieldData27.getTotalOpExpQtr();
        double double30 = fieldData27.getEpsY0();
        fieldData27.setQuarter((int) (byte) 100);
        double[] doubleArray33 = fieldData27.getIncTaxYr();
        double[] doubleArray34 = fieldData27.getCashFromOpsQtr();
        double[] doubleArray35 = fieldData27.getCogsYr();
        double[] doubleArray36 = fieldData27.getCurrAssetsYr();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNull(doubleArray33);
        org.junit.Assert.assertNull(doubleArray34);
        org.junit.Assert.assertNull(doubleArray35);
        org.junit.Assert.assertNull(doubleArray36);
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00156");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        java.lang.String str28 = fieldData27.getStreet();
        double[] doubleArray29 = fieldData27.getGoodwillYr();
        double[] doubleArray30 = fieldData27.getInventoryYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData31 = fieldData27.getCashData();
        double[] doubleArray32 = fieldData27.getAcctRxYr();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertNull(doubleArray30);
        org.junit.Assert.assertNotNull(cashFileData31);
        org.junit.Assert.assertNull(doubleArray32);
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00157");
        java.lang.String str4 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getOutfileName((int) (short) 10, (int) (short) 100, "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n", "NONE");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "out/BigDB/10/Q100/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-10Q100.NONE" + "'", str4, "out/BigDB/10/Q100/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-10Q100.NONE");
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00158");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str2 = estimateFileData1.getName();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData3 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        double double4 = sharesFileData3.getInsiderOwnership();
        sharesFileData3.setFromReport((int) '#', (int) (byte) 100);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData8 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData9 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData8);
        double[] doubleArray10 = incSheetFileData9.getGrossIncQtr();
        double[] doubleArray11 = incSheetFileData9.getAdjToIncYr();
        double[] doubleArray12 = incSheetFileData9.getUnusualIncYr();
        double[] doubleArray13 = incSheetFileData9.getIncTaxYr();
        double[] doubleArray14 = incSheetFileData9.getNetIncYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData15 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData15);
        double[] doubleArray17 = balSheetFileData16.getOtherLtLiabYr();
        double[] doubleArray18 = balSheetFileData16.getStDebtQtr();
        double[] doubleArray19 = balSheetFileData16.getLtInvestQtr();
        double[] doubleArray20 = balSheetFileData16.getOtherLtAssetsYr();
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData25 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList23);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData26 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList23);
        java.lang.String str27 = cashFileData26.getTicker();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData28 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData26);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData31 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData0, estimateFileData1, sharesFileData3, incSheetFileData9, balSheetFileData16, cashFileData28, (int) (short) 0, (int) (short) 100);
        java.lang.String str32 = fieldData31.getTicker();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = fieldData31.getWeb();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(doubleArray14);
        org.junit.Assert.assertNull(doubleArray17);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(incSheetFileData25);
        org.junit.Assert.assertNotNull(cashFileData26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00159");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FiletypeEnum filetypeEnum3 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getFromDb("out/BigDB/10/Q100/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-10Q100.NONE", (int) (short) 100, (int) '#', filetypeEnum3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00160");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.setMemory((int) (short) -1, (int) (short) 0, filetypeEnum2);
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00161");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        java.lang.String str28 = fieldData27.getStreet();
        boolean boolean29 = fieldData27.isDrp();
        double[] doubleArray30 = fieldData27.getCashFromOpsQtr();
        double[] doubleArray31 = fieldData27.getInventoryYr();
        double double32 = fieldData27.getFloatshr();
        int int33 = fieldData27.getInstBuyShrs();
        double[] doubleArray34 = fieldData27.getNonrecurringItemsYr();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(doubleArray30);
        org.junit.Assert.assertNull(doubleArray31);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNull(doubleArray34);
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00162");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getQFromMemory((int) (short) 100, (int) (byte) 0);
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00163");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getOtherLtLiabYr();
        double[] doubleArray3 = balSheetFileData1.getStDebtQtr();
        double[] doubleArray4 = balSheetFileData1.getLtInvestQtr();
        double[] doubleArray5 = balSheetFileData1.getTotalAssetsYr();
        double[] doubleArray6 = balSheetFileData1.getNetFixedAssetsYr();
        double[] doubleArray7 = balSheetFileData1.getLtInvestQtr();
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
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00164");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        java.lang.String str28 = fieldData27.getStreet();
        double[] doubleArray29 = fieldData27.getStDebtQtr();
        double[] doubleArray30 = fieldData27.getEpsDilYr();
        double[] doubleArray31 = fieldData27.getOtherCurrLiabYr();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertNull(doubleArray30);
        org.junit.Assert.assertNull(doubleArray31);
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00165");
        java.lang.String[] strArray3 = new java.lang.String[] { "Cash File Data", "out/BigDB/100/Q10/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-100Q10.Cash File Data", "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : NONE\r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : NONE\r\n  phone     : null\r\n  web       : null\r\n" };
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
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00166");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.parseSipData((int) (short) 10, (int) '#', filetypeEnum2);
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00167");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readSipData("data/BigDB/");
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00168");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FiletypeEnum filetypeEnum3 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getFromDb("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n", 6, (int) (byte) 1, filetypeEnum3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00169");
        java.lang.String[] strArray4 = new java.lang.String[] { "NONE", "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : NONE\r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n", "Cash File Data", "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n" };
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
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00170");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        boolean boolean2 = companyFileData1.isDrp();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum3 = companyFileData1.getExchange();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(exchEnum3);
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00171");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        java.lang.String str28 = fieldData27.getStreet();
        double[] doubleArray29 = fieldData27.getTotalOpExpQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData30 = fieldData27.getCashData();
        double[] doubleArray31 = fieldData27.getOtherLtLiabYr();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertNotNull(cashFileData30);
        org.junit.Assert.assertNull(doubleArray31);
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00172");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        java.lang.String str28 = fieldData27.getStreet();
        boolean boolean29 = fieldData27.isDrp();
        double double30 = fieldData27.getBeta();
        double[] doubleArray31 = fieldData27.getAcctRxQtr();
        double[] doubleArray32 = fieldData27.getBvpsQtr();
        double[] doubleArray33 = fieldData27.getDepreciationYr();
        double double34 = fieldData27.getEpsY1();
        double[] doubleArray35 = fieldData27.getAcctRxYr();
        double double36 = fieldData27.getMktCap();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNull(doubleArray31);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertNull(doubleArray33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertNull(doubleArray35);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00173");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        double[] doubleArray28 = fieldData27.getTotalOpExpYr();
        double[] doubleArray29 = fieldData27.getEpsDilYr();
        java.lang.String str30 = fieldData27.getCity();
        double double31 = fieldData27.getEpsY1();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(doubleArray28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00174");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setInstShareholders("");
        sharesFileData0.setVolume3m("");
        sharesFileData0.setDollar3m("");
        sharesFileData0.setDollar3m("hi!");
        double double9 = sharesFileData0.getPrice();
        double double10 = sharesFileData0.getBeta();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00175");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getOtherLtLiabYr();
        double[] doubleArray3 = balSheetFileData1.getLiabEquityYr();
        double[] doubleArray4 = balSheetFileData1.getOtherCurrAssetsQtr();
        java.lang.String str5 = balSheetFileData1.getTicker();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray7 = balSheetFileData1.getStDebtYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00176");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.find("out/BigDB/100/Q10/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-100Q10.Cash File Data");
        org.junit.Assert.assertNull(balSheetFileData1);
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00177");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getOtherLtLiabYr();
        double[] doubleArray3 = balSheetFileData1.getStDebtQtr();
        double[] doubleArray4 = balSheetFileData1.getLtInvestQtr();
        double[] doubleArray5 = balSheetFileData1.getCurrLiabQtr();
        double[] doubleArray6 = balSheetFileData1.getStDebtQtr();
        double[] doubleArray7 = balSheetFileData1.getAcctPayableQtr();
        java.lang.Class<?> wildcardClass8 = balSheetFileData1.getClass();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00178");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getGrossIncQtr();
        double[] doubleArray3 = incSheetFileData1.getNetIncYr();
        double[] doubleArray4 = incSheetFileData1.getDividendQtr();
        double[] doubleArray5 = incSheetFileData1.getNetIncYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00179");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setInstShareholders("");
        java.lang.String str3 = sharesFileData0.getTicker();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum4 = sharesFileData0.getExchange();
        double double5 = sharesFileData0.getPrice();
        double double6 = sharesFileData0.getInsiderNetPercentOutstanding();
        sharesFileData0.setInstBuyShrs("hi!");
        sharesFileData0.setFloatshr("out/BigDB/100/Q10/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-100Q10.Cash File Data");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(exchEnum4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00180");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        double[] doubleArray5 = incSheetFileData4.getIncTaxYr();
        java.lang.String str6 = incSheetFileData4.getTicker();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(incSheetFileData4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00181");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getOtherLtLiabYr();
        double[] doubleArray3 = balSheetFileData1.getStDebtQtr();
        double[] doubleArray4 = balSheetFileData1.getInventoryYr();
        java.lang.String str5 = balSheetFileData1.toString();
        double[] doubleArray6 = balSheetFileData1.getNetFixedAssetsYr();
        double[] doubleArray7 = balSheetFileData1.getNetFixedAssetsQtr();
        double[] doubleArray8 = balSheetFileData1.getTotalLiabQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00182");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        java.lang.String str28 = fieldData27.getStreet();
        double[] doubleArray29 = fieldData27.getTotalOpExpQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData30 = fieldData27.getCashData();
        double[] doubleArray31 = cashFileData30.getCashFromOpsQtr();
        double[] doubleArray32 = cashFileData30.getCashFromFinQtr();
        double[] doubleArray33 = cashFileData30.getCashFromInvQtr();
        double[] doubleArray34 = cashFileData30.getCashFromOpsQtr();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertNotNull(cashFileData30);
        org.junit.Assert.assertNull(doubleArray31);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertNull(doubleArray33);
        org.junit.Assert.assertNull(doubleArray34);
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00183");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readSipData("", "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : NONE\r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : NONE\r\n  phone     : null\r\n  web       : null\r\n");
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00184");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        java.lang.String str2 = incSheetFileData1.toDbOutput();
        double[] doubleArray3 = incSheetFileData1.getPreTaxIncQtr();
        java.lang.String str4 = incSheetFileData1.getName();
        double[] doubleArray5 = incSheetFileData1.getOtherIncYr();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00185");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        java.lang.String str28 = fieldData27.getStreet();
        double[] doubleArray29 = fieldData27.getTotalOpExpQtr();
        double[] doubleArray30 = fieldData27.getDepreciationYr();
        double[] doubleArray31 = fieldData27.getStDebtYr();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertNull(doubleArray30);
        org.junit.Assert.assertNull(doubleArray31);
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00186");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readSipData("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00187");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readSipData("data/BigDB/", "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : NONE\r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00188");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        java.lang.String str28 = fieldData27.getStreet();
        double[] doubleArray29 = fieldData27.getTotalOpExpQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData30 = fieldData27.getCashData();
        java.lang.String str31 = fieldData27.getIndustry();
        double[] doubleArray32 = fieldData27.getEpsYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData33 = fieldData27.getEstimateData();
        double[] doubleArray34 = fieldData27.getNetIncYr();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertNotNull(cashFileData30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertNotNull(estimateFileData33);
        org.junit.Assert.assertNull(doubleArray34);
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00189");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setInstShareholders("");
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum3 = sharesFileData0.getExchange();
        sharesFileData0.setMktCap("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        double double6 = sharesFileData0.getPrice52hi();
        sharesFileData0.setInsiderNetTrades("out/BigDB/10/Q100/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-10Q100.NONE");
        java.lang.String str9 = sharesFileData0.getTicker();
        org.junit.Assert.assertNull(exchEnum3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00190");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getGrossIncQtr();
        double[] doubleArray3 = incSheetFileData1.getAdjToIncYr();
        double[] doubleArray4 = incSheetFileData1.getUnusualIncYr();
        double[] doubleArray5 = incSheetFileData1.getIncTaxYr();
        double[] doubleArray6 = incSheetFileData1.getNetIncYr();
        double[] doubleArray7 = incSheetFileData1.getEpsYr();
        double[] doubleArray8 = incSheetFileData1.getAdjToIncQtr();
        java.lang.String str9 = incSheetFileData1.getIndustry();
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
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00191");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getGrossIncQtr();
        double[] doubleArray3 = incSheetFileData1.getAdjToIncYr();
        double[] doubleArray4 = incSheetFileData1.getAdjToIncQtr();
        double[] doubleArray5 = incSheetFileData1.getOtherIncQtr();
        double[] doubleArray6 = incSheetFileData1.getPreTaxIncYr();
        double[] doubleArray7 = incSheetFileData1.getIncAfterTaxQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00192");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getOtherLtLiabYr();
        double[] doubleArray3 = balSheetFileData1.getStDebtQtr();
        double[] doubleArray4 = balSheetFileData1.getInventoryYr();
        double[] doubleArray5 = balSheetFileData1.getCurrAssetsYr();
        double[] doubleArray6 = balSheetFileData1.getInventoryQtr();
        double[] doubleArray7 = balSheetFileData1.getBvpsYr();
        double[] doubleArray8 = balSheetFileData1.getTotalLiabYr();
        java.lang.String str9 = balSheetFileData1.getTicker();
        java.lang.String str10 = balSheetFileData1.getExchange();
        double[] doubleArray11 = balSheetFileData1.getInventoryYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00193");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        java.lang.String str28 = fieldData27.getStreet();
        double[] doubleArray29 = fieldData27.getTotalOpExpQtr();
        double[] doubleArray30 = fieldData27.getStDebtYr();
        double[] doubleArray31 = fieldData27.getSharesQ();
        java.lang.String str32 = fieldData27.getSector();
        double[] doubleArray33 = fieldData27.getCashQtr();
        double[] doubleArray34 = fieldData27.getSalesQtr();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertNull(doubleArray30);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0]");
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(doubleArray33);
        org.junit.Assert.assertNull(doubleArray34);
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00194");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setNumEmployees("hi!");
        companyFileData1.setZip("NONE");
        companyFileData1.setSnpIndex("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        boolean boolean8 = companyFileData1.isAdr();
        companyFileData1.setIndustry("out/BigDB/100/Q10/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-100Q10.Cash File Data");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00195");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setInstShareholders("");
        sharesFileData0.setVolume3m("");
        sharesFileData0.setDollar3m("");
        sharesFileData0.setDollar3m("hi!");
        double double9 = sharesFileData0.getPrice();
        double double10 = sharesFileData0.getInstOwnership();
        sharesFileData0.setPrice("data/BigDB/");
        int int13 = sharesFileData0.getInsiderBuys();
        sharesFileData0.setInsiderOwnership("data/BigDB/");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00196");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setNumEmployees("hi!");
        companyFileData1.setZip("NONE");
        companyFileData1.setSnpIndex("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        companyFileData1.setTicker("");
        net.ajaskey.market.tools.SIP.BigDB.dataio.DowEnum dowEnum10 = companyFileData1.getDowIndex();
        org.junit.Assert.assertNull(dowEnum10);
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00197");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.parseSipData((int) (short) 10, (int) '4', filetypeEnum2);
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00198");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        java.lang.String str28 = fieldData27.getStreet();
        double[] doubleArray29 = fieldData27.getTotalOpExpQtr();
        double double30 = fieldData27.getEpsY0();
        double[] doubleArray31 = fieldData27.getInventoryQtr();
        double[] doubleArray32 = fieldData27.getBvpsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData33 = fieldData27.getCashData();
        double[] doubleArray34 = fieldData27.getCapExQtr();
        double[] doubleArray35 = fieldData27.getLtInvestQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SnpEnum snpEnum36 = fieldData27.getSnpIndex();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNull(doubleArray31);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertNotNull(cashFileData33);
        org.junit.Assert.assertNull(doubleArray34);
        org.junit.Assert.assertNull(doubleArray35);
        org.junit.Assert.assertNull(snpEnum36);
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00199");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        java.lang.String str28 = fieldData27.getStreet();
        double[] doubleArray29 = fieldData27.getOtherLtAssetsQtr();
        double[] doubleArray30 = fieldData27.getTotalOpExpYr();
        double double31 = fieldData27.getEpsY0();
        double[] doubleArray32 = fieldData27.getOtherCurrLiabQtr();
        double[] doubleArray33 = fieldData27.getAdjToIncQtr();
        java.lang.String str34 = fieldData27.getSnpIndexStr();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertNull(doubleArray30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertNull(doubleArray33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00200");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getOtherLtLiabYr();
        double[] doubleArray3 = balSheetFileData1.getStDebtQtr();
        double[] doubleArray4 = balSheetFileData1.getLtInvestQtr();
        double[] doubleArray5 = balSheetFileData1.getOtherLtAssetsYr();
        double[] doubleArray6 = balSheetFileData1.getCurrLiabQtr();
        double[] doubleArray7 = balSheetFileData1.getStDebtQtr();
        double[] doubleArray8 = balSheetFileData1.getNetFixedAssetsQtr();
        double[] doubleArray9 = balSheetFileData1.getNetFixedAssetsYr();
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
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00201");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.parseSipData(100, (int) (short) 10, filetypeEnum2);
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00202");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setInsiderNetPercentOutstanding("");
        double[] doubleArray3 = sharesFileData0.getSharesQ();
        sharesFileData0.setInsiderBuys("");
        double double6 = sharesFileData0.getPrice52lo();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00203");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        java.lang.String str28 = fieldData27.getStreet();
        double[] doubleArray29 = fieldData27.getStDebtQtr();
        double[] doubleArray30 = fieldData27.getLtDebtYr();
        double[] doubleArray31 = fieldData27.getOtherCurrAssetsYr();
        java.lang.Class<?> wildcardClass32 = fieldData27.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertNull(doubleArray30);
        org.junit.Assert.assertNull(doubleArray31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00204");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readSipData("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00205");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.find("out/BigDB/100/Q10/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-100Q10.Cash File Data");
        org.junit.Assert.assertNull(companyFileData1);
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00206");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        java.lang.String str2 = companyFileData1.getIndustry();
        java.lang.String str3 = companyFileData1.getState();
        companyFileData1.setWeb("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        java.util.List<java.lang.String> strList6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList7 = companyFileData1.set(strList6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00207");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setInstShareholders("");
        sharesFileData0.setVolume3m("");
        sharesFileData0.setDollar3m("");
        int int7 = sharesFileData0.getInsiderBuyShrs();
        sharesFileData0.setVolume10d("hi!");
        java.lang.String str10 = sharesFileData0.getName();
        double double11 = sharesFileData0.getPrice52hi();
        java.lang.String str12 = sharesFileData0.toString();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00208");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        double[] doubleArray28 = fieldData27.getEpsContYr();
        double[] doubleArray29 = fieldData27.getGrossIncQtr();
        boolean boolean30 = fieldData27.isAdr();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(doubleArray28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00209");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        java.lang.String str2 = incSheetFileData1.toDbOutput();
        double[] doubleArray3 = incSheetFileData1.getNonrecurringItemsYr();
        double[] doubleArray4 = incSheetFileData1.getUnusualIncQtr();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00210");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getOtherLtLiabYr();
        double[] doubleArray3 = balSheetFileData1.getStDebtQtr();
        double[] doubleArray4 = balSheetFileData1.getLtInvestQtr();
        double[] doubleArray5 = balSheetFileData1.getTotalAssetsYr();
        double[] doubleArray6 = balSheetFileData1.getNetFixedAssetsYr();
        double[] doubleArray7 = balSheetFileData1.getLtInvestQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData8);
        companyFileData9.setNumEmployees("hi!");
        java.lang.String str12 = companyFileData9.getState();
        balSheetFileData1.setNameFields(companyFileData9);
        java.lang.String str14 = companyFileData9.getTicker();
        java.lang.String str15 = companyFileData9.getTicker();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00211");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "out/BigDB/", "", "data/BigDB/", "out/BigDB/10/Q100/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-10Q100.NONE", "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n" };
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
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00212");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        double[] doubleArray28 = incSheetFileData14.getAdjToIncYr();
        double[] doubleArray29 = incSheetFileData14.getIncTaxYr();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(doubleArray28);
        org.junit.Assert.assertNull(doubleArray29);
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00213");
        java.lang.String[] strArray5 = new java.lang.String[] { "out/BigDB/", "Cash File Data", "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n", "out/BigDB/", "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n" };
        java.lang.String[] strArray11 = new java.lang.String[] { "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : NONE\r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : NONE\r\n  phone     : null\r\n  web       : null\r\n", "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : NONE\r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n", "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n", "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n", "NONE" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData12 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(strArray5, strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00214");
        java.lang.String[] strArray5 = new java.lang.String[] { "out/BigDB/10/Q100/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-10Q100.NONE", "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n", "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n", "out/BigDB/100/Q10/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-100Q10.Cash File Data", "data/BigDB/" };
        java.lang.String[] strArray11 = new java.lang.String[] { "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : NONE\r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : NONE\r\n  phone     : null\r\n  web       : null\r\n", "Cash File Data", "Cash File Data", "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData12 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(strArray5, strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00215");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        double[] doubleArray5 = incSheetFileData4.getIncTaxYr();
        double[] doubleArray6 = incSheetFileData4.getIntExpNonOpYr();
        double[] doubleArray7 = incSheetFileData4.getSalesQtr();
        double[] doubleArray8 = incSheetFileData4.getEpsDilContQtr();
        java.lang.String str9 = incSheetFileData4.toString();
        double[] doubleArray10 = incSheetFileData4.getEpsQtr();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(incSheetFileData4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00216");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.find("Cash File Data");
        org.junit.Assert.assertNull(incSheetFileData1);
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00217");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setNumEmployees("hi!");
        java.lang.String str4 = companyFileData1.getPhone();
        java.lang.String str5 = companyFileData1.getIndustry();
        java.lang.String str6 = companyFileData1.getDowIndexStr();
        companyFileData1.setStreet("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00218");
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum1 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.convertExchange("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        org.junit.Assert.assertTrue("'" + exchEnum1 + "' != '" + net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum.NONE + "'", exchEnum1.equals(net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum.NONE));
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00219");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        java.lang.String str28 = fieldData27.getStreet();
        double[] doubleArray29 = fieldData27.getStDebtQtr();
        double[] doubleArray30 = fieldData27.getEpsContQtr();
        double[] doubleArray31 = fieldData27.getOtherLtAssetsYr();
        double[] doubleArray32 = fieldData27.getNetIncYr();
        java.lang.String str33 = fieldData27.getCountry();
        double[] doubleArray34 = fieldData27.getEpsYr();
        double[] doubleArray35 = fieldData27.getGrossOpIncYr();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertNull(doubleArray30);
        org.junit.Assert.assertNull(doubleArray31);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(doubleArray34);
        org.junit.Assert.assertNull(doubleArray35);
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00220");
        java.lang.String[] strArray1 = new java.lang.String[] { "Cash File Data" };
        java.lang.String[] strArray8 = new java.lang.String[] { "out/BigDB/100/Q10/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-100Q10.Cash File Data", "data/BigDB/", "data/BigDB/", "NONE", "out/BigDB/", "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : NONE\r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData9 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(strArray1, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00221");
        java.lang.String[] strArray1 = new java.lang.String[] { "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : NONE\r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n" };
        java.lang.String[] strArray3 = new java.lang.String[] { "data/BigDB/" };
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
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00222");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        java.lang.String str28 = fieldData27.getStreet();
        double[] doubleArray29 = fieldData27.getStDebtQtr();
        double[] doubleArray30 = fieldData27.getEpsContQtr();
        double[] doubleArray31 = fieldData27.getCashFromOpsQtr();
        double[] doubleArray32 = fieldData27.getEpsContYr();
        double[] doubleArray33 = fieldData27.getOtherIncYr();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertNull(doubleArray30);
        org.junit.Assert.assertNull(doubleArray31);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertNull(doubleArray33);
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00223");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        sharesFileData0.setInsiderBuyShrs("hi!");
        int int6 = sharesFileData0.getInsiderBuys();
        double[] doubleArray7 = sharesFileData0.getSharesQ();
        sharesFileData0.setInstSellShrs("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        sharesFileData0.setInstBuyShrs("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : NONE\r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : NONE\r\n  phone     : null\r\n  web       : null\r\n");
        java.lang.String str12 = sharesFileData0.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00224");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        java.lang.String str28 = fieldData27.getStreet();
        boolean boolean29 = fieldData27.isDrp();
        double double30 = fieldData27.getBeta();
        double[] doubleArray31 = fieldData27.getAcctRxQtr();
        double[] doubleArray32 = fieldData27.getBvpsQtr();
        double[] doubleArray33 = fieldData27.getRdYr();
        double double34 = fieldData27.getBeta();
        double[] doubleArray35 = fieldData27.getOtherLtLiabYr();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNull(doubleArray31);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertNull(doubleArray33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertNull(doubleArray35);
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00225");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str2 = estimateFileData1.getName();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData3 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        double double4 = sharesFileData3.getInsiderOwnership();
        sharesFileData3.setFromReport((int) '#', (int) (byte) 100);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData8 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData9 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData8);
        double[] doubleArray10 = incSheetFileData9.getGrossIncQtr();
        double[] doubleArray11 = incSheetFileData9.getAdjToIncYr();
        double[] doubleArray12 = incSheetFileData9.getUnusualIncYr();
        double[] doubleArray13 = incSheetFileData9.getIncTaxYr();
        double[] doubleArray14 = incSheetFileData9.getNetIncYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData15 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData15);
        double[] doubleArray17 = balSheetFileData16.getOtherLtLiabYr();
        double[] doubleArray18 = balSheetFileData16.getStDebtQtr();
        double[] doubleArray19 = balSheetFileData16.getLtInvestQtr();
        double[] doubleArray20 = balSheetFileData16.getOtherLtAssetsYr();
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData25 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList23);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData26 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList23);
        java.lang.String str27 = cashFileData26.getTicker();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData28 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData26);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData31 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData0, estimateFileData1, sharesFileData3, incSheetFileData9, balSheetFileData16, cashFileData28, (int) (short) 0, (int) (short) 100);
        double[] doubleArray32 = incSheetFileData9.getGrossOpIncQtr();
        double[] doubleArray33 = incSheetFileData9.getNetIncQtr();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(doubleArray14);
        org.junit.Assert.assertNull(doubleArray17);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(incSheetFileData25);
        org.junit.Assert.assertNotNull(cashFileData26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertNull(doubleArray33);
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00226");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        java.lang.String str28 = fieldData27.getStreet();
        double[] doubleArray29 = fieldData27.getTotalOpExpQtr();
        double double30 = fieldData27.getEpsY0();
        java.lang.String str31 = fieldData27.getSic();
        double[] doubleArray32 = fieldData27.getAcctRxQtr();
        double[] doubleArray33 = fieldData27.getOtherCurrAssetsQtr();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertNull(doubleArray33);
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00227");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setInstShareholders("");
        sharesFileData0.setVolume3m("");
        sharesFileData0.setDollar3m("");
        sharesFileData0.setDollar3m("hi!");
        double double9 = sharesFileData0.getPrice();
        double double10 = sharesFileData0.getInstOwnership();
        sharesFileData0.setPrice("data/BigDB/");
        int int13 = sharesFileData0.getInsiderBuys();
        double double14 = sharesFileData0.getBeta();
        sharesFileData0.setVolume10d("out/BigDB/100/Q10/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-100Q10.Cash File Data");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00228");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.find("hi!");
        org.junit.Assert.assertNull(estimateFileData1);
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00229");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setInstShareholders("");
        sharesFileData0.setVolume3m("");
        sharesFileData0.setDollar3m("");
        int int7 = sharesFileData0.getInsiderBuyShrs();
        sharesFileData0.setVolume10d("hi!");
        java.lang.String str10 = sharesFileData0.getName();
        double double11 = sharesFileData0.getPrice52hi();
        double[] doubleArray12 = sharesFileData0.getSharesQ();
        sharesFileData0.setVolume10d("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : NONE\r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : NONE\r\n  phone     : null\r\n  web       : null\r\n");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0]");
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00230");
        java.lang.String[] strArray6 = new java.lang.String[] { "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n", "Cash File Data", "out/BigDB/", "NONE", "", "out/BigDB/" };
        java.lang.String[] strArray9 = new java.lang.String[] { "Cash File Data", "out/BigDB/100/Q10/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-100Q10.Cash File Data" };
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
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00231");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.setMemory((-1), (int) (short) -1, filetypeEnum2);
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00232");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "out/BigDB/", "NONE", "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n", "NONE", "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n", "Cash File Data" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData10 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList8);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData11 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList8);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData12 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList8);
        double double13 = sharesFileData12.getInsiderNetPercentOutstanding();
        int int14 = sharesFileData12.getInsiderSellShrs();
        int int15 = sharesFileData12.getInstBuyShrs();
        java.lang.String str16 = sharesFileData12.getIndustry();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(cashFileData10);
        org.junit.Assert.assertNotNull(sharesFileData11);
        org.junit.Assert.assertNotNull(sharesFileData12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00233");
        java.lang.String[] strArray4 = new java.lang.String[] { "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n", "data/BigDB/", "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n", "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n" };
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
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00234");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getOtherLtLiabYr();
        double[] doubleArray3 = balSheetFileData1.getStDebtQtr();
        double[] doubleArray4 = balSheetFileData1.getInventoryYr();
        java.lang.String str5 = balSheetFileData1.toString();
        double[] doubleArray6 = balSheetFileData1.getTotalAssetsQtr();
        double[] doubleArray7 = balSheetFileData1.getStDebtQtr();
        double[] doubleArray8 = balSheetFileData1.getLiabEquityYr();
        double[] doubleArray9 = balSheetFileData1.getPrefStockQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00235");
        java.lang.String[] strArray5 = new java.lang.String[] { "out/BigDB/100/Q10/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-100Q10.Cash File Data", "data/BigDB/", "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n", "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n", "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : NONE\r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : NONE\r\n  phone     : null\r\n  web       : null\r\n" };
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
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00236");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum1 = estimateFileData0.getExchange();
        java.lang.String str2 = estimateFileData0.getIndustry();
        net.ajaskey.common.DateTime dateTime3 = estimateFileData0.getCurrFiscalYear();
        java.lang.String str4 = estimateFileData0.getIndustry();
        java.lang.String str5 = estimateFileData0.toDbOutput();
        double double6 = estimateFileData0.getEpsQ1();
        org.junit.Assert.assertNull(exchEnum1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(dateTime3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00237");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        double[] doubleArray28 = fieldData27.getTotalOpExpYr();
        double[] doubleArray29 = fieldData27.getEpsDilYr();
        double[] doubleArray30 = fieldData27.getLtInvestQtr();
        double[] doubleArray31 = fieldData27.getCurrLiabQtr();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(doubleArray28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertNull(doubleArray30);
        org.junit.Assert.assertNull(doubleArray31);
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00238");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readSipData("Cash File Data");
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00239");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        double[] doubleArray28 = fieldData27.getIncTaxQtr();
        int int29 = fieldData27.getInsiderBuyShrs();
        double[] doubleArray30 = fieldData27.getCurrAssetsQtr();
        double[] doubleArray31 = fieldData27.getOtherCurrLiabYr();
        net.ajaskey.common.DateTime dateTime32 = fieldData27.getLatestQtrEps();
        double[] doubleArray33 = fieldData27.getOtherIncQtr();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(doubleArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(doubleArray30);
        org.junit.Assert.assertNull(doubleArray31);
        org.junit.Assert.assertNull(dateTime32);
        org.junit.Assert.assertNull(doubleArray33);
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00240");
        java.lang.String[] strArray2 = new java.lang.String[] { "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n", "data/BigDB/" };
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
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00241");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getOtherLtLiabYr();
        double[] doubleArray3 = balSheetFileData1.getStDebtQtr();
        double[] doubleArray4 = balSheetFileData1.getInventoryYr();
        java.lang.String str5 = balSheetFileData1.toString();
        double[] doubleArray6 = balSheetFileData1.getNetFixedAssetsYr();
        double[] doubleArray7 = balSheetFileData1.getAcctPayableYr();
        double[] doubleArray8 = balSheetFileData1.getCashQtr();
        double[] doubleArray9 = balSheetFileData1.getPrefStockYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00242");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        double[] doubleArray5 = incSheetFileData4.getPreTaxIncYr();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(incSheetFileData4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00243");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setInsiderNetPercentOutstanding("");
        double[] doubleArray3 = sharesFileData0.getSharesQ();
        int int4 = sharesFileData0.getInsiderBuys();
        sharesFileData0.setFromReport((int) (byte) 0, (int) (byte) 10);
        int int8 = sharesFileData0.getInstBuyShrs();
        sharesFileData0.setInstSellShrs("NONE");
        java.lang.String str11 = sharesFileData0.getSector();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00244");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        java.lang.String str2 = companyFileData1.getIndustry();
        java.lang.String str3 = companyFileData1.getState();
        companyFileData1.setWeb("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        net.ajaskey.market.tools.SIP.BigDB.dataio.DowEnum dowEnum6 = companyFileData1.getDowIndex();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(dowEnum6);
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00245");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getOtherLtLiabYr();
        double[] doubleArray3 = balSheetFileData1.getStDebtQtr();
        double[] doubleArray4 = balSheetFileData1.getInventoryYr();
        double[] doubleArray5 = balSheetFileData1.getCurrAssetsYr();
        double[] doubleArray6 = balSheetFileData1.getGoodwillYr();
        java.lang.String str7 = balSheetFileData1.getExchange();
        double[] doubleArray8 = balSheetFileData1.getLtInvestQtr();
        double[] doubleArray9 = balSheetFileData1.getCurrLiabYr();
        double[] doubleArray10 = balSheetFileData1.getLtDebtYr();
        double[] doubleArray11 = balSheetFileData1.getTotalLiabYr();
        double[] doubleArray12 = balSheetFileData1.getNetFixedAssetsYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00246");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setInstShareholders("");
        sharesFileData0.setVolume3m("");
        sharesFileData0.setDollar3m("");
        sharesFileData0.setInstShareholders("hi!");
        java.lang.String str9 = sharesFileData0.getSector();
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00247");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str1 = estimateFileData0.getName();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum2 = estimateFileData0.getExchange();
        net.ajaskey.common.DateTime dateTime3 = estimateFileData0.getCurrFiscalYear();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData0);
        double double5 = estimateFileData0.getEpsY1();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(exchEnum2);
        org.junit.Assert.assertNull(dateTime3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00248");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        double double1 = sharesFileData0.getInsiderOwnership();
        sharesFileData0.setFromReport((int) '#', (int) (byte) 100);
        sharesFileData0.setInstShareholders("out/BigDB/10/Q100/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-10Q100.NONE");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00249");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.find("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : NONE\r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        org.junit.Assert.assertNull(cashFileData1);
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00250");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.parseSipData((int) (byte) 0, 6, filetypeEnum2);
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00251");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getGrossIncQtr();
        double[] doubleArray3 = incSheetFileData1.getNetIncYr();
        double[] doubleArray4 = incSheetFileData1.getSalesYr();
        double[] doubleArray5 = incSheetFileData1.getIncAfterTaxYr();
        java.lang.String str6 = incSheetFileData1.getName();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00252");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.find("data/BigDB/");
        org.junit.Assert.assertNull(estimateFileData1);
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00253");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getGrossIncYr();
        double[] doubleArray3 = incSheetFileData1.getEpsYr();
        java.lang.String str4 = incSheetFileData1.getIndustry();
        double[] doubleArray5 = incSheetFileData1.getIncPrimaryEpsQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00254");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        java.lang.String str2 = companyFileData1.getIndustry();
        companyFileData1.setSnpIndex("");
        companyFileData1.setPhone("hi!");
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum7 = companyFileData1.getExchange();
        companyFileData1.setDrp("Cash File Data");
        java.lang.Class<?> wildcardClass10 = companyFileData1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(exchEnum7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00255");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str2 = estimateFileData1.getName();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData3 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        double double4 = sharesFileData3.getInsiderOwnership();
        sharesFileData3.setFromReport((int) '#', (int) (byte) 100);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData8 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData9 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData8);
        double[] doubleArray10 = incSheetFileData9.getGrossIncQtr();
        double[] doubleArray11 = incSheetFileData9.getAdjToIncYr();
        double[] doubleArray12 = incSheetFileData9.getUnusualIncYr();
        double[] doubleArray13 = incSheetFileData9.getIncTaxYr();
        double[] doubleArray14 = incSheetFileData9.getNetIncYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData15 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData15);
        double[] doubleArray17 = balSheetFileData16.getOtherLtLiabYr();
        double[] doubleArray18 = balSheetFileData16.getStDebtQtr();
        double[] doubleArray19 = balSheetFileData16.getLtInvestQtr();
        double[] doubleArray20 = balSheetFileData16.getOtherLtAssetsYr();
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData25 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList23);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData26 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList23);
        java.lang.String str27 = cashFileData26.getTicker();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData28 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData26);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData31 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData0, estimateFileData1, sharesFileData3, incSheetFileData9, balSheetFileData16, cashFileData28, (int) (short) 0, (int) (short) 100);
        java.lang.String str32 = fieldData31.getTicker();
        net.ajaskey.common.DateTime dateTime33 = fieldData31.getCurrFiscalYear();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(doubleArray14);
        org.junit.Assert.assertNull(doubleArray17);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(incSheetFileData25);
        org.junit.Assert.assertNotNull(cashFileData26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNull(dateTime33);
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00256");
        java.lang.String[] strArray4 = new java.lang.String[] { "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n", "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n", "Cash File Data", "Cash File Data" };
        java.lang.String[] strArray9 = new java.lang.String[] { "NONE", "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n", "Cash File Data", "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData10 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(strArray4, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00257");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getGrossIncQtr();
        double[] doubleArray3 = incSheetFileData1.getAdjToIncYr();
        double[] doubleArray4 = incSheetFileData1.getAdjToIncQtr();
        double[] doubleArray5 = incSheetFileData1.getEpsYr();
        double[] doubleArray6 = incSheetFileData1.getNetIncYr();
        double[] doubleArray7 = incSheetFileData1.getIncPrimaryEpsYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00258");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        java.lang.String str28 = fieldData27.getStreet();
        double[] doubleArray29 = fieldData27.getTotalOpExpQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData30 = fieldData27.getCashData();
        double[] doubleArray31 = cashFileData30.getCashFromOpsQtr();
        java.lang.Class<?> wildcardClass32 = cashFileData30.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertNotNull(cashFileData30);
        org.junit.Assert.assertNull(doubleArray31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00259");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum1 = estimateFileData0.getExchange();
        java.lang.String str2 = estimateFileData0.getName();
        net.ajaskey.common.DateTime dateTime3 = estimateFileData0.getLatestQtrEps();
        double double4 = estimateFileData0.getEpsY2();
        java.lang.String str5 = estimateFileData0.getSector();
        org.junit.Assert.assertNull(exchEnum1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(dateTime3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00260");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readSipData("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : NONE\r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : NONE\r\n  phone     : null\r\n  web       : null\r\n", "Cash File Data");
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00261");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setInstShareholders("");
        sharesFileData0.setFloatshr("hi!");
        double double5 = sharesFileData0.getPrice52hi();
        java.lang.Class<?> wildcardClass6 = sharesFileData0.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00262");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.find("Cash File Data");
        org.junit.Assert.assertNull(balSheetFileData1);
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00263");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        java.lang.String str28 = fieldData27.getStreet();
        double[] doubleArray29 = fieldData27.getTotalOpExpQtr();
        double double30 = fieldData27.getEpsY0();
        double double31 = fieldData27.getEpsQ0();
        double[] doubleArray32 = fieldData27.getLtDebtQtr();
        double[] doubleArray33 = fieldData27.getBvpsYr();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertNull(doubleArray33);
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00264");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        java.lang.String str28 = fieldData27.getStreet();
        double[] doubleArray29 = fieldData27.getTotalOpExpQtr();
        double double30 = fieldData27.getEpsY0();
        int int31 = fieldData27.getInsiderSells();
        java.lang.String str32 = fieldData27.getSector();
        double[] doubleArray33 = fieldData27.getGoodwillYr();
        fieldData27.setYear((int) (byte) 0);
        double[] doubleArray36 = fieldData27.getIncPrimaryEpsQtr();
        double[] doubleArray37 = fieldData27.getCogsQtr();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(doubleArray33);
        org.junit.Assert.assertNull(doubleArray36);
        org.junit.Assert.assertNull(doubleArray37);
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00265");
        java.lang.String[] strArray6 = new java.lang.String[] { "out/BigDB/10/Q100/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-10Q100.NONE", "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n", "", "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n", "hi!", "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : NONE\r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n" };
        java.lang.String[] strArray12 = new java.lang.String[] { "out/BigDB/", "out/BigDB/", "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n", "out/BigDB/", "out/BigDB/10/Q100/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-10Q100.NONE" };
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
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00266");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData1);
        companyFileData2.setNumEmployees("hi!");
        java.lang.String str5 = companyFileData2.getPhone();
        estimateFileData0.setNameFields(companyFileData2);
        java.lang.String str7 = companyFileData2.getStreet();
        companyFileData2.setPhone("data/BigDB/");
        java.lang.String str10 = companyFileData2.getWeb();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00267");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        java.lang.String str28 = fieldData27.getStreet();
        double[] doubleArray29 = fieldData27.getTotalOpExpQtr();
        double double30 = fieldData27.getEpsY0();
        int int31 = fieldData27.getInsiderSells();
        java.lang.String str32 = fieldData27.getSector();
        double[] doubleArray33 = fieldData27.getGoodwillYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SnpEnum snpEnum34 = fieldData27.getSnpIndex();
        java.lang.String str35 = fieldData27.getSector();
        double[] doubleArray36 = fieldData27.getDividendQtr();
        double double37 = fieldData27.getPrice52lo();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(doubleArray33);
        org.junit.Assert.assertNull(snpEnum34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(doubleArray36);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00268");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getOtherLtLiabYr();
        double[] doubleArray3 = balSheetFileData1.getStDebtQtr();
        double[] doubleArray4 = balSheetFileData1.getLtInvestQtr();
        double[] doubleArray5 = balSheetFileData1.getTotalAssetsYr();
        double[] doubleArray6 = balSheetFileData1.getNetFixedAssetsYr();
        double[] doubleArray7 = balSheetFileData1.getStDebtYr();
        double[] doubleArray8 = balSheetFileData1.getCashYr();
        double[] doubleArray9 = balSheetFileData1.getOtherLtAssetsYr();
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
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00269");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setInstShareholders("");
        sharesFileData0.setVolume3m("");
        sharesFileData0.setDollar3m("");
        int int7 = sharesFileData0.getInsiderBuyShrs();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData8);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData10 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str11 = estimateFileData10.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData12 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData12.setInsiderNetPercentOutstanding("");
        double[] doubleArray15 = sharesFileData12.getSharesQ();
        sharesFileData12.setInsiderBuys("");
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData22 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList20);
        double[] doubleArray23 = incSheetFileData22.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData24 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData25 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData24);
        double[] doubleArray26 = balSheetFileData25.getOtherLtLiabYr();
        double[] doubleArray27 = balSheetFileData25.getStDebtQtr();
        double[] doubleArray28 = balSheetFileData25.getInventoryYr();
        java.lang.String str29 = balSheetFileData25.toString();
        double[] doubleArray30 = balSheetFileData25.getNetFixedAssetsYr();
        double[] doubleArray31 = balSheetFileData25.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData32 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData35 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData9, estimateFileData10, sharesFileData12, incSheetFileData22, balSheetFileData25, cashFileData32, (int) (short) 100, (int) (byte) 100);
        java.lang.String str36 = fieldData35.getStreet();
        double[] doubleArray37 = fieldData35.getOtherLtAssetsYr();
        double[] doubleArray38 = fieldData35.getSharesQ();
        sharesFileData0.setSharesQ(doubleArray38);
        // The following exception was thrown during execution in test generation
        try {
            double double40 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getTtm(doubleArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0]");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(incSheetFileData22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(doubleArray26);
        org.junit.Assert.assertNull(doubleArray27);
        org.junit.Assert.assertNull(doubleArray28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNull(doubleArray30);
        org.junit.Assert.assertNull(doubleArray31);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(doubleArray37);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[0.0]");
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00270");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        java.lang.String str28 = fieldData27.getStreet();
        double[] doubleArray29 = fieldData27.getOtherLtAssetsYr();
        double[] doubleArray30 = fieldData27.getCashFromOpsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData31 = fieldData27.getIncSheetData();
        double[] doubleArray32 = fieldData27.getCashYr();
        int int33 = fieldData27.getInstSellShrs();
        double[] doubleArray34 = fieldData27.getSharesQ();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertNull(doubleArray30);
        org.junit.Assert.assertNotNull(incSheetFileData31);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[0.0]");
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00271");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData28 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData29 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData28);
        java.lang.String str30 = companyFileData29.getIndustry();
        java.lang.String str31 = companyFileData29.getState();
        companyFileData29.setPhone("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        java.lang.String str34 = companyFileData29.getName();
        int int35 = companyFileData29.getNumEmployees();
        java.lang.String str36 = companyFileData29.getName();
        estimateFileData2.setNameFields(companyFileData29);
        java.lang.String str38 = companyFileData29.getSnpIndexStr();
        java.lang.String str39 = companyFileData29.getCountry();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNull(str39);
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00272");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        java.lang.String str28 = fieldData27.getStreet();
        double[] doubleArray29 = fieldData27.getTotalOpExpQtr();
        double double30 = fieldData27.getEpsY0();
        java.lang.String str31 = fieldData27.getSic();
        double[] doubleArray32 = fieldData27.getEpsContQtr();
        int int33 = fieldData27.getInsiderSellShrs();
        double[] doubleArray34 = fieldData27.getIncTaxQtr();
        double[] doubleArray35 = fieldData27.getPreTaxIncQtr();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNull(doubleArray34);
        org.junit.Assert.assertNull(doubleArray35);
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00273");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setInstShareholders("");
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum3 = sharesFileData0.getExchange();
        sharesFileData0.setVolume3m("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        sharesFileData0.setInsiderSells("");
        double double8 = sharesFileData0.getPrice52hi();
        sharesFileData0.setInsiderNetPercentOutstanding("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum11 = sharesFileData0.getExchange();
        org.junit.Assert.assertNull(exchEnum3);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(exchEnum11);
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00274");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setNumEmployees("hi!");
        java.lang.String str4 = companyFileData1.getPhone();
        java.lang.String str5 = companyFileData1.getIndustry();
        companyFileData1.setNumEmployees("out/BigDB/");
        net.ajaskey.market.tools.SIP.BigDB.dataio.DowEnum dowEnum8 = companyFileData1.getDowIndex();
        companyFileData1.setWeb("");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(dowEnum8);
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00275");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readSipData("Cash File Data", "");
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00276");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        int int2 = companyFileData1.getNumEmployees();
        companyFileData1.setNumEmployees("hi!");
        companyFileData1.setTicker("");
        companyFileData1.setWeb("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        companyFileData1.setDowIndex("out/BigDB/");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00277");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        java.lang.String str28 = fieldData27.getStreet();
        double[] doubleArray29 = fieldData27.getTotalOpExpQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData30 = fieldData27.getCashData();
        double double31 = fieldData27.getEpsY0();
        double[] doubleArray32 = fieldData27.getIncPrimaryEpsYr();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertNotNull(cashFileData30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNull(doubleArray32);
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00278");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        java.lang.String str28 = fieldData27.getStreet();
        double[] doubleArray29 = fieldData27.getTotalOpExpQtr();
        double double30 = fieldData27.getEpsY0();
        double double31 = fieldData27.getEpsQ0();
        double double32 = fieldData27.getEpsY1();
        double[] doubleArray33 = fieldData27.getOtherCurrAssetsYr();
        fieldData27.setYear(6);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertNull(doubleArray33);
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00279");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setInstShareholders("");
        sharesFileData0.setInstSellShrs("hi!");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str8 = estimateFileData7.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData9 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData9.setInsiderNetPercentOutstanding("");
        double[] doubleArray12 = sharesFileData9.getSharesQ();
        sharesFileData9.setInsiderBuys("");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData19 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList17);
        double[] doubleArray20 = incSheetFileData19.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData21 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData22 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData21);
        double[] doubleArray23 = balSheetFileData22.getOtherLtLiabYr();
        double[] doubleArray24 = balSheetFileData22.getStDebtQtr();
        double[] doubleArray25 = balSheetFileData22.getInventoryYr();
        java.lang.String str26 = balSheetFileData22.toString();
        double[] doubleArray27 = balSheetFileData22.getNetFixedAssetsYr();
        double[] doubleArray28 = balSheetFileData22.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData29 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData32 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData6, estimateFileData7, sharesFileData9, incSheetFileData19, balSheetFileData22, cashFileData29, (int) (short) 100, (int) (byte) 100);
        companyFileData6.setZip("hi!");
        sharesFileData0.setNameFields(companyFileData6);
        long long36 = sharesFileData0.getVolume10d();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0]");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(incSheetFileData19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(doubleArray24);
        org.junit.Assert.assertNull(doubleArray25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNull(doubleArray27);
        org.junit.Assert.assertNull(doubleArray28);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00280");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        java.lang.String str28 = fieldData27.getStreet();
        double[] doubleArray29 = fieldData27.getTotalOpExpQtr();
        double[] doubleArray30 = fieldData27.getStDebtYr();
        double[] doubleArray31 = fieldData27.getLtInvestYr();
        fieldData27.setQuarter(1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertNull(doubleArray30);
        org.junit.Assert.assertNull(doubleArray31);
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00281");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum1 = estimateFileData0.getExchange();
        double double2 = estimateFileData0.getEpsQ1();
        double double3 = estimateFileData0.getEpsY2();
        org.junit.Assert.assertNull(exchEnum1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00282");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getOtherLtLiabYr();
        double[] doubleArray3 = balSheetFileData1.getStDebtQtr();
        double[] doubleArray4 = balSheetFileData1.getLtInvestQtr();
        double[] doubleArray5 = balSheetFileData1.getTotalAssetsYr();
        double[] doubleArray6 = balSheetFileData1.getOtherCurrLiabQtr();
        double[] doubleArray7 = balSheetFileData1.getGoodwillYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00283");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        java.lang.String str28 = fieldData27.getStreet();
        double[] doubleArray29 = fieldData27.getTotalOpExpQtr();
        double double30 = fieldData27.getEpsY0();
        double double31 = fieldData27.getEpsQ0();
        double[] doubleArray32 = fieldData27.getLtDebtQtr();
        double[] doubleArray33 = fieldData27.getIncPrimaryEpsYr();
        double[] doubleArray34 = fieldData27.getNetIncQtr();
        double[] doubleArray35 = fieldData27.getCurrAssetsQtr();
        java.lang.String str36 = fieldData27.getSnpIndexStr();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertNull(doubleArray33);
        org.junit.Assert.assertNull(doubleArray34);
        org.junit.Assert.assertNull(doubleArray35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00284");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "out/BigDB/", "NONE", "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n", "NONE", "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n", "Cash File Data" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData10 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList8);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData11 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList8);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData12 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList8);
        sharesFileData12.setInstBuyShrs("data/BigDB/");
        double double15 = sharesFileData12.getPrice52lo();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(cashFileData10);
        org.junit.Assert.assertNotNull(sharesFileData11);
        org.junit.Assert.assertNotNull(sharesFileData12);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00285");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        java.lang.String str28 = fieldData27.getStreet();
        double[] doubleArray29 = fieldData27.getTotalOpExpQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData30 = fieldData27.getCashData();
        java.lang.String str31 = fieldData27.getIndustry();
        double[] doubleArray32 = fieldData27.getGoodwillYr();
        int int33 = fieldData27.getInstBuyShrs();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertNotNull(cashFileData30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00286");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setNumEmployees("hi!");
        java.lang.String str4 = companyFileData1.getPhone();
        java.lang.String str5 = companyFileData1.getIndustry();
        companyFileData1.setSnpIndex("out/BigDB/");
        companyFileData1.setCountry("");
        boolean boolean10 = companyFileData1.isDrp();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00287");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        java.lang.String str28 = fieldData27.getStreet();
        double[] doubleArray29 = fieldData27.getTotalOpExpQtr();
        double double30 = fieldData27.getEpsY0();
        double[] doubleArray31 = fieldData27.getInventoryQtr();
        long long32 = fieldData27.getVolume10d();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData33 = fieldData27.getCompanyInfo();
        double[] doubleArray34 = fieldData27.getLtDebtYr();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNull(doubleArray31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNotNull(companyFileData33);
        org.junit.Assert.assertNull(doubleArray34);
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00288");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInsiderNetTrades();
        sharesFileData0.setInsiderNetPercentOutstanding("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        sharesFileData0.setVolume10d("hi!");
        sharesFileData0.setVolume3m("Cash File Data");
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum8 = sharesFileData0.getExchange();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(exchEnum8);
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00289");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        java.lang.String str28 = fieldData27.getStreet();
        double[] doubleArray29 = fieldData27.getTotalOpExpQtr();
        double double30 = fieldData27.getEpsY0();
        int int31 = fieldData27.getInsiderSells();
        java.lang.String str32 = fieldData27.getSector();
        double[] doubleArray33 = fieldData27.getGoodwillYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SnpEnum snpEnum34 = fieldData27.getSnpIndex();
        double[] doubleArray35 = fieldData27.getNonrecurringItemsYr();
        long long36 = fieldData27.getVolumeMonth3m();
        double[] doubleArray37 = fieldData27.getEpsQtr();
        double[] doubleArray38 = fieldData27.getGrossOpIncQtr();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass39 = doubleArray38.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(doubleArray33);
        org.junit.Assert.assertNull(snpEnum34);
        org.junit.Assert.assertNull(doubleArray35);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertNull(doubleArray37);
        org.junit.Assert.assertNull(doubleArray38);
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00290");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        java.lang.String str28 = fieldData27.getStreet();
        double[] doubleArray29 = fieldData27.getTotalOpExpQtr();
        double double30 = fieldData27.getEpsY0();
        int int31 = fieldData27.getInsiderSells();
        java.lang.String str32 = fieldData27.getSector();
        double[] doubleArray33 = fieldData27.getGoodwillYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SnpEnum snpEnum34 = fieldData27.getSnpIndex();
        double[] doubleArray35 = fieldData27.getLtDebtYr();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(doubleArray33);
        org.junit.Assert.assertNull(snpEnum34);
        org.junit.Assert.assertNull(doubleArray35);
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00291");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getFromMemory("out/BigDB/100/Q10/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-100Q10.Cash File Data", (int) (short) 100, 1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00292");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setInstShareholders("");
        java.lang.String str3 = sharesFileData0.getTicker();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum4 = sharesFileData0.getExchange();
        double double5 = sharesFileData0.getPrice();
        double double6 = sharesFileData0.getInsiderNetPercentOutstanding();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData7.setDollar3m("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(exchEnum4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00293");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.parseSipData((int) (byte) 10, 10, filetypeEnum2);
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00294");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData1);
        companyFileData2.setNumEmployees("hi!");
        java.lang.String str5 = companyFileData2.getPhone();
        estimateFileData0.setNameFields(companyFileData2);
        companyFileData2.setName("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        int int9 = companyFileData2.getNumEmployees();
        java.lang.String str10 = companyFileData2.getCity();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00295");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setNumEmployees("hi!");
        companyFileData1.setPhone("");
        companyFileData1.setNumEmployees("NONE");
        java.lang.String str8 = companyFileData1.getCountry();
        java.lang.String str9 = companyFileData1.getStreet();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00296");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.parseSipData((int) ' ', (int) (byte) 10, filetypeEnum2);
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00297");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setInstShareholders("");
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum3 = sharesFileData0.getExchange();
        sharesFileData0.setVolume3m("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        sharesFileData0.setVolume10d("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        sharesFileData0.setFromReport((int) (byte) 0, (int) ' ');
        int int11 = sharesFileData0.getInsiderSells();
        sharesFileData0.setPrice("");
        org.junit.Assert.assertNull(exchEnum3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00298");
        java.lang.String[] strArray1 = new java.lang.String[] { "NONE" };
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
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00299");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setInsiderNetPercentOutstanding("");
        int int3 = sharesFileData0.getInstBuyShrs();
        sharesFileData0.setInsiderBuys("");
        double[] doubleArray6 = sharesFileData0.getSharesY();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getTtm(doubleArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0]");
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00300");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str2 = estimateFileData1.getName();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData3 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        double double4 = sharesFileData3.getInsiderOwnership();
        sharesFileData3.setFromReport((int) '#', (int) (byte) 100);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData8 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData9 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData8);
        double[] doubleArray10 = incSheetFileData9.getGrossIncQtr();
        double[] doubleArray11 = incSheetFileData9.getAdjToIncYr();
        double[] doubleArray12 = incSheetFileData9.getUnusualIncYr();
        double[] doubleArray13 = incSheetFileData9.getIncTaxYr();
        double[] doubleArray14 = incSheetFileData9.getNetIncYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData15 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData15);
        double[] doubleArray17 = balSheetFileData16.getOtherLtLiabYr();
        double[] doubleArray18 = balSheetFileData16.getStDebtQtr();
        double[] doubleArray19 = balSheetFileData16.getLtInvestQtr();
        double[] doubleArray20 = balSheetFileData16.getOtherLtAssetsYr();
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData25 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList23);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData26 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList23);
        java.lang.String str27 = cashFileData26.getTicker();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData28 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData26);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData31 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData0, estimateFileData1, sharesFileData3, incSheetFileData9, balSheetFileData16, cashFileData28, (int) (short) 0, (int) (short) 100);
        double[] doubleArray32 = incSheetFileData9.getIncTaxYr();
        double[] doubleArray33 = incSheetFileData9.getAdjToIncYr();
        double[] doubleArray34 = incSheetFileData9.getNonrecurringItemsQtr();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(doubleArray14);
        org.junit.Assert.assertNull(doubleArray17);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(incSheetFileData25);
        org.junit.Assert.assertNotNull(cashFileData26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertNull(doubleArray33);
        org.junit.Assert.assertNull(doubleArray34);
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00301");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        java.lang.String str28 = fieldData27.getStreet();
        double[] doubleArray29 = fieldData27.getTotalOpExpQtr();
        double double30 = fieldData27.getEpsY0();
        double[] doubleArray31 = fieldData27.getInventoryQtr();
        double[] doubleArray32 = fieldData27.getBvpsQtr();
        double double33 = fieldData27.getEpsQ1();
        double[] doubleArray34 = fieldData27.getNetIncQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData35 = fieldData27.getShares();
        int int36 = sharesFileData35.getInsiderSells();
        sharesFileData35.setInsiderBuys("data/BigDB/");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNull(doubleArray31);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNull(doubleArray34);
        org.junit.Assert.assertNotNull(sharesFileData35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00302");
        java.lang.String[] strArray3 = new java.lang.String[] { "Cash File Data", "Cash File Data", "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList4);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList4);
        double[] doubleArray8 = incSheetFileData7.getRdQtr();
        double[] doubleArray9 = incSheetFileData7.getRdQtr();
        double[] doubleArray10 = incSheetFileData7.getGrossIncYr();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(sharesFileData6);
        org.junit.Assert.assertNotNull(incSheetFileData7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00303");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.parseSipData((int) ' ', (int) (short) -1, filetypeEnum2);
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00304");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setNumEmployees("hi!");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData1);
        boolean boolean5 = companyFileData1.isAdr();
        companyFileData1.setWeb("data/BigDB/");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00305");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readSipData("ticker      : \r\n  name      : hi!\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : NONE\r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : hi!\r\n  phone     : data/BigDB/\r\n  web       : null\r\n");
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00306");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        boolean boolean2 = companyFileData1.isDrp();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData3 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str4 = estimateFileData3.getName();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData5 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData5.setInstShareholders("");
        sharesFileData5.setDollar3m("data/BigDB/");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData10 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData11 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData10);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData12 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str13 = estimateFileData12.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData14 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData14.setInsiderNetPercentOutstanding("");
        double[] doubleArray17 = sharesFileData14.getSharesQ();
        sharesFileData14.setInsiderBuys("");
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData24 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList22);
        double[] doubleArray25 = incSheetFileData24.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData26 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData26);
        double[] doubleArray28 = balSheetFileData27.getOtherLtLiabYr();
        double[] doubleArray29 = balSheetFileData27.getStDebtQtr();
        double[] doubleArray30 = balSheetFileData27.getInventoryYr();
        java.lang.String str31 = balSheetFileData27.toString();
        double[] doubleArray32 = balSheetFileData27.getNetFixedAssetsYr();
        double[] doubleArray33 = balSheetFileData27.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData34 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData37 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData11, estimateFileData12, sharesFileData14, incSheetFileData24, balSheetFileData27, cashFileData34, (int) (short) 100, (int) (byte) 100);
        double[] doubleArray38 = incSheetFileData24.getIntExpNonOpYr();
        double[] doubleArray39 = incSheetFileData24.getEpsYr();
        double[] doubleArray40 = incSheetFileData24.getGrossIncQtr();
        double[] doubleArray41 = incSheetFileData24.getGrossOpIncQtr();
        double[] doubleArray42 = incSheetFileData24.getNetIncYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData43 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData44 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData43);
        double[] doubleArray45 = balSheetFileData44.getOtherLtLiabYr();
        double[] doubleArray46 = balSheetFileData44.getStDebtQtr();
        double[] doubleArray47 = balSheetFileData44.getInventoryYr();
        java.lang.String str48 = balSheetFileData44.toString();
        double[] doubleArray49 = balSheetFileData44.getBvpsQtr();
        double[] doubleArray50 = balSheetFileData44.getStDebtQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData51 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData52 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData51);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData53 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str54 = estimateFileData53.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData55 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData55.setInsiderNetPercentOutstanding("");
        double[] doubleArray58 = sharesFileData55.getSharesQ();
        sharesFileData55.setInsiderBuys("");
        java.lang.String[] strArray62 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList63 = new java.util.ArrayList<java.lang.String>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList63, strArray62);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData65 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList63);
        double[] doubleArray66 = incSheetFileData65.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData67 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData68 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData67);
        double[] doubleArray69 = balSheetFileData68.getOtherLtLiabYr();
        double[] doubleArray70 = balSheetFileData68.getStDebtQtr();
        double[] doubleArray71 = balSheetFileData68.getInventoryYr();
        java.lang.String str72 = balSheetFileData68.toString();
        double[] doubleArray73 = balSheetFileData68.getNetFixedAssetsYr();
        double[] doubleArray74 = balSheetFileData68.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData75 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData78 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData52, estimateFileData53, sharesFileData55, incSheetFileData65, balSheetFileData68, cashFileData75, (int) (short) 100, (int) (byte) 100);
        java.lang.String str79 = fieldData78.getStreet();
        double[] doubleArray80 = fieldData78.getOtherLtAssetsQtr();
        double[] doubleArray81 = fieldData78.getTotalOpExpYr();
        double double82 = fieldData78.getEpsY0();
        double[] doubleArray83 = fieldData78.getIncPrimaryEpsQtr();
        double[] doubleArray84 = fieldData78.getLiabEquityYr();
        boolean boolean85 = fieldData78.isDrp();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData86 = fieldData78.getCashData();
        double[] doubleArray87 = cashFileData86.getCashFromFinQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData90 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData3, sharesFileData5, incSheetFileData24, balSheetFileData44, cashFileData86, 6, (int) '#');
        java.lang.String str91 = balSheetFileData44.getTicker();
        double[] doubleArray92 = balSheetFileData44.getTotalAssetsYr();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0]");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(incSheetFileData24);
        org.junit.Assert.assertNull(doubleArray25);
        org.junit.Assert.assertNull(doubleArray28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertNull(doubleArray30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertNull(doubleArray33);
        org.junit.Assert.assertNull(doubleArray38);
        org.junit.Assert.assertNull(doubleArray39);
        org.junit.Assert.assertNull(doubleArray40);
        org.junit.Assert.assertNull(doubleArray41);
        org.junit.Assert.assertNull(doubleArray42);
        org.junit.Assert.assertNull(doubleArray45);
        org.junit.Assert.assertNull(doubleArray46);
        org.junit.Assert.assertNull(doubleArray47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNull(doubleArray49);
        org.junit.Assert.assertNull(doubleArray50);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[0.0]");
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(incSheetFileData65);
        org.junit.Assert.assertNull(doubleArray66);
        org.junit.Assert.assertNull(doubleArray69);
        org.junit.Assert.assertNull(doubleArray70);
        org.junit.Assert.assertNull(doubleArray71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertNull(doubleArray73);
        org.junit.Assert.assertNull(doubleArray74);
        org.junit.Assert.assertNull(str79);
        org.junit.Assert.assertNull(doubleArray80);
        org.junit.Assert.assertNull(doubleArray81);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 0.0d + "'", double82 == 0.0d);
        org.junit.Assert.assertNull(doubleArray83);
        org.junit.Assert.assertNull(doubleArray84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(cashFileData86);
        org.junit.Assert.assertNull(doubleArray87);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
        org.junit.Assert.assertNull(doubleArray92);
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00307");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getGrossIncYr();
        double[] doubleArray3 = incSheetFileData1.getEpsYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum4 = incSheetFileData1.getExchange();
        java.lang.String str5 = incSheetFileData1.getIndustry();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(exchEnum4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00308");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        java.lang.String str28 = fieldData27.getStreet();
        double[] doubleArray29 = fieldData27.getTotalOpExpQtr();
        double[] doubleArray30 = fieldData27.getDepreciationYr();
        java.lang.String str31 = fieldData27.getSector();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData32 = fieldData27.getCompanyInfo();
        double double33 = fieldData27.getEpsQ1();
        double[] doubleArray34 = fieldData27.getCurrLiabQtr();
        double[] doubleArray35 = fieldData27.getTotalOpExpYr();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertNull(doubleArray30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(companyFileData32);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNull(doubleArray34);
        org.junit.Assert.assertNull(doubleArray35);
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00309");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setInstShareholders("");
        sharesFileData0.setVolume3m("");
        sharesFileData0.setDollar3m("");
        int int7 = sharesFileData0.getInsiderBuyShrs();
        sharesFileData0.setVolume10d("hi!");
        sharesFileData0.setInsiderBuyShrs("");
        sharesFileData0.setInsiderNetPercentOutstanding("out/BigDB/");
        int int14 = sharesFileData0.getInsiderNetTrades();
        java.lang.String str15 = sharesFileData0.toDbOutput();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n" + "'", str15, "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00310");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setInsiderNetPercentOutstanding("");
        double[] doubleArray3 = sharesFileData0.getSharesQ();
        sharesFileData0.setInsiderBuys("");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData6 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData6);
        boolean boolean8 = companyFileData7.isAdr();
        sharesFileData0.setNameFields(companyFileData7);
        java.lang.String str10 = companyFileData7.getStreet();
        java.lang.String str11 = companyFileData7.toDbOuput();
        java.lang.String str12 = companyFileData7.getTicker();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n" + "'", str11, "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00311");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        java.lang.String str28 = fieldData27.getStreet();
        boolean boolean29 = fieldData27.isDrp();
        double[] doubleArray30 = fieldData27.getCashFromOpsQtr();
        double[] doubleArray31 = fieldData27.getIncAfterTaxQtr();
        net.ajaskey.common.DateTime dateTime32 = fieldData27.getCurrFiscalYear();
        int int33 = fieldData27.getInsiderBuyShrs();
        java.lang.String str34 = fieldData27.getCountry();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(doubleArray30);
        org.junit.Assert.assertNull(doubleArray31);
        org.junit.Assert.assertNull(dateTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00312");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setInsiderNetPercentOutstanding("");
        double[] doubleArray3 = sharesFileData0.getSharesQ();
        sharesFileData0.setInsiderBuys("");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData6 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData6);
        boolean boolean8 = companyFileData7.isAdr();
        sharesFileData0.setNameFields(companyFileData7);
        java.lang.String str10 = companyFileData7.getTicker();
        java.lang.String str11 = companyFileData7.getPhone();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00313");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readSipData("out/BigDB/10/Q100/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-10Q100.NONE", "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00314");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setInstShareholders("");
        sharesFileData0.setVolume3m("");
        sharesFileData0.setDollar3m("");
        sharesFileData0.setDollar3m("hi!");
        double double9 = sharesFileData0.getPrice();
        sharesFileData0.setFloatshr("Cash File Data");
        double[] doubleArray12 = sharesFileData0.getSharesY();
        sharesFileData0.setInstBuyShrs("Cash File Data");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0]");
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00315");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        double[] doubleArray28 = fieldData27.getInventoryQtr();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(doubleArray28);
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00316");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        java.lang.String str28 = fieldData27.getStreet();
        double[] doubleArray29 = fieldData27.getOtherLtAssetsQtr();
        double[] doubleArray30 = fieldData27.getTotalOpExpYr();
        double double31 = fieldData27.getEpsY0();
        double[] doubleArray32 = fieldData27.getOtherCurrLiabQtr();
        double[] doubleArray33 = fieldData27.getIncTaxYr();
        double double34 = fieldData27.getInsiderNetPercentOutstanding();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertNull(doubleArray30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertNull(doubleArray33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00317");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        java.lang.String str2 = companyFileData1.getIndustry();
        companyFileData1.setCountry("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : NONE\r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00318");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        java.lang.String str28 = fieldData27.getStreet();
        double[] doubleArray29 = fieldData27.getStDebtQtr();
        double[] doubleArray30 = fieldData27.getLtDebtYr();
        double[] doubleArray31 = fieldData27.getStDebtQtr();
        double[] doubleArray32 = fieldData27.getOtherCurrAssetsYr();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertNull(doubleArray30);
        org.junit.Assert.assertNull(doubleArray31);
        org.junit.Assert.assertNull(doubleArray32);
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00319");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        java.lang.String str28 = fieldData27.getStreet();
        double[] doubleArray29 = fieldData27.getStDebtQtr();
        double[] doubleArray30 = fieldData27.getEpsContQtr();
        double[] doubleArray31 = fieldData27.getOtherLtAssetsYr();
        double[] doubleArray32 = fieldData27.getNetIncYr();
        double double33 = fieldData27.getBeta();
        double[] doubleArray34 = fieldData27.getDepreciationYr();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertNull(doubleArray30);
        org.junit.Assert.assertNull(doubleArray31);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNull(doubleArray34);
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00320");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FiletypeEnum filetypeEnum3 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getFromDb("ticker      : \r\n  name      : hi!\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : NONE\r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : hi!\r\n  phone     : data/BigDB/\r\n  web       : null\r\n", (int) (byte) -1, (-1), filetypeEnum3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00321");
        java.lang.String[] strArray3 = new java.lang.String[] { "Cash File Data", "Cash File Data", "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList4);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList4);
        double[] doubleArray8 = incSheetFileData7.getEpsContQtr();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(sharesFileData6);
        org.junit.Assert.assertNotNull(incSheetFileData7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00322");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        double[] doubleArray28 = balSheetFileData17.getCashQtr();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(doubleArray28);
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00323");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getGrossIncQtr();
        double[] doubleArray3 = incSheetFileData1.getRdQtr();
        double[] doubleArray4 = incSheetFileData1.getAdjToIncYr();
        double[] doubleArray5 = incSheetFileData1.getIncPrimaryEpsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum6 = incSheetFileData1.getExchange();
        double[] doubleArray7 = incSheetFileData1.getEpsYr();
        java.lang.String str8 = incSheetFileData1.toString();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(exchEnum6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00324");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str1 = estimateFileData0.getName();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum2 = estimateFileData0.getExchange();
        double double3 = estimateFileData0.getEpsQ0();
        double double4 = estimateFileData0.getEpsQ0();
        net.ajaskey.common.DateTime dateTime5 = estimateFileData0.getLatestQtrEps();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(exchEnum2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(dateTime5);
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00325");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getGrossIncQtr();
        double[] doubleArray3 = incSheetFileData1.getAdjToIncYr();
        double[] doubleArray4 = incSheetFileData1.getUnusualIncYr();
        double[] doubleArray5 = incSheetFileData1.getIncTaxYr();
        double[] doubleArray6 = incSheetFileData1.getNetIncYr();
        double[] doubleArray7 = incSheetFileData1.getEpsYr();
        double[] doubleArray8 = incSheetFileData1.getPreTaxIncQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00326");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setInstShareholders("");
        java.lang.String str3 = sharesFileData0.getTicker();
        long long4 = sharesFileData0.getVolume10d();
        long long5 = sharesFileData0.getVolume10d();
        int int6 = sharesFileData0.getInstShareholders();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00327");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.find("out/BigDB/100/Q10/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-100Q10.Cash File Data");
        org.junit.Assert.assertNull(estimateFileData1);
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00328");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readSipData("out/BigDB/10/Q100/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-10Q100.NONE");
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00329");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getOtherLtLiabYr();
        double[] doubleArray3 = balSheetFileData1.getStDebtQtr();
        double[] doubleArray4 = balSheetFileData1.getInventoryYr();
        double[] doubleArray5 = balSheetFileData1.getEquityQtr();
        double[] doubleArray6 = balSheetFileData1.getLiabEquityQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00330");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        double[] doubleArray28 = balSheetFileData17.getCurrLiabQtr();
        java.lang.String str29 = balSheetFileData17.getIndustry();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(doubleArray28);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00331");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        java.lang.String str28 = fieldData27.getStreet();
        double[] doubleArray29 = fieldData27.getPrefStockYr();
        double[] doubleArray30 = fieldData27.getIncAfterTaxQtr();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass31 = doubleArray30.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertNull(doubleArray30);
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00332");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getGrossIncQtr();
        double[] doubleArray3 = incSheetFileData1.getAdjToIncYr();
        double[] doubleArray4 = incSheetFileData1.getAdjToIncQtr();
        double[] doubleArray5 = incSheetFileData1.getEpsYr();
        double[] doubleArray6 = incSheetFileData1.getNetIncYr();
        double[] doubleArray7 = incSheetFileData1.getNetIncQtr();
        double[] doubleArray8 = incSheetFileData1.getTotalOpExpYr();
        double[] doubleArray9 = incSheetFileData1.getEpsContQtr();
        double[] doubleArray10 = incSheetFileData1.getSalesYr();
        double[] doubleArray11 = incSheetFileData1.getCogsYr();
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
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00333");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readSipData("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n", "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : NONE\r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00334");
        java.lang.String[] strArray2 = new java.lang.String[] { "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : NONE\r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n", "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : NONE\r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n" };
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
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00335");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setInstShareholders("");
        java.lang.String str3 = sharesFileData0.getTicker();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum4 = sharesFileData0.getExchange();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum5 = sharesFileData0.getExchange();
        sharesFileData0.setInsiderNetTrades("hi!");
        int int8 = sharesFileData0.getInsiderNetTrades();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(exchEnum4);
        org.junit.Assert.assertNull(exchEnum5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00336");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getFromMemory("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n", 10, 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00337");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        java.lang.String str28 = fieldData27.getStreet();
        boolean boolean29 = fieldData27.isDrp();
        double double30 = fieldData27.getBeta();
        double[] doubleArray31 = fieldData27.getAcctRxQtr();
        java.lang.String str32 = fieldData27.getState();
        double[] doubleArray33 = fieldData27.getGoodwillYr();
        double[] doubleArray34 = fieldData27.getIncPrimaryEpsYr();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNull(doubleArray31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(doubleArray33);
        org.junit.Assert.assertNull(doubleArray34);
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00338");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setInstShareholders("");
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum3 = sharesFileData0.getExchange();
        sharesFileData0.setVolume3m("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        sharesFileData0.setInsiderSells("");
        double double8 = sharesFileData0.getPrice52hi();
        int int9 = sharesFileData0.getInsiderBuys();
        org.junit.Assert.assertNull(exchEnum3);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00339");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getGrossIncQtr();
        double[] doubleArray3 = incSheetFileData1.getAdjToIncYr();
        double[] doubleArray4 = incSheetFileData1.getIncPrimaryEpsQtr();
        double[] doubleArray5 = incSheetFileData1.getRdQtr();
        double[] doubleArray6 = incSheetFileData1.getIncPrimaryEpsYr();
        double[] doubleArray7 = incSheetFileData1.getDividendQtr();
        double[] doubleArray8 = incSheetFileData1.getEpsQtr();
        double[] doubleArray9 = incSheetFileData1.getDepreciationYr();
        double[] doubleArray10 = incSheetFileData1.getOtherIncYr();
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
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00340");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getFromMemory("", (-1), 1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00341");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        java.lang.String str28 = fieldData27.getStreet();
        double[] doubleArray29 = fieldData27.getPrefStockYr();
        double[] doubleArray30 = fieldData27.getInventoryQtr();
        double[] doubleArray31 = fieldData27.getUnusualIncYr();
        java.lang.String str32 = fieldData27.getSector();
        double[] doubleArray33 = fieldData27.getEpsYr();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertNull(doubleArray30);
        org.junit.Assert.assertNull(doubleArray31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(doubleArray33);
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00342");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setInstShareholders("");
        java.lang.String str3 = sharesFileData0.getTicker();
        sharesFileData0.setPrice("Cash File Data");
        sharesFileData0.setInsiderNetPercentOutstanding("");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00343");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.setMemory(10, 6, filetypeEnum2);
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00344");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getOtherLtLiabYr();
        double[] doubleArray3 = balSheetFileData1.getStDebtQtr();
        double[] doubleArray4 = balSheetFileData1.getLtInvestQtr();
        double[] doubleArray5 = balSheetFileData1.getTotalAssetsYr();
        double[] doubleArray6 = balSheetFileData1.getOtherCurrLiabYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray8 = balSheetFileData1.getLtInvestYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00345");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum1 = estimateFileData0.getExchange();
        java.lang.String str2 = estimateFileData0.getIndustry();
        net.ajaskey.common.DateTime dateTime3 = estimateFileData0.getCurrFiscalYear();
        java.lang.String str4 = estimateFileData0.getIndustry();
        java.lang.String str5 = estimateFileData0.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum6 = estimateFileData0.getExchange();
        org.junit.Assert.assertNull(exchEnum1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(dateTime3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(exchEnum6);
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00346");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        java.lang.String str28 = fieldData27.getStreet();
        boolean boolean29 = fieldData27.isDrp();
        double[] doubleArray30 = fieldData27.getCashFromOpsQtr();
        double[] doubleArray31 = fieldData27.getInventoryYr();
        double[] doubleArray32 = fieldData27.getOtherCurrLiabYr();
        double[] doubleArray33 = fieldData27.getIncTaxQtr();
        double[] doubleArray34 = fieldData27.getCurrLiabQtr();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(doubleArray30);
        org.junit.Assert.assertNull(doubleArray31);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertNull(doubleArray33);
        org.junit.Assert.assertNull(doubleArray34);
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00347");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getOtherLtLiabYr();
        double[] doubleArray3 = balSheetFileData1.getStDebtQtr();
        double[] doubleArray4 = balSheetFileData1.getInventoryYr();
        java.lang.String str5 = balSheetFileData1.toString();
        double[] doubleArray6 = balSheetFileData1.getBvpsQtr();
        double[] doubleArray7 = balSheetFileData1.getPrefStockYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00348");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        java.lang.String str2 = companyFileData1.getIndustry();
        companyFileData1.setSnpIndex("");
        java.lang.String str5 = companyFileData1.getWeb();
        // The following exception was thrown during execution in test generation
        try {
            companyFileData1.setExchange("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No enum constant net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00349");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        boolean boolean2 = companyFileData1.isDrp();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData3 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str4 = estimateFileData3.getName();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData5 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData5.setInstShareholders("");
        sharesFileData5.setDollar3m("data/BigDB/");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData10 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData11 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData10);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData12 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str13 = estimateFileData12.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData14 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData14.setInsiderNetPercentOutstanding("");
        double[] doubleArray17 = sharesFileData14.getSharesQ();
        sharesFileData14.setInsiderBuys("");
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData24 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList22);
        double[] doubleArray25 = incSheetFileData24.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData26 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData26);
        double[] doubleArray28 = balSheetFileData27.getOtherLtLiabYr();
        double[] doubleArray29 = balSheetFileData27.getStDebtQtr();
        double[] doubleArray30 = balSheetFileData27.getInventoryYr();
        java.lang.String str31 = balSheetFileData27.toString();
        double[] doubleArray32 = balSheetFileData27.getNetFixedAssetsYr();
        double[] doubleArray33 = balSheetFileData27.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData34 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData37 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData11, estimateFileData12, sharesFileData14, incSheetFileData24, balSheetFileData27, cashFileData34, (int) (short) 100, (int) (byte) 100);
        double[] doubleArray38 = incSheetFileData24.getIntExpNonOpYr();
        double[] doubleArray39 = incSheetFileData24.getEpsYr();
        double[] doubleArray40 = incSheetFileData24.getGrossIncQtr();
        double[] doubleArray41 = incSheetFileData24.getGrossOpIncQtr();
        double[] doubleArray42 = incSheetFileData24.getNetIncYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData43 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData44 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData43);
        double[] doubleArray45 = balSheetFileData44.getOtherLtLiabYr();
        double[] doubleArray46 = balSheetFileData44.getStDebtQtr();
        double[] doubleArray47 = balSheetFileData44.getInventoryYr();
        java.lang.String str48 = balSheetFileData44.toString();
        double[] doubleArray49 = balSheetFileData44.getBvpsQtr();
        double[] doubleArray50 = balSheetFileData44.getStDebtQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData51 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData52 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData51);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData53 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str54 = estimateFileData53.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData55 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData55.setInsiderNetPercentOutstanding("");
        double[] doubleArray58 = sharesFileData55.getSharesQ();
        sharesFileData55.setInsiderBuys("");
        java.lang.String[] strArray62 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList63 = new java.util.ArrayList<java.lang.String>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList63, strArray62);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData65 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList63);
        double[] doubleArray66 = incSheetFileData65.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData67 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData68 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData67);
        double[] doubleArray69 = balSheetFileData68.getOtherLtLiabYr();
        double[] doubleArray70 = balSheetFileData68.getStDebtQtr();
        double[] doubleArray71 = balSheetFileData68.getInventoryYr();
        java.lang.String str72 = balSheetFileData68.toString();
        double[] doubleArray73 = balSheetFileData68.getNetFixedAssetsYr();
        double[] doubleArray74 = balSheetFileData68.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData75 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData78 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData52, estimateFileData53, sharesFileData55, incSheetFileData65, balSheetFileData68, cashFileData75, (int) (short) 100, (int) (byte) 100);
        java.lang.String str79 = fieldData78.getStreet();
        double[] doubleArray80 = fieldData78.getOtherLtAssetsQtr();
        double[] doubleArray81 = fieldData78.getTotalOpExpYr();
        double double82 = fieldData78.getEpsY0();
        double[] doubleArray83 = fieldData78.getIncPrimaryEpsQtr();
        double[] doubleArray84 = fieldData78.getLiabEquityYr();
        boolean boolean85 = fieldData78.isDrp();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData86 = fieldData78.getCashData();
        double[] doubleArray87 = cashFileData86.getCashFromFinQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData90 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData3, sharesFileData5, incSheetFileData24, balSheetFileData44, cashFileData86, 6, (int) '#');
        double[] doubleArray91 = cashFileData86.getCashFromFinQtr();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0]");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(incSheetFileData24);
        org.junit.Assert.assertNull(doubleArray25);
        org.junit.Assert.assertNull(doubleArray28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertNull(doubleArray30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertNull(doubleArray33);
        org.junit.Assert.assertNull(doubleArray38);
        org.junit.Assert.assertNull(doubleArray39);
        org.junit.Assert.assertNull(doubleArray40);
        org.junit.Assert.assertNull(doubleArray41);
        org.junit.Assert.assertNull(doubleArray42);
        org.junit.Assert.assertNull(doubleArray45);
        org.junit.Assert.assertNull(doubleArray46);
        org.junit.Assert.assertNull(doubleArray47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNull(doubleArray49);
        org.junit.Assert.assertNull(doubleArray50);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[0.0]");
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(incSheetFileData65);
        org.junit.Assert.assertNull(doubleArray66);
        org.junit.Assert.assertNull(doubleArray69);
        org.junit.Assert.assertNull(doubleArray70);
        org.junit.Assert.assertNull(doubleArray71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertNull(doubleArray73);
        org.junit.Assert.assertNull(doubleArray74);
        org.junit.Assert.assertNull(str79);
        org.junit.Assert.assertNull(doubleArray80);
        org.junit.Assert.assertNull(doubleArray81);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 0.0d + "'", double82 == 0.0d);
        org.junit.Assert.assertNull(doubleArray83);
        org.junit.Assert.assertNull(doubleArray84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(cashFileData86);
        org.junit.Assert.assertNull(doubleArray87);
        org.junit.Assert.assertNull(doubleArray91);
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00350");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getOtherLtLiabYr();
        double[] doubleArray3 = balSheetFileData1.getStDebtQtr();
        double[] doubleArray4 = balSheetFileData1.getNetFixedAssetsYr();
        java.lang.String str5 = balSheetFileData1.getSector();
        java.lang.String str6 = balSheetFileData1.getTicker();
        double[] doubleArray7 = balSheetFileData1.getTotalAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray9 = balSheetFileData8.getStDebtQtr();
        double[] doubleArray10 = balSheetFileData8.getCashYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00351");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readSipData("");
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00352");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setNumEmployees("hi!");
        java.lang.String str4 = companyFileData1.getPhone();
        java.lang.String str5 = companyFileData1.getIndustry();
        companyFileData1.setNumEmployees("out/BigDB/");
        companyFileData1.setPhone("hi!");
        companyFileData1.setState("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        java.lang.String str12 = companyFileData1.getCity();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00353");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getOtherLtLiabYr();
        double[] doubleArray3 = balSheetFileData1.getStDebtQtr();
        double[] doubleArray4 = balSheetFileData1.getNetFixedAssetsYr();
        double[] doubleArray5 = balSheetFileData1.getLiabEquityYr();
        double[] doubleArray6 = balSheetFileData1.getOtherCurrLiabQtr();
        double[] doubleArray7 = balSheetFileData1.getAcctRxQtr();
        double[] doubleArray8 = balSheetFileData1.getOtherLtAssetsQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00354");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getOtherLtLiabYr();
        double[] doubleArray3 = balSheetFileData1.getStDebtQtr();
        double[] doubleArray4 = balSheetFileData1.getLtInvestQtr();
        double[] doubleArray5 = balSheetFileData1.getCurrLiabYr();
        java.lang.String str6 = balSheetFileData1.getTicker();
        double[] doubleArray7 = balSheetFileData1.getAcctPayableQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00355");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str7 = incSheetFileData6.getTicker();
        double[] doubleArray8 = incSheetFileData6.getDividendYr();
        double[] doubleArray9 = incSheetFileData6.getEpsDilYr();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(incSheetFileData4);
        org.junit.Assert.assertNotNull(cashFileData5);
        org.junit.Assert.assertNotNull(incSheetFileData6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00356");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        double double1 = estimateFileData0.getEpsQ1();
        double double2 = estimateFileData0.getEpsY2();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00357");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (short) 1, 0);
        sharesFileData0.setInsiderNetTrades("hi!");
        sharesFileData0.setInstSellShrs("Cash File Data");
        java.lang.String str8 = sharesFileData0.getName();
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00358");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readSipData("NONE");
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00359");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        java.lang.String str28 = fieldData27.getStreet();
        double[] doubleArray29 = fieldData27.getTotalOpExpQtr();
        double double30 = fieldData27.getEpsY0();
        int int31 = fieldData27.getInsiderSells();
        java.lang.String str32 = fieldData27.getSector();
        double[] doubleArray33 = fieldData27.getGoodwillYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SnpEnum snpEnum34 = fieldData27.getSnpIndex();
        double[] doubleArray35 = fieldData27.getNonrecurringItemsYr();
        int int36 = fieldData27.getNumEmployees();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(doubleArray33);
        org.junit.Assert.assertNull(snpEnum34);
        org.junit.Assert.assertNull(doubleArray35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00360");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        java.lang.String str28 = fieldData27.getStreet();
        double[] doubleArray29 = fieldData27.getTotalOpExpQtr();
        double double30 = fieldData27.getEpsY0();
        int int31 = fieldData27.getInsiderSells();
        double[] doubleArray32 = fieldData27.getOtherLtAssetsYr();
        long long33 = fieldData27.getVolumeMonth3m();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData34 = fieldData27.getShares();
        double double35 = fieldData27.getInsiderNetPercentOutstanding();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNotNull(sharesFileData34);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00361");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        double[] doubleArray28 = fieldData27.getTotalOpExpYr();
        double[] doubleArray29 = fieldData27.getEpsDilYr();
        int int30 = fieldData27.getYear();
        double[] doubleArray31 = fieldData27.getOtherLtLiabQtr();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(doubleArray28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertNull(doubleArray31);
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00362");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getOtherLtLiabYr();
        double[] doubleArray3 = balSheetFileData1.getStDebtQtr();
        double[] doubleArray4 = balSheetFileData1.getLtInvestQtr();
        double[] doubleArray5 = balSheetFileData1.getLiabEquityQtr();
        double[] doubleArray6 = balSheetFileData1.getBvpsYr();
        double[] doubleArray7 = balSheetFileData1.getOtherCurrAssetsYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00363");
        java.lang.String[] strArray2 = new java.lang.String[] { "Cash File Data", "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : NONE\r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n" };
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
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00364");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setInstShareholders("");
        java.lang.String str3 = sharesFileData0.getTicker();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum4 = sharesFileData0.getExchange();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum5 = sharesFileData0.getExchange();
        sharesFileData0.setInsiderNetTrades("hi!");
        double double8 = sharesFileData0.getMktCap();
        java.lang.String str9 = sharesFileData0.toDbOutput();
        sharesFileData0.setInsiderSellShrs("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(exchEnum4);
        org.junit.Assert.assertNull(exchEnum5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n" + "'", str9, "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00365");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getGrossIncQtr();
        double[] doubleArray3 = incSheetFileData1.getAdjToIncYr();
        double[] doubleArray4 = incSheetFileData1.getAdjToIncQtr();
        double[] doubleArray5 = incSheetFileData1.getEpsYr();
        double[] doubleArray6 = incSheetFileData1.getCogsYr();
        double[] doubleArray7 = incSheetFileData1.getNonrecurringItemsYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00366");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        double[] doubleArray9 = incSheetFileData8.getEpsContYr();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(incSheetFileData4);
        org.junit.Assert.assertNotNull(cashFileData5);
        org.junit.Assert.assertNotNull(incSheetFileData6);
        org.junit.Assert.assertNotNull(sharesFileData7);
        org.junit.Assert.assertNotNull(incSheetFileData8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00367");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getOtherLtLiabYr();
        double[] doubleArray3 = balSheetFileData1.getStDebtQtr();
        double[] doubleArray4 = balSheetFileData1.getLtInvestQtr();
        double[] doubleArray5 = balSheetFileData1.getTotalAssetsYr();
        double[] doubleArray6 = balSheetFileData1.getNetFixedAssetsYr();
        double[] doubleArray7 = balSheetFileData1.getStDebtYr();
        double[] doubleArray8 = balSheetFileData1.getCashYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData10 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData9);
        java.lang.String str11 = companyFileData10.getIndustry();
        java.lang.String str12 = companyFileData10.getState();
        companyFileData10.setPhone("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        java.lang.String str15 = companyFileData10.getName();
        int int16 = companyFileData10.getNumEmployees();
        java.lang.String str17 = companyFileData10.getName();
        java.lang.String str18 = companyFileData10.toString();
        balSheetFileData1.setNameFields(companyFileData10);
        double[] doubleArray20 = balSheetFileData1.getOtherLtAssetsYr();
        double[] doubleArray21 = balSheetFileData1.getBvpsYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertNull(doubleArray21);
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00368");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        java.lang.String str28 = fieldData27.getStreet();
        boolean boolean29 = fieldData27.isDrp();
        double[] doubleArray30 = fieldData27.getCashFromOpsQtr();
        double[] doubleArray31 = fieldData27.getInventoryYr();
        double[] doubleArray32 = fieldData27.getOtherCurrLiabYr();
        double[] doubleArray33 = fieldData27.getGrossIncYr();
        int int34 = fieldData27.getNumEmployees();
        double[] doubleArray35 = fieldData27.getEpsDilYr();
        double[] doubleArray36 = fieldData27.getRdQtr();
        double[] doubleArray37 = fieldData27.getEpsYr();
        int int38 = fieldData27.getInsiderSellShrs();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(doubleArray30);
        org.junit.Assert.assertNull(doubleArray31);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertNull(doubleArray33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNull(doubleArray35);
        org.junit.Assert.assertNull(doubleArray36);
        org.junit.Assert.assertNull(doubleArray37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00369");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getOtherCurrLiabQtr();
        double[] doubleArray3 = balSheetFileData1.getPrefStockYr();
        double[] doubleArray4 = balSheetFileData1.getEquityQtr();
        java.lang.String str5 = balSheetFileData1.getIndustry();
        double[] doubleArray6 = balSheetFileData1.getLtDebtYr();
        double[] doubleArray7 = balSheetFileData1.getOtherCurrAssetsYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00370");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getGrossIncQtr();
        double[] doubleArray3 = incSheetFileData1.getAdjToIncYr();
        double[] doubleArray4 = incSheetFileData1.getAdjToIncQtr();
        double[] doubleArray5 = incSheetFileData1.getOtherIncQtr();
        double[] doubleArray6 = incSheetFileData1.getPreTaxIncYr();
        double[] doubleArray7 = incSheetFileData1.getIncPrimaryEpsYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00371");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        java.lang.String str28 = fieldData27.getStreet();
        boolean boolean29 = fieldData27.isDrp();
        double[] doubleArray30 = fieldData27.getCashFromOpsQtr();
        double[] doubleArray31 = fieldData27.getInventoryYr();
        double[] doubleArray32 = fieldData27.getOtherCurrLiabYr();
        double[] doubleArray33 = fieldData27.getGrossIncYr();
        int int34 = fieldData27.getNumEmployees();
        double[] doubleArray35 = fieldData27.getEpsDilYr();
        java.lang.String str36 = fieldData27.getCity();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(doubleArray30);
        org.junit.Assert.assertNull(doubleArray31);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertNull(doubleArray33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNull(doubleArray35);
        org.junit.Assert.assertNull(str36);
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00372");
        java.lang.String[] strArray1 = new java.lang.String[] { "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : NONE\r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : NONE\r\n  phone     : null\r\n  web       : null\r\n" };
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
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00373");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setInstShareholders("");
        java.lang.String str3 = sharesFileData0.getTicker();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum4 = sharesFileData0.getExchange();
        double double5 = sharesFileData0.getPrice();
        double double6 = sharesFileData0.getInsiderNetPercentOutstanding();
        double double7 = sharesFileData0.getInsiderNetPercentOutstanding();
        java.lang.String str8 = sharesFileData0.getSector();
        int int9 = sharesFileData0.getInstBuyShrs();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(exchEnum4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00374");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        java.lang.String str2 = companyFileData1.getIndustry();
        companyFileData1.setSnpIndex("");
        companyFileData1.setPhone("hi!");
        companyFileData1.setDowIndex("");
        java.lang.String str9 = companyFileData1.getState();
        java.lang.String str10 = companyFileData1.getCountry();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00375");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readSipData("out/BigDB/10/Q100/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-10Q100.NONE");
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00376");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getGrossIncQtr();
        double[] doubleArray3 = incSheetFileData1.getAdjToIncYr();
        double[] doubleArray4 = incSheetFileData1.getIncTaxYr();
        double[] doubleArray5 = incSheetFileData1.getTotalOpExpYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00377");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getGrossIncQtr();
        double[] doubleArray3 = incSheetFileData1.getRdQtr();
        double[] doubleArray4 = incSheetFileData1.getEpsQtr();
        double[] doubleArray5 = incSheetFileData1.getIntExpNonOpQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00378");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getGrossIncQtr();
        double[] doubleArray3 = incSheetFileData1.getAdjToIncYr();
        double[] doubleArray4 = incSheetFileData1.getAdjToIncQtr();
        double[] doubleArray5 = incSheetFileData1.getEpsYr();
        double[] doubleArray6 = incSheetFileData1.getNetIncYr();
        double[] doubleArray7 = incSheetFileData1.getNetIncQtr();
        double[] doubleArray8 = incSheetFileData1.getTotalOpExpYr();
        double[] doubleArray9 = incSheetFileData1.getGrossOpIncYr();
        double[] doubleArray10 = incSheetFileData1.getEpsContQtr();
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
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00379");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str6 = cashFileData5.getTicker();
        double[] doubleArray7 = cashFileData5.getCashFromOpsQtr();
        java.lang.String str8 = cashFileData5.toDbOutput();
        double[] doubleArray9 = cashFileData5.getCashFromFinQtr();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(incSheetFileData4);
        org.junit.Assert.assertNotNull(cashFileData5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00380");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setInstShareholders("");
        sharesFileData0.setVolume3m("");
        sharesFileData0.setDollar3m("");
        sharesFileData0.setDollar3m("hi!");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData9 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData9.setFromReport((int) (short) 1, 0);
        sharesFileData9.setInsiderBuyShrs("hi!");
        int int15 = sharesFileData9.getInsiderBuys();
        double[] doubleArray16 = sharesFileData9.getSharesQ();
        sharesFileData0.setSharesY(doubleArray16);
        java.lang.String str18 = sharesFileData0.getTicker();
        sharesFileData0.setInsiderNetPercentOutstanding("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : NONE\r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : NONE\r\n  phone     : null\r\n  web       : null\r\n");
        sharesFileData0.setInsiderOwnership("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        sharesFileData0.setInsiderSellShrs("Cash File Data");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0]");
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00381");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setInstShareholders("");
        sharesFileData0.setVolume3m("");
        sharesFileData0.setDollar3m("");
        int int7 = sharesFileData0.getInsiderBuyShrs();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData8);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData10 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str11 = estimateFileData10.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData12 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData12.setInsiderNetPercentOutstanding("");
        double[] doubleArray15 = sharesFileData12.getSharesQ();
        sharesFileData12.setInsiderBuys("");
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData22 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList20);
        double[] doubleArray23 = incSheetFileData22.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData24 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData25 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData24);
        double[] doubleArray26 = balSheetFileData25.getOtherLtLiabYr();
        double[] doubleArray27 = balSheetFileData25.getStDebtQtr();
        double[] doubleArray28 = balSheetFileData25.getInventoryYr();
        java.lang.String str29 = balSheetFileData25.toString();
        double[] doubleArray30 = balSheetFileData25.getNetFixedAssetsYr();
        double[] doubleArray31 = balSheetFileData25.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData32 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData35 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData9, estimateFileData10, sharesFileData12, incSheetFileData22, balSheetFileData25, cashFileData32, (int) (short) 100, (int) (byte) 100);
        java.lang.String str36 = fieldData35.getStreet();
        double[] doubleArray37 = fieldData35.getOtherLtAssetsYr();
        double[] doubleArray38 = fieldData35.getSharesQ();
        sharesFileData0.setSharesQ(doubleArray38);
        java.lang.String str40 = sharesFileData0.getIndustry();
        sharesFileData0.setFloatshr("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : NONE\r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : NONE\r\n  phone     : null\r\n  web       : null\r\n");
        double[] doubleArray43 = sharesFileData0.getSharesY();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0]");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(incSheetFileData22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(doubleArray26);
        org.junit.Assert.assertNull(doubleArray27);
        org.junit.Assert.assertNull(doubleArray28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNull(doubleArray30);
        org.junit.Assert.assertNull(doubleArray31);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(doubleArray37);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[0.0]");
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[0.0]");
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00382");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readSipData("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00383");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getGrossIncQtr();
        double[] doubleArray3 = incSheetFileData1.getAdjToIncYr();
        double[] doubleArray4 = incSheetFileData1.getEpsDilContQtr();
        double[] doubleArray5 = incSheetFileData1.getNonrecurringItemsQtr();
        double[] doubleArray6 = incSheetFileData1.getIncTaxYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00384");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        java.lang.String str28 = fieldData27.getStreet();
        double[] doubleArray29 = fieldData27.getPrefStockYr();
        java.lang.Class<?> wildcardClass30 = fieldData27.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00385");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "out/BigDB/", "NONE", "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n", "NONE", "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n", "Cash File Data" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData10 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList8);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData11 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList8);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData12 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList8);
        int int13 = sharesFileData12.getInsiderSells();
        int int14 = sharesFileData12.getInstShareholders();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(cashFileData10);
        org.junit.Assert.assertNotNull(sharesFileData11);
        org.junit.Assert.assertNotNull(sharesFileData12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00386");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getGrossIncQtr();
        double[] doubleArray3 = incSheetFileData1.getAdjToIncYr();
        double[] doubleArray4 = incSheetFileData1.getEpsYr();
        java.lang.String str5 = incSheetFileData1.getName();
        double[] doubleArray6 = incSheetFileData1.getNonrecurringItemsQtr();
        double[] doubleArray7 = incSheetFileData1.getGrossOpIncQtr();
        java.lang.String str8 = incSheetFileData1.toString();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00387");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        java.lang.String str28 = fieldData27.getStreet();
        double[] doubleArray29 = fieldData27.getTotalOpExpQtr();
        double double30 = fieldData27.getEpsY0();
        double[] doubleArray31 = fieldData27.getInventoryQtr();
        double[] doubleArray32 = fieldData27.getBvpsQtr();
        double double33 = fieldData27.getEpsQ1();
        double[] doubleArray34 = fieldData27.getNetIncQtr();
        double[] doubleArray35 = fieldData27.getGoodwillYr();
        double[] doubleArray36 = fieldData27.getOtherLtAssetsQtr();
        double[] doubleArray37 = fieldData27.getIncAfterTaxQtr();
        double[] doubleArray38 = fieldData27.getOtherLtAssetsQtr();
        double[] doubleArray39 = fieldData27.getLtInvestQtr();
        double[] doubleArray40 = fieldData27.getAdjToIncYr();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNull(doubleArray31);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNull(doubleArray34);
        org.junit.Assert.assertNull(doubleArray35);
        org.junit.Assert.assertNull(doubleArray36);
        org.junit.Assert.assertNull(doubleArray37);
        org.junit.Assert.assertNull(doubleArray38);
        org.junit.Assert.assertNull(doubleArray39);
        org.junit.Assert.assertNull(doubleArray40);
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00388");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n", "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n", "Cash File Data", "data/BigDB/", "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : NONE\r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n" };
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
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00389");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        int int2 = companyFileData1.getNumEmployees();
        java.lang.String str3 = companyFileData1.getWeb();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00390");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        java.lang.String str28 = fieldData27.getStreet();
        double[] doubleArray29 = fieldData27.getOtherLtAssetsQtr();
        double[] doubleArray30 = fieldData27.getTotalOpExpYr();
        double double31 = fieldData27.getEpsY0();
        double[] doubleArray32 = fieldData27.getOtherCurrLiabQtr();
        double[] doubleArray33 = fieldData27.getEpsDilContQtr();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertNull(doubleArray30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertNull(doubleArray33);
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00391");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setInstShareholders("");
        java.lang.String str3 = sharesFileData0.getTicker();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum4 = sharesFileData0.getExchange();
        java.lang.String str5 = sharesFileData0.toDbOutput();
        java.lang.String str6 = sharesFileData0.getName();
        long long7 = sharesFileData0.getVolume10d();
        double[] doubleArray8 = sharesFileData0.getSharesY();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getTtm(doubleArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(exchEnum4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n" + "'", str5, "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0]");
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00392");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        java.lang.String str28 = fieldData27.getStreet();
        double[] doubleArray29 = fieldData27.getTotalOpExpQtr();
        double double30 = fieldData27.getEpsY0();
        java.lang.String str31 = fieldData27.getSic();
        java.lang.String str32 = fieldData27.getName();
        java.lang.String str33 = fieldData27.getZip();
        double[] doubleArray34 = fieldData27.getOtherCurrLiabQtr();
        int int35 = fieldData27.getInstShareholders();
        double[] doubleArray36 = fieldData27.getNetIncQtr();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(doubleArray34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(doubleArray36);
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00393");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        java.lang.String str28 = fieldData27.getStreet();
        double[] doubleArray29 = fieldData27.getOtherLtAssetsQtr();
        double[] doubleArray30 = fieldData27.getTotalOpExpYr();
        double double31 = fieldData27.getEpsY0();
        double[] doubleArray32 = fieldData27.getIncPrimaryEpsQtr();
        double[] doubleArray33 = fieldData27.getLiabEquityYr();
        boolean boolean34 = fieldData27.isDrp();
        double[] doubleArray35 = fieldData27.getSalesYr();
        double[] doubleArray36 = fieldData27.getIntExpNonOpYr();
        double[] doubleArray37 = fieldData27.getLtInvestQtr();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertNull(doubleArray30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertNull(doubleArray33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(doubleArray35);
        org.junit.Assert.assertNull(doubleArray36);
        org.junit.Assert.assertNull(doubleArray37);
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00394");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        java.lang.String str28 = fieldData27.getStreet();
        double[] doubleArray29 = fieldData27.getTotalOpExpQtr();
        double double30 = fieldData27.getEpsY0();
        double[] doubleArray31 = fieldData27.getInventoryQtr();
        double[] doubleArray32 = fieldData27.getBvpsQtr();
        double double33 = fieldData27.getEpsQ1();
        double[] doubleArray34 = fieldData27.getNetIncQtr();
        double[] doubleArray35 = fieldData27.getEpsContYr();
        double[] doubleArray36 = fieldData27.getGrossOpIncYr();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNull(doubleArray31);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNull(doubleArray34);
        org.junit.Assert.assertNull(doubleArray35);
        org.junit.Assert.assertNull(doubleArray36);
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00395");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getGrossIncQtr();
        double[] doubleArray3 = incSheetFileData1.getAdjToIncYr();
        double[] doubleArray4 = incSheetFileData1.getAdjToIncQtr();
        double[] doubleArray5 = incSheetFileData1.getEpsYr();
        double[] doubleArray6 = incSheetFileData1.getNetIncYr();
        double[] doubleArray7 = incSheetFileData1.getNetIncQtr();
        double[] doubleArray8 = incSheetFileData1.getTotalOpExpYr();
        double[] doubleArray9 = incSheetFileData1.getEpsContQtr();
        double[] doubleArray10 = incSheetFileData1.getIncTaxQtr();
        double[] doubleArray11 = incSheetFileData1.getPreTaxIncQtr();
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
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00396");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum1 = estimateFileData0.getExchange();
        java.lang.String str2 = estimateFileData0.getName();
        net.ajaskey.common.DateTime dateTime3 = estimateFileData0.getLatestQtrEps();
        net.ajaskey.common.DateTime dateTime4 = estimateFileData0.getLatestQtrEps();
        java.lang.String str5 = estimateFileData0.getSector();
        org.junit.Assert.assertNull(exchEnum1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(dateTime3);
        org.junit.Assert.assertNull(dateTime4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00397");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FiletypeEnum filetypeEnum2 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.setQMemory((int) '#', (int) (short) 100, filetypeEnum2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00398");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FiletypeEnum filetypeEnum2 = null;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getQFromDb((int) (byte) 100, (int) (short) 10, filetypeEnum2);
        org.junit.Assert.assertNull(fieldDataList3);
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00399");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        java.lang.String str28 = fieldData27.getStreet();
        double[] doubleArray29 = fieldData27.getOtherLtAssetsYr();
        double[] doubleArray30 = fieldData27.getCashFromOpsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData31 = fieldData27.getIncSheetData();
        double[] doubleArray32 = incSheetFileData31.getGrossOpIncYr();
        double[] doubleArray33 = incSheetFileData31.getGrossIncYr();
        java.lang.String str34 = incSheetFileData31.getIndustry();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertNull(doubleArray30);
        org.junit.Assert.assertNotNull(incSheetFileData31);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertNull(doubleArray33);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00400");
        java.lang.String[] strArray4 = new java.lang.String[] { "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : NONE\r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n", "out/BigDB/100/Q10/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-100Q10.Cash File Data", "out/BigDB/100/Q10/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-100Q10.Cash File Data", "Cash File Data" };
        java.lang.String[] strArray9 = new java.lang.String[] { "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n", "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : NONE\r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n", "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : NONE\r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n", "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : NONE\r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : NONE\r\n  phone     : null\r\n  web       : null\r\n" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData10 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(strArray4, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00401");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        double[] doubleArray28 = fieldData27.getIncTaxQtr();
        double[] doubleArray29 = fieldData27.getOtherLtLiabYr();
        double[] doubleArray30 = fieldData27.getCapExQtr();
        java.lang.String str31 = fieldData27.getState();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum32 = fieldData27.getExchange();
        double[] doubleArray33 = fieldData27.getLtDebtYr();
        double[] doubleArray34 = fieldData27.getCurrAssetsQtr();
        double[] doubleArray35 = fieldData27.getCurrAssetsYr();
        double[] doubleArray36 = fieldData27.getCogsYr();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(doubleArray28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertNull(doubleArray30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(exchEnum32);
        org.junit.Assert.assertNull(doubleArray33);
        org.junit.Assert.assertNull(doubleArray34);
        org.junit.Assert.assertNull(doubleArray35);
        org.junit.Assert.assertNull(doubleArray36);
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00402");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FiletypeEnum filetypeEnum3 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getFromDb("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : NONE\r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n", (int) (short) 1, (int) 'a', filetypeEnum3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00403");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        double[] doubleArray28 = incSheetFileData14.getIntExpNonOpYr();
        double[] doubleArray29 = incSheetFileData14.getEpsYr();
        double[] doubleArray30 = incSheetFileData14.getGrossIncQtr();
        double[] doubleArray31 = incSheetFileData14.getGrossOpIncQtr();
        double[] doubleArray32 = incSheetFileData14.getNetIncYr();
        double[] doubleArray33 = incSheetFileData14.getEpsDilQtr();
        double[] doubleArray34 = incSheetFileData14.getEpsContYr();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(doubleArray28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertNull(doubleArray30);
        org.junit.Assert.assertNull(doubleArray31);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertNull(doubleArray33);
        org.junit.Assert.assertNull(doubleArray34);
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00404");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setNumEmployees("hi!");
        companyFileData1.setZip("NONE");
        companyFileData1.setSnpIndex("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        companyFileData1.setTicker("");
        companyFileData1.setState("");
        companyFileData1.setIndustry("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00405");
        java.lang.String[] strArray3 = new java.lang.String[] { "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n", "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : NONE\r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n", "out/BigDB/100/Q10/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-100Q10.Cash File Data" };
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
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00406");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        double[] doubleArray28 = fieldData27.getTotalOpExpYr();
        double[] doubleArray29 = fieldData27.getOtherCurrLiabYr();
        double[] doubleArray30 = fieldData27.getGrossIncYr();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(doubleArray28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertNull(doubleArray30);
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00407");
        java.lang.String[] strArray3 = new java.lang.String[] { "Cash File Data", "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n", "out/BigDB/100/Q10/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-100Q10.Cash File Data" };
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
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00408");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getGrossIncQtr();
        double[] doubleArray3 = incSheetFileData1.getNetIncYr();
        double[] doubleArray4 = incSheetFileData1.getIntExpYr();
        double[] doubleArray5 = incSheetFileData1.getRdYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00409");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        java.lang.String str28 = fieldData27.getStreet();
        double[] doubleArray29 = fieldData27.getOtherLtAssetsYr();
        double[] doubleArray30 = fieldData27.getCashFromOpsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData31 = fieldData27.getIncSheetData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData32 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData31);
        double[] doubleArray33 = incSheetFileData32.getOtherIncYr();
        double[] doubleArray34 = incSheetFileData32.getGrossOpIncYr();
        double[] doubleArray35 = incSheetFileData32.getUnusualIncYr();
        double[] doubleArray36 = incSheetFileData32.getDepreciationQtr();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertNull(doubleArray30);
        org.junit.Assert.assertNotNull(incSheetFileData31);
        org.junit.Assert.assertNull(doubleArray33);
        org.junit.Assert.assertNull(doubleArray34);
        org.junit.Assert.assertNull(doubleArray35);
        org.junit.Assert.assertNull(doubleArray36);
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00410");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str1 = estimateFileData0.getName();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum2 = estimateFileData0.getExchange();
        double double3 = estimateFileData0.getEpsY1();
        double double4 = estimateFileData0.getEpsY2();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(exchEnum2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00411");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData> sharesFileDataList0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.setSfdList(sharesFileDataList0);
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00412");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        java.lang.String str28 = fieldData27.getStreet();
        double[] doubleArray29 = fieldData27.getStDebtQtr();
        double[] doubleArray30 = fieldData27.getEpsContQtr();
        double[] doubleArray31 = fieldData27.getCashFromOpsQtr();
        double[] doubleArray32 = fieldData27.getEpsContYr();
        double[] doubleArray33 = fieldData27.getCashYr();
        double double34 = fieldData27.getEpsQ1();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertNull(doubleArray30);
        org.junit.Assert.assertNull(doubleArray31);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertNull(doubleArray33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00413");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        java.lang.String str28 = fieldData27.getStreet();
        double[] doubleArray29 = fieldData27.getStDebtQtr();
        double[] doubleArray30 = fieldData27.getLtDebtYr();
        double[] doubleArray31 = fieldData27.getCurrAssetsQtr();
        double double32 = fieldData27.getPrice52hi();
        double[] doubleArray33 = fieldData27.getLiabEquityYr();
        java.lang.String str34 = fieldData27.getCountry();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertNull(doubleArray30);
        org.junit.Assert.assertNull(doubleArray31);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertNull(doubleArray33);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00414");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getOtherLtLiabYr();
        double[] doubleArray3 = balSheetFileData1.getStDebtQtr();
        double[] doubleArray4 = balSheetFileData1.getInventoryYr();
        double[] doubleArray5 = balSheetFileData1.getCurrAssetsYr();
        double[] doubleArray6 = balSheetFileData1.getTotalLiabQtr();
        double[] doubleArray7 = balSheetFileData1.getPrefStockYr();
        double[] doubleArray8 = balSheetFileData1.getOtherLtAssetsQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00415");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getOtherCurrLiabQtr();
        double[] doubleArray3 = balSheetFileData1.getPrefStockYr();
        double[] doubleArray4 = balSheetFileData1.getStInvestYr();
        double[] doubleArray5 = balSheetFileData1.getGoodwillYr();
        java.lang.String str6 = balSheetFileData1.toString();
        double[] doubleArray7 = balSheetFileData1.getEquityYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00416");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        java.lang.String str28 = fieldData27.getStreet();
        boolean boolean29 = fieldData27.isDrp();
        double[] doubleArray30 = fieldData27.getCashFromOpsQtr();
        double[] doubleArray31 = fieldData27.getInventoryYr();
        double[] doubleArray32 = fieldData27.getOtherCurrLiabYr();
        double[] doubleArray33 = fieldData27.getLtDebtYr();
        java.lang.String str34 = fieldData27.getSector();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(doubleArray30);
        org.junit.Assert.assertNull(doubleArray31);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertNull(doubleArray33);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00417");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.find("data/BigDB/");
        org.junit.Assert.assertNull(incSheetFileData1);
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00418");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        java.lang.String str28 = fieldData27.getStreet();
        double[] doubleArray29 = fieldData27.getStDebtQtr();
        double[] doubleArray30 = fieldData27.getEpsContQtr();
        double[] doubleArray31 = fieldData27.getOtherLtAssetsYr();
        double[] doubleArray32 = fieldData27.getNetIncYr();
        double[] doubleArray33 = fieldData27.getInventoryYr();
        double[] doubleArray34 = fieldData27.getDividendYr();
        double[] doubleArray35 = fieldData27.getPreTaxIncQtr();
        double[] doubleArray36 = fieldData27.getOtherLtAssetsQtr();
        double[] doubleArray37 = fieldData27.getOtherLtLiabYr();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertNull(doubleArray30);
        org.junit.Assert.assertNull(doubleArray31);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertNull(doubleArray33);
        org.junit.Assert.assertNull(doubleArray34);
        org.junit.Assert.assertNull(doubleArray35);
        org.junit.Assert.assertNull(doubleArray36);
        org.junit.Assert.assertNull(doubleArray37);
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00419");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        java.lang.String str28 = fieldData27.getStreet();
        double[] doubleArray29 = fieldData27.getTotalOpExpQtr();
        double double30 = fieldData27.getEpsY0();
        double[] doubleArray31 = fieldData27.getInventoryQtr();
        double[] doubleArray32 = fieldData27.getLtInvestYr();
        double[] doubleArray33 = fieldData27.getPrefStockQtr();
        double[] doubleArray34 = fieldData27.getCogsYr();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNull(doubleArray31);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertNull(doubleArray33);
        org.junit.Assert.assertNull(doubleArray34);
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00420");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        java.lang.String str28 = fieldData27.getStreet();
        double[] doubleArray29 = fieldData27.getTotalOpExpQtr();
        double double30 = fieldData27.getEpsY0();
        double[] doubleArray31 = fieldData27.getNetIncYr();
        int int32 = fieldData27.getInsiderSellShrs();
        java.lang.String str33 = fieldData27.getSnpIndexStr();
        double double34 = fieldData27.getEpsY0();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNull(doubleArray31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00421");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getGoodwillQtr();
        double[] doubleArray3 = balSheetFileData1.getInventoryYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00422");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        java.lang.String str28 = fieldData27.getStreet();
        double[] doubleArray29 = fieldData27.getTotalOpExpQtr();
        double double30 = fieldData27.getEpsY0();
        int int31 = fieldData27.getInsiderSells();
        java.lang.String str32 = fieldData27.getSector();
        double[] doubleArray33 = fieldData27.getGoodwillYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SnpEnum snpEnum34 = fieldData27.getSnpIndex();
        double[] doubleArray35 = fieldData27.getNonrecurringItemsYr();
        double[] doubleArray36 = fieldData27.getSalesQtr();
        double[] doubleArray37 = fieldData27.getIncPrimaryEpsQtr();
        double[] doubleArray38 = fieldData27.getOtherLtAssetsYr();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(doubleArray33);
        org.junit.Assert.assertNull(snpEnum34);
        org.junit.Assert.assertNull(doubleArray35);
        org.junit.Assert.assertNull(doubleArray36);
        org.junit.Assert.assertNull(doubleArray37);
        org.junit.Assert.assertNull(doubleArray38);
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00423");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        java.lang.String str28 = fieldData27.getStreet();
        double[] doubleArray29 = fieldData27.getTotalOpExpQtr();
        double double30 = fieldData27.getEpsY0();
        double[] doubleArray31 = fieldData27.getInventoryQtr();
        double[] doubleArray32 = fieldData27.getBvpsQtr();
        double double33 = fieldData27.getEpsQ1();
        double[] doubleArray34 = fieldData27.getOtherLtLiabYr();
        int int35 = fieldData27.getYear();
        double[] doubleArray36 = fieldData27.getStInvestQtr();
        double double37 = fieldData27.getPrice52lo();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNull(doubleArray31);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNull(doubleArray34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
        org.junit.Assert.assertNull(doubleArray36);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00424");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getOtherLtLiabYr();
        double[] doubleArray3 = balSheetFileData1.getStDebtQtr();
        double[] doubleArray4 = balSheetFileData1.getLtInvestQtr();
        double[] doubleArray5 = balSheetFileData1.getTotalAssetsYr();
        double[] doubleArray6 = balSheetFileData1.getOtherCurrLiabYr();
        double[] doubleArray7 = balSheetFileData1.getLtDebtQtr();
        double[] doubleArray8 = balSheetFileData1.getStDebtYr();
        java.lang.Class<?> wildcardClass9 = balSheetFileData1.getClass();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00425");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getGrossIncQtr();
        double[] doubleArray3 = incSheetFileData1.getRdQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum4 = incSheetFileData1.getExchange();
        double[] doubleArray5 = incSheetFileData1.getEpsYr();
        double[] doubleArray6 = incSheetFileData1.getRdQtr();
        double[] doubleArray7 = incSheetFileData1.getAdjToIncYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(exchEnum4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00426");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setInsiderNetPercentOutstanding("");
        double[] doubleArray3 = sharesFileData0.getSharesQ();
        int int4 = sharesFileData0.getInsiderBuys();
        sharesFileData0.setFromReport((int) (byte) 0, (int) (byte) 10);
        int int8 = sharesFileData0.getInstBuyShrs();
        int int9 = sharesFileData0.getInstBuyShrs();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00427");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getGrossIncQtr();
        double[] doubleArray3 = incSheetFileData1.getAdjToIncYr();
        double[] doubleArray4 = incSheetFileData1.getUnusualIncYr();
        double[] doubleArray5 = incSheetFileData1.getIncTaxYr();
        double[] doubleArray6 = incSheetFileData1.getNetIncYr();
        double[] doubleArray7 = incSheetFileData1.getEpsYr();
        double[] doubleArray8 = incSheetFileData1.getIncAfterTaxYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00428");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getOtherLtLiabYr();
        double[] doubleArray3 = balSheetFileData1.getStDebtQtr();
        double[] doubleArray4 = balSheetFileData1.getNetFixedAssetsYr();
        java.lang.String str5 = balSheetFileData1.getSector();
        java.lang.String str6 = balSheetFileData1.getTicker();
        double[] doubleArray7 = balSheetFileData1.getTotalAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData8);
        boolean boolean10 = companyFileData9.isDrp();
        companyFileData9.setDowIndex("");
        balSheetFileData1.setNameFields(companyFileData9);
        companyFileData9.setDrp("NONE");
        companyFileData9.setPhone("hi!");
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00429");
        java.lang.String[] strArray1 = new java.lang.String[] { "ticker      : \r\n  name      : hi!\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : NONE\r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : hi!\r\n  phone     : data/BigDB/\r\n  web       : null\r\n" };
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
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00430");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getOtherCurrLiabQtr();
        double[] doubleArray3 = balSheetFileData1.getAcctRxQtr();
        double[] doubleArray4 = balSheetFileData1.getPrefStockQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00431");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getOtherLtLiabYr();
        double[] doubleArray3 = balSheetFileData1.getStDebtQtr();
        double[] doubleArray4 = balSheetFileData1.getInventoryYr();
        double[] doubleArray5 = balSheetFileData1.getCurrAssetsYr();
        double[] doubleArray6 = balSheetFileData1.getInventoryQtr();
        double[] doubleArray7 = balSheetFileData1.getBvpsYr();
        double[] doubleArray8 = balSheetFileData1.getTotalLiabYr();
        double[] doubleArray9 = balSheetFileData1.getCashYr();
        double[] doubleArray10 = balSheetFileData1.getTotalLiabYr();
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
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00432");
        java.lang.String[] strArray5 = new java.lang.String[] { "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n", "NONE", "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : NONE\r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n", "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : NONE\r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n", "data/BigDB/" };
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
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00433");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        java.lang.String str28 = fieldData27.getStreet();
        double[] doubleArray29 = fieldData27.getTotalOpExpQtr();
        double double30 = fieldData27.getEpsY0();
        int int31 = fieldData27.getInsiderSells();
        double double32 = fieldData27.getEpsQ1();
        double[] doubleArray33 = fieldData27.getOtherLtLiabYr();
        double[] doubleArray34 = fieldData27.getIncTaxYr();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertNull(doubleArray33);
        org.junit.Assert.assertNull(doubleArray34);
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00434");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.find("out/BigDB/");
        org.junit.Assert.assertNull(incSheetFileData1);
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00435");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readSipData("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : NONE\r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n", "out/BigDB/10/Q100/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-10Q100.NONE");
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00436");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getFromMemory("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : NONE\r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : NONE\r\n  phone     : null\r\n  web       : null\r\n", (int) (byte) -1, 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00437");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        java.lang.String str28 = fieldData27.getStreet();
        double[] doubleArray29 = fieldData27.getTotalOpExpQtr();
        double double30 = fieldData27.getEpsY0();
        fieldData27.setQuarter((int) (byte) 100);
        double[] doubleArray33 = fieldData27.getIncTaxYr();
        double[] doubleArray34 = fieldData27.getInventoryQtr();
        double[] doubleArray35 = fieldData27.getDividendQtr();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNull(doubleArray33);
        org.junit.Assert.assertNull(doubleArray34);
        org.junit.Assert.assertNull(doubleArray35);
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00438");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readSipData("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n", "out/BigDB/100/Q10/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-100Q10.Cash File Data");
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00439");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readSipData("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00440");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setNumEmployees("hi!");
        java.lang.String str4 = companyFileData1.getState();
        java.lang.String str5 = companyFileData1.getCity();
        companyFileData1.setDowIndex("Cash File Data");
        companyFileData1.setWeb("");
        java.lang.String str10 = companyFileData1.getSector();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00441");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setNumEmployees("hi!");
        java.lang.String str4 = companyFileData1.getPhone();
        java.lang.String str5 = companyFileData1.getIndustry();
        java.lang.String str6 = companyFileData1.toDbOuput();
        java.lang.String str7 = companyFileData1.getSector();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n" + "'", str6, "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00442");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str8 = estimateFileData7.getTicker();
        net.ajaskey.common.DateTime dateTime9 = estimateFileData7.getCurrFiscalYear();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData10 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData7);
        java.lang.String str11 = estimateFileData10.toString();
        java.lang.String str12 = estimateFileData10.getIndustry();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(incSheetFileData4);
        org.junit.Assert.assertNotNull(cashFileData5);
        org.junit.Assert.assertNotNull(incSheetFileData6);
        org.junit.Assert.assertNotNull(estimateFileData7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(dateTime9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00443");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getFromMemory("", (int) (short) 0, (int) (short) 100);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00444");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readSipData("Cash File Data");
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00445");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.setMemory((int) (short) 0, (int) (byte) 1, filetypeEnum2);
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00446");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        java.lang.String str28 = fieldData27.getStreet();
        double[] doubleArray29 = fieldData27.getStDebtQtr();
        double[] doubleArray30 = fieldData27.getLtDebtYr();
        double[] doubleArray31 = fieldData27.getTotalOpExpYr();
        fieldData27.setQuarter((int) '#');
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData34 = fieldData27.getCashData();
        double[] doubleArray35 = cashFileData34.getCashFromInvQtr();
        double[] doubleArray36 = cashFileData34.getCashFromInvQtr();
        double[] doubleArray37 = cashFileData34.getCashFromOpsQtr();
        java.lang.String str38 = cashFileData34.toDbOutput();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertNull(doubleArray30);
        org.junit.Assert.assertNull(doubleArray31);
        org.junit.Assert.assertNotNull(cashFileData34);
        org.junit.Assert.assertNull(doubleArray35);
        org.junit.Assert.assertNull(doubleArray36);
        org.junit.Assert.assertNull(doubleArray37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00447");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setInstShareholders("");
        java.lang.String str3 = sharesFileData0.getTicker();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum4 = sharesFileData0.getExchange();
        java.lang.String str5 = sharesFileData0.toDbOutput();
        sharesFileData0.setInsiderNetPercentOutstanding("out/BigDB/");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData8.setInsiderNetPercentOutstanding("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(exchEnum4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n" + "'", str5, "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00448");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        java.lang.String str1 = sharesFileData0.getName();
        java.lang.String str2 = sharesFileData0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00449");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        java.lang.String str28 = fieldData27.getStreet();
        boolean boolean29 = fieldData27.isDrp();
        double[] doubleArray30 = fieldData27.getCashFromOpsQtr();
        double[] doubleArray31 = fieldData27.getInventoryYr();
        double[] doubleArray32 = fieldData27.getOtherCurrLiabYr();
        double[] doubleArray33 = fieldData27.getGrossIncYr();
        int int34 = fieldData27.getNumEmployees();
        double[] doubleArray35 = fieldData27.getIntExpQtr();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(doubleArray30);
        org.junit.Assert.assertNull(doubleArray31);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertNull(doubleArray33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNull(doubleArray35);
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00450");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        java.lang.String str28 = fieldData27.getStreet();
        double[] doubleArray29 = fieldData27.getTotalOpExpQtr();
        double double30 = fieldData27.getEpsY0();
        double double31 = fieldData27.getEpsQ0();
        double[] doubleArray32 = fieldData27.getLtDebtQtr();
        double[] doubleArray33 = fieldData27.getLtDebtQtr();
        java.lang.String str34 = fieldData27.getZip();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertNull(doubleArray33);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00451");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        java.lang.String str28 = fieldData27.getStreet();
        double[] doubleArray29 = fieldData27.getStDebtQtr();
        double[] doubleArray30 = fieldData27.getLtDebtYr();
        double[] doubleArray31 = fieldData27.getCurrAssetsQtr();
        double double32 = fieldData27.getEpsQ0();
        double[] doubleArray33 = fieldData27.getDividendYr();
        double[] doubleArray34 = fieldData27.getPrefStockQtr();
        double[] doubleArray35 = fieldData27.getGoodwillYr();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertNull(doubleArray30);
        org.junit.Assert.assertNull(doubleArray31);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertNull(doubleArray33);
        org.junit.Assert.assertNull(doubleArray34);
        org.junit.Assert.assertNull(doubleArray35);
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00452");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.find("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : NONE\r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        org.junit.Assert.assertNull(balSheetFileData1);
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00453");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setInstShareholders("");
        sharesFileData0.setVolume3m("");
        sharesFileData0.setDollar3m("");
        sharesFileData0.setDollar3m("hi!");
        double double9 = sharesFileData0.getPrice();
        double double10 = sharesFileData0.getInstOwnership();
        double double11 = sharesFileData0.getPrice52lo();
        java.lang.Class<?> wildcardClass12 = sharesFileData0.getClass();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00454");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        java.lang.String str28 = fieldData27.getStreet();
        double[] doubleArray29 = fieldData27.getTotalOpExpQtr();
        double double30 = fieldData27.getEpsY0();
        java.lang.String str31 = fieldData27.getSic();
        java.lang.String str32 = fieldData27.getName();
        java.lang.String str33 = fieldData27.getZip();
        int int34 = fieldData27.getInsiderBuyShrs();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00455");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        java.lang.String str28 = fieldData27.getStreet();
        double[] doubleArray29 = fieldData27.getTotalOpExpQtr();
        double[] doubleArray30 = fieldData27.getDepreciationYr();
        java.lang.String str31 = fieldData27.getSector();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData32 = fieldData27.getCompanyInfo();
        double double33 = fieldData27.getEpsQ1();
        double[] doubleArray34 = fieldData27.getLiabEquityYr();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertNull(doubleArray30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(companyFileData32);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNull(doubleArray34);
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00456");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        java.lang.String str28 = fieldData27.getStreet();
        double[] doubleArray29 = fieldData27.getTotalOpExpQtr();
        double double30 = fieldData27.getEpsY0();
        int int31 = fieldData27.getInsiderSells();
        double[] doubleArray32 = fieldData27.getOtherLtAssetsYr();
        long long33 = fieldData27.getVolumeMonth3m();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData34 = fieldData27.getShares();
        sharesFileData34.setFloatshr("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        java.lang.String str37 = sharesFileData34.toDbOutput();
        sharesFileData34.setInstSellShrs("hi!");
        double double40 = sharesFileData34.getPrice52lo();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNotNull(sharesFileData34);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n" + "'", str37, "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00457");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData1);
        companyFileData2.setNumEmployees("hi!");
        java.lang.String str5 = companyFileData2.getPhone();
        estimateFileData0.setNameFields(companyFileData2);
        java.lang.String str7 = companyFileData2.getStreet();
        companyFileData2.setPhone("data/BigDB/");
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum10 = companyFileData2.getExchange();
        net.ajaskey.market.tools.SIP.BigDB.dataio.DowEnum dowEnum11 = companyFileData2.getDowIndex();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(exchEnum10);
        org.junit.Assert.assertNull(dowEnum11);
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00458");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setFromReport((int) (byte) 0, 0);
        int int4 = sharesFileData0.getInsiderNetTrades();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00459");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        java.lang.String str28 = fieldData27.getStreet();
        double[] doubleArray29 = fieldData27.getStDebtQtr();
        double[] doubleArray30 = fieldData27.getLtDebtYr();
        double[] doubleArray31 = fieldData27.getCurrAssetsQtr();
        double double32 = fieldData27.getPrice52hi();
        int int33 = fieldData27.getInsiderBuyShrs();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertNull(doubleArray30);
        org.junit.Assert.assertNull(doubleArray31);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00460");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setInsiderNetPercentOutstanding("");
        int int3 = sharesFileData0.getInstBuyShrs();
        double double4 = sharesFileData0.getPrice();
        sharesFileData0.setDollar3m("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : NONE\r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00461");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getOtherLtLiabYr();
        double[] doubleArray3 = balSheetFileData1.getStDebtQtr();
        double[] doubleArray4 = balSheetFileData1.getLtInvestQtr();
        double[] doubleArray5 = balSheetFileData1.getLiabEquityQtr();
        double[] doubleArray6 = balSheetFileData1.getCurrLiabYr();
        double[] doubleArray7 = balSheetFileData1.getInventoryYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00462");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.find("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        org.junit.Assert.assertNull(companyFileData1);
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00463");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setInstShareholders("");
        sharesFileData0.setVolume3m("");
        sharesFileData0.setDollar3m("");
        int int7 = sharesFileData0.getInsiderBuyShrs();
        double double8 = sharesFileData0.getPrice();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00464");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        java.lang.String str28 = fieldData27.getStreet();
        boolean boolean29 = fieldData27.isDrp();
        double[] doubleArray30 = fieldData27.getCashFromOpsQtr();
        double[] doubleArray31 = fieldData27.getInventoryYr();
        double[] doubleArray32 = fieldData27.getOtherCurrLiabYr();
        double[] doubleArray33 = fieldData27.getGrossIncYr();
        int int34 = fieldData27.getNumEmployees();
        double[] doubleArray35 = fieldData27.getEpsDilYr();
        double[] doubleArray36 = fieldData27.getRdQtr();
        double[] doubleArray37 = fieldData27.getEpsYr();
        double[] doubleArray38 = fieldData27.getOtherLtAssetsQtr();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(doubleArray30);
        org.junit.Assert.assertNull(doubleArray31);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertNull(doubleArray33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNull(doubleArray35);
        org.junit.Assert.assertNull(doubleArray36);
        org.junit.Assert.assertNull(doubleArray37);
        org.junit.Assert.assertNull(doubleArray38);
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00465");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getAcctRxQtr();
        double[] doubleArray3 = balSheetFileData1.getStInvestQtr();
        double[] doubleArray4 = balSheetFileData1.getOtherLtLiabYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00466");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        java.lang.String str28 = fieldData27.getStreet();
        double[] doubleArray29 = fieldData27.getTotalOpExpQtr();
        double double30 = fieldData27.getEpsY0();
        double[] doubleArray31 = fieldData27.getInventoryQtr();
        double[] doubleArray32 = fieldData27.getLtInvestYr();
        double[] doubleArray33 = fieldData27.getDividendQtr();
        java.lang.String str34 = fieldData27.getZip();
        double[] doubleArray35 = fieldData27.getEpsDilContQtr();
        double[] doubleArray36 = fieldData27.getOtherIncQtr();
        java.lang.String str37 = fieldData27.getWeb();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNull(doubleArray31);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertNull(doubleArray33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(doubleArray35);
        org.junit.Assert.assertNull(doubleArray36);
        org.junit.Assert.assertNull(str37);
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00467");
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum1 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.convertExchange("out/BigDB/");
        org.junit.Assert.assertTrue("'" + exchEnum1 + "' != '" + net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum.NONE + "'", exchEnum1.equals(net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum.NONE));
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00468");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        java.lang.String str28 = fieldData27.getStreet();
        boolean boolean29 = fieldData27.isDrp();
        double[] doubleArray30 = fieldData27.getCashFromOpsQtr();
        double[] doubleArray31 = fieldData27.getIncAfterTaxQtr();
        double[] doubleArray32 = fieldData27.getOtherLtLiabQtr();
        double[] doubleArray33 = fieldData27.getEpsContYr();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(doubleArray30);
        org.junit.Assert.assertNull(doubleArray31);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertNull(doubleArray33);
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00469");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FiletypeEnum filetypeEnum2 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.parseSipData((int) (byte) 0, (int) (byte) 100, filetypeEnum2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00470");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getOtherLtLiabYr();
        double[] doubleArray3 = balSheetFileData1.getLiabEquityYr();
        double[] doubleArray4 = balSheetFileData1.getOtherCurrAssetsQtr();
        double[] doubleArray5 = balSheetFileData1.getAcctPayableYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData6 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData6);
        java.lang.String str8 = companyFileData7.getIndustry();
        companyFileData7.setSnpIndex("");
        companyFileData7.setPhone("hi!");
        companyFileData7.setDowIndex("");
        java.lang.String str15 = companyFileData7.getState();
        balSheetFileData1.setNameFields(companyFileData7);
        companyFileData7.setName("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : NONE\r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00471");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getAcctRxQtr();
        double[] doubleArray3 = balSheetFileData1.getStInvestQtr();
        double[] doubleArray4 = balSheetFileData1.getOtherCurrLiabYr();
        java.lang.String str5 = balSheetFileData1.getExchange();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00472");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        java.lang.String str28 = fieldData27.getStreet();
        double[] doubleArray29 = fieldData27.getOtherLtAssetsQtr();
        double[] doubleArray30 = fieldData27.getTotalOpExpYr();
        double double31 = fieldData27.getEpsY0();
        double[] doubleArray32 = fieldData27.getOtherCurrLiabQtr();
        double[] doubleArray33 = fieldData27.getIncTaxYr();
        double[] doubleArray34 = fieldData27.getCurrLiabQtr();
        double[] doubleArray35 = fieldData27.getPrefStockQtr();
        int int36 = fieldData27.getInsiderSellShrs();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertNull(doubleArray30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertNull(doubleArray33);
        org.junit.Assert.assertNull(doubleArray34);
        org.junit.Assert.assertNull(doubleArray35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00473");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getOtherLtLiabYr();
        double[] doubleArray3 = balSheetFileData1.getStDebtQtr();
        double[] doubleArray4 = balSheetFileData1.getInventoryYr();
        double[] doubleArray5 = balSheetFileData1.getCurrAssetsYr();
        double[] doubleArray6 = balSheetFileData1.getGoodwillYr();
        java.lang.String str7 = balSheetFileData1.toString();
        double[] doubleArray8 = balSheetFileData1.getGoodwillYr();
        double[] doubleArray9 = balSheetFileData1.getLtDebtQtr();
        double[] doubleArray10 = balSheetFileData1.getOtherCurrLiabQtr();
        double[] doubleArray11 = balSheetFileData1.getEquityQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00474");
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
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00475");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        double double9 = estimateFileData8.getEpsY0();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(incSheetFileData4);
        org.junit.Assert.assertNotNull(cashFileData5);
        org.junit.Assert.assertNotNull(incSheetFileData6);
        org.junit.Assert.assertNotNull(sharesFileData7);
        org.junit.Assert.assertNotNull(estimateFileData8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00476");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray2 = incSheetFileData1.getGrossIncQtr();
        double[] doubleArray3 = incSheetFileData1.getAdjToIncYr();
        double[] doubleArray4 = incSheetFileData1.getIncTaxYr();
        double[] doubleArray5 = incSheetFileData1.getCogsQtr();
        double[] doubleArray6 = incSheetFileData1.getIntExpNonOpYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00477");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setNumEmployees("hi!");
        companyFileData1.setZip("NONE");
        companyFileData1.setSnpIndex("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        boolean boolean8 = companyFileData1.isAdr();
        java.lang.String str9 = companyFileData1.getZip();
        java.lang.String str10 = companyFileData1.getDowIndexStr();
        companyFileData1.setCity("out/BigDB/100/Q10/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-100Q10.Cash File Data");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "NONE" + "'", str9, "NONE");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00478");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        java.lang.String str2 = incSheetFileData1.toDbOutput();
        double[] doubleArray3 = incSheetFileData1.getPreTaxIncQtr();
        double[] doubleArray4 = incSheetFileData1.getSalesQtr();
        double[] doubleArray5 = incSheetFileData1.getGrossIncQtr();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00479");
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
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00480");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        java.lang.String str28 = fieldData27.getStreet();
        double[] doubleArray29 = fieldData27.getTotalOpExpQtr();
        double double30 = fieldData27.getEpsY0();
        int int31 = fieldData27.getInsiderSells();
        java.lang.String str32 = fieldData27.getSector();
        double double33 = fieldData27.getInstOwnership();
        double[] doubleArray34 = fieldData27.getOtherIncQtr();
        double[] doubleArray35 = fieldData27.getOtherCurrLiabQtr();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNull(doubleArray34);
        org.junit.Assert.assertNull(doubleArray35);
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00481");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        java.lang.String str28 = fieldData27.getStreet();
        double[] doubleArray29 = fieldData27.getStDebtQtr();
        double[] doubleArray30 = fieldData27.getEpsContQtr();
        double[] doubleArray31 = fieldData27.getOtherLtAssetsYr();
        double[] doubleArray32 = fieldData27.getIncAfterTaxYr();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertNull(doubleArray30);
        org.junit.Assert.assertNull(doubleArray31);
        org.junit.Assert.assertNull(doubleArray32);
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00482");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        java.lang.String str28 = fieldData27.getStreet();
        double[] doubleArray29 = fieldData27.getTotalOpExpQtr();
        double[] doubleArray30 = fieldData27.getStDebtYr();
        double[] doubleArray31 = fieldData27.getSharesQ();
        // The following exception was thrown during execution in test generation
        try {
            double double32 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getTtm(doubleArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertNull(doubleArray30);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0]");
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00483");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        java.lang.String str28 = fieldData27.getStreet();
        double[] doubleArray29 = fieldData27.getOtherLtAssetsQtr();
        double[] doubleArray30 = fieldData27.getTotalOpExpYr();
        double double31 = fieldData27.getEpsY0();
        double[] doubleArray32 = fieldData27.getIncPrimaryEpsQtr();
        double[] doubleArray33 = fieldData27.getLiabEquityYr();
        boolean boolean34 = fieldData27.isDrp();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData35 = fieldData27.getCashData();
        double[] doubleArray36 = fieldData27.getIntExpNonOpYr();
        double[] doubleArray37 = fieldData27.getPrefStockYr();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertNull(doubleArray30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertNull(doubleArray33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(cashFileData35);
        org.junit.Assert.assertNull(doubleArray36);
        org.junit.Assert.assertNull(doubleArray37);
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00484");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setInstShareholders("");
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum3 = sharesFileData0.getExchange();
        sharesFileData0.setMktCap("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        double double6 = sharesFileData0.getPrice52hi();
        java.lang.String str7 = sharesFileData0.getSector();
        int int8 = sharesFileData0.getInstSellShrs();
        org.junit.Assert.assertNull(exchEnum3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00485");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        java.lang.String str28 = fieldData27.getStreet();
        double[] doubleArray29 = fieldData27.getStDebtQtr();
        double[] doubleArray30 = fieldData27.getEpsContQtr();
        double[] doubleArray31 = fieldData27.getPrefStockYr();
        java.lang.String str32 = fieldData27.getWeb();
        int int33 = fieldData27.getInsiderBuyShrs();
        double double34 = fieldData27.getInsiderNetPercentOutstanding();
        double[] doubleArray35 = fieldData27.getIncTaxYr();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertNull(doubleArray30);
        org.junit.Assert.assertNull(doubleArray31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertNull(doubleArray35);
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00486");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getFromMemory("Cash File Data", (int) (byte) 10, (-1));
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00487");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        companyFileData1.setNumEmployees("hi!");
        java.lang.String str4 = companyFileData1.getState();
        companyFileData1.setPhone("data/BigDB/");
        companyFileData1.setAdr("NONE");
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum9 = companyFileData1.getExchange();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(exchEnum9);
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00488");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getOtherCurrLiabQtr();
        double[] doubleArray3 = balSheetFileData1.getStInvestYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00489");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setInstShareholders("");
        sharesFileData0.setDollar3m("data/BigDB/");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData5 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData0.setFloatshr("ticker      : \r\n  name      : hi!\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : NONE\r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : hi!\r\n  phone     : data/BigDB/\r\n  web       : null\r\n");
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00490");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) ' ', 0);
        java.lang.String str3 = fieldData2.getIndustry();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00491");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        java.lang.String str28 = fieldData27.getStreet();
        boolean boolean29 = fieldData27.isDrp();
        double double30 = fieldData27.getBeta();
        double[] doubleArray31 = fieldData27.getAcctRxQtr();
        java.lang.String str32 = fieldData27.getState();
        double[] doubleArray33 = fieldData27.getCashFromFinQtr();
        double double34 = fieldData27.getBeta();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNull(doubleArray31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(doubleArray33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00492");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setInsiderNetPercentOutstanding("");
        double[] doubleArray3 = sharesFileData0.getSharesQ();
        sharesFileData0.setInsiderBuys("");
        sharesFileData0.setInsiderBuyShrs("hi!");
        double double8 = sharesFileData0.getInsiderNetPercentOutstanding();
        int int9 = sharesFileData0.getInstSellShrs();
        double double10 = sharesFileData0.getPrice();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData11 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData11.setInsiderNetPercentOutstanding("");
        int int14 = sharesFileData11.getInstBuyShrs();
        sharesFileData11.setInsiderBuys("");
        double[] doubleArray17 = sharesFileData11.getSharesY();
        sharesFileData0.setSharesQ(doubleArray17);
        sharesFileData0.setFloatshr("data/BigDB/");
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0]");
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00493");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readSipData("Cash File Data", "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00494");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        java.lang.String str28 = fieldData27.getStreet();
        boolean boolean29 = fieldData27.isDrp();
        double[] doubleArray30 = fieldData27.getCashFromOpsQtr();
        double[] doubleArray31 = fieldData27.getRdQtr();
        double double32 = fieldData27.getPrice52hi();
        double[] doubleArray33 = fieldData27.getPrefStockYr();
        double[] doubleArray34 = fieldData27.getStDebtYr();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(doubleArray30);
        org.junit.Assert.assertNull(doubleArray31);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertNull(doubleArray33);
        org.junit.Assert.assertNull(doubleArray34);
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00495");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        java.lang.String str28 = fieldData27.getStreet();
        double[] doubleArray29 = fieldData27.getTotalOpExpQtr();
        double[] doubleArray30 = fieldData27.getDepreciationYr();
        java.lang.String str31 = fieldData27.getSector();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData32 = fieldData27.getCompanyInfo();
        double[] doubleArray33 = fieldData27.getNonrecurringItemsYr();
        double[] doubleArray34 = fieldData27.getLtDebtQtr();
        double[] doubleArray35 = fieldData27.getCurrAssetsYr();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertNull(doubleArray30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(companyFileData32);
        org.junit.Assert.assertNull(doubleArray33);
        org.junit.Assert.assertNull(doubleArray34);
        org.junit.Assert.assertNull(doubleArray35);
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00496");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setInsiderNetPercentOutstanding("");
        double[] doubleArray3 = sharesFileData0.getSharesQ();
        int int4 = sharesFileData0.getInsiderBuys();
        int int5 = sharesFileData0.getInsiderNetTrades();
        double double6 = sharesFileData0.getMktCap();
        long long7 = sharesFileData0.getVolume10d();
        int int8 = sharesFileData0.getInstBuyShrs();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum9 = sharesFileData0.getExchange();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(exchEnum9);
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00497");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        double[] doubleArray28 = fieldData27.getSharesY();
        // The following exception was thrown during execution in test generation
        try {
            double double29 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getTtm(doubleArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[0.0]");
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00498");
        java.lang.String[] strArray6 = new java.lang.String[] { "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : NONE\r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n", "ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n", "NONE", "out/BigDB/10/Q100/ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n-fundamental-data-10Q100.NONE", "data/BigDB/", "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n" };
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
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00499");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData();
        java.lang.String str3 = estimateFileData2.toDbOutput();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData4.setInsiderNetPercentOutstanding("");
        double[] doubleArray7 = sharesFileData4.getSharesQ();
        sharesFileData4.setInsiderBuys("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList12);
        double[] doubleArray15 = incSheetFileData14.getIncTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData16);
        double[] doubleArray18 = balSheetFileData17.getOtherLtLiabYr();
        double[] doubleArray19 = balSheetFileData17.getStDebtQtr();
        double[] doubleArray20 = balSheetFileData17.getInventoryYr();
        java.lang.String str21 = balSheetFileData17.toString();
        double[] doubleArray22 = balSheetFileData17.getNetFixedAssetsYr();
        double[] doubleArray23 = balSheetFileData17.getNetFixedAssetsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData24 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData1, estimateFileData2, sharesFileData4, incSheetFileData14, balSheetFileData17, cashFileData24, (int) (short) 100, (int) (byte) 100);
        java.lang.String str28 = fieldData27.getStreet();
        double[] doubleArray29 = fieldData27.getTotalOpExpQtr();
        double double30 = fieldData27.getEpsY0();
        int int31 = fieldData27.getInsiderSells();
        double[] doubleArray32 = fieldData27.getOtherLtAssetsYr();
        long long33 = fieldData27.getVolumeMonth3m();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData34 = fieldData27.getShares();
        sharesFileData34.setFloatshr("ticker      : \r\n  name      : null\r\n  exchange  : null\r\n  sector    : null\r\n  industry  : null\r\n  sic       : null\r\n  employees : 0\r\n  snp index : \r\n  dow index : \r\n  adr       : false\r\n  drp       : false\r\n  street    : null\r\n  city      : null\r\n  state     : null\r\n  country   : null\r\n  zip       : null\r\n  phone     : null\r\n  web       : null\r\n");
        java.lang.String str37 = sharesFileData34.toDbOutput();
        sharesFileData34.setInstSellShrs("hi!");
        double double40 = sharesFileData34.getInsiderNetPercentOutstanding();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNull(doubleArray19);
        org.junit.Assert.assertNull(doubleArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(doubleArray22);
        org.junit.Assert.assertNull(doubleArray23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNotNull(sharesFileData34);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n" + "'", str37, "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test00500");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setInstShareholders("");
        java.lang.String str3 = sharesFileData0.getTicker();
        net.ajaskey.market.tools.SIP.BigDB.dataio.ExchEnum exchEnum4 = sharesFileData0.getExchange();
        double double5 = sharesFileData0.getPrice();
        double double6 = sharesFileData0.getInsiderNetPercentOutstanding();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        sharesFileData0.setInstBuyShrs("NONE");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(exchEnum4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }
}

