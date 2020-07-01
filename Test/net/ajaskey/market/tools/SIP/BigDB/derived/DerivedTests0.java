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
        double double0 = net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.MILLION;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 1000000.0d + "'", double0 == 1000000.0d);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0002");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (short) 0, 0, filetypeEnum2);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0003");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8, fieldDataArray7);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21, fieldDataArray20);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 100, 10, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        java.lang.Class<?> wildcardClass25 = fieldDataList21.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(fieldDataArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(fieldDataArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0004");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb(0, (int) (short) 10, filetypeEnum2);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0005");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (short) 10, (int) (short) 10, filetypeEnum2);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0006");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8, fieldDataArray7);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8);
        java.lang.Class<?> wildcardClass11 = fieldDataList8.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(fieldDataArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0007");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) 'a', (int) (short) 10, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0008");
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.write();
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0009");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) ' ', (int) 'a', filetypeEnum2);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0010");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb(10, (int) '4', filetypeEnum2);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0011");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0012");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (byte) 1, (int) '4', filetypeEnum2);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0013");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate(0, (int) (short) 1, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0014");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 0, (int) (byte) 10, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0015");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((-1), (int) (byte) 0, filetypeEnum2);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0016");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb(100, (int) (short) 100, filetypeEnum2);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0017");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) 'a', (int) '#', filetypeEnum2);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0018");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8, fieldDataArray7);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21, fieldDataArray20);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 100, 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        java.lang.Class<?> wildcardClass25 = fieldDataList21.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(fieldDataArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(fieldDataArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0019");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb(1, (int) (short) -1, filetypeEnum2);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0020");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8, fieldDataArray7);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21, fieldDataArray20);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 100, 10, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray34 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList35 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35, fieldDataArray34);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList30, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 100, (int) 'a', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35);
        java.lang.Class<?> wildcardClass39 = fieldDataList35.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0021");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (byte) 1, (int) (short) 0, filetypeEnum2);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0022");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) '#', (int) (byte) 10, filetypeEnum2);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0023");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8, fieldDataArray7);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (short) 10, (int) (byte) 0, fieldDataList13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(fieldDataArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0024");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate(100, (int) (short) 0, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0025");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) 'a', (int) (byte) 10, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0026");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (byte) 0, (-1), filetypeEnum2);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0027");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) '4', (int) '#', filetypeEnum2);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0028");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (byte) 1, 1, filetypeEnum2);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0029");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8, fieldDataArray7);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21, fieldDataArray20);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 100, 10, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray34 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList35 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35, fieldDataArray34);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList30, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 100, (int) 'a', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList41 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (short) 10, (-1), fieldDataList41);
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
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0030");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) 'a', (-1), fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0031");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8, fieldDataArray7);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21, fieldDataArray20);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 100, 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray34 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList35 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35, fieldDataArray34);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList30, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (int) ' ', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35);
        java.lang.Class<?> wildcardClass39 = strList3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0032");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (byte) 100, (int) (short) 100, filetypeEnum2);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0033");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (short) 0, (int) ' ', filetypeEnum2);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0034");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (byte) -1, (int) (byte) -1, filetypeEnum2);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0035");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (byte) -1, (int) 'a', fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0036");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (byte) 100, (int) (byte) -1, filetypeEnum2);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0037");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate(100, (int) '#', fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0038");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8, fieldDataArray7);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21, fieldDataArray20);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray33 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList34 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList34, fieldDataArray33);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList29, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList34);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) ' ', (int) 'a', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList34);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, 100, (int) '4', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList34);
        java.lang.Class<?> wildcardClass39 = strList3.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(fieldDataArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(fieldDataArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(fieldDataArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0039");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (byte) 100, (int) (byte) 10, filetypeEnum2);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0040");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) ' ', (int) (byte) 1, filetypeEnum2);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0041");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8, fieldDataArray7);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21, fieldDataArray20);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 100, 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        java.lang.String[] strArray28 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray40 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList41 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList41, fieldDataArray40);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList36, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList41);
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList49 = new java.util.ArrayList<java.lang.String>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList49, strArray48);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray53 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList54 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList54, fieldDataArray53);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList49, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList54);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList36, (int) (byte) 100, 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList54);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList29, (int) '#', (int) (short) 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList54);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) (byte) 10, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList54);
        java.lang.Class<?> wildcardClass60 = fieldDataList54.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(fieldDataArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(fieldDataArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(fieldDataArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(fieldDataArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0042");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (byte) 100, 0, filetypeEnum2);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0043");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) '#', 100, filetypeEnum2);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0044");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb(0, (int) (byte) 10, filetypeEnum2);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0045");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (short) 100, (int) (short) 100, filetypeEnum2);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0046");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8, fieldDataArray7);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21, fieldDataArray20);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 100, 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray34 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList35 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35, fieldDataArray34);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList30, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35);
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray47 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList48 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList48, fieldDataArray47);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList43, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList48);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList30, (int) (byte) 100, 10, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList48);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 100, (int) (byte) 0, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList48);
        java.lang.Class<?> wildcardClass53 = strList3.getClass();
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
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(fieldDataArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0047");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (byte) -1, (int) '#', fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0048");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) '#', (int) (short) 1, filetypeEnum2);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0049");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate(100, (int) (byte) -1, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0050");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb(10, (int) (byte) 0, filetypeEnum2);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0051");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray13 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList14, fieldDataArray13);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList9, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList14);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray26 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList27, fieldDataArray26);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList22, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList27);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList9, (int) (byte) 100, 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList27);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList2, (int) '#', (int) (short) 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList27);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray34 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList35 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35, fieldDataArray34);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList2, (int) (byte) -1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35);
        java.lang.Class<?> wildcardClass38 = fieldDataList35.getClass();
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
        org.junit.Assert.assertNotNull(fieldDataArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0052");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb(0, (int) (short) -1, filetypeEnum2);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0053");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8, fieldDataArray7);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21, fieldDataArray20);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 100, 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray34 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList35 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35, fieldDataArray34);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList30, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (int) ' ', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35);
        java.lang.String[] strArray43 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray48 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList49 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList49, fieldDataArray48);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList44, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList49);
        java.lang.String[] strArray56 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList57 = new java.util.ArrayList<java.lang.String>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList57, strArray56);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray61 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList62 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList62, fieldDataArray61);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList57, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList62);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList44, (int) (byte) 100, 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList62);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 100, 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList62);
        java.lang.Class<?> wildcardClass67 = fieldDataList62.getClass();
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
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(fieldDataArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(fieldDataArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0054");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb(0, (int) (short) 100, filetypeEnum2);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0055");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray14 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList15, fieldDataArray14);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList10, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList15);
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList28 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList28, fieldDataArray27);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList23, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList28);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList10, (int) (byte) 100, 10, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList28);
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList37 = new java.util.ArrayList<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList37, strArray36);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray41 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList42 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList42, fieldDataArray41);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList37, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList42);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList10, (int) (byte) 100, (int) 'a', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList42);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray48 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList49 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList49, fieldDataArray48);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList10, (int) (byte) 1, (int) (byte) 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList49);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (short) 10, (int) (byte) 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList49);
        java.lang.Class<?> wildcardClass53 = strList3.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(fieldDataArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(fieldDataArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(fieldDataArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(fieldDataArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0056");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb(100, 100, filetypeEnum2);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0057");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) 'a', 100, fieldData2);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0058");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((-1), (int) (byte) 100, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0059");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) '4', 0, filetypeEnum2);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0060");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (byte) 1, (int) (short) 1, filetypeEnum2);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0061");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) '#', 100, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0062");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8, fieldDataArray7);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21, fieldDataArray20);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 100, 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray34 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList35 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35, fieldDataArray34);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList30, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (int) ' ', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35);
        java.lang.String[] strArray43 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray48 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList49 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList49, fieldDataArray48);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList44, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList49);
        java.lang.String[] strArray56 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList57 = new java.util.ArrayList<java.lang.String>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList57, strArray56);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray61 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList62 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList62, fieldDataArray61);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList57, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList62);
        java.lang.String[] strArray69 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList70 = new java.util.ArrayList<java.lang.String>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList70, strArray69);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray74 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList75 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList75, fieldDataArray74);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList70, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList75);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList57, (int) ' ', (int) 'a', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList75);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList44, 100, (int) '4', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList75);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (int) (byte) -1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList75);
        java.lang.Class<?> wildcardClass81 = strList3.getClass();
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
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(fieldDataArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(fieldDataArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(fieldDataArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(wildcardClass81);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0063");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (short) 0, (int) (byte) 10, filetypeEnum2);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0064");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (short) 0, (int) (short) 0, filetypeEnum2);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0065");
        java.util.List<java.lang.String> strList0 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray10 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList11, fieldDataArray10);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList6, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList11);
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray23 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList24, fieldDataArray23);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList19, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList24);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList6, (int) (byte) 100, 10, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList24);
        java.lang.String[] strArray32 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray37 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList38 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList38, fieldDataArray37);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList33, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList38);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList6, (int) (byte) 100, (int) 'a', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList38);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray44 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList45 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList45, fieldDataArray44);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList6, (int) (byte) 1, (int) (byte) 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList45);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList(strList0, (int) (byte) 100, 0, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList45);
        java.lang.Class<?> wildcardClass49 = fieldDataList45.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(fieldDataArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(fieldDataArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(fieldDataArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(fieldDataArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0066");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb(1, 0, filetypeEnum2);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0067");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) ' ', 0, filetypeEnum2);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0068");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (short) 10, (-1), filetypeEnum2);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0069");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8, fieldDataArray7);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21, fieldDataArray20);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray33 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList34 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList34, fieldDataArray33);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList29, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList34);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) (byte) 100, 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList34);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) '4', (int) '4', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList34);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList41 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) '4', 10, fieldDataList41);
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
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(fieldDataArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0070");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (byte) -1, (-1), filetypeEnum2);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0071");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb(1, (-1), filetypeEnum2);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0072");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8, fieldDataArray7);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21, fieldDataArray20);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 100, 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        java.lang.String[] strArray28 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray40 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList41 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList41, fieldDataArray40);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList36, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList41);
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList49 = new java.util.ArrayList<java.lang.String>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList49, strArray48);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray53 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList54 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList54, fieldDataArray53);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList49, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList54);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList36, (int) (byte) 100, 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList54);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList29, (int) '#', (int) (short) 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList54);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) (byte) 10, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList54);
        java.lang.Class<?> wildcardClass60 = strList3.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(fieldDataArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(fieldDataArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(fieldDataArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(fieldDataArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0073");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) 'a', (int) (short) 100, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0074");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (byte) 10, (int) '#', filetypeEnum2);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0075");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 0, (int) (byte) -1, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0076");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (byte) 100, 1, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0077");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8, fieldDataArray7);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21, fieldDataArray20);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) ' ', (int) 'a', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray34 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList35 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35, fieldDataArray34);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList30, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35);
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray47 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList48 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList48, fieldDataArray47);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList43, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList48);
        java.lang.String[] strArray55 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList56 = new java.util.ArrayList<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList56, strArray55);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray60 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList61 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList61, fieldDataArray60);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList56, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList61);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList43, (int) (byte) 100, 10, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList61);
        java.lang.String[] strArray69 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList70 = new java.util.ArrayList<java.lang.String>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList70, strArray69);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray74 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList75 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList75, fieldDataArray74);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList70, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList75);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList43, (int) (byte) 100, (int) 'a', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList75);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray81 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList82 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList82, fieldDataArray81);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList43, (int) (byte) 1, (int) (byte) 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList82);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList30, (int) (short) 10, 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList82);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (short) 100, (int) ' ', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList82);
        java.lang.Class<?> wildcardClass87 = fieldDataList82.getClass();
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
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(fieldDataArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(fieldDataArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(fieldDataArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(fieldDataArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(wildcardClass87);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0078");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (short) 0, (int) (short) 100, filetypeEnum2);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0079");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (byte) 0, 1, filetypeEnum2);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0080");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) '4', (int) (short) 100, filetypeEnum2);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0081");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb(100, (int) (short) 10, filetypeEnum2);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0082");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) '#', (int) '#', filetypeEnum2);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0083");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb(100, 0, filetypeEnum2);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0084");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 100, (-1), fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0085");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) 'a', (int) (byte) 0, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0086");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) '#', (int) (short) 0, filetypeEnum2);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0087");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8, fieldDataArray7);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21, fieldDataArray20);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) ' ', (int) 'a', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        java.lang.Class<?> wildcardClass25 = strList3.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(fieldDataArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(fieldDataArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0088");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate(1, 1, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0089");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8, fieldDataArray7);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21, fieldDataArray20);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray33 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList34 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList34, fieldDataArray33);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList29, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList34);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) ' ', (int) 'a', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList34);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, 100, (int) '4', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList34);
        java.lang.String[] strArray43 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray48 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList49 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList49, fieldDataArray48);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList44, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList49);
        java.lang.String[] strArray56 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList57 = new java.util.ArrayList<java.lang.String>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList57, strArray56);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray61 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList62 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList62, fieldDataArray61);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList57, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList62);
        java.lang.String[] strArray69 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList70 = new java.util.ArrayList<java.lang.String>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList70, strArray69);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray74 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList75 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList75, fieldDataArray74);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList70, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList75);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList57, (int) ' ', (int) 'a', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList75);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList44, 100, (int) '4', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList75);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (short) 0, (int) '4', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList75);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList83 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, 10, (int) '4', fieldDataList83);
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
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(fieldDataArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(fieldDataArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(fieldDataArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(fieldDataArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0090");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (short) 100, (int) (byte) -1, filetypeEnum2);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0091");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (short) 0, (int) '4', filetypeEnum2);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0092");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (byte) 1, (int) (short) 1, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0093");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (byte) 1, 1, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0094");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (byte) -1, (int) (short) 0, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0095");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) ' ', (int) (byte) -1, filetypeEnum2);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0096");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) '4', (int) (short) 100, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0097");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (short) 0, 100, filetypeEnum2);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0098");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb(0, (int) (byte) 100, filetypeEnum2);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0099");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray13 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList14, fieldDataArray13);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList9, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList14);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray26 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList27, fieldDataArray26);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList22, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList27);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList9, (int) (byte) 100, 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList27);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList2, (int) '#', (int) (short) 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList27);
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList37 = new java.util.ArrayList<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList37, strArray36);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray41 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList42 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList42, fieldDataArray41);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList37, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList42);
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList50 = new java.util.ArrayList<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList50, strArray49);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray54 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList55 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList55, fieldDataArray54);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList50, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList55);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList37, (int) (byte) 100, 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList55);
        java.lang.String[] strArray62 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList63 = new java.util.ArrayList<java.lang.String>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList63, strArray62);
        java.lang.String[] strArray69 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList70 = new java.util.ArrayList<java.lang.String>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList70, strArray69);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray74 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList75 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList75, fieldDataArray74);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList70, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList75);
        java.lang.String[] strArray82 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList83 = new java.util.ArrayList<java.lang.String>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList83, strArray82);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray87 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList88 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList88, fieldDataArray87);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList83, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList88);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList70, (int) (byte) 100, 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList88);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList63, (int) '#', (int) (short) 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList88);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList37, (int) (byte) 1, (int) (byte) 10, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList88);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList2, 0, (int) (short) 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList88);
        java.lang.Class<?> wildcardClass95 = strList2.getClass();
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
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(fieldDataArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(fieldDataArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(fieldDataArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(fieldDataArray87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(wildcardClass95);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0100");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8, fieldDataArray7);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21, fieldDataArray20);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray33 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList34 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList34, fieldDataArray33);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList29, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList34);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) ' ', (int) 'a', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList34);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, 100, (int) '4', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList34);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList41 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, 1, 0, fieldDataList41);
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
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(fieldDataArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0101");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) '#', (int) (byte) 100, filetypeEnum2);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0102");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8, fieldDataArray7);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21, fieldDataArray20);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) ' ', (int) 'a', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        java.lang.Class<?> wildcardClass25 = fieldDataList21.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(fieldDataArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(fieldDataArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0103");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 0, 1, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0104");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8, fieldDataArray7);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21, fieldDataArray20);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray33 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList34 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList34, fieldDataArray33);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList29, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList34);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) ' ', (int) 'a', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList34);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, 100, (int) '4', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList34);
        java.lang.String[] strArray43 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray48 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList49 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList49, fieldDataArray48);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList44, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList49);
        java.lang.String[] strArray56 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList57 = new java.util.ArrayList<java.lang.String>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList57, strArray56);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray61 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList62 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList62, fieldDataArray61);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList57, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList62);
        java.lang.String[] strArray69 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList70 = new java.util.ArrayList<java.lang.String>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList70, strArray69);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray74 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList75 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList75, fieldDataArray74);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList70, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList75);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList57, (int) ' ', (int) 'a', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList75);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList44, 100, (int) '4', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList75);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (short) 0, (int) '4', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList75);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList83 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) '4', (int) (byte) -1, fieldDataList83);
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
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(fieldDataArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(fieldDataArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(fieldDataArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(fieldDataArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0105");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8, fieldDataArray7);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21, fieldDataArray20);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) ' ', (int) 'a', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray34 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList35 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35, fieldDataArray34);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList30, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35);
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray47 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList48 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList48, fieldDataArray47);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList43, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList48);
        java.lang.String[] strArray55 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList56 = new java.util.ArrayList<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList56, strArray55);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray60 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList61 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList61, fieldDataArray60);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList56, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList61);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList43, (int) (byte) 100, 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList61);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList30, (int) '4', (int) '4', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList61);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, 1, 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList61);
        java.lang.Class<?> wildcardClass67 = fieldDataList61.getClass();
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
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(fieldDataArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(fieldDataArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0106");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 100, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0107");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (byte) 100, (int) '#', filetypeEnum2);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0108");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb(1, (int) (byte) 0, filetypeEnum2);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0109");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (byte) 0, (int) (short) 100, fieldData2);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0110");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (byte) 1, 100, filetypeEnum2);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0111");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray14 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList15, fieldDataArray14);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList10, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList15);
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList28 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList28, fieldDataArray27);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList23, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList28);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList10, (int) (byte) 100, 10, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList28);
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList37 = new java.util.ArrayList<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList37, strArray36);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray41 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList42 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList42, fieldDataArray41);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList37, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList42);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList10, (int) (byte) 100, (int) 'a', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList42);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray48 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList49 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList49, fieldDataArray48);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList10, (int) (byte) 1, (int) (byte) 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList49);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (short) 10, (int) (byte) 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList49);
        java.lang.Class<?> wildcardClass53 = fieldDataList49.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(fieldDataArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(fieldDataArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(fieldDataArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(fieldDataArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0112");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8, fieldDataArray7);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21, fieldDataArray20);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 100, 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray34 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList35 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35, fieldDataArray34);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList30, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35);
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray47 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList48 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList48, fieldDataArray47);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList43, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList48);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList30, (int) (byte) 100, 10, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList48);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 100, (int) (byte) 0, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList48);
        java.lang.Class<?> wildcardClass53 = fieldDataList48.getClass();
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
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(fieldDataArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0113");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (byte) 100, (-1), filetypeEnum2);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0114");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb(10, (int) (short) 10, filetypeEnum2);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0115");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (short) 1, 1, filetypeEnum2);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0116");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8, fieldDataArray7);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21, fieldDataArray20);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 100, 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray34 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList35 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35, fieldDataArray34);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList30, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35);
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray47 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList48 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList48, fieldDataArray47);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList43, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList48);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList30, (int) (byte) 100, 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList48);
        java.lang.String[] strArray56 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList57 = new java.util.ArrayList<java.lang.String>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList57, strArray56);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray61 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList62 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList62, fieldDataArray61);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList57, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList62);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList30, (int) (byte) -1, (int) ' ', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList62);
        java.lang.String[] strArray70 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList71 = new java.util.ArrayList<java.lang.String>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList71, strArray70);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray75 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList76 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList76, fieldDataArray75);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList71, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList76);
        java.lang.String[] strArray83 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList84 = new java.util.ArrayList<java.lang.String>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList84, strArray83);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray88 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList89 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList89, fieldDataArray88);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList84, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList89);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList71, (int) (byte) 100, 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList89);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList30, (int) (byte) 100, 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList89);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (short) 1, (int) (short) 0, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList89);
        java.lang.Class<?> wildcardClass95 = strList3.getClass();
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
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(fieldDataArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(fieldDataArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(fieldDataArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(fieldDataArray88);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(wildcardClass95);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0117");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8, fieldDataArray7);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21, fieldDataArray20);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 100, 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray34 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList35 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35, fieldDataArray34);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList30, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35);
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray47 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList48 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList48, fieldDataArray47);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList43, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList48);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList30, (int) (byte) 100, 10, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList48);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 100, (int) (byte) 0, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList48);
        java.lang.String[] strArray57 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList58 = new java.util.ArrayList<java.lang.String>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList58, strArray57);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray62 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList63 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList63, fieldDataArray62);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList58, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList63);
        java.lang.String[] strArray70 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList71 = new java.util.ArrayList<java.lang.String>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList71, strArray70);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray75 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList76 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList76, fieldDataArray75);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList71, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList76);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList58, (int) (byte) 100, 10, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList76);
        java.lang.String[] strArray84 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList85 = new java.util.ArrayList<java.lang.String>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList85, strArray84);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray89 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList90 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList90, fieldDataArray89);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList85, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList90);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList58, (int) (byte) 100, (int) 'a', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList90);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 10, (int) (byte) 10, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList90);
        java.lang.Class<?> wildcardClass95 = strList3.getClass();
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
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(fieldDataArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(fieldDataArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(fieldDataArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNotNull(fieldDataArray89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(wildcardClass95);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0118");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) 'a', (int) (short) -1, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0119");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) '4', (int) (short) 10, filetypeEnum2);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0120");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (short) 10, (int) ' ', filetypeEnum2);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0121");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb(100, (int) (byte) -1, filetypeEnum2);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0122");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8, fieldDataArray7);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21, fieldDataArray20);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) ' ', (int) 'a', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray34 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList35 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35, fieldDataArray34);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList30, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35);
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray47 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList48 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList48, fieldDataArray47);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList43, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList48);
        java.lang.String[] strArray55 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList56 = new java.util.ArrayList<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList56, strArray55);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray60 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList61 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList61, fieldDataArray60);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList56, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList61);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList43, (int) (byte) 100, 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList61);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList30, (int) '4', (int) '4', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList61);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, 1, 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList61);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList69 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) 'a', (int) (short) 10, fieldDataList69);
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
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(fieldDataArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(fieldDataArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0123");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) '4', (int) 'a', filetypeEnum2);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0124");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb(100, 10, filetypeEnum2);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0125");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) 'a', (int) (byte) 0, filetypeEnum2);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0126");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (byte) 0, (int) (short) 1, filetypeEnum2);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0127");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (byte) 1, 10, filetypeEnum2);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0128");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (byte) 0, (int) (short) 10, filetypeEnum2);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0129");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb(10, (-1), filetypeEnum2);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0130");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate(100, (int) (byte) 10, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0131");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8, fieldDataArray7);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21, fieldDataArray20);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) ' ', (int) 'a', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray34 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList35 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35, fieldDataArray34);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList30, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35);
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray47 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList48 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList48, fieldDataArray47);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList43, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList48);
        java.lang.String[] strArray55 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList56 = new java.util.ArrayList<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList56, strArray55);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray60 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList61 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList61, fieldDataArray60);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList56, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList61);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList43, (int) (byte) 100, 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList61);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList30, (int) '4', (int) '4', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList61);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, 1, 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList61);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList69 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, 10, 0, fieldDataList69);
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
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(fieldDataArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(fieldDataArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0132");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (short) -1, (int) (short) 0, filetypeEnum2);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0133");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (short) 1, (int) (short) 1, filetypeEnum2);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0134");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (short) 100, (-1), filetypeEnum2);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0135");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (byte) 0, 0, filetypeEnum2);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0136");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) '#', (int) (byte) 100, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0137");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (byte) 10, (int) (byte) 1, filetypeEnum2);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0138");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (short) -1, (int) ' ', filetypeEnum2);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0139");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (short) 100, (int) (short) 10, filetypeEnum2);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0140");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) '4', (-1), fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0141");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (byte) 10, (int) (short) 0, filetypeEnum2);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0142");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) -1, (int) (short) -1, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0143");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (byte) 1, 0, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0144");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray13 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList14, fieldDataArray13);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList9, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList14);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray26 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList27, fieldDataArray26);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList22, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList27);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList9, (int) (byte) 100, 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList27);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList2, (int) '#', (int) (short) 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList27);
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList37 = new java.util.ArrayList<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList37, strArray36);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray41 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList42 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList42, fieldDataArray41);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList37, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList42);
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList50 = new java.util.ArrayList<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList50, strArray49);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray54 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList55 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList55, fieldDataArray54);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList50, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList55);
        java.lang.String[] strArray62 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList63 = new java.util.ArrayList<java.lang.String>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList63, strArray62);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray67 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList68 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList68, fieldDataArray67);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList63, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList68);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList50, (int) (byte) 100, 10, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList68);
        java.lang.String[] strArray76 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList77 = new java.util.ArrayList<java.lang.String>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList77, strArray76);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray81 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList82 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList82, fieldDataArray81);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList77, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList82);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList50, (int) (byte) 100, (int) 'a', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList82);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray88 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList89 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList89, fieldDataArray88);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList50, (int) (byte) 1, (int) (byte) 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList89);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList37, (int) (short) 10, 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList89);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList2, (int) (byte) 1, (int) (byte) 0, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList89);
        java.lang.Class<?> wildcardClass94 = fieldDataList89.getClass();
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
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(fieldDataArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(fieldDataArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(fieldDataArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(fieldDataArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(fieldDataArray88);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(wildcardClass94);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0145");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (short) -1, (int) (byte) 1, filetypeEnum2);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0146");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) '4', (int) (byte) 100, filetypeEnum2);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0147");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (byte) 0, (-1), fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0148");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate(0, (int) (byte) 100, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0149");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (short) 100, 1, filetypeEnum2);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0150");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8, fieldDataArray7);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21, fieldDataArray20);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 100, 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        java.lang.Class<?> wildcardClass25 = strList3.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(fieldDataArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(fieldDataArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0151");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate(0, (int) (byte) 0, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0152");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (short) 10, 0, filetypeEnum2);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0153");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (byte) 1, (int) (byte) 0, filetypeEnum2);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0154");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) 'a', (int) ' ', filetypeEnum2);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0155");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (short) -1, 10, filetypeEnum2);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0156");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8, fieldDataArray7);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21, fieldDataArray20);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 100, 10, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray34 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList35 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35, fieldDataArray34);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList30, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 100, (int) 'a', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35);
        java.lang.String[] strArray43 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        java.lang.String[] strArray50 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList51 = new java.util.ArrayList<java.lang.String>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList51, strArray50);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray55 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList56 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList56, fieldDataArray55);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList51, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList56);
        java.lang.String[] strArray63 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList64 = new java.util.ArrayList<java.lang.String>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList64, strArray63);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray68 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList69 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList69, fieldDataArray68);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList64, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList69);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList51, (int) (byte) 100, 10, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList69);
        java.lang.String[] strArray77 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList78 = new java.util.ArrayList<java.lang.String>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList78, strArray77);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray82 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList83 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList83, fieldDataArray82);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList78, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList83);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList51, (int) (byte) 100, (int) 'a', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList83);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray89 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList90 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList90, fieldDataArray89);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList51, (int) (byte) 1, (int) (byte) 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList90);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList44, (int) (short) 10, (int) (byte) 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList90);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (short) 100, (int) (short) 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList90);
        java.lang.Class<?> wildcardClass95 = fieldDataList90.getClass();
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
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(fieldDataArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(fieldDataArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(fieldDataArray82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(fieldDataArray89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(wildcardClass95);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0157");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) ' ', 10, filetypeEnum2);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0158");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 0, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0159");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((-1), (-1), fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0160");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8, fieldDataArray7);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21, fieldDataArray20);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray33 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList34 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList34, fieldDataArray33);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList29, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList34);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) (byte) 100, 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList34);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) '4', (int) '4', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList34);
        java.util.List<java.lang.String> strList41 = null;
        java.lang.String[] strArray46 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList47 = new java.util.ArrayList<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList47, strArray46);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray51 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList52 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList52, fieldDataArray51);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList47, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList52);
        java.lang.String[] strArray59 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList60 = new java.util.ArrayList<java.lang.String>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList60, strArray59);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray64 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList65 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList65, fieldDataArray64);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList60, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList65);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList47, (int) (byte) 100, 10, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList65);
        java.lang.String[] strArray73 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList74 = new java.util.ArrayList<java.lang.String>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList74, strArray73);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray78 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList79 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList79, fieldDataArray78);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList74, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList79);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList47, (int) (byte) 100, (int) 'a', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList79);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray85 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList86 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList86, fieldDataArray85);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList47, (int) (byte) 1, (int) (byte) 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList86);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList(strList41, (int) (byte) 100, 0, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList86);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, 100, (int) (byte) -1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList86);
        java.lang.Class<?> wildcardClass91 = fieldDataList86.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(fieldDataArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(fieldDataArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(fieldDataArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(fieldDataArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(fieldDataArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(fieldDataArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(fieldDataArray85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(wildcardClass91);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0161");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb(1, 1, filetypeEnum2);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0162");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate(0, (int) (byte) 1, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0163");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb(10, (int) ' ', filetypeEnum2);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0164");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) 'a', 1, filetypeEnum2);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0165");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (byte) 10, (int) (short) -1, filetypeEnum2);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0166");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8, fieldDataArray7);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21, fieldDataArray20);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) ' ', (int) 'a', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray34 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList35 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35, fieldDataArray34);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList30, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35);
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray47 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList48 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList48, fieldDataArray47);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList43, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList48);
        java.lang.String[] strArray55 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList56 = new java.util.ArrayList<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList56, strArray55);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray60 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList61 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList61, fieldDataArray60);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList56, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList61);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList43, (int) (byte) 100, 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList61);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList30, (int) '4', (int) '4', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList61);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, 1, 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList61);
        java.lang.String[] strArray71 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList72 = new java.util.ArrayList<java.lang.String>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList72, strArray71);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray76 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList77 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList77, fieldDataArray76);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList72, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList77);
        java.lang.String[] strArray84 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList85 = new java.util.ArrayList<java.lang.String>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList85, strArray84);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray89 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList90 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList90, fieldDataArray89);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList85, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList90);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList72, (int) (byte) 100, 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList90);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (short) 0, (int) (byte) 0, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList90);
        java.lang.Class<?> wildcardClass95 = strList3.getClass();
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
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(fieldDataArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(fieldDataArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(fieldDataArray76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNotNull(fieldDataArray89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(wildcardClass95);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0167");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) '#', 0, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0168");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (short) 10, (int) (short) 1, filetypeEnum2);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0169");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) 'a', (int) (short) 100, filetypeEnum2);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0170");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 100, (int) (short) -1, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0171");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8, fieldDataArray7);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21, fieldDataArray20);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 100, 10, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray34 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList35 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35, fieldDataArray34);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList30, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 100, (int) 'a', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35);
        java.lang.String[] strArray43 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        java.lang.String[] strArray50 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList51 = new java.util.ArrayList<java.lang.String>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList51, strArray50);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray55 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList56 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList56, fieldDataArray55);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList51, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList56);
        java.lang.String[] strArray63 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList64 = new java.util.ArrayList<java.lang.String>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList64, strArray63);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray68 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList69 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList69, fieldDataArray68);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList64, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList69);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList51, (int) (byte) 100, 10, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList69);
        java.lang.String[] strArray77 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList78 = new java.util.ArrayList<java.lang.String>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList78, strArray77);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray82 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList83 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList83, fieldDataArray82);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList78, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList83);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList51, (int) (byte) 100, (int) 'a', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList83);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray89 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList90 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList90, fieldDataArray89);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList51, (int) (byte) 1, (int) (byte) 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList90);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList44, (int) (short) 10, (int) (byte) 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList90);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (short) 100, (int) (short) 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList90);
        java.lang.Class<?> wildcardClass95 = strList3.getClass();
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
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(fieldDataArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(fieldDataArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(fieldDataArray82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(fieldDataArray89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(wildcardClass95);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0172");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (byte) 0, (int) (byte) 100, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0173");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb(10, (int) (byte) 10, filetypeEnum2);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0174");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (byte) 10, (int) ' ', filetypeEnum2);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0175");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) '4', 100, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0176");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (byte) 100, (int) (byte) 1, filetypeEnum2);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0177");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((-1), (int) (short) 0, filetypeEnum2);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0178");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate(1, 0, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0179");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) 'a', (int) (short) 1, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0180");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (short) 100, (int) ' ', filetypeEnum2);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0181");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (short) 10, (int) (byte) 0, filetypeEnum2);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0182");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) ' ', (int) '#', fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0183");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (byte) 0, 100, filetypeEnum2);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0184");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (byte) 1, (int) ' ', filetypeEnum2);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0185");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8, fieldDataArray7);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21, fieldDataArray20);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray33 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList34 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList34, fieldDataArray33);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList29, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList34);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) ' ', (int) 'a', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList34);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, 100, (int) '4', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList34);
        java.lang.String[] strArray43 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray48 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList49 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList49, fieldDataArray48);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList44, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList49);
        java.lang.String[] strArray56 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList57 = new java.util.ArrayList<java.lang.String>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList57, strArray56);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray61 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList62 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList62, fieldDataArray61);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList57, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList62);
        java.lang.String[] strArray69 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList70 = new java.util.ArrayList<java.lang.String>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList70, strArray69);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray74 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList75 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList75, fieldDataArray74);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList70, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList75);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList57, (int) ' ', (int) 'a', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList75);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList44, 100, (int) '4', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList75);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (short) 0, (int) '4', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList75);
        java.lang.Class<?> wildcardClass81 = strList3.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(fieldDataArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(fieldDataArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(fieldDataArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(fieldDataArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(fieldDataArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(fieldDataArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(wildcardClass81);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0186");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (short) 10, (int) (short) 0, filetypeEnum2);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0187");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8, fieldDataArray7);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21, fieldDataArray20);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 100, 10, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray34 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList35 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35, fieldDataArray34);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList30, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 100, (int) 'a', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35);
        java.lang.Class<?> wildcardClass39 = strList3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0188");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (byte) 1, (int) '#', filetypeEnum2);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0189");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (byte) 10, (int) (short) 10, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0190");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb(0, (int) ' ', filetypeEnum2);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0191");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (byte) -1, 0, filetypeEnum2);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0192");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (byte) -1, (int) (byte) 10, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0193");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8, fieldDataArray7);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21, fieldDataArray20);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 100, 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray34 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList35 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35, fieldDataArray34);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList30, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (int) ' ', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35);
        java.lang.String[] strArray43 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray48 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList49 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList49, fieldDataArray48);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList44, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList49);
        java.lang.String[] strArray56 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList57 = new java.util.ArrayList<java.lang.String>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList57, strArray56);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray61 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList62 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList62, fieldDataArray61);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList57, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList62);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList44, (int) (byte) 100, 10, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList62);
        java.lang.String[] strArray70 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList71 = new java.util.ArrayList<java.lang.String>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList71, strArray70);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray75 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList76 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList76, fieldDataArray75);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList71, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList76);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList44, (int) (byte) 100, (int) 'a', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList76);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) '#', (int) (short) 10, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList76);
        java.lang.Class<?> wildcardClass81 = strList3.getClass();
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
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(fieldDataArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(fieldDataArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(fieldDataArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(wildcardClass81);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0194");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate(100, 0, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0195");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb(100, (int) (short) -1, filetypeEnum2);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0196");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (byte) 0, (int) (byte) -1, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0197");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8, fieldDataArray7);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21, fieldDataArray20);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray33 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList34 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList34, fieldDataArray33);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList29, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList34);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) (byte) 100, 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList34);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) '4', (int) '4', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList34);
        java.lang.Class<?> wildcardClass39 = fieldDataList34.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(fieldDataArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(fieldDataArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(fieldDataArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0198");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (byte) 10, (int) (byte) 1, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0199");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb(1, (int) (byte) 100, filetypeEnum2);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0200");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (byte) 100, (int) (short) 1, filetypeEnum2);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0201");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (short) 0, (int) 'a', filetypeEnum2);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0202");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (byte) 1, (int) (short) 10, filetypeEnum2);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0203");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb(100, (int) (byte) 100, filetypeEnum2);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0204");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) 'a', (int) (byte) 100, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0205");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((-1), (int) '4', filetypeEnum2);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0206");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) '4', (int) (short) 0, filetypeEnum2);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0207");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8, fieldDataArray7);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21, fieldDataArray20);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray33 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList34 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList34, fieldDataArray33);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList29, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList34);
        java.lang.String[] strArray41 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList42 = new java.util.ArrayList<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList42, strArray41);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray46 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList47 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList47, fieldDataArray46);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList42, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList47);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList29, (int) ' ', (int) 'a', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList47);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, 100, (int) '4', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList47);
        java.lang.String[] strArray56 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList57 = new java.util.ArrayList<java.lang.String>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList57, strArray56);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray61 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList62 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList62, fieldDataArray61);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList57, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList62);
        java.lang.String[] strArray69 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList70 = new java.util.ArrayList<java.lang.String>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList70, strArray69);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray74 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList75 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList75, fieldDataArray74);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList70, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList75);
        java.lang.String[] strArray82 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList83 = new java.util.ArrayList<java.lang.String>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList83, strArray82);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray87 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList88 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList88, fieldDataArray87);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList83, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList88);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList70, (int) ' ', (int) 'a', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList88);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList57, 100, (int) '4', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList88);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) (short) 0, (int) '4', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList88);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) -1, 0, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList88);
        java.lang.Class<?> wildcardClass95 = fieldDataList88.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(fieldDataArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(fieldDataArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(fieldDataArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(fieldDataArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(fieldDataArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(fieldDataArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(fieldDataArray87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(wildcardClass95);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0208");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (short) 100, (int) '4', filetypeEnum2);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0209");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((-1), (int) 'a', filetypeEnum2);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0210");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (byte) 1, (int) 'a', filetypeEnum2);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0211");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (byte) 0, 1, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0212");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) ' ', (int) (short) 0, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0213");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (short) 1, (int) ' ', filetypeEnum2);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0214");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb(10, (int) (byte) 100, filetypeEnum2);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0215");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (short) 1, (int) (byte) 1, filetypeEnum2);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0216");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray14 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList15, fieldDataArray14);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList10, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList15);
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList28 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList28, fieldDataArray27);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList23, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList28);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList10, (int) (byte) 100, 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList28);
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList37 = new java.util.ArrayList<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList37, strArray36);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray41 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList42 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList42, fieldDataArray41);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList37, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList42);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList10, (int) (byte) -1, (int) ' ', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList42);
        java.lang.String[] strArray50 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList51 = new java.util.ArrayList<java.lang.String>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList51, strArray50);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray55 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList56 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList56, fieldDataArray55);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList51, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList56);
        java.lang.String[] strArray63 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList64 = new java.util.ArrayList<java.lang.String>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList64, strArray63);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray68 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList69 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList69, fieldDataArray68);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList64, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList69);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList51, (int) (byte) 100, 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList69);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList10, (int) (byte) 100, 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList69);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (int) (byte) 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList69);
        java.util.List<java.lang.String> strList77 = null;
        java.lang.String[] strArray82 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList83 = new java.util.ArrayList<java.lang.String>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList83, strArray82);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray87 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList88 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList88, fieldDataArray87);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList83, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList88);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList(strList77, 1, 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList88);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, 100, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList88);
        java.lang.Class<?> wildcardClass93 = strList3.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(fieldDataArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(fieldDataArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(fieldDataArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(fieldDataArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(fieldDataArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(fieldDataArray87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(wildcardClass93);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0217");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (byte) -1, 1, filetypeEnum2);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0218");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (byte) -1, (int) (byte) 100, filetypeEnum2);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0219");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (short) 1, (int) (short) -1, filetypeEnum2);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0220");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (short) 1, (int) (byte) -1, filetypeEnum2);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0221");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray13 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList14, fieldDataArray13);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList9, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList14);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray26 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList27, fieldDataArray26);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList22, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList27);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList9, (int) (byte) 100, 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList27);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList2, (int) '#', (int) (short) 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList27);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray34 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList35 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35, fieldDataArray34);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList2, (int) (byte) -1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList40 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList2, (int) '4', 1, fieldDataList40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(fieldDataArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0222");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate(100, 1, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0223");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (short) -1, 0, filetypeEnum2);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0224");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (short) 1, (int) (short) 10, filetypeEnum2);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0225");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate(100, (int) 'a', fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0226");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 1, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0227");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8, fieldDataArray7);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21, fieldDataArray20);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray33 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList34 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList34, fieldDataArray33);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList29, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList34);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) ' ', (int) 'a', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList34);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, 100, (int) '4', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList34);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray41 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList42 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList42, fieldDataArray41);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) 'a', (int) ' ', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList42);
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList50 = new java.util.ArrayList<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList50, strArray49);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray54 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList55 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList55, fieldDataArray54);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList50, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList55);
        java.lang.String[] strArray62 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList63 = new java.util.ArrayList<java.lang.String>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList63, strArray62);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray67 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList68 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList68, fieldDataArray67);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList63, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList68);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList50, (int) (byte) 100, 10, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList68);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) ' ', (int) (short) 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList68);
        java.lang.Class<?> wildcardClass73 = strList3.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(fieldDataArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(fieldDataArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(fieldDataArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(fieldDataArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(fieldDataArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(fieldDataArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0228");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) -1, (int) (short) 10, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0229");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate(100, (int) '4', fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0230");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) 'a', 0, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0231");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb(100, (int) (short) 1, filetypeEnum2);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0232");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8, fieldDataArray7);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21, fieldDataArray20);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray33 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList34 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList34, fieldDataArray33);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList29, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList34);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) ' ', (int) 'a', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList34);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, 100, (int) '4', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList34);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray41 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList42 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList42, fieldDataArray41);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) 'a', (int) ' ', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList42);
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList50 = new java.util.ArrayList<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList50, strArray49);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray54 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList55 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList55, fieldDataArray54);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList50, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList55);
        java.lang.String[] strArray62 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList63 = new java.util.ArrayList<java.lang.String>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList63, strArray62);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray67 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList68 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList68, fieldDataArray67);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList63, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList68);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList50, (int) ' ', (int) 'a', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList68);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, 100, 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList68);
        java.lang.Class<?> wildcardClass73 = strList3.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(fieldDataArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(fieldDataArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(fieldDataArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(fieldDataArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(fieldDataArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(fieldDataArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0233");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray13 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList14, fieldDataArray13);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList9, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList14);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray26 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList27, fieldDataArray26);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList22, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList27);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList9, (int) (byte) 100, 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList27);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList2, (int) '#', (int) (short) 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList27);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray34 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList35 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35, fieldDataArray34);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList2, (int) (byte) -1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35);
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray47 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList48 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList48, fieldDataArray47);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList43, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList48);
        java.lang.String[] strArray55 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList56 = new java.util.ArrayList<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList56, strArray55);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray60 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList61 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList61, fieldDataArray60);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList56, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList61);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList43, (int) (byte) 100, 10, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList61);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList2, (-1), (int) (byte) -1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList61);
        java.lang.Class<?> wildcardClass66 = fieldDataList61.getClass();
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
        org.junit.Assert.assertNotNull(fieldDataArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(fieldDataArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(fieldDataArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(wildcardClass66);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0234");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (short) 1, (int) '4', filetypeEnum2);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0235");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) ' ', (int) (byte) 10, filetypeEnum2);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0236");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8, fieldDataArray7);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21, fieldDataArray20);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray33 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList34 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList34, fieldDataArray33);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList29, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList34);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) (byte) 100, 10, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList34);
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray47 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList48 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList48, fieldDataArray47);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList43, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList48);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) (byte) 100, (int) 'a', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList48);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray54 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList55 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList55, fieldDataArray54);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) (byte) 1, (int) (byte) 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList55);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (short) 10, 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList55);
        java.lang.String[] strArray63 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList64 = new java.util.ArrayList<java.lang.String>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList64, strArray63);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray68 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList69 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList69, fieldDataArray68);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList64, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList69);
        java.lang.String[] strArray76 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList77 = new java.util.ArrayList<java.lang.String>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList77, strArray76);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray81 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList82 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList82, fieldDataArray81);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList77, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList82);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList64, (int) ' ', (int) 'a', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList82);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, 0, (int) (short) -1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList82);
        java.lang.Class<?> wildcardClass87 = fieldDataList82.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(fieldDataArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(fieldDataArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(fieldDataArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(fieldDataArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(fieldDataArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(fieldDataArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(fieldDataArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(wildcardClass87);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0237");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) '4', 100, filetypeEnum2);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0238");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (-1), 0, fieldDataList7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0239");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (short) 0, (int) (short) 10, filetypeEnum2);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0240");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((-1), (-1), filetypeEnum2);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0241");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) -1, (int) (byte) 1, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0242");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8, fieldDataArray7);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21, fieldDataArray20);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray33 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList34 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList34, fieldDataArray33);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList29, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList34);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) ' ', (int) 'a', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList34);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, 100, (int) '4', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList34);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray41 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList42 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList42, fieldDataArray41);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) 'a', (int) ' ', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList42);
        java.lang.Class<?> wildcardClass45 = fieldDataList42.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(fieldDataArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(fieldDataArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(fieldDataArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(fieldDataArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0243");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) '4', 0, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0244");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb(0, (int) (byte) -1, filetypeEnum2);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0245");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8, fieldDataArray7);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21, fieldDataArray20);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray33 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList34 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList34, fieldDataArray33);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList29, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList34);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) (byte) 100, 10, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList34);
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray47 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList48 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList48, fieldDataArray47);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList43, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList48);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) (byte) 100, (int) 'a', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList48);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray54 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList55 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList55, fieldDataArray54);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) (byte) 1, (int) (byte) 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList55);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (short) 10, 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList55);
        java.lang.String[] strArray63 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList64 = new java.util.ArrayList<java.lang.String>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList64, strArray63);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray68 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList69 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList69, fieldDataArray68);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList64, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList69);
        java.lang.String[] strArray76 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList77 = new java.util.ArrayList<java.lang.String>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList77, strArray76);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray81 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList82 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList82, fieldDataArray81);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList77, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList82);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList64, (int) ' ', (int) 'a', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList82);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, 0, (int) (short) -1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList82);
        java.lang.Class<?> wildcardClass87 = strList3.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(fieldDataArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(fieldDataArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(fieldDataArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(fieldDataArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(fieldDataArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(fieldDataArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(fieldDataArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(wildcardClass87);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0246");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) '#', (int) 'a', fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0247");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray13 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList14, fieldDataArray13);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList9, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList14);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray26 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList27, fieldDataArray26);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList22, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList27);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList9, (int) (byte) 100, 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList27);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList2, (int) '#', (int) (short) 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList27);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray34 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList35 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35, fieldDataArray34);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList2, (int) (byte) -1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35);
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray47 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList48 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList48, fieldDataArray47);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList43, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList48);
        java.lang.String[] strArray55 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList56 = new java.util.ArrayList<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList56, strArray55);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray60 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList61 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList61, fieldDataArray60);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList56, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList61);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList43, (int) (byte) 100, 10, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList61);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList2, (-1), (int) (byte) -1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList61);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList68 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList2, (int) (short) 10, 0, fieldDataList68);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(fieldDataArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(fieldDataArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(fieldDataArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0248");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((-1), (int) (short) 10, filetypeEnum2);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0249");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8, fieldDataArray7);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21, fieldDataArray20);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 100, 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray34 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList35 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35, fieldDataArray34);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList30, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (int) ' ', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35);
        java.lang.String[] strArray43 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray48 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList49 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList49, fieldDataArray48);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList44, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList49);
        java.lang.String[] strArray56 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList57 = new java.util.ArrayList<java.lang.String>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList57, strArray56);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray61 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList62 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList62, fieldDataArray61);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList57, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList62);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList44, (int) (byte) 100, 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList62);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 100, 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList62);
        java.lang.Class<?> wildcardClass67 = strList3.getClass();
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
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(fieldDataArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(fieldDataArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0250");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (byte) -1, (int) (short) 1, filetypeEnum2);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0251");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8, fieldDataArray7);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21, fieldDataArray20);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 100, 10, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray34 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList35 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35, fieldDataArray34);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList30, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 100, (int) 'a', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35);
        java.lang.String[] strArray43 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray48 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList49 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList49, fieldDataArray48);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList44, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList49);
        java.lang.String[] strArray56 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList57 = new java.util.ArrayList<java.lang.String>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList57, strArray56);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray61 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList62 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList62, fieldDataArray61);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList57, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList62);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList44, (int) (byte) 100, 10, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList62);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) '#', (int) (byte) 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList62);
        java.lang.Class<?> wildcardClass67 = fieldDataList62.getClass();
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
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(fieldDataArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(fieldDataArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0252");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (byte) -1, (int) (byte) 0, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0253");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) '4', (int) (byte) 0, filetypeEnum2);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0254");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((-1), (int) (short) -1, filetypeEnum2);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0255");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8, fieldDataArray7);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21, fieldDataArray20);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray33 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList34 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList34, fieldDataArray33);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList29, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList34);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) ' ', (int) 'a', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList34);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, 100, (int) '4', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList34);
        java.lang.String[] strArray43 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray48 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList49 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList49, fieldDataArray48);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList44, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList49);
        java.lang.String[] strArray56 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList57 = new java.util.ArrayList<java.lang.String>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList57, strArray56);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray61 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList62 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList62, fieldDataArray61);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList57, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList62);
        java.lang.String[] strArray69 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList70 = new java.util.ArrayList<java.lang.String>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList70, strArray69);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray74 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList75 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList75, fieldDataArray74);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList70, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList75);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList57, (int) ' ', (int) 'a', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList75);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList44, 100, (int) '4', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList75);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (short) 0, (int) '4', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList75);
        java.lang.Class<?> wildcardClass81 = fieldDataList75.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(fieldDataArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(fieldDataArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(fieldDataArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(fieldDataArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(fieldDataArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(fieldDataArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(wildcardClass81);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0256");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 0, (int) (byte) 0, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0257");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (byte) 1, (int) (short) 100, filetypeEnum2);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0258");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate(1, (int) '4', fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0259");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) ' ', 0, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0260");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (short) 100, (int) (byte) 1, filetypeEnum2);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0261");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate(0, (int) (short) 100, fieldData2);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0262");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) '4', (int) 'a', fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0263");
        java.util.List<java.lang.String> strList0 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray16 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList17, fieldDataArray16);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList12, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList17);
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList25 = new java.util.ArrayList<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList25, strArray24);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray29 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList30 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList30, fieldDataArray29);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList25, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList30);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList12, (int) (byte) 100, 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList30);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList5, (int) '#', (int) (short) 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList30);
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray44 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList45 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList45, fieldDataArray44);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList40, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList45);
        java.lang.String[] strArray52 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList53 = new java.util.ArrayList<java.lang.String>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList53, strArray52);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray57 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList58 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList58, fieldDataArray57);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList53, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList58);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList40, (int) (byte) 100, 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList58);
        java.lang.String[] strArray65 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList66 = new java.util.ArrayList<java.lang.String>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList66, strArray65);
        java.lang.String[] strArray72 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList73 = new java.util.ArrayList<java.lang.String>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList73, strArray72);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray77 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList78 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList78, fieldDataArray77);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList73, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList78);
        java.lang.String[] strArray85 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList86 = new java.util.ArrayList<java.lang.String>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList86, strArray85);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray90 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList91 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean92 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList91, fieldDataArray90);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList86, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList91);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList73, (int) (byte) 100, 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList91);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList66, (int) '#', (int) (short) 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList91);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList40, (int) (byte) 1, (int) (byte) 10, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList91);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList5, 0, (int) (short) 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList91);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList(strList0, (int) (short) -1, 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList91);
        java.lang.Class<?> wildcardClass99 = fieldDataList91.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(fieldDataArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(fieldDataArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(fieldDataArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(fieldDataArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(fieldDataArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(strArray85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNotNull(fieldDataArray90);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0264");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (short) 100, (int) '#', filetypeEnum2);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0265");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate(0, (int) (short) 0, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0266");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (short) 10, (int) (byte) 1, filetypeEnum2);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0267");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate(100, (int) (short) 1, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0268");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 100, (int) (short) 100, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0269");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) ' ', (int) (short) 0, filetypeEnum2);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0270");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (short) 100, 0, filetypeEnum2);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0271");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (short) 10, (int) (byte) 10, filetypeEnum2);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0272");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) '4', (-1), filetypeEnum2);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0273");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate(1, (int) (byte) 10, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0274");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (byte) 1, 0, filetypeEnum2);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0275");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray13 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList14, fieldDataArray13);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList9, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList14);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray26 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList27, fieldDataArray26);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList22, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList27);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList9, (int) (byte) 100, 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList27);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList2, (int) '#', (int) (short) 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList27);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray34 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList35 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35, fieldDataArray34);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList2, (int) (byte) -1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35);
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray47 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList48 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList48, fieldDataArray47);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList43, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList48);
        java.lang.String[] strArray55 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList56 = new java.util.ArrayList<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList56, strArray55);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray60 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList61 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList61, fieldDataArray60);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList56, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList61);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList43, (int) (byte) 100, 10, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList61);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList2, (-1), (int) (byte) -1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList61);
        java.lang.Class<?> wildcardClass66 = strList2.getClass();
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
        org.junit.Assert.assertNotNull(fieldDataArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(fieldDataArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(fieldDataArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(wildcardClass66);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0276");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate(1, (int) (short) 0, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0277");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb(10, (int) (short) 100, filetypeEnum2);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0278");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (byte) -1, (int) (short) 0, filetypeEnum2);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0279");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (byte) 0, (int) (byte) 1, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0280");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (short) 0, 1, filetypeEnum2);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0281");
        java.util.List<java.lang.String> strList0 = null;
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList(strList0, 100, 0, fieldDataList3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0282");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray13 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList14, fieldDataArray13);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList9, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList14);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray26 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList27, fieldDataArray26);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList22, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList27);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList9, (int) (byte) 100, 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList27);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList2, (int) '#', (int) (short) 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList27);
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList37 = new java.util.ArrayList<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList37, strArray36);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray41 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList42 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList42, fieldDataArray41);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList37, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList42);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList2, (int) (short) 0, (-1), (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList42);
        java.lang.Class<?> wildcardClass46 = fieldDataList42.getClass();
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
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(fieldDataArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0283");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) ' ', (int) (short) 10, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0284");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (short) 1, (int) (byte) 100, filetypeEnum2);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0285");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (short) -1, (int) (byte) 100, filetypeEnum2);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0286");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (byte) 1, (int) (byte) -1, filetypeEnum2);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0287");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb(10, 100, filetypeEnum2);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0288");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) '4', 10, filetypeEnum2);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0289");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb(0, (int) '4', filetypeEnum2);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0290");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, 10, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0291");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb(10, (int) (short) 1, filetypeEnum2);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0292");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21, fieldDataArray20);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray33 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList34 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList34, fieldDataArray33);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList29, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList34);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) (byte) 100, 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList34);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList9, (int) '#', (int) (short) 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList34);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray41 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList42 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList42, fieldDataArray41);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList9, (int) (byte) -1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList42);
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList50 = new java.util.ArrayList<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList50, strArray49);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray54 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList55 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList55, fieldDataArray54);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList50, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList55);
        java.lang.String[] strArray62 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList63 = new java.util.ArrayList<java.lang.String>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList63, strArray62);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray67 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList68 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList68, fieldDataArray67);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList63, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList68);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList50, (int) (byte) 100, 10, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList68);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList9, (-1), (int) (byte) -1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList68);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) '#', (int) ' ', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList68);
        java.lang.Class<?> wildcardClass74 = fieldDataList68.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(fieldDataArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(fieldDataArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(fieldDataArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(fieldDataArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(fieldDataArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(wildcardClass74);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0293");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb(0, (int) 'a', filetypeEnum2);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0294");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8, fieldDataArray7);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21, fieldDataArray20);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 100, 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray34 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList35 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35, fieldDataArray34);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList30, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (int) ' ', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35);
        java.lang.String[] strArray43 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray48 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList49 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList49, fieldDataArray48);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList44, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList49);
        java.lang.String[] strArray56 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList57 = new java.util.ArrayList<java.lang.String>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList57, strArray56);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray61 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList62 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList62, fieldDataArray61);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList57, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList62);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList44, (int) (byte) 100, 10, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList62);
        java.lang.String[] strArray70 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList71 = new java.util.ArrayList<java.lang.String>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList71, strArray70);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray75 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList76 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList76, fieldDataArray75);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList71, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList76);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList44, (int) (byte) 100, (int) 'a', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList76);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) '#', (int) (short) 10, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList76);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList83 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (short) 0, 0, fieldDataList83);
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
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(fieldDataArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(fieldDataArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(fieldDataArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0295");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (byte) 100, (int) '4', filetypeEnum2);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0296");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (byte) 0, (int) (byte) 0, filetypeEnum2);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0297");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (short) 1, (int) (short) 0, filetypeEnum2);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0298");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8, fieldDataArray7);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21, fieldDataArray20);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) ' ', (int) 'a', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray34 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList35 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35, fieldDataArray34);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList30, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35);
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray47 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList48 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList48, fieldDataArray47);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList43, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList48);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList30, (int) ' ', (int) 'a', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList48);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 0, 0, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList48);
        java.lang.Class<?> wildcardClass53 = strList3.getClass();
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
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(fieldDataArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0299");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (byte) 10, (int) (short) 0, fieldData2);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0300");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (byte) 100, (int) (short) 1, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0301");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray14 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList15, fieldDataArray14);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList10, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList15);
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList28 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList28, fieldDataArray27);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList23, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList28);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList10, (int) (byte) 100, 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList28);
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList37 = new java.util.ArrayList<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList37, strArray36);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray41 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList42 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList42, fieldDataArray41);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList37, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList42);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList10, (int) (byte) -1, (int) ' ', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList42);
        java.lang.String[] strArray50 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList51 = new java.util.ArrayList<java.lang.String>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList51, strArray50);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray55 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList56 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList56, fieldDataArray55);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList51, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList56);
        java.lang.String[] strArray63 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList64 = new java.util.ArrayList<java.lang.String>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList64, strArray63);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray68 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList69 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList69, fieldDataArray68);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList64, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList69);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList51, (int) (byte) 100, 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList69);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList10, (int) (byte) 100, 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList69);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (int) (byte) 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList69);
        java.lang.Class<?> wildcardClass75 = fieldDataList69.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(fieldDataArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(fieldDataArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(fieldDataArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(fieldDataArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(fieldDataArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(wildcardClass75);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0302");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (byte) 10, 1, filetypeEnum2);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0303");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, (int) (byte) 10, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0304");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8, fieldDataArray7);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21, fieldDataArray20);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray33 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList34 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList34, fieldDataArray33);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList29, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList34);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) ' ', (int) 'a', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList34);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, 100, (int) '4', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList34);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray41 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList42 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList42, fieldDataArray41);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) 'a', (int) ' ', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList42);
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList50 = new java.util.ArrayList<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList50, strArray49);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray54 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList55 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList55, fieldDataArray54);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList50, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList55);
        java.lang.String[] strArray62 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList63 = new java.util.ArrayList<java.lang.String>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList63, strArray62);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray67 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList68 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList68, fieldDataArray67);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList63, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList68);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList50, (int) (byte) 100, 10, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList68);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) ' ', (int) (short) 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList68);
        java.lang.Class<?> wildcardClass73 = fieldDataList68.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(fieldDataArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(fieldDataArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(fieldDataArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(fieldDataArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(fieldDataArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(fieldDataArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0305");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb(1, 100, filetypeEnum2);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0306");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) ' ', (int) (short) 1, filetypeEnum2);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0307");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) '4', (int) '#', fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0308");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21, fieldDataArray20);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray33 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList34 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList34, fieldDataArray33);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList29, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList34);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) (byte) 100, 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList34);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList9, (int) '#', (int) (short) 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList34);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray41 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList42 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList42, fieldDataArray41);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList9, (int) (byte) -1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList42);
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList50 = new java.util.ArrayList<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList50, strArray49);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray54 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList55 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList55, fieldDataArray54);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList50, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList55);
        java.lang.String[] strArray62 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList63 = new java.util.ArrayList<java.lang.String>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList63, strArray62);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray67 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList68 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList68, fieldDataArray67);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList63, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList68);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList50, (int) (byte) 100, 10, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList68);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList9, (-1), (int) (byte) -1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList68);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) '#', (int) ' ', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList68);
        java.lang.Class<?> wildcardClass74 = strList3.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(fieldDataArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(fieldDataArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(fieldDataArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(fieldDataArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(fieldDataArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(wildcardClass74);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0309");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) '#', (int) (short) 100, filetypeEnum2);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0310");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (byte) 0, (int) (byte) -1, filetypeEnum2);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0311");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate(10, (int) (short) 100, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0312");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (short) 1, (int) '#', filetypeEnum2);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0313");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate(10, 100, fieldData2);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0314");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 10, (int) 'a', fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0315");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (short) 10, (int) (short) 100, filetypeEnum2);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0316");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb(0, 100, filetypeEnum2);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0317");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 10, 0, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0318");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (byte) 1, (int) (short) 10, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0319");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) '4', (int) (short) -1, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0320");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (byte) 100, 10, filetypeEnum2);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0321");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (byte) -1, (int) '#', filetypeEnum2);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0322");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 0, 0, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0323");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (byte) 10, (int) (byte) 100, filetypeEnum2);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0324");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb(1, (int) (short) 1, filetypeEnum2);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0325");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8, fieldDataArray7);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21, fieldDataArray20);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 100, 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray34 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList35 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35, fieldDataArray34);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList30, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35);
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray47 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList48 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList48, fieldDataArray47);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList43, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList48);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList30, (int) (byte) 100, 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList48);
        java.lang.String[] strArray56 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList57 = new java.util.ArrayList<java.lang.String>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList57, strArray56);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray61 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList62 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList62, fieldDataArray61);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList57, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList62);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList30, (int) (byte) -1, (int) ' ', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList62);
        java.lang.String[] strArray70 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList71 = new java.util.ArrayList<java.lang.String>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList71, strArray70);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray75 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList76 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList76, fieldDataArray75);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList71, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList76);
        java.lang.String[] strArray83 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList84 = new java.util.ArrayList<java.lang.String>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList84, strArray83);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray88 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList89 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList89, fieldDataArray88);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList84, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList89);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList71, (int) (byte) 100, 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList89);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList30, (int) (byte) 100, 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList89);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (short) 1, (int) (short) 0, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList89);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList97 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (-1), (int) (short) -1, fieldDataList97);
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
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(fieldDataArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(fieldDataArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(fieldDataArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(fieldDataArray88);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0326");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (byte) 1, (int) 'a', fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0327");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (byte) 10, 0, filetypeEnum2);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0328");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) '#', (int) (short) -1, filetypeEnum2);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0329");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb(0, 10, filetypeEnum2);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0330");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (byte) -1, 1, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0331");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (byte) 10, 10, filetypeEnum2);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0332");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (byte) 100, 100, filetypeEnum2);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0333");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) '#', 10, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0334");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (byte) 10, (int) (byte) -1, filetypeEnum2);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0335");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8, fieldDataArray7);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21, fieldDataArray20);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray33 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList34 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList34, fieldDataArray33);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList29, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList34);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) ' ', (int) 'a', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList34);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, 100, (int) '4', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList34);
        java.lang.Class<?> wildcardClass39 = fieldDataList34.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(fieldDataArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(fieldDataArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(fieldDataArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0336");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) ' ', 10, fieldData2);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0337");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) ' ', (int) (short) 100, filetypeEnum2);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0338");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (short) 100, (int) 'a', filetypeEnum2);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0339");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (short) 0, (int) '#', filetypeEnum2);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0340");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb(100, (int) (short) 0, filetypeEnum2);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0341");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((-1), 100, filetypeEnum2);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0342");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8, fieldDataArray7);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21, fieldDataArray20);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 100, 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray34 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList35 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35, fieldDataArray34);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList30, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35);
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray47 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList48 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList48, fieldDataArray47);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList43, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList48);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList30, (int) (byte) 100, 10, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList48);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 100, (int) (byte) 0, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList48);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList55 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) (byte) 1, fieldDataList55);
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
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(fieldDataArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0343");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8, fieldDataArray7);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21, fieldDataArray20);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) ' ', (int) 'a', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray34 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList35 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35, fieldDataArray34);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList30, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35);
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray47 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList48 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList48, fieldDataArray47);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList43, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList48);
        java.lang.String[] strArray55 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList56 = new java.util.ArrayList<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList56, strArray55);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray60 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList61 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList61, fieldDataArray60);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList56, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList61);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList43, (int) (byte) 100, 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList61);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList30, (int) '4', (int) '4', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList61);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, 1, 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList61);
        java.lang.Class<?> wildcardClass67 = strList3.getClass();
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
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(fieldDataArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(fieldDataArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0344");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb(100, (int) (byte) 1, filetypeEnum2);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0345");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray13 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList14, fieldDataArray13);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList9, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList14);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray26 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList27, fieldDataArray26);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList22, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList27);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList9, (int) (byte) 100, 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList27);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList2, (int) '#', (int) (short) 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList27);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray34 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList35 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35, fieldDataArray34);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList2, (int) (byte) -1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35);
        java.lang.Class<?> wildcardClass38 = strList2.getClass();
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
        org.junit.Assert.assertNotNull(fieldDataArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0346");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (byte) 100, 1, filetypeEnum2);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0347");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb(1, (int) (byte) 10, filetypeEnum2);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0348");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate(1, 10, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0349");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (byte) 10, (int) 'a', fieldData2);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0350");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate(0, 0, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0351");
        java.util.List<java.lang.String> strList0 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray10 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList11, fieldDataArray10);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList6, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList11);
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray23 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList24, fieldDataArray23);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList19, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList24);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList6, (int) (byte) 100, 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList24);
        java.lang.String[] strArray32 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray37 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList38 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList38, fieldDataArray37);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList33, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList38);
        java.lang.String[] strArray45 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList46 = new java.util.ArrayList<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList46, strArray45);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray50 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList51 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList51, fieldDataArray50);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList46, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList51);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList33, (int) (byte) 100, 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList51);
        java.lang.String[] strArray59 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList60 = new java.util.ArrayList<java.lang.String>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList60, strArray59);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray64 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList65 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList65, fieldDataArray64);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList60, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList65);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList33, (int) (byte) -1, (int) ' ', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList65);
        java.lang.String[] strArray73 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList74 = new java.util.ArrayList<java.lang.String>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList74, strArray73);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray78 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList79 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList79, fieldDataArray78);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList74, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList79);
        java.lang.String[] strArray86 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList87 = new java.util.ArrayList<java.lang.String>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList87, strArray86);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray91 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList92 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean93 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList92, fieldDataArray91);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList87, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList92);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList74, (int) (byte) 100, 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList92);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList33, (int) (byte) 100, 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList92);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList6, (int) (short) 1, (int) (short) 0, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList92);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList(strList0, (int) '4', (int) (short) 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList92);
        java.lang.Class<?> wildcardClass99 = fieldDataList92.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(fieldDataArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(fieldDataArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(fieldDataArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(fieldDataArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(fieldDataArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(fieldDataArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(strArray86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertNotNull(fieldDataArray91);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0352");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (byte) 100, 10, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0353");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) '#', (int) (byte) -1, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0354");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb(1, (int) 'a', filetypeEnum2);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0355");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 10, 10, fieldData2);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0356");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (byte) -1, 100, filetypeEnum2);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0357");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (byte) 1, (int) '4', fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0358");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 100, (int) 'a', fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0359");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) '4', (int) '4', filetypeEnum2);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0360");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (byte) 10, (int) '#', fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0361");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate(0, (int) (byte) -1, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0362");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8, fieldDataArray7);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21, fieldDataArray20);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 100, 10, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        java.lang.String[] strArray28 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray40 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList41 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList41, fieldDataArray40);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList36, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList41);
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList49 = new java.util.ArrayList<java.lang.String>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList49, strArray48);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray53 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList54 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList54, fieldDataArray53);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList49, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList54);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList36, (int) (byte) 100, 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList54);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList29, (int) '#', (int) (short) 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList54);
        java.lang.String[] strArray63 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList64 = new java.util.ArrayList<java.lang.String>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList64, strArray63);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray68 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList69 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList69, fieldDataArray68);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList64, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList69);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList29, (int) (short) 0, (-1), (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList69);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, 0, (int) (byte) 10, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList69);
        java.lang.Class<?> wildcardClass74 = strList3.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(fieldDataArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(fieldDataArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(fieldDataArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(fieldDataArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(fieldDataArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(wildcardClass74);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0363");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) '#', (int) (byte) 0, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0364");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (byte) 100, (int) (byte) 0, filetypeEnum2);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0365");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) 'a', (int) (byte) -1, filetypeEnum2);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0366");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate(0, 100, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0367");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) '#', (int) '4', filetypeEnum2);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0368");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (short) 0, (int) (byte) 1, filetypeEnum2);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0369");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (short) 0, (int) (byte) 100, filetypeEnum2);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0370");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (byte) 1, (int) (byte) 10, filetypeEnum2);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0371");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate(0, (-1), fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0372");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate(10, 1, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0373");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8, fieldDataArray7);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21, fieldDataArray20);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 100, 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList28 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList28, fieldDataArray27);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (short) 100, (int) (byte) -1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList28);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList33 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (short) 10, (-1), fieldDataList33);
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
        org.junit.Assert.assertNotNull(fieldDataArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0374");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (short) 10, 100, filetypeEnum2);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0375");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8, fieldDataArray7);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21, fieldDataArray20);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) ' ', (int) 'a', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray34 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList35 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35, fieldDataArray34);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList30, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35);
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray47 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList48 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList48, fieldDataArray47);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList43, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList48);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList30, (int) (byte) 100, 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList48);
        java.lang.String[] strArray56 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList57 = new java.util.ArrayList<java.lang.String>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList57, strArray56);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray61 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList62 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList62, fieldDataArray61);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList57, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList62);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList30, (int) (byte) -1, (int) ' ', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList62);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 0, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList62);
        java.lang.Class<?> wildcardClass67 = fieldDataList62.getClass();
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
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(fieldDataArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(fieldDataArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0376");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) -1, 0, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0377");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (byte) 100, (int) (byte) 1, fieldData2);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0378");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((-1), 10, filetypeEnum2);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0379");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) ' ', (int) (short) 10, filetypeEnum2);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0380");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray13 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList14, fieldDataArray13);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList9, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList14);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray26 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList27, fieldDataArray26);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList22, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList27);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList9, (int) (byte) 100, 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList27);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList2, (int) '#', (int) (short) 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList27);
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList37 = new java.util.ArrayList<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList37, strArray36);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray41 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList42 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList42, fieldDataArray41);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList37, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList42);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList2, (int) (short) 0, (-1), (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList42);
        java.lang.Class<?> wildcardClass46 = strList2.getClass();
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
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(fieldDataArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0381");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8, fieldDataArray7);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21, fieldDataArray20);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 100, 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray34 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList35 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35, fieldDataArray34);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList30, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (int) ' ', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35);
        java.lang.String[] strArray43 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray48 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList49 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList49, fieldDataArray48);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList44, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList49);
        java.lang.String[] strArray56 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList57 = new java.util.ArrayList<java.lang.String>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList57, strArray56);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray61 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList62 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList62, fieldDataArray61);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList57, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList62);
        java.lang.String[] strArray69 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList70 = new java.util.ArrayList<java.lang.String>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList70, strArray69);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray74 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList75 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList75, fieldDataArray74);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList70, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList75);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList57, (int) ' ', (int) 'a', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList75);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList44, 100, (int) '4', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList75);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (int) (byte) -1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList75);
        java.lang.Class<?> wildcardClass81 = fieldDataList75.getClass();
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
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(fieldDataArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(fieldDataArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(fieldDataArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(wildcardClass81);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0382");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, (int) (short) 10, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0383");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (short) 0, 10, filetypeEnum2);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0384");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (short) 100, (int) (byte) 10, filetypeEnum2);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0385");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (short) -1, (int) 'a', filetypeEnum2);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0386");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (byte) -1, 10, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0387");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate(0, (int) '#', fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0388");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) '#', 1, filetypeEnum2);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0389");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (byte) -1, 10, filetypeEnum2);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0390");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) ' ', (int) '4', fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0391");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate(1, (int) (byte) 1, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0392");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate(0, (int) (byte) 10, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0393");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) '#', (int) '4', fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0394");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (byte) 100, (int) (short) 10, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0395");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (short) 0, (int) (byte) -1, filetypeEnum2);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0396");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) '#', (int) (short) 10, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0397");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8, fieldDataArray7);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21, fieldDataArray20);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 100, 10, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray34 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList35 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35, fieldDataArray34);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList30, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 100, (int) 'a', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35);
        java.lang.String[] strArray43 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray48 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList49 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList49, fieldDataArray48);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList44, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList49);
        java.lang.String[] strArray56 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList57 = new java.util.ArrayList<java.lang.String>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList57, strArray56);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray61 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList62 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList62, fieldDataArray61);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList57, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList62);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList44, (int) (byte) 100, 10, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList62);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) ' ', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList62);
        java.lang.Class<?> wildcardClass67 = fieldDataList62.getClass();
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
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(fieldDataArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(fieldDataArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0398");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8, fieldDataArray7);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21, fieldDataArray20);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 100, 10, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray34 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList35 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35, fieldDataArray34);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList30, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 100, (int) 'a', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray41 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList42 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList42, fieldDataArray41);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) (byte) 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList42);
        java.lang.Class<?> wildcardClass45 = strList3.getClass();
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
        org.junit.Assert.assertNotNull(fieldDataArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0399");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (byte) -1, (int) '4', fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0400");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb(0, (int) (byte) 1, filetypeEnum2);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0401");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (byte) 100, (int) (byte) 100, filetypeEnum2);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0402");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, (int) (short) -1, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0403");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) ' ', (int) ' ', filetypeEnum2);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0404");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8, fieldDataArray7);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21, fieldDataArray20);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray33 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList34 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList34, fieldDataArray33);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList29, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList34);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) ' ', (int) 'a', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList34);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, 100, (int) '4', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList34);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray41 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList42 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList42, fieldDataArray41);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) 'a', (int) ' ', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList42);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList47 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, 100, (int) (byte) 100, fieldDataList47);
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
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(fieldDataArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(fieldDataArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0405");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (byte) 10, (int) (short) 100, filetypeEnum2);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0406");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate(10, 10, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0407");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate(0, (int) ' ', fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0408");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((-1), (int) (short) -1, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0409");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) -1, (int) '4', fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0410");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate(0, 1, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0411");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (byte) -1, (int) (short) 1, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0412");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate(1, (int) (byte) 0, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0413");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb(0, (int) (short) 1, filetypeEnum2);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0414");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray13 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList14, fieldDataArray13);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList9, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList14);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray26 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList27, fieldDataArray26);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList22, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList27);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList9, (int) (byte) 100, 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList27);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList2, (int) '#', (int) (short) 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList27);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray34 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList35 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35, fieldDataArray34);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList2, (int) (byte) -1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35);
        java.lang.String[] strArray41 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList42 = new java.util.ArrayList<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList42, strArray41);
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList49 = new java.util.ArrayList<java.lang.String>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList49, strArray48);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray53 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList54 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList54, fieldDataArray53);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList49, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList54);
        java.lang.String[] strArray61 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList62 = new java.util.ArrayList<java.lang.String>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList62, strArray61);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray66 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList67 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList67, fieldDataArray66);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList62, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList67);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList49, (int) (byte) 100, 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList67);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList42, (int) '#', (int) (short) 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList67);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray74 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList75 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList75, fieldDataArray74);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList42, (int) (byte) -1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList75);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList2, (int) '#', (int) (short) 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList75);
        java.lang.Class<?> wildcardClass79 = fieldDataList75.getClass();
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
        org.junit.Assert.assertNotNull(fieldDataArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(fieldDataArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(fieldDataArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(fieldDataArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(wildcardClass79);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0415");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, (int) (short) 100, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0416");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate(0, (int) '4', fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0417");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate(10, (int) (byte) -1, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0418");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (byte) -1, (int) (byte) 1, filetypeEnum2);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0419");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (byte) 100, (int) (byte) 100, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0420");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb(10, (int) (byte) 1, filetypeEnum2);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0421");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (short) 1, (int) 'a', filetypeEnum2);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0422");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8, fieldDataArray7);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21, fieldDataArray20);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray33 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList34 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList34, fieldDataArray33);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList29, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList34);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) (byte) 100, 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList34);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) '4', (int) '4', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList34);
        java.util.List<java.lang.String> strList41 = null;
        java.lang.String[] strArray46 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList47 = new java.util.ArrayList<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList47, strArray46);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray51 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList52 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList52, fieldDataArray51);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList47, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList52);
        java.lang.String[] strArray59 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList60 = new java.util.ArrayList<java.lang.String>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList60, strArray59);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray64 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList65 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList65, fieldDataArray64);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList60, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList65);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList47, (int) (byte) 100, 10, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList65);
        java.lang.String[] strArray73 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList74 = new java.util.ArrayList<java.lang.String>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList74, strArray73);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray78 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList79 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList79, fieldDataArray78);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList74, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList79);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList47, (int) (byte) 100, (int) 'a', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList79);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray85 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList86 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList86, fieldDataArray85);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList47, (int) (byte) 1, (int) (byte) 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList86);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList(strList41, (int) (byte) 100, 0, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList86);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, 100, (int) (byte) -1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList86);
        java.lang.Class<?> wildcardClass91 = strList3.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(fieldDataArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(fieldDataArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(fieldDataArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(fieldDataArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(fieldDataArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(fieldDataArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(fieldDataArray85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(wildcardClass91);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0423");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) 'a', (int) (short) 0, filetypeEnum2);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0424");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) '4', (int) (short) 1, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0425");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) '4', (int) ' ', filetypeEnum2);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0426");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8, fieldDataArray7);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList28 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList28, fieldDataArray27);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList23, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList28);
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray40 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList41 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList41, fieldDataArray40);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList36, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList41);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList23, (int) (byte) 100, 10, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList41);
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList50 = new java.util.ArrayList<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList50, strArray49);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray54 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList55 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList55, fieldDataArray54);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList50, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList55);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList23, (int) (byte) 100, (int) 'a', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList55);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray61 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList62 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList62, fieldDataArray61);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList23, (int) (byte) 1, (int) (byte) 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList62);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) (short) 10, (int) (byte) 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList62);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (short) 10, (int) 'a', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList62);
        java.lang.Class<?> wildcardClass67 = fieldDataList62.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(fieldDataArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(fieldDataArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(fieldDataArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(fieldDataArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(fieldDataArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0427");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) ' ', (int) (short) 1, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0428");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb(0, (int) (byte) 0, filetypeEnum2);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0429");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) '#', (int) (short) 10, filetypeEnum2);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0430");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8, fieldDataArray7);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21, fieldDataArray20);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 100, 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList28 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList28, fieldDataArray27);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (short) 100, (int) (byte) -1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList28);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList33 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 10, (int) (short) 0, fieldDataList33);
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
        org.junit.Assert.assertNotNull(fieldDataArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0431");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8, fieldDataArray7);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21, fieldDataArray20);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray33 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList34 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList34, fieldDataArray33);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList29, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList34);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) (byte) 100, 10, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList34);
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray47 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList48 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList48, fieldDataArray47);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList43, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList48);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) (byte) 100, (int) 'a', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList48);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray54 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList55 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList55, fieldDataArray54);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) (byte) 1, (int) (byte) 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList55);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (short) 10, 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList55);
        java.lang.String[] strArray63 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList64 = new java.util.ArrayList<java.lang.String>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList64, strArray63);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray68 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList69 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList69, fieldDataArray68);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList64, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList69);
        java.lang.String[] strArray76 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList77 = new java.util.ArrayList<java.lang.String>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList77, strArray76);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray81 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList82 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList82, fieldDataArray81);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList77, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList82);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList64, (int) ' ', (int) 'a', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList82);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, 0, (int) (short) -1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList82);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList89 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (short) 0, (int) (short) 0, fieldDataList89);
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
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(fieldDataArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(fieldDataArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(fieldDataArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(fieldDataArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(fieldDataArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0432");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) '#', (int) (short) 100, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0433");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (byte) 1, (int) (short) -1, filetypeEnum2);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0434");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8, fieldDataArray7);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21, fieldDataArray20);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 100, 10, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray34 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList35 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35, fieldDataArray34);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList30, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 100, (int) 'a', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray41 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList42 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList42, fieldDataArray41);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) (byte) 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList42);
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList50 = new java.util.ArrayList<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList50, strArray49);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray54 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList55 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList55, fieldDataArray54);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList50, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList55);
        java.lang.String[] strArray62 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList63 = new java.util.ArrayList<java.lang.String>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList63, strArray62);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray67 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList68 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList68, fieldDataArray67);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList63, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList68);
        java.lang.String[] strArray75 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList76 = new java.util.ArrayList<java.lang.String>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList76, strArray75);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray80 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList81 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList81, fieldDataArray80);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList76, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList81);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList63, (int) (byte) 100, 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList81);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList50, (int) '4', (int) '4', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList81);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, 10, 0, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList81);
        java.lang.Class<?> wildcardClass87 = strList3.getClass();
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
        org.junit.Assert.assertNotNull(fieldDataArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(fieldDataArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(fieldDataArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(fieldDataArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(wildcardClass87);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0435");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) ' ', (int) (short) -1, filetypeEnum2);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0436");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (byte) 1, (-1), fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0437");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (short) 1, (int) (short) 100, filetypeEnum2);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0438");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb(10, (int) (short) 0, filetypeEnum2);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0439");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8, fieldDataArray7);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21, fieldDataArray20);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) ' ', (int) 'a', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray34 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList35 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35, fieldDataArray34);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList30, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35);
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray47 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList48 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList48, fieldDataArray47);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList43, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList48);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList30, (int) ' ', (int) 'a', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList48);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (short) 10, (int) (short) 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList48);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList55 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 1, 0, fieldDataList55);
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
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(fieldDataArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0440");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (short) 10, (int) (byte) -1, filetypeEnum2);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0441");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate(100, (int) ' ', fieldData2);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0442");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (byte) 1, (int) (short) 100, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0443");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 10, (int) (byte) 100, fieldData2);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0444");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, (int) ' ', fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0445");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8, fieldDataArray7);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21, fieldDataArray20);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray33 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList34 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList34, fieldDataArray33);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList29, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList34);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) (byte) 100, 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList34);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) '4', (int) '4', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList34);
        java.util.List<java.lang.String> strList41 = null;
        java.lang.String[] strArray46 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList47 = new java.util.ArrayList<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList47, strArray46);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray51 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList52 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList52, fieldDataArray51);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList47, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList52);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList(strList41, 1, 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList52);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) ' ', (int) (short) 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList52);
        java.lang.Class<?> wildcardClass57 = fieldDataList52.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(fieldDataArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(fieldDataArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(fieldDataArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(fieldDataArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0446");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 10, (int) (short) 0, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0447");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8, fieldDataArray7);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21, fieldDataArray20);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 100, 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray34 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList35 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35, fieldDataArray34);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList30, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35);
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray47 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList48 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList48, fieldDataArray47);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList43, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList48);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList30, (int) (byte) 100, 10, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList48);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 100, (int) (byte) 0, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList48);
        java.lang.String[] strArray57 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList58 = new java.util.ArrayList<java.lang.String>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList58, strArray57);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray62 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList63 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList63, fieldDataArray62);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList58, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList63);
        java.lang.String[] strArray70 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList71 = new java.util.ArrayList<java.lang.String>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList71, strArray70);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray75 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList76 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList76, fieldDataArray75);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList71, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList76);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList58, (int) (byte) 100, 10, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList76);
        java.lang.String[] strArray84 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList85 = new java.util.ArrayList<java.lang.String>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList85, strArray84);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray89 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList90 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList90, fieldDataArray89);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList85, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList90);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList58, (int) (byte) 100, (int) 'a', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList90);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 10, (int) (byte) 10, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList90);
        java.lang.Class<?> wildcardClass95 = fieldDataList90.getClass();
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
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(fieldDataArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(fieldDataArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(fieldDataArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNotNull(fieldDataArray89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(wildcardClass95);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0448");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray13 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList14, fieldDataArray13);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList9, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList14);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray26 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList27, fieldDataArray26);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList22, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList27);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList9, (int) (byte) 100, 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList27);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList2, (int) '#', (int) (short) 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList27);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray34 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList35 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35, fieldDataArray34);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList2, (int) (byte) -1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35);
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray47 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList48 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList48, fieldDataArray47);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList43, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList48);
        java.lang.String[] strArray55 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList56 = new java.util.ArrayList<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList56, strArray55);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray60 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList61 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList61, fieldDataArray60);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList56, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList61);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList43, (int) (byte) 100, 10, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList61);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList2, (-1), (int) (byte) -1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList61);
        java.lang.String[] strArray70 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList71 = new java.util.ArrayList<java.lang.String>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList71, strArray70);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray75 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList76 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList76, fieldDataArray75);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList71, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList76);
        java.lang.String[] strArray83 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList84 = new java.util.ArrayList<java.lang.String>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList84, strArray83);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray88 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList89 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList89, fieldDataArray88);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList84, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList89);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList71, (int) (byte) 100, 10, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList89);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList2, (int) (byte) -1, (int) (short) -1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList89);
        java.lang.Class<?> wildcardClass94 = strList2.getClass();
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
        org.junit.Assert.assertNotNull(fieldDataArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(fieldDataArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(fieldDataArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(fieldDataArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(fieldDataArray88);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(wildcardClass94);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0449");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (byte) -1, (int) (byte) -1, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0450");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (short) 100, 100, filetypeEnum2);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0451");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb(0, 0, filetypeEnum2);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0452");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (short) -1, (int) (byte) 0, filetypeEnum2);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0453");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 10, 1, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0454");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (byte) -1, (int) (short) 100, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0455");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) 'a', (int) (byte) 1, filetypeEnum2);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0456");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb(0, (int) '#', filetypeEnum2);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0457");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb(10, 0, filetypeEnum2);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0458");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((-1), (int) (byte) 100, filetypeEnum2);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0459");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 1, (int) '#', fieldData2);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0460");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) '#', (int) ' ', filetypeEnum2);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0461");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (short) 100, (int) (short) 1, filetypeEnum2);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0462");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray13 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList14, fieldDataArray13);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList9, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList14);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray26 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList27, fieldDataArray26);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList22, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList27);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList9, (int) (byte) 100, 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList27);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList2, (int) '#', (int) (short) 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList27);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray34 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList35 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35, fieldDataArray34);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList2, (int) (byte) -1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35);
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray47 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList48 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList48, fieldDataArray47);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList43, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList48);
        java.lang.String[] strArray55 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList56 = new java.util.ArrayList<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList56, strArray55);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray60 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList61 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList61, fieldDataArray60);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList56, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList61);
        java.lang.String[] strArray68 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList69 = new java.util.ArrayList<java.lang.String>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList69, strArray68);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray73 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList74 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList74, fieldDataArray73);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList69, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList74);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList56, (int) (byte) 100, 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList74);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList43, (int) '4', (int) '4', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList74);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList2, 1, (int) 'a', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList74);
        java.lang.Class<?> wildcardClass80 = strList2.getClass();
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
        org.junit.Assert.assertNotNull(fieldDataArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(fieldDataArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(fieldDataArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(fieldDataArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(wildcardClass80);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0463");
        java.util.List<java.lang.String> strList0 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray10 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList11, fieldDataArray10);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList6, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList11);
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray23 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList24, fieldDataArray23);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList19, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList24);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList6, (int) (byte) 100, 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList24);
        java.lang.String[] strArray32 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray37 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList38 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList38, fieldDataArray37);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList33, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList38);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList6, (int) (byte) -1, (int) ' ', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList38);
        java.lang.String[] strArray46 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList47 = new java.util.ArrayList<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList47, strArray46);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray51 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList52 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList52, fieldDataArray51);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList47, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList52);
        java.lang.String[] strArray59 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList60 = new java.util.ArrayList<java.lang.String>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList60, strArray59);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray64 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList65 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList65, fieldDataArray64);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList60, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList65);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList47, (int) (byte) 100, 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList65);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList6, (int) (byte) 100, 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList65);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList(strList0, (int) (short) 100, (int) (short) -1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList65);
        java.lang.Class<?> wildcardClass71 = fieldDataList65.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(fieldDataArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(fieldDataArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(fieldDataArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(fieldDataArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(fieldDataArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0464");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray13 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList14, fieldDataArray13);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList9, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList14);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray26 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList27, fieldDataArray26);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList22, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList27);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList9, (int) (byte) 100, 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList27);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList2, (int) '#', (int) (short) 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList27);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray34 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList35 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35, fieldDataArray34);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList2, (int) (byte) -1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35);
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray47 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList48 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList48, fieldDataArray47);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList43, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList48);
        java.lang.String[] strArray55 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList56 = new java.util.ArrayList<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList56, strArray55);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray60 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList61 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList61, fieldDataArray60);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList56, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList61);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList43, (int) (byte) 100, 10, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList61);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList2, (-1), (int) (byte) -1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList61);
        java.util.List<java.lang.String> strList68 = null;
        java.lang.String[] strArray73 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList74 = new java.util.ArrayList<java.lang.String>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList74, strArray73);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray78 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList79 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList79, fieldDataArray78);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList74, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList79);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList(strList68, 1, 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList79);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList2, (-1), 0, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList79);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList86 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList2, 0, (int) (byte) 0, fieldDataList86);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(fieldDataArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(fieldDataArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(fieldDataArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(fieldDataArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0465");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8, fieldDataArray7);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21, fieldDataArray20);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) ' ', (int) 'a', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray34 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList35 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35, fieldDataArray34);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList30, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35);
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray47 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList48 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList48, fieldDataArray47);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList43, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList48);
        java.lang.String[] strArray55 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList56 = new java.util.ArrayList<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList56, strArray55);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray60 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList61 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList61, fieldDataArray60);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList56, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList61);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList43, (int) (byte) 100, 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList61);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList30, (int) '4', (int) '4', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList61);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, 1, 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList61);
        java.lang.String[] strArray71 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList72 = new java.util.ArrayList<java.lang.String>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList72, strArray71);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray76 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList77 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList77, fieldDataArray76);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList72, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList77);
        java.lang.String[] strArray84 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList85 = new java.util.ArrayList<java.lang.String>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList85, strArray84);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray89 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList90 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList90, fieldDataArray89);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList85, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList90);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList72, (int) (byte) 100, 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList90);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (short) 0, (int) (byte) 0, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList90);
        java.lang.Class<?> wildcardClass95 = fieldDataList90.getClass();
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
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(fieldDataArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(fieldDataArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(fieldDataArray76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNotNull(fieldDataArray89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(wildcardClass95);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0466");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (byte) 1, (-1), filetypeEnum2);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0467");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (byte) -1, (int) (byte) 0, filetypeEnum2);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0468");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) -1, 100, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0469");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray13 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList14, fieldDataArray13);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList9, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList14);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray26 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList27, fieldDataArray26);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList22, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList27);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList9, (int) (byte) 100, 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList27);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList2, (int) '#', (int) (short) 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList27);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray34 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList35 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35, fieldDataArray34);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList2, (int) (byte) -1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35);
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray47 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList48 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList48, fieldDataArray47);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList43, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList48);
        java.lang.String[] strArray55 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList56 = new java.util.ArrayList<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList56, strArray55);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray60 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList61 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList61, fieldDataArray60);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList56, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList61);
        java.lang.String[] strArray68 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList69 = new java.util.ArrayList<java.lang.String>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList69, strArray68);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray73 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList74 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList74, fieldDataArray73);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList69, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList74);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList56, (int) (byte) 100, 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList74);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList43, (int) '4', (int) '4', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList74);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList2, 1, (int) 'a', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList74);
        java.lang.Class<?> wildcardClass80 = fieldDataList74.getClass();
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
        org.junit.Assert.assertNotNull(fieldDataArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(fieldDataArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(fieldDataArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(fieldDataArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(wildcardClass80);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0470");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8, fieldDataArray7);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21, fieldDataArray20);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) ' ', (int) 'a', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray34 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList35 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35, fieldDataArray34);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList30, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35);
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray47 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList48 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList48, fieldDataArray47);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList43, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList48);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList30, (int) ' ', (int) 'a', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList48);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 0, 0, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList48);
        java.lang.Class<?> wildcardClass53 = fieldDataList48.getClass();
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
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(fieldDataArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0471");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (byte) 0, (int) ' ', filetypeEnum2);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0472");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (byte) 10, 0, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0473");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8, fieldDataArray7);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21, fieldDataArray20);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray33 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList34 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList34, fieldDataArray33);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList29, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList34);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) (byte) 100, 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList34);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) '4', (int) '4', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList34);
        java.util.List<java.lang.String> strList41 = null;
        java.lang.String[] strArray46 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList47 = new java.util.ArrayList<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList47, strArray46);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray51 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList52 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList52, fieldDataArray51);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList47, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList52);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList(strList41, 1, 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList52);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) ' ', (int) (short) 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList52);
        java.util.List<java.lang.String> strList59 = null;
        java.lang.String[] strArray64 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList65 = new java.util.ArrayList<java.lang.String>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList65, strArray64);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray69 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList70 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList70, fieldDataArray69);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList65, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList70);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList(strList59, 1, 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList70);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) '4', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList70);
        java.lang.Class<?> wildcardClass75 = fieldDataList70.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(fieldDataArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(fieldDataArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(fieldDataArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(fieldDataArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(fieldDataArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(wildcardClass75);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0474");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb(10, (int) '#', filetypeEnum2);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0475");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate(1, 100, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0476");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (byte) 10, (int) (byte) -1, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0477");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) ' ', 1, filetypeEnum2);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0478");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) '#', 0, filetypeEnum2);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0479");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (byte) 10, (int) (short) -1, fieldData2);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0480");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray14 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList15, fieldDataArray14);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList10, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList15);
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList28 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList28, fieldDataArray27);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList23, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList28);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList10, (int) (byte) 100, 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList28);
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList37 = new java.util.ArrayList<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList37, strArray36);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray41 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList42 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList42, fieldDataArray41);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList37, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList42);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList10, (int) (byte) -1, (int) ' ', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList42);
        java.lang.String[] strArray50 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList51 = new java.util.ArrayList<java.lang.String>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList51, strArray50);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray55 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList56 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList56, fieldDataArray55);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList51, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList56);
        java.lang.String[] strArray63 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList64 = new java.util.ArrayList<java.lang.String>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList64, strArray63);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray68 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList69 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList69, fieldDataArray68);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList64, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList69);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList51, (int) (byte) 100, 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList69);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList10, (int) (byte) 100, 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList69);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (int) (byte) 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList69);
        java.util.List<java.lang.String> strList77 = null;
        java.lang.String[] strArray82 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList83 = new java.util.ArrayList<java.lang.String>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList83, strArray82);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray87 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList88 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList88, fieldDataArray87);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList83, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList88);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList(strList77, 1, 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList88);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, 100, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList88);
        java.lang.Class<?> wildcardClass93 = fieldDataList88.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(fieldDataArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(fieldDataArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(fieldDataArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(fieldDataArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(fieldDataArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(fieldDataArray87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(wildcardClass93);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0481");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (short) 1, 0, filetypeEnum2);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0482");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (byte) 10, (int) (byte) 0, fieldData2);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0483");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8, fieldDataArray7);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21, fieldDataArray20);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 100, 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray34 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList35 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35, fieldDataArray34);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList30, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (int) ' ', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList41 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, 10, (int) (byte) 1, fieldDataList41);
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
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0484");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) 'a', (int) (byte) 10, filetypeEnum2);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0485");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) '4', (int) (short) 0, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0486");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (short) 100, 10, filetypeEnum2);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0487");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (byte) 0, 100, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0488");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((-1), (int) '#', filetypeEnum2);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0489");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8, fieldDataArray7);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21, fieldDataArray20);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 100, 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray34 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList35 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35, fieldDataArray34);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList30, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35);
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray47 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList48 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList48, fieldDataArray47);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList43, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList48);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList30, (int) (byte) 100, 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList48);
        java.lang.String[] strArray56 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList57 = new java.util.ArrayList<java.lang.String>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList57, strArray56);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray61 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList62 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList62, fieldDataArray61);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList57, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList62);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList30, (int) (byte) -1, (int) ' ', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList62);
        java.lang.String[] strArray70 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList71 = new java.util.ArrayList<java.lang.String>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList71, strArray70);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray75 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList76 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList76, fieldDataArray75);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList71, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList76);
        java.lang.String[] strArray83 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList84 = new java.util.ArrayList<java.lang.String>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList84, strArray83);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray88 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList89 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList89, fieldDataArray88);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList84, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList89);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList71, (int) (byte) 100, 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList89);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList30, (int) (byte) 100, 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList89);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (short) 1, (int) (short) 0, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList89);
        java.lang.Class<?> wildcardClass95 = fieldDataList89.getClass();
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
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(fieldDataArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(fieldDataArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(fieldDataArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(fieldDataArray88);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(wildcardClass95);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0490");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) '4', (int) (short) 1, filetypeEnum2);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0491");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8, fieldDataArray7);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21, fieldDataArray20);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) ' ', (int) 'a', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray34 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList35 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35, fieldDataArray34);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList30, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList35);
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray47 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList48 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList48, fieldDataArray47);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList43, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList48);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList30, (int) ' ', (int) 'a', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList48);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 0, 0, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList48);
        java.lang.String[] strArray57 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList58 = new java.util.ArrayList<java.lang.String>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList58, strArray57);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray62 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList63 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList63, fieldDataArray62);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList58, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList63);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (int) (short) -1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList63);
        java.lang.Class<?> wildcardClass67 = fieldDataList63.getClass();
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
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(fieldDataArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(fieldDataArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0492");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (byte) 0, (int) (short) 0, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0493");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8, fieldDataArray7);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21, fieldDataArray20);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 100, 10, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        java.lang.Class<?> wildcardClass25 = strList3.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(fieldDataArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(fieldDataArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0494");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (byte) 1, (int) (byte) 10, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0495");
        java.util.List<java.lang.String> strList0 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray10 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList11, fieldDataArray10);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList6, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList11);
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray23 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList24, fieldDataArray23);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList19, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList24);
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList32 = new java.util.ArrayList<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList32, strArray31);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray36 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList37 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList37, fieldDataArray36);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList32, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList37);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList19, (int) (byte) 100, 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList37);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList6, (int) '4', (int) '4', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList37);
        java.util.List<java.lang.String> strList44 = null;
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList50 = new java.util.ArrayList<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList50, strArray49);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray54 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList55 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList55, fieldDataArray54);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList50, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList55);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList(strList44, 1, 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList55);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList6, (int) ' ', (int) (short) 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList55);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList(strList0, (int) (byte) 10, (int) (byte) 0, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList55);
        java.lang.Class<?> wildcardClass61 = fieldDataList55.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(fieldDataArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(fieldDataArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(fieldDataArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(fieldDataArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0496");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray7 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8, fieldDataArray7);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList8);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray20 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21, fieldDataArray20);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList16, (int) (byte) 1, (int) '#', (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (byte) 100, 100, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList21);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray27 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList28 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList28, fieldDataArray27);
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.processList((java.util.List<java.lang.String>) strList3, (int) (short) 100, (int) (byte) -1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList28);
        java.lang.Class<?> wildcardClass31 = fieldDataList28.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(fieldDataArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(fieldDataArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(fieldDataArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0497");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate(0, 10, fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0498");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb((int) (short) 0, (-1), filetypeEnum2);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0499");
        net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate.loadDb(100, (int) (byte) 0, filetypeEnum2);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DerivedTests0.test0500");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData2 = null;
        net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate companyAggregate3 = new net.ajaskey.market.tools.SIP.BigDB.derived.CompanyAggregate((int) (short) 100, (int) '#', fieldData2);
        java.lang.Class<?> wildcardClass4 = companyAggregate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }
}

