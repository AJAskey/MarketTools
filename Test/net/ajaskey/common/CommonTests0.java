package net.ajaskey.common;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CommonTests0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0001");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile(file0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0002");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("hi!", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (Access is denied)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0003");
        java.lang.String str0 = net.ajaskey.common.Utils.TAB;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "\t" + "'", str0, "\t");
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0004");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile(file0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0005");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) 100, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100" + "'", str2, "100");
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0006");
        net.ajaskey.common.Utils.makeDir("");
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0007");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = net.ajaskey.common.Utils.getFileBaseName(file0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0008");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("", false);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0009");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (byte) -1, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Invalid fmt" + "'", str2, "Invalid fmt");
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0010");
        java.lang.String str0 = net.ajaskey.common.Utils.NL;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "\r\n" + "'", str0, "\r\n");
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0011");
        net.ajaskey.common.TextUtils.printline("Invalid fmt");
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0012");
        java.text.DecimalFormatSymbols decimalFormatSymbols0 = net.ajaskey.common.Utils.decimalFormatSymbols;
        net.ajaskey.common.Utils.decimalFormatSymbols = decimalFormatSymbols0;
        java.lang.Class<?> wildcardClass2 = decimalFormatSymbols0.getClass();
        org.junit.Assert.assertNotNull(decimalFormatSymbols0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0013");
        net.ajaskey.common.Utils.TAB = "100";
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0014");
        net.ajaskey.common.DateTime dateTime0 = null;
        net.ajaskey.common.DateTime dateTime1 = null;
        boolean boolean2 = net.ajaskey.common.Utils.sameMonth(dateTime0, dateTime1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0015");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (byte) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0016");
        java.lang.String[] strArray1 = null;
        java.util.List<java.io.File> fileList2 = net.ajaskey.common.Utils.getDir("hi!", strArray1);
        org.junit.Assert.assertNull(fileList2);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0017");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = net.ajaskey.common.Utils.getFileExt(file0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0018");
        net.ajaskey.common.Utils.NL = "Invalid fmt";
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0019");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("\r\n", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ?? (The filename, directory name, or volume label syntax is incorrect)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0020");
        net.ajaskey.common.TextUtils.printline("\r\n");
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0021");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile(file0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0022");
        net.ajaskey.common.Utils.sleep((int) (short) -1);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0023");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", true);
        java.lang.Class<?> wildcardClass3 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0024");
        net.ajaskey.common.Utils.TAB = "\r\n";
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0025");
        net.ajaskey.common.Utils.TAB = "Invalid fmt";
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0026");
        java.text.DecimalFormat decimalFormat0 = null;
        net.ajaskey.common.Utils.df = decimalFormat0;
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0027");
        net.ajaskey.common.DateTime dateTime0 = null;
        net.ajaskey.common.DateTime dateTime1 = null;
        boolean boolean2 = net.ajaskey.common.Utils.sameDate(dateTime0, dateTime1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0028");
        net.ajaskey.common.Utils.TAB = "hi!";
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0029");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((-1), (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                  -1" + "'", str2, "                                                                                                  -1");
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0030");
        java.text.DecimalFormat decimalFormat0 = net.ajaskey.common.Utils.df;
        org.junit.Assert.assertNull(decimalFormat0);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0031");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0032");
        net.ajaskey.common.TextUtils.printline("\t");
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0033");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("100", false);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0034");
        net.ajaskey.common.TextUtils.printline("                                                                                                  -1");
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0035");
        net.ajaskey.common.TextUtils.printline("hi!");
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0036");
        net.ajaskey.common.Utils.NL = "\t";
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0037");
        net.ajaskey.common.Utils.sleep(100);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0038");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0039");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 0.0f, 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Invalid fmt" + "'", str2, "Invalid fmt");
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0040");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("\tInvalid fmt", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ?Invalid fmt (The filename, directory name, or volume label syntax is incorrect)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0041");
        net.ajaskey.common.Utils.TAB = "\t";
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0042");
        net.ajaskey.common.Utils.NL = "                                                                                                  -1";
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0043");
        net.ajaskey.common.Utils.sleep((int) (short) 0);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0044");
        net.ajaskey.common.Utils.NL = "hi!";
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0045");
        net.ajaskey.common.Utils.sleep((int) (byte) 100);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0046");
        net.ajaskey.common.Utils.makeDir("hi!");
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0047");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt(10, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        10" + "'", str2, "        10");
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0048");
        java.lang.String[] strArray6 = new java.lang.String[] { "100", "100", "hi!", "100", "" };
        java.util.List<java.io.File> fileList7 = net.ajaskey.common.Utils.getDir("", strArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = fileList7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNull(fileList7);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0049");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((-1.0d), (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1.00" + "'", str2, "-1.00");
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0050");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0051");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 10, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                               10.00" + "'", str2, "                                                                                               10.00");
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0052");
        net.ajaskey.common.TextUtils.printline("        10");
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0053");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt(1, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         1" + "'", str2, "         1");
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0054");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (short) -1, 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "     -1.00" + "'", str2, "     -1.00");
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0055");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (short) 10, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                  10" + "'", str2, "                                                                                                  10");
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0056");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("         1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0057");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) '#', (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "35" + "'", str2, "35");
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0058");
        java.util.Map<java.lang.String, java.lang.Integer> strMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.findName(strMap0, (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0059");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 10, 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "     10.00" + "'", str2, "     10.00");
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0060");
        net.ajaskey.common.Utils.NL = "35";
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0061");
        java.text.SimpleDateFormat simpleDateFormat0 = net.ajaskey.common.Utils.sdf;
        java.lang.Class<?> wildcardClass1 = simpleDateFormat0.getClass();
        org.junit.Assert.assertNotNull(simpleDateFormat0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0062");
        java.util.Map<java.lang.String, java.lang.Integer> strMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.findName(strMap0, (java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0063");
        net.ajaskey.common.Utils.makeDir("                                                                                                  10");
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0064");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((-1.0d), (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1.00" + "'", str2, "-1.00");
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0065");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                                                                                               10.00", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0066");
        java.util.Map<java.lang.String, java.lang.Integer> strMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.findName(strMap0, (java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0067");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (byte) 0, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0068");
        net.ajaskey.common.Utils.sleep(10);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0069");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("-1.00", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0070");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile(file0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0071");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("     -1.00hi!hi!\r\nhi!                                                                                                  10hi!                                                                                                  10hi!", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0072");
        java.util.Map<java.lang.String, java.lang.Integer> strMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.findName(strMap0, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0073");
        net.ajaskey.common.TextUtils.printline("     10.00");
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0074");
        net.ajaskey.common.Utils utils0 = new net.ajaskey.common.Utils();
        java.lang.Class<?> wildcardClass1 = utils0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0075");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("\t", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ? (The filename, directory name, or volume label syntax is incorrect)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0076");
        net.ajaskey.common.Utils.makeDir("-1.00");
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0077");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0078");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("                                                                                                  10", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:                                                                                                   10 (Access is denied)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0079");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (byte) 0, (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                               0" + "'", str2, "                               0");
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0080");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) ' ', (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "32" + "'", str2, "32");
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0081");
        net.ajaskey.common.Utils.sleep((int) (byte) -1);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0082");
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
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0083");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) ' ', (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        32" + "'", str2, "        32");
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0084");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("\t35");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0085");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("                                                                                                  -1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0086");
        java.lang.String[] strArray5 = new java.lang.String[] { "     -1.00", "", "\r\n", "                                                                                                  10", "                                                                                                  10" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.lang.String str8 = net.ajaskey.common.TextUtils.toString((java.util.List<java.lang.String>) strList6);
        java.lang.Class<?> wildcardClass9 = strList6.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "     -1.003535\r\n35                                                                                                  1035                                                                                                  1035" + "'", str8, "     -1.003535\r\n35                                                                                                  1035                                                                                                  1035");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0087");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (byte) 100, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100" + "'", str2, "100");
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0088");
        net.ajaskey.common.Utils.sleep((int) (byte) 0);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0089");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("         1", false);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0090");
        net.ajaskey.common.TextUtils.printline("35");
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0091");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", true);
        java.lang.String str3 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.Class<?> wildcardClass4 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0092");
        net.ajaskey.common.Utils.sleep((int) (byte) 1);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0093");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("        10", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:         10 (Access is denied)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0094");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("32", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: 32 (Access is denied)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0095");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (byte) 0, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         0" + "'", str2, "         0");
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0096");
        net.ajaskey.common.Utils.NL = "";
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0097");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (byte) 0, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                   0" + "'", str2, "                                                                                                   0");
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0098");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (byte) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0099");
        net.ajaskey.common.Utils.NL = "        10";
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0100");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (byte) 0, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0101");
        net.ajaskey.common.Utils.NL = "\t        10";
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0102");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) 'a', 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                  97" + "'", str2, "                                                                                                  97");
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0103");
        net.ajaskey.common.Utils.NL = "0";
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0104");
        java.lang.String[] strArray1 = new java.lang.String[] { "\t" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str4 = net.ajaskey.common.TextUtils.toString((java.util.List<java.lang.String>) strList2);
        java.lang.Class<?> wildcardClass5 = strList2.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t0" + "'", str4, "\t0");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0105");
        net.ajaskey.common.Utils.NL = "\tInvalid fmt";
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0106");
        net.ajaskey.common.Utils.sleep((int) ' ');
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0107");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("        32", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:         32 (Access is denied)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0108");
        net.ajaskey.common.Utils.NL = "                                                                                                  97";
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0109");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("\t35", false);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0110");
        net.ajaskey.common.TextUtils.printline("     -1.00hi!hi!\r\nhi!                                                                                                  10hi!                                                                                                  10hi!");
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0111");
        net.ajaskey.common.Utils.sleep(1);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0112");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) 'a', 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "97" + "'", str2, "97");
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0113");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0114");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", true);
        java.lang.String str3 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str4 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.Class<?> wildcardClass5 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0115");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("     -1.003535\r\n35                                                                                                  1035                                                                                                  1035", false);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0116");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0117");
        net.ajaskey.common.Utils.sleep((int) (short) 100);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0118");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("         0", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0119");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (byte) 10, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10.00" + "'", str2, "10.00");
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0120");
        net.ajaskey.common.Utils.TAB = "";
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0121");
        net.ajaskey.common.Utils.TAB = "                               0";
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0122");
        net.ajaskey.common.Utils.sleep(0);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0123");
        net.ajaskey.common.Utils.makeDir("\t");
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0124");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("     -1.00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0125");
        net.ajaskey.common.Utils.NL = "                                                                                               10.00";
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0126");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) ' ', (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                               32.00" + "'", str2, "                                                                                               32.00");
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0127");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("        32", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0128");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt(0.0d, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0.00" + "'", str2, "0.00");
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0129");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (-1.0f), (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1.00" + "'", str2, "-1.00");
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0130");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt(10, (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                  10" + "'", str2, "                                                  10");
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0131");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("0", false);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0132");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (short) 1, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0133");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                                                                                                  97", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0134");
        net.ajaskey.common.Utils.sleep((int) '#');
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0135");
        net.ajaskey.common.Utils.TAB = "                                                                                                   0";
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0136");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  (Result too large)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0137");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) '4', 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        52" + "'", str2, "        52");
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0138");
        net.ajaskey.common.Utils.TAB = "     10.00";
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0139");
        net.ajaskey.common.Utils.TAB = "     -1.00";
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0140");
        java.lang.String[] strArray1 = null;
        java.util.List<java.io.File> fileList2 = net.ajaskey.common.Utils.getDir("35", strArray1);
        org.junit.Assert.assertNull(fileList2);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0141");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("     -1.00hi!hi!\r\nhi!                                                                                                  10hi!                                                                                                  10hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0142");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", true);
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
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0143");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (short) 0, (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0.00" + "'", str2, "0.00");
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0144");
        java.util.Map<java.lang.String, java.lang.Integer> strMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.findName(strMap0, (java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0145");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("                                                                                                  97", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:                                                                                                   97 (Access is denied)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0146");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (short) 1, (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                1" + "'", str2, "                                                                                                1");
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0147");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                               0", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0148");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) '4', (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "52.00" + "'", str2, "52.00");
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0149");
        net.ajaskey.common.Utils.makeDir("\t0");
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0150");
        net.ajaskey.common.Utils.TAB = "                                                                                                  97";
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0151");
        net.ajaskey.common.TextUtils.printline("                                                                                               10.00");
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0152");
        net.ajaskey.common.TextUtils.printline("                               0");
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0153");
        net.ajaskey.common.Utils.NL = "97";
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0154");
        net.ajaskey.common.Utils.TAB = "                                                                                               10.00";
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0155");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (byte) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0156");
        net.ajaskey.common.Utils.makeDir("10.00");
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0157");
        net.ajaskey.common.Utils.NL = "         1";
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0158");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt(0, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         0" + "'", str2, "         0");
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0159");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 100.0f, 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Invalid fmt" + "'", str2, "Invalid fmt");
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0160");
        net.ajaskey.common.Utils.NL = "        52";
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0161");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("97", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0162");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("10.00", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: 10.00 (Access is denied)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0163");
        net.ajaskey.common.TextUtils.printline("                                                  10");
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0164");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("                                                                                               10.00", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:                                                                                                10.00 (Access is denied)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0165");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (short) 10, (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                              10.00" + "'", str2, "                              10.00");
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0166");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", true);
        java.lang.String str3 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str4 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str5 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.Class<?> wildcardClass6 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0167");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0168");
        net.ajaskey.common.Utils.makeDir("52.00");
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0169");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("                              10.00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0170");
        net.ajaskey.common.Utils.TAB = "\t        10";
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0171");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (short) 0, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Invalid fmt" + "'", str2, "Invalid fmt");
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0172");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", true);
        java.lang.String str3 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.Class<?> wildcardClass5 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0173");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("52.00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0174");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt(10L, 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10" + "'", str2, "10");
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0175");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt(0.0d, (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                            0.00" + "'", str2, "                            0.00");
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0176");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("                               0", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:                                0 (Access is denied)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0177");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("Invalid fmt");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0178");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0179");
        java.lang.String[] strArray12 = new java.lang.String[] { "100", "100", "hi!", "100", "" };
        java.util.List<java.io.File> fileList13 = net.ajaskey.common.Utils.getDir("", strArray12);
        java.util.List<java.io.File> fileList14 = net.ajaskey.common.Utils.getDir("\r\n", strArray12);
        java.util.List<java.io.File> fileList15 = net.ajaskey.common.Utils.getDirTree("\r\n", strArray12);
        java.util.List<java.io.File> fileList16 = net.ajaskey.common.Utils.getDir("", strArray12);
        java.util.List<java.io.File> fileList17 = net.ajaskey.common.Utils.getDir("     -1.00                                                                                                  97                                                                                                  97\r\n                                                                                                  97                                                                                                  10                                                                                                  97                                                                                                  10                                                                                                  97", strArray12);
        java.util.List<java.io.File> fileList18 = net.ajaskey.common.Utils.getDirTree("", strArray12);
        java.util.List<java.io.File> fileList19 = net.ajaskey.common.Utils.getDir("     -1.003535\r\n35                                                                                                  1035                                                                                                  1035", strArray12);
        java.lang.Class<?> wildcardClass20 = strArray12.getClass();
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNull(fileList13);
        org.junit.Assert.assertNull(fileList14);
        org.junit.Assert.assertNull(fileList15);
        org.junit.Assert.assertNull(fileList16);
        org.junit.Assert.assertNull(fileList17);
        org.junit.Assert.assertNull(fileList18);
        org.junit.Assert.assertNull(fileList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0180");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                               0", false);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0181");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (byte) 0, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0182");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0183");
        net.ajaskey.common.Utils.makeDir("     -1.00                                                                                               10.00                                                                                               10.00\r\n                                                                                               10.00                                                                                                  10                                                                                               10.00                                                                                                  10                                                                                               10.00");
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0184");
        java.lang.String[] strArray5 = new java.lang.String[] { "     -1.00", "", "\r\n", "                                                                                                  10", "                                                                                                  10" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.lang.String str8 = net.ajaskey.common.TextUtils.toString((java.util.List<java.lang.String>) strList6);
        java.lang.String str9 = net.ajaskey.common.TextUtils.toString((java.util.List<java.lang.String>) strList6);
        net.ajaskey.common.TextUtils.print((java.util.List<java.lang.String>) strList6);
        java.lang.Class<?> wildcardClass11 = strList6.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "     -1.00        52        52\r\n        52                                                                                                  10        52                                                                                                  10        52" + "'", str8, "     -1.00        52        52\r\n        52                                                                                                  10        52                                                                                                  10        52");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "     -1.00        52        52\r\n        52                                                                                                  10        52                                                                                                  10        52" + "'", str9, "     -1.00        52        52\r\n        52                                                                                                  10        52                                                                                                  10        52");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0185");
        net.ajaskey.common.Utils.NL = "     -1.00                                                                                               10.00                                                                                               10.00\r\n                                                                                               10.00                                                                                                  10                                                                                               10.00                                                                                                  10                                                                                               10.00";
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0186");
        net.ajaskey.common.Utils.sleep((int) '4');
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0187");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt(10, 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                  10" + "'", str2, "                                                                                                  10");
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0188");
        net.ajaskey.common.TextUtils.printline("                                                                                                  97");
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0189");
        net.ajaskey.common.Utils.makeDir("                            0.00");
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0190");
        net.ajaskey.common.Utils.TAB = "                                                                                                  10";
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0191");
        net.ajaskey.common.Utils.sleep((int) (byte) 10);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0192");
        net.ajaskey.common.Utils.makeDir("\t        10");
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0193");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("\t0", false);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0194");
        net.ajaskey.common.Utils.TAB = "         1";
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0195");
        net.ajaskey.common.Utils.NL = "100";
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0196");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("                                                                                                   0", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:                                                                                                    0 (Access is denied)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0197");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("        52", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:         52 (Access is denied)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0198");
        net.ajaskey.common.Utils.TAB = "        10";
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0199");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (short) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0200");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("\t        10");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0201");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("0.00", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0202");
        net.ajaskey.common.Utils.makeDir("0.00");
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0203");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 'a', (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                               97.00" + "'", str2, "                                                                                               97.00");
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0204");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt(0.0d, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                0.00" + "'", str2, "                                                                                                0.00");
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0205");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("100", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0206");
        net.ajaskey.common.Utils.makeDir("\tInvalid fmt");
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0207");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) '4', (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                  52" + "'", str2, "                                                                                                  52");
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0208");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 'a', (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "97.00" + "'", str2, "97.00");
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0209");
        net.ajaskey.common.TextUtils.printline("\t35");
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0210");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("         0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0211");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("32", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0212");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("1", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0213");
        net.ajaskey.common.Utils.makeDir("                                                                                                  -1");
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0214");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt(1, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                   1" + "'", str2, "                                                                                                   1");
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0215");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (short) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0216");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                                                                                                1", false);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0217");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("\r\n", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0218");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("     -1.00hi!hi!\r\nhi!                                                                                                  10hi!                                                                                                  10hi!", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:      -1.00hi!hi!??hi!                                                                                                  10hi!                                                                                                  10hi! (The filename, directory name, or volume label syntax is incorrect)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0219");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (byte) 1, (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                               1.00" + "'", str2, "                               1.00");
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0220");
        net.ajaskey.common.Utils.TAB = "                                                                                                0.00";
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0221");
        net.ajaskey.common.TextUtils.printline("                                                                                                0.00");
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0222");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 1, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Invalid fmt" + "'", str2, "Invalid fmt");
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0223");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("                            0.00", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:                             0.00 (Access is denied)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0224");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("hi!", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0225");
        net.ajaskey.common.Utils.TAB = "                                                                                                  52";
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0226");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("     10.00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0227");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", true);
        java.lang.String str3 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str4 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str5 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str6 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.Class<?> wildcardClass7 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0228");
        net.ajaskey.common.Utils.TAB = "10.00";
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0229");
        java.lang.String[] strArray1 = null;
        java.util.List<java.io.File> fileList2 = net.ajaskey.common.Utils.getDir("     -1.00", strArray1);
        org.junit.Assert.assertNull(fileList2);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0230");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((-1.0d), 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "     -1.00" + "'", str2, "     -1.00");
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0231");
        java.lang.String[] strArray1 = new java.lang.String[] { "\t" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str4 = net.ajaskey.common.TextUtils.toString((java.util.List<java.lang.String>) strList2);
        net.ajaskey.common.TextUtils.print((java.util.List<java.lang.String>) strList2);
        java.lang.String str6 = net.ajaskey.common.TextUtils.toString((java.util.List<java.lang.String>) strList2);
        java.lang.Class<?> wildcardClass7 = strList2.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t100" + "'", str4, "\t100");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\t100" + "'", str6, "\t100");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0232");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (byte) 10, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                  10" + "'", str2, "                                                                                                  10");
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0233");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0234");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.lfmt(1L, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0235");
        net.ajaskey.common.Utils.sleep((-1));
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0236");
        net.ajaskey.common.Utils.TAB = "        52";
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0237");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (byte) -1, (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                  -1" + "'", str2, "                                                  -1");
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0238");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("35");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0239");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (short) 10, (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10" + "'", str2, "10");
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0240");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 100.0f, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Invalid fmt" + "'", str2, "Invalid fmt");
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0241");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (byte) 100, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100" + "'", str2, "100");
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0242");
        net.ajaskey.common.TextUtils.printline("                                                                                               97.00");
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0243");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("                                                                                                  52", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:                                                                                                   52 (Access is denied)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0244");
        net.ajaskey.common.Utils.makeDir("\t                                                                                               10.00");
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0245");
        net.ajaskey.common.TextUtils.printline("     -1.00                                                                                                  97                                                                                                  97\r\n                                                                                                  97                                                                                                  10                                                                                                  97                                                                                                  10                                                                                                  97");
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0246");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (byte) 0, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0247");
        net.ajaskey.common.Utils.NL = "32";
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0248");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) '#', (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "35" + "'", str2, "35");
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0249");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt(10L, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                  10" + "'", str2, "                                                                                                  10");
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0250");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.common.TextUtils.print((java.util.List<java.lang.String>) strList2);
        net.ajaskey.common.TextUtils.print((java.util.List<java.lang.String>) strList2);
        net.ajaskey.common.TextUtils.print((java.util.List<java.lang.String>) strList2);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0251");
        net.ajaskey.common.Utils.NL = "                                                  -1";
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0252");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.common.TextUtils.print((java.util.List<java.lang.String>) strList2);
        net.ajaskey.common.TextUtils.print((java.util.List<java.lang.String>) strList2);
        java.lang.Class<?> wildcardClass6 = strList2.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0253");
        net.ajaskey.common.Utils.makeDir("32");
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0254");
        net.ajaskey.common.TextUtils.printline("        52");
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0255");
        net.ajaskey.common.Utils.NL = "                            0.00";
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0256");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                                                                                                1", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0257");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (byte) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0258");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("52.00", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0259");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) ' ', 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        32" + "'", str2, "        32");
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0260");
        net.ajaskey.common.TextUtils.printline("10.00");
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0261");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("     -1.003535\r\n35                                                                                                  1035                                                                                                  1035", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:      -1.003535??35                                                                                                  1035                                                                                                  1035 (The filename, directory name, or volume label syntax is incorrect)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0262");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0263");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (byte) 100, (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                              100" + "'", str2, "                                                                                              100");
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0264");
        net.ajaskey.common.Utils.TAB = "10";
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0265");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("                                                                                                0.00", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:                                                                                                 0.00 (Access is denied)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0266");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.lfmt(0L, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0267");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) 100, (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                 100" + "'", str2, "                                                 100");
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0268");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (byte) 10, (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                 10" + "'", str2, "                                 10");
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0269");
        java.lang.String[] strArray10 = new java.lang.String[] { "100", "100", "hi!", "100", "" };
        java.util.List<java.io.File> fileList11 = net.ajaskey.common.Utils.getDir("", strArray10);
        java.util.List<java.io.File> fileList12 = net.ajaskey.common.Utils.getDir("\r\n", strArray10);
        java.util.List<java.io.File> fileList13 = net.ajaskey.common.Utils.getDirTree("", strArray10);
        java.util.List<java.io.File> fileList14 = net.ajaskey.common.Utils.getDir("\t35", strArray10);
        java.util.List<java.io.File> fileList15 = net.ajaskey.common.Utils.getDir("", strArray10);
        java.lang.Class<?> wildcardClass16 = strArray10.getClass();
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNull(fileList11);
        org.junit.Assert.assertNull(fileList12);
        org.junit.Assert.assertNull(fileList13);
        org.junit.Assert.assertNull(fileList14);
        org.junit.Assert.assertNull(fileList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0270");
        net.ajaskey.common.Utils.NL = "52.00";
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0271");
        net.ajaskey.common.TextUtils.printline("\tInvalid fmt");
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0272");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (-1.0f), 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Invalid fmt" + "'", str2, "Invalid fmt");
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0273");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 0L, (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                            0.00" + "'", str2, "                            0.00");
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0274");
        net.ajaskey.common.Utils.sleep((int) 'a');
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0275");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("\t0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0276");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("                                                                                              100", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:                                                                                               100 (Access is denied)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0277");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                                                                                                   1", false);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0278");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("                                                                                                  -1", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:                                                                                                   -1 (Access is denied)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0279");
        net.ajaskey.common.Utils.TAB = "                                                                                                  -1";
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0280");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) ' ', (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Invalid fmt" + "'", str2, "Invalid fmt");
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0281");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                                                  -1", false);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0282");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                                                                                              100", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0283");
        net.ajaskey.common.Utils.NL = "10";
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0284");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((-1), (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1" + "'", str2, "-1");
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0285");
        net.ajaskey.common.Utils.NL = "\t100";
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0286");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("                                                                                                0.00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0287");
        java.lang.String[] strArray9 = new java.lang.String[] { "100", "100", "hi!", "100", "" };
        java.util.List<java.io.File> fileList10 = net.ajaskey.common.Utils.getDir("", strArray9);
        java.util.List<java.io.File> fileList11 = net.ajaskey.common.Utils.getDir("\r\n", strArray9);
        java.util.List<java.io.File> fileList12 = net.ajaskey.common.Utils.getDirTree("", strArray9);
        java.util.List<java.io.File> fileList13 = net.ajaskey.common.Utils.getDir("     -1.00                                                                                               10.00                                                                                               10.00\r\n                                                                                               10.00                                                                                                  10                                                                                               10.00                                                                                                  10                                                                                               10.00", strArray9);
        java.lang.Class<?> wildcardClass14 = strArray9.getClass();
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNull(fileList10);
        org.junit.Assert.assertNull(fileList11);
        org.junit.Assert.assertNull(fileList12);
        org.junit.Assert.assertNull(fileList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0288");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (short) 10, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10" + "'", str2, "10");
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0289");
        net.ajaskey.common.Utils.TAB = "35";
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0290");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((-1.0d), (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                               -1.00" + "'", str2, "                                               -1.00");
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0291");
        net.ajaskey.common.Utils.NL = "-1";
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0292");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                                                  10", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0293");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("0.00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0294");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) '4', (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                               52.00" + "'", str2, "                                                                                               52.00");
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0295");
        net.ajaskey.common.Utils.makeDir("                              10.00");
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0296");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt(0, (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                               0" + "'", str2, "                               0");
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0297");
        net.ajaskey.common.Utils.makeDir("100");
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0298");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) ' ', (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "32" + "'", str2, "32");
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0299");
        net.ajaskey.common.Utils.sleep((int) (short) 1);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0300");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) 100, 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100" + "'", str2, "100");
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0301");
        net.ajaskey.common.Utils.TAB = "        32";
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0302");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (byte) 1, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0303");
        net.ajaskey.common.Utils.NL = "                                                                                                   1";
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0304");
        net.ajaskey.common.TextUtils.printline("                                                  -1");
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0305");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("                                                                                               10.0052.00hi!52.00                                                                                                   152.003552.00                                                                                                   152.00", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:                                                                                                10.0052.00hi!52.00                                                                                                   152.003552.00                                                                                                   152.00 (The filename, directory name, or volume label syntax is incorrect)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0306");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.common.TextUtils.print((java.util.List<java.lang.String>) strList2);
        java.lang.Class<?> wildcardClass5 = strList2.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0307");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("                                                  -1", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:                                                   -1 (Access is denied)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0308");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt(0, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         0" + "'", str2, "         0");
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0309");
        net.ajaskey.common.Utils.TAB = "     -1.00                            0.00                            0.00\r\n                            0.00                                                                                                  10                            0.00                                                                                                  10                            0.00";
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0310");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("10", false);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0311");
        net.ajaskey.common.Utils.TAB = "                                 10";
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0312");
        net.ajaskey.common.Utils.TAB = "97";
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0313");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        net.ajaskey.common.TextUtils.print((java.util.List<java.lang.String>) strList2);
        java.lang.String str5 = net.ajaskey.common.TextUtils.toString((java.util.List<java.lang.String>) strList2);
        java.lang.Class<?> wildcardClass6 = strList2.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                                                                                                   1" + "'", str5, "                                                                                                   1");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0314");
        java.lang.String[] strArray5 = new java.lang.String[] { "                                                                                               10.00", "hi!", "                                                                                                   1", "35", "                                                                                                   1" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.lang.String str8 = net.ajaskey.common.TextUtils.toString((java.util.List<java.lang.String>) strList6);
        java.lang.Class<?> wildcardClass9 = strList6.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "                                                                                               10.00                                                                                                   1hi!                                                                                                   1                                                                                                   1                                                                                                   135                                                                                                   1                                                                                                   1                                                                                                   1" + "'", str8, "                                                                                               10.00                                                                                                   1hi!                                                                                                   1                                                                                                   1                                                                                                   135                                                                                                   1                                                                                                   1                                                                                                   1");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0315");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("                                                                                                   1", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:                                                                                                    1 (Access is denied)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0316");
        net.ajaskey.common.Utils.NL = "         0";
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0317");
        java.lang.String[] strArray5 = new java.lang.String[] { "     -1.00", "", "\r\n", "                                                                                                  10", "                                                                                                  10" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.lang.String str8 = net.ajaskey.common.TextUtils.toString((java.util.List<java.lang.String>) strList6);
        net.ajaskey.common.TextUtils.print((java.util.List<java.lang.String>) strList6);
        java.lang.String str10 = net.ajaskey.common.TextUtils.toString((java.util.List<java.lang.String>) strList6);
        net.ajaskey.common.TextUtils.print((java.util.List<java.lang.String>) strList6);
        java.lang.Class<?> wildcardClass12 = strList6.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "     -1.00         0         0\r\n         0                                                                                                  10         0                                                                                                  10         0" + "'", str8, "     -1.00         0         0\r\n         0                                                                                                  10         0                                                                                                  10         0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "     -1.00         0         0\r\n         0                                                                                                  10         0                                                                                                  10         0" + "'", str10, "     -1.00         0         0\r\n         0                                                                                                  10         0                                                                                                  10         0");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0318");
        net.ajaskey.common.Utils.NL = "                                                                                               97.00";
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0319");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("-1", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0320");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 100L, (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100.00" + "'", str2, "100.00");
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0321");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (short) 10, (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                            10.00" + "'", str2, "                                                                                            10.00");
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0322");
        java.lang.String[] strArray7 = new java.lang.String[] { "100", "100", "hi!", "100", "" };
        java.util.List<java.io.File> fileList8 = net.ajaskey.common.Utils.getDir("", strArray7);
        java.util.List<java.io.File> fileList9 = net.ajaskey.common.Utils.getDir("\r\n", strArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = fileList9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNull(fileList8);
        org.junit.Assert.assertNull(fileList9);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0323");
        net.ajaskey.common.Utils.makeDir("97");
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0324");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) 'a', (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                  97" + "'", str2, "                                                                                                  97");
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0325");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                                                                                            10.00", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0326");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("     10.00", false);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0327");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (byte) 100, 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                 100" + "'", str2, "                                                                                                 100");
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0328");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("100.00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0329");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt(0L, 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0330");
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
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0331");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt(100, 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       100" + "'", str2, "       100");
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0332");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0333");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0334");
        net.ajaskey.common.Utils.makeDir("                                                                                               32.00");
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0335");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("\t");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0336");
        net.ajaskey.common.Utils.makeDir("                                                                                                  97");
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0337");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) '4', (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                  52" + "'", str2, "                                                  52");
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0338");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((-1), (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1" + "'", str2, "-1");
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0339");
        net.ajaskey.common.Utils.makeDir("                                                 100");
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0340");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt(1, 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0341");
        net.ajaskey.common.Utils.TAB = "52.00";
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0342");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("     -1.00                                                                                                  97                                                                                                  97\r\n                                                                                                  97                                                                                                  10                                                                                                  97                                                                                                  10                                                                                                  97");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0343");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("\t100");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0344");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("                                 10", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:                                  10 (Access is denied)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0345");
        net.ajaskey.common.Utils.NL = "        32";
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0346");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) ' ', (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                  32" + "'", str2, "                                                                                                  32");
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0347");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt(100.0d, 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    100.00" + "'", str2, "    100.00");
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0348");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt(0.0d, 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                0.00" + "'", str2, "                                                                                                0.00");
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0349");
        net.ajaskey.common.Utils.makeDir("100.00");
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0350");
        java.lang.String[] strArray12 = new java.lang.String[] { "100", "100", "hi!", "100", "" };
        java.util.List<java.io.File> fileList13 = net.ajaskey.common.Utils.getDir("", strArray12);
        java.util.List<java.io.File> fileList14 = net.ajaskey.common.Utils.getDir("\r\n", strArray12);
        java.util.List<java.io.File> fileList15 = net.ajaskey.common.Utils.getDirTree("\r\n", strArray12);
        java.util.List<java.io.File> fileList16 = net.ajaskey.common.Utils.getDir("", strArray12);
        java.util.List<java.io.File> fileList17 = net.ajaskey.common.Utils.getDir("     -1.00                                                                                                  97                                                                                                  97\r\n                                                                                                  97                                                                                                  10                                                                                                  97                                                                                                  10                                                                                                  97", strArray12);
        java.util.List<java.io.File> fileList18 = net.ajaskey.common.Utils.getDir("\t0", strArray12);
        java.util.List<java.io.File> fileList19 = net.ajaskey.common.Utils.getDir("     -1.00        52        52\r\n        52                                                                                                  10        52                                                                                                  10        52", strArray12);
        java.lang.Class<?> wildcardClass20 = strArray12.getClass();
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNull(fileList13);
        org.junit.Assert.assertNull(fileList14);
        org.junit.Assert.assertNull(fileList15);
        org.junit.Assert.assertNull(fileList16);
        org.junit.Assert.assertNull(fileList17);
        org.junit.Assert.assertNull(fileList18);
        org.junit.Assert.assertNull(fileList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0351");
        net.ajaskey.common.Utils.NL = "                                                                                                  10";
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0352");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) '#', 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                  35" + "'", str2, "                                                                                                  35");
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0353");
        net.ajaskey.common.Utils.makeDir("                                                                                               10.0052.00hi!52.00                                                                                                   152.003552.00                                                                                                   152.00");
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0354");
        net.ajaskey.common.TextUtils.printline("     -1.00         0         0\r\n         0                                                                                                  10         0                                                                                                  10         0");
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0355");
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
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0356");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (short) 100, 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Invalid fmt" + "'", str2, "Invalid fmt");
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0357");
        net.ajaskey.common.TextUtils.printline("     -1.00");
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0358");
        java.lang.String[] strArray9 = new java.lang.String[] { "100", "100", "hi!", "100", "" };
        java.util.List<java.io.File> fileList10 = net.ajaskey.common.Utils.getDir("", strArray9);
        java.util.List<java.io.File> fileList11 = net.ajaskey.common.Utils.getDirTree("\t", strArray9);
        java.util.List<java.io.File> fileList12 = net.ajaskey.common.Utils.getDirTree("     -1.00hi!hi!\r\nhi!                                                                                                  10hi!                                                                                                  10hi!", strArray9);
        java.util.List<java.io.File> fileList13 = net.ajaskey.common.Utils.getDirTree("\t0", strArray9);
        java.lang.Class<?> wildcardClass14 = strArray9.getClass();
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNull(fileList10);
        org.junit.Assert.assertNull(fileList11);
        org.junit.Assert.assertNull(fileList12);
        org.junit.Assert.assertNull(fileList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0359");
        net.ajaskey.common.TextUtils.printline("                                                  52");
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0360");
        net.ajaskey.common.Utils.NL = "                                               -1.00";
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0361");
        net.ajaskey.common.Utils.makeDir("\r\n");
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0362");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) '#', (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                               35" + "'", str2, "                                                                                               35");
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0363");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt(100L, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       100" + "'", str2, "       100");
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0364");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("1", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: 1 (Access is denied)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0365");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (byte) 10, 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10" + "'", str2, "10");
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0366");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (byte) 0, 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "      0.00" + "'", str2, "      0.00");
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0367");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("       100");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0368");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0369");
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
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0370");
        java.util.List<java.lang.String> strList0 = null;
        net.ajaskey.common.TextUtils.print(strList0);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0371");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (byte) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0372");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("                                                                                                   0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0373");
        java.lang.String[] strArray7 = new java.lang.String[] { "100", "100", "hi!", "100", "" };
        java.util.List<java.io.File> fileList8 = net.ajaskey.common.Utils.getDir("", strArray7);
        java.util.List<java.io.File> fileList9 = net.ajaskey.common.Utils.getDirTree("\t", strArray7);
        java.lang.Class<?> wildcardClass10 = strArray7.getClass();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNull(fileList8);
        org.junit.Assert.assertNull(fileList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0374");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("\r\n", false);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.Class<?> wildcardClass4 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0375");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (short) 100, 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                 100" + "'", str2, "                                                                                                 100");
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0376");
        net.ajaskey.common.Utils.TAB = "                                                  -1";
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0377");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("\t                                                                                               97.00", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0378");
        net.ajaskey.common.Utils.makeDir("                                                                                                  32");
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0379");
        net.ajaskey.common.TextUtils.printline("      0.00");
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0380");
        java.lang.String[] strArray10 = new java.lang.String[] { "100", "100", "hi!", "100", "" };
        java.util.List<java.io.File> fileList11 = net.ajaskey.common.Utils.getDir("", strArray10);
        java.util.List<java.io.File> fileList12 = net.ajaskey.common.Utils.getDir("\r\n", strArray10);
        java.util.List<java.io.File> fileList13 = net.ajaskey.common.Utils.getDirTree("\r\n", strArray10);
        java.util.List<java.io.File> fileList14 = net.ajaskey.common.Utils.getDir("", strArray10);
        java.util.List<java.io.File> fileList15 = net.ajaskey.common.Utils.getDir("", strArray10);
        java.lang.Class<?> wildcardClass16 = strArray10.getClass();
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNull(fileList11);
        org.junit.Assert.assertNull(fileList12);
        org.junit.Assert.assertNull(fileList13);
        org.junit.Assert.assertNull(fileList14);
        org.junit.Assert.assertNull(fileList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0381");
        net.ajaskey.common.TextUtils textUtils0 = new net.ajaskey.common.TextUtils();
        java.lang.Class<?> wildcardClass1 = textUtils0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0382");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                                                                                                  -1", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0383");
        net.ajaskey.common.TextUtils.printline("0");
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0384");
        net.ajaskey.common.TextUtils.printline("                               1.00");
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0385");
        java.lang.String[] strArray5 = new java.lang.String[] { "                                                                                               10.00", "hi!", "                                                                                                   1", "35", "                                                                                                   1" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.lang.String str8 = net.ajaskey.common.TextUtils.toString((java.util.List<java.lang.String>) strList6);
        net.ajaskey.common.TextUtils.print((java.util.List<java.lang.String>) strList6);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "                                                                                               10.00                                               -1.00hi!                                               -1.00                                                                                                   1                                               -1.0035                                               -1.00                                                                                                   1                                               -1.00" + "'", str8, "                                                                                               10.00                                               -1.00hi!                                               -1.00                                                                                                   1                                               -1.0035                                               -1.00                                                                                                   1                                               -1.00");
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0386");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (short) 0, (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                  0" + "'", str2, "                                  0");
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0387");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (byte) 1, (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                            1.00" + "'", str2, "                            1.00");
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0388");
        net.ajaskey.common.Utils.TAB = "       100";
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0389");
        net.ajaskey.common.Utils.NL = "-1.00";
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0390");
        net.ajaskey.common.Utils.NL = "                            1.00";
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0391");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0392");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (byte) 0, 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                   0" + "'", str2, "                                                                                                   0");
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0393");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("                                                                                               10.00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0394");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) '#', (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                 35" + "'", str2, "                                 35");
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0395");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("-1", false);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0396");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("                                                                                               97.00", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:                                                                                                97.00 (Access is denied)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0397");
        net.ajaskey.common.Utils.makeDir("                                                                                               10.00");
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0398");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (byte) 100, (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                             100.00" + "'", str2, "                             100.00");
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0399");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("-1.00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0400");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("     -1.00                            0.00                            0.00\r\n                            0.00                                                                                                  10                            0.00                                                                                                  10                            0.00", false);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0401");
        net.ajaskey.common.Utils.TAB = "     -1.00                                               -1.00                                               -1.00\r\n                                               -1.00                                                                                                  10                                               -1.00                                                                                                  10                                               -1.00";
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0402");
        net.ajaskey.common.Utils.makeDir("     -1.00hi!hi!\r\nhi!                                                                                                  10hi!                                                                                                  10hi!");
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0403");
        net.ajaskey.common.Utils.NL = "     -1.00";
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0404");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("     -1.00100100\r\n100                                                                                                  10100                                                                                                  10100", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:      -1.00100100??100                                                                                                  10100                                                                                                  10100 (The filename, directory name, or volume label syntax is incorrect)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0405");
        net.ajaskey.common.Utils.makeDir("                             100.00");
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0406");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 10.0f, 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Invalid fmt" + "'", str2, "Invalid fmt");
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0407");
        net.ajaskey.common.Utils.NL = "                                                                                               32.00";
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0408");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.ifmt(10, 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0409");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt(100.0d, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                              100.00" + "'", str2, "                                                                                              100.00");
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0410");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("                                                                                               10.00                            0.00hi!                            0.00                                                                                                   1                            0.0035                            0.00                                                                                                   1                            0.00", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:                                                                                                10.00                            0.00hi!                            0.00                                                                                                   1                            0.0035                            0.00                                                                                                   1                            0.00 (The filename, directory name, or volume label syntax is incorrect)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0411");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (byte) 1, 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1.00" + "'", str2, "1.00");
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0412");
        java.util.List<java.lang.String> strList0 = null;
        java.lang.String str1 = net.ajaskey.common.TextUtils.toString(strList0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0413");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("     -1.00         0         0\r\n         0                                                                                                  10         0                                                                                                  10         0", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:      -1.00         0         0??         0                                                                                                  10         0                                                                                                  10         0 (The filename, directory name, or volume label syntax is incorrect)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0414");
        net.ajaskey.common.TextUtils.printline("\t100");
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0415");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                                                  10", false);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0416");
        net.ajaskey.common.Utils.NL = "                                                                                                1";
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0417");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                                                                                                  -1", false);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0418");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("        52");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0419");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((-1L), (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1" + "'", str2, "-1");
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0420");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (byte) 0, (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                   0" + "'", str2, "                                                   0");
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0421");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) ' ', (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "32" + "'", str2, "32");
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0422");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                                                                                               10.00                            0.00hi!                            0.00                                                                                                   1                            0.0035                            0.00                                                                                                   1                            0.00", false);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0423");
        net.ajaskey.common.TextUtils.printline("                                                                                                   1");
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0424");
        net.ajaskey.common.Utils.NL = "                                                                                                0.00";
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0425");
        net.ajaskey.common.Utils.TAB = "     -1.00100100\r\n100                                                                                                  10100                                                                                                  10100";
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0426");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (short) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0427");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 0, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0.00" + "'", str2, "0.00");
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0428");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) '#', (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                              35" + "'", str2, "                              35");
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0429");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt(0.0d, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                0.00" + "'", str2, "                                                                                                0.00");
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0430");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (short) 0, (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                  0" + "'", str2, "                                  0");
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0431");
        net.ajaskey.common.Utils.NL = "1.00";
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0432");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (short) 10, (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                 10" + "'", str2, "                                 10");
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0433");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 100, (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                          100.00" + "'", str2, "                          100.00");
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0434");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 'a', 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                               97.00" + "'", str2, "                                                                                               97.00");
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0435");
        net.ajaskey.common.Utils.TAB = "                                                                                               10.00                                                                                                   1hi!                                                                                                   1                                                                                                   1                                                                                                   135                                                                                                   1                                                                                                   1                                                                                                   1";
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0436");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 10, (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                            10.00" + "'", str2, "                                                                                            10.00");
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0437");
        java.lang.String[] strArray13 = new java.lang.String[] { "100", "100", "hi!", "100", "" };
        java.util.List<java.io.File> fileList14 = net.ajaskey.common.Utils.getDir("", strArray13);
        java.util.List<java.io.File> fileList15 = net.ajaskey.common.Utils.getDir("\r\n", strArray13);
        java.util.List<java.io.File> fileList16 = net.ajaskey.common.Utils.getDirTree("\r\n", strArray13);
        java.util.List<java.io.File> fileList17 = net.ajaskey.common.Utils.getDir("", strArray13);
        java.util.List<java.io.File> fileList18 = net.ajaskey.common.Utils.getDir("     -1.00                                                                                                  97                                                                                                  97\r\n                                                                                                  97                                                                                                  10                                                                                                  97                                                                                                  10                                                                                                  97", strArray13);
        java.util.List<java.io.File> fileList19 = net.ajaskey.common.Utils.getDir("\t0", strArray13);
        java.util.List<java.io.File> fileList20 = net.ajaskey.common.Utils.getDir("     -1.00        52        52\r\n        52                                                                                                  10        52                                                                                                  10        52", strArray13);
        java.util.List<java.io.File> fileList21 = net.ajaskey.common.Utils.getDir("     -1.00                            0.00                            0.00\r\n                            0.00                                                                                                  10                            0.00                                                                                                  10                            0.00", strArray13);
        java.lang.Class<?> wildcardClass22 = strArray13.getClass();
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(fileList14);
        org.junit.Assert.assertNull(fileList15);
        org.junit.Assert.assertNull(fileList16);
        org.junit.Assert.assertNull(fileList17);
        org.junit.Assert.assertNull(fileList18);
        org.junit.Assert.assertNull(fileList19);
        org.junit.Assert.assertNull(fileList20);
        org.junit.Assert.assertNull(fileList21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0438");
        net.ajaskey.common.Utils.makeDir("1.00");
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0439");
        net.ajaskey.common.Utils.TAB = "                                                                                               32.00";
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0440");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0441");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", true);
        java.lang.String str3 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str4 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str7 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.Class<?> wildcardClass8 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0442");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (byte) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0443");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (byte) 100, 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                 100" + "'", str2, "                                                                                                 100");
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0444");
        net.ajaskey.common.TextUtils.printline("     -1.00                            0.00                            0.00\r\n                            0.00                                                                                                  10                            0.00                                                                                                  10                            0.00");
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0445");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("                                                                                               32.00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0446");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (byte) -1, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1.00" + "'", str2, "-1.00");
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0447");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("     -1.00        52        52\r\n        52                                                                                                  10        52                                                                                                  10        52");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0448");
        net.ajaskey.common.Utils.makeDir("\t                                                                                               97.00");
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0449");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (byte) 0, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "      0.00" + "'", str2, "      0.00");
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0450");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("     -1.00         0         0\r\n         0                                                                                                  10         0                                                                                                  10         0", false);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0451");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("1", false);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0452");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("10.00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0453");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 0L, 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "      0.00" + "'", str2, "      0.00");
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0454");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (byte) 1, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1.00" + "'", str2, "1.00");
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0455");
        java.lang.String[] strArray1 = null;
        java.util.List<java.io.File> fileList2 = net.ajaskey.common.Utils.getDir("                            0.00", strArray1);
        org.junit.Assert.assertNull(fileList2);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0456");
        net.ajaskey.common.Utils.makeDir("                            1.00");
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0457");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 100L, (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                             100.00" + "'", str2, "                             100.00");
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0458");
        net.ajaskey.common.TextUtils.printline("100");
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0459");
        net.ajaskey.common.TextUtils.printline("                                                                                              100");
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0460");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt(100, (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                 100" + "'", str2, "                                                 100");
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0461");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0462");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("                                                                                                 100");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0463");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (short) -1, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                  -1" + "'", str2, "                                                                                                  -1");
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0464");
        net.ajaskey.common.Utils.TAB = "     -1.00         0         0\r\n         0                                                                                                  10         0                                                                                                  10         0";
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0465");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (short) 0, (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                0" + "'", str2, "                                                                                                0");
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0466");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (short) 1, 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0467");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("     -1.003535\r\n35                                                                                                  1035                                                                                                  1035", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0468");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("0", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: 0 (Access is denied)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0469");
        net.ajaskey.common.Utils.TAB = "                                 35";
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0470");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (short) -1, (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                              -1" + "'", str2, "                              -1");
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0471");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                                                   0", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0472");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("                                                                                              100.00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0473");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (byte) 1, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                   1" + "'", str2, "                                                                                                   1");
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0474");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (short) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0475");
        net.ajaskey.common.TextUtils.printline("                                                                                                  32");
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0476");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (short) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0477");
        net.ajaskey.common.Utils.makeDir("                                                                                                0");
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0478");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("     10.00", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0479");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (byte) -1, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        -1" + "'", str2, "        -1");
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0480");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (byte) 1, (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                  1" + "'", str2, "                                  1");
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0481");
        net.ajaskey.common.Utils.makeDir("     -1.003535\r\n35                                                                                                  1035                                                                                                  1035");
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0482");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("                                                                                               52.00", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:                                                                                                52.00 (Access is denied)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0483");
        net.ajaskey.common.TextUtils.printline("                                                                                               32.00");
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0484");
        java.lang.String[] strArray9 = new java.lang.String[] { "100", "100", "hi!", "100", "" };
        java.util.List<java.io.File> fileList10 = net.ajaskey.common.Utils.getDir("", strArray9);
        java.util.List<java.io.File> fileList11 = net.ajaskey.common.Utils.getDir("\r\n", strArray9);
        java.util.List<java.io.File> fileList12 = net.ajaskey.common.Utils.getDirTree("", strArray9);
        java.util.List<java.io.File> fileList13 = net.ajaskey.common.Utils.getDir("\t35", strArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = fileList13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNull(fileList10);
        org.junit.Assert.assertNull(fileList11);
        org.junit.Assert.assertNull(fileList12);
        org.junit.Assert.assertNull(fileList13);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0485");
        net.ajaskey.common.Utils.makeDir("                                                                                              100");
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0486");
        net.ajaskey.common.TextUtils.printline("                                                 100");
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0487");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (byte) 10, 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10.00" + "'", str2, "10.00");
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0488");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("                                                                                                   1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0489");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("\t                            1.00", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ?                            1.00 (The filename, directory name, or volume label syntax is incorrect)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0490");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("        32", false);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0491");
        net.ajaskey.common.TextUtils.printline("         0");
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0492");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt(10, (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                               10" + "'", str2, "                                                                                               10");
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0493");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 10, (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                               10.00" + "'", str2, "                                               10.00");
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0494");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt(10, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                  10" + "'", str2, "                                                                                                  10");
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0495");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("     -1.00                                                                                               10.00                                                                                               10.00\r\n                                                                                               10.00                                                                                                  10                                                                                               10.00                                                                                                  10                                                                                               10.00", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:      -1.00                                                                                               10.00                                                                                               10.00??                                                                                               10.00                                                                                                  10                                                                                               10.00                                                                                                  10                                                                                               10.00 (The filename, directory name, or volume label syntax is incorrect)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0496");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) ' ', 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        32" + "'", str2, "        32");
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0497");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (byte) -1, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1" + "'", str2, "-1");
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0498");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt(1, (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                1" + "'", str2, "                                                                                                1");
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0499");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("     -1.003535\r\n35                                                                                                  1035                                                                                                  1035");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests0.test0500");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("                                                  52", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:                                                   52 (Access is denied)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }
}

