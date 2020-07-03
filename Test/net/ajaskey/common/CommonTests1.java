package net.ajaskey.common;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CommonTests1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0501");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (short) 100, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                 100" + "'", str2, "                                                                                                 100");
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0502");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (byte) -1, (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                  -1" + "'", str2, "                                                  -1");
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0503");
        net.ajaskey.common.Utils.NL = "                              97";
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0504");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0505");
        net.ajaskey.common.Utils.makeDir("                                  1");
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0506");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (byte) 10, (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10" + "'", str2, "10");
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0507");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (byte) 10, 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10" + "'", str2, "10");
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0508");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("                                 35", true);
        net.ajaskey.common.TextUtils.print(strList2);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0509");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("                                                                                                1.00", true);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0510");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", false);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.Class<?> wildcardClass4 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0511");
        net.ajaskey.common.Utils.makeDir("                                                  10");
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0512");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt(0.0d, (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0.00" + "'", str2, "0.00");
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0513");
        net.ajaskey.common.Utils.TAB = "                               0";
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0514");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) 'a', (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "97" + "'", str2, "97");
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0515");
        net.ajaskey.common.TextUtils.printline("0");
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0516");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (short) -1, 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                  -1" + "'", str2, "                                                                                                  -1");
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0517");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.lfmt(10L, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0518");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.ifmt(10, 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0519");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("                                                                                               10", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:                                                                                                10 (The system cannot find the file specified)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0520");
        net.ajaskey.common.Utils.makeDir("                               0.00");
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0521");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 10.0f, 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10.00" + "'", str2, "10.00");
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0522");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) ' ', (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        32" + "'", str2, "        32");
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0523");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                                                                                                  10", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0524");
        net.ajaskey.common.Utils.makeDir("                                                  35");
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0525");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 0.0f, (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                0.00" + "'", str2, "                                                0.00");
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0526");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.lfmt((-1L), 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0527");
        net.ajaskey.common.Utils.makeDirs("                                                   0");
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0528");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("100");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0529");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (-1), (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1" + "'", str2, "-1");
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0530");
        net.ajaskey.common.Utils.makeDirs("                                                                                                   1");
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0531");
        net.ajaskey.common.Utils.sleep((int) (byte) 0);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0532");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt(10, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        10" + "'", str2, "        10");
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0533");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt(0, 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                   0" + "'", str2, "                                                                                                   0");
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0534");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) '#', (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Invalid fmt" + "'", str2, "Invalid fmt");
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0535");
        net.ajaskey.common.Utils.TAB = "                               0.00";
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0536");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("100", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: 100 (Access is denied)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0537");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0538");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 10.0f, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                               10.00" + "'", str2, "                                                                                               10.00");
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0539");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt(100L, (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100" + "'", str2, "100");
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0540");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (byte) 0, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0541");
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
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0542");
        java.util.List<java.lang.String> strList0 = null;
        net.ajaskey.common.TextUtils.print(strList0);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0543");
        net.ajaskey.common.Utils.makeDirs("                                 97");
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0544");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("                                                  -1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0545");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (byte) 100, 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                 100" + "'", str2, "                                                                                                 100");
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0546");
        net.ajaskey.common.Utils.makeDir("                                                0.00");
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0547");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (byte) 0, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                   0" + "'", str2, "                                                                                                   0");
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0548");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (byte) 0, 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         0" + "'", str2, "         0");
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0549");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("35.00", false);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0550");
        net.ajaskey.common.Utils.NL = "                                                  35";
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0551");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", false);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str5 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.Class<?> wildcardClass6 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0552");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0553");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (byte) -1, (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1.00" + "'", str2, "-1.00");
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0554");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0555");
        net.ajaskey.common.Utils.makeDirs("        -1");
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0556");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0557");
        net.ajaskey.common.Utils.NL = "                                                                                                  -1";
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0558");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((-1), (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                  -1" + "'", str2, "                                                  -1");
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0559");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("                                                   0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0560");
        net.ajaskey.common.Utils.NL = "     -1.00";
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0561");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("                              97", true);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0562");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (byte) 0, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "      0.00" + "'", str2, "      0.00");
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0563");
        java.lang.String[] strArray10 = new java.lang.String[] { "         0", "0.00", "hi!", "hi!", "hi!", "-1.00" };
        java.util.List<java.io.File> fileList11 = net.ajaskey.common.Utils.getDirTree("", strArray10);
        java.util.List<java.io.File> fileList12 = net.ajaskey.common.Utils.getDirTree("                                 35", strArray10);
        java.util.List<java.io.File> fileList13 = net.ajaskey.common.Utils.getDir("        97", strArray10);
        java.util.List<java.io.File> fileList14 = net.ajaskey.common.Utils.getDir("                                                                                               97", strArray10);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNull(fileList11);
        org.junit.Assert.assertNull(fileList12);
        org.junit.Assert.assertNull(fileList13);
        org.junit.Assert.assertNull(fileList14);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0564");
        java.lang.String[] strArray8 = new java.lang.String[] { "         0", "0.00", "hi!", "hi!", "hi!", "-1.00" };
        java.util.List<java.io.File> fileList9 = net.ajaskey.common.Utils.getDirTree("", strArray8);
        java.util.List<java.io.File> fileList10 = net.ajaskey.common.Utils.getDirTree("         1", strArray8);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNull(fileList9);
        org.junit.Assert.assertNull(fileList10);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0565");
        net.ajaskey.common.Utils.TAB = "                                                   0";
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0566");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 1L, 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1.00" + "'", str2, "1.00");
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0567");
        net.ajaskey.common.Utils.sleep((int) '4');
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0568");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (short) -1, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                  -1" + "'", str2, "                                                                                                  -1");
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0569");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (short) -1, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "     -1.00" + "'", str2, "     -1.00");
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0570");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt(0L, (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                   0" + "'", str2, "                                                   0");
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0571");
        net.ajaskey.common.Utils.TAB = "         1";
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0572");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.ifmt(1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0573");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (short) 100, 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100" + "'", str2, "100");
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0574");
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
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0575");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (short) 0, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         0" + "'", str2, "         0");
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0576");
        net.ajaskey.common.Utils.makeDirs("-1.00");
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0577");
        net.ajaskey.common.Utils.TAB = "     -1.00";
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0578");
        net.ajaskey.common.Utils.makeDirs("                                                0.00");
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0579");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (short) 10, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        10" + "'", str2, "        10");
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0580");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (byte) 1, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "      1.00" + "'", str2, "      1.00");
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0581");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt(1.0d, 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Invalid fmt" + "'", str2, "Invalid fmt");
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0582");
        java.lang.String[] strArray10 = new java.lang.String[] { "         0", "0.00", "hi!", "hi!", "hi!", "-1.00" };
        java.util.List<java.io.File> fileList11 = net.ajaskey.common.Utils.getDirTree("", strArray10);
        java.util.List<java.io.File> fileList12 = net.ajaskey.common.Utils.getDirTree("                                 35", strArray10);
        java.util.List<java.io.File> fileList13 = net.ajaskey.common.Utils.getDir("        97", strArray10);
        java.util.List<java.io.File> fileList14 = net.ajaskey.common.Utils.getDirTree("                                                                                               97", strArray10);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNull(fileList11);
        org.junit.Assert.assertNull(fileList12);
        org.junit.Assert.assertNull(fileList13);
        org.junit.Assert.assertNull(fileList14);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0583");
        net.ajaskey.common.Utils.NL = "                                                  10";
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0584");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (byte) 10, 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Invalid fmt" + "'", str2, "Invalid fmt");
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0585");
        net.ajaskey.common.Utils.TAB = "                                                                                                  97";
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0586");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt(0, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         0" + "'", str2, "         0");
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0587");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 0.0f, 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "      0.00" + "'", str2, "      0.00");
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0588");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt(100L, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                 100" + "'", str2, "                                                                                                 100");
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0589");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (short) 1, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Invalid fmt" + "'", str2, "Invalid fmt");
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0590");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (short) 1, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                   1" + "'", str2, "                                                                                                   1");
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0591");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (byte) 10, (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                              10" + "'", str2, "                              10");
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0592");
        net.ajaskey.common.Utils.makeDirs("                               0.00");
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0593");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("                              97", false);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0594");
        net.ajaskey.common.Utils.makeDir("                                                  -1");
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0595");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("                                                                                               97");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0596");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) 'a', (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        97" + "'", str2, "        97");
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0597");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) '4', 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        52" + "'", str2, "        52");
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0598");
        net.ajaskey.common.Utils.TAB = "                                                                                                1.00";
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0599");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 0L, 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "      0.00" + "'", str2, "      0.00");
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0600");
        net.ajaskey.common.Utils.makeDirs("                                                                                                  10");
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0601");
        net.ajaskey.common.Utils.TAB = "                              10";
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0602");
        net.ajaskey.common.Utils.makeDirs("                                                                                                  -1");
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0603");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0604");
        net.ajaskey.common.TextUtils.printline("                                                                                                  97");
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0605");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                                                 100", false);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0606");
        net.ajaskey.common.Utils.makeDirs("                                                  35");
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0607");
        net.ajaskey.common.Utils.makeDir("         0");
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0608");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.ifmt(1, 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0609");
        net.ajaskey.common.Utils.NL = "                                                                                                   0";
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0610");
        net.ajaskey.common.Utils.makeDirs("                             100");
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0611");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (byte) 10, (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10.00" + "'", str2, "10.00");
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0612");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("                                                                                               10.00", true);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0613");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (-1), 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                  -1" + "'", str2, "                                                                                                  -1");
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0614");
        net.ajaskey.common.Utils.makeDir("                                                                                               97");
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0615");
        net.ajaskey.common.Utils.TAB = "      1.00";
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0616");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                                                                                                1.00", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0617");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) 100, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100" + "'", str2, "100");
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0618");
        net.ajaskey.common.Utils.NL = "        52";
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0619");
        net.ajaskey.common.Utils.makeDir("                                                                                                1.00");
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0620");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (short) 100, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100" + "'", str2, "100");
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0621");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("1", false);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0622");
        net.ajaskey.common.Utils.makeDirs("                                                                                               10.00");
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0623");
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
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0624");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((-1.0d), (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                               -1.00" + "'", str2, "                                                                                               -1.00");
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0625");
        net.ajaskey.common.TextUtils.printline("                                 35");
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0626");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 1L, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "      1.00" + "'", str2, "      1.00");
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0627");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt(0L, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         0" + "'", str2, "         0");
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0628");
        net.ajaskey.common.Utils.makeDir("                                                                                               10");
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0629");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("100.00", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0630");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("         1", true);
        java.lang.Class<?> wildcardClass3 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0631");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("        97", true);
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
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0632");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("                                                  35", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:                                                   35 (Access is denied)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0633");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (byte) 10, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10" + "'", str2, "10");
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0634");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                                               -1.00", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0635");
        java.lang.String[] strArray9 = new java.lang.String[] { "         0", "0.00", "hi!", "hi!", "hi!", "-1.00" };
        java.util.List<java.io.File> fileList10 = net.ajaskey.common.Utils.getDirTree("", strArray9);
        java.util.List<java.io.File> fileList11 = net.ajaskey.common.Utils.getDirTree("                                 35", strArray9);
        java.util.List<java.io.File> fileList12 = net.ajaskey.common.Utils.getDir("", strArray9);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNull(fileList10);
        org.junit.Assert.assertNull(fileList11);
        org.junit.Assert.assertNull(fileList12);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0636");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (-1L), 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Invalid fmt" + "'", str2, "Invalid fmt");
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0637");
        java.lang.String[] strArray1 = null;
        java.util.List<java.io.File> fileList2 = net.ajaskey.common.Utils.getDirTree("                                                                                               -1.00", strArray1);
        org.junit.Assert.assertNull(fileList2);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0638");
        net.ajaskey.common.Utils.TAB = "                                                0.00";
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0639");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 1, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1.00" + "'", str2, "1.00");
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0640");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (byte) 0, (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                               0" + "'", str2, "                               0");
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0641");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (short) 1, (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                  1" + "'", str2, "                                  1");
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0642");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (short) 10, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10" + "'", str2, "10");
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0643");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                                                0.00", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0644");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (short) 0, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0645");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", false);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str4 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str5 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.Class<?> wildcardClass7 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0646");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (-1L), (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "     -1.00" + "'", str2, "     -1.00");
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0647");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (short) -1, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        -1" + "'", str2, "        -1");
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0648");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt(1L, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0649");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt(1, 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         1" + "'", str2, "         1");
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0650");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((-1), (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1" + "'", str2, "-1");
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0651");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) 1, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0652");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 10, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10.00" + "'", str2, "10.00");
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0653");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (byte) 0, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Invalid fmt" + "'", str2, "Invalid fmt");
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0654");
        net.ajaskey.common.Utils.TAB = "                                                                                               -1.00";
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0655");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("                                 97", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:                                  97 (Access is denied)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0656");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("10");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0657");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("                                                                                               -1.00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0658");
        net.ajaskey.common.Utils.NL = "                                 97";
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0659");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 1.0f, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1.00" + "'", str2, "1.00");
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0660");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (short) 0, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                   0" + "'", str2, "                                                                                                   0");
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0661");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) 1, 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0662");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                                                  35", false);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0663");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("       100");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0664");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) '#', (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                              35" + "'", str2, "                              35");
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0665");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("                           -1.00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0666");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (byte) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0667");
        net.ajaskey.common.Utils.makeDirs("         1");
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0668");
        net.ajaskey.common.TextUtils.printline("                                                   0");
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0669");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) 10, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10" + "'", str2, "10");
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0670");
        net.ajaskey.common.Utils.NL = "                                 10";
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0671");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("                                                                                                1.00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0672");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("                                               -1.00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0673");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (short) 0, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0674");
        net.ajaskey.common.Utils.NL = "                                                  -1";
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0675");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", true);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.Class<?> wildcardClass4 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0676");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (byte) -1, 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        -1" + "'", str2, "        -1");
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0677");
        net.ajaskey.common.Utils.makeDir("                                                                                                  52");
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0678");
        net.ajaskey.common.Utils.makeDirs("                                                                                                0");
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0679");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (short) -1, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1" + "'", str2, "-1");
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0680");
        net.ajaskey.common.Utils.TAB = "                                                  35";
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0681");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 100L, (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                             100.00" + "'", str2, "                             100.00");
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0682");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (short) 10, (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                 10" + "'", str2, "                                 10");
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0683");
        net.ajaskey.common.TextUtils.printline("        52");
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0684");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("                              35", false);
        java.lang.Class<?> wildcardClass3 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0685");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0686");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) '#', (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                  35" + "'", str2, "                                                  35");
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0687");
        net.ajaskey.common.Utils.NL = "1";
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0688");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 1, (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1.00" + "'", str2, "1.00");
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0689");
        java.lang.String[] strArray9 = new java.lang.String[] { "         0", "0.00", "hi!", "hi!", "hi!", "-1.00" };
        java.util.List<java.io.File> fileList10 = net.ajaskey.common.Utils.getDirTree("", strArray9);
        java.util.List<java.io.File> fileList11 = net.ajaskey.common.Utils.getDir("                                 35", strArray9);
        java.util.List<java.io.File> fileList12 = net.ajaskey.common.Utils.getDir("                                 35", strArray9);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNull(fileList10);
        org.junit.Assert.assertNull(fileList11);
        org.junit.Assert.assertNull(fileList12);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0690");
        net.ajaskey.common.Utils.makeDir("10.00");
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0691");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt(100, (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100" + "'", str2, "100");
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0692");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("                                                0.00", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:                                                 0.00 (Access is denied)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0693");
        net.ajaskey.common.Utils.NL = "                                  1";
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0694");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", false);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str6 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str7 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.Class<?> wildcardClass8 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0695");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (short) 0, (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                  0" + "'", str2, "                                  0");
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0696");
        net.ajaskey.common.TextUtils.printline("                              35");
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0697");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("                                                 100");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0698");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 100, (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                          100.00" + "'", str2, "                          100.00");
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0699");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.lfmt(0L, 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0700");
        net.ajaskey.common.TextUtils.printline("                           -1.00");
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0701");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", false);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str5 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str6 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.Class<?> wildcardClass7 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0702");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (byte) 1, 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                   1" + "'", str2, "                                                                                                   1");
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0703");
        net.ajaskey.common.Utils.NL = "                             100.00";
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0704");
        net.ajaskey.common.Utils.TAB = "       100";
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0705");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (short) -1, (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1" + "'", str2, "-1");
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0706");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0707");
        java.lang.String[] strArray6 = new java.lang.String[] { "                                                0.00", "1.00", "                                                  -1", "                                  0" };
        java.util.List<java.io.File> fileList7 = net.ajaskey.common.Utils.getDir("        97", strArray6);
        java.util.List<java.io.File> fileList8 = net.ajaskey.common.Utils.getDir("                          100.00", strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNull(fileList7);
        org.junit.Assert.assertNull(fileList8);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0708");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                                                                                              100", false);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0709");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", true);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.Class<?> wildcardClass5 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0710");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) '#', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0711");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (short) 10, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "     10.00" + "'", str2, "     10.00");
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0712");
        net.ajaskey.common.TextUtils.printline("                                                                                               -1.00");
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0713");
        java.lang.String[] strArray6 = new java.lang.String[] { "                                                0.00", "1.00", "                                                  -1", "                                  0" };
        java.util.List<java.io.File> fileList7 = net.ajaskey.common.Utils.getDir("        97", strArray6);
        java.util.List<java.io.File> fileList8 = net.ajaskey.common.Utils.getDir("                           -1.00", strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNull(fileList7);
        org.junit.Assert.assertNull(fileList8);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0714");
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
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0715");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) 1, 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                   1" + "'", str2, "                                                                                                   1");
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0716");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (-1.0f), (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                               -1.00" + "'", str2, "                                                                                               -1.00");
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0717");
        net.ajaskey.common.Utils.makeDir("     10.00");
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0718");
        net.ajaskey.common.Utils.makeDir("                              97");
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0719");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) 10, (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                 10" + "'", str2, "                                 10");
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0720");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (short) 10, (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                           10.00" + "'", str2, "                           10.00");
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0721");
        net.ajaskey.common.Utils.NL = "                                                                                                   1";
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0722");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                             100", false);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0723");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (short) 100, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       100" + "'", str2, "       100");
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0724");
        net.ajaskey.common.Utils.makeDir("                                                                                                 100");
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0725");
        java.lang.String[] strArray1 = null;
        java.util.List<java.io.File> fileList2 = net.ajaskey.common.Utils.getDir("0", strArray1);
        org.junit.Assert.assertNull(fileList2);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0726");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (byte) 100, (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                           100.00" + "'", str2, "                                                                                           100.00");
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0727");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("     10.00", false);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0728");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (byte) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0729");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("                                                                                               -1.00", false);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0730");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (byte) -1, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1" + "'", str2, "-1");
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0731");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                                                0.00", false);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0732");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) '4', (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "52" + "'", str2, "52");
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0733");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) 100, (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                100" + "'", str2, "                                100");
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0734");
        net.ajaskey.common.TextUtils.printline("         0");
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0735");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (byte) 1, (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                             1.00" + "'", str2, "                                                                                             1.00");
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0736");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (byte) 10, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10" + "'", str2, "10");
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0737");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", false);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str6 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str7 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str9 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str10 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.Class<?> wildcardClass11 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0738");
        net.ajaskey.common.Utils.makeDir("       100");
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0739");
        net.ajaskey.common.Utils.makeDirs("52");
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0740");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) 0, (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                  0" + "'", str2, "                                  0");
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0741");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (short) 1, 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0742");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 100.0f, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Invalid fmt" + "'", str2, "Invalid fmt");
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0743");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((-1.0d), 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1.00" + "'", str2, "-1.00");
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0744");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt(100, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       100" + "'", str2, "       100");
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0745");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (byte) 10, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10" + "'", str2, "10");
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0746");
        net.ajaskey.common.Utils.makeDirs("    100.00");
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0747");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                                                                                              100", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0748");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (short) 0, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         0" + "'", str2, "         0");
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0749");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("                           -1.00", true);
        java.lang.String str3 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.Class<?> wildcardClass4 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0750");
        net.ajaskey.common.Utils.NL = "                           -1.00";
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0751");
        net.ajaskey.common.TextUtils.printline("         1");
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0752");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                           10.00", false);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0753");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((-1), 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1" + "'", str2, "-1");
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0754");
        net.ajaskey.common.Utils.NL = "                                                                                           100.00";
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0755");
        net.ajaskey.common.Utils.TAB = "                             100.00";
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0756");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (byte) -1, (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                              -1" + "'", str2, "                              -1");
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0757");
        java.text.SimpleDateFormat simpleDateFormat0 = net.ajaskey.common.Utils.sdfFull;
        java.lang.Class<?> wildcardClass1 = simpleDateFormat0.getClass();
        org.junit.Assert.assertNotNull(simpleDateFormat0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0758");
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
        java.lang.Class<?> wildcardClass12 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0759");
        net.ajaskey.common.Utils.TAB = "35.00";
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0760");
        net.ajaskey.common.Utils.makeDir("                          100.00");
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0761");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 10L, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "     10.00" + "'", str2, "     10.00");
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0762");
        net.ajaskey.common.Utils.makeDir("                              35");
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0763");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("     -1.00", false);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0764");
        net.ajaskey.common.Utils.makeDir("                                                                                             1.00");
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0765");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (short) 0, (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0766");
        net.ajaskey.common.Utils.TAB = "                                                                                                 100";
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0767");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) '4', (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                              52" + "'", str2, "                              52");
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0768");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("                             100.00", false);
        java.lang.String str3 = net.ajaskey.common.TextUtils.toString(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0769");
        net.ajaskey.common.Utils.TAB = "10";
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0770");
        java.lang.String[] strArray1 = null;
        java.util.List<java.io.File> fileList2 = net.ajaskey.common.Utils.getDir("                             100.00", strArray1);
        org.junit.Assert.assertNull(fileList2);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0771");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("0", false);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0772");
        net.ajaskey.common.Utils.makeDirs("     10.00");
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0773");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (byte) 1, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                   1" + "'", str2, "                                                                                                   1");
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0774");
        net.ajaskey.common.Utils.makeDirs("35.00");
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0775");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("                              10");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0776");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("                          100.00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0777");
        net.ajaskey.common.Utils.makeDirs("                                                                                             1.00");
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0778");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                                                  10", false);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0779");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("                                 35", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:                                  35 (The system cannot find the file specified)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0780");
        net.ajaskey.common.Utils.makeDirs("                                100");
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0781");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0782");
        java.lang.String[] strArray9 = new java.lang.String[] { "         0", "0.00", "hi!", "hi!", "hi!", "-1.00" };
        java.util.List<java.io.File> fileList10 = net.ajaskey.common.Utils.getDirTree("", strArray9);
        java.util.List<java.io.File> fileList11 = net.ajaskey.common.Utils.getDir("", strArray9);
        java.util.List<java.io.File> fileList12 = net.ajaskey.common.Utils.getDir("        52", strArray9);
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
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0783");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                              10", false);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0784");
        net.ajaskey.common.TextUtils.printline("32");
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0785");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("        97", false);
        java.lang.String str3 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str4 = net.ajaskey.common.TextUtils.toString(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0786");
        net.ajaskey.common.Utils.NL = "                                                                                             1.00";
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0787");
        net.ajaskey.common.Utils.makeDir("                                 35");
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0788");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (short) 0, (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                            0.00" + "'", str2, "                            0.00");
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0789");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.lfmt(100L, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0790");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("        52", false);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0791");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (byte) 1, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0792");
        net.ajaskey.common.TextUtils.printline("        97");
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0793");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) '4', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0794");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("                                                0.00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0795");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", true);
        java.lang.String str3 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.Class<?> wildcardClass5 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0796");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("0", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0797");
        net.ajaskey.common.Utils.makeDir("52.00");
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0798");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) '4', (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        52" + "'", str2, "        52");
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0799");
        net.ajaskey.common.Utils.TAB = "                                                                                           100.00";
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0800");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("     10.00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0801");
        net.ajaskey.common.Utils.makeDirs("     -1.00");
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0802");
        net.ajaskey.common.Utils.NL = "                                                                                               -1.00";
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0803");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("                               0.00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0804");
        net.ajaskey.common.TextUtils.printline("                              52");
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0805");
        net.ajaskey.common.Utils.NL = "                                100";
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0806");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 10L, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "     10.00" + "'", str2, "     10.00");
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0807");
        net.ajaskey.common.Utils.NL = "97";
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0808");
        net.ajaskey.common.TextUtils.printline("                              -1");
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0809");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) '4', (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                  52" + "'", str2, "                                                                                                  52");
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0810");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("        52");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0811");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 10.0f, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                               10.00" + "'", str2, "                                                                                               10.00");
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0812");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt(0.0d, 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Invalid fmt" + "'", str2, "Invalid fmt");
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0813");
        net.ajaskey.common.TextUtils.printline("                              97");
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0814");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) '4', 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "52.00" + "'", str2, "52.00");
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0815");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                                                                                                   0", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0816");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (short) 0, 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         0" + "'", str2, "         0");
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0817");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) '4', (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                               52.00" + "'", str2, "                                                                                               52.00");
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0818");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) 10, 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                  10" + "'", str2, "                                                                                                  10");
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0819");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                           10.00", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0820");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt(0, 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         0" + "'", str2, "         0");
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0821");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("        97", true);
        java.lang.String str3 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str4 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str5 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.Class<?> wildcardClass7 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0822");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("52", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: 52 (Access is denied)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0823");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (byte) -1, (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                               -1.00" + "'", str2, "                                               -1.00");
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0824");
        net.ajaskey.common.TextUtils.printline("                            0.00");
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0825");
        net.ajaskey.common.Utils.NL = "1.00";
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0826");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 100.0f, 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100.00" + "'", str2, "100.00");
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0827");
        net.ajaskey.common.TextUtils.printline("                                               -1.00");
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0828");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (byte) 10, 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        10" + "'", str2, "        10");
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0829");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("                                                                                               52.00", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:                                                                                                52.00 (The system cannot find the file specified)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0830");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 10.0f, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10.00" + "'", str2, "10.00");
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0831");
        net.ajaskey.common.Utils.NL = "                                                                                                1.00";
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0832");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt(0L, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         0" + "'", str2, "         0");
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0833");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) ' ', (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "32" + "'", str2, "32");
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0834");
        net.ajaskey.common.TextUtils.printline("                                                0.00");
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0835");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", false);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.Class<?> wildcardClass5 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0836");
        net.ajaskey.common.TextUtils.printline("     -1.00");
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0837");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (short) -1, 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Invalid fmt" + "'", str2, "Invalid fmt");
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0838");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 0.0f, 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0.00" + "'", str2, "0.00");
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0839");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (byte) -1, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                  -1" + "'", str2, "                                                                                                  -1");
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0840");
        java.lang.String[] strArray6 = new java.lang.String[] { "                                                0.00", "1.00", "                                                  -1", "                                  0" };
        java.util.List<java.io.File> fileList7 = net.ajaskey.common.Utils.getDir("        97", strArray6);
        java.util.List<java.io.File> fileList8 = net.ajaskey.common.Utils.getDirTree("                                                                                               -1.00", strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNull(fileList7);
        org.junit.Assert.assertNull(fileList8);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0841");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt(100.0d, 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100.00" + "'", str2, "100.00");
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0842");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("                                                  35");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0843");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt(1L, 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0844");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt(100, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100" + "'", str2, "100");
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0845");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", false);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str6 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str7 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str8 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str9 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.Class<?> wildcardClass10 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0846");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                                                                                                   0", false);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0847");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (byte) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0848");
        net.ajaskey.common.Utils.makeDir("                                                   0");
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0849");
        net.ajaskey.common.Utils.makeDir("                              10");
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0850");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                                 97", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0851");
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
        java.lang.Class<?> wildcardClass12 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0852");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (short) 100, (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                              100" + "'", str2, "                                                                                              100");
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0853");
        net.ajaskey.common.Utils.makeDirs("                                                                                           100.00");
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0854");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0855");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((-1L), (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1" + "'", str2, "-1");
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0856");
        net.ajaskey.common.Utils.TAB = "                            0.00";
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0857");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) '#', (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "35" + "'", str2, "35");
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0858");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (byte) 10, (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                               10.00" + "'", str2, "                                               10.00");
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0859");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                                                                                           100.00", false);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0860");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("                              52");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0861");
        net.ajaskey.common.Utils.makeDirs("        97");
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0862");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt(100.0d, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100.00" + "'", str2, "100.00");
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0863");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                           -1.00", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0864");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) 'a', (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                  97" + "'", str2, "                                                                                                  97");
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0865");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("        10");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0866");
        net.ajaskey.common.Utils.TAB = "                                                                                               52.00";
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0867");
        net.ajaskey.common.TextUtils.printline("                                                                                               10.00");
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0868");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                            0.00", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0869");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 0, 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0.00" + "'", str2, "0.00");
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0870");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((-1L), 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                  -1" + "'", str2, "                                                                                                  -1");
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0871");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (-1), (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                              -1" + "'", str2, "                              -1");
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0872");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                            0.00", false);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0873");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("                                100", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:                                 100 (Access is denied)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0874");
        net.ajaskey.common.Utils.makeDir("                                                                                           100.00");
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0875");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) '#', (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                  35" + "'", str2, "                                                                                                  35");
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0876");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 0, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                0.00" + "'", str2, "                                                                                                0.00");
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0877");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("                                                                                                1.00", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:                                                                                                 1.00 (Access is denied)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0878");
        net.ajaskey.common.TextUtils.printline("                                  0");
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0879");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (byte) 100, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       100" + "'", str2, "       100");
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0880");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (byte) 100, (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                          100.00" + "'", str2, "                          100.00");
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0881");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (byte) 10, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        10" + "'", str2, "        10");
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0882");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                                                                                                  52", false);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0883");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (short) -1, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1.00" + "'", str2, "-1.00");
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0884");
        net.ajaskey.common.Utils.NL = "35";
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0885");
        net.ajaskey.common.TextUtils.printline("                          100.00");
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0886");
        net.ajaskey.common.Utils.makeDirs("10");
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0887");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                                                                                             1.00", false);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0888");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("", false);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.String str4 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str5 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.String str6 = net.ajaskey.common.TextUtils.toString(strList2);
        net.ajaskey.common.TextUtils.print(strList2);
        java.lang.Class<?> wildcardClass8 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0889");
        net.ajaskey.common.Utils.makeDirs("0");
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0890");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                              -1", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0891");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                                               10.00", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0892");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 0.0f, (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                             0.00" + "'", str2, "                                                                                             0.00");
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0893");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt(100.0d, 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    100.00" + "'", str2, "    100.00");
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0894");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (short) 1, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "      1.00" + "'", str2, "      1.00");
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0895");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("                           10.00", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:                            10.00 (The system cannot find the file specified)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0896");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("35");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0897");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt(10L, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10" + "'", str2, "10");
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0898");
        net.ajaskey.common.Utils.makeDir("         1");
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0899");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                                                                                                  35", false);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0900");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt(0L, (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                  0" + "'", str2, "                                  0");
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0901");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                              52", false);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0902");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) 1, (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0903");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("                                                                                               52.00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0904");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (short) 0, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         0" + "'", str2, "         0");
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0905");
        net.ajaskey.common.Utils.makeDirs("                              35");
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0906");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (short) 1, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "      1.00" + "'", str2, "      1.00");
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0907");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                             100.00", false);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0908");
        net.ajaskey.common.Utils.TAB = "1.00";
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0909");
        net.ajaskey.common.TextUtils.printline("                                               10.00");
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0910");
        java.lang.String[] strArray8 = new java.lang.String[] { "         0", "0.00", "hi!", "hi!", "hi!", "-1.00" };
        java.util.List<java.io.File> fileList9 = net.ajaskey.common.Utils.getDirTree("", strArray8);
        java.util.List<java.io.File> fileList10 = net.ajaskey.common.Utils.getDir("", strArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = fileList10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNull(fileList9);
        org.junit.Assert.assertNull(fileList10);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0911");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.ifmt(100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0912");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 0, (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                0.00" + "'", str2, "                                                0.00");
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0913");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("        -1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0914");
        net.ajaskey.common.Utils.makeDirs("                                               10.00");
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0915");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (byte) 0, 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Invalid fmt" + "'", str2, "Invalid fmt");
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0916");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("                                               10.00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0917");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((-1), (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                               -1" + "'", str2, "                                                                                               -1");
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0918");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((-1), (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        -1" + "'", str2, "        -1");
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0919");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 0, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0.00" + "'", str2, "0.00");
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0920");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((-1), 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                  -1" + "'", str2, "                                                                                                  -1");
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0921");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 10L, 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                               10.00" + "'", str2, "                                                                                               10.00");
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0922");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt(0L, (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                               0" + "'", str2, "                               0");
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0923");
        net.ajaskey.common.Utils.TAB = "     10.00";
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0924");
        java.lang.String[] strArray23 = new java.lang.String[] { "        52", "                                                                                              100", "                                                                                                  -1", "                                                                                              100", "        52", "                                                                                              100.00", "                                                                                                   1", "35.00", "                                                                                               52.00", "                                                  35", "                                                                                                  10", "                                                                                               -1.00", "                           10.00", "                                                                                               97", "", "                             100", "52.00", "-1", "10.00", "                                                                                             0.00", "                               0.00", "0", "97" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        net.ajaskey.common.TextUtils.print((java.util.List<java.lang.String>) strList24);
        java.lang.Class<?> wildcardClass27 = strList24.getClass();
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0925");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.lfmt(100L, 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0926");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 1L, (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                1.00" + "'", str2, "                                                1.00");
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0927");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (-1.0f), (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1.00" + "'", str2, "-1.00");
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0928");
        net.ajaskey.common.TextUtils.printline("                             100");
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0929");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 0L, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Invalid fmt" + "'", str2, "Invalid fmt");
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0930");
        net.ajaskey.common.Utils.makeDirs("                          100.00");
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0931");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 10, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Invalid fmt" + "'", str2, "Invalid fmt");
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0932");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) 1, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0933");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt(100.0d, 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Invalid fmt" + "'", str2, "Invalid fmt");
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0934");
        net.ajaskey.common.TextUtils.printline("                                                                                                0.00");
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0935");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) (byte) 10, 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "     10.00" + "'", str2, "     10.00");
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0936");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (short) 10, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10" + "'", str2, "10");
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0937");
        net.ajaskey.common.Utils.makeDir("                                                1.00");
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0938");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("\r\n", true);
        java.lang.String str3 = net.ajaskey.common.TextUtils.toString(strList2);
        java.lang.Class<?> wildcardClass4 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0939");
        net.ajaskey.common.Utils.makeDirs("                              10");
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0940");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("32", false);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0941");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (byte) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0942");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (byte) 10, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                  10" + "'", str2, "                                                                                                  10");
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0943");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt(10, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10" + "'", str2, "10");
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0944");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) '#', 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        35" + "'", str2, "        35");
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0945");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("                                                                                                  52");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0946");
        net.ajaskey.common.Utils.NL = "         1";
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0947");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) '#', (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                  35" + "'", str2, "                                                                                                  35");
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0948");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 1L, 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                1.00" + "'", str2, "                                                                                                1.00");
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0949");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                                                                                               52.00", false);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0950");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) 100, (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                 100" + "'", str2, "                                                 100");
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0951");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (-1), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0952");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) 'a', 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                  97" + "'", str2, "                                                                                                  97");
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0953");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt(10L, 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        10" + "'", str2, "        10");
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0954");
        net.ajaskey.common.Utils.makeDirs("                              -1");
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0955");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 0.0f, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Invalid fmt" + "'", str2, "Invalid fmt");
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0956");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("     -1.00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0957");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (byte) -1, 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        -1" + "'", str2, "        -1");
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0958");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt(100, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100" + "'", str2, "100");
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0959");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (short) 1, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0960");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readTextFile("                            0.00", true);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0961");
        net.ajaskey.common.TextUtils.printline("                                100");
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0962");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                                                                                                  97", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0963");
        net.ajaskey.common.TextUtils.printline("52");
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0964");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (byte) -1, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                  -1" + "'", str2, "                                                                                                  -1");
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0965");
        net.ajaskey.common.Utils.TAB = "                                100";
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0966");
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
        java.lang.Class<?> wildcardClass13 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0967");
        java.util.zip.ZipOutputStream zipOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.common.Utils.writeToZipFile("                                                   0", zipOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:                                                    0 (Access is denied)");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0968");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt(0.0d, (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                0.00" + "'", str2, "                                                0.00");
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0969");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 10, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Invalid fmt" + "'", str2, "Invalid fmt");
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0970");
        net.ajaskey.common.Utils.makeDir("                                                                                                  35");
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0971");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (byte) 1, 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                   1" + "'", str2, "                                                                                                   1");
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0972");
        net.ajaskey.common.Utils.TAB = "                                                                                             0.00";
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0973");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 10, (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                              10.00" + "'", str2, "                              10.00");
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0974");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt(10, (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                              10" + "'", str2, "                              10");
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0975");
        net.ajaskey.common.Utils.NL = "                               0";
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0976");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (short) 100, (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                100" + "'", str2, "                                100");
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0977");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                                                                                               10.00", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0978");
        java.lang.String str1 = net.ajaskey.common.Utils.getFromUrl("                              97");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0979");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (short) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0980");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt(1L, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                   1" + "'", str2, "                                                                                                   1");
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0981");
        net.ajaskey.common.Utils.makeDir("                                                                                               52.00");
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0982");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt(0.0d, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Invalid fmt" + "'", str2, "Invalid fmt");
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0983");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) 1, (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                1" + "'", str2, "                                                                                                1");
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0984");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) '4', 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Invalid fmt" + "'", str2, "Invalid fmt");
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0985");
        net.ajaskey.common.Utils.NL = "                              10";
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0986");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (byte) 1, (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                               1" + "'", str2, "                               1");
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0987");
        net.ajaskey.common.Utils.NL = "                                               10.00";
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0988");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt(0L, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                   0" + "'", str2, "                                                                                                   0");
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0989");
        java.lang.String str2 = net.ajaskey.common.Utils.fmt((double) 1L, (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                             1.00" + "'", str2, "                                                                                             1.00");
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0990");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt(100L, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100" + "'", str2, "100");
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0991");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (byte) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0992");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (byte) -1, (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1" + "'", str2, "-1");
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0993");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (byte) 100, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100" + "'", str2, "100");
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0994");
        java.util.List<java.lang.String> strList2 = net.ajaskey.common.TextUtils.readGzipFile("                              10.00", true);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0995");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.lfmt(10L, 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0996");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) (short) 100, (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                 100" + "'", str2, "                                                 100");
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0997");
        net.ajaskey.common.Utils.NL = "10.00";
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0998");
        java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (short) 1, (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                1" + "'", str2, "                                                                                                1");
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test0999");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.ajaskey.common.Utils.ifmt((int) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.util.FormatFlagsConversionMismatchException; message: Conversion = s, Flags = 0");
        } catch (java.util.FormatFlagsConversionMismatchException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommonTests1.test1000");
        java.lang.String str2 = net.ajaskey.common.Utils.lfmt((long) '4', 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "52" + "'", str2, "52");
    }
}

