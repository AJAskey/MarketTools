package net.ajaskey.common;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CommonTests4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2001");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (byte) 0, 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         0" + "'", str2, "         0");
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2002");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt(100L, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100" + "'", str2, "100");
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2003");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", false);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str6 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str7 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str10 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.Class<?> wildcardClass13 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2004");
        net.ajaskey.common.Utils.NL = "                           35.00";
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2005");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", false);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str6 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str7 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str9 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str14 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str15 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str16 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str17 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.Class<?> wildcardClass18 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2006");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                                                                                            -1.00", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2007");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (byte) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2008");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", true);
        java.lang.String str3 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str6 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str7 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str11 = net.ajaskey.common.TextUtils.toString(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2009");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2010");
        java.lang.String[] strArray1 = null;
        java.util.List<java.io.File> fileList2 = net.ajaskey.common.Utils.getDir("                                                                                                1.00", strArray1);
        org.junit.Assert.assertNull(fileList2);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2011");
        net.ajaskey.common.Utils.makeDir("                           35.00");
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2012");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("                                                  97");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2013");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) 'a', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2014");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", true);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str5 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str8 = net.ajaskey.common.TextUtils.toString(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2015");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (byte) 100, (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                100" + "'", str2, "                                100");
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2016");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 100, 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    100.00" + "'", str2, "    100.00");
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2017");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (-1), 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        -1" + "'", str2, "        -1");
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2018");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", false);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str4 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str6 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str7 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2019");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) '#', (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "35" + "'", str2, "35");
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2020");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (short) -1, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1.00" + "'", str2, "-1.00");
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2021");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (byte) 1, (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                1" + "'", str2, "                                                                                                1");
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2022");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("     32.00", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2023");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 1.0f, 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "      1.00" + "'", str2, "      1.00");
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2024");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("                                 52", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:                                  52 (The system cannot find the file specified)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2025");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 1, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1.00" + "'", str2, "1.00");
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2026");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("\r\n", true);
        java.lang.String str3 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str4 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str5 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str7 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.Class<?> wildcardClass8 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2027");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", true);
        java.lang.String str3 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str6 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str7 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.Class<?> wildcardClass12 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2028");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", false);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str7 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str8 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str9 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str10 = net.ajaskey.common.TextUtils.toString(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2029");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 100, (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                              100.00" + "'", str2, "                                              100.00");
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2030");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", false);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str6 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str7 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str9 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str14 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str15 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str16 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str17 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str19 = net.ajaskey.common.TextUtils.toString(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2031");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("\r\n", true);
        java.lang.String str3 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str4 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str5 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str6 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str7 = net.ajaskey.common.TextUtils.toString(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2032");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", false);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str6 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str7 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str9 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.Class<?> wildcardClass14 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2033");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                                100", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2034");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) ' ', (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "32" + "'", str2, "32");
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2035");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", true);
        java.lang.String str3 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str6 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2036");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", false);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str4 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str5 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.Class<?> wildcardClass8 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2037");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", true);
        java.lang.String str3 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str6 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str7 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2038");
        java.lang.String[] strArray9 = new java.lang.String[] { "         0", "0.00", "hi!", "hi!", "hi!", "-1.00" };
        java.util.List<java.io.File> fileList10 = net.ajaskey.common.Utils.getDirTree("", strArray9);
        java.util.List<java.io.File> fileList11 = net.ajaskey.common.Utils.getDirTree("", strArray9);
        java.util.List<java.io.File> fileList12 = net.ajaskey.common.Utils.getDir("", strArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = fileList12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNull(fileList10);
        org.junit.Assert.assertNull(fileList11);
        org.junit.Assert.assertNull(fileList12);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2039");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) '#', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2040");
        net.ajaskey.common.Utils.makeDirs("                                 52");
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2041");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (short) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2042");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt(10.0d, 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Invalid fmt" + "'", str2, "Invalid fmt");
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2043");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) '#', (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "35" + "'", str2, "35");
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2044");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", true);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str5 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str6 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str7 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str8 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.Class<?> wildcardClass9 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2045");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt(1L, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                   1" + "'", str2, "                                                                                                   1");
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2046");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (byte) 0, (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                  0" + "'", str2, "                                  0");
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2047");
        net.ajaskey.common.Utils.NL = "                            0.00";
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2048");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                           97.00", false);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2049");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", false);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str6 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.Class<?> wildcardClass8 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2050");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (short) 100, 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                 100" + "'", str2, "                                                                                                 100");
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2051");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 0L, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "      0.00" + "'", str2, "      0.00");
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2052");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                               1.00", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2053");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 100, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100.00" + "'", str2, "100.00");
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2054");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", true);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str4 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str5 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str6 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.Class<?> wildcardClass7 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2055");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("\r\n", true);
        java.lang.String str3 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str5 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str8 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.Class<?> wildcardClass9 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2056");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                                                                                            10.00", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2057");
        net.ajaskey.common.TextUtils.printline("                                                                                               97.00");
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2058");
        net.ajaskey.common.Utils.makeDirs("                                                                                            -1.00");
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2059");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", false);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str6 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str7 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str11 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.Class<?> wildcardClass12 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2060");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 10.0f, (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                           10.00" + "'", str2, "                           10.00");
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2061");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt(1L, 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         1" + "'", str2, "         1");
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2062");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", false);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str7 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str8 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str9 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2063");
        net.ajaskey.common.Utils.TAB = "                                 52";
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2064");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 1.0f, (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                1.00" + "'", str2, "                                                1.00");
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2065");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (short) 1, (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                1" + "'", str2, "                                                                                                1");
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2066");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", false);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str6 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str7 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str9 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str11 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str14 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.Class<?> wildcardClass15 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2067");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("\r\n", false);
        java.lang.String str3 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str5 = net.ajaskey.common.TextUtils.toString(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2068");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", false);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str4 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str5 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str6 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str8 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str13 = net.ajaskey.common.TextUtils.toString(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2069");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt(1L, (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                               1" + "'", str2, "                               1");
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2070");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", true);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str5 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str6 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str7 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str8 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str9 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.Class<?> wildcardClass10 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2071");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.lfmt(0L, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2072");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", false);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str6 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str7 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str9 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str13 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str14 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2073");
        net.ajaskey.common.Utils.makeDirs("                                                                                            35.00");
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2074");
        java.lang.String[] strArray1 = null;
        java.util.List<java.io.File> fileList2 = net.ajaskey.common.Utils.getDirTree("", strArray1);
        org.junit.Assert.assertNull(fileList2);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2075");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("\r\n", false);
        net.ajaskey.common.TextUtils.print(strList2);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2076");
        net.ajaskey.common.Utils.makeDir("                             100.00");
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2077");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (byte) 0, (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2078");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", true);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str4 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.Class<?> wildcardClass6 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2079");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", false);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str6 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str7 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str10 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str11 = net.ajaskey.common.TextUtils.toString(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2080");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", true);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str5 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.Class<?> wildcardClass7 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2081");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", false);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str4 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str5 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str7 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str9 = net.ajaskey.common.TextUtils.toString(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2082");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) 10, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        10" + "'", str2, "        10");
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2083");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (short) 10, (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                              10" + "'", str2, "                              10");
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2084");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", false);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str4 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str5 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str8 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str10 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str11 = net.ajaskey.common.TextUtils.toString(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2085");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("       100", false);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2086");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (short) 0, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                   0" + "'", str2, "                                                                                                   0");
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2087");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", false);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str4 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str5 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str9 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2088");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("                                                  97", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:                                                   97 (Access is denied)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2089");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 100, 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Invalid fmt" + "'", str2, "Invalid fmt");
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2090");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt(100, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                 100" + "'", str2, "                                                                                                 100");
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2091");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((-1), 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        -1" + "'", str2, "        -1");
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2092");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", false);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2093");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt(10, 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                  10" + "'", str2, "                                                                                                  10");
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2094");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("\r\n", true);
        java.lang.String str3 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str5 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str6 = net.ajaskey.common.TextUtils.toString(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2095");
        net.ajaskey.common.Utils.TAB = "52";
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2096");
        net.ajaskey.common.Utils.NL = "                                 52";
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2097");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("\r\n", true);
        java.lang.String str3 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str5 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str8 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str9 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str10 = net.ajaskey.common.TextUtils.toString(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2098");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (byte) -1, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1" + "'", str2, "-1");
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2099");
        net.ajaskey.common.Utils.makeDir("                                 52");
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2100");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (byte) 0, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0.00" + "'", str2, "0.00");
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2101");
        java.lang.String[] strArray1 = null;
        java.util.List<java.io.File> fileList2 = net.ajaskey.common.Utils.getDir("                                100", strArray1);
        org.junit.Assert.assertNull(fileList2);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2102");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", false);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str6 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str7 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str9 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str11 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2103");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (short) 1, (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                   1" + "'", str2, "                                                   1");
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2104");
        net.ajaskey.common.TextUtils.printline("                           97.00");
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2105");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (short) 10, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10" + "'", str2, "10");
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2106");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 100.0f, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100.00" + "'", str2, "100.00");
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2107");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                                                                                              100.00", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2108");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", true);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str4 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str6 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.Class<?> wildcardClass7 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2109");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("                                                                                               10.00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2110");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 1, (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                1.00" + "'", str2, "                                                1.00");
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2111");
        java.lang.String[] strArray23 = new java.lang.String[] { "        52", "                                                                                              100", "                                                                                                  -1", "                                                                                              100", "        52", "                                                                                              100.00", "                                                                                                   1", "35.00", "                                                                                               52.00", "                                                  35", "                                                                                                  10", "                                                                                               -1.00", "                           10.00", "                                                                                               97", "", "                             100", "52.00", "-1", "10.00", "                                                                                             0.00", "                               0.00", "0", "97" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        net.ajaskey.common.TextUtils.print((java.util.List<java.lang.String>) strList24);
        net.ajaskey.common.TextUtils.print((java.util.List<java.lang.String>) strList24);
        net.ajaskey.common.TextUtils.print((java.util.List<java.lang.String>) strList24);
        net.ajaskey.common.TextUtils.print((java.util.List<java.lang.String>) strList24);
        net.ajaskey.common.TextUtils.print((java.util.List<java.lang.String>) strList24);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2112");
        net.ajaskey.common.TextUtils.printline("                                                                                               35");
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2113");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (byte) 10, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10" + "'", str2, "10");
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2114");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", false);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str4 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str5 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str9 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.Class<?> wildcardClass10 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2115");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (short) -1, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1" + "'", str2, "-1");
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2116");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("\r\n", true);
        net.ajaskey.common.TextUtils.print(strList2);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2117");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", false);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str7 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str8 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2118");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                            1.00", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2119");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("\r\n", true);
        java.lang.String str3 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str4 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str5 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str7 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str9 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.Class<?> wildcardClass10 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2120");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", true);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str5 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.Class<?> wildcardClass6 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2121");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 10.0f, (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10.00" + "'", str2, "10.00");
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2122");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) 'a', (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "97" + "'", str2, "97");
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2123");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", false);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str6 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str7 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str9 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str14 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str15 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str16 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str17 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.Class<?> wildcardClass20 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2124");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt(0.0d, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0.00" + "'", str2, "0.00");
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2125");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) '4', (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                            52.00" + "'", str2, "                                                                                            52.00");
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2126");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (byte) 100, (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                              100" + "'", str2, "                                                                                              100");
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2127");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 10.0f, 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Invalid fmt" + "'", str2, "Invalid fmt");
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2128");
        net.ajaskey.common.Utils.NL = "                                              100.00";
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2129");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) 0, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2130");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt(1, (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                               1" + "'", str2, "                               1");
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2131");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) ' ', 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "     32.00" + "'", str2, "     32.00");
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2132");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (byte) 1, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1.00" + "'", str2, "1.00");
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2133");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", true);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str4 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str5 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2134");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("\r\n", true);
        java.lang.String str3 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str4 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str6 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2135");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt(100, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100" + "'", str2, "100");
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2136");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("                              35.00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2137");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) '4', (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                  52" + "'", str2, "                                                                                                  52");
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2138");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", false);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str7 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str8 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str9 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str11 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2139");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (short) 10, (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                 10" + "'", str2, "                                 10");
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2140");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (byte) 10, 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        10" + "'", str2, "        10");
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2141");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("                           97.00", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:                            97.00 (Access is denied)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2142");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (short) 0, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Invalid fmt" + "'", str2, "Invalid fmt");
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2143");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((-1L), (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1" + "'", str2, "-1");
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2144");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", false);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str6 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str7 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str9 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str14 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str15 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str16 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str17 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str18 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str19 = net.ajaskey.common.TextUtils.toString(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2145");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("\r\n", true);
        java.lang.String str3 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str4 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str6 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str7 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str8 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str10 = net.ajaskey.common.TextUtils.toString(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2146");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("                                                                                               35");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2147");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (byte) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2148");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (short) -1, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                  -1" + "'", str2, "                                                                                                  -1");
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2149");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) '4', (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                              52.00" + "'", str2, "                              52.00");
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2150");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (-1), (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1" + "'", str2, "-1");
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2151");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", false);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str6 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str7 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str11 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.Class<?> wildcardClass13 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2152");
        net.ajaskey.common.TextUtils.printline("                                                                                               32");
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2153");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                                  0", false);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2154");
        net.ajaskey.common.Utils.NL = "                                                                                            -1.00";
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2155");
        java.lang.String[] strArray5 = new java.lang.String[] { "                                100", "                                 -1", "     52.00" };
        java.util.List<java.io.File> fileList6 = net.ajaskey.common.Utils.getDirTree("", strArray5);
        java.util.List<java.io.File> fileList7 = net.ajaskey.common.Utils.getDir("", strArray5);
        java.lang.Class<?> wildcardClass8 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNull(fileList6);
        org.junit.Assert.assertNull(fileList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2156");
        net.ajaskey.common.Utils.TAB = "                                                  97";
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2157");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.ifmt(100, 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2158");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", false);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str6 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str7 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str9 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str10 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str12 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str15 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str16 = net.ajaskey.common.TextUtils.toString(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2159");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("                                                                                               35", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:                                                                                                35 (The system cannot find the file specified)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2160");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", true);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str5 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str7 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str9 = net.ajaskey.common.TextUtils.toString(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2161");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", true);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.Class<?> wildcardClass6 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2162");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt(1.0d, (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                               1.00" + "'", str2, "                               1.00");
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2163");
        net.ajaskey.common.Utils.makeDirs("                                                                                               35");
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2164");
        net.ajaskey.common.Utils.TAB = "                              52.00";
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2165");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", false);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str6 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str7 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str9 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str10 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2166");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("\r\n", true);
        java.lang.String str3 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str4 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str6 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str7 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str8 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.Class<?> wildcardClass10 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2167");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", false);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str6 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str7 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str12 = net.ajaskey.common.TextUtils.toString(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2168");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 10.0f, 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                               10.00" + "'", str2, "                                                                                               10.00");
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2169");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (short) 0, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "      0.00" + "'", str2, "      0.00");
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2170");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", true);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str4 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.Class<?> wildcardClass7 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2171");
        net.ajaskey.common.TextUtils.printline("                           35.00");
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2172");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", true);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str5 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str7 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str8 = net.ajaskey.common.TextUtils.toString(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2173");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", false);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str6 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str7 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str9 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str11 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str15 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str16 = net.ajaskey.common.TextUtils.toString(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2174");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", false);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str4 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str5 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str6 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str7 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str9 = net.ajaskey.common.TextUtils.toString(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2175");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", false);
        java.lang.String str3 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str4 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str5 = net.ajaskey.common.TextUtils.toString(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2176");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) ' ', (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                  32" + "'", str2, "                                                                                                  32");
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2177");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (byte) 100, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100" + "'", str2, "100");
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2178");
        net.ajaskey.common.Utils.NL = "                                                                                               52.00";
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2179");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) '#', (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "35" + "'", str2, "35");
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2180");
        net.ajaskey.common.TextUtils.printline("                                                                                            10.00");
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2181");
        net.ajaskey.common.Utils.makeDir("                                 -1");
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2182");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (-1), (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "     -1.00" + "'", str2, "     -1.00");
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2183");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 0L, (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0.00" + "'", str2, "0.00");
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2184");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                                                                                               32", false);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2185");
        net.ajaskey.common.Utils.makeDirs("                              52.00");
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2186");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 10L, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                               10.00" + "'", str2, "                                                                                               10.00");
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2187");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((-1L), (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                 -1" + "'", str2, "                                 -1");
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2188");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) '4', (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "52.00" + "'", str2, "52.00");
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2189");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", false);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str4 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str5 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str8 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str10 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2190");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("                                                                                            52.00", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:                                                                                             52.00 (The system cannot find the file specified)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2191");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 100L, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    100.00" + "'", str2, "    100.00");
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2192");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                                                                                            52.00", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2193");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", false);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str6 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str7 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str9 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str10 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str11 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2194");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", true);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str5 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str6 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str7 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str8 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str10 = net.ajaskey.common.TextUtils.toString(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2195");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", true);
        java.lang.String str3 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str6 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str8 = net.ajaskey.common.TextUtils.toString(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2196");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", false);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str9 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str10 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.Class<?> wildcardClass11 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2197");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", false);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str6 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str7 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str10 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str12 = net.ajaskey.common.TextUtils.toString(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2198");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", false);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str6 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str7 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str9 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str11 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str12 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str13 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str14 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2199");
        java.lang.String[] strArray10 = new java.lang.String[] { "         0", "0.00", "hi!", "hi!", "hi!", "-1.00" };
        java.util.List<java.io.File> fileList11 = net.ajaskey.common.Utils.getDirTree("", strArray10);
        java.util.List<java.io.File> fileList12 = net.ajaskey.common.Utils.getDirTree("", strArray10);
        java.util.List<java.io.File> fileList13 = net.ajaskey.common.Utils.getDir("", strArray10);
        java.util.List<java.io.File> fileList14 = net.ajaskey.common.Utils.getDirTree("", strArray10);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNull(fileList11);
        org.junit.Assert.assertNull(fileList12);
        org.junit.Assert.assertNull(fileList13);
        org.junit.Assert.assertNull(fileList14);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2200");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((-1L), (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1" + "'", str2, "-1");
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2201");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (short) -1, (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                               -1" + "'", str2, "                                                                                               -1");
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2202");
        net.ajaskey.common.Utils.makeDirs("                                                                                            10.00");
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2203");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2204");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", false);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str6 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str7 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str9 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str10 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str12 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str14 = net.ajaskey.common.TextUtils.toString(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2205");
        java.lang.String[] strArray1 = null;
        java.util.List<java.io.File> fileList2 = net.ajaskey.common.Utils.getDir("                                                  10", strArray1);
        org.junit.Assert.assertNull(fileList2);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2206");
        net.ajaskey.common.Utils.NL = "                                                                                            52.00";
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2207");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt(100.0d, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    100.00" + "'", str2, "    100.00");
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2208");
        net.ajaskey.common.Utils.NL = "-1";
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2209");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", false);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str4 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str5 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str6 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str8 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str11 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str12 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.Class<?> wildcardClass13 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2210");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", false);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str6 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str7 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str9 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str14 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str15 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str16 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str17 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.Class<?> wildcardClass19 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2211");
        net.ajaskey.common.Utils.NL = "                              52.00";
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2212");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (byte) -1, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        -1" + "'", str2, "        -1");
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2213");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("                              10.00", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:                               10.00 (Access is denied)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2214");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (short) 1, 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         1" + "'", str2, "         1");
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2215");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", false);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str4 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str5 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str6 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str8 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str10 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str11 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str12 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2216");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (byte) 0, (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                               0" + "'", str2, "                               0");
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2217");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                                              100.00", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2218");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) 0, 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                   0" + "'", str2, "                                                                                                   0");
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2219");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", true);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str4 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str5 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.Class<?> wildcardClass6 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2220");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (short) -1, 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        -1" + "'", str2, "        -1");
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2221");
        java.lang.String[] strArray10 = new java.lang.String[] { "         0", "0.00", "hi!", "hi!", "hi!", "-1.00" };
        java.util.List<java.io.File> fileList11 = net.ajaskey.common.Utils.getDirTree("", strArray10);
        java.util.List<java.io.File> fileList12 = net.ajaskey.common.Utils.getDirTree("\r\n", strArray10);
        java.util.List<java.io.File> fileList13 = net.ajaskey.common.Utils.getDir("", strArray10);
        java.util.List<java.io.File> fileList14 = net.ajaskey.common.Utils.getDir("", strArray10);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNull(fileList11);
        org.junit.Assert.assertNull(fileList12);
        org.junit.Assert.assertNull(fileList13);
        org.junit.Assert.assertNull(fileList14);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2222");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", false);
        java.lang.String str3 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2223");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", false);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str6 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str7 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str9 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str14 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str15 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str16 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str17 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str20 = net.ajaskey.common.TextUtils.toString(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2224");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", true);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str5 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str6 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str7 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str8 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.Class<?> wildcardClass10 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2225");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", false);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str4 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str5 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str6 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str8 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str11 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2226");
        net.ajaskey.common.Utils.makeDirs("                                                                                            52.00");
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2227");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", false);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str4 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str5 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str8 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.Class<?> wildcardClass11 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2228");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("                                                                                            35.00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests4.test2229");
        java.lang.String[] strArray1 = null;
        java.util.List<java.io.File> fileList2 = net.ajaskey.common.Utils.getDir("-1.00", strArray1);
        org.junit.Assert.assertNull(fileList2);
    }
}

