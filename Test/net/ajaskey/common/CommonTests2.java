package net.ajaskey.common;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CommonTests2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1001");
        net.ajaskey.common.TextUtils.printline("                                                                                                0");
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1002");
        java.lang.String[] strArray1 = null;
        java.util.List<java.io.File> fileList2 = net.ajaskey.common.Utils.getDir("                                                                                               52.00", strArray1);
        org.junit.Assert.assertNull(fileList2);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1003");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("                              52", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:                               52 (The system cannot find the file specified)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1004");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("                              10", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:                               10 (Access is denied)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1005");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((-1L), 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1" + "'", str2, "-1");
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1006");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) ' ', (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Invalid fmt" + "'", str2, "Invalid fmt");
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1007");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) '#', (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "     35.00" + "'", str2, "     35.00");
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1008");
        net.ajaskey.common.TextUtils.printline("                               1");
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1009");
        net.ajaskey.common.Utils.TAB = "                                               10.00";
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1010");
        net.ajaskey.common.Utils.makeDir("                            0.00");
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1011");
        net.ajaskey.common.TextUtils.printline("                                                                                               52.00");
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1012");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("                                                                                           100.00", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:                                                                                            100.00 (Access is denied)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1013");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (short) 100, 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    100.00" + "'", str2, "    100.00");
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1014");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("     35.00", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:      35.00 (The system cannot find the file specified)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1015");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 10L, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10.00" + "'", str2, "10.00");
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1016");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 1L, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1.00" + "'", str2, "1.00");
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1017");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("     10.00", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:      10.00 (Access is denied)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1018");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (byte) 10, (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                              10.00" + "'", str2, "                              10.00");
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1019");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.lfmt(1L, 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1020");
        java.lang.String[] strArray10 = new java.lang.String[] { "         0", "0.00", "hi!", "hi!", "hi!", "-1.00" };
        java.util.List<java.io.File> fileList11 = net.ajaskey.common.Utils.getDirTree("", strArray10);
        java.util.List<java.io.File> fileList12 = net.ajaskey.common.Utils.getDir("", strArray10);
        java.util.List<java.io.File> fileList13 = net.ajaskey.common.Utils.getDir("        52", strArray10);
        java.util.List<java.io.File> fileList14 = net.ajaskey.common.Utils.getDir("", strArray10);
        java.lang.Class<?> wildcardClass15 = strArray10.getClass();
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNull(fileList11);
        org.junit.Assert.assertNull(fileList12);
        org.junit.Assert.assertNull(fileList13);
        org.junit.Assert.assertNull(fileList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1021");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("                               1", true);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1022");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (byte) 10, (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10" + "'", str2, "10");
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1023");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (short) 10, 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        10" + "'", str2, "        10");
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1024");
        net.ajaskey.common.Utils.makeDir("                                               10.00");
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1025");
        net.ajaskey.common.Utils.TAB = "100";
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1026");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("                                                                                               -1.00", true);
        java.lang.String str3 = net.ajaskey.common.TextUtils.toString(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1027");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (byte) 10, 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10.00" + "'", str2, "10.00");
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1028");
        java.lang.String[] strArray2 = new java.lang.String[] { "                                                                                                  35" };
        java.util.List<java.io.File> fileList3 = net.ajaskey.common.Utils.getDirTree("                               1", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNull(fileList3);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1029");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", false);
        java.lang.String str3 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.Class<?> wildcardClass4 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1030");
        net.ajaskey.common.Utils.makeDirs("                               1");
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1031");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (byte) 10, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Invalid fmt" + "'", str2, "Invalid fmt");
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1032");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("                                                                                               -1.00", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:                                                                                                -1.00 (The system cannot find the file specified)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1033");
        net.ajaskey.common.Utils.makeDirs("                                               -1.00");
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1034");
        net.ajaskey.common.Utils.makeDirs("100.00");
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1035");
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
        java.lang.Class<?> wildcardClass14 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1036");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt(0, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1037");
        net.ajaskey.common.Utils.TAB = "                                                                                                1";
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1038");
        net.ajaskey.common.Utils.makeDir("        97");
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1039");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 0L, 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0.00" + "'", str2, "0.00");
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1040");
        net.ajaskey.common.Utils.NL = "                                                                                                 100";
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1041");
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
        java.lang.Class<?> wildcardClass13 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1042");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("                             100", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:                              100 (Access is denied)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1043");
        net.ajaskey.common.Utils.NL = "hi!";
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1044");
        net.ajaskey.common.Utils.TAB = "                                                  -1";
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1045");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) 0, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                   0" + "'", str2, "                                                                                                   0");
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1046");
        net.ajaskey.common.Utils.makeDir("                                                                                                  -1");
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1047");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (-1), (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                  -1" + "'", str2, "                                                                                                  -1");
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1048");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                                                  -1", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1049");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                              10", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1050");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt(100L, (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                 100" + "'", str2, "                                                 100");
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1051");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt(0L, (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1052");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (short) 100, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    100.00" + "'", str2, "    100.00");
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1053");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", false);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str7 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.Class<?> wildcardClass9 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1054");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (-1.0f), 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Invalid fmt" + "'", str2, "Invalid fmt");
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1055");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt(100L, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       100" + "'", str2, "       100");
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1056");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("                           -1.00", true);
        java.lang.String str3 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str4 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.Class<?> wildcardClass6 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1057");
        net.ajaskey.common.Utils.makeDirs("                             100.00");
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1058");
        net.ajaskey.common.Utils.TAB = "                          100.00";
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1059");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) 10, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10" + "'", str2, "10");
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1060");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", false);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str6 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str7 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.Class<?> wildcardClass9 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1061");
        net.ajaskey.common.Utils.NL = "                              52";
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1062");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((-1L), (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1" + "'", str2, "-1");
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1063");
        net.ajaskey.common.Utils.makeDirs("                                                                                              100.00");
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1064");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (byte) -1, (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                  -1" + "'", str2, "                                                  -1");
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1065");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                                 97", false);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1066");
        net.ajaskey.common.TextUtils.printline("     35.00");
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1067");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                                                                                                  10", false);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1068");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("                                                1.00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1069");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) ' ', (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "32" + "'", str2, "32");
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1070");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (short) 100, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100" + "'", str2, "100");
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1071");
        net.ajaskey.common.Utils.TAB = "        52";
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1072");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("hi!", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1073");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("                              35");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1074");
        net.ajaskey.common.Utils.makeDirs("                           10.00");
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1075");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) ' ', (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "32" + "'", str2, "32");
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1076");
        net.ajaskey.common.Utils.makeDir("                                 10");
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1077");
        net.ajaskey.common.Utils.makeDirs("                                                                                               -1");
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1078");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) ' ', 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Invalid fmt" + "'", str2, "Invalid fmt");
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1079");
        net.ajaskey.common.Utils.NL = "                                                                                               10.00";
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1080");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("                              -1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1081");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (byte) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1082");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 0.0f, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0.00" + "'", str2, "0.00");
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1083");
        net.ajaskey.common.TextUtils.printline("                                                                                             0.00");
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1084");
        net.ajaskey.common.TextUtils.printline("                              10.00");
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1085");
        net.ajaskey.common.TextUtils.printline("1.00");
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1086");
        net.ajaskey.common.Utils.makeDirs("                              97");
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1087");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("                                                                                               -1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1088");
        net.ajaskey.common.Utils.makeDir("                              10.00");
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1089");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (byte) 0, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1090");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt(1.0d, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "      1.00" + "'", str2, "      1.00");
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1091");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) '4', (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "     52.00" + "'", str2, "     52.00");
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1092");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("                                                                                             1.00", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:                                                                                              1.00 (Access is denied)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1093");
        net.ajaskey.common.Utils.NL = "                                                                                                1";
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1094");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.ifmt(0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1095");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt(0, (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1096");
        net.ajaskey.common.Utils.NL = "        35";
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1097");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt(1, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1098");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 0, 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "      0.00" + "'", str2, "      0.00");
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1099");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (short) 0, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0.00" + "'", str2, "0.00");
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1100");
        net.ajaskey.common.Utils.TAB = "                              -1";
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1101");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (byte) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1102");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt(10.0d, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10.00" + "'", str2, "10.00");
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1103");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", false);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str5 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str6 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.Class<?> wildcardClass8 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1104");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (byte) -1, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                               -1.00" + "'", str2, "                                                                                               -1.00");
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1105");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt(0L, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1106");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (short) -1, (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                  -1" + "'", str2, "                                                  -1");
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1107");
        net.ajaskey.common.Utils.makeDir("100");
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1108");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("                                                                                                  -1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1109");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("                           -1.00", true);
        java.lang.String str3 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str4 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1110");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("                          100.00", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:                           100.00 (Access is denied)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1111");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("        -1", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1112");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt(10.0d, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "     10.00" + "'", str2, "     10.00");
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1113");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt(100.0d, 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                              100.00" + "'", str2, "                                                                                              100.00");
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1114");
        net.ajaskey.common.Utils.makeDir("                               1");
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1115");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((-1L), (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        -1" + "'", str2, "        -1");
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1116");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("100", false);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1117");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (byte) 0, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1118");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt(0, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                   0" + "'", str2, "                                                                                                   0");
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1119");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (-1), (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1.00" + "'", str2, "-1.00");
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1120");
        net.ajaskey.common.Utils.makeDir("     52.00");
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1121");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 100, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                              100.00" + "'", str2, "                                                                                              100.00");
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1122");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                                                                                                  35", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1123");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (short) 10, (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                  10" + "'", str2, "                                                  10");
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1124");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("52.00", false);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1125");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 10L, (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                               10.00" + "'", str2, "                                               10.00");
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1126");
        net.ajaskey.common.Utils.makeDirs("                                                                                                1.00");
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1127");
        net.ajaskey.common.Utils.makeDirs("                            0.00");
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1128");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                               1", false);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1129");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                                                                                             1.00", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1130");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (byte) 0, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         0" + "'", str2, "         0");
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1131");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) 100, 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100" + "'", str2, "100");
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1132");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("                                               10.00", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:                                                10.00 (Access is denied)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1133");
        java.lang.String[] strArray1 = null;
        java.util.List<java.io.File> fileList2 = net.ajaskey.common.Utils.getDir("                                                                                              100", strArray1);
        org.junit.Assert.assertNull(fileList2);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1134");
        net.ajaskey.common.TextUtils.printline("-1.00");
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1135");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (byte) 100, (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                             100.00" + "'", str2, "                             100.00");
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1136");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                                                                                               10", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1137");
        net.ajaskey.common.TextUtils.printline("      0.00");
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1138");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("                                                                                               -1", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:                                                                                                -1 (Access is denied)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1139");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1140");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (short) 100, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       100" + "'", str2, "       100");
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1141");
        net.ajaskey.common.Utils.makeDir("        35");
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1142");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("                                                                                             1.00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1143");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (byte) 1, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1144");
        net.ajaskey.common.Utils.makeDir("                                                                                               -1.00");
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1145");
        net.ajaskey.common.Utils.makeDir("        -1");
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1146");
        net.ajaskey.common.TextUtils.printline("                              10");
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1147");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (short) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1148");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (short) 1, 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1149");
        java.text.DecimalFormatSymbols decimalFormatSymbols0 = net.ajaskey.common.Utils.decimalFormatSymbols;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = decimalFormatSymbols0.getClass();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNull(decimalFormatSymbols0);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1150");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("                                  0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1151");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("                                 10");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1152");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("                                               -1.00", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:                                                -1.00 (Access is denied)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1153");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) 'a', (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "97" + "'", str2, "97");
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1154");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) 1, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                   1" + "'", str2, "                                                                                                   1");
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1155");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 1.0f, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1.00" + "'", str2, "1.00");
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1156");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) 100, 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       100" + "'", str2, "       100");
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1157");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (short) 1, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1158");
        net.ajaskey.common.Utils.NL = "\r\n";
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1159");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (short) 1, (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1160");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("                                100");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1161");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("     52.00", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1162");
        net.ajaskey.common.Utils.makeDirs("                                                                                                1");
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1163");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (short) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1164");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("52", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1165");
        net.ajaskey.common.TextUtils.printline("                                                  -1");
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1166");
        net.ajaskey.common.Utils.TAB = "                           10.00";
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1167");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("        35");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1168");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (short) 100, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       100" + "'", str2, "       100");
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1169");
        net.ajaskey.common.Utils.NL = "                              -1";
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1170");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (short) 10, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Invalid fmt" + "'", str2, "Invalid fmt");
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1171");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) 1, (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                  1" + "'", str2, "                                  1");
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1172");
        net.ajaskey.common.Utils.TAB = "35";
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1173");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("35", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: 35 (The system cannot find the file specified)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1174");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1175");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (short) -1, (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                 -1" + "'", str2, "                                 -1");
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1176");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 10L, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10.00" + "'", str2, "10.00");
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1177");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("                                                                                             0.00", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:                                                                                              0.00 (The system cannot find the file specified)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1178");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1179");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) 'a', (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "97" + "'", str2, "97");
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1180");
        net.ajaskey.common.Utils.makeDir("                           -1.00");
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1181");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("     35.00", false);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1182");
        net.ajaskey.common.Utils.makeDirs("                                 35");
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1183");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                                                                                             0.00", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1184");
        net.ajaskey.common.TextUtils.printline("       100");
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1185");
        net.ajaskey.common.Utils.makeDir("                                                                                               10.00");
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1186");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (short) -1, (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                              -1" + "'", str2, "                              -1");
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1187");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("                           10.00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1188");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("                                                                                                1", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:                                                                                                 1 (Access is denied)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1189");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt(10, 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        10" + "'", str2, "        10");
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1190");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                                                                                               10", false);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1191");
        net.ajaskey.common.Utils.TAB = "                                                                                               10.00";
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1192");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((-1.0d), (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1.00" + "'", str2, "-1.00");
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1193");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt(100L, (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                100" + "'", str2, "                                100");
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1194");
        net.ajaskey.common.Utils.makeDir("-1");
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1195");
        net.ajaskey.common.Utils.TAB = "                                                                                               10";
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1196");
        java.lang.String[] strArray1 = null;
        java.util.List<java.io.File> fileList2 = net.ajaskey.common.Utils.getDir("97", strArray1);
        org.junit.Assert.assertNull(fileList2);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1197");
        net.ajaskey.common.Utils.NL = "     10.00";
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1198");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("                                                                                                  10");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1199");
        net.ajaskey.common.Utils.TAB = "                                  1";
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1200");
        net.ajaskey.common.Utils.NL = "                                                                                               -1";
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1201");
        net.ajaskey.common.Utils.NL = "     52.00";
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1202");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt(10L, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10" + "'", str2, "10");
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1203");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 10, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "     10.00" + "'", str2, "     10.00");
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1204");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1205");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) ' ', (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                  32" + "'", str2, "                                                                                                  32");
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1206");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (short) 10, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10" + "'", str2, "10");
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1207");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt(1.0d, 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                1.00" + "'", str2, "                                                                                                1.00");
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1208");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (short) 1, 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Invalid fmt" + "'", str2, "Invalid fmt");
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1209");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt(1L, (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                   1" + "'", str2, "                                                   1");
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1210");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) '#', (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                               35.00" + "'", str2, "                                                                                               35.00");
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1211");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (short) 100, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Invalid fmt" + "'", str2, "Invalid fmt");
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1212");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) 0, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1213");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 100L, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                              100.00" + "'", str2, "                                                                                              100.00");
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1214");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                                                   0", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1215");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (short) 10, (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10" + "'", str2, "10");
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1216");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (short) 10, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10" + "'", str2, "10");
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1217");
        net.ajaskey.common.Utils.NL = "                                                                                                0";
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1218");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("\r\n", true);
        java.lang.String str3 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.Class<?> wildcardClass5 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1219");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) ' ', (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                               32.00" + "'", str2, "                                                                                               32.00");
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1220");
        net.ajaskey.common.Utils.TAB = "        35";
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1221");
        net.ajaskey.common.TextUtils.printline("                             100.00");
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1222");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 1, (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                               1.00" + "'", str2, "                               1.00");
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1223");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) '#', (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "35" + "'", str2, "35");
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1224");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) '#', (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "35" + "'", str2, "35");
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1225");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("                               1.00", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:                                1.00 (The system cannot find the file specified)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1226");
        net.ajaskey.common.Utils.makeDirs("                              10.00");
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1227");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("     35.00", false);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1228");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 100, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100.00" + "'", str2, "100.00");
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1229");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 100.0f, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    100.00" + "'", str2, "    100.00");
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1230");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("                                                1.00", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:                                                 1.00 (Access is denied)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1231");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (short) 0, 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1232");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", false);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.Class<?> wildcardClass8 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1233");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) ' ', (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "32.00" + "'", str2, "32.00");
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1234");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                                                                                                0", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1235");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("                                                                                                  97");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1236");
        net.ajaskey.common.Utils.makeDir("                                                                                               32.00");
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1237");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (byte) 10, 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                  10" + "'", str2, "                                                                                                  10");
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1238");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", false);
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
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1239");
        net.ajaskey.common.Utils.NL = "                              35";
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1240");
        net.ajaskey.common.TextUtils.printline("                                 -1");
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1241");
        net.ajaskey.common.Utils.makeDirs("                                                                                                  35");
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1242");
        net.ajaskey.common.TextUtils.printline("                                                                                               -1");
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1243");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt(10, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10" + "'", str2, "10");
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1244");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt(10, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10" + "'", str2, "10");
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1245");
        net.ajaskey.common.Utils.makeDirs("                                                                                               35.00");
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1246");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1247");
        net.ajaskey.common.TextUtils.printline("     52.00");
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1248");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                               0.00", false);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1249");
        net.ajaskey.common.Utils.TAB = "                                                                                             1.00";
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1250");
        net.ajaskey.common.Utils.makeDir("                                                                                             0.00");
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1251");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) '4', 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "52" + "'", str2, "52");
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1252");
        net.ajaskey.common.Utils.makeDir("52");
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1253");
        net.ajaskey.common.Utils.NL = "                              10.00";
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1254");
        net.ajaskey.common.Utils.makeDir("32.00");
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1255");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1256");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("     35.00", true);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1257");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("                                                                                           100.00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1258");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("     10.00", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1259");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (byte) -1, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1" + "'", str2, "-1");
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1260");
        net.ajaskey.common.Utils.TAB = "                           -1.00";
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1261");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 'a', (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "97.00" + "'", str2, "97.00");
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1262");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (byte) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1263");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                                                  35", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1264");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 0, (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                            0.00" + "'", str2, "                            0.00");
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1265");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                                 -1", false);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1266");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt(100, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       100" + "'", str2, "       100");
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1267");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt(100.0d, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                              100.00" + "'", str2, "                                                                                              100.00");
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1268");
        net.ajaskey.common.Utils.makeDir("                               1.00");
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1269");
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
        java.lang.Class<?> wildcardClass12 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1270");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("                                                   1", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:                                                    1 (The system cannot find the file specified)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1271");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (byte) 1, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1272");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt(100.0d, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100.00" + "'", str2, "100.00");
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1273");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (byte) -1, 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Invalid fmt" + "'", str2, "Invalid fmt");
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1274");
        net.ajaskey.common.Utils.makeDirs("                                                                                               32.00");
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1275");
        net.ajaskey.common.Utils.makeDirs("                                                   1");
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1276");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (short) 100, (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100.00" + "'", str2, "100.00");
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1277");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt(0.0d, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Invalid fmt" + "'", str2, "Invalid fmt");
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1278");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt(100L, 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                 100" + "'", str2, "                                                                                                 100");
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1279");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) '4', 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "     52.00" + "'", str2, "     52.00");
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1280");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("     52.00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1281");
        net.ajaskey.common.Utils.makeDirs("                                                                                               97");
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1282");
        net.ajaskey.common.Utils.makeDirs("     35.00");
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1283");
        net.ajaskey.common.Utils.makeDirs("32.00");
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1284");
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
        java.lang.Class<?> wildcardClass15 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1285");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                                                                                               -1.00", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1286");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                                                                                               52.00", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1287");
        net.ajaskey.common.Utils.TAB = "                                                                                               -1";
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1288");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt(100, (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                 100" + "'", str2, "                                                 100");
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1289");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("-1", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1290");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                                                1.00", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1291");
        net.ajaskey.common.Utils.makeDirs("                                                                                             0.00");
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1292");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) ' ', (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        32" + "'", str2, "        32");
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1293");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (short) 0, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1294");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) 10, (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                  10" + "'", str2, "                                                  10");
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1295");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) '4', (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "52.00" + "'", str2, "52.00");
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1296");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (short) 0, (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                               0" + "'", str2, "                               0");
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1297");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt(10.0d, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10.00" + "'", str2, "10.00");
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1298");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (short) 10, 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                               10.00" + "'", str2, "                                                                                               10.00");
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1299");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt(100.0d, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100.00" + "'", str2, "100.00");
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1300");
        net.ajaskey.common.Utils.makeDir("                                                                                                1");
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1301");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("     -1.00", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1302");
        net.ajaskey.common.Utils.makeDirs("                                                                                               10");
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1303");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) 1, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1304");
        net.ajaskey.common.TextUtils.printline("                                                                                             1.00");
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1305");
        net.ajaskey.common.Utils.makeDir("                                                                                                  32");
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1306");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) '#', (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        35" + "'", str2, "        35");
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1307");
        net.ajaskey.common.TextUtils.printline("                                  1");
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1308");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (short) 10, 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10.00" + "'", str2, "10.00");
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1309");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 100, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Invalid fmt" + "'", str2, "Invalid fmt");
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1310");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("                                                                                               32.00", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:                                                                                                32.00 (Access is denied)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1311");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (short) 0, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0.00" + "'", str2, "0.00");
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1312");
        net.ajaskey.common.Utils.TAB = "                              97";
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1313");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (short) -1, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Invalid fmt" + "'", str2, "Invalid fmt");
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1314");
        java.lang.String[] strArray11 = new java.lang.String[] { "10", "                                                                                                 100", "52.00", "                                                                                                 100", "0.00", "32", "97", "        32", "Invalid fmt", "1", "97" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        net.ajaskey.common.TextUtils.print((java.util.List<java.lang.String>) strList12);
        net.ajaskey.common.TextUtils.print((java.util.List<java.lang.String>) strList12);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1315");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("97", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: 97 (Access is denied)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1316");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (short) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1317");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) ' ', 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                  32" + "'", str2, "                                                                                                  32");
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1318");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("97.00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1319");
        java.lang.String[] strArray8 = new java.lang.String[] { "         0", "0.00", "hi!", "hi!", "hi!", "-1.00" };
        java.util.List<java.io.File> fileList9 = net.ajaskey.common.Utils.getDirTree("", strArray8);
        java.util.List<java.io.File> fileList10 = net.ajaskey.common.Utils.getDir("        52", strArray8);
        java.lang.Class<?> wildcardClass11 = strArray8.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNull(fileList9);
        org.junit.Assert.assertNull(fileList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1320");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 1.0f, 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Invalid fmt" + "'", str2, "Invalid fmt");
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1321");
        net.ajaskey.common.Utils.makeDirs("        35");
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1322");
        net.ajaskey.common.TextUtils.printline("                                                1.00");
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1323");
        net.ajaskey.common.Utils.makeDirs("                                                                                               52.00");
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1324");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 10.0f, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "     10.00" + "'", str2, "     10.00");
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1325");
        net.ajaskey.common.Utils.makeDirs("        52");
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1326");
        net.ajaskey.common.Utils.makeDirs("                           -1.00");
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1327");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("52.00", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1328");
        net.ajaskey.common.TextUtils.printline("                                                                                           100.00");
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1329");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (short) -1, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                  -1" + "'", str2, "                                                                                                  -1");
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1330");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (byte) -1, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1" + "'", str2, "-1");
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1331");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (short) 0, 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1332");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (short) 100, 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                 100" + "'", str2, "                                                                                                 100");
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1333");
        net.ajaskey.common.TextUtils.printline("35");
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1334");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt(10, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                  10" + "'", str2, "                                                                                                  10");
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1335");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt(10L, 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10" + "'", str2, "10");
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1336");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 100.0f, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    100.00" + "'", str2, "    100.00");
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1337");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                           -1.00", false);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1338");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (byte) 1, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1339");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                                                                                               10.00", false);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1340");
        net.ajaskey.common.Utils.TAB = "                                                                                               35.00";
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1341");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) ' ', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1342");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (short) 0, 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "      0.00" + "'", str2, "      0.00");
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1343");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("                               1", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:                                1 (Access is denied)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1344");
        java.lang.String[] strArray1 = null;
        java.util.List<java.io.File> fileList2 = net.ajaskey.common.Utils.getDir("                                                   1", strArray1);
        org.junit.Assert.assertNull(fileList2);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1345");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("                               1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1346");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("                             100");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1347");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 1, 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Invalid fmt" + "'", str2, "Invalid fmt");
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1348");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt(1.0d, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1.00" + "'", str2, "1.00");
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1349");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (byte) -1, 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1.00" + "'", str2, "-1.00");
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1350");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (-1), (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                               -1" + "'", str2, "                                                                                               -1");
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1351");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("         1", false);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1352");
        net.ajaskey.common.TextUtils.printline("     10.00");
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1353");
        net.ajaskey.common.Utils.makeDirs("35");
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1354");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (byte) 100, (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100" + "'", str2, "100");
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1355");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                                                                                               35.00", false);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1356");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("                              35", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:                               35 (Access is denied)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1357");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("                                                                                                1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1358");
        net.ajaskey.common.TextUtils.printline("                                                                                               32.00");
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1359");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 10.0f, (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                               10.00" + "'", str2, "                                               10.00");
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1360");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (short) 10, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10.00" + "'", str2, "10.00");
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1361");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt(10.0d, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                               10.00" + "'", str2, "                                                                                               10.00");
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1362");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (byte) 1, 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1.00" + "'", str2, "1.00");
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1363");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("97.00", false);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1364");
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
        java.lang.String str13 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.Class<?> wildcardClass14 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1365");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.ifmt(0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1366");
        net.ajaskey.common.TextUtils.printline("                           10.00");
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1367");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 'a', (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                           97.00" + "'", str2, "                           97.00");
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1368");
        net.ajaskey.common.Utils.TAB = "                                                                                                  10";
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1369");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                             100", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1370");
        net.ajaskey.common.Utils.NL = "32.00";
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1371");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("                             100.00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1372");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt(10.0d, (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                           10.00" + "'", str2, "                           10.00");
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1373");
        net.ajaskey.common.TextUtils.printline("                               1.00");
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1374");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("     52.00", false);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1375");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 10, 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Invalid fmt" + "'", str2, "Invalid fmt");
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1376");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("     -1.00", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:      -1.00 (Access is denied)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1377");
        net.ajaskey.common.TextUtils.printline("                                                                                                  32");
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1378");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("35", false);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1379");
        net.ajaskey.common.Utils.makeDirs("97.00");
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1380");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.lfmt(10L, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1381");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1382");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (byte) 10, (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                              10" + "'", str2, "                              10");
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1383");
        net.ajaskey.common.Utils.makeDir("97.00");
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1384");
        net.ajaskey.common.Utils.NL = "        32";
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1385");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                              35", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1386");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("100.00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1387");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (-1.0f), (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1.00" + "'", str2, "-1.00");
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1388");
        net.ajaskey.common.Utils.NL = "                                                                                               32.00";
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1389");
        net.ajaskey.common.Utils.makeDir("                              52");
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1390");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("                                                                                                  35", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:                                                                                                   35 (Access is denied)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1391");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("100", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1392");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", false);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.Class<?> wildcardClass7 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1393");
        net.ajaskey.common.TextUtils.printline("                                                                                               35.00");
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1394");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                                                                                                  52", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1395");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) 'a', (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        97" + "'", str2, "        97");
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1396");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.ifmt(100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1397");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) 100, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       100" + "'", str2, "       100");
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1398");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (byte) 0, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Invalid fmt" + "'", str2, "Invalid fmt");
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1399");
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
        java.lang.Class<?> wildcardClass14 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1400");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", false);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str4 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.Class<?> wildcardClass6 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1401");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (byte) 1, 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "      1.00" + "'", str2, "      1.00");
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1402");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt(100, (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                             100" + "'", str2, "                             100");
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1403");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (short) 1, 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "      1.00" + "'", str2, "      1.00");
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1404");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (byte) 0, (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1405");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1406");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("                            0.00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1407");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("52", false);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1408");
        net.ajaskey.common.Utils.TAB = "     35.00";
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1409");
        net.ajaskey.common.Utils.makeDirs("     52.00");
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1410");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                                                   1", false);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1411");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", false);
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
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1412");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 100, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                              100.00" + "'", str2, "                                                                                              100.00");
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1413");
        net.ajaskey.common.Utils.NL = "97.00";
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1414");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (byte) 1, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1415");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (byte) 1, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1416");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (short) 0, (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                0" + "'", str2, "                                                                                                0");
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1417");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", true);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str5 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str6 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str7 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.Class<?> wildcardClass8 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1418");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt(1L, 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                   1" + "'", str2, "                                                                                                   1");
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1419");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt(10.0d, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Invalid fmt" + "'", str2, "Invalid fmt");
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1420");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 'a', (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "97.00" + "'", str2, "97.00");
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1421");
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
        java.lang.String str12 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.Class<?> wildcardClass13 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1422");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (-1L), (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "     -1.00" + "'", str2, "     -1.00");
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1423");
        net.ajaskey.common.Utils.makeDir("        52");
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1424");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("                                                                                               32.00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1425");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt(100L, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100" + "'", str2, "100");
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1426");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("                                                                                               35.00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1427");
        net.ajaskey.common.Utils.TAB = "                           97.00";
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1428");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("32.00", false);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1429");
        net.ajaskey.common.TextUtils.printline("        35");
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1430");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (short) -1, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        -1" + "'", str2, "        -1");
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1431");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (byte) 0, (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                   0" + "'", str2, "                                                   0");
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1432");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) '4', (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "52" + "'", str2, "52");
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1433");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) '4', 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                  52" + "'", str2, "                                                                                                  52");
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1434");
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
        java.lang.Class<?> wildcardClass12 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1435");
        net.ajaskey.common.Utils.NL = "                                                                                             0.00";
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1436");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("         1", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1437");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (short) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1438");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) '#', 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "     35.00" + "'", str2, "     35.00");
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1439");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("                                                   1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1440");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt(0L, 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         0" + "'", str2, "         0");
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1441");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt(10.0d, (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                               10.00" + "'", str2, "                                               10.00");
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1442");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (-1L), (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1.00" + "'", str2, "-1.00");
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1443");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) 1, 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         1" + "'", str2, "         1");
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1444");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (byte) -1, (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                           -1.00" + "'", str2, "                           -1.00");
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1445");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) 'a', (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                  97" + "'", str2, "                                                  97");
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1446");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 'a', (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                               97.00" + "'", str2, "                                                                                               97.00");
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1447");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("     35.00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1448");
        net.ajaskey.common.Utils.TAB = "                                 -1";
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1449");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("Invalid fmt", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1450");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (-1L), (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1.00" + "'", str2, "-1.00");
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1451");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 10L, 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Invalid fmt" + "'", str2, "Invalid fmt");
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1452");
        net.ajaskey.common.Utils.makeDir("        32");
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1453");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 0, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                0.00" + "'", str2, "                                                                                                0.00");
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1454");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt(0L, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1455");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (byte) 1, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         1" + "'", str2, "         1");
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1456");
        net.ajaskey.common.Utils.makeDir("                                                  97");
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1457");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) 10, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                  10" + "'", str2, "                                                                                                  10");
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1458");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 10, 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                               10.00" + "'", str2, "                                                                                               10.00");
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1459");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("52");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1460");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (short) 100, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                 100" + "'", str2, "                                                                                                 100");
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1461");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) ' ', (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Invalid fmt" + "'", str2, "Invalid fmt");
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1462");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (short) 100, 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       100" + "'", str2, "       100");
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1463");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (short) 10, (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                              10" + "'", str2, "                              10");
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1464");
        net.ajaskey.common.Utils.makeDir("     -1.00");
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1465");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt(1.0d, (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                            1.00" + "'", str2, "                            1.00");
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1466");
        net.ajaskey.common.Utils.NL = "       100";
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1467");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) ' ', (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "     32.00" + "'", str2, "     32.00");
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1468");
        net.ajaskey.common.Utils.makeDir("                                 97");
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1469");
        net.ajaskey.common.Utils.TAB = "                              35";
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1470");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("        35", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1471");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("        35", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:         35 (Access is denied)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1472");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (-1), (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Invalid fmt" + "'", str2, "Invalid fmt");
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1473");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt(0L, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1474");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1475");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                                                                                               -1", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1476");
        net.ajaskey.common.Utils.NL = "Invalid fmt";
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1477");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 1, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Invalid fmt" + "'", str2, "Invalid fmt");
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1478");
        net.ajaskey.common.Utils.NL = "52";
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1479");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("     32.00", true);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1480");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (short) 0, (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                0.00" + "'", str2, "                                                0.00");
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1481");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (-1L), (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                               -1.00" + "'", str2, "                                                                                               -1.00");
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1482");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt(100L, 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100" + "'", str2, "100");
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1483");
        net.ajaskey.common.TextUtils.printline("                                                  97");
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1484");
        net.ajaskey.common.TextUtils.printline("97.00");
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1485");
        java.lang.String[] strArray5 = new java.lang.String[] { "                                                   1", "                           -1.00", "                                                                                               35.00", "                               0" };
        java.util.List<java.io.File> fileList6 = net.ajaskey.common.Utils.getDirTree("                           97.00", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNull(fileList6);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1486");
        net.ajaskey.common.Utils.TAB = "                               1";
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1487");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                                                                                                 100", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1488");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt(1, (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                1" + "'", str2, "                                                                                                1");
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1489");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1490");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", true);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str5 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str6 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.Class<?> wildcardClass9 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1491");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("97.00", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: 97.00 (Access is denied)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1492");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("                              -1", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:                               -1 (Access is denied)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1493");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", false);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str4 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str5 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str6 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str8 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.Class<?> wildcardClass9 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1494");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 1.0f, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Invalid fmt" + "'", str2, "Invalid fmt");
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1495");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (short) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1496");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (short) 10, 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10" + "'", str2, "10");
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1497");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (byte) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1498");
        net.ajaskey.common.Utils.makeDir("                              -1");
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1499");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                                                                                               97", false);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests2.test1500");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (short) 0, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }
}
