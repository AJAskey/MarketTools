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
        int int0 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.getListCount();
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
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
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.find("");
        org.junit.Assert.assertNull(sharesFileData1);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0004");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData> companyFileDataList0 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.getList();
        org.junit.Assert.assertNotNull(companyFileDataList0);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0005");
        int int0 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.getListCount();
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0006");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getQFromDb((int) 'a', (int) 'a', filetypeEnum2);
        org.junit.Assert.assertNull(fieldDataList3);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0007");
        java.lang.String str4 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getOutfileName((int) (short) 10, (int) (byte) -1, "hi!", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "out/BigDB/10/Q-1/hi!-fundamental-data-10Q-1." + "'", str4, "out/BigDB/10/Q-1/hi!-fundamental-data-10Q-1.");
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0008");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.find("out/BigDB/10/Q-1/hi!-fundamental-data-10Q-1.");
        org.junit.Assert.assertNull(companyFileData1);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0009");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.Class<?> wildcardClass5 = estimateFileData4.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0010");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData> cashFileDataList0 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.getCashfdList();
        org.junit.Assert.assertNotNull(cashFileDataList0);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0011");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.find("");
        org.junit.Assert.assertNull(companyFileData1);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0012");
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
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0013");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readSipData("");
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0014");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "out/BigDB/10/Q-1/hi!-fundamental-data-10Q-1.", "out/BigDB/10/Q-1/hi!-fundamental-data-10Q-1.", "out/BigDB/10/Q-1/hi!-fundamental-data-10Q-1.", "hi!", "hi!" };
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
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0015");
        double[] doubleArray4 = new double[] { (byte) 1, (short) -1, 10.0f, 10L };
        // The following exception was thrown during execution in test generation
        try {
            double double5 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getTtm(doubleArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[1.0, -1.0, 10.0, 10.0]");
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0016");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str6 = companyFileData5.getCity();
        java.lang.String str7 = companyFileData5.getPhone();
        // The following exception was thrown during execution in test generation
        try {
            companyFileData5.setExchange("out/BigDB/10/Q-1/hi!-fundamental-data-10Q-1.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No enum constant net.ajaskey.market.tools.SIP.BigDB.ExchEnum.out/BigDB/10/Q-1/hi!-fundamental-data-10Q-1.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0017");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.find("out/BigDB/10/Q-1/hi!-fundamental-data-10Q-1.");
        org.junit.Assert.assertNull(incSheetFileData1);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0018");
        java.lang.String str0 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.listToString();
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "" + "'", str0, "");
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0019");
        java.lang.String str0 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.outbasedir;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "out/BigDB/" + "'", str0, "out/BigDB/");
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0020");
        int int0 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.getListCount();
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0021");
        int int0 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.getListCount();
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0022");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.clearList();
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0023");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        java.lang.String str2 = balSheetFileData1.getExchange();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0024");
        java.lang.String str4 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getOutfileName((int) (short) 0, (int) (short) 0, "", "out/BigDB/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "out/BigDB/0/Q0/-fundamental-data-0Q0.out/BigDB/" + "'", str4, "out/BigDB/0/Q0/-fundamental-data-0Q0.out/BigDB/");
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0025");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str6 = companyFileData5.getCity();
        java.lang.String str7 = companyFileData5.getPhone();
        java.lang.String str8 = companyFileData5.getWeb();
        java.lang.String str9 = companyFileData5.toString();
        // The following exception was thrown during execution in test generation
        try {
            companyFileData5.setExchange("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No enum constant net.ajaskey.market.tools.SIP.BigDB.ExchEnum.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0026");
        java.lang.String str0 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.listToString();
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "" + "'", str0, "");
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0027");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str6 = companyFileData5.getCity();
        java.lang.String str7 = companyFileData5.getPhone();
        java.lang.String str8 = companyFileData5.getWeb();
        java.lang.String str9 = companyFileData5.toString();
        companyFileData5.setCity("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0028");
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
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0029");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getIncPrimaryEpsQtr();
        double[] doubleArray2 = incSheetFileData0.getIntExpNonOpQtr();
        java.lang.String str3 = incSheetFileData0.toDbOutput();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0030");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.setMemory((int) (short) 1, 1, filetypeEnum2);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0031");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str5 = estimateFileData4.getSector();
        java.lang.String str6 = estimateFileData4.toDbOutput();
        java.lang.String str7 = estimateFileData4.toDbOutput();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0032");
        java.lang.String[] strArray1 = new java.lang.String[] { "out/BigDB/" };
        java.lang.String[] strArray5 = new java.lang.String[] { "", "out/BigDB/0/Q0/-fundamental-data-0Q0.out/BigDB/", "out/BigDB/" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(strArray1, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0033");
        java.lang.String[] strArray5 = new java.lang.String[] { "out/BigDB/", "out/BigDB/", "out/BigDB/0/Q0/-fundamental-data-0Q0.out/BigDB/", "hi!", "" };
        java.lang.String[] strArray10 = new java.lang.String[] { "out/BigDB/", "hi!", "out/BigDB/", "hi!" };
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
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0034");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readSipData("hi!");
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0035");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.find("hi!");
        org.junit.Assert.assertNull(sharesFileData1);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0036");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData> companyFileDataList0 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.getCfdList();
        org.junit.Assert.assertNotNull(companyFileDataList0);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0037");
        java.lang.String str0 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.listToString();
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "" + "'", str0, "");
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0038");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.find("out/BigDB/10/Q-1/hi!-fundamental-data-10Q-1.");
        org.junit.Assert.assertNull(cashFileData1);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0039");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readSipData("", "");
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0040");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum1 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.convertExchange("out/BigDB/0/Q0/-fundamental-data-0Q0.out/BigDB/");
        java.lang.String str2 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getExchangeStr(exchEnum1);
        org.junit.Assert.assertTrue("'" + exchEnum1 + "' != '" + net.ajaskey.market.tools.SIP.BigDB.ExchEnum.NONE + "'", exchEnum1.equals(net.ajaskey.market.tools.SIP.BigDB.ExchEnum.NONE));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NONE" + "'", str2, "NONE");
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0041");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readSipData("out/BigDB/0/Q0/-fundamental-data-0Q0.out/BigDB/");
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0042");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.clearList();
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0043");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.find("hi!");
        org.junit.Assert.assertNull(cashFileData1);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0044");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readSipData("out/BigDB/10/Q-1/hi!-fundamental-data-10Q-1.", "NONE");
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0045");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getEquityYr();
        double[] doubleArray3 = balSheetFileData1.getAcctRxQtr();
        java.lang.String str4 = balSheetFileData1.getTicker();
        double[] doubleArray5 = balSheetFileData1.getAcctRxYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0046");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData0);
        double[] doubleArray2 = cashFileData1.getCashFromOpsQtr();
        org.junit.Assert.assertNull(doubleArray2);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0047");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData0.setCity("hi!");
        // The following exception was thrown during execution in test generation
        try {
            companyFileData0.setExchange("out/BigDB/10/Q-1/hi!-fundamental-data-10Q-1.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No enum constant net.ajaskey.market.tools.SIP.BigDB.ExchEnum.out/BigDB/10/Q-1/hi!-fundamental-data-10Q-1.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0048");
        java.lang.String str4 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getOutfileName((int) (short) 100, (int) (short) 100, "Cash File Data", "Cash File Data");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "out/BigDB/100/Q100/Cash File Data-fundamental-data-100Q100.Cash File Data" + "'", str4, "out/BigDB/100/Q100/Cash File Data-fundamental-data-100Q100.Cash File Data");
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0049");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.clearList();
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0050");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.setQMemory((int) '4', 0, filetypeEnum2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0051");
        java.lang.String str0 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.listToString();
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "" + "'", str0, "");
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0052");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.find("");
        org.junit.Assert.assertNull(estimateFileData1);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0053");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str6 = companyFileData5.getCity();
        java.lang.String str7 = companyFileData5.getPhone();
        java.lang.String str8 = companyFileData5.getWeb();
        companyFileData5.setSector("out/BigDB/10/Q-1/hi!-fundamental-data-10Q-1.");
        companyFileData5.setIndustry("out/BigDB/");
        // The following exception was thrown during execution in test generation
        try {
            companyFileData5.setExchange("out/BigDB/0/Q0/-fundamental-data-0Q0.out/BigDB/");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No enum constant net.ajaskey.market.tools.SIP.BigDB.ExchEnum.out/BigDB/0/Q0/-fundamental-data-0Q0.out/BigDB/");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0054");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readSipData("NONE", "Cash File Data");
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0055");
        java.lang.String[] strArray4 = new java.lang.String[] { "Cash File Data", "out/BigDB/", "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n", "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n" };
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
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0056");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getOtherLtLiabQtr();
        int int6 = fieldData2.getInsiderBuyShrs();
        double[] doubleArray7 = fieldData2.getBvpsQtr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0057");
        int int0 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.getListCount();
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0058");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getEpsDilYr();
        double double6 = fieldData2.getPrice52hi();
        long long7 = fieldData2.getVolume10d();
        double[] doubleArray8 = fieldData2.getUnusualIncQtr();
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum9 = fieldData2.getSnpIndex();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(snpEnum9);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0059");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str6 = companyFileData5.getCity();
        java.lang.String str7 = companyFileData5.getPhone();
        java.lang.String str8 = companyFileData5.getWeb();
        companyFileData5.setSector("out/BigDB/10/Q-1/hi!-fundamental-data-10Q-1.");
        companyFileData5.setZip("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0060");
        java.lang.String str0 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.inbasedir;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "data/BigDB/" + "'", str0, "data/BigDB/");
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0061");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setInstBuyShrs("");
        double[] doubleArray3 = sharesFileData0.getSharesYr();
        long long4 = sharesFileData0.getVolume10d();
        sharesFileData0.setBeta("");
        double double7 = sharesFileData0.getDollar3m();
        sharesFileData0.setInsiderNetTrades("out/BigDB/");
        java.lang.String str10 = sharesFileData0.getName();
        double double11 = sharesFileData0.getBeta();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0062");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str7 = balSheetFileData6.toString();
        double[] doubleArray8 = balSheetFileData6.getStInvestYr();
        double[] doubleArray9 = balSheetFileData6.getNetFixedAssetsYr();
        double[] doubleArray10 = balSheetFileData6.getCurrAssetsYr();
        double[] doubleArray11 = balSheetFileData6.getGoodwillQtr();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNotNull(balSheetFileData6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0063");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.clearList();
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0064");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.setMemory(1, 0, filetypeEnum2);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0065");
        java.lang.String[] strArray5 = new java.lang.String[] { "data/BigDB/", "out/BigDB/0/Q0/-fundamental-data-0Q0.out/BigDB/", "out/BigDB/100/Q100/Cash File Data-fundamental-data-100Q100.Cash File Data", "data/BigDB/", "data/BigDB/" };
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
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0066");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.parseSipData(100, (int) (short) 100, filetypeEnum2);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0067");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear((int) '#');
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter2 = fieldDataYear1.getQ1();
        org.junit.Assert.assertNull(fieldDataQuarter2);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0068");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.clearList();
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0069");
        java.lang.String[] strArray4 = new java.lang.String[] { "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n", "hi!", "hi!", "out/BigDB/0/Q0/-fundamental-data-0Q0.out/BigDB/" };
        java.lang.String[] strArray9 = new java.lang.String[] { "Cash File Data", "out/BigDB/10/Q-1/hi!-fundamental-data-10Q-1.", "", "NONE" };
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
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0070");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.find("out/BigDB/0/Q0/-fundamental-data-0Q0.out/BigDB/");
        org.junit.Assert.assertNull(sharesFileData1);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0071");
        java.lang.String[] strArray6 = new java.lang.String[] { "out/BigDB/100/Q100/Cash File Data-fundamental-data-100Q100.Cash File Data", "out/BigDB/100/Q100/Cash File Data-fundamental-data-100Q100.Cash File Data", "Cash File Data", "data/BigDB/", "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n", "hi!" };
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
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0072");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.setMemory((int) (short) 1, (int) 'a', filetypeEnum2);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0073");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInsiderSells();
        sharesFileData0.setInstSellShrs("out/BigDB/");
        sharesFileData0.setInsiderOwnership("");
        java.lang.Class<?> wildcardClass6 = sharesFileData0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0074");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList7);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData10 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList7);
        java.lang.String str11 = companyFileData10.getCity();
        java.lang.String str12 = companyFileData10.getPhone();
        java.lang.String str13 = companyFileData10.getWeb();
        estimateFileData4.setNameFields(companyFileData10);
        java.lang.String str15 = companyFileData10.getName();
        companyFileData10.setName("Cash File Data");
        companyFileData10.setNumEmployees("");
        companyFileData10.setSector("out/BigDB/10/Q-1/hi!-fundamental-data-10Q-1.");
        companyFileData10.setZip("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(estimateFileData9);
        org.junit.Assert.assertNotNull(companyFileData10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0075");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "out/BigDB/", "out/BigDB/100/Q100/Cash File Data-fundamental-data-100Q100.Cash File Data" };
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
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0076");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.find("");
        org.junit.Assert.assertNull(incSheetFileData1);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0077");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getIncPrimaryEpsQtr();
        double[] doubleArray2 = incSheetFileData0.getIncPrimaryEpsQtr();
        java.lang.String str3 = incSheetFileData0.getName();
        double[] doubleArray4 = incSheetFileData0.getIntExpYr();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum5 = incSheetFileData0.getExchange();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(exchEnum5);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0078");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInsiderSells();
        sharesFileData0.setInstSellShrs("out/BigDB/");
        sharesFileData0.setInsiderSells("hi!");
        double[] doubleArray6 = sharesFileData0.getSharesQtr();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getTtm(doubleArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0]");
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0079");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getQFromDb((int) (short) 100, (int) '#', filetypeEnum2);
        org.junit.Assert.assertNull(fieldDataList3);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0080");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        int int3 = fieldData2.getInstSellShrs();
        double double4 = fieldData2.getEpsY1();
        double[] doubleArray5 = fieldData2.getCogsQtr();
        double[] doubleArray6 = fieldData2.getCashYr();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0081");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getEpsContQtr();
        double[] doubleArray2 = incSheetFileData0.getIncTaxYr();
        double[] doubleArray3 = incSheetFileData0.getIncPrimaryEpsYr();
        double[] doubleArray4 = incSheetFileData0.getTotalOpExpQtr();
        double[] doubleArray5 = incSheetFileData0.getNetIncYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0082");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readSipData("Cash File Data", "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0083");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInsiderSells();
        sharesFileData0.setInstSellShrs("out/BigDB/");
        sharesFileData0.setInsiderSells("hi!");
        double[] doubleArray6 = sharesFileData0.getSharesQtr();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData11 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList9);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData12 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList9);
        java.lang.String str13 = companyFileData12.getCity();
        java.lang.String str14 = companyFileData12.getPhone();
        java.lang.String str15 = companyFileData12.getWeb();
        java.lang.String str16 = companyFileData12.toString();
        sharesFileData0.setNameFields(companyFileData12);
        java.lang.String str18 = companyFileData12.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0]");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(estimateFileData11);
        org.junit.Assert.assertNotNull(companyFileData12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0084");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readSipData("data/BigDB/", "");
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0085");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getIncPrimaryEpsQtr();
        double[] doubleArray2 = incSheetFileData0.getNetIncQtr();
        double[] doubleArray3 = incSheetFileData0.getAdjToIncQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0086");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.find("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        org.junit.Assert.assertNull(cashFileData1);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0087");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) ' ', 0);
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum3 = fieldData2.getDowIndex();
        int int4 = fieldData2.getInsiderBuyShrs();
        org.junit.Assert.assertNull(dowEnum3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0088");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readSipData("NONE");
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0089");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readSipData("Cash File Data");
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0090");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) 'a', (-1));
        double[] doubleArray3 = fieldData2.getOtherLtLiabQtr();
        org.junit.Assert.assertNull(doubleArray3);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0091");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInsiderSells();
        sharesFileData0.setInstSellShrs("out/BigDB/");
        sharesFileData0.setInsiderSells("hi!");
        long long6 = sharesFileData0.getVolumeMonth3m();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0092");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getOtherLtLiabQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData6 = fieldData2.getBalSheetData();
        double[] doubleArray7 = fieldData2.getSalesQtr();
        java.lang.String str8 = fieldData2.getTicker();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNotNull(balSheetFileData6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0093");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.setMemory((int) (byte) 100, 32, filetypeEnum2);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0094");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readSipData("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0095");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getOtherLtLiabQtr();
        java.lang.String str6 = fieldData2.genOutput();
        java.lang.String str7 = fieldData2.getSnpIndexStr();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum8 = fieldData2.getExchange();
        double[] doubleArray9 = fieldData2.getOtherLtLiabQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData10 = fieldData2.getEstimateData();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(exchEnum8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNotNull(estimateFileData10);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0096");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readSipData("out/BigDB/100/Q100/Cash File Data-fundamental-data-100Q100.Cash File Data");
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0097");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getEpsContQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray3 = incSheetFileData2.getEpsQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray3);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0098");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readSipData("hi!");
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0099");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getIncPrimaryEpsQtr();
        double[] doubleArray2 = incSheetFileData0.getNetIncQtr();
        double[] doubleArray3 = incSheetFileData0.getNonrecurringItemsYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0100");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setInstBuyShrs("");
        java.lang.Class<?> wildcardClass3 = sharesFileData0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0101");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getEquityYr();
        double[] doubleArray3 = balSheetFileData1.getAcctRxQtr();
        double[] doubleArray4 = balSheetFileData1.getOtherCurrAssetsYr();
        java.lang.String str5 = balSheetFileData1.getExchange();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0102");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getEquityYr();
        double[] doubleArray3 = balSheetFileData1.getGoodwillQtr();
        double[] doubleArray4 = balSheetFileData1.getOtherCurrAssetsYr();
        double[] doubleArray5 = balSheetFileData1.getLtDebtYr();
        double[] doubleArray6 = balSheetFileData1.getGoodwillQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0103");
        java.lang.String[] strArray2 = new java.lang.String[] { "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n", "Cash File Data" };
        java.lang.String[] strArray3 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(strArray2, strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0104");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getEpsDilYr();
        double double6 = fieldData2.getPrice();
        double[] doubleArray7 = fieldData2.getBvpsQtr();
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum8 = fieldData2.getDowIndex();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(dowEnum8);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0105");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str7 = balSheetFileData6.toString();
        double[] doubleArray8 = balSheetFileData6.getOtherLtLiabYr();
        double[] doubleArray9 = balSheetFileData6.getAcctRxQtr();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNotNull(balSheetFileData6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0106");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        int int3 = fieldData2.getInstSellShrs();
        double double4 = fieldData2.getEpsY1();
        double[] doubleArray5 = fieldData2.getCogsQtr();
        double[] doubleArray6 = fieldData2.getLiabEquityQtr();
        double[] doubleArray7 = fieldData2.getPrefStockYr();
        double[] doubleArray8 = fieldData2.getCapExQtr();
        double double9 = fieldData2.getPrice52hi();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0107");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readSipData("");
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0108");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.clearList();
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0109");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList4);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList4);
        java.lang.String str8 = companyFileData7.getState();
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData13 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList11);
        java.util.List<java.lang.String> strList15 = companyFileData7.set((java.util.List<java.lang.String>) strList11);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory(strList15, (int) (short) -1, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory(strList15, 0, (int) '#');
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter22 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter(0, (int) (byte) 0, fieldDataList21);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(estimateFileData13);
        org.junit.Assert.assertNotNull(companyFileData14);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(fieldDataList18);
        org.junit.Assert.assertNotNull(fieldDataList21);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0110");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getEquityYr();
        double[] doubleArray3 = balSheetFileData1.getGoodwillQtr();
        double[] doubleArray4 = balSheetFileData1.getLtInvestQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0111");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str5 = estimateFileData4.getSector();
        java.lang.String str6 = estimateFileData4.toDbOutput();
        java.lang.String str7 = estimateFileData4.getTicker();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0112");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str6 = companyFileData5.getCity();
        java.lang.String str7 = companyFileData5.getPhone();
        java.lang.String str8 = companyFileData5.getWeb();
        java.lang.String str9 = companyFileData5.getSector();
        companyFileData5.setDowIndex("out/BigDB/");
        java.lang.String str12 = companyFileData5.getWeb();
        companyFileData5.setStreet("NONE");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0113");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getOtherLtLiabQtr();
        int int6 = fieldData2.getInsiderNetTrades();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData7 = fieldData2.getShares();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum8 = sharesFileData7.getExchange();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(sharesFileData7);
        org.junit.Assert.assertNull(exchEnum8);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0114");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.find("Cash File Data");
        org.junit.Assert.assertNull(incSheetFileData1);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0115");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        int int3 = fieldData2.getInstSellShrs();
        double double4 = fieldData2.getEpsY1();
        double[] doubleArray5 = fieldData2.getCogsQtr();
        double[] doubleArray6 = fieldData2.getLiabEquityQtr();
        double[] doubleArray7 = fieldData2.getPrefStockYr();
        double[] doubleArray8 = fieldData2.getCapExQtr();
        double[] doubleArray9 = fieldData2.getNetIncYr();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0116");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getEquityYr();
        double[] doubleArray3 = balSheetFileData1.getGoodwillQtr();
        double[] doubleArray4 = balSheetFileData1.getCurrAssetsQtr();
        double[] doubleArray5 = balSheetFileData1.getAcctPayableQtr();
        java.lang.String str6 = balSheetFileData1.getExchange();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0117");
        int int0 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.getADR();
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0118");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getOtherLtLiabQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData6 = fieldData2.getBalSheetData();
        double[] doubleArray7 = fieldData2.getSalesQtr();
        double[] doubleArray8 = fieldData2.getGrossOpIncYr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNotNull(balSheetFileData6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0119");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.find("out/BigDB/0/Q0/-fundamental-data-0Q0.out/BigDB/");
        org.junit.Assert.assertNull(balSheetFileData1);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0120");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getFromDb("hi!", (-1), (int) (short) 100, filetypeEnum3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0121");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        double[] doubleArray6 = companyFileData5.getPriceQtr();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0122");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setInstBuyShrs("");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData3 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0123");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.find("out/BigDB/");
        org.junit.Assert.assertNull(incSheetFileData1);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0124");
        java.lang.String str0 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.listToString();
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "" + "'", str0, "");
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0125");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInsiderSells();
        sharesFileData0.setInstSellShrs("out/BigDB/");
        java.lang.String str4 = sharesFileData0.getTicker();
        sharesFileData0.setVolume3m("out/BigDB/100/Q100/Cash File Data-fundamental-data-100Q100.Cash File Data");
        sharesFileData0.setVolume3m("out/BigDB/100/Q100/Cash File Data-fundamental-data-100Q100.Cash File Data");
        sharesFileData0.setInsiderSellShrs("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0126");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getEpsDilYr();
        double double6 = fieldData2.getPrice();
        double[] doubleArray7 = fieldData2.getBvpsQtr();
        double[] doubleArray8 = fieldData2.getBvpsQtr();
        double[] doubleArray9 = fieldData2.getIncTaxYr();
        double double10 = fieldData2.getPrice();
        long long11 = fieldData2.getVolumeMonth3m();
        double[] doubleArray12 = fieldData2.getTotalOpExpYr();
        double[] doubleArray13 = fieldData2.getDepreciationQtr();
        double[] doubleArray14 = fieldData2.getAcctPayableYr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(doubleArray14);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0127");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getAcctRxYr();
        double[] doubleArray3 = balSheetFileData1.getAcctRxQtr();
        double[] doubleArray4 = balSheetFileData1.getBvpsYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0128");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getEpsDilYr();
        double double6 = fieldData2.getPrice();
        double[] doubleArray7 = fieldData2.getBvpsQtr();
        double[] doubleArray8 = fieldData2.getBvpsQtr();
        double[] doubleArray9 = fieldData2.getIncTaxYr();
        double double10 = fieldData2.getPrice();
        long long11 = fieldData2.getVolumeMonth3m();
        double[] doubleArray12 = fieldData2.getTotalOpExpYr();
        double[] doubleArray13 = fieldData2.getDepreciationQtr();
        double double14 = fieldData2.getInstOwnership();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0129");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str5 = estimateFileData4.getSector();
        java.lang.String str6 = estimateFileData4.getIndustry();
        double double7 = estimateFileData4.getEpsY2();
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData12 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList10);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData13 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList10);
        java.lang.String str14 = companyFileData13.getCity();
        java.lang.String str15 = companyFileData13.getPhone();
        java.lang.String str16 = companyFileData13.getWeb();
        java.lang.String str17 = companyFileData13.getSic();
        estimateFileData4.setNameFields(companyFileData13);
        companyFileData13.setPhone("Cash File Data");
        java.lang.String str21 = companyFileData13.getSic();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(estimateFileData12);
        org.junit.Assert.assertNotNull(companyFileData13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0130");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInsiderSells();
        sharesFileData0.setInstSellShrs("out/BigDB/");
        sharesFileData0.setInsiderOwnership("");
        double double6 = sharesFileData0.getMktCap();
        int int7 = sharesFileData0.getInsiderNetTrades();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0131");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        companyFileData5.setStreet("");
        java.lang.String str8 = companyFileData5.getIndustry();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0132");
        java.lang.String str0 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.listToString();
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "" + "'", str0, "");
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0133");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) 'a', (-1));
        double double3 = fieldData2.getEpsY1();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0134");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readSipData("out/BigDB/100/Q100/Cash File Data-fundamental-data-100Q100.Cash File Data", "");
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0135");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setInstBuyShrs("");
        double[] doubleArray3 = sharesFileData0.getSharesYr();
        long long4 = sharesFileData0.getVolume10d();
        sharesFileData0.setBeta("");
        double double7 = sharesFileData0.getDollar3m();
        sharesFileData0.setInsiderNetTrades("out/BigDB/");
        java.lang.String str10 = sharesFileData0.getName();
        sharesFileData0.setFromReport((int) '4', 1);
        int int14 = sharesFileData0.getInstSellShrs();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0136");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        double[] doubleArray7 = incSheetFileData6.getIncTaxQtr();
        java.lang.String str8 = incSheetFileData6.toString();
        double[] doubleArray9 = incSheetFileData6.getUnusualIncYr();
        double[] doubleArray10 = incSheetFileData6.getIncTaxYr();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNotNull(incSheetFileData6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0137");
        java.lang.String[] strArray5 = new java.lang.String[] { "out/BigDB/", "hi!", "out/BigDB/0/Q0/-fundamental-data-0Q0.out/BigDB/", "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n", "out/BigDB/10/Q-1/hi!-fundamental-data-10Q-1." };
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
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0138");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInsiderSells();
        sharesFileData0.setInstSellShrs("out/BigDB/");
        java.lang.String str4 = sharesFileData0.getTicker();
        sharesFileData0.setVolume3m("out/BigDB/100/Q100/Cash File Data-fundamental-data-100Q100.Cash File Data");
        sharesFileData0.setVolume3m("out/BigDB/100/Q100/Cash File Data-fundamental-data-100Q100.Cash File Data");
        double double9 = sharesFileData0.getInsiderOwnership();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0139");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInsiderSells();
        sharesFileData0.setInstSellShrs("out/BigDB/");
        sharesFileData0.setInsiderNetPercentOutstanding("");
        double double6 = sharesFileData0.getDollar3m();
        double double7 = sharesFileData0.getInsiderOwnership();
        java.lang.String str8 = sharesFileData0.getName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0140");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getEpsDilYr();
        double double6 = fieldData2.getPrice52hi();
        long long7 = fieldData2.getVolume10d();
        double[] doubleArray8 = fieldData2.getPreTaxIncQtr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0141");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.parseSipData((int) (short) 10, (int) '#', filetypeEnum2);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0142");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getEquityYr();
        double[] doubleArray3 = balSheetFileData1.getInventoryQtr();
        double[] doubleArray4 = balSheetFileData1.getCashYr();
        double[] doubleArray5 = balSheetFileData1.getOtherCurrLiabYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0143");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str5 = estimateFileData4.getSector();
        java.lang.String str6 = estimateFileData4.getIndustry();
        double double7 = estimateFileData4.getEpsY2();
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData12 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList10);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData13 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList10);
        java.lang.String str14 = companyFileData13.getCity();
        java.lang.String str15 = companyFileData13.getPhone();
        java.lang.String str16 = companyFileData13.getWeb();
        java.lang.String str17 = companyFileData13.getSic();
        estimateFileData4.setNameFields(companyFileData13);
        java.lang.String str19 = companyFileData13.toString();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(estimateFileData12);
        org.junit.Assert.assertNotNull(companyFileData13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0144");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getEpsContQtr();
        double[] doubleArray2 = incSheetFileData0.getIncTaxYr();
        double[] doubleArray3 = incSheetFileData0.getIncPrimaryEpsYr();
        double[] doubleArray4 = incSheetFileData0.getNetIncQtr();
        double[] doubleArray5 = incSheetFileData0.getIncPrimaryEpsYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0145");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getEquityYr();
        double[] doubleArray3 = balSheetFileData1.getInventoryQtr();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        java.lang.String str10 = companyFileData9.getCity();
        java.lang.String str11 = companyFileData9.getPhone();
        java.lang.String str12 = companyFileData9.getWeb();
        java.lang.String str13 = companyFileData9.getSic();
        balSheetFileData1.setNameFields(companyFileData9);
        companyFileData9.setState("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = companyFileData9.toDbOuput();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(estimateFileData8);
        org.junit.Assert.assertNotNull(companyFileData9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0146");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        int int3 = fieldData2.getInstSellShrs();
        double double4 = fieldData2.getEpsY1();
        double[] doubleArray5 = fieldData2.getCogsQtr();
        double[] doubleArray6 = fieldData2.getIntExpNonOpQtr();
        fieldData2.setQuarter((int) (byte) 100);
        double[] doubleArray9 = fieldData2.getGrossIncQtr();
        java.lang.String str10 = fieldData2.getIndustry();
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum11 = fieldData2.getSnpIndex();
        int int12 = fieldData2.getQuarter();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(snpEnum11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0147");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readSipData("out/BigDB/0/Q0/-fundamental-data-0Q0.out/BigDB/");
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0148");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str5 = estimateFileData4.getSector();
        java.lang.String str6 = estimateFileData4.toDbOutput();
        double double7 = estimateFileData4.getEpsY1();
        java.lang.String str8 = estimateFileData4.toString();
        double double9 = estimateFileData4.getEpsQ1();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0149");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getOtherLtLiabQtr();
        int int6 = fieldData2.getInsiderNetTrades();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData7 = fieldData2.getShares();
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData12 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList10);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData13 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList10);
        java.lang.String str14 = companyFileData13.getCity();
        java.lang.String str15 = companyFileData13.getPhone();
        java.lang.String str16 = companyFileData13.getSnpIndexStr();
        sharesFileData7.setNameFields(companyFileData13);
        sharesFileData7.setBeta("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(sharesFileData7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(estimateFileData12);
        org.junit.Assert.assertNotNull(companyFileData13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0150");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getEpsDilYr();
        double double6 = fieldData2.getPrice();
        double[] doubleArray7 = fieldData2.getBvpsQtr();
        double[] doubleArray8 = fieldData2.getBvpsQtr();
        double[] doubleArray9 = fieldData2.getIncTaxYr();
        double double10 = fieldData2.getPrice();
        long long11 = fieldData2.getVolumeMonth3m();
        double[] doubleArray12 = fieldData2.getTotalOpExpYr();
        java.lang.String str13 = fieldData2.getCountry();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0151");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        int int3 = fieldData2.getInstSellShrs();
        double double4 = fieldData2.getEpsY1();
        java.lang.String str5 = fieldData2.genOutput();
        java.lang.String str6 = fieldData2.getDowIndexStr();
        java.lang.String str7 = fieldData2.getSic();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0152");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getEquityYr();
        double[] doubleArray3 = balSheetFileData1.getAcctRxQtr();
        java.lang.String str4 = balSheetFileData1.getTicker();
        double[] doubleArray5 = balSheetFileData1.getStInvestYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0153");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getOtherLtLiabQtr();
        java.lang.String str6 = fieldData2.genOutput();
        java.lang.String str7 = fieldData2.getSnpIndexStr();
        double[] doubleArray8 = fieldData2.getInventoryQtr();
        fieldData2.setYear(0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData11 = fieldData2.getBalSheetData();
        double[] doubleArray12 = balSheetFileData11.getOtherLtLiabYr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNotNull(balSheetFileData11);
        org.junit.Assert.assertNull(doubleArray12);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0154");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getUnusualIncYr();
        double[] doubleArray6 = fieldData2.getPreTaxIncQtr();
        double[] doubleArray7 = fieldData2.getAcctRxYr();
        int int8 = fieldData2.getYear();
        double[] doubleArray9 = fieldData2.getSalesYr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0155");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData();
        double[] doubleArray1 = balSheetFileData0.getInventoryYr();
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0156");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getEpsDilYr();
        double double6 = fieldData2.getPrice52hi();
        double[] doubleArray7 = fieldData2.getInventoryQtr();
        double[] doubleArray8 = fieldData2.getLtInvestYr();
        java.lang.String str9 = fieldData2.getCountry();
        double[] doubleArray10 = fieldData2.getLiabEquityYr();
        double double11 = fieldData2.getMktCap();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0157");
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
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0158");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.find("out/BigDB/100/Q100/Cash File Data-fundamental-data-100Q100.Cash File Data");
        org.junit.Assert.assertNull(cashFileData1);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0159");
        java.lang.String[] strArray2 = new java.lang.String[] { "NONE", "Cash File Data" };
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
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0160");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        double double1 = sharesFileData0.getInstOwnership();
        sharesFileData0.setInsiderBuys("");
        double[] doubleArray4 = sharesFileData0.getSharesYr();
        java.lang.String str5 = sharesFileData0.getName();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[0.0]");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0161");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        int int3 = fieldData2.getInstSellShrs();
        double double4 = fieldData2.getEpsY1();
        double[] doubleArray5 = fieldData2.getCogsQtr();
        double[] doubleArray6 = fieldData2.getLiabEquityQtr();
        double[] doubleArray7 = fieldData2.getPrefStockYr();
        java.lang.String str8 = fieldData2.getCity();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0162");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getEpsDilYr();
        double double6 = fieldData2.getPrice();
        double[] doubleArray7 = fieldData2.getUnusualIncYr();
        double[] doubleArray8 = fieldData2.getLiabEquityQtr();
        double[] doubleArray9 = fieldData2.getCurrLiabQtr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0163");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getOtherLtLiabQtr();
        java.lang.String str6 = fieldData2.genOutput();
        java.lang.String str7 = fieldData2.getTicker();
        java.lang.String str8 = fieldData2.getSic();
        double[] doubleArray9 = fieldData2.getNonrecurringItemsYr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0164");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInsiderSells();
        sharesFileData0.setInstSellShrs("out/BigDB/");
        sharesFileData0.setInsiderNetPercentOutstanding("");
        double double6 = sharesFileData0.getDollar3m();
        double double7 = sharesFileData0.getInsiderOwnership();
        int int8 = sharesFileData0.getInstShareholders();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0165");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getQFromDb(100, 32, filetypeEnum2);
        org.junit.Assert.assertNull(fieldDataList3);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0166");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getQFromMemory((int) (short) 1, 35);
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0167");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        int int3 = fieldData2.getInstSellShrs();
        double double4 = fieldData2.getEpsY1();
        double[] doubleArray5 = fieldData2.getCogsQtr();
        double[] doubleArray6 = fieldData2.getIntExpNonOpQtr();
        fieldData2.setQuarter((int) (byte) 100);
        double[] doubleArray9 = fieldData2.getGrossIncQtr();
        java.lang.String str10 = fieldData2.getIndustry();
        double double11 = fieldData2.getMktCap();
        double double12 = fieldData2.getDollar3m();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0168");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum3 = fieldData2.getDowIndex();
        double double4 = fieldData2.getInsiderOwnership();
        int int5 = fieldData2.getInsiderBuys();
        double[] doubleArray6 = fieldData2.getCashFromInvQtr();
        double[] doubleArray7 = fieldData2.getAcctPayableYr();
        java.lang.String str8 = fieldData2.getZip();
        double double9 = fieldData2.getInstOwnership();
        org.junit.Assert.assertNull(dowEnum3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0169");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        int int3 = fieldData2.getInstSellShrs();
        double double4 = fieldData2.getEpsY1();
        java.lang.String str5 = fieldData2.genOutput();
        java.lang.String str6 = fieldData2.getDowIndexStr();
        java.lang.String str7 = fieldData2.getWeb();
        java.lang.String str8 = fieldData2.getTicker();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0170");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str6 = companyFileData5.getState();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData11 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList9);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData12 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList9);
        java.util.List<java.lang.String> strList13 = companyFileData5.set((java.util.List<java.lang.String>) strList9);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readFromDb(strList13);
        double[] doubleArray15 = balSheetFileData14.getTotalAssetsYr();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(estimateFileData11);
        org.junit.Assert.assertNotNull(companyFileData12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(balSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0171");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getAcctRxYr();
        double[] doubleArray3 = balSheetFileData1.getLiabEquityQtr();
        double[] doubleArray4 = balSheetFileData1.getCashQtr();
        double[] doubleArray5 = balSheetFileData1.getBvpsQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0172");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getUnusualIncYr();
        double[] doubleArray6 = fieldData2.getCurrAssetsQtr();
        double[] doubleArray7 = fieldData2.getOtherLtLiabYr();
        java.lang.String str8 = fieldData2.getPhone();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0173");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str6 = companyFileData5.getCity();
        java.lang.String str7 = companyFileData5.getPhone();
        java.lang.String str8 = companyFileData5.getSnpIndexStr();
        companyFileData5.setTicker("");
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData15 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList13);
        java.lang.String str16 = estimateFileData15.getSector();
        java.lang.String str17 = estimateFileData15.toDbOutput();
        double double18 = estimateFileData15.getEpsY1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData19 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData19.setInstBuyShrs("");
        double[] doubleArray22 = sharesFileData19.getSharesYr();
        long long23 = sharesFileData19.getVolume10d();
        sharesFileData19.setBeta("");
        double double26 = sharesFileData19.getDollar3m();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray28 = incSheetFileData27.getIncPrimaryEpsQtr();
        double[] doubleArray29 = incSheetFileData27.getNetIncQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData30 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData31 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData30);
        double[] doubleArray32 = balSheetFileData31.getEquityYr();
        double[] doubleArray33 = balSheetFileData31.getGoodwillQtr();
        double[] doubleArray34 = balSheetFileData31.getOtherCurrAssetsYr();
        double[] doubleArray35 = balSheetFileData31.getLtDebtYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData36 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData37 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData36);
        java.lang.String str38 = cashFileData37.toString();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData41 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData5, estimateFileData15, sharesFileData19, incSheetFileData27, balSheetFileData31, cashFileData37, 0, 32);
        double[] doubleArray42 = balSheetFileData31.getStInvestYr();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(estimateFileData15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0]");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNull(doubleArray28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertNull(doubleArray33);
        org.junit.Assert.assertNull(doubleArray34);
        org.junit.Assert.assertNull(doubleArray35);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Cash File Data" + "'", str38, "Cash File Data");
        org.junit.Assert.assertNull(doubleArray42);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0174");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getQFromMemory(6, (int) (byte) 100);
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0175");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getEpsDilYr();
        double double6 = fieldData2.getPrice();
        double[] doubleArray7 = fieldData2.getBvpsQtr();
        double[] doubleArray8 = fieldData2.getBvpsQtr();
        double[] doubleArray9 = fieldData2.getIncTaxYr();
        double double10 = fieldData2.getPrice();
        double double11 = fieldData2.getBeta();
        double[] doubleArray12 = fieldData2.getCurrAssetsYr();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum13 = fieldData2.getExchange();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(exchEnum13);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0176");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.setQMemory((int) '4', (int) '4', filetypeEnum2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0177");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str6 = companyFileData5.getCity();
        java.lang.String str7 = companyFileData5.getPhone();
        java.lang.String str8 = companyFileData5.getWeb();
        java.lang.String str9 = companyFileData5.getSic();
        companyFileData5.setSector("out/BigDB/");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0178");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str7 = balSheetFileData6.toString();
        double[] doubleArray8 = balSheetFileData6.getLtInvestQtr();
        double[] doubleArray9 = balSheetFileData6.getGoodwillQtr();
        double[] doubleArray10 = balSheetFileData6.getAcctRxQtr();
        java.lang.String str11 = balSheetFileData6.toDbOutput();
        double[] doubleArray12 = balSheetFileData6.getCashQtr();
        java.lang.String str13 = balSheetFileData6.getTicker();
        double[] doubleArray14 = balSheetFileData6.getOtherLtLiabYr();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNotNull(balSheetFileData6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(doubleArray14);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0179");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getEpsDilYr();
        double double6 = fieldData2.getPrice();
        double[] doubleArray7 = fieldData2.getBvpsQtr();
        double[] doubleArray8 = fieldData2.getBvpsQtr();
        double[] doubleArray9 = fieldData2.getIncTaxYr();
        double[] doubleArray10 = fieldData2.getOtherCurrAssetsYr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0180");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setInstBuyShrs("");
        double[] doubleArray3 = sharesFileData0.getSharesYr();
        double double4 = sharesFileData0.getBeta();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0181");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getIncPrimaryEpsQtr();
        double[] doubleArray2 = incSheetFileData0.getIntExpNonOpQtr();
        double[] doubleArray3 = incSheetFileData0.getPreTaxIncQtr();
        double[] doubleArray4 = incSheetFileData0.getDepreciationQtr();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum5 = incSheetFileData0.getExchange();
        double[] doubleArray6 = incSheetFileData0.getEpsContQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(exchEnum5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0182");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getEpsDilYr();
        double double6 = fieldData2.getPrice52hi();
        double[] doubleArray7 = fieldData2.getInventoryQtr();
        double[] doubleArray8 = fieldData2.getCashFromOpsQtr();
        int int9 = fieldData2.getInstShareholders();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0183");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData4 = fieldData2.getCashData();
        double[] doubleArray5 = fieldData2.getDividendQtr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(cashFileData4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0184");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str5 = estimateFileData4.getSector();
        java.lang.String str6 = estimateFileData4.toDbOutput();
        double double7 = estimateFileData4.getEpsY1();
        java.lang.String str8 = estimateFileData4.toString();
        double double9 = estimateFileData4.getEpsQ0();
        double double10 = estimateFileData4.getEpsY0();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0185");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        companyFileData0.setCity("hi!");
        java.lang.String str3 = companyFileData0.getCity();
        companyFileData0.setIndustry("out/BigDB/0/Q0/-fundamental-data-0Q0.out/BigDB/");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0186");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getOtherLtLiabQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData6 = fieldData2.getBalSheetData();
        double[] doubleArray7 = fieldData2.getSalesQtr();
        double[] doubleArray8 = fieldData2.getNetIncQtr();
        double[] doubleArray9 = fieldData2.getUnusualIncYr();
        java.lang.Class<?> wildcardClass10 = fieldData2.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNotNull(balSheetFileData6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0187");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str6 = companyFileData5.getState();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData11 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList9);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData12 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList9);
        java.util.List<java.lang.String> strList13 = companyFileData5.set((java.util.List<java.lang.String>) strList9);
        boolean boolean14 = companyFileData5.isAdr();
        java.lang.String str15 = companyFileData5.getIndustry();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(estimateFileData11);
        org.junit.Assert.assertNotNull(companyFileData12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0188");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInsiderSells();
        sharesFileData0.setInstSellShrs("out/BigDB/");
        sharesFileData0.setInsiderNetPercentOutstanding("");
        double double6 = sharesFileData0.getDollar3m();
        double double7 = sharesFileData0.getInsiderOwnership();
        double double8 = sharesFileData0.getInstOwnership();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0189");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getIncPrimaryEpsQtr();
        double[] doubleArray2 = incSheetFileData0.getDividendYr();
        double[] doubleArray3 = incSheetFileData0.getNetIncYr();
        double[] doubleArray4 = incSheetFileData0.getEpsDilContYr();
        double[] doubleArray5 = incSheetFileData0.getSalesYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0190");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str6 = companyFileData5.getCity();
        java.lang.String str7 = companyFileData5.getCity();
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData12 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList10);
        java.lang.String str13 = estimateFileData12.getSector();
        java.lang.String str14 = estimateFileData12.getIndustry();
        double double15 = estimateFileData12.getEpsY2();
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList18);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData21 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList18);
        java.lang.String str22 = companyFileData21.getCity();
        java.lang.String str23 = companyFileData21.getPhone();
        java.lang.String str24 = companyFileData21.getWeb();
        java.lang.String str25 = companyFileData21.getSic();
        estimateFileData12.setNameFields(companyFileData21);
        net.ajaskey.common.DateTime dateTime27 = estimateFileData12.getCurrFiscalYear();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData28 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int29 = sharesFileData28.getInsiderSells();
        sharesFileData28.setInstSellShrs("out/BigDB/");
        sharesFileData28.setInsiderOwnership("");
        double double34 = sharesFileData28.getMktCap();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData35 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData28);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData36 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray37 = incSheetFileData36.getEpsContQtr();
        double[] doubleArray38 = incSheetFileData36.getIncTaxYr();
        double[] doubleArray39 = incSheetFileData36.getGrossOpIncYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData40 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData41 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData40);
        double[] doubleArray42 = balSheetFileData41.getCashQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData43 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData44 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData43);
        java.lang.String str45 = cashFileData44.toString();
        double[] doubleArray46 = cashFileData44.getCashFromInvQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData49 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData5, estimateFileData12, sharesFileData28, incSheetFileData36, balSheetFileData41, cashFileData44, (int) (short) 10, (int) (short) 0);
        double[] doubleArray50 = balSheetFileData41.getBvpsQtr();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(estimateFileData12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(estimateFileData20);
        org.junit.Assert.assertNotNull(companyFileData21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(dateTime27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertNull(doubleArray37);
        org.junit.Assert.assertNull(doubleArray38);
        org.junit.Assert.assertNull(doubleArray39);
        org.junit.Assert.assertNull(doubleArray42);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Cash File Data" + "'", str45, "Cash File Data");
        org.junit.Assert.assertNull(doubleArray46);
        org.junit.Assert.assertNull(doubleArray50);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0191");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInsiderSells();
        sharesFileData0.setInstSellShrs("out/BigDB/");
        sharesFileData0.setInsiderNetPercentOutstanding("");
        long long6 = sharesFileData0.getVolumeMonth3m();
        double double7 = sharesFileData0.getInsiderOwnership();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0192");
        java.lang.String[] strArray3 = new java.lang.String[] { "out/BigDB/10/Q-1/hi!-fundamental-data-10Q-1.", "out/BigDB/100/Q100/Cash File Data-fundamental-data-100Q100.Cash File Data", "out/BigDB/0/Q0/-fundamental-data-0Q0.out/BigDB/" };
        java.lang.String[] strArray7 = new java.lang.String[] { "out/BigDB/10/Q-1/hi!-fundamental-data-10Q-1.", "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n", "data/BigDB/" };
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
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0193");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setInstBuyShrs("");
        double[] doubleArray3 = sharesFileData0.getSharesYr();
        long long4 = sharesFileData0.getVolume10d();
        sharesFileData0.setBeta("");
        double double7 = sharesFileData0.getDollar3m();
        sharesFileData0.setInsiderSellShrs("out/BigDB/0/Q0/-fundamental-data-0Q0.out/BigDB/");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum10 = sharesFileData0.getExchange();
        double[] doubleArray11 = sharesFileData0.getSharesYr();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(exchEnum10);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0]");
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0194");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str5 = estimateFileData4.getSector();
        java.lang.String str6 = estimateFileData4.toString();
        double double7 = estimateFileData4.getEpsY1();
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData12 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList10);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData13 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList10);
        java.lang.String str14 = companyFileData13.getCity();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum15 = companyFileData13.getExchange();
        java.lang.String str16 = companyFileData13.getWeb();
        estimateFileData4.setNameFields(companyFileData13);
        companyFileData13.setSic("data/BigDB/");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(estimateFileData12);
        org.junit.Assert.assertNotNull(companyFileData13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(exchEnum15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0195");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.setQMemory((int) (short) 1, 1, filetypeEnum2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0196");
        java.lang.String[] strArray5 = new java.lang.String[] { "Cash File Data", "NONE", "hi!", "out/BigDB/10/Q-1/hi!-fundamental-data-10Q-1.", "hi!" };
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
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0197");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) '#', 0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNotNull(balSheetFileData6);
        org.junit.Assert.assertNotNull(sharesFileData7);
        org.junit.Assert.assertNotNull(fieldDataList10);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0198");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInsiderSells();
        sharesFileData0.setInstSellShrs("out/BigDB/");
        sharesFileData0.setInsiderNetPercentOutstanding("");
        double double6 = sharesFileData0.getDollar3m();
        double double7 = sharesFileData0.getPrice52hi();
        double double8 = sharesFileData0.getInsiderNetPercentOutstanding();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData9 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData9.setInstBuyShrs("");
        double[] doubleArray12 = sharesFileData9.getSharesYr();
        double[] doubleArray13 = sharesFileData9.getSharesQtr();
        sharesFileData0.setSharesQ(doubleArray13);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getTtm(doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0]");
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0199");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getOtherLtLiabQtr();
        java.lang.String str6 = fieldData2.genOutput();
        java.lang.String str7 = fieldData2.getSnpIndexStr();
        double[] doubleArray8 = fieldData2.getInventoryQtr();
        fieldData2.setYear(0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData11 = fieldData2.getBalSheetData();
        double[] doubleArray12 = fieldData2.getAcctPayableQtr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNotNull(balSheetFileData11);
        org.junit.Assert.assertNull(doubleArray12);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0200");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInsiderSells();
        sharesFileData0.setInstSellShrs("out/BigDB/");
        sharesFileData0.setInsiderSells("hi!");
        double[] doubleArray6 = sharesFileData0.getSharesQtr();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData11 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList9);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData12 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList9);
        java.lang.String str13 = companyFileData12.getCity();
        java.lang.String str14 = companyFileData12.getPhone();
        java.lang.String str15 = companyFileData12.getWeb();
        java.lang.String str16 = companyFileData12.toString();
        sharesFileData0.setNameFields(companyFileData12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData18 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData12);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0]");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(estimateFileData11);
        org.junit.Assert.assertNotNull(companyFileData12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0201");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getOtherLtLiabQtr();
        double double6 = fieldData2.getInstOwnership();
        double[] doubleArray7 = fieldData2.getDividendYr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0202");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum3 = fieldData2.getDowIndex();
        double double4 = fieldData2.getInsiderOwnership();
        int int5 = fieldData2.getInsiderBuys();
        double[] doubleArray6 = fieldData2.getCashFromInvQtr();
        double[] doubleArray7 = fieldData2.getOtherIncQtr();
        double[] doubleArray8 = fieldData2.getPrefStockYr();
        org.junit.Assert.assertNull(dowEnum3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0203");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getAcctRxYr();
        double[] doubleArray3 = balSheetFileData1.getBvpsYr();
        double[] doubleArray4 = balSheetFileData1.getLtInvestQtr();
        java.lang.String str5 = balSheetFileData1.getSector();
        double[] doubleArray6 = balSheetFileData1.getOtherLtLiabYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0204");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum3 = fieldData2.getDowIndex();
        double[] doubleArray4 = fieldData2.getCashFromInvQtr();
        double[] doubleArray5 = fieldData2.getIntExpQtr();
        org.junit.Assert.assertNull(dowEnum3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0205");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) ' ', 0);
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum3 = fieldData2.getDowIndex();
        double[] doubleArray4 = fieldData2.getLtInvestQtr();
        double[] doubleArray5 = fieldData2.getAcctRxQtr();
        double[] doubleArray6 = fieldData2.getEpsQtr();
        org.junit.Assert.assertNull(dowEnum3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0206");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) ' ', 0);
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum3 = fieldData2.getDowIndex();
        double[] doubleArray4 = fieldData2.getLtInvestQtr();
        double[] doubleArray5 = fieldData2.getAcctRxQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData6 = fieldData2.getCompanyInfo();
        java.lang.Class<?> wildcardClass7 = companyFileData6.getClass();
        org.junit.Assert.assertNull(dowEnum3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNotNull(companyFileData6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0207");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str6 = companyFileData5.getState();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData11 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList9);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData12 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList9);
        java.util.List<java.lang.String> strList13 = companyFileData5.set((java.util.List<java.lang.String>) strList9);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readFromDb(strList13);
        double[] doubleArray15 = balSheetFileData14.getLtDebtYr();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(estimateFileData11);
        org.junit.Assert.assertNotNull(companyFileData12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(balSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0208");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        int int3 = fieldData2.getInstSellShrs();
        double double4 = fieldData2.getEpsY1();
        double[] doubleArray5 = fieldData2.getCogsQtr();
        double[] doubleArray6 = fieldData2.getIntExpNonOpQtr();
        fieldData2.setQuarter((int) (byte) 100);
        double[] doubleArray9 = fieldData2.getOtherCurrAssetsQtr();
        double[] doubleArray10 = fieldData2.getDepreciationYr();
        double[] doubleArray11 = fieldData2.getCurrAssetsYr();
        double double12 = fieldData2.getPrice52lo();
        java.lang.String str13 = fieldData2.getWeb();
        double[] doubleArray14 = fieldData2.getDepreciationQtr();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(doubleArray14);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0209");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str5 = estimateFileData4.getSector();
        java.lang.String str6 = estimateFileData4.toDbOutput();
        double double7 = estimateFileData4.getEpsY1();
        java.lang.String str8 = estimateFileData4.toString();
        double double9 = estimateFileData4.getEpsQ0();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData10 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData4);
        net.ajaskey.common.DateTime dateTime11 = estimateFileData10.getCurrFiscalYear();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(dateTime11);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0210");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getEquityYr();
        double[] doubleArray3 = balSheetFileData1.getAcctRxQtr();
        double[] doubleArray4 = balSheetFileData1.getOtherCurrAssetsYr();
        double[] doubleArray5 = balSheetFileData1.getLiabEquityYr();
        double[] doubleArray6 = balSheetFileData1.getInventoryQtr();
        double[] doubleArray7 = balSheetFileData1.getPrefStockQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0211");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInsiderSells();
        sharesFileData0.setInstSellShrs("out/BigDB/");
        java.lang.String str4 = sharesFileData0.getTicker();
        sharesFileData0.setVolume3m("out/BigDB/100/Q100/Cash File Data-fundamental-data-100Q100.Cash File Data");
        double double7 = sharesFileData0.getPrice();
        int int8 = sharesFileData0.getInsiderSells();
        double double9 = sharesFileData0.getDollar3m();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0212");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setInstBuyShrs("");
        double[] doubleArray3 = sharesFileData0.getSharesYr();
        java.lang.String str4 = sharesFileData0.getIndustry();
        java.lang.String str5 = sharesFileData0.getTicker();
        double double6 = sharesFileData0.getBeta();
        int int7 = sharesFileData0.getInsiderBuys();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0]");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0213");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str5 = estimateFileData4.getSector();
        java.lang.String str6 = estimateFileData4.toString();
        double double7 = estimateFileData4.getEpsY1();
        double double8 = estimateFileData4.getEpsY0();
        double double9 = estimateFileData4.getEpsY0();
        double double10 = estimateFileData4.getEpsY2();
        double double11 = estimateFileData4.getEpsQ0();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0214");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        boolean boolean6 = companyFileData5.isAdr();
        companyFileData5.setNumEmployees("Cash File Data");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0215");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readSipData("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n", "data/BigDB/");
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0216");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getIncPrimaryEpsQtr();
        double[] doubleArray2 = incSheetFileData0.getIntExpNonOpQtr();
        double[] doubleArray3 = incSheetFileData0.getPreTaxIncQtr();
        double[] doubleArray4 = incSheetFileData0.getIntExpYr();
        double[] doubleArray5 = incSheetFileData0.getGrossIncYr();
        double[] doubleArray6 = incSheetFileData0.getEpsDilYr();
        double[] doubleArray7 = incSheetFileData0.getAdjToIncYr();
        double[] doubleArray8 = incSheetFileData0.getCogsQtr();
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
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0217");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getIncPrimaryEpsQtr();
        double[] doubleArray2 = incSheetFileData0.getDividendYr();
        double[] doubleArray3 = incSheetFileData0.getNetIncYr();
        double[] doubleArray4 = incSheetFileData0.getEpsDilContYr();
        double[] doubleArray5 = incSheetFileData0.getIncPrimaryEpsYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0218");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        int int3 = fieldData2.getInstSellShrs();
        double double4 = fieldData2.getEpsY1();
        java.lang.String str5 = fieldData2.genOutput();
        double[] doubleArray6 = fieldData2.getStInvestQtr();
        double[] doubleArray7 = fieldData2.getStInvestYr();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0219");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getIncPrimaryEpsQtr();
        double[] doubleArray2 = incSheetFileData0.getEpsYr();
        double[] doubleArray3 = incSheetFileData0.getIncPrimaryEpsQtr();
        double[] doubleArray4 = incSheetFileData0.getIncTaxYr();
        double[] doubleArray5 = incSheetFileData0.getCogsQtr();
        double[] doubleArray6 = incSheetFileData0.getEpsQtr();
        double[] doubleArray7 = incSheetFileData0.getTotalOpExpQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0220");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        int int3 = fieldData2.getInstSellShrs();
        java.lang.String str4 = fieldData2.getSic();
        double[] doubleArray5 = fieldData2.getIncAfterTaxQtr();
        java.lang.String str6 = fieldData2.genOutput();
        double[] doubleArray7 = fieldData2.getGoodwillYr();
        boolean boolean8 = fieldData2.isAdr();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0221");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum3 = fieldData2.getDowIndex();
        double double4 = fieldData2.getInsiderOwnership();
        int int5 = fieldData2.getInsiderBuys();
        double[] doubleArray6 = fieldData2.getCashFromInvQtr();
        double[] doubleArray7 = fieldData2.getGrossOpIncYr();
        double[] doubleArray8 = fieldData2.getPreTaxIncQtr();
        int int9 = fieldData2.getInstBuyShrs();
        org.junit.Assert.assertNull(dowEnum3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0222");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData0);
        java.lang.String str2 = cashFileData1.toString();
        double[] doubleArray3 = cashFileData1.getCapExQtr();
        double[] doubleArray4 = cashFileData1.getCashFromOpsQtr();
        java.lang.String str5 = cashFileData1.getTicker();
        java.lang.String str6 = cashFileData1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Cash File Data" + "'", str2, "Cash File Data");
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Cash File Data" + "'", str6, "Cash File Data");
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0223");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getEquityYr();
        double[] doubleArray3 = balSheetFileData1.getInventoryQtr();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList6);
        java.lang.String str10 = companyFileData9.getCity();
        java.lang.String str11 = companyFileData9.getPhone();
        java.lang.String str12 = companyFileData9.getWeb();
        java.lang.String str13 = companyFileData9.getSic();
        balSheetFileData1.setNameFields(companyFileData9);
        companyFileData9.setState("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        companyFileData9.setSector("out/BigDB/0/Q0/-fundamental-data-0Q0.out/BigDB/");
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(estimateFileData8);
        org.junit.Assert.assertNotNull(companyFileData9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0224");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setInstBuyShrs("");
        double[] doubleArray3 = sharesFileData0.getSharesYr();
        long long4 = sharesFileData0.getVolume10d();
        double double5 = sharesFileData0.getBeta();
        sharesFileData0.setInstSellShrs("");
        sharesFileData0.setBeta("out/BigDB/");
        sharesFileData0.setInstBuyShrs("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0225");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInsiderSells();
        sharesFileData0.setInstSellShrs("out/BigDB/");
        java.lang.String str4 = sharesFileData0.getTicker();
        sharesFileData0.setVolume3m("out/BigDB/100/Q100/Cash File Data-fundamental-data-100Q100.Cash File Data");
        sharesFileData0.setVolume3m("out/BigDB/100/Q100/Cash File Data-fundamental-data-100Q100.Cash File Data");
        sharesFileData0.setVolume10d("Cash File Data");
        sharesFileData0.setInsiderNetTrades("out/BigDB/100/Q100/Cash File Data-fundamental-data-100Q100.Cash File Data");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0226");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getEpsContQtr();
        double[] doubleArray2 = incSheetFileData0.getIncTaxYr();
        double[] doubleArray3 = incSheetFileData0.getGrossOpIncYr();
        double[] doubleArray4 = incSheetFileData0.getPreTaxIncQtr();
        double[] doubleArray5 = incSheetFileData0.getGrossIncQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0227");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getOtherLtLiabQtr();
        int int6 = fieldData2.getInsiderBuyShrs();
        double double7 = fieldData2.getBeta();
        double[] doubleArray8 = fieldData2.getIntExpYr();
        double[] doubleArray9 = fieldData2.getSalesQtr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0228");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getIncPrimaryEpsQtr();
        double[] doubleArray2 = incSheetFileData0.getIntExpNonOpQtr();
        double[] doubleArray3 = incSheetFileData0.getPreTaxIncQtr();
        double[] doubleArray4 = incSheetFileData0.getEpsDilContQtr();
        java.lang.String str5 = incSheetFileData0.getTicker();
        double[] doubleArray6 = incSheetFileData0.getPreTaxIncYr();
        double[] doubleArray7 = incSheetFileData0.getIncPrimaryEpsQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0229");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getOtherLtLiabQtr();
        java.lang.String str6 = fieldData2.genOutput();
        java.lang.String str7 = fieldData2.getSnpIndexStr();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum8 = fieldData2.getExchange();
        long long9 = fieldData2.getVolumeMonth3m();
        int int10 = fieldData2.getInsiderBuyShrs();
        fieldData2.setQuarter((int) (short) 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(exchEnum8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0230");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setInstBuyShrs("");
        double[] doubleArray3 = sharesFileData0.getSharesYr();
        long long4 = sharesFileData0.getVolume10d();
        double double5 = sharesFileData0.getBeta();
        int int6 = sharesFileData0.getInstSellShrs();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0231");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getAcctRxYr();
        double[] doubleArray3 = balSheetFileData1.getBvpsYr();
        java.lang.String str4 = balSheetFileData1.toDbOutput();
        double[] doubleArray5 = balSheetFileData1.getLtDebtYr();
        double[] doubleArray6 = balSheetFileData1.getTotalLiabYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0232");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double double5 = fieldData2.getInstOwnership();
        double[] doubleArray6 = fieldData2.getStDebtYr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0233");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getIncPrimaryEpsYr();
        double[] doubleArray6 = fieldData2.getIncTaxQtr();
        double[] doubleArray7 = fieldData2.getEpsContQtr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0234");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str6 = companyFileData5.getCity();
        java.lang.String str7 = companyFileData5.getSnpIndexStr();
        companyFileData5.setDowIndex("out/BigDB/10/Q-1/hi!-fundamental-data-10Q-1.");
        companyFileData5.setDowIndex("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData16 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList14);
        java.lang.String str17 = estimateFileData16.getSector();
        java.lang.String str18 = estimateFileData16.getIndustry();
        double double19 = estimateFileData16.getEpsY2();
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData24 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList22);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData25 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList22);
        java.lang.String str26 = companyFileData25.getCity();
        java.lang.String str27 = companyFileData25.getPhone();
        java.lang.String str28 = companyFileData25.getWeb();
        java.lang.String str29 = companyFileData25.getSic();
        estimateFileData16.setNameFields(companyFileData25);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData31 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData31.setInstBuyShrs("");
        double[] doubleArray34 = sharesFileData31.getSharesYr();
        sharesFileData31.setInsiderNetTrades("data/BigDB/");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData37 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData37.setInstBuyShrs("");
        double[] doubleArray40 = sharesFileData37.getSharesYr();
        double double41 = sharesFileData37.getDollar3m();
        double[] doubleArray42 = sharesFileData37.getSharesYr();
        sharesFileData31.setSharesY(doubleArray42);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData44 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray45 = incSheetFileData44.getIncPrimaryEpsQtr();
        double[] doubleArray46 = incSheetFileData44.getEpsYr();
        double[] doubleArray47 = incSheetFileData44.getCogsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData48 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData49 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData48);
        double[] doubleArray50 = balSheetFileData49.getEquityYr();
        double[] doubleArray51 = balSheetFileData49.getGoodwillQtr();
        double[] doubleArray52 = balSheetFileData49.getOtherCurrAssetsYr();
        double[] doubleArray53 = balSheetFileData49.getLtDebtYr();
        double[] doubleArray54 = balSheetFileData49.getTotalAssetsQtr();
        double[] doubleArray55 = balSheetFileData49.getInventoryQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData56 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData57 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData56);
        java.lang.String str58 = cashFileData57.toString();
        double[] doubleArray59 = cashFileData57.getCapExQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData62 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData5, estimateFileData16, sharesFileData31, incSheetFileData44, balSheetFileData49, cashFileData57, (int) '4', (int) ' ');
        double[] doubleArray63 = incSheetFileData44.getIncAfterTaxYr();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(estimateFileData16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(estimateFileData24);
        org.junit.Assert.assertNotNull(companyFileData25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[0.0]");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[0.0]");
        org.junit.Assert.assertNull(doubleArray45);
        org.junit.Assert.assertNull(doubleArray46);
        org.junit.Assert.assertNull(doubleArray47);
        org.junit.Assert.assertNull(doubleArray50);
        org.junit.Assert.assertNull(doubleArray51);
        org.junit.Assert.assertNull(doubleArray52);
        org.junit.Assert.assertNull(doubleArray53);
        org.junit.Assert.assertNull(doubleArray54);
        org.junit.Assert.assertNull(doubleArray55);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Cash File Data" + "'", str58, "Cash File Data");
        org.junit.Assert.assertNull(doubleArray59);
        org.junit.Assert.assertNull(doubleArray63);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0235");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getIncPrimaryEpsQtr();
        double[] doubleArray2 = incSheetFileData0.getIntExpNonOpQtr();
        double[] doubleArray3 = incSheetFileData0.getPreTaxIncQtr();
        double[] doubleArray4 = incSheetFileData0.getDepreciationQtr();
        double[] doubleArray5 = incSheetFileData0.getIntExpNonOpQtr();
        double[] doubleArray6 = incSheetFileData0.getCogsYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0236");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getIncPrimaryEpsQtr();
        double[] doubleArray2 = incSheetFileData0.getIntExpNonOpQtr();
        double[] doubleArray3 = incSheetFileData0.getPreTaxIncQtr();
        double[] doubleArray4 = incSheetFileData0.getGrossOpIncYr();
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList7);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData10 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList7);
        java.lang.String str11 = companyFileData10.getCity();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData12 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData10);
        companyFileData12.setStreet("out/BigDB/100/Q100/Cash File Data-fundamental-data-100Q100.Cash File Data");
        java.lang.String str15 = companyFileData12.getZip();
        incSheetFileData0.setNameFields(companyFileData12);
        double[] doubleArray17 = incSheetFileData0.getAdjToIncYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(estimateFileData9);
        org.junit.Assert.assertNotNull(companyFileData10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(doubleArray17);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0237");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getFromMemory("hi!", (-1), (int) ' ');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0238");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        double double1 = sharesFileData0.getInstOwnership();
        sharesFileData0.setInsiderBuyShrs("Cash File Data");
        long long4 = sharesFileData0.getVolume10d();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0239");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getUnusualIncYr();
        double double6 = fieldData2.getEpsY1();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0240");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getOtherLtLiabQtr();
        java.lang.String str6 = fieldData2.genOutput();
        java.lang.String str7 = fieldData2.getSnpIndexStr();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum8 = fieldData2.getExchange();
        int int9 = fieldData2.getInsiderSellShrs();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(exchEnum8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0241");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum3 = fieldData2.getDowIndex();
        double double4 = fieldData2.getInsiderOwnership();
        double[] doubleArray5 = fieldData2.getPreTaxIncQtr();
        double double6 = fieldData2.getEpsQ0();
        java.lang.String str7 = fieldData2.getName();
        double double8 = fieldData2.getPrice();
        double[] doubleArray9 = fieldData2.getEpsYr();
        org.junit.Assert.assertNull(dowEnum3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0242");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str6 = companyFileData5.getCity();
        java.lang.String str7 = companyFileData5.getSnpIndexStr();
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData12 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList10);
        java.lang.String str13 = estimateFileData12.getSector();
        java.lang.String str14 = estimateFileData12.getIndustry();
        java.lang.String str15 = estimateFileData12.getTicker();
        java.lang.String str16 = estimateFileData12.toString();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData17.setInstBuyShrs("");
        double[] doubleArray20 = sharesFileData17.getSharesYr();
        long long21 = sharesFileData17.getVolume10d();
        sharesFileData17.setBeta("");
        double double24 = sharesFileData17.getDollar3m();
        sharesFileData17.setInsiderNetTrades("out/BigDB/");
        int int27 = sharesFileData17.getInsiderBuyShrs();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum28 = sharesFileData17.getExchange();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData29 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray30 = incSheetFileData29.getEpsContQtr();
        double[] doubleArray31 = incSheetFileData29.getIncTaxYr();
        double[] doubleArray32 = incSheetFileData29.getGrossOpIncYr();
        double[] doubleArray33 = incSheetFileData29.getTotalOpExpYr();
        double[] doubleArray34 = incSheetFileData29.getIntExpNonOpYr();
        java.lang.String str35 = incSheetFileData29.toString();
        double[] doubleArray36 = incSheetFileData29.getEpsDilQtr();
        double[] doubleArray37 = incSheetFileData29.getIntExpYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData38 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData39 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData38);
        double[] doubleArray40 = balSheetFileData39.getAcctRxYr();
        double[] doubleArray41 = balSheetFileData39.getBvpsYr();
        double[] doubleArray42 = balSheetFileData39.getCurrLiabQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData43 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData44 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData43);
        java.lang.String str45 = cashFileData44.toString();
        double[] doubleArray46 = cashFileData44.getCapExQtr();
        double[] doubleArray47 = cashFileData44.getCashFromOpsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData50 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData5, estimateFileData12, sharesFileData17, incSheetFileData29, balSheetFileData39, cashFileData44, 1, (int) (byte) 1);
        double[] doubleArray51 = fieldData50.getIntExpYr();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(estimateFileData12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[0.0]");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(exchEnum28);
        org.junit.Assert.assertNull(doubleArray30);
        org.junit.Assert.assertNull(doubleArray31);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertNull(doubleArray33);
        org.junit.Assert.assertNull(doubleArray34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNull(doubleArray36);
        org.junit.Assert.assertNull(doubleArray37);
        org.junit.Assert.assertNull(doubleArray40);
        org.junit.Assert.assertNull(doubleArray41);
        org.junit.Assert.assertNull(doubleArray42);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Cash File Data" + "'", str45, "Cash File Data");
        org.junit.Assert.assertNull(doubleArray46);
        org.junit.Assert.assertNull(doubleArray47);
        org.junit.Assert.assertNull(doubleArray51);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0243");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getEpsDilYr();
        double double6 = fieldData2.getPrice52hi();
        double[] doubleArray7 = fieldData2.getInventoryQtr();
        double double8 = fieldData2.getBeta();
        double[] doubleArray9 = fieldData2.getBvpsQtr();
        int int10 = fieldData2.getInsiderSells();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0244");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getIncPrimaryEpsQtr();
        double[] doubleArray2 = incSheetFileData0.getDividendYr();
        double[] doubleArray3 = incSheetFileData0.getIntExpNonOpYr();
        double[] doubleArray4 = incSheetFileData0.getAdjToIncQtr();
        double[] doubleArray5 = incSheetFileData0.getRdYr();
        double[] doubleArray6 = incSheetFileData0.getOtherIncYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0245");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInsiderSells();
        sharesFileData0.setInstSellShrs("out/BigDB/");
        sharesFileData0.setInsiderNetPercentOutstanding("");
        double double6 = sharesFileData0.getDollar3m();
        double double7 = sharesFileData0.getPrice52hi();
        double double8 = sharesFileData0.getInsiderNetPercentOutstanding();
        int int9 = sharesFileData0.getInsiderSells();
        sharesFileData0.setInstOwnership("out/BigDB/0/Q0/-fundamental-data-0Q0.out/BigDB/");
        sharesFileData0.setInsiderBuyShrs("NONE");
        java.lang.String str14 = sharesFileData0.toDbOutput();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n" + "'", str14, "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0246");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getEpsContQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        double[] doubleArray3 = incSheetFileData0.getGrossOpIncYr();
        double[] doubleArray4 = incSheetFileData0.getIntExpNonOpYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0247");
        java.lang.String str4 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getOutfileName(10, (int) ' ', "data/BigDB/", "NONE");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "out/BigDB/10/Q32/data/BigDB/-fundamental-data-10Q32.NONE" + "'", str4, "out/BigDB/10/Q32/data/BigDB/-fundamental-data-10Q32.NONE");
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0248");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getEquityYr();
        double[] doubleArray3 = balSheetFileData1.getCurrAssetsYr();
        double[] doubleArray4 = balSheetFileData1.getOtherCurrLiabQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0249");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setInstBuyShrs("");
        sharesFileData0.setInstBuyShrs("out/BigDB/10/Q-1/hi!-fundamental-data-10Q-1.");
        double double5 = sharesFileData0.getPrice52lo();
        double double6 = sharesFileData0.getInsiderOwnership();
        java.lang.String str7 = sharesFileData0.toDbOutput();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n" + "'", str7, "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0250");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) ' ', 0);
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum3 = fieldData2.getDowIndex();
        double[] doubleArray4 = fieldData2.getLtInvestQtr();
        double[] doubleArray5 = fieldData2.getAcctRxQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData6 = fieldData2.getCompanyInfo();
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum7 = companyFileData6.getDowIndex();
        org.junit.Assert.assertNull(dowEnum3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNotNull(companyFileData6);
        org.junit.Assert.assertNull(dowEnum7);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0251");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getEpsContQtr();
        double[] doubleArray2 = incSheetFileData0.getPreTaxIncQtr();
        java.lang.String str3 = incSheetFileData0.getName();
        double[] doubleArray4 = incSheetFileData0.getGrossOpIncYr();
        double[] doubleArray5 = incSheetFileData0.getUnusualIncQtr();
        double[] doubleArray6 = incSheetFileData0.getUnusualIncQtr();
        double[] doubleArray7 = incSheetFileData0.getIncAfterTaxYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0252");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getRdQtr();
        double[] doubleArray2 = incSheetFileData0.getPreTaxIncYr();
        double[] doubleArray3 = incSheetFileData0.getIntExpQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0253");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.find("");
        org.junit.Assert.assertNull(cashFileData1);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0254");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getEquityYr();
        double[] doubleArray3 = balSheetFileData1.getLtDebtYr();
        double[] doubleArray4 = balSheetFileData1.getOtherLtAssetsYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0255");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str5 = estimateFileData4.getSector();
        java.lang.String str6 = estimateFileData4.toString();
        double double7 = estimateFileData4.getEpsY1();
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData12 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList10);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData13 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList10);
        java.lang.String str14 = companyFileData13.getCity();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum15 = companyFileData13.getExchange();
        java.lang.String str16 = companyFileData13.getWeb();
        estimateFileData4.setNameFields(companyFileData13);
        net.ajaskey.common.DateTime dateTime18 = estimateFileData4.getLatestQtrEps();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(estimateFileData12);
        org.junit.Assert.assertNotNull(companyFileData13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(exchEnum15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(dateTime18);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0256");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str6 = companyFileData5.getCity();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum7 = companyFileData5.getExchange();
        companyFileData5.setCountry("NONE");
        companyFileData5.setName("out/BigDB/100/Q100/Cash File Data-fundamental-data-100Q100.Cash File Data");
        java.lang.String str12 = companyFileData5.getSnpIndexStr();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(exchEnum7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0257");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getOtherLtLiabQtr();
        int int6 = fieldData2.getInsiderNetTrades();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData7 = fieldData2.getShares();
        int int8 = sharesFileData7.getInsiderSellShrs();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(sharesFileData7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0258");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setInstBuyShrs("");
        double[] doubleArray3 = sharesFileData0.getSharesYr();
        java.lang.String str4 = sharesFileData0.getIndustry();
        java.lang.String str5 = sharesFileData0.getTicker();
        java.lang.String str6 = sharesFileData0.getIndustry();
        int int7 = sharesFileData0.getInsiderBuyShrs();
        double double8 = sharesFileData0.getPrice52lo();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0]");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0259");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getUnusualIncYr();
        double[] doubleArray6 = fieldData2.getLtDebtYr();
        double[] doubleArray7 = fieldData2.getInventoryQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = fieldData2.getCompanyInfo();
        double[] doubleArray9 = fieldData2.getEquityQtr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNotNull(companyFileData8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0260");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getIncPrimaryEpsQtr();
        double[] doubleArray2 = incSheetFileData0.getIntExpNonOpQtr();
        double[] doubleArray3 = incSheetFileData0.getPreTaxIncQtr();
        double[] doubleArray4 = incSheetFileData0.getRdQtr();
        double[] doubleArray5 = incSheetFileData0.getNonrecurringItemsQtr();
        double[] doubleArray6 = incSheetFileData0.getDepreciationQtr();
        double[] doubleArray7 = incSheetFileData0.getEpsContQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0261");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str8 = companyFileData7.getSic();
        java.lang.String str9 = companyFileData7.getZip();
        companyFileData7.setPhone("out/BigDB/100/Q100/Cash File Data-fundamental-data-100Q100.Cash File Data");
        java.lang.String str12 = companyFileData7.getSic();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNotNull(incSheetFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0262");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str6 = companyFileData5.getState();
        java.lang.String str7 = companyFileData5.getDowIndexStr();
        java.lang.String str8 = companyFileData5.getName();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum9 = companyFileData5.getExchange();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(exchEnum9);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0263");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getAcctRxYr();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        java.lang.String str9 = companyFileData8.getCity();
        java.lang.String str10 = companyFileData8.getPhone();
        java.lang.String str11 = companyFileData8.getWeb();
        companyFileData8.setSector("out/BigDB/10/Q-1/hi!-fundamental-data-10Q-1.");
        balSheetFileData1.setNameFields(companyFileData8);
        companyFileData8.setState("");
        java.lang.String str17 = companyFileData8.getState();
        java.lang.String str18 = companyFileData8.getPhone();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(estimateFileData7);
        org.junit.Assert.assertNotNull(companyFileData8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0264");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str6 = companyFileData5.getCity();
        java.lang.String str7 = companyFileData5.getSnpIndexStr();
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData12 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList10);
        java.lang.String str13 = estimateFileData12.getSector();
        java.lang.String str14 = estimateFileData12.getIndustry();
        java.lang.String str15 = estimateFileData12.getTicker();
        java.lang.String str16 = estimateFileData12.toString();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData17.setInstBuyShrs("");
        double[] doubleArray20 = sharesFileData17.getSharesYr();
        long long21 = sharesFileData17.getVolume10d();
        sharesFileData17.setBeta("");
        double double24 = sharesFileData17.getDollar3m();
        sharesFileData17.setInsiderNetTrades("out/BigDB/");
        int int27 = sharesFileData17.getInsiderBuyShrs();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum28 = sharesFileData17.getExchange();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData29 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray30 = incSheetFileData29.getEpsContQtr();
        double[] doubleArray31 = incSheetFileData29.getIncTaxYr();
        double[] doubleArray32 = incSheetFileData29.getGrossOpIncYr();
        double[] doubleArray33 = incSheetFileData29.getTotalOpExpYr();
        double[] doubleArray34 = incSheetFileData29.getIntExpNonOpYr();
        java.lang.String str35 = incSheetFileData29.toString();
        double[] doubleArray36 = incSheetFileData29.getEpsDilQtr();
        double[] doubleArray37 = incSheetFileData29.getIntExpYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData38 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData39 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData38);
        double[] doubleArray40 = balSheetFileData39.getAcctRxYr();
        double[] doubleArray41 = balSheetFileData39.getBvpsYr();
        double[] doubleArray42 = balSheetFileData39.getCurrLiabQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData43 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData44 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData43);
        java.lang.String str45 = cashFileData44.toString();
        double[] doubleArray46 = cashFileData44.getCapExQtr();
        double[] doubleArray47 = cashFileData44.getCashFromOpsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData50 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData5, estimateFileData12, sharesFileData17, incSheetFileData29, balSheetFileData39, cashFileData44, 1, (int) (byte) 1);
        java.lang.String str51 = balSheetFileData39.getName();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(estimateFileData12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[0.0]");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(exchEnum28);
        org.junit.Assert.assertNull(doubleArray30);
        org.junit.Assert.assertNull(doubleArray31);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertNull(doubleArray33);
        org.junit.Assert.assertNull(doubleArray34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNull(doubleArray36);
        org.junit.Assert.assertNull(doubleArray37);
        org.junit.Assert.assertNull(doubleArray40);
        org.junit.Assert.assertNull(doubleArray41);
        org.junit.Assert.assertNull(doubleArray42);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Cash File Data" + "'", str45, "Cash File Data");
        org.junit.Assert.assertNull(doubleArray46);
        org.junit.Assert.assertNull(doubleArray47);
        org.junit.Assert.assertNull(str51);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0265");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInsiderSells();
        sharesFileData0.setInstSellShrs("out/BigDB/");
        sharesFileData0.setInsiderSells("hi!");
        double[] doubleArray6 = sharesFileData0.getSharesQtr();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData11 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList9);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData12 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList9);
        java.lang.String str13 = companyFileData12.getCity();
        java.lang.String str14 = companyFileData12.getPhone();
        java.lang.String str15 = companyFileData12.getWeb();
        java.lang.String str16 = companyFileData12.toString();
        sharesFileData0.setNameFields(companyFileData12);
        companyFileData12.setState("Cash File Data");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0]");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(estimateFileData11);
        org.junit.Assert.assertNotNull(companyFileData12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0266");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInsiderSells();
        sharesFileData0.setInstSellShrs("out/BigDB/");
        sharesFileData0.setInsiderNetPercentOutstanding("");
        int int6 = sharesFileData0.getInstShareholders();
        sharesFileData0.setInsiderBuys("");
        double double9 = sharesFileData0.getPrice52lo();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0267");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        int int3 = fieldData2.getYear();
        double[] doubleArray4 = fieldData2.getSharesYr();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[0.0]");
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0268");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum3 = fieldData2.getDowIndex();
        double double4 = fieldData2.getInsiderOwnership();
        double[] doubleArray5 = fieldData2.getPreTaxIncQtr();
        double double6 = fieldData2.getEpsQ0();
        double[] doubleArray7 = fieldData2.getAdjToIncYr();
        double[] doubleArray8 = fieldData2.getStInvestQtr();
        org.junit.Assert.assertNull(dowEnum3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0269");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getEpsDilYr();
        double double6 = fieldData2.getPrice();
        double[] doubleArray7 = fieldData2.getBvpsQtr();
        double double8 = fieldData2.getPrice();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0270");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getEpsDilYr();
        double double6 = fieldData2.getPrice52hi();
        double[] doubleArray7 = fieldData2.getInventoryQtr();
        double[] doubleArray8 = fieldData2.getStDebtYr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0271");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n" };
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
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0272");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setInstBuyShrs("");
        double[] doubleArray3 = sharesFileData0.getSharesYr();
        java.lang.String str4 = sharesFileData0.getIndustry();
        java.lang.String str5 = sharesFileData0.getTicker();
        sharesFileData0.setInsiderNetTrades("");
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0]");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0273");
        java.lang.String[] strArray4 = new java.lang.String[] { "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n", "out/BigDB/100/Q100/Cash File Data-fundamental-data-100Q100.Cash File Data", "", "out/BigDB/100/Q100/Cash File Data-fundamental-data-100Q100.Cash File Data" };
        java.lang.String[] strArray7 = new java.lang.String[] { "out/BigDB/10/Q32/data/BigDB/-fundamental-data-10Q32.NONE", "" };
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(strArray4, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0274");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getIncPrimaryEpsQtr();
        double[] doubleArray2 = incSheetFileData0.getIncPrimaryEpsQtr();
        double[] doubleArray3 = incSheetFileData0.getIntExpYr();
        double[] doubleArray4 = incSheetFileData0.getEpsContYr();
        double[] doubleArray5 = incSheetFileData0.getDividendYr();
        java.lang.String str6 = incSheetFileData0.toString();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0275");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList4);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList4);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readFromDb((java.util.List<java.lang.String>) strList4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (byte) 1, (int) (short) 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter12 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter((int) (short) 100, (int) ' ', fieldDataList11);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData17 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData18 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList15);
        java.lang.String str19 = companyFileData18.getState();
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData24 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList22);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData25 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList22);
        java.util.List<java.lang.String> strList26 = companyFileData18.set((java.util.List<java.lang.String>) strList22);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList29 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory(strList26, (int) (short) -1, (int) (byte) 0);
        fieldDataQuarter12.fieldDataList = fieldDataList29;
        int int31 = fieldDataQuarter12.getYear();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(estimateFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertNotNull(balSheetFileData8);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(estimateFileData17);
        org.junit.Assert.assertNotNull(companyFileData18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(estimateFileData24);
        org.junit.Assert.assertNotNull(companyFileData25);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNotNull(fieldDataList29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0276");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getQFromDb((int) (short) 1, (int) (short) 100, filetypeEnum2);
        org.junit.Assert.assertNull(fieldDataList3);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0277");
        double[] doubleArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double1 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getTtm(doubleArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0278");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        double double1 = sharesFileData0.getInstOwnership();
        sharesFileData0.setInsiderBuys("");
        sharesFileData0.setInsiderSellShrs("data/BigDB/");
        java.lang.String str6 = sharesFileData0.toString();
        java.lang.String str7 = sharesFileData0.toDbOutput();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n" + "'", str7, "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0279");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getIncPrimaryEpsQtr();
        double[] doubleArray2 = incSheetFileData0.getDividendYr();
        double[] doubleArray3 = incSheetFileData0.getIntExpNonOpYr();
        double[] doubleArray4 = incSheetFileData0.getAdjToIncQtr();
        double[] doubleArray5 = incSheetFileData0.getRdYr();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = doubleArray5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0280");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        java.lang.String str5 = fieldData2.getSnpIndexStr();
        double[] doubleArray6 = fieldData2.getNetFixedAssetsQtr();
        double[] doubleArray7 = fieldData2.getCashFromFinQtr();
        double[] doubleArray8 = fieldData2.getOtherLtAssetsQtr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0281");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str5 = estimateFileData4.getSector();
        double double6 = estimateFileData4.getEpsY0();
        java.lang.String str7 = estimateFileData4.getTicker();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0282");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str6 = companyFileData5.getCity();
        java.lang.String str7 = companyFileData5.getSnpIndexStr();
        companyFileData5.setDowIndex("out/BigDB/10/Q-1/hi!-fundamental-data-10Q-1.");
        companyFileData5.setDowIndex("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        companyFileData5.setCity("out/BigDB/0/Q0/-fundamental-data-0Q0.out/BigDB/");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0283");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getAcctRxYr();
        double[] doubleArray3 = balSheetFileData1.getBvpsYr();
        java.lang.String str4 = balSheetFileData1.toDbOutput();
        double[] doubleArray5 = balSheetFileData1.getTotalAssetsQtr();
        double[] doubleArray6 = balSheetFileData1.getOtherLtLiabQtr();
        double[] doubleArray7 = balSheetFileData1.getOtherCurrLiabYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0284");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getIncPrimaryEpsQtr();
        double[] doubleArray2 = incSheetFileData0.getIntExpNonOpQtr();
        double[] doubleArray3 = incSheetFileData0.getPreTaxIncQtr();
        double[] doubleArray4 = incSheetFileData0.getSalesYr();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum5 = incSheetFileData0.getExchange();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(exchEnum5);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0285");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setInstBuyShrs("");
        double[] doubleArray3 = sharesFileData0.getSharesYr();
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
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0286");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInsiderSells();
        sharesFileData0.setInstSellShrs("out/BigDB/");
        sharesFileData0.setInsiderNetPercentOutstanding("");
        double double6 = sharesFileData0.getDollar3m();
        double double7 = sharesFileData0.getPrice52hi();
        double double8 = sharesFileData0.getInsiderNetPercentOutstanding();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData9 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData9.setInstBuyShrs("");
        double[] doubleArray12 = sharesFileData9.getSharesYr();
        double[] doubleArray13 = sharesFileData9.getSharesQtr();
        sharesFileData0.setSharesQ(doubleArray13);
        sharesFileData0.setInsiderOwnership("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0]");
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0287");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str7 = balSheetFileData6.toString();
        double[] doubleArray8 = balSheetFileData6.getLtInvestQtr();
        double[] doubleArray9 = balSheetFileData6.getCashQtr();
        double[] doubleArray10 = balSheetFileData6.getStInvestQtr();
        double[] doubleArray11 = balSheetFileData6.getLtDebtQtr();
        double[] doubleArray12 = balSheetFileData6.getBvpsYr();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNotNull(balSheetFileData6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0288");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getEpsDilYr();
        double double6 = fieldData2.getPrice52hi();
        double[] doubleArray7 = fieldData2.getInventoryQtr();
        double double8 = fieldData2.getBeta();
        double[] doubleArray9 = fieldData2.getBvpsQtr();
        double double10 = fieldData2.getDollar3m();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0289");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getQFromDb((int) ' ', (int) '#', filetypeEnum2);
        org.junit.Assert.assertNull(fieldDataList3);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0290");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getEpsContQtr();
        double[] doubleArray2 = incSheetFileData0.getPreTaxIncQtr();
        java.lang.String str3 = incSheetFileData0.getName();
        double[] doubleArray4 = incSheetFileData0.getGrossOpIncYr();
        double[] doubleArray5 = incSheetFileData0.getIncAfterTaxYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0291");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.setMemory(100, (int) 'a', filetypeEnum2);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0292");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str6 = companyFileData5.getState();
        java.lang.String str7 = companyFileData5.getDowIndexStr();
        companyFileData5.setSector("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0293");
        java.lang.String str4 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getOutfileName(0, 0, "out/BigDB/0/Q0/-fundamental-data-0Q0.out/BigDB/", "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "out/BigDB/0/Q0/out/BigDB/0/Q0/-fundamental-data-0Q0.out/BigDB/-fundamental-data-0Q0.  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n" + "'", str4, "out/BigDB/0/Q0/out/BigDB/0/Q0/-fundamental-data-0Q0.out/BigDB/-fundamental-data-0Q0.  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0294");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getIncPrimaryEpsQtr();
        double[] doubleArray2 = incSheetFileData0.getIncPrimaryEpsQtr();
        java.lang.String str3 = incSheetFileData0.getName();
        double[] doubleArray4 = incSheetFileData0.getIntExpYr();
        double[] doubleArray5 = incSheetFileData0.getIncTaxYr();
        double[] doubleArray6 = incSheetFileData0.getIntExpNonOpQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0295");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readSipData("hi!");
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0296");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getQFromDb(1, (int) (short) 0, filetypeEnum2);
        org.junit.Assert.assertNull(fieldDataList3);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0297");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        double double9 = estimateFileData8.getEpsQ0();
        net.ajaskey.common.DateTime dateTime10 = estimateFileData8.getLatestQtrEps();
        java.lang.String str11 = estimateFileData8.toString();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNotNull(incSheetFileData6);
        org.junit.Assert.assertNotNull(companyFileData7);
        org.junit.Assert.assertNotNull(estimateFileData8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(dateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0298");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str7 = balSheetFileData6.toString();
        double[] doubleArray8 = balSheetFileData6.getStInvestYr();
        double[] doubleArray9 = balSheetFileData6.getNetFixedAssetsYr();
        double[] doubleArray10 = balSheetFileData6.getOtherCurrLiabYr();
        double[] doubleArray11 = balSheetFileData6.getLiabEquityQtr();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNotNull(balSheetFileData6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0299");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readSipData("data/BigDB/");
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0300");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        int int3 = fieldData2.getInstSellShrs();
        double double4 = fieldData2.getEpsY1();
        double[] doubleArray5 = fieldData2.getCogsQtr();
        double[] doubleArray6 = fieldData2.getIntExpNonOpQtr();
        fieldData2.setQuarter((int) (byte) 100);
        double[] doubleArray9 = fieldData2.getOtherCurrAssetsQtr();
        double[] doubleArray10 = fieldData2.getDepreciationYr();
        double[] doubleArray11 = fieldData2.getCurrAssetsYr();
        double double12 = fieldData2.getPrice52lo();
        double[] doubleArray13 = fieldData2.getOtherCurrLiabQtr();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(doubleArray13);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0301");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getOtherLtLiabQtr();
        int int6 = fieldData2.getInsiderNetTrades();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData7 = fieldData2.getShares();
        double[] doubleArray8 = fieldData2.getLtDebtQtr();
        double[] doubleArray9 = fieldData2.getSalesQtr();
        java.lang.String str10 = fieldData2.getName();
        int int11 = fieldData2.getInstSellShrs();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(sharesFileData7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0302");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getEpsContQtr();
        double[] doubleArray2 = incSheetFileData0.getIncTaxYr();
        double[] doubleArray3 = incSheetFileData0.getIncPrimaryEpsYr();
        double[] doubleArray4 = incSheetFileData0.getNetIncQtr();
        double[] doubleArray5 = incSheetFileData0.getGrossIncYr();
        double[] doubleArray6 = incSheetFileData0.getNetIncQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0303");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        int int3 = fieldData2.getInstSellShrs();
        double double4 = fieldData2.getEpsY1();
        double[] doubleArray5 = fieldData2.getLiabEquityQtr();
        double[] doubleArray6 = fieldData2.getPreTaxIncYr();
        java.lang.String str7 = fieldData2.getZip();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0304");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getEquityYr();
        double[] doubleArray3 = balSheetFileData1.getAcctRxQtr();
        double[] doubleArray4 = balSheetFileData1.getOtherCurrAssetsYr();
        java.lang.String str5 = balSheetFileData1.getName();
        double[] doubleArray6 = balSheetFileData1.getOtherCurrLiabQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0305");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getUnusualIncYr();
        double[] doubleArray6 = fieldData2.getCurrAssetsQtr();
        double[] doubleArray7 = fieldData2.getOtherLtLiabYr();
        double[] doubleArray8 = fieldData2.getNetIncQtr();
        double double9 = fieldData2.getMktCap();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0306");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getOtherLtLiabQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData6 = fieldData2.getBalSheetData();
        double[] doubleArray7 = fieldData2.getSalesQtr();
        double[] doubleArray8 = fieldData2.getNetIncQtr();
        double[] doubleArray9 = fieldData2.getPreTaxIncQtr();
        double[] doubleArray10 = fieldData2.getEpsYr();
        double double11 = fieldData2.getEpsY1();
        double[] doubleArray12 = fieldData2.getGrossOpIncQtr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNotNull(balSheetFileData6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(doubleArray12);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0307");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        int int3 = fieldData2.getInstSellShrs();
        double double4 = fieldData2.getEpsY1();
        java.lang.String str5 = fieldData2.genOutput();
        java.lang.String str6 = fieldData2.getDowIndexStr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData7 = fieldData2.getEstimateData();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(estimateFileData7);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0308");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getAcctRxYr();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        java.lang.String str9 = companyFileData8.getCity();
        java.lang.String str10 = companyFileData8.getPhone();
        java.lang.String str11 = companyFileData8.getWeb();
        companyFileData8.setSector("out/BigDB/10/Q-1/hi!-fundamental-data-10Q-1.");
        balSheetFileData1.setNameFields(companyFileData8);
        companyFileData8.setState("");
        java.lang.String str17 = companyFileData8.getName();
        java.lang.String str18 = companyFileData8.getWeb();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(estimateFileData7);
        org.junit.Assert.assertNotNull(companyFileData8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0309");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str5 = estimateFileData4.getSector();
        java.lang.String str6 = estimateFileData4.toString();
        double double7 = estimateFileData4.getEpsY1();
        double double8 = estimateFileData4.getEpsY0();
        double double9 = estimateFileData4.getEpsY0();
        double double10 = estimateFileData4.getEpsY2();
        java.lang.String str11 = estimateFileData4.toDbOutput();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0310");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum3 = fieldData2.getDowIndex();
        double double4 = fieldData2.getInsiderOwnership();
        int int5 = fieldData2.getInsiderBuys();
        double[] doubleArray6 = fieldData2.getCashFromInvQtr();
        double[] doubleArray7 = fieldData2.getGrossOpIncYr();
        double[] doubleArray8 = fieldData2.getPreTaxIncQtr();
        double[] doubleArray9 = fieldData2.getNetFixedAssetsQtr();
        double[] doubleArray10 = fieldData2.getGrossIncYr();
        java.lang.String str11 = fieldData2.toString();
        org.junit.Assert.assertNull(dowEnum3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0311");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) ' ', 0);
        double[] doubleArray3 = fieldData2.getIncAfterTaxQtr();
        fieldData2.setQuarter((int) (short) -1);
        java.lang.String str6 = fieldData2.getSic();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0312");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getEpsDilYr();
        double double6 = fieldData2.getPrice52hi();
        long long7 = fieldData2.getVolume10d();
        double[] doubleArray8 = fieldData2.getUnusualIncQtr();
        double[] doubleArray9 = fieldData2.getAcctRxQtr();
        double[] doubleArray10 = fieldData2.getIntExpNonOpQtr();
        double[] doubleArray11 = fieldData2.getGrossIncYr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0313");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getEpsDilYr();
        double double6 = fieldData2.getPrice52hi();
        double[] doubleArray7 = fieldData2.getStInvestYr();
        java.lang.String str8 = fieldData2.toString();
        double[] doubleArray9 = fieldData2.getEpsDilQtr();
        int int10 = fieldData2.getInstSellShrs();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0314");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str6 = companyFileData5.getCity();
        java.lang.String str7 = companyFileData5.getPhone();
        java.lang.String str8 = companyFileData5.getWeb();
        java.lang.String str9 = companyFileData5.getSector();
        java.lang.String str10 = companyFileData5.getPhone();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData11 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData5);
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum12 = companyFileData11.getDowIndex();
        // The following exception was thrown during execution in test generation
        try {
            companyFileData11.setExchange("out/BigDB/0/Q0/-fundamental-data-0Q0.out/BigDB/");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No enum constant net.ajaskey.market.tools.SIP.BigDB.ExchEnum.out/BigDB/0/Q0/-fundamental-data-0Q0.out/BigDB/");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(dowEnum12);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0315");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getAcctRxYr();
        double[] doubleArray3 = balSheetFileData1.getBvpsYr();
        java.lang.String str4 = balSheetFileData1.toDbOutput();
        double[] doubleArray5 = balSheetFileData1.getTotalAssetsQtr();
        double[] doubleArray6 = balSheetFileData1.getOtherCurrAssetsYr();
        double[] doubleArray7 = balSheetFileData1.getStDebtQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0316");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setInstBuyShrs("");
        double[] doubleArray3 = sharesFileData0.getSharesYr();
        long long4 = sharesFileData0.getVolume10d();
        sharesFileData0.setBeta("");
        double double7 = sharesFileData0.getDollar3m();
        sharesFileData0.setInsiderNetTrades("out/BigDB/");
        java.lang.String str10 = sharesFileData0.getName();
        sharesFileData0.setFromReport((int) '4', 1);
        int int14 = sharesFileData0.getInsiderSellShrs();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0317");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear((int) '#');
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter2 = fieldDataYear1.getQ2();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter3 = fieldDataYear1.getQ3();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter4 = fieldDataYear1.getQ3();
        int int5 = fieldDataYear1.getYear();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter6 = fieldDataYear1.getQ4();
        org.junit.Assert.assertNull(fieldDataQuarter2);
        org.junit.Assert.assertNull(fieldDataQuarter3);
        org.junit.Assert.assertNull(fieldDataQuarter4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNull(fieldDataQuarter6);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0318");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInsiderSells();
        sharesFileData0.setInstSellShrs("out/BigDB/");
        sharesFileData0.setInsiderNetPercentOutstanding("");
        double double6 = sharesFileData0.getDollar3m();
        double double7 = sharesFileData0.getPrice52hi();
        double double8 = sharesFileData0.getInsiderNetPercentOutstanding();
        int int9 = sharesFileData0.getInsiderSells();
        double double10 = sharesFileData0.getMktCap();
        sharesFileData0.setVolume10d("Cash File Data");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0319");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getOtherLtLiabQtr();
        java.lang.String str6 = fieldData2.genOutput();
        java.lang.String str7 = fieldData2.getTicker();
        java.lang.String str8 = fieldData2.getSic();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData9 = fieldData2.getShares();
        java.lang.String str10 = fieldData2.getSector();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(sharesFileData9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0320");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getIncPrimaryEpsYr();
        double double6 = fieldData2.getEpsY2();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0321");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getEpsDilYr();
        double double6 = fieldData2.getPrice();
        double[] doubleArray7 = fieldData2.getBvpsQtr();
        double[] doubleArray8 = fieldData2.getNetFixedAssetsYr();
        long long9 = fieldData2.getVolume10d();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0322");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str6 = companyFileData5.getCity();
        java.lang.String str7 = companyFileData5.getPhone();
        companyFileData5.setSector("");
        companyFileData5.setSnpIndex("out/BigDB/10/Q-1/hi!-fundamental-data-10Q-1.");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum12 = companyFileData5.getSnpIndex();
        companyFileData5.setName("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + snpEnum12 + "' != '" + net.ajaskey.market.tools.SIP.BigDB.SnpEnum.NONE + "'", snpEnum12.equals(net.ajaskey.market.tools.SIP.BigDB.SnpEnum.NONE));
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0323");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str6 = companyFileData5.getCity();
        java.lang.String str7 = companyFileData5.getPhone();
        java.lang.String str8 = companyFileData5.getWeb();
        java.lang.String str9 = companyFileData5.toString();
        java.lang.String str10 = companyFileData5.getSic();
        java.lang.String str11 = companyFileData5.getWeb();
        // The following exception was thrown during execution in test generation
        try {
            companyFileData5.setExchange("out/BigDB/");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No enum constant net.ajaskey.market.tools.SIP.BigDB.ExchEnum.out/BigDB/");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0324");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getAcctRxYr();
        double[] doubleArray3 = balSheetFileData1.getAcctPayableQtr();
        double[] doubleArray4 = balSheetFileData1.getOtherLtAssetsYr();
        double[] doubleArray5 = balSheetFileData1.getOtherCurrAssetsYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0325");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.find("out/BigDB/0/Q0/out/BigDB/0/Q0/-fundamental-data-0Q0.out/BigDB/-fundamental-data-0Q0.  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        org.junit.Assert.assertNull(cashFileData1);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0326");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getIncPrimaryEpsQtr();
        double[] doubleArray2 = incSheetFileData0.getIntExpNonOpQtr();
        double[] doubleArray3 = incSheetFileData0.getPreTaxIncQtr();
        double[] doubleArray4 = incSheetFileData0.getIntExpYr();
        double[] doubleArray5 = incSheetFileData0.getEpsDilContQtr();
        double[] doubleArray6 = incSheetFileData0.getTotalOpExpQtr();
        java.lang.String str7 = incSheetFileData0.getTicker();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0327");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear((int) '#');
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter2 = fieldDataYear1.getQ2();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter3 = fieldDataYear1.getQ1();
        boolean boolean4 = fieldDataYear1.isInUse();
        int int5 = fieldDataYear1.getYear();
        org.junit.Assert.assertNull(fieldDataQuarter2);
        org.junit.Assert.assertNull(fieldDataQuarter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0328");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str5 = estimateFileData4.getSector();
        java.lang.String str6 = estimateFileData4.getIndustry();
        double double7 = estimateFileData4.getEpsY1();
        net.ajaskey.common.DateTime dateTime8 = estimateFileData4.getCurrFiscalYear();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData9 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData4);
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum10 = estimateFileData9.getExchange();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(dateTime8);
        org.junit.Assert.assertNull(exchEnum10);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0329");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getEquityYr();
        double[] doubleArray3 = balSheetFileData1.getAcctRxQtr();
        double[] doubleArray4 = balSheetFileData1.getOtherCurrAssetsYr();
        double[] doubleArray5 = balSheetFileData1.getLiabEquityYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData1);
        double[] doubleArray7 = balSheetFileData6.getOtherCurrAssetsQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0330");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str6 = companyFileData5.getCity();
        java.lang.String str7 = companyFileData5.getCity();
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData12 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList10);
        java.lang.String str13 = estimateFileData12.getSector();
        java.lang.String str14 = estimateFileData12.getIndustry();
        double double15 = estimateFileData12.getEpsY2();
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList18);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData21 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList18);
        java.lang.String str22 = companyFileData21.getCity();
        java.lang.String str23 = companyFileData21.getPhone();
        java.lang.String str24 = companyFileData21.getWeb();
        java.lang.String str25 = companyFileData21.getSic();
        estimateFileData12.setNameFields(companyFileData21);
        net.ajaskey.common.DateTime dateTime27 = estimateFileData12.getCurrFiscalYear();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData28 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int29 = sharesFileData28.getInsiderSells();
        sharesFileData28.setInstSellShrs("out/BigDB/");
        sharesFileData28.setInsiderOwnership("");
        double double34 = sharesFileData28.getMktCap();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData35 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData28);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData36 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray37 = incSheetFileData36.getEpsContQtr();
        double[] doubleArray38 = incSheetFileData36.getIncTaxYr();
        double[] doubleArray39 = incSheetFileData36.getGrossOpIncYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData40 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData41 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData40);
        double[] doubleArray42 = balSheetFileData41.getCashQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData43 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData44 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData43);
        java.lang.String str45 = cashFileData44.toString();
        double[] doubleArray46 = cashFileData44.getCashFromInvQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData49 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData5, estimateFileData12, sharesFileData28, incSheetFileData36, balSheetFileData41, cashFileData44, (int) (short) 10, (int) (short) 0);
        double[] doubleArray50 = incSheetFileData36.getAdjToIncQtr();
        double[] doubleArray51 = incSheetFileData36.getPreTaxIncQtr();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(estimateFileData12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(estimateFileData20);
        org.junit.Assert.assertNotNull(companyFileData21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(dateTime27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertNull(doubleArray37);
        org.junit.Assert.assertNull(doubleArray38);
        org.junit.Assert.assertNull(doubleArray39);
        org.junit.Assert.assertNull(doubleArray42);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Cash File Data" + "'", str45, "Cash File Data");
        org.junit.Assert.assertNull(doubleArray46);
        org.junit.Assert.assertNull(doubleArray50);
        org.junit.Assert.assertNull(doubleArray51);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0331");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) ' ', 0);
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum3 = fieldData2.getDowIndex();
        double[] doubleArray4 = fieldData2.getLtInvestQtr();
        double[] doubleArray5 = fieldData2.getAcctRxQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData6 = fieldData2.getCompanyInfo();
        int int7 = fieldData2.getYear();
        java.lang.String str8 = fieldData2.getTicker();
        org.junit.Assert.assertNull(dowEnum3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNotNull(companyFileData6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0332");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear((int) '#');
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter2 = fieldDataYear1.getQ2();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter3 = fieldDataYear1.getQ1();
        boolean boolean5 = fieldDataYear1.quarterDataAvailable((int) (byte) -1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter6 = fieldDataYear1.getQ1();
        org.junit.Assert.assertNull(fieldDataQuarter2);
        org.junit.Assert.assertNull(fieldDataQuarter3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(fieldDataQuarter6);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0333");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getUnusualIncYr();
        double[] doubleArray6 = fieldData2.getLtDebtYr();
        double[] doubleArray7 = fieldData2.getInventoryQtr();
        double[] doubleArray8 = fieldData2.getUnusualIncQtr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0334");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getOtherLtLiabQtr();
        int int6 = fieldData2.getInsiderNetTrades();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData7 = fieldData2.getShares();
        double[] doubleArray8 = fieldData2.getLtDebtQtr();
        double[] doubleArray9 = fieldData2.getSalesQtr();
        double[] doubleArray10 = fieldData2.getCashFromOpsQtr();
        double[] doubleArray11 = fieldData2.getEpsDilContQtr();
        double[] doubleArray12 = fieldData2.getInventoryYr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(sharesFileData7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0335");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getAcctRxYr();
        double[] doubleArray3 = balSheetFileData1.getBvpsYr();
        java.lang.String str4 = balSheetFileData1.toDbOutput();
        double[] doubleArray5 = balSheetFileData1.getTotalLiabQtr();
        double[] doubleArray6 = balSheetFileData1.getGoodwillYr();
        double[] doubleArray7 = balSheetFileData1.getCurrAssetsQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0336");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str6 = companyFileData5.getCity();
        java.lang.String str7 = companyFileData5.getPhone();
        java.lang.String str8 = companyFileData5.getSnpIndexStr();
        companyFileData5.setTicker("");
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData15 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList13);
        java.lang.String str16 = estimateFileData15.getSector();
        java.lang.String str17 = estimateFileData15.toDbOutput();
        double double18 = estimateFileData15.getEpsY1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData19 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData19.setInstBuyShrs("");
        double[] doubleArray22 = sharesFileData19.getSharesYr();
        long long23 = sharesFileData19.getVolume10d();
        sharesFileData19.setBeta("");
        double double26 = sharesFileData19.getDollar3m();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray28 = incSheetFileData27.getIncPrimaryEpsQtr();
        double[] doubleArray29 = incSheetFileData27.getNetIncQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData30 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData31 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData30);
        double[] doubleArray32 = balSheetFileData31.getEquityYr();
        double[] doubleArray33 = balSheetFileData31.getGoodwillQtr();
        double[] doubleArray34 = balSheetFileData31.getOtherCurrAssetsYr();
        double[] doubleArray35 = balSheetFileData31.getLtDebtYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData36 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData37 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData36);
        java.lang.String str38 = cashFileData37.toString();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData41 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData5, estimateFileData15, sharesFileData19, incSheetFileData27, balSheetFileData31, cashFileData37, 0, 32);
        double double42 = fieldData41.getInsiderOwnership();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(estimateFileData15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0]");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNull(doubleArray28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertNull(doubleArray33);
        org.junit.Assert.assertNull(doubleArray34);
        org.junit.Assert.assertNull(doubleArray35);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Cash File Data" + "'", str38, "Cash File Data");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0337");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.find("data/BigDB/");
        org.junit.Assert.assertNull(estimateFileData1);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0338");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getEpsDilYr();
        double double6 = fieldData2.getPrice();
        double[] doubleArray7 = fieldData2.getBvpsQtr();
        double[] doubleArray8 = fieldData2.getRdQtr();
        int int9 = fieldData2.getInstSellShrs();
        double[] doubleArray10 = fieldData2.getLiabEquityQtr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0339");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        double double1 = sharesFileData0.getInstOwnership();
        sharesFileData0.setInsiderBuyShrs("out/BigDB/0/Q0/out/BigDB/0/Q0/-fundamental-data-0Q0.out/BigDB/-fundamental-data-0Q0.  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0340");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData();
        double[] doubleArray1 = companyFileData0.getPriceQtr();
        companyFileData0.setAdr("data/BigDB/");
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0341");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getIncPrimaryEpsQtr();
        double[] doubleArray2 = incSheetFileData0.getEpsYr();
        double[] doubleArray3 = incSheetFileData0.getCogsQtr();
        double[] doubleArray4 = incSheetFileData0.getNonrecurringItemsYr();
        double[] doubleArray5 = incSheetFileData0.getOtherIncQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0342");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        int int3 = fieldData2.getInstSellShrs();
        double double4 = fieldData2.getEpsY1();
        double[] doubleArray5 = fieldData2.getEpsQtr();
        java.lang.String str6 = fieldData2.getPhone();
        java.lang.String str7 = fieldData2.getTicker();
        java.lang.String str8 = fieldData2.getCity();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0343");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str7 = balSheetFileData6.toString();
        double[] doubleArray8 = balSheetFileData6.getLtInvestQtr();
        double[] doubleArray9 = balSheetFileData6.getCashQtr();
        double[] doubleArray10 = balSheetFileData6.getPrefStockQtr();
        double[] doubleArray11 = balSheetFileData6.getCurrAssetsYr();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNotNull(balSheetFileData6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0344");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getIncPrimaryEpsQtr();
        double[] doubleArray2 = incSheetFileData0.getIntExpNonOpQtr();
        double[] doubleArray3 = incSheetFileData0.getPreTaxIncQtr();
        double[] doubleArray4 = incSheetFileData0.getEpsDilContQtr();
        java.lang.String str5 = incSheetFileData0.getTicker();
        double[] doubleArray6 = incSheetFileData0.getPreTaxIncYr();
        double[] doubleArray7 = incSheetFileData0.getEpsDilContYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0345");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getEpsContQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData10 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        java.lang.String str11 = companyFileData10.getSic();
        java.lang.String str12 = companyFileData10.getZip();
        companyFileData10.setPhone("out/BigDB/100/Q100/Cash File Data-fundamental-data-100Q100.Cash File Data");
        incSheetFileData2.setNameFields(companyFileData10);
        companyFileData10.setName("data/BigDB/");
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(estimateFileData7);
        org.junit.Assert.assertNotNull(companyFileData8);
        org.junit.Assert.assertNotNull(incSheetFileData9);
        org.junit.Assert.assertNotNull(companyFileData10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0346");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        int int3 = fieldData2.getInstSellShrs();
        java.lang.String str4 = fieldData2.getSic();
        double[] doubleArray5 = fieldData2.getIncAfterTaxQtr();
        double double6 = fieldData2.getEpsQ1();
        double double7 = fieldData2.getBeta();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0347");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str6 = companyFileData5.getCity();
        java.lang.String str7 = companyFileData5.getPhone();
        java.lang.String str8 = companyFileData5.getSnpIndexStr();
        companyFileData5.setTicker("");
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData15 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList13);
        java.lang.String str16 = estimateFileData15.getSector();
        java.lang.String str17 = estimateFileData15.toDbOutput();
        double double18 = estimateFileData15.getEpsY1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData19 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData19.setInstBuyShrs("");
        double[] doubleArray22 = sharesFileData19.getSharesYr();
        long long23 = sharesFileData19.getVolume10d();
        sharesFileData19.setBeta("");
        double double26 = sharesFileData19.getDollar3m();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray28 = incSheetFileData27.getIncPrimaryEpsQtr();
        double[] doubleArray29 = incSheetFileData27.getNetIncQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData30 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData31 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData30);
        double[] doubleArray32 = balSheetFileData31.getEquityYr();
        double[] doubleArray33 = balSheetFileData31.getGoodwillQtr();
        double[] doubleArray34 = balSheetFileData31.getOtherCurrAssetsYr();
        double[] doubleArray35 = balSheetFileData31.getLtDebtYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData36 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData37 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData36);
        java.lang.String str38 = cashFileData37.toString();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData41 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData5, estimateFileData15, sharesFileData19, incSheetFileData27, balSheetFileData31, cashFileData37, 0, 32);
        double double42 = fieldData41.getEpsY1();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(estimateFileData15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0]");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNull(doubleArray28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertNull(doubleArray33);
        org.junit.Assert.assertNull(doubleArray34);
        org.junit.Assert.assertNull(doubleArray35);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Cash File Data" + "'", str38, "Cash File Data");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0348");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str7 = balSheetFileData6.toString();
        double[] doubleArray8 = balSheetFileData6.getLtInvestQtr();
        double[] doubleArray9 = balSheetFileData6.getCashQtr();
        double[] doubleArray10 = balSheetFileData6.getTotalAssetsYr();
        double[] doubleArray11 = balSheetFileData6.getStInvestQtr();
        double[] doubleArray12 = balSheetFileData6.getOtherLtAssetsQtr();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNotNull(balSheetFileData6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0349");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInsiderSells();
        sharesFileData0.setInstSellShrs("out/BigDB/");
        sharesFileData0.setInsiderOwnership("");
        int int6 = sharesFileData0.getInsiderNetTrades();
        int int7 = sharesFileData0.getInsiderBuys();
        double double8 = sharesFileData0.getMktCap();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0350");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getEquityYr();
        double[] doubleArray3 = balSheetFileData1.getGoodwillQtr();
        double[] doubleArray4 = balSheetFileData1.getOtherCurrAssetsYr();
        double[] doubleArray5 = balSheetFileData1.getLtDebtYr();
        double[] doubleArray6 = balSheetFileData1.getTotalAssetsQtr();
        double[] doubleArray7 = balSheetFileData1.getInventoryQtr();
        double[] doubleArray8 = balSheetFileData1.getGoodwillQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0351");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getOtherLtLiabQtr();
        java.lang.String str6 = fieldData2.genOutput();
        java.lang.String str7 = fieldData2.getSnpIndexStr();
        double[] doubleArray8 = fieldData2.getInventoryQtr();
        double[] doubleArray9 = fieldData2.getStInvestYr();
        double double10 = fieldData2.getFloatshr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0352");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) ' ', 0);
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum3 = fieldData2.getDowIndex();
        double[] doubleArray4 = fieldData2.getLtInvestQtr();
        double[] doubleArray5 = fieldData2.getAcctRxQtr();
        fieldData2.setQuarter((int) (short) 100);
        org.junit.Assert.assertNull(dowEnum3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0353");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str7 = balSheetFileData6.toString();
        double[] doubleArray8 = balSheetFileData6.getPrefStockYr();
        double[] doubleArray9 = balSheetFileData6.getLtInvestYr();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNotNull(balSheetFileData6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0354");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getIncPrimaryEpsQtr();
        double[] doubleArray2 = incSheetFileData0.getIntExpNonOpQtr();
        double[] doubleArray3 = incSheetFileData0.getPreTaxIncQtr();
        double[] doubleArray4 = incSheetFileData0.getIntExpYr();
        double[] doubleArray5 = incSheetFileData0.getGrossIncYr();
        double[] doubleArray6 = incSheetFileData0.getEpsDilYr();
        double[] doubleArray7 = incSheetFileData0.getAdjToIncYr();
        double[] doubleArray8 = incSheetFileData0.getEpsDilYr();
        double[] doubleArray9 = incSheetFileData0.getIncAfterTaxYr();
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
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0355");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str6 = companyFileData5.getCity();
        java.lang.String str7 = companyFileData5.getPhone();
        java.lang.String str8 = companyFileData5.getWeb();
        java.lang.String str9 = companyFileData5.getSector();
        java.lang.String str10 = companyFileData5.getPhone();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData11 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData5);
        java.lang.String str12 = companyFileData11.getIndustry();
        companyFileData11.setTicker("out/BigDB/0/Q0/-fundamental-data-0Q0.out/BigDB/");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0356");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readSipData("NONE", "out/BigDB/100/Q100/Cash File Data-fundamental-data-100Q100.Cash File Data");
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0357");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str5 = estimateFileData4.getSector();
        java.lang.String str6 = estimateFileData4.toString();
        double double7 = estimateFileData4.getEpsY1();
        double double8 = estimateFileData4.getEpsY0();
        java.lang.String str9 = estimateFileData4.toDbOutput();
        java.lang.String str10 = estimateFileData4.getSector();
        java.lang.String str11 = estimateFileData4.getTicker();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0358");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str7 = balSheetFileData6.toString();
        double[] doubleArray8 = balSheetFileData6.getLtInvestQtr();
        double[] doubleArray9 = balSheetFileData6.getCashQtr();
        double[] doubleArray10 = balSheetFileData6.getOtherLtLiabQtr();
        double[] doubleArray11 = balSheetFileData6.getPrefStockYr();
        double[] doubleArray12 = balSheetFileData6.getCurrAssetsYr();
        double[] doubleArray13 = balSheetFileData6.getStDebtQtr();
        java.lang.String str14 = balSheetFileData6.getSector();
        double[] doubleArray15 = balSheetFileData6.getTotalAssetsYr();
        double[] doubleArray16 = balSheetFileData6.getNetFixedAssetsQtr();
        double[] doubleArray17 = balSheetFileData6.getCashQtr();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNotNull(balSheetFileData6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray16);
        org.junit.Assert.assertNull(doubleArray17);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0359");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readSipData("out/BigDB/10/Q32/data/BigDB/-fundamental-data-10Q32.NONE", "out/BigDB/10/Q-1/hi!-fundamental-data-10Q-1.");
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0360");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str5 = estimateFileData4.getSector();
        java.lang.String str6 = estimateFileData4.getIndustry();
        double double7 = estimateFileData4.getEpsY2();
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData12 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList10);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData13 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList10);
        java.lang.String str14 = companyFileData13.getCity();
        java.lang.String str15 = companyFileData13.getPhone();
        java.lang.String str16 = companyFileData13.getWeb();
        java.lang.String str17 = companyFileData13.getSic();
        estimateFileData4.setNameFields(companyFileData13);
        double double19 = estimateFileData4.getEpsQ1();
        java.lang.String str20 = estimateFileData4.getName();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData21 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData4);
        java.lang.String str22 = estimateFileData4.getSector();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(estimateFileData12);
        org.junit.Assert.assertNotNull(companyFileData13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0361");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "out/BigDB/10/Q-1/hi!-fundamental-data-10Q-1.", "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n", "out/BigDB/10/Q-1/hi!-fundamental-data-10Q-1." };
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
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0362");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum3 = fieldData2.getDowIndex();
        double double4 = fieldData2.getInsiderOwnership();
        double[] doubleArray5 = fieldData2.getPreTaxIncQtr();
        double double6 = fieldData2.getEpsQ0();
        double[] doubleArray7 = fieldData2.getAdjToIncYr();
        double[] doubleArray8 = fieldData2.getGrossIncQtr();
        double[] doubleArray9 = fieldData2.getCogsQtr();
        org.junit.Assert.assertNull(dowEnum3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0363");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getAcctRxYr();
        double[] doubleArray3 = balSheetFileData1.getLiabEquityQtr();
        double[] doubleArray4 = balSheetFileData1.getInventoryYr();
        java.lang.String str5 = balSheetFileData1.getIndustry();
        double[] doubleArray6 = balSheetFileData1.getCashYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0364");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum3 = fieldData2.getDowIndex();
        double[] doubleArray4 = fieldData2.getCashFromInvQtr();
        java.lang.String str5 = fieldData2.getZip();
        java.lang.String str6 = fieldData2.getPhone();
        double[] doubleArray7 = fieldData2.getIntExpNonOpQtr();
        java.lang.String str8 = fieldData2.getStreet();
        java.lang.String str9 = fieldData2.getState();
        org.junit.Assert.assertNull(dowEnum3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0365");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getEpsDilYr();
        double[] doubleArray6 = fieldData2.getLtDebtYr();
        double[] doubleArray7 = fieldData2.getDividendQtr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0366");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getAcctRxYr();
        double[] doubleArray3 = balSheetFileData1.getLiabEquityQtr();
        double[] doubleArray4 = balSheetFileData1.getInventoryYr();
        double[] doubleArray5 = balSheetFileData1.getBvpsQtr();
        double[] doubleArray6 = balSheetFileData1.getAcctPayableQtr();
        double[] doubleArray7 = balSheetFileData1.getAcctPayableYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0367");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum3 = fieldData2.getDowIndex();
        double[] doubleArray4 = fieldData2.getCashFromInvQtr();
        java.lang.String str5 = fieldData2.getZip();
        java.lang.String str6 = fieldData2.getPhone();
        double[] doubleArray7 = fieldData2.getIntExpNonOpQtr();
        java.lang.String str8 = fieldData2.getStreet();
        double[] doubleArray9 = fieldData2.getOtherLtLiabQtr();
        org.junit.Assert.assertNull(dowEnum3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0368");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getEpsDilYr();
        double[] doubleArray6 = fieldData2.getLtDebtYr();
        double[] doubleArray7 = fieldData2.getBvpsYr();
        double[] doubleArray8 = fieldData2.getSharesYr();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getTtm(doubleArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0]");
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0369");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setInstBuyShrs("");
        double[] doubleArray3 = sharesFileData0.getSharesYr();
        long long4 = sharesFileData0.getVolume10d();
        sharesFileData0.setBeta("");
        long long7 = sharesFileData0.getVolume10d();
        sharesFileData0.setInsiderSellShrs("hi!");
        int int10 = sharesFileData0.getInsiderBuyShrs();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0370");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setInstBuyShrs("");
        sharesFileData0.setInstBuyShrs("out/BigDB/10/Q-1/hi!-fundamental-data-10Q-1.");
        double double5 = sharesFileData0.getPrice52lo();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData10 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList8);
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData15 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList13);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData16 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList13);
        java.lang.String str17 = companyFileData16.getCity();
        java.lang.String str18 = companyFileData16.getPhone();
        java.lang.String str19 = companyFileData16.getWeb();
        estimateFileData10.setNameFields(companyFileData16);
        java.lang.String str21 = companyFileData16.getName();
        sharesFileData0.setNameFields(companyFileData16);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(estimateFileData10);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(estimateFileData15);
        org.junit.Assert.assertNotNull(companyFileData16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0371");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getEpsContQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData(incSheetFileData0);
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        companyFileData8.setStreet("");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData11 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData(companyFileData8);
        incSheetFileData0.setNameFields(companyFileData8);
        java.lang.String str13 = companyFileData8.toString();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(estimateFileData7);
        org.junit.Assert.assertNotNull(companyFileData8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0372");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        double[] doubleArray7 = incSheetFileData6.getPreTaxIncYr();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNotNull(incSheetFileData6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0373");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear((int) '#');
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter2 = fieldDataYear1.getQ2();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter3 = fieldDataYear1.getQ1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter5 = fieldDataYear1.getQ(10);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter7 = fieldDataYear1.getQ(0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter9 = fieldDataYear1.getQ(35);
        org.junit.Assert.assertNull(fieldDataQuarter2);
        org.junit.Assert.assertNull(fieldDataQuarter3);
        org.junit.Assert.assertNull(fieldDataQuarter5);
        org.junit.Assert.assertNull(fieldDataQuarter7);
        org.junit.Assert.assertNull(fieldDataQuarter9);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0374");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getIncPrimaryEpsQtr();
        double[] doubleArray2 = incSheetFileData0.getIntExpNonOpQtr();
        double[] doubleArray3 = incSheetFileData0.getPreTaxIncQtr();
        double[] doubleArray4 = incSheetFileData0.getEpsDilContQtr();
        java.lang.String str5 = incSheetFileData0.getSector();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0375");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setInstBuyShrs("");
        double[] doubleArray3 = sharesFileData0.getSharesYr();
        long long4 = sharesFileData0.getVolume10d();
        sharesFileData0.setBeta("");
        double double7 = sharesFileData0.getDollar3m();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData8 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        long long9 = sharesFileData0.getVolume10d();
        double double10 = sharesFileData0.getFloatshr();
        int int11 = sharesFileData0.getInsiderSellShrs();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0376");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getOtherLtLiabQtr();
        int int6 = fieldData2.getInsiderNetTrades();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData7 = fieldData2.getShares();
        double[] doubleArray8 = fieldData2.getLtDebtQtr();
        double[] doubleArray9 = fieldData2.getSalesQtr();
        double double10 = fieldData2.getPrice52hi();
        double[] doubleArray11 = fieldData2.getIntExpNonOpYr();
        double double12 = fieldData2.getInstOwnership();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(sharesFileData7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0377");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getOtherLtLiabQtr();
        java.lang.String str6 = fieldData2.genOutput();
        java.lang.String str7 = fieldData2.getTicker();
        double[] doubleArray8 = fieldData2.getGrossOpIncQtr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0378");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getEpsDilYr();
        double double6 = fieldData2.getPrice52hi();
        long long7 = fieldData2.getVolume10d();
        double[] doubleArray8 = fieldData2.getUnusualIncQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData9 = fieldData2.getIncSheetData();
        double[] doubleArray10 = fieldData2.getGrossOpIncQtr();
        double[] doubleArray11 = fieldData2.getDepreciationYr();
        double[] doubleArray12 = fieldData2.getCapExQtr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNotNull(incSheetFileData9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0379");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear((int) '#');
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter2 = fieldDataYear1.getQ2();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter3 = fieldDataYear1.getQ3();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter4 = fieldDataYear1.getQ2();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter5 = fieldDataYear1.getQ3();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter7 = fieldDataYear1.getQ(35);
        org.junit.Assert.assertNull(fieldDataQuarter2);
        org.junit.Assert.assertNull(fieldDataQuarter3);
        org.junit.Assert.assertNull(fieldDataQuarter4);
        org.junit.Assert.assertNull(fieldDataQuarter5);
        org.junit.Assert.assertNull(fieldDataQuarter7);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0380");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getOtherLtLiabQtr();
        int int6 = fieldData2.getInsiderBuyShrs();
        double double7 = fieldData2.getDollar3m();
        net.ajaskey.common.DateTime dateTime8 = fieldData2.getCurrFiscalYear();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(dateTime8);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0381");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getFromMemory("out/BigDB/100/Q100/Cash File Data-fundamental-data-100Q100.Cash File Data", (int) '#', 1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0382");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.find("out/BigDB/10/Q32/data/BigDB/-fundamental-data-10Q32.NONE");
        org.junit.Assert.assertNull(incSheetFileData1);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0383");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str6 = companyFileData5.getCity();
        companyFileData5.setState("hi!");
        companyFileData5.setNumEmployees("out/BigDB/0/Q0/-fundamental-data-0Q0.out/BigDB/");
        java.lang.String str11 = companyFileData5.getPhone();
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum12 = companyFileData5.getSnpIndex();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(snpEnum12);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0384");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getEpsDilYr();
        double double6 = fieldData2.getPrice();
        double[] doubleArray7 = fieldData2.getBvpsQtr();
        double[] doubleArray8 = fieldData2.getRdQtr();
        int int9 = fieldData2.getInstSellShrs();
        double[] doubleArray10 = fieldData2.getEquityQtr();
        double[] doubleArray11 = fieldData2.getEquityQtr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0385");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getOtherLtLiabQtr();
        int int6 = fieldData2.getInsiderBuyShrs();
        double double7 = fieldData2.getDollar3m();
        double[] doubleArray8 = fieldData2.getPricesQtr();
        double[] doubleArray9 = fieldData2.getEpsQtr();
        double[] doubleArray10 = fieldData2.getTotalOpExpQtr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0386");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear((int) '#');
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter2 = fieldDataYear1.getQ2();
        int int3 = fieldDataYear1.getYear();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter4 = fieldDataYear1.getQ3();
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData12 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList10);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData13 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList10);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readFromDb((java.util.List<java.lang.String>) strList10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory((java.util.List<java.lang.String>) strList10, (int) (byte) 1, (int) (short) 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter18 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter((int) (short) 100, (int) ' ', fieldDataList17);
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData23 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList21);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData24 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList21);
        java.lang.String str25 = companyFileData24.getState();
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData30 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList28);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData31 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList28);
        java.util.List<java.lang.String> strList32 = companyFileData24.set((java.util.List<java.lang.String>) strList28);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList35 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getListFromMemory(strList32, (int) (short) -1, (int) (byte) 0);
        fieldDataQuarter18.fieldDataList = fieldDataList35;
        int int37 = fieldDataQuarter18.getQuarter();
        fieldDataYear1.set((int) '4', fieldDataQuarter18);
        org.junit.Assert.assertNull(fieldDataQuarter2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertNull(fieldDataQuarter4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(estimateFileData12);
        org.junit.Assert.assertNotNull(companyFileData13);
        org.junit.Assert.assertNotNull(balSheetFileData14);
        org.junit.Assert.assertNotNull(fieldDataList17);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(estimateFileData23);
        org.junit.Assert.assertNotNull(companyFileData24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(estimateFileData30);
        org.junit.Assert.assertNotNull(companyFileData31);
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertNotNull(fieldDataList35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 32 + "'", int37 == 32);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0387");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getEpsDilYr();
        double[] doubleArray6 = fieldData2.getLtDebtYr();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum7 = fieldData2.getExchange();
        double[] doubleArray8 = fieldData2.getDividendQtr();
        double[] doubleArray9 = fieldData2.getCogsYr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(exchEnum7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0388");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.parseSipData(32, (int) (short) 1, filetypeEnum2);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0389");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str6 = companyFileData5.getState();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData11 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList9);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData12 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList9);
        java.util.List<java.lang.String> strList13 = companyFileData5.set((java.util.List<java.lang.String>) strList9);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb(strList13);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData15 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb(strList13);
        double double16 = estimateFileData15.getEpsY2();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(estimateFileData11);
        org.junit.Assert.assertNotNull(companyFileData12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNotNull(estimateFileData15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0390");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInsiderSells();
        sharesFileData0.setInstSellShrs("out/BigDB/");
        sharesFileData0.setInsiderNetPercentOutstanding("");
        int int6 = sharesFileData0.getInstShareholders();
        sharesFileData0.setInstOwnership("Cash File Data");
        sharesFileData0.setInsiderSells("out/BigDB/10/Q-1/hi!-fundamental-data-10Q-1.");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0391");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getEpsContQtr();
        double[] doubleArray2 = incSheetFileData0.getEpsDilYr();
        double[] doubleArray3 = incSheetFileData0.getEpsContQtr();
        double[] doubleArray4 = incSheetFileData0.getTotalOpExpQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0392");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getOtherLtLiabQtr();
        double[] doubleArray6 = fieldData2.getCashQtr();
        double double7 = fieldData2.getBeta();
        double[] doubleArray8 = fieldData2.getCurrLiabQtr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0393");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getEpsContQtr();
        double[] doubleArray2 = incSheetFileData0.getIncTaxYr();
        double[] doubleArray3 = incSheetFileData0.getIncPrimaryEpsYr();
        double[] doubleArray4 = incSheetFileData0.getNetIncQtr();
        double[] doubleArray5 = incSheetFileData0.getGrossIncYr();
        double[] doubleArray6 = incSheetFileData0.getNonrecurringItemsYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0394");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList7);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData10 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList7);
        java.lang.String str11 = companyFileData10.getCity();
        java.lang.String str12 = companyFileData10.getPhone();
        java.lang.String str13 = companyFileData10.getWeb();
        estimateFileData4.setNameFields(companyFileData10);
        double double15 = estimateFileData4.getEpsY2();
        java.lang.String str16 = estimateFileData4.toString();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(estimateFileData9);
        org.junit.Assert.assertNotNull(companyFileData10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0395");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str6 = companyFileData5.getState();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData11 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList9);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData12 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList9);
        java.util.List<java.lang.String> strList13 = companyFileData5.set((java.util.List<java.lang.String>) strList9);
        boolean boolean14 = companyFileData5.isAdr();
        java.lang.String str15 = companyFileData5.getSic();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum16 = companyFileData5.getExchange();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(estimateFileData11);
        org.junit.Assert.assertNotNull(companyFileData12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(exchEnum16);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0396");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInsiderSells();
        sharesFileData0.setInstSellShrs("out/BigDB/");
        sharesFileData0.setInsiderOwnership("");
        int int6 = sharesFileData0.getInsiderNetTrades();
        java.lang.String str7 = sharesFileData0.toString();
        java.lang.String str8 = sharesFileData0.getIndustry();
        int int9 = sharesFileData0.getInsiderSellShrs();
        double double10 = sharesFileData0.getMktCap();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0397");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getOtherLtLiabQtr();
        java.lang.String str6 = fieldData2.genOutput();
        java.lang.String str7 = fieldData2.getSnpIndexStr();
        double[] doubleArray8 = fieldData2.getInventoryQtr();
        fieldData2.setYear(0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData11 = fieldData2.getBalSheetData();
        double[] doubleArray12 = balSheetFileData11.getBvpsYr();
        double[] doubleArray13 = balSheetFileData11.getEquityYr();
        double[] doubleArray14 = balSheetFileData11.getBvpsQtr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNotNull(balSheetFileData11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(doubleArray14);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0398");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        int int3 = fieldData2.getInstSellShrs();
        double double4 = fieldData2.getEpsY1();
        double[] doubleArray5 = fieldData2.getCogsQtr();
        double[] doubleArray6 = fieldData2.getIntExpNonOpQtr();
        double[] doubleArray7 = fieldData2.getTotalOpExpYr();
        double[] doubleArray8 = fieldData2.getEpsDilContQtr();
        long long9 = fieldData2.getVolumeMonth3m();
        double[] doubleArray10 = fieldData2.getOtherCurrAssetsQtr();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0399");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readSipData("data/BigDB/");
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0400");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        double[] doubleArray7 = balSheetFileData6.getBvpsYr();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNotNull(balSheetFileData6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0401");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getEpsDilYr();
        double double6 = fieldData2.getPrice52hi();
        long long7 = fieldData2.getVolume10d();
        double[] doubleArray8 = fieldData2.getUnusualIncQtr();
        double[] doubleArray9 = fieldData2.getAcctRxQtr();
        double[] doubleArray10 = fieldData2.getCashYr();
        double[] doubleArray11 = fieldData2.getPreTaxIncYr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0402");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        int int3 = fieldData2.getInstSellShrs();
        double double4 = fieldData2.getEpsY1();
        java.lang.String str5 = fieldData2.genOutput();
        double[] doubleArray6 = fieldData2.getIncAfterTaxYr();
        java.lang.String str7 = fieldData2.getSic();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0403");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getEpsDilYr();
        double[] doubleArray6 = fieldData2.getAcctPayableYr();
        double[] doubleArray7 = fieldData2.getLiabEquityQtr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0404");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum3 = fieldData2.getDowIndex();
        double double4 = fieldData2.getInsiderOwnership();
        int int5 = fieldData2.getInsiderBuys();
        double[] doubleArray6 = fieldData2.getCashFromInvQtr();
        double[] doubleArray7 = fieldData2.getCogsYr();
        org.junit.Assert.assertNull(dowEnum3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0405");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInsiderSells();
        sharesFileData0.setInstSellShrs("out/BigDB/");
        sharesFileData0.setInsiderNetPercentOutstanding("");
        double double6 = sharesFileData0.getDollar3m();
        double double7 = sharesFileData0.getPrice52hi();
        double double8 = sharesFileData0.getInsiderNetPercentOutstanding();
        int int9 = sharesFileData0.getInsiderSells();
        sharesFileData0.setInstOwnership("out/BigDB/0/Q0/-fundamental-data-0Q0.out/BigDB/");
        sharesFileData0.setInsiderBuyShrs("NONE");
        sharesFileData0.setBeta("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0406");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getEpsContQtr();
        double[] doubleArray2 = incSheetFileData0.getPreTaxIncQtr();
        java.lang.String str3 = incSheetFileData0.getName();
        double[] doubleArray4 = incSheetFileData0.getGrossOpIncYr();
        double[] doubleArray5 = incSheetFileData0.getUnusualIncQtr();
        double[] doubleArray6 = incSheetFileData0.getEpsDilContQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0407");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getEpsDilYr();
        double double6 = fieldData2.getPrice();
        double[] doubleArray7 = fieldData2.getBvpsQtr();
        double[] doubleArray8 = fieldData2.getBvpsQtr();
        double[] doubleArray9 = fieldData2.getIncTaxYr();
        double double10 = fieldData2.getPrice();
        double double11 = fieldData2.getBeta();
        double[] doubleArray12 = fieldData2.getCurrAssetsYr();
        double[] doubleArray13 = fieldData2.getLiabEquityYr();
        double[] doubleArray14 = fieldData2.getNetFixedAssetsYr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(doubleArray14);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0408");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getIncPrimaryEpsQtr();
        double[] doubleArray2 = incSheetFileData0.getEpsYr();
        double[] doubleArray3 = incSheetFileData0.getIncPrimaryEpsQtr();
        double[] doubleArray4 = incSheetFileData0.getIncTaxYr();
        double[] doubleArray5 = incSheetFileData0.getIncTaxQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0409");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getOtherLtLiabQtr();
        java.lang.String str6 = fieldData2.genOutput();
        java.lang.String str7 = fieldData2.getSnpIndexStr();
        double double8 = fieldData2.getPrice52lo();
        double[] doubleArray9 = fieldData2.getInventoryYr();
        double[] doubleArray10 = fieldData2.getEpsYr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0410");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getOtherLtLiabQtr();
        java.lang.String str6 = fieldData2.genOutput();
        java.lang.String str7 = fieldData2.getSnpIndexStr();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum8 = fieldData2.getExchange();
        double[] doubleArray9 = fieldData2.getIncTaxYr();
        double[] doubleArray10 = fieldData2.getCashQtr();
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum11 = fieldData2.getSnpIndex();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(exchEnum8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(snpEnum11);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0411");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str6 = companyFileData5.getState();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData11 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList9);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData12 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList9);
        java.util.List<java.lang.String> strList13 = companyFileData5.set((java.util.List<java.lang.String>) strList9);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb(strList13);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData15 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb(strList13);
        double[] doubleArray16 = cashFileData15.getCashFromInvQtr();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(estimateFileData11);
        org.junit.Assert.assertNotNull(companyFileData12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNotNull(cashFileData15);
        org.junit.Assert.assertNull(doubleArray16);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0412");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getEpsDilYr();
        double[] doubleArray6 = fieldData2.getLtDebtYr();
        double[] doubleArray7 = fieldData2.getBvpsYr();
        int int8 = fieldData2.getInsiderBuys();
        double[] doubleArray9 = fieldData2.getPricesQtr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0413");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.parseSipData((int) (byte) 100, (int) (byte) -1, filetypeEnum2);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0414");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getIncPrimaryEpsQtr();
        double[] doubleArray2 = incSheetFileData0.getDividendYr();
        double[] doubleArray3 = incSheetFileData0.getIntExpNonOpYr();
        double[] doubleArray4 = incSheetFileData0.getIntExpYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0415");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getEpsDilYr();
        double double6 = fieldData2.getPrice52hi();
        long long7 = fieldData2.getVolume10d();
        double[] doubleArray8 = fieldData2.getUnusualIncQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData9 = fieldData2.getIncSheetData();
        double[] doubleArray10 = incSheetFileData9.getTotalOpExpQtr();
        double[] doubleArray11 = incSheetFileData9.getNetIncQtr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNotNull(incSheetFileData9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0416");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        double double1 = sharesFileData0.getInstOwnership();
        sharesFileData0.setInsiderBuyShrs("Cash File Data");
        double double4 = sharesFileData0.getInstOwnership();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0417");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str6 = companyFileData5.getState();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData11 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList9);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData12 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList9);
        java.util.List<java.lang.String> strList13 = companyFileData5.set((java.util.List<java.lang.String>) strList9);
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readFromDb((java.util.List<java.lang.String>) strList9);
        sharesFileData14.setInstOwnership("data/BigDB/");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(estimateFileData11);
        org.junit.Assert.assertNotNull(companyFileData12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(sharesFileData14);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0418");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum3 = fieldData2.getDowIndex();
        int int4 = fieldData2.getInstShareholders();
        double[] doubleArray5 = fieldData2.getGrossOpIncYr();
        org.junit.Assert.assertNull(dowEnum3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0419");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setInstBuyShrs("");
        double[] doubleArray3 = sharesFileData0.getSharesYr();
        sharesFileData0.setInsiderNetTrades("data/BigDB/");
        sharesFileData0.setInstBuyShrs("out/BigDB/10/Q-1/hi!-fundamental-data-10Q-1.");
        sharesFileData0.setInstSellShrs("");
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0]");
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0420");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getEpsDilYr();
        double double6 = fieldData2.getPrice();
        double[] doubleArray7 = fieldData2.getUnusualIncYr();
        net.ajaskey.common.DateTime dateTime8 = fieldData2.getLatestQtrEps();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(dateTime8);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0421");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        double double1 = sharesFileData0.getInstOwnership();
        sharesFileData0.setInsiderBuys("");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData4 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData0);
        int int5 = sharesFileData0.getInsiderSellShrs();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0422");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getEpsContQtr();
        double[] doubleArray2 = incSheetFileData0.getPreTaxIncQtr();
        java.lang.String str3 = incSheetFileData0.getName();
        java.lang.String str4 = incSheetFileData0.getTicker();
        double[] doubleArray5 = incSheetFileData0.getSalesQtr();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum6 = incSheetFileData0.getExchange();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(exchEnum6);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0423");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setInstBuyShrs("");
        double[] doubleArray3 = sharesFileData0.getSharesYr();
        java.lang.String str4 = sharesFileData0.getIndustry();
        java.lang.String str5 = sharesFileData0.getTicker();
        java.lang.String str6 = sharesFileData0.getIndustry();
        double double7 = sharesFileData0.getPrice52lo();
        long long8 = sharesFileData0.getVolume10d();
        int int9 = sharesFileData0.getInstShareholders();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0]");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0424");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getAcctRxYr();
        double[] doubleArray3 = balSheetFileData1.getLiabEquityQtr();
        double[] doubleArray4 = balSheetFileData1.getAcctPayableQtr();
        double[] doubleArray5 = balSheetFileData1.getCashYr();
        double[] doubleArray6 = balSheetFileData1.getCurrLiabQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0425");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        int int3 = fieldData2.getInstSellShrs();
        double double4 = fieldData2.getEpsY1();
        double[] doubleArray5 = fieldData2.getCogsQtr();
        double[] doubleArray6 = fieldData2.getIntExpNonOpQtr();
        double[] doubleArray7 = fieldData2.getTotalOpExpYr();
        double[] doubleArray8 = fieldData2.getEpsDilContQtr();
        double[] doubleArray9 = fieldData2.getTotalOpExpQtr();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0426");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList7);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData10 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList7);
        java.lang.String str11 = companyFileData10.getCity();
        java.lang.String str12 = companyFileData10.getPhone();
        java.lang.String str13 = companyFileData10.getWeb();
        estimateFileData4.setNameFields(companyFileData10);
        java.lang.String str15 = companyFileData10.getSic();
        companyFileData10.setZip("  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        companyFileData10.setWeb("");
        java.lang.String str20 = companyFileData10.toString();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(estimateFileData9);
        org.junit.Assert.assertNotNull(companyFileData10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0427");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear((int) '#');
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter2 = fieldDataYear1.getQ3();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataQuarter fieldDataQuarter3 = fieldDataYear1.getQ3();
        org.junit.Assert.assertNull(fieldDataQuarter2);
        org.junit.Assert.assertNull(fieldDataQuarter3);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0428");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getEpsDilYr();
        double double6 = fieldData2.getPrice();
        double[] doubleArray7 = fieldData2.getBvpsQtr();
        double[] doubleArray8 = fieldData2.getRdQtr();
        int int9 = fieldData2.getInstSellShrs();
        double[] doubleArray10 = fieldData2.getPricesQtr();
        double[] doubleArray11 = fieldData2.getEpsDilContQtr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0429");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str6 = companyFileData5.getState();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData11 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList9);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData12 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList9);
        java.util.List<java.lang.String> strList13 = companyFileData5.set((java.util.List<java.lang.String>) strList9);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readFromDb(strList13);
        double[] doubleArray15 = balSheetFileData14.getOtherLtAssetsYr();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(estimateFileData11);
        org.junit.Assert.assertNotNull(companyFileData12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(balSheetFileData14);
        org.junit.Assert.assertNull(doubleArray15);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0430");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setInstBuyShrs("");
        sharesFileData0.setInstBuyShrs("out/BigDB/10/Q-1/hi!-fundamental-data-10Q-1.");
        double double5 = sharesFileData0.getPrice52lo();
        int int6 = sharesFileData0.getInstSellShrs();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int8 = sharesFileData7.getInsiderSells();
        sharesFileData7.setInstSellShrs("out/BigDB/");
        sharesFileData7.setInsiderSells("hi!");
        double[] doubleArray13 = sharesFileData7.getSharesQtr();
        sharesFileData0.setSharesQ(doubleArray13);
        sharesFileData0.setInstSellShrs("hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0]");
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0431");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str5 = estimateFileData4.getSector();
        java.lang.String str6 = estimateFileData4.getIndustry();
        double double7 = estimateFileData4.getEpsY2();
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData12 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList10);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData13 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList10);
        java.lang.String str14 = companyFileData13.getCity();
        java.lang.String str15 = companyFileData13.getPhone();
        java.lang.String str16 = companyFileData13.getWeb();
        java.lang.String str17 = companyFileData13.getSic();
        estimateFileData4.setNameFields(companyFileData13);
        double double19 = estimateFileData4.getEpsQ1();
        java.lang.String str20 = estimateFileData4.getName();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData21 = new net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData(estimateFileData4);
        double double22 = estimateFileData21.getEpsQ1();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(estimateFileData12);
        org.junit.Assert.assertNotNull(companyFileData13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0432");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInsiderSells();
        sharesFileData0.setInstSellShrs("out/BigDB/");
        sharesFileData0.setInsiderNetPercentOutstanding("");
        double double6 = sharesFileData0.getDollar3m();
        long long7 = sharesFileData0.getVolume10d();
        java.lang.String str8 = sharesFileData0.getSector();
        sharesFileData0.setInsiderNetPercentOutstanding("NONE");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0433");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getUnusualIncYr();
        double[] doubleArray6 = fieldData2.getPreTaxIncQtr();
        double[] doubleArray7 = fieldData2.getAcctRxYr();
        int int8 = fieldData2.getYear();
        double[] doubleArray9 = fieldData2.getNetIncYr();
        double[] doubleArray10 = fieldData2.getIncAfterTaxYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData11 = fieldData2.getShares();
        double[] doubleArray12 = fieldData2.getCurrAssetsQtr();
        long long13 = fieldData2.getVolume10d();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNotNull(sharesFileData11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0434");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str7 = balSheetFileData6.toString();
        double[] doubleArray8 = balSheetFileData6.getLtInvestQtr();
        java.lang.String str9 = balSheetFileData6.toString();
        double[] doubleArray10 = balSheetFileData6.getOtherLtLiabQtr();
        double[] doubleArray11 = balSheetFileData6.getLiabEquityYr();
        double[] doubleArray12 = balSheetFileData6.getLtInvestYr();
        double[] doubleArray13 = balSheetFileData6.getCurrAssetsQtr();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNotNull(balSheetFileData6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0435");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        int int3 = fieldData2.getInstSellShrs();
        double double4 = fieldData2.getEpsY1();
        java.lang.String str5 = fieldData2.genOutput();
        double[] doubleArray6 = fieldData2.getIncAfterTaxYr();
        double[] doubleArray7 = fieldData2.getTotalOpExpYr();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0436");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getEpsContQtr();
        double[] doubleArray2 = incSheetFileData0.getIncTaxYr();
        double[] doubleArray3 = incSheetFileData0.getGrossOpIncYr();
        double[] doubleArray4 = incSheetFileData0.getTotalOpExpYr();
        double[] doubleArray5 = incSheetFileData0.getPreTaxIncYr();
        java.lang.String str6 = incSheetFileData0.getIndustry();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0437");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getOtherLtLiabQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData6 = fieldData2.getBalSheetData();
        double[] doubleArray7 = fieldData2.getSalesQtr();
        double[] doubleArray8 = fieldData2.getNetIncQtr();
        double[] doubleArray9 = fieldData2.getPreTaxIncQtr();
        double[] doubleArray10 = fieldData2.getEpsYr();
        double double11 = fieldData2.getEpsY1();
        double[] doubleArray12 = fieldData2.getLiabEquityYr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNotNull(balSheetFileData6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(doubleArray12);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0438");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getEpsDilYr();
        double double6 = fieldData2.getPrice52hi();
        long long7 = fieldData2.getVolume10d();
        double[] doubleArray8 = fieldData2.getUnusualIncQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData9 = fieldData2.getIncSheetData();
        double[] doubleArray10 = fieldData2.getEquityYr();
        double[] doubleArray11 = fieldData2.getCashFromFinQtr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNotNull(incSheetFileData9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0439");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData.readSipData("hi!");
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0440");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getEquityYr();
        double[] doubleArray3 = balSheetFileData1.getAcctRxQtr();
        java.lang.String str4 = balSheetFileData1.getTicker();
        double[] doubleArray5 = balSheetFileData1.getAcctRxQtr();
        java.lang.String str6 = balSheetFileData1.getName();
        double[] doubleArray7 = balSheetFileData1.getOtherCurrLiabYr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0441");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getOtherLtLiabQtr();
        java.lang.String str6 = fieldData2.genOutput();
        double[] doubleArray7 = fieldData2.getBvpsQtr();
        double[] doubleArray8 = fieldData2.getNonrecurringItemsYr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0442");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        double double1 = sharesFileData0.getInstOwnership();
        sharesFileData0.setInsiderBuys("");
        double[] doubleArray4 = sharesFileData0.getSharesYr();
        sharesFileData0.setFromReport(0, 6);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[0.0]");
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0443");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInsiderSells();
        sharesFileData0.setInstSellShrs("out/BigDB/");
        sharesFileData0.setInsiderNetPercentOutstanding("");
        sharesFileData0.setInsiderBuys("NONE");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0444");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        int int3 = fieldData2.getInstSellShrs();
        double double4 = fieldData2.getEpsY1();
        java.lang.String str5 = fieldData2.genOutput();
        java.lang.String str6 = fieldData2.getDowIndexStr();
        double[] doubleArray7 = fieldData2.getCashYr();
        double[] doubleArray8 = fieldData2.getOtherCurrLiabQtr();
        int int9 = fieldData2.getYear();
        double[] doubleArray10 = fieldData2.getNetFixedAssetsYr();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(doubleArray10);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0445");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getIncPrimaryEpsQtr();
        double[] doubleArray2 = incSheetFileData0.getIntExpNonOpQtr();
        double[] doubleArray3 = incSheetFileData0.getPreTaxIncQtr();
        double[] doubleArray4 = incSheetFileData0.getSalesYr();
        java.lang.String str5 = incSheetFileData0.getTicker();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0446");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setInstBuyShrs("");
        double[] doubleArray3 = sharesFileData0.getSharesYr();
        double double4 = sharesFileData0.getDollar3m();
        double double5 = sharesFileData0.getFloatshr();
        sharesFileData0.setInstOwnership("out/BigDB/10/Q32/data/BigDB/-fundamental-data-10Q32.NONE");
        sharesFileData0.setFromReport((int) (short) 1, (int) 'a');
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0447");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str6 = companyFileData5.getCity();
        java.lang.String str7 = companyFileData5.getPhone();
        java.lang.String str8 = companyFileData5.getSnpIndexStr();
        companyFileData5.setTicker("");
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData15 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList13);
        java.lang.String str16 = estimateFileData15.getSector();
        java.lang.String str17 = estimateFileData15.toDbOutput();
        double double18 = estimateFileData15.getEpsY1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData19 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData19.setInstBuyShrs("");
        double[] doubleArray22 = sharesFileData19.getSharesYr();
        long long23 = sharesFileData19.getVolume10d();
        sharesFileData19.setBeta("");
        double double26 = sharesFileData19.getDollar3m();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray28 = incSheetFileData27.getIncPrimaryEpsQtr();
        double[] doubleArray29 = incSheetFileData27.getNetIncQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData30 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData31 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData30);
        double[] doubleArray32 = balSheetFileData31.getEquityYr();
        double[] doubleArray33 = balSheetFileData31.getGoodwillQtr();
        double[] doubleArray34 = balSheetFileData31.getOtherCurrAssetsYr();
        double[] doubleArray35 = balSheetFileData31.getLtDebtYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData36 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData37 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData36);
        java.lang.String str38 = cashFileData37.toString();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData41 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData5, estimateFileData15, sharesFileData19, incSheetFileData27, balSheetFileData31, cashFileData37, 0, 32);
        net.ajaskey.common.DateTime dateTime42 = estimateFileData15.getLatestQtrEps();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(estimateFileData15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0]");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNull(doubleArray28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertNull(doubleArray33);
        org.junit.Assert.assertNull(doubleArray34);
        org.junit.Assert.assertNull(doubleArray35);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Cash File Data" + "'", str38, "Cash File Data");
        org.junit.Assert.assertNull(dateTime42);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0448");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getAcctRxYr();
        double[] doubleArray3 = balSheetFileData1.getBvpsYr();
        double[] doubleArray4 = balSheetFileData1.getLtInvestQtr();
        java.lang.String str5 = balSheetFileData1.getSector();
        double[] doubleArray6 = balSheetFileData1.getOtherCurrLiabQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(doubleArray6);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0449");
        java.lang.String[] strArray3 = new java.lang.String[] { "out/BigDB/10/Q32/data/BigDB/-fundamental-data-10Q32.NONE", "out/BigDB/100/Q100/Cash File Data-fundamental-data-100Q100.Cash File Data", "out/BigDB/" };
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
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0450");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear fieldDataYear1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear(32);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0451");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str6 = companyFileData5.getState();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData11 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList9);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData12 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList9);
        java.util.List<java.lang.String> strList13 = companyFileData5.set((java.util.List<java.lang.String>) strList9);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData14 = net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData.readFromDb(strList13);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData15 = net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readFromDb(strList13);
        java.lang.String str16 = cashFileData15.toString();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData17 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData15);
        double[] doubleArray18 = cashFileData15.getCashFromOpsQtr();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(estimateFileData11);
        org.junit.Assert.assertNotNull(companyFileData12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(incSheetFileData14);
        org.junit.Assert.assertNotNull(cashFileData15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Cash File Data" + "'", str16, "Cash File Data");
        org.junit.Assert.assertNull(doubleArray18);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0452");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getEpsContQtr();
        double[] doubleArray2 = incSheetFileData0.getIncTaxYr();
        double[] doubleArray3 = incSheetFileData0.getGrossOpIncYr();
        double[] doubleArray4 = incSheetFileData0.getTotalOpExpYr();
        double[] doubleArray5 = incSheetFileData0.getIntExpNonOpYr();
        java.lang.String str6 = incSheetFileData0.toString();
        double[] doubleArray7 = incSheetFileData0.getEpsDilQtr();
        double[] doubleArray8 = incSheetFileData0.getTotalOpExpYr();
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
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0453");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInsiderSells();
        sharesFileData0.setInstSellShrs("out/BigDB/");
        sharesFileData0.setInsiderOwnership("");
        double double6 = sharesFileData0.getMktCap();
        int int7 = sharesFileData0.getInsiderBuys();
        sharesFileData0.setPrice("");
        java.lang.String str10 = sharesFileData0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0454");
        java.lang.String[] strArray5 = new java.lang.String[] { "NONE", "NONE", "NONE", "  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n", "Cash File Data" };
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
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0455");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getAcctRxYr();
        double[] doubleArray3 = balSheetFileData1.getBvpsYr();
        java.lang.String str4 = balSheetFileData1.toDbOutput();
        double[] doubleArray5 = balSheetFileData1.getLtDebtYr();
        java.lang.String str6 = balSheetFileData1.getIndustry();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0456");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getIncPrimaryEpsQtr();
        double[] doubleArray2 = incSheetFileData0.getIncPrimaryEpsQtr();
        double[] doubleArray3 = incSheetFileData0.getRdYr();
        double[] doubleArray4 = incSheetFileData0.getCogsQtr();
        java.lang.String str5 = incSheetFileData0.toDbOutput();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0457");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getFromDb("", 6, (int) (short) 100, filetypeEnum3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0458");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getOtherLtLiabQtr();
        java.lang.String str6 = fieldData2.genOutput();
        java.lang.String str7 = fieldData2.getSnpIndexStr();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum8 = fieldData2.getExchange();
        double[] doubleArray9 = fieldData2.getCashQtr();
        double[] doubleArray10 = fieldData2.getDepreciationYr();
        double[] doubleArray11 = fieldData2.getPreTaxIncQtr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(exchEnum8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0459");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum1 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.convertExchange("Cash File Data");
        org.junit.Assert.assertTrue("'" + exchEnum1 + "' != '" + net.ajaskey.market.tools.SIP.BigDB.ExchEnum.NONE + "'", exchEnum1.equals(net.ajaskey.market.tools.SIP.BigDB.ExchEnum.NONE));
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0460");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.setQMemory((int) '4', (-1), filetypeEnum2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0461");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setInstBuyShrs("");
        double[] doubleArray3 = sharesFileData0.getSharesYr();
        long long4 = sharesFileData0.getVolume10d();
        sharesFileData0.setBeta("");
        long long7 = sharesFileData0.getVolume10d();
        sharesFileData0.setInsiderSellShrs("hi!");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData12 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str13 = fieldData12.getPhone();
        double[] doubleArray14 = fieldData12.getIntExpYr();
        double[] doubleArray15 = fieldData12.getOtherLtLiabQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData16 = fieldData12.getBalSheetData();
        double double17 = fieldData12.getInsiderNetPercentOutstanding();
        double[] doubleArray18 = fieldData12.getCapExQtr();
        double[] doubleArray19 = fieldData12.getSharesQtr();
        sharesFileData0.setSharesQ(doubleArray19);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(doubleArray14);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNotNull(balSheetFileData16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNull(doubleArray18);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0]");
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0462");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData0.setInstBuyShrs("");
        sharesFileData0.setInstBuyShrs("out/BigDB/10/Q-1/hi!-fundamental-data-10Q-1.");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList7);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData10 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList7);
        java.lang.String str11 = companyFileData10.getCity();
        java.lang.String str12 = companyFileData10.getPhone();
        java.lang.String str13 = companyFileData10.getSnpIndexStr();
        companyFileData10.setTicker("");
        java.lang.String str16 = companyFileData10.getZip();
        sharesFileData0.setNameFields(companyFileData10);
        int int18 = sharesFileData0.getInsiderBuys();
        sharesFileData0.setFloatshr("out/BigDB/0/Q0/out/BigDB/0/Q0/-fundamental-data-0Q0.out/BigDB/-fundamental-data-0Q0.  price               : 0.000000\r\n  price 52w high      : 0.000000\r\n  price 52w low       : 0.000000\r\n  float               : 0.000000\r\n  market cap          : 0.000000\r\n  volume 10d avg      : 0\r\n  volume 3m avg       : 0\r\n  dollars 3m avg      : 0.000000\r\n  beta                : 0.000000\r\n  insider ownership   : 0.000000\r\n  insider buys        : 0\r\n  insider sells       : 0\r\n  insider buy shares  : 0\r\n  insider sell shares : 0\r\n  insider net shares  : 0\r\n  inst buy shares     : 0\r\n  inst sell shares    : 0\r\n  inst shareholders   : 0\r\n  inst ownership      : 0.000000\r\n  shares quarterly    : \r\n  shares yearly       : \r\n");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(estimateFileData9);
        org.junit.Assert.assertNotNull(companyFileData10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0463");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInsiderSells();
        sharesFileData0.setInstSellShrs("out/BigDB/");
        sharesFileData0.setInsiderOwnership("");
        double double6 = sharesFileData0.getMktCap();
        int int7 = sharesFileData0.getInsiderSells();
        sharesFileData0.setInstSellShrs("data/BigDB/");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0464");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getEpsContQtr();
        double[] doubleArray2 = incSheetFileData0.getIncTaxYr();
        double[] doubleArray3 = incSheetFileData0.getGrossOpIncYr();
        double[] doubleArray4 = incSheetFileData0.getOtherIncQtr();
        double[] doubleArray5 = incSheetFileData0.getIncAfterTaxQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0465");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData9 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList7);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData10 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList7);
        java.lang.String str11 = companyFileData10.getCity();
        java.lang.String str12 = companyFileData10.getPhone();
        java.lang.String str13 = companyFileData10.getWeb();
        estimateFileData4.setNameFields(companyFileData10);
        java.lang.String str15 = companyFileData10.getName();
        companyFileData10.setName("Cash File Data");
        companyFileData10.setNumEmployees("");
        companyFileData10.setSector("out/BigDB/10/Q-1/hi!-fundamental-data-10Q-1.");
        companyFileData10.setIndustry("out/BigDB/100/Q100/Cash File Data-fundamental-data-100Q100.Cash File Data");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(estimateFileData9);
        org.junit.Assert.assertNotNull(companyFileData10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0466");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getAcctRxYr();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        java.lang.String str9 = companyFileData8.getCity();
        java.lang.String str10 = companyFileData8.getPhone();
        java.lang.String str11 = companyFileData8.getWeb();
        companyFileData8.setSector("out/BigDB/10/Q-1/hi!-fundamental-data-10Q-1.");
        balSheetFileData1.setNameFields(companyFileData8);
        double[] doubleArray15 = balSheetFileData1.getInventoryQtr();
        double[] doubleArray16 = balSheetFileData1.getGoodwillQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(estimateFileData7);
        org.junit.Assert.assertNotNull(companyFileData8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(doubleArray15);
        org.junit.Assert.assertNull(doubleArray16);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0467");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str7 = balSheetFileData6.toString();
        double[] doubleArray8 = balSheetFileData6.getLtInvestQtr();
        double[] doubleArray9 = balSheetFileData6.getCashQtr();
        double[] doubleArray10 = balSheetFileData6.getTotalAssetsYr();
        double[] doubleArray11 = balSheetFileData6.getStInvestQtr();
        double[] doubleArray12 = balSheetFileData6.getInventoryQtr();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNotNull(balSheetFileData6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0468");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str6 = companyFileData5.getCity();
        java.lang.String str7 = companyFileData5.getSnpIndexStr();
        companyFileData5.setDowIndex("out/BigDB/10/Q-1/hi!-fundamental-data-10Q-1.");
        boolean boolean10 = companyFileData5.isAdr();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0469");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getOtherLtLiabQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData6 = fieldData2.getBalSheetData();
        double[] doubleArray7 = balSheetFileData6.getGoodwillQtr();
        double[] doubleArray8 = balSheetFileData6.getAcctRxYr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNotNull(balSheetFileData6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0470");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getAcctRxYr();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData7 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData8 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList5);
        java.lang.String str9 = companyFileData8.getCity();
        java.lang.String str10 = companyFileData8.getPhone();
        java.lang.String str11 = companyFileData8.getWeb();
        companyFileData8.setSector("out/BigDB/10/Q-1/hi!-fundamental-data-10Q-1.");
        balSheetFileData1.setNameFields(companyFileData8);
        java.lang.String str15 = companyFileData8.getZip();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(estimateFileData7);
        org.junit.Assert.assertNotNull(companyFileData8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0471");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str6 = companyFileData5.getCity();
        java.lang.String str7 = companyFileData5.getPhone();
        java.lang.String str8 = companyFileData5.getSnpIndexStr();
        companyFileData5.setTicker("");
        java.lang.String str11 = companyFileData5.getName();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0472");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData((int) 'a', (-1));
        double[] doubleArray3 = fieldData2.getCashFromInvQtr();
        double[] doubleArray4 = fieldData2.getOtherIncYr();
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0473");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str6 = companyFileData5.getCity();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum7 = companyFileData5.getExchange();
        companyFileData5.setCountry("NONE");
        companyFileData5.setName("out/BigDB/100/Q100/Cash File Data-fundamental-data-100Q100.Cash File Data");
        java.lang.String str12 = companyFileData5.getDowIndexStr();
        java.lang.String str13 = companyFileData5.getSector();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(exchEnum7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0474");
        java.lang.String str4 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getOutfileName((int) (byte) 0, 0, "Cash File Data", "Cash File Data");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "out/BigDB/0/Q0/Cash File Data-fundamental-data-0Q0.Cash File Data" + "'", str4, "out/BigDB/0/Q0/Cash File Data-fundamental-data-0Q0.Cash File Data");
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0475");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getEpsDilYr();
        double double6 = fieldData2.getPrice();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData7 = fieldData2.getIncSheetData();
        double[] doubleArray8 = incSheetFileData7.getTotalOpExpQtr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(incSheetFileData7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0476");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getIncPrimaryEpsQtr();
        double[] doubleArray2 = incSheetFileData0.getNetIncQtr();
        double[] doubleArray3 = incSheetFileData0.getIncAfterTaxYr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0477");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getEquityYr();
        double[] doubleArray3 = balSheetFileData1.getGoodwillQtr();
        double[] doubleArray4 = balSheetFileData1.getOtherCurrAssetsYr();
        double[] doubleArray5 = balSheetFileData1.getOtherCurrAssetsQtr();
        double[] doubleArray6 = balSheetFileData1.getStDebtYr();
        double[] doubleArray7 = balSheetFileData1.getOtherLtAssetsQtr();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0478");
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int1 = sharesFileData0.getInsiderSells();
        sharesFileData0.setInstSellShrs("out/BigDB/");
        java.lang.String str4 = sharesFileData0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0479");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str6 = companyFileData5.getCity();
        java.lang.String str7 = companyFileData5.getPhone();
        java.lang.String str8 = companyFileData5.getSnpIndexStr();
        companyFileData5.setTicker("");
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData15 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList13);
        java.lang.String str16 = estimateFileData15.getSector();
        java.lang.String str17 = estimateFileData15.toDbOutput();
        double double18 = estimateFileData15.getEpsY1();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData19 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        sharesFileData19.setInstBuyShrs("");
        double[] doubleArray22 = sharesFileData19.getSharesYr();
        long long23 = sharesFileData19.getVolume10d();
        sharesFileData19.setBeta("");
        double double26 = sharesFileData19.getDollar3m();
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray28 = incSheetFileData27.getIncPrimaryEpsQtr();
        double[] doubleArray29 = incSheetFileData27.getNetIncQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData30 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData31 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData30);
        double[] doubleArray32 = balSheetFileData31.getEquityYr();
        double[] doubleArray33 = balSheetFileData31.getGoodwillQtr();
        double[] doubleArray34 = balSheetFileData31.getOtherCurrAssetsYr();
        double[] doubleArray35 = balSheetFileData31.getLtDebtYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData36 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData37 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData36);
        java.lang.String str38 = cashFileData37.toString();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData41 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData5, estimateFileData15, sharesFileData19, incSheetFileData27, balSheetFileData31, cashFileData37, 0, 32);
        double[] doubleArray42 = balSheetFileData31.getLtDebtQtr();
        double[] doubleArray43 = balSheetFileData31.getGoodwillQtr();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(estimateFileData15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0]");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNull(doubleArray28);
        org.junit.Assert.assertNull(doubleArray29);
        org.junit.Assert.assertNull(doubleArray32);
        org.junit.Assert.assertNull(doubleArray33);
        org.junit.Assert.assertNull(doubleArray34);
        org.junit.Assert.assertNull(doubleArray35);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Cash File Data" + "'", str38, "Cash File Data");
        org.junit.Assert.assertNull(doubleArray42);
        org.junit.Assert.assertNull(doubleArray43);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0480");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getUnusualIncYr();
        double[] doubleArray6 = fieldData2.getLtDebtYr();
        double[] doubleArray7 = fieldData2.getInventoryQtr();
        double[] doubleArray8 = fieldData2.getNonrecurringItemsQtr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0481");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str6 = companyFileData5.getCity();
        java.lang.String str7 = companyFileData5.getCity();
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData12 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList10);
        java.lang.String str13 = estimateFileData12.getSector();
        java.lang.String str14 = estimateFileData12.getIndustry();
        double double15 = estimateFileData12.getEpsY2();
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData20 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList18);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData21 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList18);
        java.lang.String str22 = companyFileData21.getCity();
        java.lang.String str23 = companyFileData21.getPhone();
        java.lang.String str24 = companyFileData21.getWeb();
        java.lang.String str25 = companyFileData21.getSic();
        estimateFileData12.setNameFields(companyFileData21);
        net.ajaskey.common.DateTime dateTime27 = estimateFileData12.getCurrFiscalYear();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData28 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData();
        int int29 = sharesFileData28.getInsiderSells();
        sharesFileData28.setInstSellShrs("out/BigDB/");
        sharesFileData28.setInsiderOwnership("");
        double double34 = sharesFileData28.getMktCap();
        net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData35 = new net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData(sharesFileData28);
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData36 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray37 = incSheetFileData36.getEpsContQtr();
        double[] doubleArray38 = incSheetFileData36.getIncTaxYr();
        double[] doubleArray39 = incSheetFileData36.getGrossOpIncYr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData40 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData41 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData40);
        double[] doubleArray42 = balSheetFileData41.getCashQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData43 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData44 = new net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData(cashFileData43);
        java.lang.String str45 = cashFileData44.toString();
        double[] doubleArray46 = cashFileData44.getCashFromInvQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData49 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(companyFileData5, estimateFileData12, sharesFileData28, incSheetFileData36, balSheetFileData41, cashFileData44, (int) (short) 10, (int) (short) 0);
        double[] doubleArray50 = incSheetFileData36.getAdjToIncQtr();
        double[] doubleArray51 = incSheetFileData36.getCogsQtr();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(estimateFileData12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(estimateFileData20);
        org.junit.Assert.assertNotNull(companyFileData21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(dateTime27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertNull(doubleArray37);
        org.junit.Assert.assertNull(doubleArray38);
        org.junit.Assert.assertNull(doubleArray39);
        org.junit.Assert.assertNull(doubleArray42);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Cash File Data" + "'", str45, "Cash File Data");
        org.junit.Assert.assertNull(doubleArray46);
        org.junit.Assert.assertNull(doubleArray50);
        org.junit.Assert.assertNull(doubleArray51);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0482");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getEpsDilYr();
        double double6 = fieldData2.getPrice();
        double[] doubleArray7 = fieldData2.getBvpsQtr();
        double[] doubleArray8 = fieldData2.getBvpsQtr();
        double[] doubleArray9 = fieldData2.getIncTaxYr();
        double double10 = fieldData2.getPrice();
        long long11 = fieldData2.getVolumeMonth3m();
        double[] doubleArray12 = fieldData2.getTotalOpExpYr();
        double[] doubleArray13 = fieldData2.getNetIncYr();
        double[] doubleArray14 = fieldData2.getIncTaxYr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNull(doubleArray13);
        org.junit.Assert.assertNull(doubleArray14);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0483");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum3 = fieldData2.getDowIndex();
        double double4 = fieldData2.getInsiderOwnership();
        int int5 = fieldData2.getInsiderBuys();
        double[] doubleArray6 = fieldData2.getCashFromInvQtr();
        double[] doubleArray7 = fieldData2.getGrossOpIncYr();
        double[] doubleArray8 = fieldData2.getCashYr();
        double[] doubleArray9 = fieldData2.getAcctPayableYr();
        org.junit.Assert.assertNull(dowEnum3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0484");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData4 = net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData5 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData6 = net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData.readFromDb((java.util.List<java.lang.String>) strList2);
        java.lang.String str7 = balSheetFileData6.toString();
        double[] doubleArray8 = balSheetFileData6.getStInvestYr();
        double[] doubleArray9 = balSheetFileData6.getNetFixedAssetsYr();
        double[] doubleArray10 = balSheetFileData6.getOtherCurrLiabYr();
        java.lang.String str11 = balSheetFileData6.getIndustry();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(estimateFileData4);
        org.junit.Assert.assertNotNull(companyFileData5);
        org.junit.Assert.assertNotNull(balSheetFileData6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0485");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        java.lang.String str5 = fieldData2.getSnpIndexStr();
        double[] doubleArray6 = fieldData2.getNetFixedAssetsQtr();
        double[] doubleArray7 = fieldData2.getIncPrimaryEpsQtr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0486");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getEpsContQtr();
        double[] doubleArray2 = incSheetFileData0.getPreTaxIncQtr();
        java.lang.String str3 = incSheetFileData0.getName();
        double[] doubleArray4 = incSheetFileData0.getGrossOpIncYr();
        double[] doubleArray5 = incSheetFileData0.getUnusualIncQtr();
        double[] doubleArray6 = incSheetFileData0.getUnusualIncQtr();
        double[] doubleArray7 = incSheetFileData0.getUnusualIncQtr();
        double[] doubleArray8 = incSheetFileData0.getGrossIncQtr();
        double[] doubleArray9 = incSheetFileData0.getNetIncQtr();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0487");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getOtherLtLiabQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData6 = fieldData2.getBalSheetData();
        double[] doubleArray7 = fieldData2.getSalesQtr();
        double[] doubleArray8 = fieldData2.getNetIncQtr();
        double[] doubleArray9 = fieldData2.getUnusualIncYr();
        double[] doubleArray10 = fieldData2.getOtherLtLiabQtr();
        double double11 = fieldData2.getEpsY2();
        double[] doubleArray12 = fieldData2.getSharesQtr();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getTtm(doubleArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertNotNull(balSheetFileData6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(doubleArray10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0]");
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0488");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.readSipData("NONE");
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0489");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData1 = net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData.find("Cash File Data");
        org.junit.Assert.assertNull(companyFileData1);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0490");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum3 = fieldData2.getDowIndex();
        double double4 = fieldData2.getInsiderOwnership();
        int int5 = fieldData2.getInsiderBuys();
        double[] doubleArray6 = fieldData2.getCashFromInvQtr();
        double[] doubleArray7 = fieldData2.getGrossOpIncYr();
        double double8 = fieldData2.getEpsY0();
        double[] doubleArray9 = fieldData2.getPreTaxIncQtr();
        double[] doubleArray10 = fieldData2.getSharesQtr();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData.getTtm(doubleArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dowEnum3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0]");
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0491");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getOtherLtLiabQtr();
        int int6 = fieldData2.getInsiderBuyShrs();
        double double7 = fieldData2.getDollar3m();
        java.lang.String str8 = fieldData2.genOutput();
        boolean boolean9 = fieldData2.isAdr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0492");
        net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData.readSipData("NONE");
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0493");
        net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData();
        double[] doubleArray1 = incSheetFileData0.getIncPrimaryEpsQtr();
        double[] doubleArray2 = incSheetFileData0.getDividendYr();
        double[] doubleArray3 = incSheetFileData0.getIncPrimaryEpsYr();
        java.lang.String str4 = incSheetFileData0.getName();
        org.junit.Assert.assertNull(doubleArray1);
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0494");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getEpsDilYr();
        double double6 = fieldData2.getPrice52hi();
        double[] doubleArray7 = fieldData2.getInventoryQtr();
        double[] doubleArray8 = fieldData2.getCashFromOpsQtr();
        double[] doubleArray9 = fieldData2.getAcctPayableQtr();
        java.lang.String str10 = fieldData2.getStreet();
        double[] doubleArray11 = fieldData2.getDividendYr();
        double[] doubleArray12 = fieldData2.getCogsQtr();
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData13 = fieldData2.getEstimateData();
        double[] doubleArray14 = fieldData2.getRdQtr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
        org.junit.Assert.assertNotNull(estimateFileData13);
        org.junit.Assert.assertNull(doubleArray14);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0495");
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData0 = null;
        net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData1 = new net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData(balSheetFileData0);
        double[] doubleArray2 = balSheetFileData1.getEquityYr();
        double[] doubleArray3 = balSheetFileData1.getGoodwillQtr();
        double[] doubleArray4 = balSheetFileData1.getCurrAssetsQtr();
        java.lang.String str5 = balSheetFileData1.getExchange();
        double[] doubleArray6 = balSheetFileData1.getCurrLiabQtr();
        java.lang.String str7 = balSheetFileData1.getIndustry();
        org.junit.Assert.assertNull(doubleArray2);
        org.junit.Assert.assertNull(doubleArray3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(doubleArray6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0496");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getOtherLtLiabQtr();
        java.lang.String str6 = fieldData2.genOutput();
        java.lang.String str7 = fieldData2.getSnpIndexStr();
        java.lang.String str8 = fieldData2.getPhone();
        double[] doubleArray9 = fieldData2.getEquityQtr();
        double double10 = fieldData2.getInstOwnership();
        java.lang.String str11 = fieldData2.getTicker();
        double[] doubleArray12 = fieldData2.getUnusualIncYr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(doubleArray12);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0497");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        int int3 = fieldData2.getInstSellShrs();
        double[] doubleArray4 = fieldData2.getAcctRxQtr();
        double double5 = fieldData2.getEpsQ0();
        double double6 = fieldData2.getPrice52hi();
        double[] doubleArray7 = fieldData2.getOtherIncQtr();
        double double8 = fieldData2.getInsiderOwnership();
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum9 = fieldData2.getExchange();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = exchEnum9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(exchEnum9);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0498");
        net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData.readSipData("out/BigDB/0/Q0/-fundamental-data-0Q0.out/BigDB/");
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0499");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getEpsDilYr();
        double double6 = fieldData2.getPrice52hi();
        double[] doubleArray7 = fieldData2.getInventoryQtr();
        double[] doubleArray8 = fieldData2.getCashFromOpsQtr();
        double[] doubleArray9 = fieldData2.getAcctPayableQtr();
        java.lang.String str10 = fieldData2.getStreet();
        double[] doubleArray11 = fieldData2.getDividendYr();
        double[] doubleArray12 = fieldData2.getCogsQtr();
        fieldData2.setQuarter((int) (byte) 1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(doubleArray7);
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(doubleArray11);
        org.junit.Assert.assertNull(doubleArray12);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DataIoTests0.test0500");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData(1, 1);
        java.lang.String str3 = fieldData2.getPhone();
        double[] doubleArray4 = fieldData2.getIntExpYr();
        double[] doubleArray5 = fieldData2.getOtherLtLiabQtr();
        java.lang.String str6 = fieldData2.genOutput();
        java.lang.String str7 = fieldData2.getSnpIndexStr();
        double[] doubleArray8 = fieldData2.getInventoryQtr();
        fieldData2.setYear(0);
        double[] doubleArray11 = fieldData2.getEpsContQtr();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(doubleArray4);
        org.junit.Assert.assertNull(doubleArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(doubleArray8);
        org.junit.Assert.assertNull(doubleArray11);
    }
}

